package conversorMonedas;

import javax.swing.*;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elegí la moneda a la que querés convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De pesos a Dolar", "De pesos a Euro", "De pesos a Real"}, "Selección")).toString();
		switch (opcion){
		case "De pesos a Dolar": {
			monedas.ConvertirPesosArgentinosADolares(valor);
			break;
		}
		case "De pesos a Euro": {
			monedas.ConvertirPesosArgentinosAEuros(valor);
			break;
		}
		case "De pesos a Real": {
			monedas.ConvertirPesosArgentinosAReales(valor);
			break;
		}
		}
	}
 

	
}
