import java.util.Scanner;

public class Rpg {
    // Atributos
    public String nome;
    public String classe;
    public int nivel;
    public int mana;
    public int forca;
    public int opcao;

    Scanner scanner = new Scanner(System.in);

    // Método que pede ao usuário para escolher a classe e retorna a opção escolhida
    public int classe() {
        System.out.println("Escolha a classe (1 - Guerreiro, 2 - Mago, 3 - Arqueiro): ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        return opcao;
    }

    // Método para receber o nome do personagem
    public String nome() {
        System.out.println("Nome do personagem: ");
        nome = scanner.nextLine();
        return nome;
    }

    // Método que retorna a habilidade especial de acordo com a classe escolhida
    public String usarHabilidadeEspecial() {
        int classeEscolhida = classe();

        switch (classeEscolhida) {
            case 1:
                classe = "Guerreiro";
                return "Golpe poderoso";
            case 2:
                classe = "Mago";
                return "Lança feitiço";
            case 3:
                classe = "Arqueiro";
                return "Lança flecha";
            default:
                classe = "Desconhecida";
                return "Inválido, tente novamente";
        }
    }

    // Método para mostrar o status
    public String status() {
        return "Nome: " + nome + " | Classe: " + classe + " | Habilidade: " + usarHabilidadeEspecial();
    }
}
