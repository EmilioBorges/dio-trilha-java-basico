public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    System.out.println(nomeCompleto);

    String concatenacao = "?";

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    //operador ternario

    int a = 5;
    int b = 6;

    String resultado = a>b ? "verdadeiro": "falso"; 
    System.out.println(resultado);

    //operadores relacionais

    // == verificar a igualdade entre dois valores
    // > verificar se o valor e da primeira variavel e maior que a segunda

    
  }
}
