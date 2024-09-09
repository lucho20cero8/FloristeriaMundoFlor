package com.floristeriamundoflor.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class productosAmorUI
{
    public static final Target BOTON_AMOR = Target.the("Boton Categoria Amor")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/amor/'])[4]"));
    /**public static final target boton_amor = target.the("boton categoria amor")
            .located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/nav/div/ul/li[3]/a"));
**/

    public static final Target PRODUCTO1 = Target.the("")
            .located(By.xpath("//a[@title='MDF 0001']"));


    public static final Target AGREGARCARRO = Target.the("")
            .located(By.xpath("//button[@name='add-to-cart']"));


    public static final Target PRODUCTO2 = Target.the("")
            .located(By.xpath("//a[@title='MDF 00010']"));

    public static final Target BOTON_CARRO = Target.the("")
            .located(By.xpath("//span[@class='sub-title']"));
}
