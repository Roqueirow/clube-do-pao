package br.com.programadoremjava.bluesoft.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MembroTest {

	@Test
	public void testToString() {
		String expected = "Membro [id=null, nome=Luke Skywalker, "
				+ "email=luke.skywalker@rebelaliance.org, disponibilidade=10101]";
		Membro m = new Membro();
		m.setNome("Luke Skywalker");
		m.setEmail("luke.skywalker@rebelaliance.org");
		m.setDisponibilidade("10101");
		assertEquals(expected, m.toString());
		System.out.println(m);
	}

	@Test
	public void testToJSONString() {
		String expected = "{\n\tid\t:null,\n\tnome\t:\"Luke Skywalker\","
				+ "\n\temail\t:\"luke.skywalker@rebelaliance.org\","
				+ "\n\tdisponibilidade\t:\"10101\"\n}";
		Membro m = new Membro();
		m.setNome("Luke Skywalker");
		m.setEmail("luke.skywalker@rebelaliance.org");
		m.setDisponibilidade("10101");
		assertEquals(expected, m.toJSONString());
		System.out.println(m.toJSONString());
	}

}
