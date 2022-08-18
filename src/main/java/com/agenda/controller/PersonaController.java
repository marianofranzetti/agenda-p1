package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agenda.models.Persona;
import com.agenda.service.api.PersonaServiceApi;

@Controller
public class PersonaController {
	
	@Autowired
	private PersonaServiceApi personaService;
	
	
	@RequestMapping
	public String index(Model model) {
		model.addAttribute("list",personaService.getAll());
		
		return "index";
		
	}

	@GetMapping("/save")
	public String showSave(Long id,Model model) {
		if(id != null) {
			model.addAttribute("persona", personaService.get(id));
		}
		return "save";
		
	}
	
	@PostMapping("/save/{id}")
	public String save(Persona persona,Model model) {
		personaService.Save(persona);
		return "redirect:/";
		
	}
	
	
	@PostMapping("/save/{id}")
	public String delete(Long id,Model model) {
		personaService.delete(id);
		return "redirect:/";
		
	}
}
