/*Considere o problema de registrar 5 valores string (correspondente ao nome de pessoas).
Cada valor � armazenado em uma vari�vel interna a uma estrutura array chamada pessoas.
Ap�s cadastro, verificar e mostrar se o nome de uma pessoa informada pelo usu�rio se encontra
ou n�o na array cadastrada.
Exemplo: string []   pessoas  = [�Ana�, �Maria�, �Carlos�, � Joao�]
	nome = �maria�
 	mensagem (�nome: � MARIA �est� cadastrado na lista�)*/


import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		String [] pessoas = new String[5];
		boolean nomeencontrado = false;
		for (int i = 0; i < pessoas.length; i++){
			pessoas[i] = JOptionPane.showInputDialog("Digite o nome da pessoas que deseja cadastrar: ");
		}
		String pesquisa = JOptionPane.showInputDialog("Digite o nome da pessoa que voc� procura: ");
		for (int i = 0; i < pessoas.length; i++){
			if (pesquisa.equalsIgnoreCase(pessoas[i])){ //lembrar que para palavras usar.equalsIgnoreCase e n�o "=="
				nomeencontrado = true;
			}
		}
		if (nomeencontrado == true){
			JOptionPane.showMessageDialog(null, pesquisa+" est� cadastrado(a) na lista.");
		}
		else {
			JOptionPane.showMessageDialog(null, pesquisa+" n�o est� cadastrado(a) na lista.");
		}
		}

}
