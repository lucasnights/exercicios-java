package desafio1;

import java.util.Scanner;

public class Main {
    static void main() {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Contadores
        int ninjas = 0;
        int uchihas = 0;
        int maxNinjas = 5;
        int maxUchihas = 5;


        //Escolha do menu e Array para armazenamento de dados.
        int escolha = 0;
        Ninja[] ninjasN = new Ninja[maxNinjas];
        Uchiha[] uchihasN = new Uchiha[maxUchihas];

        while (escolha != 5) {
            System.out.println("\n========== Menu ==========");
            System.out.println("1. Cadastrar ninja normal.");
            System.out.println("2. Cadastrar uchiha.");
            System.out.println("3. Listar usuários.");
            System.out.println("4. Deletar um usuário.");
            System.out.println("5. Sair.");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    if (ninjas<maxNinjas) {
                        Ninja ninjaN = new Ninja();
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        ninjaN.nome = nomeNinja;
                        System.out.println("Digite o nome da aldeia do ninja: ");
                        String aldeiaNinja = scanner.nextLine();
                        ninjaN.aldeia = aldeiaNinja;
                        System.out.println("Digite a idade do ninja: ");
                        int idadeNinja = scanner.nextInt();
                        scanner.nextLine();
                        ninjaN.idade = idadeNinja;
                        ninjasN[ninjas] = ninjaN;
                        ninjas++;
                    }
                    else {
                        System.out.println("Lista cheia.");
                    }
                    break;
                case 2:
                    if (uchihas<maxUchihas) {
                        Uchiha uchihaN = new Uchiha();
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        uchihaN.nome = nomeNinja;
                        System.out.println("Digite o nome da aldeia do ninja: ");
                        String aldeiaNinja = scanner.nextLine();
                        uchihaN.aldeia = aldeiaNinja;
                        System.out.println("Digite a idade do ninja: ");
                        int idadeNinja = scanner.nextInt();
                        scanner.nextLine();
                        uchihaN.idade = idadeNinja;
                        System.out.println("Digite a sua habilidade especial: ");
                        String habilidadeNinja = scanner.nextLine();
                        uchihaN.habilidadeEspecial = habilidadeNinja;
                        uchihasN[uchihas] = uchihaN;
                        uchihas++;
                    }
                    else {
                        System.out.println("Lista cheia.");
                    }
                    break;
                case 3:
                    System.out.println("Voce deseja ver qual das listas?");
                    System.out.println("1. Ninjas normais.");
                    System.out.println("2. Uchihas.");

                    int listas = scanner.nextInt();
                    scanner.nextLine();

                    if (listas == 1) {
                        if (ninjas != 0) {
                            for (int i = 0; i < ninjas; i++) {
                                ninjasN[i].mostrarInformacoes();
                                System.out.println("----------------------");
                            }
                        } else {
                            System.out.println("Lista vazia.");
                        }
                    }
                    else if (listas == 2){
                        if (uchihas != 0) {
                            for (int i = 0; i < uchihas; i++) {
                                uchihasN[i].mostrarInformacoes();
                                System.out.println("----------------------");
                            }
                        } else {
                            System.out.println("Lista vazia.");
                        }
                    }
                    else {
                        System.out.println("Escolha uma opção válida.");
                    }
                    break;
                case 4:
                    System.out.println("Voce deseja ver qual das listas?");
                    System.out.println("1. Ninjas normais.");
                    System.out.println("2. Uchihas.");

                    int delete = scanner.nextInt();
                    scanner.nextLine();

                    if (delete == 1) {
                        if (ninjas != 0) {
                            for (int i = 0; i < ninjas; i++) {
                                System.out.println(i);
                                ninjasN[i].mostrarNomes();
                                System.out.println("----------------------");
                            }
                            System.out.println("Digite o número do ninja que você deseja excluir.");
                            int deletar = scanner.nextInt();
                            scanner.nextLine();
                            for (int j = deletar; j < ninjas - 1; j++) {
                                ninjasN[j] = ninjasN[j + 1];
                            }
                            ninjas--;
                        } else {
                            System.out.println("A lista está vazia.");
                        }
                    }
                    else if (delete == 2) {
                        if (uchihas != 0) {
                            for (int i = 0; i < uchihas; i++) {
                                System.out.println(i);
                                uchihasN[i].mostrarInformacoes();
                                System.out.println("----------------------");
                            }
                            System.out.println("Digite o número do ninja que você deseja excluir.");
                            int deletar = scanner.nextInt();
                            scanner.nextLine();
                            for (int j = deletar; j < uchihas - 1; j++) {
                                uchihasN[j] = uchihasN[j + 1];
                            }
                            uchihas--;
                        }
                        else{
                            System.out.println("Lista vazia.");
                        }
                    }
                    else {
                        System.out.println("Escolha uma opção válida.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        }
    }
}