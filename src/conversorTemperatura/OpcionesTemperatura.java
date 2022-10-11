package conversorTemperatura;

import javax.swing.*;



public class OpcionesTemperatura {
	
	ConvertirTemperatura temperaturas = new ConvertirTemperatura();
	
	public void convertirTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elegí la temperatura a la que querés convertir tu valor", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"}, "Selección")).toString();
		switch (opcion){
		case "De Celsius a Fahrenheit": {
			temperaturas.convertirCelsiusAFahrenheit(valor);
			break;
		}
		case "De Fahrenheit a Celsius": {
			temperaturas.convertirFahrenheitACelsius(valor);
			break;
		}
		}
	}

}
