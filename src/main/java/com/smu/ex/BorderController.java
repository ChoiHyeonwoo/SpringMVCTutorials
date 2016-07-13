package com.smu.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/border")
public class BorderController {

	@RequestMapping("/view")
	public String views(){
		
		
		return "/border/View";
	}
	@RequestMapping("/writer")
	public String writer(Model model){
		
		model.addAttribute("id", 30);
		return "/border/Writer";
	}
	@RequestMapping("/reply")
	public ModelAndView reply(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("/border/Reply");
		
		return mv;
	}
}
