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

import pe.edu.upc.moderstores.model.entity.Suscripcion;
import pe.edu.upc.moderstores.service.SuscripcionService;

@Controller
@RequestMapping("inicio/suscripciones")
@SessionAttributes("suscripcion")
public class SuscripcionController {
	@Autowired
	private SuscripcionService suscripcionService;
	
	@GetMapping
	public String start(Model model) {
		try {
			List<Suscripcion> suscripciones=suscripcionService.readAll();
			model.addAttribute("suscripciones", suscripciones);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/suscripcion/listall";
	}
	@GetMapping("/new")
	public String nuevo(Model model) {
		Suscripcion suscripcion=new Suscripcion();
		model.addAttribute("suscripcion",suscripcion);
		return "/suscripcion/nuevo";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("suscripcion")Suscripcion suscripcion, Model model,SessionStatus status) {
		try {
			suscripcionService.create(suscripcion);
			status.setComplete();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/inicio/suscripciones";
	}
	
	@GetMapping("/del/{id}")
	public String delete(@PathVariable("id") Integer id,Model model) {
		try {
			Optional<Suscripcion> optional=suscripcionService.findById(id);
			if(optional.isPresent()) {
				suscripcionService.deleteById(id);
			}else {
				return "redirect:/inicio/suscripciones";
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/inicio/suscripciones";
	}
}
