
class Animal {
    protected String nome;
    protected String raca;

    public Animal() {
    }
    public Animal(String nome) {
        this.nome = nome;
    }

    public void caminha(String nome) {
        System.out.println(nome + " está caminhando.");
    }
}

class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }


    public void late() {
        System.out.println(nome + " está latindo: Au Au!");
    }
}

class Gato extends Animal {

    // Construtor
    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println(nome + " está miando: Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        System.out.println("Cachorro: " + cachorro.nome);
        cachorro.caminha(cachorro.nome);
        cachorro.late();

        System.out.println();

        Gato gato = new Gato("Mimi");
        System.out.println("Gato: " + gato.nome);
        gato.caminha(gato.nome);
        gato.mia();
    }
}
