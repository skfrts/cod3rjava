package fundamentos;

import java.util.Date;

public class Import {
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!";
		java.lang.System.out.println(b);
		
		// Tudo em java.lang é carregado por default
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		// JButton botao = new JButton;
		// Ctrl+Shift+O Organiza os imports.
	}
}
