import java.util.*

data class Vehicle(val plate: String, val type: VehicleType) {
    val checkInTime = Calendar.getInstance()
    val discountCard: Any? = ""

    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return this.plate.hashCode()
    }
}