package pe.finan.server.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.finan.server.app.model.Hora;
import pe.finan.server.app.repository.HoraRepository;

@RestController
@RequestMapping("/api/hora")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class HoraController {

	private final HoraRepository repository;

	HoraController(HoraRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/")
	@ResponseBody
	public List<Hora> consultar(@RequestBody Hora hora) {
		return repository.getAll(hora);
	}

	@PostMapping(value = "/")
	@ResponseBody
	public int insertar(@RequestBody Hora hora) {
		return repository.create(hora);
	}

	@DeleteMapping(value = "/")
	@ResponseBody
	public void eliminar(@RequestBody Hora hora) {
		repository.remove(hora);
	}
}
