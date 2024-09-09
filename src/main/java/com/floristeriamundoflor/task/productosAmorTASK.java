package com.floristeriamundoflor.task;

import com.floristeriamundoflor.ui.productosAmorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class productosAmorTASK implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(productosAmorUI.BOTON_AMOR),
                Click.on(productosAmorUI.PRODUCTO1),
                Click.on(productosAmorUI.AGREGARCARRO),
                Click.on(productosAmorUI.PRODUCTO2),
                Click.on(productosAmorUI.BOTON_CARRO)
        );
    }
    public static Performable productosAmor() {return instrumented(productosAmorTASK.class);}
}

