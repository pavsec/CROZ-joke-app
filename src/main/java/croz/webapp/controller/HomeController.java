package croz.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import croz.webapp.model.Category;
import croz.webapp.model.Joke;
import croz.webapp.service.CategoryService;
import croz.webapp.service.JokeService;

@Controller
public class HomeController {

	@Autowired
	private JokeService jokeService;
	
	@Autowired
	private CategoryService categoryService;
	
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
	
	@RequestMapping("inputJoke")
	public String addJoke(Model model) {
		List<Category> cats = categoryService.listAll();
		model.addAttribute("cats", cats);
		return "inputJoke";
	}
	
	@PostMapping("inputJoke")
	public String addJoke(@ModelAttribute Joke joke) {
		jokeService.insertJoke(joke);
		return "home";
	}
}
