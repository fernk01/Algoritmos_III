# Solucion

## Punto 2:
Diagram 1:
```
@startuml
class Factura {
  + Factura()
  + agregar(a: Articulo)
  + emitir(m: Moneda)
}

note right of Factura::emitir
// ---
totalEnModenda = m.moneda(sumatoriaDeArticulos)
// ---
// ---
end note

class Articulo {
  - precio: double
  
  + valor(cantidad: Integer)
}

class Moneda {
  + valor(monto: double)
}

Factura o-- "*" Articulo
Factura o-- "1" Moneda

@enduml
```
Diagram 2:

```
@startuml
class Factura {
  + Factura()
  + agregar(a: Articulo)
  + emitir()
}

note right of Factura::emitir
// ---
totalEnModenda = m.moneda(sumatoriaDeArticulos)
// ---
// ---
end note

class Articulo {
  - precio: double
  
  + valor(cantidad: Integer)
}

class Moneda {
  + valor(monto: double)
}

Factura o-- "*" Articulo
Factura *-- "1" Moneda

@enduml
```
Por lo que se ve el diagrama 1 y 2, la difierencia que se observa entre la clase Factura y Moneda es que cambia de agregacion a composicion y se quita el parámetro Monada del método `emitir()`, clase Factura.

1. Cual de ambos diagramas le parece que cumple con la mayor cantidad de principios que conoce el 1 o el 2? Explique que principio eligio (no el principio en si) y por que su aplicacion es relavante?

