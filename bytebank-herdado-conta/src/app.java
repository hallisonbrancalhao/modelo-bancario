
public class app {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(15564, 65444);
		SeguroDeVida seguro = new SeguroDeVida();
		
		cc.deposita(100.0);
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println("Total de imposto " + calc.getTotalImposto() );

	}

}
