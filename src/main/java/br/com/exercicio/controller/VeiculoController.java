package br.com.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.exercicio.model.Veiculo;
import br.com.exercicio.repository.VeiculoRepository;

@Controller
@RequestMapping
public class VeiculoController {

	@Autowired
	private VeiculoRepository repository;
	
	@GetMapping("/veiculo")
	public ModelAndView findAllVeiculos() {
		List<Veiculo> veiculos = repository.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("veiculos", veiculos);
		mv.addObject(new Veiculo());
		return mv;
	}
	
	@PostMapping("/veiculo")
	public String createVeiculo(Veiculo veiculo) {
		repository.save(veiculo);
		return "redirect:/veiculo";
	}
	
	
	
}
