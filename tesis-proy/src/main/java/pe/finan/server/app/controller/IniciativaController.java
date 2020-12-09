package pe.finan.server.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.finan.server.app.model.Iniciativa;
import pe.finan.server.app.repository.IniciativaRepository;

@RestController
@RequestMapping("/api/iniciativa")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class IniciativaController {

//	private final IniciativaService service;
	
	private final IniciativaRepository repository;
	
	IniciativaController(IniciativaRepository repository) {
		this.repository = repository;
	}
	
   @PostMapping(value = "/")
   @ResponseBody
	public int crear(@RequestBody Iniciativa iniciativa) {	
		return repository.create(iniciativa);
	}
   
   @GetMapping(value = "/{id}")
   @ResponseBody
	public List<Iniciativa> consultar(@PathVariable Integer id) {	
		return repository.get(id);
	}
   
}