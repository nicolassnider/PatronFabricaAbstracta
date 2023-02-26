package com.snider.patronfabricaabstracta;
/* Metodos fábrica, se implementarán en las fábricas concretas */
public interface IFabricaAbstracta {
	void crearProductos();
	IProductoLeche getProductoLeche();
	IProductoSaborizante getProductoSabor();
}
