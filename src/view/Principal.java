package view;

import br.com.serialexperimentscarina.arvorechar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		ArvoreChar arvore = new ArvoreChar();
		
		for (char letra : vetor) {
			arvore.insert(letra);
		}
		
		try {
			arvore.remove('F');
			arvore.remove('U');
			arvore.prefixSearch();
			System.out.println('\n');
			arvore.infixSearch();
			System.out.println('\n');
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
