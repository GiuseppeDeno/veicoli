public class UsoMacchina {

    public static void main(String[] args) {
        // Creazione di un oggetto macchina
        macchina m1 = new macchina("aa", "bb", 123);
        
        // Chiamata al metodo addFeatures con due parametri
        m1.addFeatures("aa", "bb");
        
        // Chiamata al metodo addFeature con un solo parametro (colore)
        m1.addFeature("cc");
    }
}