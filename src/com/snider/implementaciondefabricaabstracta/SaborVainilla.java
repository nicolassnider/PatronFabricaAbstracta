package com.snider.implementaciondefabricaabstracta;

import com.snider.patronfabricaabstracta.IProductoSaborizante;

public class SaborVainilla implements IProductoSaborizante {

	@Override
	public void gets() {
		System.out.println("Se está procesando el sabor vainilla Natural");
	}

	@Override
	public String informacion() {
		return "Sabor vainilla Natural";
	}

}
