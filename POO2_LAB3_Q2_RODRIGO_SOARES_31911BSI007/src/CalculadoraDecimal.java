public class CalculadoraDecimal {

    public String somar(String a, String b) {
        float res = Integer.parseInt(a) + Integer.parseInt(b);
        return "O resultado da adição decimal ("+a+" + "+b+") é: "+ res+".";
    }

    public String subtrair(String a, String b) {
        float res = Integer.parseInt(a) - Integer.parseInt(b);
        return "O resultado da subtração decimal ("+a+" - "+b+") é: "+ res+".";
    }

    public String multiplicar(String a, String b) {
        float res = Integer.parseInt(a) * Integer.parseInt(b);
        return "O resultado da multiplicação decimal ("+a+" * "+b+") é: "+ res+".";
    }
}
