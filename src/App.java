
import Controllers.PersonaController;
import Controllers.Views.ViewConsole;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",20),
            new Persona("Luis",35),
            new Persona("Sofia",27),
            new Persona("Miguel",40),
            new Persona("Laura",32),
            new Persona("Pedro",29),
            new Persona("Elena",26)
        };
        ViewConsole vista = new ViewConsole();
        PersonaController manejoPersona = new PersonaController();

        vista.printMessage("*** Personas");
        vista.printPersonaArray(personas);
        
        manejoPersona.ordenarPorEdad(personas);
        vista.printMessage("\n*** Personas Ordenadas por Edad");
        vista.printPersonaArray(personas);

        Persona personaEncontrada = manejoPersona.buscarPorEdad(personas, 40);
        vista.printMessage("***Buscar persona con edad 40");
        if(personaEncontrada==null){
            vista.printMessage("No hay Personas con esa Edad");
        }else{
            vista.printMessage("La persona con la edad "+40+" es: ");
            vista.printMessage(personaEncontrada.toString());
        }

        Persona personaEncontrada2 = manejoPersona.buscarPorEdad(personas, 99);
        vista.printMessage("***Buscar persona con edad 99");
        if(personaEncontrada2==null){
            vista.printMessage("No hay Personas con esa Edad");
        }else{
            vista.printMessage("La persona con la edad "+99+" es: ");
            vista.printMessage(personaEncontrada2.toString());
        }
        


        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
