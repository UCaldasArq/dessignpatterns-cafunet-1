package edu.ucaldas.creational;

// TODO: Implementa el patrón Factory Method.
// Crea un método createShape(String type) que devuelva:
// "Circle" → new Circle()
// "Square" → new Square()
// Si el tipo no existe, retorna null.

public class ShapeFactory {
    public Shape createShape(String type) {
        // TODO: completa la lógica de creación
        if ("Circle".equals(type)) {
            return new Circle();
        } else if ("Square".equals(type)) {
            return new Square();
        }
        return null;
    }
}

// TODO: Implementa las clases Circle y Square

class Circle implements Shape {
    @Override
    public String draw() {
        return "Dibujando un círculo.";
    }
}

class Square implements Shape {
    @Override
    public String draw() {
        return "Dibujando un cuadrado.";
    }
}