package br.com.execicio_30set_2;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Natacha", 4, "Virarata"),
                new Gato("Mimi", 3, true),
                new Passaro("Piu", 2, 15.5),
                new Pato("Daque", 1, 98)
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo em ação
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMACOES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();

            // Downcasting seguro
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
            }
            System.out.println("---");
        }
    }
}
