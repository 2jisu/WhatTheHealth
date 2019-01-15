package com.wthealth.web.controller.jisu;

import java.io.File;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.wthealth.web.controller.jisu.KakaoLogin;
import com.wthealth.domain.User;
import com.wthealth.service.user.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	///Field
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	//setter Method 구현 않음
	
	@Resource(name = "mailSender")
	private JavaMailSender javaMailSender;

	public UserController() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass());
	}
	
	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;
	@Value("#{commonProperties['pageSize']}")
	int pageSize;
	
	
	@RequestMapping( value="login", method=RequestMethod.GET )
	public String login() throws Exception{
		
		System.out.println("/user/logon : GET");

		return "redirect:/user/login.jsp";
	}
	
	@RequestMapping( value="login", method=RequestMethod.POST )
	public String login(@ModelAttribute("user") User user , HttpSession session ) throws Exception{
		
		System.out.println("/user/login : POST");
		//Business Logic
		User dbUser=userService.getUser(user.getUserId());
		
		if( user.getPassword().equals(dbUser.getPassword()) && user.getUserStatus() == "0"){
			session.setAttribute("user", dbUser);
		}
		
		return "redirect:/main.jsp";
	}
		
	
	@RequestMapping( value="logout", method=RequestMethod.GET )
	public String logout(HttpSession session ) throws Exception{
		
		System.out.println("/user/logout : POST");
		
		session.invalidate();
		
		return "redirect:/main.jsp";
	}
	
	@RequestMapping( value="addUser", method=RequestMethod.GET )
	public String addUser() throws Exception{
	
		System.out.println("/user/addUser : GET");
		
		return "redirect:/user/addUser.jsp";
	}
	
	@RequestMapping( value="addUser", method=RequestMethod.POST )
	public String addUser( @ModelAttribute("user") User user, @RequestParam("uploadFile") MultipartFile uploadFile ) throws Exception {

		System.out.println("/user/addUser : POST");
		//Business Logic
		String filePath = "C:\\Users\\bit\\git\\WhatTheHealth\\WhatTheHealth\\";
		File file = new File(filePath , uploadFile.getOriginalFilename());
		uploadFile.transferTo(file); 
		user.setUserImage(uploadFile.getOriginalFilename());
		userService.addUser(user);
		
		return "redirect:/user/login.jsp";
	}
	
	@RequestMapping( value="kakaoLogin", produces ="applcation/json", method= {RequestMethod.GET, RequestMethod.POST} )
	public String kakaoLogin(@RequestParam("code") String code , HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{

		System.out.println("kakaoLogin: GET/POST");
		System.out.println("code: "+code);
		

		JsonNode token = KakaoLogin.getAccessToken(code);

		JsonNode profile = KakaoLogin.getKakaoUserInfo(token.path("access_token").toString());
		System.out.println(profile);
		User user = KakaoLogin.changeData(profile);
		user.setUserId("k"+user.getUserId());

		/*System.out.println(session);
		session.setAttribute("user", vo);
		System.out.println("세션에 들어갔나 ");
		System.out.println(vo.toString());*/
		
		if(userService.getUser(user.getUserId())==null) {
			//vo.setPassword(vo.getUserId());
			userService.addUser(user);
			System.out.println("디비에 들어갔나");
			session.setAttribute("user", user);
		} else if(userService.getUser(user.getUserId())!=null) {
			User dbUser=userService.getUser(user.getUserId());
			session.setAttribute("user", dbUser);
			System.out.println("세션에 들어갔나 ");
			System.out.println(user.toString());
		}
		//userService.addUser(vo);
		
	
		 //vo = service.kakaoLogin(vo);  
		//return "redirect:/index.jsp";
		return "redirect:/user/kakaoLogin.jsp";
	}
	
	@RequestMapping( value="getUser", method=RequestMethod.GET )
	public String getUser( @RequestParam("userId") String userId , Model model ) throws Exception {
		
		System.out.println("/user/getUser : GET");
		//Business Logic
		User user = userService.getUser(userId);
		// Model 과 View 연결
		model.addAttribute("user", user);
		
		return "forward:/user/getUser.jsp";
	}
	
	@RequestMapping( value="updateUser", method=RequestMethod.GET )
	public String updateUser( @RequestParam("userId") String userId , Model model ) throws Exception{

		System.out.println("/user/updateUser : GET");
		//Business Logic
		User user = userService.getUser(userId);
		// Model 과 View 연결
		model.addAttribute("user", user);
		
		return "forward:/user/updateUser.jsp";
	}

	@RequestMapping( value="updateUser", method=RequestMethod.POST )
	public String updateUser( @ModelAttribute("user") User user , @RequestParam("uploadFile") MultipartFile uploadFile, Model model , HttpSession session) throws Exception{

		System.out.println("/user/updateUser : POST");
		//Business Logic
		
		if(uploadFile.getOriginalFilename()!=null) {
			user.setUserImage(uploadFile.getOriginalFilename());
			userService.updateUser(user);
			System.out.println("같을때: "+user.getUserImage());
		} else {
			String filePath = "C:\\Users\\bit\\git\\11MVC\\11.Model2MVCShop\\WebContent\\images\\uploadFiles\\";
			File file = new File(filePath , uploadFile.getOriginalFilename());
			uploadFile.transferTo(file); 
			user.setUserImage(uploadFile.getOriginalFilename());
			userService.updateUser(user);
			System.out.println("다를때: "+user.getUserImage());
		}
		String sessionId=((User)session.getAttribute("user")).getUserId();
		if(sessionId.equals(user.getUserId())){
			session.setAttribute("user", user);
		}
		
		return "redirect:/user/getUser?userId="+user.getUserId();
	}
	
	@RequestMapping( value="deleteUser", method=RequestMethod.GET )
	public String deleteUser( @RequestParam("userId") String userId , Model model ) throws Exception{

		System.out.println("/user/deleteUser : GET");
		//Business Logic
		User user = userService.getUser(userId);
		// Model 과 View 연결
		model.addAttribute("user", user);
		
		return "forward:/user/deleteUser.jsp";
	}

	@RequestMapping( value="deleteUser", method=RequestMethod.POST )
	public String deleteUser( @ModelAttribute("user") User user , Model model , HttpSession session) throws Exception{

		System.out.println("/user/deleteUser : POST");
		//Business Logic
		userService.deleteUser(user);
		
		String sessionId=((User)session.getAttribute("user")).getUserId();
		String sessionPw = ((User)session.getAttribute("user")).getPassword();
		if(sessionId.equals(user.getUserId()) && sessionPw.equals(user.getPassword())){
			session.invalidate();
		}
		
		return "redirect:/main.jsp";
	}
	
	@RequestMapping( value="findId", method=RequestMethod.GET )
	public String findId() throws Exception {
		
		System.out.println("/user/findId : GET");
		
		return "redirect:/user/findId.jsp";
	}
	
	@RequestMapping( value="findId", method=RequestMethod.POST )
	public String findId(@RequestParam("nickName") String nickName, @ModelAttribute("user") User user) throws Exception{

		System.out.println("/user/findId : POST");
		//Business Logic
		user = userService.findId(nickName);
		
		return "redirect:/user/login.jsp";
	}
	
	
	@RequestMapping( value="findPassword", method=RequestMethod.GET )
	public String findPassword() throws Exception {
		
		System.out.println("/user/findPassword : GET");
		
		return "redirect:/user/findPassword.jsp";
	}
	
	@RequestMapping( value="findPassword", method=RequestMethod.POST )
	public String findPassword(@RequestParam("nickName") String nickName) throws Exception{

		System.out.println("/user/findPassword : POST");
		//Business Logic
		User user = userService.findId(nickName);
		
		String authNum = "";
		authNum = RandomNum();
		
	    sendPassword(user.getEmail(), authNum);
	    
	    user.setPassword(authNum);
		
		userService.findPassword(user);
		
		return "redirect:/user/login.jsp";
	}
	
	public String RandomNum() {
		StringBuffer buffer = new StringBuffer();
		for(int i =0; i<=6; i++) {
			int n = (int)(Math.random()*10);
			buffer.append(n);
		}
		return buffer.toString();
	}
	
	public void sendPassword(String email, String authNum) {
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			
	        @Override
	        public void prepare(MimeMessage paramMimeMessage) throws Exception {
	        	
	            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(paramMimeMessage, true, "UTF-8");

	            mimeMessageHelper.setTo(email); // 받는사람
	            mimeMessageHelper.setFrom("sh8532k@naver.com"); // 보내는사람
	            mimeMessageHelper.setSubject("임시 비밀번호 전송"); // 메일 제목
	            mimeMessageHelper.setText("임시 비밀번호 [ "+authNum+" ]", true); // 메일 내용	            
	        };
	    }; 
	            
	    try {
	         javaMailSender.send(preparator); // 메일 전송
	    } catch (MailException me) {
	        // 예외처리 코드 (실패시 로그를 남긴다는 지...)
	    	me.printStackTrace();
	    }
		
	}

}
