package com.generation.sustentadrive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo Nome é Obrigatório")
	@Size(min = 5, max = 100, message = "Tamanho mínimo: 5, maximo: 100")
	private String nome;

	@NotBlank(message = "O atributo Login é Obrigatório")
	@Size(min = 5, max = 100, message = "Tamanho mínimo: 5, maximo: 100")
	private String login;
	
	@NotBlank(message = "O atributo Senha é Obrigatório")
	@Size(min = 5, max = 30, message = "Tamanho mínimo: 5, maximo: 30")
	private String senha;
	
	@Size(min = 5, max = 1000, message = "Tamanho mínimo: 5, maximo: 1000")
	private String foto;

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
