public class Ex_2 {

    static int numero1 = 1;
    static int numero2 = 0;

    static boolean numeroPresente = false;

    static void fibonacci(int tamanhoFibonacci, int numero){

        for (int i = 0; i < tamanhoFibonacci; i++) 
        {
            numero1 = numero1 + numero2;
            numero2 = numero1 - numero2;

            if(numero == numero1){
                numeroPresente = true;
            }
        }

        if (numeroPresente == true)
        {
            System.out.println(
                "O Número Informado Pertence a Sequência Fibonacci");
        } 
        
        else 
        {
            System.out.println(
                "O Número Informado Não Pertence a Sequência Fibonacci");
        }
        
    }
    
    public static void main(String[] args) {
        
        fibonacci(8, 3);
    }
    
}
/*

2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
pertence ou não a sequência.

IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
*/

