# Datos Impresos en JTable

Explicación de código fuente

El siguiente programa se trata de que el programa pide al usuario diversos datos, a partir de ellos se cargará en una lista a mostrar los resultados en una tabla. El programa fue hecho en el entorno de programación (IDE) llamado NetBeans, para su compilación no se requirió más que darle click en el icono de ejecutar. 
A continuación, se presenta el código en donde se importan las librerías necesarias para poder utilizar algunas clases que se implementaron en este programa.

![imagen](https://user-images.githubusercontent.com/71055467/109014079-6c002000-7679-11eb-962d-68db04168024.png)

En esta ocasión hemos hecho el programa en dos partes, primero mostramos enseguida la clase principal, es decir donde comienza a ejecutarse el programa, para este programa necesitamos hacer el uso de variables para almacenar los valores, para ello hacemos la declaración como se muestra en la captura que sigue.

![imagen](https://user-images.githubusercontent.com/71055467/109014120-76221e80-7679-11eb-9fc7-099df714d33f.png)

Para darle un estado inicial a esta clase, necesitamos crear un constructor que recibirá datos del tipo String cuando el usuario introduce los datos, asimismo, como el nombre de las variables por parámetro son los mismos, lo igualamos a las variables de las clases que se declararon anteriormente, esto se hace de la siguiente manera;

![imagen](https://user-images.githubusercontent.com/71055467/109014160-7e7a5980-7679-11eb-9963-c46876986d7d.png)

Una vez hecho lo anterior, procedemos a programar los métodos setter y getter estos nos sirven para asignar el valor a una propiedad y para obtener el valor de una propiedad respectivamente.
Ya que hemos declarado los métodos, para mostrar la información del objeto nombre y apellido ocupamos el método toString y se imprimirá en la lista. Todo esto explicado se muestra en el código fuente siguiente.

![imagen](https://user-images.githubusercontent.com/71055467/109014204-889c5800-7679-11eb-8746-9402c63c2cc1.png)
![imagen](https://user-images.githubusercontent.com/71055467/109014215-8d610c00-7679-11eb-9df4-98094651ccec.png)

Para crear el marco de la imagen, es necesario crear una clase que herede de JFrame, para que se pueda agregar los diferentes componentes que llevará este marco. Mas adelante, declaramos un ArrayList, esto nos ayudará para almacenar los datos y posteriormente imprimirlos en pantalla.
También hemos creado un objeto que pertenece a la clase DefaultListModel este nos servirá para almacenar los datos de nombre y apellidos en una lista, que posteriormente se imprimirá en pantalla. La siguiente todo lo mencionado se presenta a continuación;

![imagen](https://user-images.githubusercontent.com/71055467/109014259-9651dd80-7679-11eb-8cd2-88dd1adeb99c.png)

Ahora procedemos a programar algunos atributos que tendrá nuestro marco, como por ejemplo la posición en la que aparecerá al ejecutarse, ancho, alto entre otras cosas. En las primeras líneas se encuentra la función que llama a los componentes que se encuentran más adelante, también encontramos a la lista que le asignamos el modelo de lista, es decir, al ejecutarse se mostrará un espacio el cual será esta lista.
Las siguientes líneas se refieren a las características que contiene el marco, lo primero que programamos es la posición del marco, para ello recopilamos datos de la pantalla del monitor en que se ejecuta, y posteriormente hacemos operaciones matemáticas para que quede en el centro y no a un lado.
También le asignamos un título, para comprender lo dicho anteriormente, se muestra el código de esta parte;

![imagen](https://user-images.githubusercontent.com/71055467/109014294-9d78eb80-7679-11eb-8b6a-9fedc320d8e8.png)

En este programa hicimos uso de las herramientas de NetBeans para crear los diferentes elementos del marco, entre estos se encuentran las etiquetas que serán los que darán la señal de que es lo que se va a escribir en los campos de texto, también agregamos la lista de objetos o bien una simple lista en donde se enviarán los datos capturados para su impresión, de igual forma agregamos un JTable o es lo mismo que una tabla en donde también almacenará los datos capturados. En resumen, eso es básicamente de lo que trata la siguiente captura, pero como ya hemos comentado esta parte es amplio debido a que no lo programamos de la forma como hicimos en el resto del programa.

![imagen](https://user-images.githubusercontent.com/71055467/109014359-ab2e7100-7679-11eb-97f8-abf427fa5b1f.png)

Lo que se presenta arriba es una parte de lo que hemos mencionado anteriormente, y como ya mencionamos de que se trata, toda esta parte, el código fuente completo lo podemos encontrar en el enlace que aparece más adelante.
Uno de los conceptos fundamentales en este programa o más bien la finalidad de este programa es comprender la definición de eventos, y en esta parte del programa se abarca una parte de ello.
Cuando realizamos alguna actividad como hacer click en botón, pulsar las teclas, o seleccionar alguna ventana, estamos generando una acción, y para que se ejecute lo que queremos hay una función que es invocada para que se ejecute el código y con ello se estará cumpliendo con la tarea esperada.

Lo que tratamos de explicar se encuentra en código en estas líneas;

![imagen](https://user-images.githubusercontent.com/71055467/109014398-b5e90600-7679-11eb-97e4-961d8844d4d7.png)

Como en los métodos de la interfaz anterior no hay alguna acción para resolver, continua el programa con el siguiente método, y este es el mismo que los anteriores, pero ahora la acción se aplica al botón que hemos agregado en líneas anteriores, es por ello que al hacer click en el botón de registrar, se efectúa lo siguiente; como el programa pide datos, estos se almacenan en los campos de texto, pero para imprimirlos se almacenamos estos datos a las variables del tipo String, para posteriormente hacer la llamada de ellos y mostrarlos en pantalla. Además, se instancia la clase Usuario dos veces la primera es para crear un objeto en donde se almacena los nuevos usuarios que el usuario está ingresando que se mostrará en la lista y después se instancia la misma clase, pero esta vez para almacenarlo en la tabla.

![imagen](https://user-images.githubusercontent.com/71055467/109014456-c5684f00-7679-11eb-837d-4d19b00dd470.png)

En la última línea se manda a llamar a la función mostrar que veremos a continuación, en principio declaramos y asignamos valores a una matriz, después para almacenar los valores en el campo de texto, se hace con un ciclo for, terminando esto, se agrega la matriz en el panel y en la tabla. Y para eliminar los datos que ya introdujo el usuario simplemente le ponemos null en el campo donde va el texto.

![imagen](https://user-images.githubusercontent.com/71055467/109014491-cdc08a00-7679-11eb-894b-4d107d101700.png)

El código que se muestra más adelante es una función propia de la interfaz del programa, como hemos mencionado parte del programa fue elaborado con las herramientas de NetBeans es por ello que Nimbus se encarga de utilizar gráficos vectoriales Java 2D para dibujar la interfaz de usuario (IU) y diferentes características.

![imagen](https://user-images.githubusercontent.com/71055467/109014522-d749f200-7679-11eb-8e72-51bf95f56171.png)

La última parte simplemente se trata de la declaración de variables necesarios que se utilizó para la creación de la interfaz del programa.

![imagen](https://user-images.githubusercontent.com/71055467/109014548-ddd86980-7679-11eb-86dc-6090fbbf4b69.png)



Ejecución del programa 3

Cuando ejecutamos el programa, nos aparece la siguiente ventana en donde el usuario puede ingresar los datos;

![imagen](https://user-images.githubusercontent.com/71055467/109014613-eaf55880-7679-11eb-9da6-cb4ab1016e4e.png)

Ahora rellenamos los campos de texto que están del lado izquierdo;

![imagen](https://user-images.githubusercontent.com/71055467/109014654-f5175700-7679-11eb-9fff-21845469b2d3.png)

Una vez hecho lo anterior, hacemos click en el botón “añadir” y en el cuadro que está en blanco que es una lista de objetos solo se imprime el nombre y los apellidos, mientras que en la tabla se imprime todos los datos capturados.

![imagen](https://user-images.githubusercontent.com/71055467/109014683-fcd6fb80-7679-11eb-82d7-f05b39c84b99.png)

Vemos que en los campos de texto esta vacío lo que nos permite capturar más datos y mandarlos a imprimir tanto en la lista como en la tabla.

![imagen](https://user-images.githubusercontent.com/71055467/109014719-0496a000-767a-11eb-91ad-af527fce6b76.png)

![imagen](https://user-images.githubusercontent.com/71055467/109014734-07919080-767a-11eb-87a8-f814992e496b.png)

