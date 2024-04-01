package com.generation.sustentadrive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O tipo é obrigatorio")
	@Size(min = 4, max = 40, message = "O atributo tipo de conter no minimo 4 e no maximo 40 caracteres ")
	private String tipo;
	
	@NotBlank(message = "O estado é obrigatorio")
	@Size(min = 4, max = 40, message = "O atributo estado de conter no minimo 4 e no maximo 40 caracteres ")
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
