package br.com.programadoremjava.bluesoft.dto;

import java.io.Serializable;

import br.com.programadoremjava.bluesoft.model.Membro;

public class MembroDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public static MembroDTO formModel(Membro model) {
		MembroDTO dto = new MembroDTO();
		dto.setId(model.getId());
		dto.setNome(model.getNome());
		dto.setEmail(model.getEmail());
		dto.setDisponibilidade(model.getDisponibilidade());
		return dto;
	}
	
	public static Membro updateModel(MembroDTO dto, Membro model) {
		model.setNome(dto.getNome());
		model.setEmail(dto.getEmail());
		model.setDisponibilidade(dto.getDisponibilidade());
		return model;
	}
	
	private Long id;
	private String nome;
	private String email;
	private Byte disponibilidade;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Byte disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
