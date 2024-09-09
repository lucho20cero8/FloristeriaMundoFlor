package com.floristeriamundoflor.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosCumpleañosVal {

    public static final Target NOMBRE = Target.the("")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product/mdf-0001/'])[7]"));
}
