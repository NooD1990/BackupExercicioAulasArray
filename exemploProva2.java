//Escreva uma senha que peça 8 caracteres e confirme a senha
import java.util.Scanner;

public class exemploProva2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();
		
		if (senhaValida(senha)) {
			System.out.println("Senha válida!");
		} else {
			System.out.println("Senha inválida. A senha deve ter entre 5 e 8 caracterese conter letras e números.");
		}
		scanner.close();
	}
	public static boolean senhaValida(String senha) {
		//Verifica o tamanho da senha
		if (senha.length() < 5 || senha.length() > 8) {
			return false;
		}
		boolean temLetra = false;
		boolean temNumero = false;
		
		//verifica se há ao menos uma letra e um número
		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isLetter(c)) {
				temLetra = true;
			} else if (Character.isDigit(c)) {
				temNumero = true;
			}
		}
		return temLetra && temNumero;
	}
}
