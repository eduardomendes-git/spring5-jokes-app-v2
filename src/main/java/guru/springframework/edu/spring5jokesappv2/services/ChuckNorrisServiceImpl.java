/**
 * 
 */
package guru.springframework.edu.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author edmen
 *
 */
@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService {

	private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

	@Override
	public String getRandomQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
