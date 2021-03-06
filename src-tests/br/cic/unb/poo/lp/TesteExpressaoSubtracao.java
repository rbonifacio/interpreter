package br.cic.unb.poo.lp;

import junit.framework.TestCase;

public class TesteExpressaoSubtracao extends TestCase{
	
	public void testSubtracao() {
		try {
			ValorInteiro valor10 = new ValorInteiro(10);
		
			ValorInteiro valor5 = new ValorInteiro(5);
		
			Expressao subtracao = new ExpressaoSubtracao(valor10, valor5);
		
			ValorInteiro resultado = (ValorInteiro)subtracao.avaliar();
		
			assertEquals(new Integer(5), resultado.getValor());
		}
		catch(ErroDeTipo e) {
			fail();
		}
	}
	

}
