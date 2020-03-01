package eval.ms.maven.evalmsback.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eval.ms.maven.evalmsback.Models.AuteurModel;
import eval.ms.maven.evalmsback.repositories.AuteurRepository;

@RestController
public class AuteurController {

	@Autowired
	private AuteurRepository auteurRepository;
	
	@GetMapping(value = "/auteur/{id}")
	public Optional<AuteurModel> getAuteur(@PathVariable Long id) {
		return auteurRepository.findById(id);
	}
	
	@GetMapping(value = "/auteurs")
	public List<AuteurModel> getAuteurs() {
		System.out.println("trace getAuteurs");
		List<AuteurModel> auteurs = new ArrayList<AuteurModel>(); 
		auteurRepository.findAll().forEach(auteurs::add);
		return auteurs;
	}
	
	@PostMapping(value = "/add") 
	public void addAuteur(@RequestBody AuteurModel u) {
		auteurRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateAuteur(@RequestBody AuteurModel u) {
		auteurRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteAuteur(@RequestBody AuteurModel u) {
		auteurRepository.delete(u);
	}	
	
	
 	
}
