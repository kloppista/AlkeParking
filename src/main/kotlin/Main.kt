import java.util.Calendar

fun main(args: Array<String>) {
    data class Parkable(var vehicle: Vehicle) {
        val plate: String = ""
        val checkInTime = Calendar.getInstance()
        val discountCard: Any? = ""
    }
    data class Parking(val vehicles: MutableSet<Vehicle>)

}