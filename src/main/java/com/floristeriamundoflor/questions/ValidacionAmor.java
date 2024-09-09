package com.floristeriamundoflor.questions;

import com.floristeriamundoflor.ui.ProductosAmorValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionAmor implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductosAmorValidacion.NOMBRE.resolveFor(actor).isVisible();
    }

    public static Question Validacion(){
        return new ValidacionAmor();

}}
