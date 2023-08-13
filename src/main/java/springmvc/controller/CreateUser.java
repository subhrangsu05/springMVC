package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.UserData;
import springmvc.service.UserService;

@Controller
public class CreateUser {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonData(Model model) {
		model.addAttribute("header","Registration Form");
	}
	@RequestMapping("/create")
	public String create_user_Page(Model model) {
		System.out.println("Signup Url Method is executing....");
		return "createUser";
	}
	//*********************** Below Technique used for traditional approach********************
/*	@RequestMapping(value="processForm",method=RequestMethod.POST)
	public String processForm(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println("[Name="+name+", email="+email+", password="+password+"] /n Form processing ...");
		return "";
	}*/
	//****************************Below technique is being used RequestMapping annotation *************************************
	/*@RequestMapping(path="processForm",method=RequestMethod.POST)
	public ModelAndView processForm(@RequestParam("name")String userName,@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword) {
		System.out.printf(userName,userEmail,userPassword);
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",userName);
		mav.addObject("email",userEmail);
		mav.addObject("password",userPassword);
		mav.setViewName("success");
		return mav;
	} */
	//*******************************Another Approach*********************************
	/*@RequestMapping(path="processForm",method=RequestMethod.POST)
	public ModelAndView processForm(@RequestParam("name")String userName,@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword) {
		System.out.printf(userName,userEmail,userPassword);
		UserData user = new UserData(userName,userEmail,userPassword);
		ModelAndView mav = new ModelAndView();
		mav.addObject("user",user);
		mav.setViewName("success");
		return mav;
	}*/
	@RequestMapping(value="processForm",method=RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute UserData user) {
		ModelAndView mav = new ModelAndView();
		int row = userService.createUser(user);
		mav.addObject("row",row);
		mav.setViewName("success");
		return mav;
	}
}
