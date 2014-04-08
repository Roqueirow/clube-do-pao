package br.com.programadoremjava.bluesoft.model;

import java.io.Serializable;

public class Membro implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * Identificador único de um Membro do Clube do Pão
	 */
	private Long id;
	/**
	 * Nome do Membro do Clube do Pão
	 */
	private String nome;
	/**
	 * Email do Membro do Clube do Pão
	 */
	private String email;
	/**
	 * Disponibilidade do Membro do Clube do Pão:
	 * 
	 * Armazenar em formato de Byte sendo cada dia da semana um Bit da
	 * composição
	 * 
	 * 10000 - Segunda 11000 - Segunda e Terça 11011 - Segunda, Terça, Quinta e
	 * Sexta
	 */
	private Byte disponibilidade;

	/**
	 * Recupera o id do membro.
	 * 
	 * @return {@link #id}
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Recupera o nome do membro.
	 * 
	 * @return {@link #nome}
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define/Altera o nome do membro
	 * 
	 * @param nome
	 *            - O {@link #nome} a ser definido no membro
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Recupera o email do membro.
	 * 
	 * @return {@link #email}
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Define/Altera o email do membro
	 * 
	 * @param email
	 *            - O {@link #email} a ser definido no membro
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Recupera a disponibilidade do membro.
	 * 
	 * @return {@link #disponibilidade}
	 */
	public Byte getDisponibilidade() {
		return disponibilidade;
	}

	/**
	 * Define/Altera a disponibilidade do membro
	 * 
	 * @param disponibilidade
	 *            - A {@link #disponibilidade} a ser definida no membro
	 */
	public void setDisponibilidade(Byte disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membro other = (Membro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", disponibilidade=" + disponibilidade + "]";
	}

	public String toJSONString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{\n");
		sb.append("\tid\t:" + id + ",\n");
		sb.append("\tnome\t:\"" + nome + "\",\n");
		sb.append("\temail\t:\"" + email + "\",\n");
		sb.append("\tdisponibilidade\t:" + disponibilidade + "\n");
		sb.append("}");
		return sb.toString();
	}

}
