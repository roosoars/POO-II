public class AdaptadorCalculadoraDecimal implements Calculadora {
    private final CalculadoraDecimal calculadoraDecimal;

    public AdaptadorCalculadoraDecimal(CalculadoraDecimal calculadoraDecimal) {
        this.calculadoraDecimal = calculadoraDecimal;
    }

    @Override
    public String somar(String a, String b) {
        return calculadoraDecimal.somar(a, b);
    }

    @Override
    public String subtrair(String a, String b) {
        return calculadoraDecimal.subtrair(a, b);
    }

    @Override
    public String multiplicar(String a, String b) {
        return calculadoraDecimal.multiplicar(a, b);
    }
}

