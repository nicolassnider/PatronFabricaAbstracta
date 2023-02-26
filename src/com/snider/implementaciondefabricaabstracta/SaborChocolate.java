package com.snider.implementaciondefabricaabstracta;

import com.snider.patronfabricaabstracta.IProductoSaborizante;

public class SaborChocolate implements IProductoSaborizante {

	@Override
	public void gets() {
		System.out.println("Se está procesando el sabor chocolate Artificial");
	}

	@Override
	public String informacion() {
		return "Sabor chocolate Artificial";
	}

}
