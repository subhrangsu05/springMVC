package springmvc.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
@Controller
public class MainController {
	@RequestMapping("/home")
	public String homePage(Model homeModel) {
		homeModel.addAttribute("name","Subhrangsu Sinha");
		System.out.println("Home Url Method is executing....");
		return "home";
	}
	@RequestMapping("/about")
	public String aboutPage(Model aboutModel) {
		List <String> friends = new ArrayList<String>();
		friends.add("Me");
		friends.add("Myself");
		aboutModel.addAttribute("friendList",friends);
		System.out.println("About Url Method is executing....");
		return "about";
	}
	@RequestMapping("/contact")
	public ModelAndView contactPage() {
		Map <String,String> contacts = new HashMap<String,String>();
		contacts.put("OwnerNumber", "6289452324");
		contacts.put("BusinessNumber", "7044750217");
		ModelAndView mav = new ModelAndView();
		mav.addObject("contacts",contacts);
		System.out.println("Contact Url Method is executing....");
		mav.setViewName("contact");
		return mav;
	}
	@RequestMapping("/help")
	public ModelAndView helpPage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("email","subhrangsu.sinha@gmail.com");
		System.out.println("Help Url Method is executing....");
		mav.setViewName("help");
		return mav;
	}
	@RequestMapping("/location")
	public ModelAndView locationPage() {
		ModelAndView mav = new ModelAndView();
		List <String> locations = new ArrayList<>();
		locations.add("Kolkata");
		locations.add("Delhi");
		locations.add("Bangalore");
		mav.addObject("locationn",locations);
		System.out.println("Location Url Method is executing....");
		mav.setViewName("location");
		return mav;
	}
}
