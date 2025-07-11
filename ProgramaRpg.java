import java.util.Scanner;

public class ProgramaRpg{
    public static void main(String[] args){
        
         Scanner scanner = new Scanner(System.in);

            Rpg personagem = new Rpg(); 
           //Escolhendo o nome do personagem
            System.out.println(personagem.nome());

            //Status
            System.out.println(personagem.status());

       
    }
}