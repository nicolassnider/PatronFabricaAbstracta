package com.snider.implementaciondefabricaabstracta;

import com.snider.patronfabricaabstracta.IProductoLeche;

public class LecheCoco implements IProductoLeche {

	@Override
	public void producir() {
		System.out.println("Producir leche de coco Natural");
		
	}

	@Override
	public String getDatos() {
		return "Leche de coco Natural";
	}
	
}
