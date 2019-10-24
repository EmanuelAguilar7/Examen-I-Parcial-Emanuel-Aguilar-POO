

//Hecho Por Emanuel Aguilar 1208-2000-00239

fun main (args: Array<String>)
{
    //Se llama la clase Pisos para implementar la funcion Imprimir que llama a las opciones de los pisos existentes
    println(Pisos().Imprimir())

    //Se declara variable de Boolean para ciclo Do While
    var salir:Boolean = true

    println("El elevador se encuentra DETENIDO en el Lobby")



    do {
        println()
        print("Ingrese el piso al que desee ir: ")

       //Toma el valor ingresado por el teclado y a la vez lo convierte en entero
        val num: Int
        num = readLine()?.toInt() as Int

        println()

        //Se implementa para declarar si el elevador esta subiendo o bajando
        if (num < 3)
        {
            println("Estado del elevador BAJANDO")
        }
        if(num>3 && num<15)
        {
            println("Estado del elevador SUBIENDO")
        }

        //El When se implementa para llegar al piso ingresado para el usuario
        when(num)
        {
            0-> println("El elevador ah llegado al piso S3")
            1-> println("El elevador ah llegado al piso S2")
            2-> println("El elevador ah llegado al piso S1")
            3-> println("El elevador ah llegado al piso Lobby")
            4-> println("El elevador ah llegado al piso Piso 2")
            5-> println("El elevador ah llegado al piso Piso 3")
            6-> println("El elevador ah llegado al piso Piso 4")
            7-> println("El elevador ah llegado al piso Piso 5")
            8-> println("El elevador ah llegado al piso Piso 6")
            9-> println("El elevador ah llegado al piso Piso 7")
            10-> println("El elevador ah llegado al piso Piso 8")
            11-> println("El elevador ah llegado al piso Piso 9")
            12-> println("El elevador ah llegado al piso Piso 10")
            13-> println("El elevador ah llegado al piso Piso 11")
            14-> println("El elevador ah llegado al piso Piso 12")
            15-> salir=false
        }


    }while (salir != false)




    /*
    var items = listOf("S3","S2","S1","Lobby","Piso 2","Piso 3","Piso 4","Piso 5","Piso 6","Piso 7","Piso 8","Piso 9","Piso 10","Piso 11","Piso 12")
    for (posicion in items.indices)
    {

        println("En la posicion $posicion esta: ${items[posicion]}")
    }
    println()
    println()

     */

}


