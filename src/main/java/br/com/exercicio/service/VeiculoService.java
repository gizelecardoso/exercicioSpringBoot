package br.com.exercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exercicio.model.Veiculo;
import br.com.exercicio.repository.VeiculoRepository;
import br.com.exercicio.utils.Calculadora;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private Calculadora calculadora;
	
	public List<Veiculo> findVeiculos() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		
		for (Veiculo veiculo : veiculos) {
			veiculo.setAutonomia(calculadora.autonomia(veiculo.getLitro(), veiculo.getConsumo()));

		}
		
		return veiculos;
	}
	
	public void saveVeiculo(Veiculo veiculo) {

		
		veiculoRepository.save(veiculo);
	}
}
