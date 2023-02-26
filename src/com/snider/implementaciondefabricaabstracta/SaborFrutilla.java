package com.snider.implementaciondefabricaabstracta;

import com.snider.patronfabricaabstracta.IProductoSaborizante;

public class SaborFrutilla implements IProductoSaborizante {

	@Override
	public void gets() {
		System.out.println("Se está procesando el sabor frutilla artificial");
	}

	@Override
	public String informacion() {
		return "Sabor frutilla";
	}

}