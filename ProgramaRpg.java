import java.util.Scanner;

public class ProgramaRpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rpg personagens = new Rpg();

        // Exibir mensagem de boas-vindas
        System.out.println(personagens.boasvindas());

        // Coletar nomes dos personagens
        personagens.nomes(); 

        // Coletar classes e atribuir habilidades, vida e mana
        personagens.escolherClasse(); 

        // Mostrar resumo
        System.out.println("\nResumo dos personagens:");
        for (int i = 0; i < personagens.nome.length; i++) {
            System.out.println("Personagem " + (i + 1) + ": " + personagens.nome[i]
                    + " - Classe: " + personagens.classe[i]
                    + " - Habilidade: " + personagens.habilidade[i]
                    + " - Vida: " + personagens.vida[i]
                    + " - Mana: " + personagens.mana[i]);
        }

        scanner.close(); // boa prática: fechar o scanner ao final
    }
}
