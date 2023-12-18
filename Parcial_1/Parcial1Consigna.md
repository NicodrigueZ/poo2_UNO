María es una apasionada de la tecnología. Disfruta instalando y probando nuevas aplicaciones.
Tiene un problema: la memoria de su celular se encuentra completamente llena (no tiene ningún MB libre) y mañana se publicará una nueva aplicación que promete ser una revolución en materia de tecnología. Por suerte para ella la empresa desarrolladora de la aplicación ya ha indicado la cantidad total de MB consecutivos que requerirá su instalación completa.
María sabe que borrando algunas aplicaciones podrá instalar la nueva apli- cación pero desea hacerlo eliminando la menor cantidad posible de aplicaciones ya instaladas. Es por esto que se te pide que la ayudes escribiendo almacenamiento.pas un programa
Datos de entrada
Se recibe un archivo
almacenamiento.in con el siguiente formato:
Una linea con 2 números separados por un espacio: cantidad total de aplicaciones instaladas C ( 1<= C<= 50.000) y cantidad de MB consecutivos que requiere la aplicación a instalar A
1 linea con C números que indican la cantidad de MB que ocupa cada aplica ción. La lista se encuentra ordenada exactamente de la misma manera en la que se ubican las aplicaciones en me- moria.
Notas: no quedan MB "intermedios" sin ocupar. Las capacidades se dan en el orden en que están en memoria y tanto estas como el valor de A están en el rango 1 a 1000.
Datos de salida
Se debe generar un archivo almacenamiento.out conteniendo: Una linea con la minima cantidad de aplicaciones consecutivas que deberían borrarse.
Ejemplo
Si el archivo almacenamiento. in fuera
10 100
42 2 50 10 1 50 30 24 18 23
ΕΙ archivo almacenamiento.out
debe contener:
3
que surge de eliminar las aplicaciones que ocupan 50, 30 y 24 MB respectivamente.