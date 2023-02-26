package com.snider.demofabricaabstracta;

import com.snider.implementaciondefabricaabstracta.FabricaArtificial;
import com.snider.patronfabricaabstracta.IFabricaAbstracta;
import com.snider.patronfabricaabstracta.IProductoLeche;
import com.snider.patronfabricaabstracta.IProductoSaborizante;

public class DemoFabricaAbstracta {
    public static void main(String[] args) {
        System.out.println("----Fabrica Artificial----");
        IFabricaAbstracta miFrabrica = new FabricaArtificial();
        miFrabrica.crearProductos();

        IProductoLeche miLeche = miFrabrica.getProductoLeche();
        IProductoSaborizante miSabor = miFrabrica.getProductoSabor();

		miLeche.producir();
		miSabor.gets();

		

    }
}
