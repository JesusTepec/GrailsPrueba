package prueba

class ControladorPersonaController {
    def personaService

    def index() {
       render personaService.ingresarPersona()
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
