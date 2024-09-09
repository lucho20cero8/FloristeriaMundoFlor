package com.floristeriamundoflor.task;

import com.floristeriamundoflor.ui.ProductosCumpleaños;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductosCumpleañosTASK implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosCumpleaños.BOTON_CUMPLEAÑOS),
                Click.on(ProductosCumpleaños.PRODUCTO1),
                Click.on(ProductosCumpleaños.AGREGARCARRO),
                Click.on(ProductosCumpleaños.BORRARPRODUCTO)

        );
    }

    public static Performable productosCumpleaños() {return instrumented(ProductosCumpleañosTASK.class);}
}
