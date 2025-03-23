public interface Calculadora {
    String somar(String a, String b);

    String subtrair(String a, String b);

    String multiplicar(String a, String b);
    // foi adicionado mais um método na interface para ser usado na calculadora decimal.
    // já na calculadora decimal que já "está implementada", esse método não existirá.
}
