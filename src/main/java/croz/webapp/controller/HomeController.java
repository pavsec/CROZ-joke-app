package croz.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import croz.webapp.model.Joke;
import croz.webapp.service.JokeService;

@Controller
public class HomeController {

	@Autowired
	private JokeService jokeService;
	
	@RequestMapping(value= {"/", "home"})
	public String home() {
		return "home";
	}
	
	@RequestMapping("listJokes")
	public String listJokes(Model model) {
		List<Joke> jokes = jokeService.listAll();
	    model.addAttribute("jokes", jokes);
		return "listJokes";
	}
}
