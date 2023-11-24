# State Ejemplo
En este ejemplo, `RedLight`, `GreenLight` y `YellowLight` son clases de estado concretas que implementan la interfaz `State`. La clase `TrafficLight` (Contexto) mantiene una referencia a un objeto `State` que representa el estado actual. En el método `main`, se crea un objeto `TrafficLight` y se cambia su estado utilizando el método `changeLight.

# Preguntas
## ¿Cuál de las opciones es mejor y por qué? ¿Existe alguna convención de nomenclatura?:

- Opción A

```java
 public interface State {
    public void changeLight(TrafficLight trafficLight);
}

public class RedLight implements State {
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Cambio de luz roja a luz verde");
        trafficLight.setState(new GreenLight());
    }
}
```
- Opción B

```java
public interface State {
    TrafficLight changeLight();
}

public class RedLight implements State {
    TrafficLight changeLight() {
        System.out.println("Cambio de luz roja a luz verde");
        return new GreenLight();
    }
}
```
Ambas opciones son válidas y dependen del contexto y de los requisitos del diseño. 

La **Opción A** es útil cuando el estado actual necesita realizar alguna acción en el contexto (`TrafficLight`). En este caso, el estado actual tiene el control total sobre el contexto y puede cambiar su estado según sea necesario.

La **Opción B** es útil cuando el estado actual necesita devolver un nuevo estado al contexto, pero no tiene el control directo para cambiar el estado del contexto. En este caso, el contexto es responsable de cambiar su estado.

En cuanto a las convenciones de nomenclatura, generalmente se prefiere que los nombres de los métodos sean verbos o frases de acción (por ejemplo, `changeLight`). Para las interfaces y las clases, los nombres deben ser sustantivos. En tu caso, tanto `State` como `TrafficLight` son buenos nombres ya que representan entidades o conceptos en tu sistema.

Es importante recordar que la elección entre estas dos opciones depende en gran medida de los detalles específicos de tu diseño y de lo que estés tratando de lograr. Ambas opciones son perfectamente válidas en diferentes situaciones.

## ¿Tanto la opción A como la opción B, respetan los principios de POO y de diseño? ¿Se viola algún principio de diseño?

Ambas opciones, la **Opción A** y la **Opción B**, respetan los principios de la Programación Orientada a Objetos (POO) y los principios de diseño.

- **Encapsulamiento**: Ambas opciones encapsulan el comportamiento relacionado con cada estado en su propia clase.
- **Abstracción**: Ambas opciones utilizan una interfaz `State` para abstraer los detalles de implementación de los estados.
- **Herencia**: Aunque este ejemplo no utiliza la herencia directamente, el patrón de estado a menudo implica alguna forma de herencia o interfaz.
- **Polimorfismo**: Ambas opciones utilizan el polimorfismo para permitir que el objeto `TrafficLight` cambie su comportamiento en tiempo de ejecución dependiendo del estado actual.

En cuanto a los principios de diseño, también se respetan:

- **Principio de responsabilidad única (SRP)**: Cada clase tiene una única responsabilidad.
- **Principio abierto/cerrado (OCP)**: Las clases `State` están abiertas para la extensión (puedes agregar más estados), pero cerradas para la modificación.
- **Principio de sustitución de Liskov (LSP)**: Los objetos de la clase `State` pueden ser reemplazados por objetos de sus subclases (es decir, los diferentes estados) sin afectar la corrección del programa.
- **Principio de segregación de la interfaz (ISP)**: La interfaz `State` es pequeña y específica a su propósito.
- **Principio de inversión de dependencias (DIP)**: Las clases concretas dependen de abstracciones (la interfaz `State`), no de otras clases concretas.

Por lo tanto, no se viola ningún principio de diseño en ninguna de las opciones. La elección entre la opción A y la opción B depende de las necesidades específicas de tu programa.

## ¿En la opción A viola algún principio al conocer toda la clase o no?
La **Opción A** no viola ningún principio de diseño. Aunque la clase de estado concreta (`RedLight`, `GreenLight`, `YellowLight`) tiene conocimiento del contexto (`TrafficLight`), esto es necesario para que el estado pueda cambiar el estado del contexto. Esto es una característica común del patrón de estado.

Es importante recordar que los principios de diseño son directrices, no reglas estrictas. En algunos casos, puede ser necesario que una clase tenga conocimiento de otra para lograr un objetivo de diseño específico. En el caso del patrón de estado, el estado necesita tener conocimiento del contexto para poder cambiar su estado.

Por lo tanto, aunque la **Opción A** puede parecer que introduce un acoplamiento más fuerte entre el estado y el contexto, esto es necesario para el funcionamiento del patrón de estado y no se considera una violación de los principios de diseño.

## La opción B viola el principio "TDA: Tell, don’t ask! ¡Di qué hacer, no preguntes!", dado que la clase debe retornar la nueva clase creada y luego se asigna nuevamente?

El principio "Tell, Don't Ask" (Di, no preguntes) es una guía de diseño que sugiere que deberías decirle a un objeto qué hacer en lugar de preguntarle sobre su estado y tomar decisiones en función de eso. En otras palabras, en lugar de preguntar a un objeto sobre su estado y luego realizar acciones basadas en este estado, deberíamos simplemente decirle al objeto qué acción realizar y dejar que decida cómo manejar esa acción.

En la **Opción B**, el contexto (`TrafficLight`) le dice al estado (`RedLight`, `GreenLight`, `YellowLight`) que cambie la luz (`changeLight()`), y el estado devuelve el nuevo estado. Luego, el contexto se actualiza con este nuevo estado. Aunque el contexto necesita preguntar al estado cuál es el próximo estado, esto no viola el principio "Tell, Don't Ask", ya que el contexto no está tomando ninguna decisión basada en el estado del objeto de estado; simplemente está actualizando su propio estado basado en el resultado de la operación `changeLight()`.

Por lo tanto, aunque la **Opción B** puede parecer que viola el principio "Tell, Don't Ask" a primera vista, en realidad sigue este principio en el sentido de que el contexto no está tomando decisiones basadas en el estado del objeto de estado. En cambio, está diciéndole al objeto de estado que realice una acción (`changeLight()`) y luego se actualiza en consecuencia. Por lo tanto, la **Opción B** no viola el principio "Tell, Don't Ask".