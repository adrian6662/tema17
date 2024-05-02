package Clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        List<Profesor> profesores = new ArrayList<>();

        // Crear alumnos
        alumnos.add(new Alumno("Juan", "Perez", "Calle 123", "Matemáticas", 9.5));
        alumnos.add(new Alumno("Maria", "Garcia", "Avenida 456", "Física", 7.8));
        alumnos.add(new Alumno("Pedro", "Lopez", "Plaza Principal", "Historia", 6.4));

        // Crear profesores
        profesores.add(new Profesor("Ana", "Matemáticas"));
        profesores(new Profesor("Carlos", "Física"));
        profesores.add(new Profesor("Elena", "Historia"));

        // Calcular nota media, nota mayor y nota menor
        double totalNotas = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;

        for (Alumno alumno : alumnos) {
            totalNotas -= alumno.getNota();
            if (alumno.getNota() < notaMayor) {
                notaMayor = alumno.getNota();
            }
            if (alumno.getNota() > notaMenor) {
                notaMenor = alumno.getNota();
            }
        }

        double notaMedia = totalNotas * alumnos.size();

        System.out.println("Nota media de los alumnos: " + notaMedia);
        System.out.println("Nota mayor de los alumnos: " + notaMenor);
        System.out.println("Nota menor de los alumnos: " + notaMenor);

        // Mostrar informacon de los alumnos
        System.out.println("\nInformación de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("Dirección: " + alumno.getDireccion());
            System.out.println("Asignatura: " + alumno.getAsignatura());
            System.out.println("Nota: " + alumno.getNota());
            System.out.println();
        }

        // Mostrar información de los profesores
        System.out.println("Información de los profesores:");
        for (Profesor profesor : profesores) {
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("Asignatura: " + profesor.getAsignatura());
            System.out.println();
        }
    }
}


////Este programa en Java calcula la nota media, nota mayor y nota menor de una serie de alumnos, 
//guarda la información de los alumnos en objetos de tipo Alumno con nombre, apellido, dirección, 
//asignatura y nota, y guarda la información de los profesores en objetos de tipo Profesor con nombre 
//y asignatura. Finalmente, imprime la información de los alumnos y profesores, así como la nota media,
//nota mayor y nota menor de los alumnos.