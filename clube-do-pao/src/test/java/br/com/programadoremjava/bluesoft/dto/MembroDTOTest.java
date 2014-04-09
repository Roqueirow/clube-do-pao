package br.com.programadoremjava.bluesoft.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.programadoremjava.bluesoft.model.Membro;

public class MembroDTOTest {

	@Test
	public void testToDTO() {

		String expectedNome = "Darth Vader";
		String expectedEmail = "darth.vader@galaticempire.gov";
		Byte expectedDisponibilidade = Byte.valueOf("01010", 2);

		Membro model = new Membro();
		model.setNome(expectedNome);
		model.setEmail(expectedEmail);
		model.setDisponibilidade(expectedDisponibilidade);
		MembroDTO dto = MembroDTO.formModel(model);

		assertEquals(expectedNome, dto.getNome());
		assertEquals(expectedEmail, dto.getEmail());
		assertEquals(expectedDisponibilidade, dto.getDisponibilidade());

	}

	@Test
	public void testUpdateModel() {
		String originalNome = "Anakim Skywalker";
		String originalEmail = "anakim.skywalker@rebelaliance.org";
		Byte   originalDisponibilidade = Byte.valueOf("10001", 2);

		String alteradoNome = "Darth Vader";
		String alteradoEmail = "darth.vader@galaticempire.gov";
		Byte   alteradoDisponibilidade = Byte.valueOf("01010", 2);

		Membro model = new Membro();
		model.setNome(originalNome);
		model.setEmail(originalEmail);
		model.setDisponibilidade(originalDisponibilidade);
		MembroDTO dto = MembroDTO.formModel(model);

		assertEquals(originalNome, dto.getNome());
		assertEquals(originalEmail, dto.getEmail());
		assertEquals(originalDisponibilidade, dto.getDisponibilidade());
		
		dto.setNome(alteradoNome);
		dto.setEmail(alteradoEmail);
		dto.setDisponibilidade(alteradoDisponibilidade);
		
		MembroDTO.updateModel(dto, model);
		
		assertEquals(alteradoNome, model.getNome());
		assertEquals(alteradoEmail, model.getEmail());
		assertEquals(alteradoDisponibilidade, model.getDisponibilidade());
		
	}
}
