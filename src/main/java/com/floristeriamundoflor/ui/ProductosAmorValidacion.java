package com.floristeriamundoflor.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosAmorValidacion {

    public static final Target NOMBRE = Target.the("Nombre del producto selccionado")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product/mdf-0001/'])[7]"));
}
