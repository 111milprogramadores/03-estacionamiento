# Estacionamiento de Universidad
### Ejercicio 3 de los módulos Programación Orientada a Objetos y Bases de Datos

> Este ejercicio forma parte de la Guía Práctica de los módulos Programación Orientada a Objetos y Bases de Datos
> del Programa Nacional [111mil Programadores](https://www.argentina.gob.ar/111mil).

Se describe a continuación el funcionamiento de la playa de estacionamiento de la Universidad Tecnológica
y del sistema de información que le da soporte.
 * Pueden estacionar distintos tipos de vehículos (motos/automóviles), cada uno con una tarifa de ingreso
diferente. Si tiene abono, el precio es menor.
 * Se puede ingresar a la playa de estacionamiento por varios portones de ingreso diferentes
 * No se asignan lugares específicos para los vehículos; las personas que ingresan al estacionamiento
deberán ubicar su vehículo en algún lugar que se encuentre disponible.
 * Los interesados pueden comprar un abono de estacionamiento, de pago anticipado que hace que el
valor de cada estacionamiento sea más económico que si paga cada vez que ingresa a la playa. Debe
informar su DNI y la cantidad de dinero que desea acreditar.
 * Si es la primera vez que estaciona, debe registrar sus datos personales (apellido, nombre, dni), y los
datos del o los vehículos (marca, modelo, dominio), con los cuales desea ingresar a la playa de
estacionamiento.
 * Una vez registrado el propietario, cada vez que necesite acreditar dinero informa su DNI y la cantidad
de dinero y se le cobra entregándole un comprobante donde consta: apellido y nombre, dni, fecha de
la transacción, monto acreditado y monto disponible en su cuenta.
 * El comprobante (ticket) que se entrega como constancia del cobro tiene los siguientes datos: apellido
y nombre del propietario, dni, fecha y hora de la transacción, monto acreditado y monto disponible en
su cuenta, los números de dominio de todos los vehículos registrados de ese propietario y un número
único de identificación del comprobante.
 * Puede tener hasta dos ingresos sin crédito, es decir saldo negativo, que se descontarán de la siguiente
vez que acredite dinero en su cuenta.
 * La persona mientras tenga crédito puede ingresar a la playa con cualquiera de los vehículos registrados.
 * La persona puede en cualquier momento agregar y/o cambiar los vehículos con los que ingresará a la
playa de estacionamiento.
 * El valor del estacionamiento es por el día completo, sin límite de tiempo ni inferior ni superior; es decir
se paga un ingreso diario, que es válido independientemente de la cantidad de ingresos que haga
durante el mismo día y del tiempo que permanezca en la playa.
 * Al ingresar se le entrega a la persona un comprobante que contiene: dominio del vehículo, apellido y
nombre del dueño del vehículo, el valor del ingreso, la fecha de ingreso y el saldo disponible. También
se informa el número de ingreso del día. El portón por el que ingresa y el usuario logueado.
 * Si el vehículo no está registrado se guarda en el ingreso el número de dominio del vehículo y se informa
como observación que no está registrado.
 * El primer ingreso del día se cobra, descontando del saldo disponible. A partir del segundo ingreso del
día en adelante, el monto debe figurar en cero y se debe informar que número de ingreso, por ejemplo:
“Segundo ingreso del día”.
 * A las personas que desean ingresar a la playa de estacionamiento sin tener el abono de pago anticipado,
se les cobra al momento del ingreso, registrando como observación el número de dominio del vehículo,
entregándoles un comprobante con el monto cobrado, los datos del comprobante en ese caso son:
dominio del vehículo, monto, fecha de ingreso, número de vez que ingresa a la playa de
estacionamiento, usuario logueado, fecha y hora y portón por el que ingresa.
 * Si la persona tiene abono, puede tener hasta el valor de dos estacionamientos como saldo negativo,
que se descontarán de la siguiente vez que acredite dinero en su cuenta.
