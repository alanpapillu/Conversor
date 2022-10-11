package conversorTemperatura;

import javax.swing.*;

public class ConvertirTemperatura {

	public void convertirCelsiusAFahrenheit(double valor) {
		double valorFahrenheit = ((valor * 9) / 5) + 32;
		//valorFahrenheit = (double) Math.round(valorFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La temperatura es " + valorFahrenheit + " fahrenheit.");
	}
	
	public void convertirFahrenheitACelsius(double valor) {
		double valorCelsius = ((valor - 32) * 5) / 9;
		//valorFahrenheit = (double) Math.round(valorFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La temperatura es " + valorCelsius + " fahrenheit.");
	}
	
}
