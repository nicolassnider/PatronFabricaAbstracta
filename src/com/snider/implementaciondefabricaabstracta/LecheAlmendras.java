package com.snider.implementaciondefabricaabstracta;

import com.snider.patronfabricaabstracta.IProductoLeche;

public class LecheAlmendras implements IProductoLeche {

	@Override
	public void producir() {
		System.out.println("Producir leche de almendras Natural");
		
	}

	@Override
	public String getDatos() {
		return "Leche de almendras Natural";
	}
	
}
