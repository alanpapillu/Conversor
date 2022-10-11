package principal;

import javax.swing.*;

import conversorMonedas.OpcionesConversion;
import conversorTemperatura.OpcionesTemperatura;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesTemperatura conversionTemperatura = new OpcionesTemperatura();

		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión","Menú", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Conversor de monedas", "Conversor de temperatura"}, "Elegir").toString();
			
			switch(opciones) {
			case "Conversor de monedas":{
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "Querés realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
					} else {
						JOptionPane.showMessageDialog(null, "Conversión finalizada");
						System.exit(respuesta);
					} 
					}
			case "Conversor de temperatura":{
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversionTemperatura.convertirTemperatura(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "Querés realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
					} else {
						JOptionPane.showMessageDialog(null, "Conversión finalizada");
						System.exit(respuesta);
					} 
					}

				} 
				
			}
		}
		
	}

