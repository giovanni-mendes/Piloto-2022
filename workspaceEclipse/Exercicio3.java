package exercicio3;

import java.util.Scanner;

import utils.AVLint;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);

		AVLint tree = new AVLint();
		int op;
		do {
			System.out.println(" 0 - Sair \n 1 - Inserir \n 2 - Mostrar FB\n 3 - Remover valor\n"
					+ " 4 - Apresenta altura da AVL\n 5 - Apresenta o n�mero de n�s presentes na �rvore\n");
			System.out.print("Digite op��o: ");
			op = le.nextInt();
			switch (op) {
			case 0:
				System.out.println("Programa encerrado");
				break;
			case 1:
				System.out.print("   Valor: ");
				int valor = le.nextInt();
				tree.root = tree.inserirAVL(tree.root, valor);
				tree.atualizaAlturas(tree.root);
				break;
			case 2:
				tree.mostraFB(tree.root);
				break;
			case 3:
				System.out.print("Informe valor a ser removido: ");
				int info = le.nextInt();
				tree.root = tree.removeValor(tree.root, info);
				tree.root = tree.atualizaAlturaBalanceamento(tree.root);
				tree.atualizaAlturas(tree.root);
				break;
			case 4:
				if (tree.root == null)
					System.out.println("AVL est� vazia");
				else
					System.out.println("Altura AVL = " + tree.altura(tree.root));
				break;
			case 5:
				System.out.println("N�mero de n�s na AVL = "+ tree.contaNos(tree.root,0));
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
		} while (op != 0);
	}

}
