/*Considere o problema de registrar 5 valores string (correspondente ao nome de pessoas).
Cada valor é armazenado em uma variável interna a uma estrutura array chamada pessoas.
Após cadastro, verificar e mostrar se o nome de uma pessoa informada pelo usuário se encontra
ou não na array cadastrada.
Exemplo: string []   pessoas  = [‘Ana’, ’Maria’, ’Carlos’, ‘ Joao’]
	nome = ‘maria’
 	mensagem (“nome: “ MARIA “está cadastrado na lista”)*/


import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		String [] pessoas = new String[5];
		boolean nomeencontrado = false;
		for (int i = 0; i < pessoas.length; i++){
			pessoas[i] = JOptionPane.showInputDialog("Digite o nome da pessoas que deseja cadastrar: ");
		}
		String pesquisa = JOptionPane.showInputDialog("Digite o nome da pessoa que você procura: ");
		for (int i = 0; i < pessoas.length; i++){
			if (pesquisa.equalsIgnoreCase(pessoas[i])){ //lembrar que para palavras usar.equalsIgnoreCase e não "=="
				nomeencontrado = true;
			}
		}
		if (nomeencontrado == true){
			JOptionPane.showMessageDialog(null, pesquisa+" está cadastrado(a) na lista.");
		}
		else {
			JOptionPane.showMessageDialog(null, pesquisa+" não está cadastrado(a) na lista.");
		}
		}

}
