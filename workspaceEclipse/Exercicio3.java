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
					+ " 4 - Apresenta altura da AVL\n 5 - Apresenta o número de nós presentes na árvore\n");
			System.out.print("Digite opção: ");
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
					System.out.println("AVL está vazia");
				else
					System.out.println("Altura AVL = " + tree.altura(tree.root));
				break;
			case 5:
				System.out.println("Número de nós na AVL = "+ tree.contaNos(tree.root,0));
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (op != 0);
	}

}
