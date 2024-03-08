public class Ex_5 {
    
    static String inverterString(String string) {

        String stringInvertida = "";

		for (int i = string.length() - 1; i >= 0; i--) {

			stringInvertida = 
                stringInvertida + string.charAt(i);
		}

		return stringInvertida;
	}

    public static void main(String[] args) {

		System.out.println(
            inverterString("A B C"));

    }
}

/*

5) Escreva um programa que inverta os caracteres de um string.


IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

*/