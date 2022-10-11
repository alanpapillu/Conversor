package conversorMonedas;

import javax.swing.*;

public class ConvertirMonedas {
	
	public void ConvertirPesosArgentinosADolares(double valor) {
		double monedaDolar = valor / 277.00;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar+ " dolares");
	}
	
	public void ConvertirPesosArgentinosAEuros(double valor) {
		double monedaEuro = valor / 298.00;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro+ " euros");
	}

	public void ConvertirPesosArgentinosAReales(double valor) {
		double monedaReal = valor / 60.00;
		monedaReal = (double) Math.round(monedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaReal+ " reales");
	}
}
