package Person.johan.molina;

import Person.johan.molina.Persona;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        /*
        Pide por teclado el nombre, la edad, sexo, peso y altura.
        Crea 3 objetos de la clase anterior, el primer objeto obtendrá
        las anteriores variables pedidas por teclado, el segundo objeto
        obtendrá todos los anteriores menos el peso y la altura y el último
        por defecto, para este último utiliza los métodos set para darle a los atributos
        un valor.oPara cada objeto, deberá comprobar si estáen su peso ideal, tiene sobrepeso
        o por debajo de su peso ideal con un mensaje.oIndicar para cada objeto si es mayor de edad.
        Por último, mostrar la información de cada objeto.
         */

        ingresarDatosPersona1();
        persona2();
        persona3();


    }

    private static void persona3() {
        Persona people;
        people= new Persona();
        people.setNombre("Andrea");
        people.setEdad(20);
        people.setSexo('M');
        people.setAltura(1.60);
        people.setPeso(80);
        mensaje("Persona #3 = "+people.toString());
        people.indiceMsCorporal();
    }


    private static void persona2() {
        Persona person;
        person = new Persona();
        person.setEdad(23);
        mensaje("Persona # 2 = "+ person.toString());
        person.indiceMsCorporal();
    }

    private static void ingresarDatosPersona1() {
        Persona p;
        Scanner scanner= new Scanner(System.in);
        p = new Persona();

        mensaje("Ingrese su Nombre");
        p.setNombre(scanner.next());
        mensaje("Ingrese su Genero use M para mujer y H para hombre");
        p.setSexo(scanner.next().charAt(0));
        mensaje("Ingrese su edad");
        p.setEdad(scanner.nextInt());
        mensaje("Ingrese su altura en metros, separando los centímetros por una coma ej: 1.63");
        p.setAltura(scanner.nextDouble());
        mensaje("Ingrese su peso en Kilogramos");
        p.setPeso(scanner.nextDouble());
        p.comprobarSexo(p.getSexo());
        p.esMayordeEdad(p.getEdad());
        mensaje("Persona # 1 = "+ p.toString());
        mensaje("IMC Persona 1 = "+p.indiceMsCorporal());
    }

    private static void mensaje(String s) {
        System.out.println(s);
    }


}
