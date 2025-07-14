import java.util.Scanner;

public class Rpg {
    // Atributos
    public String[] nome = new String[2];
    public String[] classe = new String[2];
    public String [] habilidade = new String[2];
    public int nivel;
    public int vida;
    public int mana;
    public int forca;
    public int opcao;

    Scanner scanner = new Scanner(System.in);

    // Métodos

    public String boasvindas() {
        return "BEM VINDO AO JOGO\nVAMOS COMECAR!!\n";
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
                     
                case 2:
                     classe[i] = "Mago";
                     
                case 3:
                     classe[i] = "Arqueiro";
                     
                default :
                 {
                    System.out.println("Opção inválida! Classe padrão: Guerreiro.");
                    classe[i] = "Guerreiro";
                }
            }
        }
    }

    public void atribuindoHabilidades(){
        public int j;
        if(classe[i]=="Guerreiro"){
            habilidade[j]="Golpe"; 
        } else if(classe[i]=="Mago"){
            habilidade[j]="feitico";
        } else if(classe[i]=="Arqueiro"){
             habilidade[j]="flecha";
        }

    }


   
}
