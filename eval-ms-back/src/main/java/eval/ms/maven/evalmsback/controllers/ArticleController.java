package eval.ms.maven.evalmsback.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eval.ms.maven.evalmsback.Models.ArticleModel;
import eval.ms.maven.evalmsback.repositories.ArticleRepository;

@RestController
public class ArticleController {

	@Autowired
	private ArticleRepository ArticleRepository;
	
	@GetMapping(value = "/Article/{id}")
	public Optional<ArticleModel> getArticle(@PathVariable Long id) {
		return ArticleRepository.findById(id);
	}
	
	@GetMapping(value = "/Articles")
	public List<ArticleModel> getArticles() {
		System.out.println("trace getArticles");
		List<ArticleModel> Articles = new ArrayList<ArticleModel>(); 
		ArticleRepository.findAll().forEach(Articles::add);
		return Articles;
	}
	
	@PostMapping(value = "/addArticle") 
	public void addArticle(@RequestBody ArticleModel u) {
		ArticleRepository.save(u);
	}
	
	@PutMapping(value = "/updateArticle")
	public void updateArticle(@RequestBody ArticleModel u) {
		ArticleRepository.save(u);
	}
	
	
 	
}
