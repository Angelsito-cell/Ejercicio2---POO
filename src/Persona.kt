// Persona.kt
class Persona(
    var nombre: String? = null, // Nombre puede ser nulo
    var peso: Double,           // Peso en kg
    var altura: Double          // Altura en metros
) {
    // Propiedad calculada para el IMC
    val imc: Double
        get() = peso / (altura * altura)

    // Constructor secundario que incluye el nombre
    constructor(nombre: String, peso: Double, altura: Double) : this(null, peso, altura) {
        this.nombre = nombre
    }

    // Método para saludar
    fun saludar(): String {
        return "Hola, mi nombre es $nombre."
    }

    // Método para verificar si la altura está por encima de la media
    fun alturaEncimaMedia(): Boolean {
        return altura >= 1.75
    }

    // Método para verificar si el peso está por encima de la media
    fun pesoEncimaMedia(): Boolean {
        return peso >= 70.0
    }

    // Método para obtener la descripción del IMC
    private fun obtenerDescImc(): String {
        return when {
            imc < 18.5 -> "peso insuficiente"
            imc <= 24.9 -> "peso saludable"
            imc <= 29.9 -> "sobrepeso"
            else -> "obesidad"
        }
    }

    // Método para obtener una descripción completa de la persona
    fun obtenerDesc(): String {
        val descAltura = if (alturaEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        val descPeso = if (pesoEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        return "$nombre con una altura de ${"%.2f".format(altura)}m ($descAltura) " +
                "y un peso de ${"%.2f".format(peso)}kg ($descPeso) " +
                "tiene un IMC de ${"%.2f".format(imc)} (${obtenerDescImc()})."
    }

    // Método toString para representar el objeto como String
    override fun toString(): String {
        return "Persona(nombre=$nombre, peso=$peso kg, altura=$altura m, imc=${"%.2f".format(imc)})"
    }

    // Método equals para comparar dos personas
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false
        return this.nombre == other.nombre &&
                this.peso == other.peso &&
                this.altura == other.altura
    }
}