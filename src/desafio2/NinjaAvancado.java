package desafio2;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, String aldeia, int idade, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, aldeia, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Essa é minha especialidade ninja: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
    }

}
