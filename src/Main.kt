// Main.kt
fun main() {
    // Crear 3 personas
    val persona1 = Persona(peso = 68.5, altura = 1.70)
    val persona2 = Persona("Carlos", 75.0, 1.80)
    val persona3 = Persona("Ana", 60.0, 1.65)

    // Mostrar las personas
    println("Persona 1: $persona1")
    println("Persona 2: $persona2")
    println("Persona 3: $persona3")

    // Modificar el nombre de la persona 1
    println("\nModificando el nombre de la persona 1...")
    var nombre: String?
    do {
        print("Introduce el nombre de la persona 1: ")
        nombre = readLine()
    } while (nombre.isNullOrEmpty())
    persona1.nombre = nombre

    // Mostrar nombre, peso y altura de la persona 1
    println("\nDatos de la persona 1:")
    println("Nombre: ${persona1.nombre}, Peso: ${persona1.peso} kg, Altura: ${persona1.altura} m")

    // Mostrar peso, altura e IMC de la persona 3
    println("\nDatos de la persona 3:")
    println("Peso: ${persona3.peso} kg, Altura: ${persona3.altura} m, IMC: ${"%.2f".format(persona3.imc)}")

    // Modificar la altura de la persona 3
    persona3.altura = 1.80
    println("\nDespués de modificar la altura de la persona 3:")
    println("Peso: ${persona3.peso} kg, Altura: ${persona3.altura} m, IMC: ${"%.2f".format(persona3.imc)}")

    // Modificar la altura de la persona 2 para que sea igual a la persona 3
    persona2.altura = persona3.altura
    println("\nPersona 2: $persona2")
    println("Persona 3: $persona3")

    // Comparar si las personas 2 y 3 son iguales
    println("\n¿Son iguales la persona 2 y la persona 3? ${persona2 == persona3}")

    // Crear una lista de personas adicionales
    val personas = listOf(
        Persona("Julia", 64.7, 1.72),
        Persona("Pedro", 80.0, 1.78),
        Persona("Laura", 55.0, 1.60),
        Persona("Miguel", 90.0, 1.85)
    )

    // Recorrer la lista y mostrar el saludo y la descripción de cada persona
    println("\nSaludos y descripciones de las personas adicionales:")
    personas.forEach { persona ->
        println(persona.saludar())
        println(persona.obtenerDesc())
    }
}