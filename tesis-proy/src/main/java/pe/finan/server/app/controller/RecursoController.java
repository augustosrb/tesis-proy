package pe.finan.server.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.finan.server.app.model.Recurso;
import pe.finan.server.app.repository.RecursoRepository;

@RestController
@RequestMapping("/api/recurso")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class RecursoController {

	private final RecursoRepository repository;

	RecursoController(RecursoRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/")
	@ResponseBody
	public List<Recurso> consultar() {
		return repository.getAll();
	}
	
	@GetMapping("/")
	@ResponseBody
	public List<Recurso> consultarbyId(int id) {
		return repository.get(id);
	}

	@PostMapping(value = "/")
	@ResponseBody
	public int insertar(@RequestBody Recurso hora) {
		return repository.create(hora);
	}

}
