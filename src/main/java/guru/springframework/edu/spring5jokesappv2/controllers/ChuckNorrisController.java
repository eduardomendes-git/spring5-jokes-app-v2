/**
 * 
 */
package guru.springframework.edu.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.edu.spring5jokesappv2.services.ChuckNorrisService;

/**
 * @author edmen
 *
 */
@Controller
public class ChuckNorrisController {

	private final ChuckNorrisService chuckNorrisService;
	
	public ChuckNorrisController(ChuckNorrisService chuckNorrisService) {
		this.chuckNorrisService = chuckNorrisService;
	}
	
	@RequestMapping("/")
	public String getQuote(Model model) {
		
		String quote = chuckNorrisService.getRandomQuote();
		model.addAttribute("joke", quote);		
		return "chucknorris/index";
	}
}
