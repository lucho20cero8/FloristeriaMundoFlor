package com.floristeriamundoflor.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosCumpleaños {

    public static final Target BOTON_CUMPLEAÑOS = Target.the("")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/cumpleanos/'])[4]"));

    public static final Target PRODUCTO1 = Target.the("")
            .located(By.xpath("//a[@title='MDF 0001']"));

    public static final Target AGREGARCARRO  = Target.the("")
            .located(By.xpath("//button[@name='add-to-cart']"));

    public static final Target BORRARPRODUCTO = Target.the("")
            .located(By.xpath("(//a[@class='remove'])[3]"));
}
