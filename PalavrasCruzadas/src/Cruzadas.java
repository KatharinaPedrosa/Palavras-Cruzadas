import java.util.Scanner;

public class Cruzadas {
	public static String[][] cruzadas = new String[5][5];

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] respostas = new String[5];
		respostas[0] = "peba";
		respostas[1] = "massa";
		respostas[2] = "liso";
		respostas[3] = "bigu";
		respostas[4] = "oxe";
		boolean ganhou = false;
		String respostaUsuario = "";
		int resp = 0;
		int contador = 0;

		for (int i = 0; i < cruzadas.length; i++) {
			for (int j = 0; j < cruzadas.length; j++) {
				cruzadas[i][j] = "*";
			}

		}

		cruzadas[0][1] = " ";
		cruzadas[1][1] = " ";
		cruzadas[1][2] = " ";
		cruzadas[2][1] = " ";
		cruzadas[2][2] = " ";
		cruzadas[2][3] = " ";
		cruzadas[2][4] = " ";
		cruzadas[3][0] = " ";
		cruzadas[3][1] = " ";
		cruzadas[3][2] = " ";
		cruzadas[3][3] = " ";
		cruzadas[3][4] = " ";
		cruzadas[4][2] = " ";
		cruzadas[4][3] = " ";
		cruzadas[4][4] = " ";

		while (!ganhou) {
			desenhar();
			System.out.println("Que pergunta você quer responder: 1,2,3, 4 ou 5?");
			System.out.println("Qual é a resposta?");
			resp = entrada.nextInt();
			respostaUsuario = entrada.next();
			if (respostaUsuario.equalsIgnoreCase(respostas[resp - 1])) {
				if (resp == 1) {
					cruzadas[0][1] = "P";
					cruzadas[1][1] = "E";
					cruzadas[2][1] = "B";
					cruzadas[3][1] = "A";

					contador++;
				}
				if (resp == 2) {
					cruzadas[3][0] = "M";
					cruzadas[3][1] = "A";
					cruzadas[3][2] = "S";
					cruzadas[3][3] = "S";
					cruzadas[3][4] = "A";

					contador++;
				}
				if (resp == 3) {
					cruzadas[1][2] = "L";
					cruzadas[2][2] = "I";
					cruzadas[3][2] = "S";
					cruzadas[4][2] = "O";

					contador++;
				}
				if (resp == 4) {
					cruzadas[2][1] = "B";
					cruzadas[2][2] = "I";
					cruzadas[2][3] = "G";
					cruzadas[2][4] = "U";

					contador++;
				}
				if (resp == 5) {
					cruzadas[4][2] = "O";
					cruzadas[4][3] = "X";
					cruzadas[4][4] = "E";
					
					contador++;
				}
			}
			if (contador == 5) {
				ganhou = true;
			}

		}
System.out.println("Parabéns, você ganhou!");
	}

	public static void desenhar() {
		System.out.println("Pergunta 1: De baixa qualidade (Posição: 2a  - 2d)");
		System.out.println("Pergunta 2: Algo que é agradável (Posição: 1d - 5d) ");
		System.out.println("Pergunta 3: Sem dinheiro (Posição: 3b - 3e");
		System.out.println("Pergunta 4: Carona (Posição: 2c - 5c");
		System.out.println("Pergunta 5: Expressão de espanto (Posição: 3e - 5e");

		System.out.println("   1   2   3   4   5  ");
		System.out.println("----------------------");
		for (int i = 0; i < cruzadas.length; i++) {
			for (int j = 0; j < cruzadas.length; j++) {
				System.out.print(" | ");
				System.out.print(cruzadas[i][j]);
			}
			if (i == 0) {
				System.out.println(" | a");
			} else {
				if (i == 1) {
					System.out.println(" | b");
				} else {
					if (i == 2) {
						System.out.println(" | c");
					} else {
						if (i == 3) {
							System.out.println(" | d");
						} else {
							if (i == 4) {
								System.out.println(" | e");
							}
						}
					}
				}
			}

			System.out.println();
			System.out.println("----------------------");
		}

	}
}
