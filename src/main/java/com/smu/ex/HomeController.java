package com.smu.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller // 7. 컨트롤러 어노테이션
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) // 8. 요청 맵핑!
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; // 9. View의 이름
	}
	@RequestMapping("/border/view")
	public String views(){
		
		
		return "/border/View";
	}
	@RequestMapping("/border/writer")
	public String writer(Model model){
		
		model.addAttribute("id", 30);
		return "/border/Writer";
	}
	@RequestMapping("/border/reply")
	public ModelAndView reply(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("/border/Reply");
		
		return mv;
	}
}
