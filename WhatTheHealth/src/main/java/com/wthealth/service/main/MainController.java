package com.wthealth.service.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wthealth.domain.Post;
import com.wthealth.service.dietcom.DietComService;
import com.wthealth.service.excom.ExComService;
import com.wthealth.service.exinfo.ExInfoService;
import com.wthealth.service.meeting.MeetingService;

@Controller
@RequestMapping("/")
public class MainController {

	//Field
	@Autowired
	@Qualifier("mainServiceImpl")
	private MainService mainService;
	@Autowired
	@Qualifier("exInfoServiceImpl")
	private ExInfoService exInfoService;
	@Autowired
	@Qualifier("exComServiceImpl")
	private ExComService exComService;
	@Autowired
	@Qualifier("dietComServiceImpl")
	private DietComService dietComService;
	@Autowired
	@Qualifier("meetingServiceImpl")
	private MeetingService meetingService;
	
	
	public MainController() {
		System.out.println(this.getClass());
	}
	
	@Value("#{commonProperties['pageUnit']}")
		int pageUnit;	

	@Value("#{commonProperties['pageSize']}")
		int pageSize;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage(Model model) throws Exception{

		Map<String, Object> map = new HashMap<String, Object>();
		
	
/*		String weather = "";
		List<Post> exInfo = exInfoService.listExInfo(weather);
		List<Post> dietcom = dietComService.listDietComRecom();
		List<Post> excom = exComService.listExComRecom(postNo);
		List<Post> meeting = meetingService.li
		

		
		map.put("exinfo", exInfo);
		map.put("dietcom", dietcom);
		map.put("excom", excom);
		map.put("meeting", meeting);
	
		model.addAttribute("exInfo", map.get("exinfo"));
		model.addAttribute("dietcom", map.get("dietcom"));
		model.addAttribute("excom", map.get("excom"));
		model.addAttribute("meeting", map.get("meeting"));*/
		
		
		return null;
	}
	

	
}
