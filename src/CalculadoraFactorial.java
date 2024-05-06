
public class CalculadoraFactorial {

    public long calcularFactorial(int n) {
	if (n < 0) {
	    throw new IllegalArgumentException("El factorial no está definido para números negativos");
	}
	if (n == 0 || n == 1) {
	    return 1;
	}
	long resultado = 1;
	for (int i = n; i >= 1; i--) {
	    resultado *= i;
	}
	return resultado;
    }

    public static void main(String[] args) {
	CalculadoraFactorial calculadora = new CalculadoraFactorial();
	long resultado = calculadora.calcularFactorial(33);
	System.out.println("El factorial de 33 es: " + resultado);
    }

}
