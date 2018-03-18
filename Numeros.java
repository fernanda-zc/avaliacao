package br.com.avaliacao.numeros;

public class Numeros {

	public int criarC(int a, int b) {
		int c;
		StringBuilder text_c = new StringBuilder();
		String text_a = String.valueOf(a);
		String text_b = String.valueOf(b);
		if(text_a.length() > text_b.length())
		{
			for(int i = 0; i<text_b.length(); i++)
			{
				text_c.append(text_a.charAt(i));
				text_c.append(text_b.charAt(i));
			}
			text_c.append(text_a.substring(text_b.length(), text_a.length()));
		}
		else if (text_a.length() < text_b.length())
		{
			for(int i = 0; i<text_a.length(); i++)
			{
				text_c.append(text_a.charAt(i));
				text_c.append(text_b.charAt(i));
			}
			text_c.append(text_b.substring(text_a.length(), text_b.length()));
		}
		else
		{ //os números são do mesmo tamanho
			for(int i = 0; i<text_a.length(); i++)
			{
				text_c.append(text_a.charAt(i));
				text_c.append(text_b.charAt(i));
			}
		}
		c = Integer.parseInt(String.valueOf(text_c));
		if(c > 1000000)
			c = -1;
		return c;
	}
}
