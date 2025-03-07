public class NumeroLetra {

    private static String[] UNIDADES = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    private static String[] DIEZ_A_DIECINUEVE = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
    private static String[] DECENAS = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    private static String[] CENTENAS = {"", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    public static String convertir(int numero) {
        if (numero == 0) return "cero";
        if (numero < 10) return UNIDADES[numero];
        if (numero < 20) return DIEZ_A_DIECINUEVE[numero - 10];
        if (numero < 100) {
            if (numero % 10 == 0) {
                return DECENAS[numero / 10];
            } else {
                return DECENAS[numero / 10] + " y " + UNIDADES[numero % 10];
            }
        }
        if (numero == 100) return "cien";
        if (numero < 1000) {
            if (numero % 100 == 0) {
                return CENTENAS[numero / 100];
            } else {
                return CENTENAS[numero / 100] + " " + convertir(numero % 100);
            }
        }
        // Manejo de miles (1000 - 9999)
        if (numero < 10000) {
            if (numero == 1000) return "mil"; // Caso especial para 1000
            if (numero < 2000) return "mil " + convertir(numero % 1000); // "mil doscientos"
            if (numero % 1000 == 0) {
                return UNIDADES[numero / 1000] + " mil";
            } else {
                return UNIDADES[numero / 1000] + " mil " + convertir(numero % 1000);
            }
        }
        return "Número fuera de rango"; // No soporta números mayores a 9999
    }

    public static void main(String[] args) {
        int numero = 1589; // Cambia el número aquí para probar
        System.out.println(convertir(numero));
    }
}
