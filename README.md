# Testing con Junit

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Observa que este proyecto no tiene ninguna clase con el método `main`, no nos hace fatal. Además, tampoco tiene ningún `scanner` ni ningún `print`.

Haz un fork de este proyecto en tu repositorio de Github y contesta a las siguientes preguntas:

1. ¿Qué sentido puede tener este proyecto y para que lo podrías usar?
    *Respuesta* ---> Este tipo de proyecto sirve para aprender a trabajar con pruebas unitarias, que son una parte muy importante del desarrollo de software en empresas reales. Estamos aprendiendo cómo comprobar que un programa funciona correctamente antes de entregarlo.
    En una empresa, este tipo de proyectos se usan para asegurarse de que el código no tiene errores y de que cada parte del programa hace exactamente lo que debe hacer,las pruebas ayudan a detectar fallos antes de que el software llegue al usuario final.
    Yo lo usaría para comprobar que mi código es fiable, que funciona y que, si hago cambios más adelante, no estropeo algo que ya funcionaba, asegurando asi una forma de trabajar más segura y profesional.

2. Revisa las pruebas de la suma y comenta lo que te parezca de interés
    *Respuesta* ---> **El proyecto está organizado de la siguiente manera:** 
    Por un lado, está el código principal en src/main/java, donde se encuentra la clase Calculadora y la excepción personalizada OperacionNoValidaException. Por otro lado, están las pruebas en src/test/java, donde se usan las herramientas de JUnit para verificar que todo funcione correctamente.

    Las pruebas de la suma utilizan assertEquals() para comprobar que el resultado que devuelve el método es el correcto. Cada prueba es unico y normalmente comprueba un solo caso, asegurando asi que lo que ponemos en nuestro codigo es correcto y no causará problemas en un futuro

    En cuanto a mi opinion, me llamo la atencion durante la explicación en clase y durante la realización del proyecto que las pruebas estén separadas del código principal, también es importante que se prueben diferentes casos, como números positivos, negativos o el cero, ya que así se cubren más situaciones posibles y se reduce el riesgo de errores.


3. Realiza un estudio de caja negra de la división e implementa las pruebas en junit: Se realizará en markdown.

Para hacer un estudio de caja negra, no nos fijamos en cómo está hecho el código por dentro. En su lugar, vemos qué datos se le dan al método y qué resultado debería dar.

**El método que analizamos es dividir(a, b)**, donde:

a es el dividendo.

b es el divisor.

Primero identificamos las reglas del programa:

Si el divisor es distinto de cero, debe devolver el resultado de la división.

Si el divisor es cero, debe lanzar una excepción porque no se puede dividir entre cero.

Casos válidos:

**Número positivo dividido entre positivo.**

**Positivo entre negativo.**

**Negativo entre positivo.**

**Negativo entre negativo.**

**Cero dividido entre un número distinto de cero.**

**División por 1 o por -1 (casos límite).**

Caso inválido:

**División entre cero.**

Con esto diseñamos los siguientes casos de prueba:

4 / 2  resultado 2

4 / -2  resultado -2

-4 / 2  resultado -2

-4 / -2  resultado 2

0 / 5  resultado 0

7 / 1  resultado 7

7 / -1  resultado -7

4 / 0 debe lanzar una excepción

0 / 0 al igual que la anterior, debe lanzarnos una excepción

1 / 1 diviendo casos limites

Después se implementan todos estos casos en JUnit para comprobar que el método funciona correctamente en todas las situaciones posibles.

De esta forma el estudio de caja negra está completo, porque se han analizado todas las entradas importantes, los casos límite y el caso inválido.



## Instrucciones

El alumno deberá hacer un fork de este proyecto e implementar la solución solicitada (preguntas y código).

>Se deberá utilizar este fichero, y los artefactos de código del proyecto, para resolver el ejercicio.

**Si no se puede acceder al repositorio la evaluación del ejercicio será de 0. No se evaluarán entregas modificadas/entregadas fuera del plazo establecido en la tarea**