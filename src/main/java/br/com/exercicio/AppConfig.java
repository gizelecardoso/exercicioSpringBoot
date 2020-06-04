package br.com.exercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.exercicio.utils.Calculadora;

@Configuration
public class AppConfig {

	@Autowired
	private Calculadora calculadora;

	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}
}
