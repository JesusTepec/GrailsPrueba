package prueba

class ControladorPersonaController {
    def personaService

    def index() {
        //return "Se han guardado los datos "
        //render params
        render personaService.ingresarPersona(params)
    }
    def personaIngresar(){
       render personaService.ingresarPersona(params)


    }
    def personaLeer(){
        //render "El dato recibido es : " + personaService.leerPersona().Nombre + "Edad: " + personaService.leerPersona().Edad
        def dato =[:]
        dato = personaService.leerPersona()
        System.out.println(dato)
        render view: 'Ingresar', model: [dato:dato]
    }
    def personaBorrar(){
        render personaService.eliminarPersona()
    }
    def personaActualizar(){
        render personaService.actualizarPersona()
    }
}
