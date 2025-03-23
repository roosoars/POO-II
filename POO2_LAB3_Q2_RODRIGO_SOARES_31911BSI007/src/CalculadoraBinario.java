public class CalculadoraBinario {

    public String somar(String a, String b) {
        int res = Integer.parseInt(a) + Integer.parseInt(b);
        return "O resultado da adição de binários ("+a+" + "+b+") é: "+ Integer.toBinaryString(res)+".";
    }

    public String subtrair(String a, String b) {
        int res = Integer.parseInt(a) - Integer.parseInt(b);
        return "O resultado da subtração de binários ("+a+" - "+b+") é: "+ Integer.toBinaryString(res)+".";
    }
}
