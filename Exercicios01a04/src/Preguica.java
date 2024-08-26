public class Preguica extends Animal{

    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    public void subirEmArvores(){
        System.out.println("Preguiça subindo em arvores!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Que preguiça!");
    }

    
}