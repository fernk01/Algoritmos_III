Se requiere modelar un sistema que permita poner en funcionamiento una Salamandra. La misma
admite los siguientes tipos de combustible:

| | Precio [ $ / kg ] | Grado de contaminación [ gCO2 ]                                                      |
| --- | --- |--------------------------------------------------------------------------------------|
| Quebracho | 1000 | Vale 5 por cada kilo de Quebracho.                                                   |
| Pino | 500 | Vale siempre 150, independientemente de cuántos kilos de Pino haya en la salamandra. |
| Resina plástica | 300 | Vale 5^n , siendo n los kilos de resina que haya en la salamandra.                   |

La salamandra tiene una capacidad máxima para operar de 10 kg de combustible totales. No necesariamente tienen que ser los 10 kg del mismo, puede ser una combinación de los mismos también, pero en ningún caso se pueden exceder los 10 kg. Por otro lado la salamandra aborta su operatoria en caso de superar los 500 gCO2 de contaminación.

Casos de uso:
1. Calcular el costo de la Combustión resultante para una salamandra rellenada con 5 kilos Quebracho, 1 kilo de Pino y 1 kilo de Resina plástica.
2. Calcular el grado de contaminación de la Combustión resultante para una salamandra rellenada con 6 kilos Quebracho y 5 kilos de Pino.
3. Calcular el grado de contaminación de la Combustión resultante para una salamandra rellenada con 2 kilos Quebracho y 1 kilo de Pino y 5 kilos de Resina plástica.
4. Calcular el grado de contaminación de la Combustión resultante para una salamandra rellenada con 5 kilos Quebracho, 1 kilo de Pino y 1 kilo de Resina plástica.

Se pide:
- Diagrama de clases completo incluyendo todas las clases y abstracción por más que no se utilicen en los diagramas de secuencia de los casos de uso.
- Diagrama de secuencia para cada uno de los casos de uso.
- Código de pruebas (positiva y negativa según corresponda) para cada uno de los casos de uso.
