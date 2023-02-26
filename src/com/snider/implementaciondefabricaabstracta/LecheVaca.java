package com.snider.implementaciondefabricaabstracta;

import com.snider.patronfabricaabstracta.IProductoLeche;

public class LecheVaca implements IProductoLeche{

	@Override
	public void producir() {
		System.out.println("Producir leche de vaca");
		
	}

	@Override
	public String getDatos() {
		return "Leche de vaca";
	}
	
}
