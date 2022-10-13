package guru.springframework.spring5jokesapp.controller;

import guru.springframework.spring5jokesapp.service.impl.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

  private final JokeServiceImpl jokesService;

  public JokesController(JokeServiceImpl jokesService) {
    this.jokesService = jokesService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(Model model) {
    var joke = jokesService.getJoke();
    model.addAttribute("joke", joke);
    return "index";
  }

}
