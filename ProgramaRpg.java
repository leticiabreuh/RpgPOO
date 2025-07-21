public class ProgramaRPG {
    
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem();
        Personagem mago = new Personagem();

        guerreiro.name   = "Thor";
        guerreiro.classe = "Guerreiro";
        guerreiro.nivel = 1;
        guerreiro.vida = 100;
        guerreiro.atacar();
        guerreiro.receberDano(15);
        guerreiro.usarHabilidadeEspecial();
        guerreiro.subirNivel();
        guerreiro.mostrarStatus();
        guerreiro.desenharPersonagem();

        System.out.println();

        mago.name = "Merlin";
        mago.classe = "Mago";
        mago.nivel = 1;
        mago.vida = 100;
        mago.atacar();
        mago.receberDano(25);
        mago.usarHabilidadeEspecial();
        mago.subirNivel();
        mago.mostrarStatus();
        mago.desenharPersonagem();
    
    }
}
