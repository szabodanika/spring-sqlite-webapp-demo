package danielszabo.springsqlitewebappdemo.controller;

import danielszabo.springsqlitewebappdemo.entity.Camera;
import danielszabo.springsqlitewebappdemo.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@Autowired
	private CameraRepository cameras;

	@GetMapping("/")
	public String getIndex(Model model){
		model.addAttribute("cameras", cameras.findAll());
		model.addAttribute("camera", new Camera());
		model.addAttribute("greeting", "Camera Database");
		return "index";
	}

	@PostMapping("/")
	public String getIndex(@ModelAttribute Camera camera){
		cameras.save(camera);
		return "redirect:/";
	}
}
