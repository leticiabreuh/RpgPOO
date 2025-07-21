public class Rpg{

   public String name;
   public String classe;
   public int nivel;
   public int vida;
   public int mana;
   public int forca;
   public int personagemAscii;

    public void atacar() {
        switch (classe.toLowerCase()) {
            case "mago":
                System.out.println(name + " lança uma bola de fogo! Causando " + forca + " de dano.");
                break;
            case "guerreiro":
                System.out.println(name + " ataca com sua espada! Causando " + forca + " de dano.");
                break;
            case "arqueiro":
                System.out.println(name + " dispara uma flecha! Causando " + forca + " de dano.");
                break;
        }
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(name + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }

    public void usarHabilidadeEspecial() {
        switch (classe.toLowerCase()) {
            case "mago":
                if (mana >= 20) {
                    mana -= 20;
                    System.out.println(name + " usou Feitiço Supremo! Mana restante: " + mana);
                } else {
                    System.out.println(name + " não tem mana suficiente!");
                }
                break;
            case "guerreiro":
                System.out.println(name + " usou Golpe Poderoso! Força aumentada temporariamente.");
                forca += 3;
                break;
            case "arqueiro":
                System.out.println(name + " usou Tiro Triplo! Três flechas disparadas.");
                break;
        }
    }

    public void mostrarStatus() {
        System.out.println("Status:");
        System.out.println("Nome: " + name + " | Classe: " + classe + " | Nível: " + nivel +
                " | Vida: " + vida + " | Força: " + forca +
                (classe.equalsIgnoreCase("Mago") ? " | Mana: " + mana : ""));
    }

    public void subirNivel() {
        nivel++;
        vida = Math.min(vida + 10, 100);
        forca += 1;
        if (classe.equalsIgnoreCase("Mago")) {
            mana = Math.min(mana + 10, 100);
        }
        System.out.println(name + " subiu de nível! Agora está no nível " + nivel);
    }

    public void desenharPersonagem() {
        System.out.println("Desenho do Personagem:");

        switch (classe.toLowerCase()) {
            case "mago":
                System.out.println("   /////   ");
                System.out.println("  | o o |  ");
                System.out.println(" (|  ^  |) ");
                System.out.println("  | [_] |  ");
                System.out.println("   /M\\   ");
                break;
            case "guerreiro":
                System.out.println("   /////   ");
                System.out.println("  | > < |  ");
                System.out.println(" (|  -  |) ");
                System.out.println("  | |_| |  ");
                System.out.println("   /G\\    ");
                break;
            case "arqueiro":
                System.out.println("   /////   ");
                System.out.println("  | o o |  ");
                System.out.println(" (|  v  |) ");
                System.out.println("  | [_] |  ");
                System.out.println("   /A\\    ");
                break;
            case "morto":
                System.out.println("   _____   ");
                System.out.println("  | x x |  ");
                System.out.println(" (|  ^  |) ");
                System.out.println("  | ::: |  ");
                System.out.println("   \\___/  ");
                break;    
            default:
                System.out.println("Desenho indisponível para essa classe.");
        }
    }
}
