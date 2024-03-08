public class Ex_1 {

    private static final int VALOR_INDICE = 13;
    private static final int VALOR_SOMA = 0;
    private static final int VALOR_INICIAL = 0;

    public static void main(String[] args) {

        int indice = VALOR_INDICE;
        int soma = VALOR_SOMA;
        int inicio = VALOR_INICIAL;
        
        while (inicio < indice) {
            inicio = inicio + 1;

            soma = soma + inicio;    
        }

        System.out.println(soma);

    }
}

/*

1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?

R: 91

*/