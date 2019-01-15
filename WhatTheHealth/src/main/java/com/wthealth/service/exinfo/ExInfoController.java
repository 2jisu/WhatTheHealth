package com.wthealth.service.exinfo;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.wthealth.domain.Post;

@Controller
@RequestMapping("/exinfo/*")
public class ExInfoController {

	//Field
	@Autowired
	@Qualifier("exInfoServiceImpl")
	private ExInfoService exInfoservice;
	
	public ExInfoController() {
		System.out.println(this.getClass());
	}
	
	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;	

	@Value("#{commonProperties['pageSize']}")
	int pageSize;
	
	@RequestMapping(value="addPost", method=RequestMethod.POST)
	public String addPost(@ModelAttribute("post") Post post, 
			               @RequestParam("originalFileName") MultipartFile file) throws Exception{
		
			String path = "";
			String originalFileName = file.getOriginalFilename();
			File uploadFile = new File(path, originalFileName);
			file.transferTo(uploadFile);
		
			post.setPhoto(originalFileName);
			
			//Business Logic
			exInfoservice.addPost(post);
			
		return "redirect:/exinfo/getExInfo?prodNo="+post.getPostNo();
	}
	
/*	@RequestMapping(value="getExInfo", method=RequestMethod.GET)
	public String getExInfo(@RequestParam("postNo") String postNo, Model model*/
	
	
}
