package pe.edu.upc.moderstores.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import pe.edu.upc.moderstores.model.entity.Comerciante;
import pe.edu.upc.moderstores.model.entity.Suscripcion;
import pe.edu.upc.moderstores.service.ComercianteService;
import pe.edu.upc.moderstores.service.SuscripcionService;

@Controller
@RequestMapping("inicio/comerciantes")
@SessionAttributes("comerciante")
public class ComercianteController {

	@Autowired
	private ComercianteService comercianteService;
	
	@Autowired
	private SuscripcionService suscripcionService;
	
	@GetMapping
	public String start(Model model) {
		try {
			List<Comerciante> comerciantes=comercianteService.readAll();
			model.addAttribute("comerciantes", comerciantes);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/comerciante/listall";
	}
	@GetMapping("/new")
	public String nuevo(Model model) {
		Comerciante comerciante=new Comerciante();
		model.addAttribute("comerciante",comerciante);
		try {
			List<Suscripcion> suscripciones=suscripcionService.readAll();
			model.addAttribute("suscripciones", suscripciones);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/comerciante/nuevo";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("comerciante")Comerciante comerciante, Model model,SessionStatus status) {
		try {
			comercianteService.create(comerciante);
			status.setComplete();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/inicio/comerciantes";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id,Model model) {
		try {
			Optional<Comerciante> optional=comercianteService.findById(id);
			if(optional.isPresent()) {
				model.addAttribute("comerciante", optional.get());
				List<Suscripcion> suscripciones=suscripcionService.readAll();
				model.addAttribute("suscripciones", suscripciones);
			}else {
				return "redirect:/inicio/comerciantes";
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/comerciante/edit";
	}
	@GetMapping("/del/{id}")
	public String delete(@PathVariable("id") Integer id,Model model) {
		try {
			Optional<Comerciante> optional=comercianteService.findById(id);
			if(optional.isPresent()) {
				comercianteService.deleteById(id);
			}else {
				return "redirect:/inicio/comerciantes";
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/inicio/comerciantes";
	}
}
