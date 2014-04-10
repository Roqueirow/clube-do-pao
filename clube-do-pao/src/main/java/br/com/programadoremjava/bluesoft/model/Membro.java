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
	 * composição:
	 * <ul>
	 * <li>10000 - Segunda</li>
	 * <li>11000 - Segunda e Terça</li>
	 * <li>11011 - Segunda, Terça, Quinta e Sexta</li>
	 * </ul>
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
	public String getDisponibilidade() {
		return String.format("%5s", Integer.toString(disponibilidade, 2))
				.replace(" ", "0");
	}

	/**
	 * Define/Altera a disponibilidade do membro
	 * 
	 * @param disponibilidade
	 *            - A {@link #disponibilidade} a ser definida no membro
	 */
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = Byte.valueOf(disponibilidade, 2);
	}

	@Override
	public String toString() {
		return "Membro [id=" + getId() + ", nome=" + getNome() + ", email="
				+ getEmail() + ", disponibilidade=" + getDisponibilidade()
				+ "]";
	}

	public String toJSONString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{\n");
		sb.append("\tid\t:" + getId() + ",\n");
		sb.append("\tnome\t:\"" + getNome() + "\",\n");
		sb.append("\temail\t:\"" + getEmail() + "\",\n");
		sb.append("\tdisponibilidade\t:\"" + getDisponibilidade() + "\"\n");
		sb.append("}");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		return true;
	}

	public Membro(String nome, String email, String disponibilidade) {
		setNome(nome);
		setEmail(email);
		setDisponibilidade(disponibilidade);
	}

	public Membro(String nome, String email) {
		this(nome, email, "00000");
	}

	public Membro(String nome) {
		this(nome, "noone@nowhere.com");
	}

	public Membro() {
		this("No Name");
	}

}
