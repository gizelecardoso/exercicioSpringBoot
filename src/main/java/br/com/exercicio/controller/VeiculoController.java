package br.com.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.exercicio.model.Veiculo;
import br.com.exercicio.service.VeiculoService;

@Controller
@RequestMapping
public class VeiculoController {

	@Autowired
	private VeiculoService serviceVeiculo;
	
	@GetMapping("/veiculo")
	public ModelAndView findAllVeiculos() {
		List<Veiculo> veiculos = serviceVeiculo.findVeiculos();
		ModelAndView mv = new ModelAndView("veiculo");
		mv.addObject("veiculos", veiculos);
		mv.addObject(new Veiculo());
		return mv;
	}
	
	@PostMapping("/veiculo")
	public String createVeiculo(Veiculo veiculo) {
		serviceVeiculo.saveVeiculo(veiculo);
		return "redirect:/veiculo";
	}
	
	
	
}
