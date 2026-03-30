public class ManualHash {

    static int ManualHash(String key, int m) {
        int hash=0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            hash = 31 * hash + c;
        }

        return Math.abs(hash) % m;
    }

    public static void main(String[] args) throws Exception {

        String[] nombres = {
            "Ana", "Luis", "Carlos", "María", "Juan", "Pedro", "Lucía", "Sofía", "Miguel", "Laura",
            "Diego", "Valentina", "Andrés", "Camila", "Jorge", "Daniela", "Fernando", "Paula", "Ricardo", "Elena",
            "Gabriel", "Sara", "Hugo", "Natalia", "Iván", "Claudia", "Manuel", "Patricia", "Alberto", "Verónica",
            "Raúl", "Adriana", "Eduardo", "Mónica", "Santiago", "Liliana", "Roberto", "Diana", "Sebastián", "Carolina",
            "Tomás", "Alejandra", "Emilio", "Beatriz", "Álvaro", "Rosa", "Pablo", "Gloria", "Esteban", "Carmen",
            "Oscar", "Isabel", "Javier", "Silvia", "Mauricio", "Teresa", "Nicolás", "Andrea", "Felipe", "Luisa",
            "Renato", "Marcela", "Simón", "Tatiana", "Bruno", "Angela", "David", "Lorena", "Cristian", "Inés",
            "Ernesto", "Noelia", "Fabián", "Rocío", "Guillermo", "Eva", "Hernán", "Julia", "Ignacio", "Alicia",
            "Kevin", "Daniel", "Melissa", "Samuel", "Paola", "Axel", "Karla", "Joel", "Cecilia", "Elias",
            "Bianca", "Marcos", "Yesenia", "Adolfo", "Pilar", "Orlando", "Yolanda", "Ramón", "Susana", "Vicente"
        };

        int m = names.length;

        for(String name : names) {
            int index = funcHash(names, m);
            System.out.println(names + " -> Índice: " + index);
        }   System.out.println(nombre + " -> Indice: " + indice);
    }
}