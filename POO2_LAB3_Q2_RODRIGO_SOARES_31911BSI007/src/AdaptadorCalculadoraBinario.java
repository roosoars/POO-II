public class AdaptadorCalculadoraBinario implements Calculadora {
    private final CalculadoraBinario calculadoraBinario;

    public AdaptadorCalculadoraBinario(CalculadoraBinario calculadoraBinario) {
        this.calculadoraBinario = calculadoraBinario;
    }
    @Override
    public String somar(String a, String b) {
        return calculadoraBinario.somar(a, b);
    }
    @Override
    public String subtrair(String a, String b) {
        return calculadoraBinario.subtrair(a, b);
    }

    @Override
    public String multiplicar(String a, String b) {
        return ("Essa operação (multiplicação de binários) não foi definida.");
    }
}
