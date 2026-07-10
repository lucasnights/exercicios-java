package desafio1;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome:" +nome);
        System.out.println("Aldeia:" +aldeia);
        System.out.println("Idade:" +idade);
    }
    public void mostrarNomes(){
        System.out.println("Nome:" + nome);
    }
}
