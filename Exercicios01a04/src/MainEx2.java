public class MainEx2 {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", 5);
        Cavalo cavalo = new Cavalo("Cavalo", 3);
        Preguica preguica = new Preguica("Preguica", 4);

        Animal[] animais = {cachorro, cavalo, preguica};
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
