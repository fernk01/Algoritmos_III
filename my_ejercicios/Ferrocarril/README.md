# El Ferrocarril

Una empresa de servicios ferroviarios europea define los siguientes conceptos:

**Tramo**: es un recorrido entre dos ciudades sin cambio de tren, con o sin paradas intermedias. Cada tramo tiene un precio dependiendo del tipo de tren y categoría de pasaje (tipo: tren de alta velocidad, tren nocturno, tren común, etc.; categoría: primera, segunda).

**Servicio adicional:** es un servicio, no gratuito y optativo, que se puede adquirir junto con un tramo, pero que no se vende separado; por ejemplo: “cucheta coche dormitorio”, “cucheta en compartimiento privado”, “cena a bordo”. No se puede combinar cualquier ítem con cualquier adicional; por ejemplo, sólo se puede contratar cuchetas en trenes nocturnos.

**Pasaje:** es un derecho de viaje para uno o más pasajeros, para un tramo, o un tramo más uno o más adicionales. Su precio se calcula como suma de los precios de los componentes, por la cantidad de pasajeros. Todos los pasajeros viajan en el mismo tren y en la misma categoría.

**Viaje promocional:** es un conjunto de pasajes, que pueden incluir varios tramos y que tienen un precio promocional en conjunto; por ejemplo, puede haber un precio especial para la “5 pasajes entre París y Marsella, en TGV, segunda clase, viajando con cambio de tren en Lyon”. Los viajes promocionales tienen una vigencia: permanentes, por una estación del año, por día se semana o fin de semana

# Solucion
La solucion implementada no es correcta dado que se viola el principio OCP:

OCP (Open/Closed Principle):
significa que deberíamos ser capaces de extender la funcionalidad de una clase o módulo sin necesidad de modificar el código existente


La clase Tramo usa el metodo calcularPrecio() de la clase Pasaje, pero si se quiere agregar un nuevo tipo de pasaje, por ejemplo, un pasaje de avion, se deberia modificar la clase Pasaje, lo cual viola el principio OCP.



















