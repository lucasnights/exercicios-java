package desafio2;

public class NinjaBasico implements Ninja{
    String nome;
    String aldeia;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, String aldeia, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade especial: " + habilidade);
        System.out.println("Tipo da habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Essa é minha habilidade ninja!: " + habilidade);
    }
}
