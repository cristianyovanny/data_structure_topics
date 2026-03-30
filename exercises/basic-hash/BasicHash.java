public class HashBasico {
    static int funcHash(String key, int m) {
        return key.hashCode() % m;
    }

    public static void main(String[] args) throws Exception {

        String[] names = {
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
        }
    }
}