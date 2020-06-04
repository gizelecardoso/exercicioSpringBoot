package br.com.exercicio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	private String marca;
	private Integer anoDeFabricacao;
	private String cor;
	private Double litro;
	private Double consumo;
	private Double autonomia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getLitro() {
		return litro;
	}
	public void setLitro(double litro) {
		this.litro = litro;
	}
	public Double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public Double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
}
