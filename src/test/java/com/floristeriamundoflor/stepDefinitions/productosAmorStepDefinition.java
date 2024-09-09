package com.floristeriamundoflor.stepDefinitions;
import com.floristeriamundoflor.questions.ValidacionAmor;
import com.floristeriamundoflor.task.productosAmorTASK;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class productosAmorStepDefinition
{
    @Before
    public void setStage()
    {
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario ingresa a la pagina y da click en la categoria amor")
    public void queElUsuarioIngresaALaPaginaYDaClickEnLaCategoriaAmor()
    {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @Cuando("el usuario seleccione dos productos")
    public void elUsuarioSeleccioneDosProductos()
    {
        theActorInTheSpotlight().attemptsTo(

                productosAmorTASK.productosAmor()
        );
    }
    @Entonces("los podra visualizar en el carro de compras")
    public void losPodraVisualizarEnElCarroDeCompras()
    {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionAmor.Validacion(), Matchers.equalTo(true)
                )

        );
    }
}
