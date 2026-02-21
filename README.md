# Testing con Junit

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Observa que este proyecto no tiene ninguna clase con el método `main`, no nos hace fatal. Además, tampoco tiene ningún `scanner` ni ningún `print`.

Haz un fork de este proyecto en tu repositorio de Github y contesta a las siguientes preguntas:

1. ¿Qué sentido puede tener este proyecto y para que lo podrías usar?
    *Respuesta* ---> En esta practica, podemos ver como implementar y usar las **pruebas**, las cuales cubren una función principal, el comprobar y verificar que nuestro codigo no posee errores. Lo usaría, para asegurarme, que el codigo que este realizando sea fiable y funcione correctamente  También sirve para detectar fallos antes de entregar el proyecto y para evitar que futuros cambios rompan partes que ya funcionaban y en caso de que se rompa, poder tener las pruebas, para apoyarnos en ellas y corregir nuestro codigo y errores.

2. Revisa las pruebas de la suma y comenta lo que te parezca de interés
    *Respuesta* ---> En las distintas pruebas de la suma, podemos observar, lo siguiente, la primera prueba nos muestra que se realiza una suma, en este caso primer valor (2) + segundo valor (3) y el resultado esperado es **5** lo que es correcto. Sin embargo, en la siguiente prueba llamada **sumarPositivosMal** se nos muestran los mismos valores, pero en este caso al ejecutarla, la terminal nos muestra el siguiente mensaje "AssertionFailedError: expected: [4] but was: [5]" lo que nos quiere decir, esperaba un valor, pero me da uno que no es correcto, eso es una prueba. Gracias a esto podemos comprobar en que parte falla nuestro codigo y asi corregirlo.

3. Realiza un estudio de caja negra de la división e implementa las pruebas en junit: Se realizará en markdown.

    Para realizar el estudio de la caja negra, voy a representarlo con una caja, para que visualmente se entienda que hace cada prueba y que se comprueba en ella, viendo asi valores esperados, datos propuestos, resultados incorrectos y porque.

    **Tabla**

      | Entrada | Resultado esperado |
      |---------|------------------|
      | 4 / 2   | 2                |
    | 4 / -2  | -2               |
    | -4 / 2  | -2               |
    | -4 / -2 | 2                |
    | 0 / 5   | 0                |
    | 7 / 1   | 7                |









## Instrucciones

El alumno deberá hacer un fork de este proyecto e implementar la solución solicitada (preguntas y código).

>Se deberá utilizar este fichero, y los artefactos de código del proyecto, para resolver el ejercicio.

**Si no se puede acceder al repositorio la evaluación del ejercicio será de 0. No se evaluarán entregas modificadas/entregadas fuera del plazo establecido en la tarea**