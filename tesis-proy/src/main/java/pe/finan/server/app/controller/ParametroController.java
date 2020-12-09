package pe.finan.server.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.finan.server.app.model.Parametro;
import pe.finan.server.app.repository.ParametroRepository;

@RestController
@RequestMapping("/api/parametro")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ParametroController {

	private final ParametroRepository repository;

	ParametroController(ParametroRepository repository) {
		this.repository = repository;
	}
		
	@GetMapping("/{id}")
	@ResponseBody
	public List<Parametro> consultar(@PathVariable Integer id) {	
		return repository.get(id);
	}
}
