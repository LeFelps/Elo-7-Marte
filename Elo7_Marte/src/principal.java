import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int qtdSonda;
		int strLength;
		String entrada = "";
		char sondaDir[] = new char[10];
		int sondaPos[][] = new int[2][10];

		Scanner input = new Scanner(System.in);

		System.out.println("Quantidade de sondas: ");
		qtdSonda = input.nextInt();

		if (qtdSonda >= 10) {
			qtdSonda = 10;
			System.out.println("O numero informado foi alterado para o valor máximo(10)");
		}

		for (int x = 0; x < 1; x++) {

			for (int y = 0; y < (qtdSonda); y++) {

				sondaPos[x][y] = 0;
			}

		}

		for (int x = 0; x < (qtdSonda); x++) {

			sondaDir[x] = 'N';

		}

		while (!(entrada.equalsIgnoreCase("parar"))) {

			for (int x = 0; x < (qtdSonda); x++) {

				entrada = input.next().toUpperCase();
				strLength = entrada.length();

				char comando[] = entrada.toCharArray();

				for (int y = 0; y < strLength; y++) {

					if (comando[y] == 'R') {

						if (sondaDir[x] == 'N') {

							sondaDir[x] = 'E';

						} else if (sondaDir[x] == 'E') {

							sondaDir[x] = 'S';

						} else if (sondaDir[x] == 'S') {

							sondaDir[x] = 'W';

						} else {

							sondaDir[x] = 'N';

						}

					} else if (comando[y] == 'L') {

						if (sondaDir[x] == 'N') {

							sondaDir[x] = 'W';

						} else if (sondaDir[x] == 'E') {

							sondaDir[x] = 'N';

						} else if (sondaDir[x] == 'S') {

							sondaDir[x] = 'E';

						} else {

							sondaDir[x] = 'S';

						}

					} else if (comando[y] == 'M') {

						if (sondaDir[x] == 'N') {

							sondaPos[0][x]++;

						} else if (sondaDir[x] == 'E') {

							sondaPos[1][x]++;

						} else if (sondaDir[x] == 'S') {

							sondaPos[0][x]--;

						} else {

							sondaPos[1][x]--;

						}

						if (sondaPos[0][x] < 0) {

							sondaPos[0][x] = 0;

						} else if (sondaPos[1][x] < 0) {

							sondaPos[1][x] = 0;

						}
					}
				}

				System.out
						.println((sondaPos[0][x]) + " " + (sondaPos[1][x] + " " + (sondaDir[x])));

			}
		}

		input.close();

	}
}
