public class Main {
    public static void main(String[] args) {
        CalculadoraDecimal calc1 = new CalculadoraDecimal();
        Calculadora calcUniversal = new AdaptadorCalculadoraDecimal(calc1);
        System.out.println(calcUniversal.somar("10", "15"));
        System.out.println(calcUniversal.subtrair("10", "15"));
        System.out.println(calcUniversal.multiplicar("10", "15"));

        System.out.println("");

        CalculadoraBinario calc2 = new CalculadoraBinario();
        Calculadora calcUniversal2 = new AdaptadorCalculadoraBinario(calc2);
        System.out.println(calcUniversal2.somar("10", "20"));
        System.out.println(calcUniversal2.subtrair("8", "4"));
        System.out.println(calcUniversal2.multiplicar("10", "10"));
    }
}
