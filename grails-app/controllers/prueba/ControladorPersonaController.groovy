package prueba

class ControladorPersonaController {
    def personaService

    def index() {
        personaService.ingresarPersona(params)
        return "Se han guardado los datos "
        //render params
    }
    def personaLeer(){
        render "El dato recibido es : " + personaService.leerPersona().Nombre + "Edad: " + personaService.leerPersona().Edad
    }
    def personaBorrar(){
        render personaService.eliminarPersona()
    }
    def personaActualizar(){
        render personaService.actualizarPersona()
    }
}
