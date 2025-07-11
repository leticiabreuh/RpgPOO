import java.util.Scanner;

public class ProgramaRpg{
    public static void main(String[] args){
        
         Scanner scanner = new Scanner(System.in);

         // Mostrar jogador atual
            if (jogadorAtual == jogador1) {
                System.out.println("\nPersonagem");
            } else {
                System.out.println("\nJogador 2 (o)");
            }

            Rpg personagem = new Rpg(); 

            //Escolha o tipo do personagem
            System.out.println(personagem.classe());

           //Escolhendo o nome do personagem
            System.out.println(personagem.nome());

           
       
    }
}