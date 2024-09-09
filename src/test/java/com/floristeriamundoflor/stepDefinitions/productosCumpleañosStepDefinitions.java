package com.floristeriamundoflor.stepDefinitions;
import com.floristeriamundoflor.questions.ValidacionAmor;
import com.floristeriamundoflor.questions.ValidacionCumpleaños;
import com.floristeriamundoflor.task.ProductosCumpleañosTASK;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class productosCumpleañosStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la pagina y da click en la categoria cumpleaños")
    public void queElUsuarioIngresaALaPaginaYDaClickEnLaCategoriaCumpleaños() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @Cuando("el usuario seleccione un producto")
    public void elUsuarioSeleccioneUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                ProductosCumpleañosTASK.productosCumpleaños()

        );
    }
    @Entonces("los podra visualizar en el carro de compras y lo podra eliminar")
    public void losPodraVisualizarEnElCarroDeComprasYLoPodraEliminar() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionCumpleaños.Validacion(), Matchers.equalTo(true)
                )

        );
    }


}
