## Comunicación entre objetos

Entrega realizada por Chiara Boccaletti, Patricia Sanz Escurín y Manuel Antón Martínez-Carrasco.

Link al repositorio GitHub: https://github.com/chiarab22/comunicacion_entre_objetos.git

## Ejercicio 1
Este ejercicio consiste en escribir un programa que cree varias ventanas (de tipo JFrame) identificadas por un número en sus barras de título y que «trace» los eventos «presionar» y «soltar» del ratón en cada una de estas ventanas. Indicaremos cada evento mostrando en la salida por la consola de IntelliJ IDEA un mensaje que precise su naturaleza (presionar o soltar), el número de ventana y las coordenadas del puntero del ratón en el momento del evento.

![1](https://www.eni-training.com/download/b592f85c-5fc6-4de6-8799-c12c97540711/images/04RI07V2.png?id%3DAAEAAAD%2F%2F%2F%2F%2FAQAAAAAAAAAMAgAAAE1FbmkuRWRpdGlvbnMuTWVkaWFwbHVzLCBWZXJzaW9uPTEuMC4wLjAsIEN1bHR1cmU9bmV1dHJhbCwgUHVibGljS2V5VG9rZW49bnVsbAUBAAAAJ0VuaS5FZGl0aW9ucy5NZWRpYXBsdXMuQ29tbW9uLldhdGVybWFyawIAAAAHcGlzVGV4dAlwaWR0ZURhdGUBAA0CAAAABgMAAAA5SnVhcmV6IENhZGl6IFJ1YmVuIC0gM2E5M2M5ZGItMzJlYi00MGY2LWFlOWQtOWUzNzM5ZWE0MDI2KAK4UQfM2YgL)

Para esto, implementaremos un listener más especializado que actionListener: utilizaremos mouseListener.

## Ejercicio 2
La implementación de la interfaz MouseListener en la clase Ventana ha declarado cinco métodos, de los cuales tres no se utilizan. En este ejercicio esto no es muy grave, pero en un código más largo puede perjudicar su legibilidad.

Hemos visto que, para resolver este problema, el API Java ofrece una clase abstracta MouseAdapter, que contiene las implementaciones por defecto de los métodos de la interfaz MouseListener.

En este ejercicio 2, debe modificar el código del ejercicio 1 para utilizar la clase abstracta MouseAdapter.

Atención: la clase Ventana ya extiende la clase JFrame, y recuerde que es posible extender varias clases a la vez en Java.