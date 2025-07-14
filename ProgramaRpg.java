import java.util.Scanner;

public class ProgramaRpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rpg2 personagens = new Rpg2();

        // Exibir mensagem de boas-vindas
        System.out.println(personagens.boasvindas());

        // Coletar nomes dos personagens
        personagens.nomes(); 

        // Coletar classes dos personagens
        personagens.escolherClasse(); // também não retorna nada
         personagens.atribuindoHabilidades(); 

        // Mostrar resumo
        System.out.println("\nResumo dos personagens:");
        for (int i = 0; i < personagens.nome.length; i++) {
            System.out.println("Personagem " + (i + 1) + ": " + personagens.nome[i]
                    + " - Classe: " + personagens.classe[i]+" - Habilidade: "+personagens.habilidade);
        }
    }
}
