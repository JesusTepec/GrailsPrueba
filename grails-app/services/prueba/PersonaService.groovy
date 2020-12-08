package prueba

import grails.transaction.Transactional
import org.hibernate.loader.custom.Return

@Transactional
class PersonaService {

    def serviceMethod() {

    }
    def mensajePrueba(){
        def mensaje = "Hola mundo"
        return mensaje

    }
    def ingresarPersona (){
        def p = new Persona(Nombre: "Alfredo", Edad: 35, Sexo:"Masculino", Ciudad: "Acapulco", Estado: "Guerrero",FechaDeNacimiento: new Date(), Telefono: "7471525118")
        if(p.save()) {
            return "Se guado el dato"
        }else{
            return "Hay un error al guardar"
        }

    }
    def leerPersona(){
        def p = Persona.get(9)
        return p

    }
    def actualizarPersona(){
        def p = Persona.get(9)
        p.Nombre= "Mateo"
        p.Edad = 9
        p.save()
        return "Se ha actualizado tu informacion"
    }
    def eliminarPersona(){

        def p = Persona.get(10)
        p.delete()
        return "Se ha borrado la persona"
    }
    def eliminarPersonaForId(Integer Id){
        def p = Persona.get(Id)
        p.delete()
        return "se ha borrado la persona: " + p.Nombre
    }
    def actualizarPersonaForId(Integer Id){
        def p = Persona.get(Id)
        p.Nombre = "Rocío"
        p.save()
        return "Se han realizado los cambios"
            }
    }

