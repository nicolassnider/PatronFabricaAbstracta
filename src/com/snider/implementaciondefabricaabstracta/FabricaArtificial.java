package com.snider.implementaciondefabricaabstracta;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.snider.patronfabricaabstracta.IFabricaAbstracta;
import com.snider.patronfabricaabstracta.IProductoLeche;
import com.snider.patronfabricaabstracta.IProductoSaborizante;

public class FabricaArtificial implements IFabricaAbstracta {

	private IProductoLeche leche;
	private IProductoSaborizante sabor;

	@Override
	public void crearProductos() {
		// TODO Auto-generated method stub
		String seleccion;
		System.out.println("Creando malteada: "); // Ofrece solamente productos artificiales
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			leche = new LecheVaca();
			leche.getDatos();
			System.out.println("1) Frutilla \n2) Chocolate"); // Ofrece solamente productos artificiales
			seleccion = br.readLine();
			if (seleccion.equals("1")) {
				sabor = new SaborFrutilla();
			} else if (seleccion.equals("2")) {
				sabor = new SaborChocolate();
			}
			sabor.gets();
		} catch (Exception e) {
			System.out.println("Error al leer la entrada");
		}

	}

	@Override
	public IProductoLeche getProductoLeche() {

		return leche;
	}

	@Override
	public IProductoSaborizante getProductoSabor() {
		return sabor;
	}

}