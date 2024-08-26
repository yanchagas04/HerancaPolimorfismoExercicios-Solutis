public class MainEx3 {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", 5);
        Cavalo cavalo = new Cavalo("Cavalo", 3);
        Preguica preguica = new Preguica("Preguica", 4);
        Veterinario vet = new Veterinario("Vet", 30);
        
        vet.examinar(cavalo);
        vet.examinar(preguica);
        vet.examinar(cachorro);
    }
}
