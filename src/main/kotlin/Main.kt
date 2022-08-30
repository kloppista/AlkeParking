import java.util.Calendar

fun main(args: Array<String>) {
    data class Parkable(var vehicle: Vehicle) {
        val plate: String = ""
        val checkInTime = Calendar.getInstance()
        val discountCard: Any? = ""

        fun checkOutVehicle(plate: String, ) {}
    }
    data class Parking(val vehicles: MutableSet<Vehicle>) {
        val maxAmountOfVehicles: Int = 20
        // Add a new vehicle to the vehicles Set
        fun addVehicle(vehicle: Vehicle): Any {
            // Validate if there are free parking lots
            if (vehicles.size < maxAmountOfVehicles) {
                return true
                println("Welcome to AlkeParking!")
            } else {
                return false
                println("Sorry, the check-in failed")
            }

            return Boolean
        }
    }

    val car = Vehicle("AA111AA1", VehicleType.car, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.motorcycle, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.minibus, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.bus, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val parking = Parking(mutableSetOf(car, moto, minibus, bus))

    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))

}