public class Main {
    public static void main(String[] args) {
       unicodeIndex();
    }
    private static void unicodeIndex() {
        String testo = "abcdef";
        int indice = testo.codePointAt(2);
        StringBuilder risultato = new StringBuilder("Carattere unicode numero 2 è: ");
        System.out.println(risultato.append((indice)));
    }
}