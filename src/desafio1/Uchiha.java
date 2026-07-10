package desafio1;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public Uchiha() {
    }

    public Uchiha(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public Uchiha(String nome, String aldeia, int idade, String habilidadeEspecial) {
        super(nome, aldeia, idade);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade uchiha:" + habilidadeEspecial);
    }

    @Override
    public void mostrarNomes() {
        super.mostrarNomes();
    }
}
