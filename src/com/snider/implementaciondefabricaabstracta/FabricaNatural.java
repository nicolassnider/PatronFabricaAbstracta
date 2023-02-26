package com.snider.implementaciondefabricaabstracta;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.snider.patronfabricaabstracta.IFabricaAbstracta;
import com.snider.patronfabricaabstracta.IProductoLeche;
import com.snider.patronfabricaabstracta.IProductoSaborizante;

public class FabricaNatural implements IFabricaAbstracta {

	private IProductoLeche leche;
	private IProductoSaborizante sabor;

	@Override
	public void crearProductos() {
		// TODO Auto-generated method stub
		String seleccion;
		System.out.println("Creando malteada: \n1) Almendras \n2) Coco"); // Ofrece solamente productos naturales
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			seleccion = br.readLine();
			if (seleccion.equals("1")) {
				leche = new LecheAlmendras();
			} else if (seleccion.equals("2")) {
				leche = new LecheCoco();
			}
			sabor = new SaborVainilla(); // Solamente vainilla es natural

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