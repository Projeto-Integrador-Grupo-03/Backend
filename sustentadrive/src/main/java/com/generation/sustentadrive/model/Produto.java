package com.generation.sustentadrive.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@NotBlank(message = "O atributo Nome é Obrigatório")
	@Size(min = 2, max = 100, message = "Tamanho mínimo: 2, maximo: 100")
	private String nome;
	
	@NotBlank(message = "O atributo Cor é Obrigatório")
	@Size(min = 4, max = 100, message = "Tamanho mínimo: 4, maximo: 100")
	private String cor;
	
	@NotBlank(message = "O atributo Modelo é Obrigatório")
	@Size(min = 5, max = 100, message = "Tamanho mínimo: 5, maximo: 100")
	private String modelo;
	
	@NotNull(message = "O atributo Ano é Obrigatório")
	//@Size(min = 3, max = 5 , message = "Tamanho mínimo: 3, maximo: 5")
	private int ano;
	
	@NotNull(message = "O atributo preço é Obrigatório")
	@Column(precision = 8, scale = 2) 
	private BigDecimal preco;
	
	@NotBlank(message = "O atributo foto é Obrigatório")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
