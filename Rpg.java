import java.util.Scanner;

public class Rpg {
    // Atributos
    public String[] nome = new String[2];
    public String[] classe = new String[2];
    public String[] habilidade = new String[2];
    public int[] vida = new int[2]; 
    public int[] mana = new int[2];
    public int nivel = 1;
    public int forca;

    Scanner scanner = new Scanner(System.in);

    public String boasvindas() {
        return "BEM-VINDO AO JOGO\nVAMOS COMEÇAR!!\n";
    }

    public String[] nomes() {
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome do seu personagem " + (i + 1) + ": ");
            nome[i] = scanner.nextLine();
        }
        return nome;
    }

    public void escolherClasse() {
        for (int i = 0; i < classe.length; i++) {
            System.out.println("Escolha a classe para " + nome[i] + ":");
            System.out.println("1 - Guerreiro\n2 - Mago\n3 - Arqueiro");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // consome quebra de linha

            switch (escolha) {
                case 1:
                    classe[i] = "Guerreiro";
                    break;
                case 2:
                    classe[i] = "Mago";
                    break;
                case 3:
                    classe[i] = "Arqueiro";
                    break;
                default:
                    System.out.println("Opção inválida! Classe padrão: Guerreiro.");
                    classe[i] = "Guerreiro";
                    break;
            }

            atribuindoHabilidades(i);
            atribuindoVida(i);
            atribuindoMana(i);
        }
    }

    public String atribuindoHabilidades(int indice) {
        if (classe[indice].equals("Guerreiro")) {
            return habilidade[indice] = "Golpe Poderoso";
        } else if (classe[indice].equals("Mago")) {
            return habilidade[indice] = "Feitiço";
        } else if (classe[indice].equals("Arqueiro")) {
            return habilidade[indice] = "Flecha";
        } else {
            return habilidade[indice] = "Ataque Básico";
        }
    }

    public void atribuindoVida(int indice) {
        vida[indice] = 100; // vida padrão para todas as classes
    }

    public void atribuindoMana(int indice) {
        if (classe[indice].equals("Mago")) {
            mana[indice] = 200;
        } 
    }
}
