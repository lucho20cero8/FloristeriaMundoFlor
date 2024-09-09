package com.floristeriamundoflor.questions;

import com.floristeriamundoflor.ui.ProductosCumpleañosVal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCumpleaños implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ProductosCumpleañosVal.NOMBRE.resolveFor(actor).isVisible();
    }
    public static Question Validacion(){
        return new ValidacionCumpleaños();
    }
}
