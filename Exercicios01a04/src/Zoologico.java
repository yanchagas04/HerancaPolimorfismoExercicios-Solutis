import java.util.random.RandomGenerator;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        this.jaulas = new Animal[10];
    }
    
    public Animal[] getJaulas() {
        return jaulas;
    }
    
    public void setJaulas(Animal[] jaulas) {
        this.jaulas = jaulas;
    }

    public void adicionarAnimal(Animal animal, int numJaula) {
        if (numJaula < 0 || numJaula >= this.jaulas.length){
            System.out.println("Jaula inválida");
            return;
        }
        this.jaulas[numJaula] = animal;
    }
    
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        for (int i = 0; i < 10; i++) {
            RandomGenerator random = RandomGenerator.getDefault();
            int tipoAnimal = random.nextInt(3);
            int idade = random.nextInt(10);
            if (tipoAnimal == 0) {
                zoologico.adicionarAnimal(new Cachorro("Cachorro " + (i + 1), idade), i);
            } else if (tipoAnimal == 1) {
                zoologico.adicionarAnimal(new Cavalo("Cavalo " + (i + 1), idade), i);
            } else if (tipoAnimal == 2) {
                zoologico.adicionarAnimal(new Preguica("Preguica " + (i + 1), idade), i);
            }   
        }

        for (int i = 0; i < 10; i++) {
            Animal animal = zoologico.getJaulas()[i];
            System.out.println("Jaula " + (i + 1) + ":");
            animal.emitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            }
            if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            }
            System.out.println();
        }
    }
}
