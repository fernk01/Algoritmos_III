# FIUBA
## Enuciado
Diseñar e implementar un sistema que permita contabilizar las materias aprobadas de un plan de estudios de FIUBA.

Cada materia de FIUBA tiene un código, un nombre y una cantidad de créditos, y puede ser obligatoria u optativa.

Una carrera está compuesta por un listado de materias (que pueden ser obligatorias u optativas), y una cantidad mínima de créditos. Para terminar la carrera hay que aprobar todas las materias obligatorias y además cumplir la cantidad de créditos.

El sistema ofrece sus servicios a múltiples usuarios. Cada usuario puede cursar cero, una o más carreras. El sistema debe permitir al usuario inscribirse a una carrera, marcar materias como aprobadas y consultar el estado de cada una de sus carreras

---

# Modelización
## Diagrama de clases UML 
Muestra las relaciones entre las clases `Materia`, `Carrera` y `Alumno`:

La clase `Materia` tiene atributos para el código, el nombre y los créditos de una materia. La clase `Carrera` tiene atributos para el nombre, el código, las materias obligatorias y optativas, y los créditos necesarios para completar una carrera. La clase `Alumno` tiene atributos para el padrón del alumno, las carreras activas y las materias aprobadas. Un alumno puede inscribirse en carreras y aprobar materias. También puede verificar su progreso en una carrera consultando el número de créditos que ha obtenido.

La clase `Carrera` tiene una relación de agregación (esto es interpretativo, composición) con la clase `Materia`, ya que una carrera está compuesta por materias obligatorias y optativas. La clase `Alumno` tiene una relación de agregación con la clase `Carrera`, ya que un alumno puede estar inscrito en varias carreras. La clase `Alumno` también tiene una relación de agregación con la clase `Materia`, ya que un alumno puede haber aprobado varias materias.

<image src="./fiuba_UML.png" alt="Diagrama UML">

## Como me doy cuenta quien tiene la relacion. Por ejemplo prodria ser que la clase Carrera tenga una relación de agregación con la clase Alumno? como me doy cuenta quien es quien?

La relación entre dos clases se determina por cómo interactúan y dependen entre sí en el contexto del programa. En este caso, la clase `Carrera` tiene una relación de agregación (composición) con la clase `Materia` porque una carrera está compuesta por materias obligatorias y optativas. La clase `Alumno` tiene una relación de agregación con la clase `Carrera` porque un alumno puede estar inscrito en varias carreras, pero una carrera no depende de un alumno en particular para existir.

No sería correcto decir que la clase `Carrera` tiene una relación de agregación con la clase `Alumno` porque una carrera no está compuesta por alumnos. Una carrera puede tener muchos alumnos inscritos, pero su existencia no depende de ellos.

En resumen, para determinar la relación entre dos clases, debes analizar cómo interactúan y dependen entre sí en el contexto del programa. 
