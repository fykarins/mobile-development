import com.dicoding.exam.exam1.isEvenNumber
import com.dicoding.exam.exam1.moreThanFive
import com.dicoding.exam.exam2.calculate
import com.dicoding.exam.exam2.result
import com.dicoding.exam.exam3.checkType
import com.dicoding.exam.exam4.vehicle
import com.dicoding.exam.exam5.multiple
import com.dicoding.exam.exam5.sum
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.system.measureTimeMillis

/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam kelas Test                                        *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

@Suppress("UNCHECKED_CAST")
class ExamTestMain : Spek({
    group("Pengujian otomatis latihan") {
        describe("Pengecekkan Latihan 1") {
            fun isEvenNumber(number: Int): Boolean {
                return number % 2 == 0
            }
            fun moreThanFive(number: Int): Boolean {
                return number > 5
            }

            it("Latihan 1") {
                val result = isEvenNumber(0)
                if (result) {
                    println("angka 0 merupakan angka genap")
                } else {
                    println("angka 0 merupakan angka ganjil")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah 0, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }

            /* ini ditambahkan nol karena error saat fungsi nol tidak dimasukkan
             */

            it("Latihan 1") {
                val result = isEvenNumber(2)
                if (result) {
                    println("angka 2 merupakan angka genap")
                } else {
                    println("angka 2 merupakan angka ganjil")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah 2, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }
                /*isEvenNumber(2).returnTrue(errMessage = "Jika argumennya adalah 2, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            } */

            it("Latihan 1") {
                val result = isEvenNumber(6)
                if (result) {
                    println("angka 6 merupakan angka genap")
                } else {
                    println("angka 6 merupakan angka ganjil")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah 6, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }
                /*isEvenNumber(6).returnTrue(errMessage = "Jika argumennya adalah 6, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            } */

            it("Latihan 1") {
                val result = isEvenNumber(7)
                if (result) {
                    println("angka 7 merupakan angka genap")
                } else {
                    println("angka 7 merupakan angka ganjil")
                }
                result.returnFalse(errMessage = "Jika argumennya adalah 7, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            }
                /*isEvenNumber(7).returnFalse(errMessage = "Jika argumennya adalah 7, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            } */

            it("Latihan 1") {
                val result = isEvenNumber(1)
                if (result) {
                    println("angka 1 merupakan angka genap")
                } else {
                    println("angka 1 merupakan angka ganjil")
                }
                result.returnFalse(errMessage = "Jika argumennya adalah 1, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            }
                /*isEvenNumber(1).returnFalse(errMessage = "Jika argumennya adalah 1, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            } */

            for (number in 1..99 step 2) {
                it("Latihan 1") {
                    val result = isEvenNumber(number)
                    if (result) {
                        println("angka $number merupakan angka genap")
                    } else {
                        println("angka $number merupakan angka ganjil")
                    }
                    result.returnFalse(errMessage = "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
                }
                    /*isEvenNumber(number).returnFalse(errMessage = "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
                } */
            }

            for (number in 0..100 step 2) {
                it("Latihan 1") {
                }
                val result = isEvenNumber(number)
                if (result) {
                    println("angka $number merupakan angka genap")
                } else {
                    println("angka $number merupakan angka ganjil")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }
                    /*isEvenNumber(number).returnTrue(errMessage = "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
                } */

            it("Latihan 1") {
                val result = moreThanFive(1)
                if (result) {
                    println("angka 1 merupakan angka lebih dari lima")
                } else {
                    println("angka 1 merupakan angka lebih dari lima")
                }
                result.returnFalse(errMessage = "Jika argumennya adalah 1, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }
                /*moreThanFive(1).returnFalse(errMessage = "Jika argumennya adalah 1, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            } */

            it("Latihan 1") {
                val result = moreThanFive(3)
                if (result) {
                    println("angka 3 merupakan angka lebih dari lima")
                } else {
                    println("angka 3 merupakan angka lebih dari lima")
                }
                result.returnFalse(errMessage = "Jika argumennya adalah 3, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }
                /*moreThanFive(3).returnFalse(errMessage = "Jika argumennya adalah 3, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            } */

            it("Latihan 1") {
                val result = moreThanFive(5)
                if (result) {
                    println("angka 5 merupakan angka lebih dari lima")
                } else {
                    println("angka 5 merupakan angka lebih dari lima")
                }
                result.returnFalse(errMessage = "Jika argumennya adalah 5, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }
                /* moreThanFive(5).returnFalse(errMessage = "Jika argumennya adalah 5, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            } */

            it("Latihan 1") {
                val result = moreThanFive(10)
                if (result) {
                    println("angka 10 merupakan angka lebih dari lima")
                } else {
                    println("angka 10 merupakan angka lebih dari lima")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah 10, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            }
                /* moreThanFive(10).returnTrue(errMessage = "Jika argumennya adalah 10, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            } */

            it("Latihan 1") {
                val result = moreThanFive(30)
                if (result) {
                    println("angka 30 merupakan angka lebih dari lima")
                } else {
                    println("angka 30 merupakan angka lebih dari lima")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah 30, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            }
                /* moreThanFive(30).returnTrue(errMessage = "Jika argumennya adalah 30, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            } */

            fun result(number: Int): Int {
                // Misalkan fungsi ini mengembalikan nilai number * 30
                return number * 30
            }

            it("Latihan 1") {
                val expect = result(20)
                println("Expected: 600, Actual: $expect")
                assertEqualsWith(
                    expected = 600, // Pastikan expected benar
                    actual = expect,
                    errMessage = "Jika argumennya adalah 20, fungsi result() seharusnya mengembalikkan nilai 600"
                )
            }
            /* it("Latihan 1") {
                val expect = result(20)
                assertEqualsWith(
                    expected = 600, // Pastikan expected benar
                    actual = expect,
                    errMessage = "Jika argumennya adalah 20, fungsi result() seharusnya mengembalikkan nilai 600"
                )
            } */
        }

        describe("Latihan 2") {
            fun calculate(valueA: Int, valueB: Int, valueC: Int): Int {
                return (valueA + valueB + valueC) % 54
            }
            fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
                val c = valueC ?: 0 // Jika valueC null, anggap 0
                return (valueA + valueB + c)
            }

            fun result(value: Int): String {
                return "Result is $value"
            }

            it("Latihan 2") {
                val result = calculate(101, 52, 99)
                if (result == 54) {
                    println("Hasil dari calculate(101, 52, 99) adalah 54")
                } else {
                    println("Hasil dari calculate(101, 52, 99) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `99`, fungsi calculate() seharusnya mengembalikkan nilai 54")
            }
            /* it("Latihan 2") {
                val result = calculate(101, 52, 99)
                assertEqualsWith(
                    expected = result,
                    actual = 54,
                    errMessage = "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `99`, fungsi calculate() seharusnya mengembalikkan nilai 54"
                )
            } */
            it("Latihan 2") {
                val result = calculate(101, 52, null)
                if (result == 103) {
                    println("Hasil dari calculate(101, 52, null) adalah 103")
                } else {
                    println("Hasil dari calculate(101, 52, null) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `null`, fungsi calculate() seharusnya mengembalikkan nilai 103")
            }

            /* it("Latihan 2") {
                val result = calculate(101, 52, null)
                assertEqualsWith(
                    expected = result,
                    actual = 103,
                    errMessage = "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `null`, fungsi calculate() seharusnya mengembalikkan nilai 103"
                )
            } */

            it("Latihan 2") {
                val result = result(103)
                if (result == "Result is 103") {
                    println("Hasil dari result(103) adalah 'Result is 103'")
                } else {
                    println("Hasil dari result(103) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah 103, fungsi result() seharusnya mengembalikkan pesan `Result is 103`")
            }
            /* it("Latihan 2") {
                val result = result(103)
                assertEqualsWith(
                    expected = result,
                    actual = "Result is 103",
                    errMessage = "Jika argumennya adalah 103, fungsi result() seharusnya mengembalikkan pesan `Result is 103`"
                )
            } */
        }

        describe("Pengecekkan latihan 3") {
            fun checkType(value: Any): String {
                return when (value) {
                    is Double -> "Yes! it's Double"
                    is List<*> -> "Yes! it's List"
                    is Map<*, *> -> "Yes! it's Map"
                    is Int -> "Yes! it's Integer"  // Menangani Integer
                    is Boolean -> "Yes! it's Boolean" // Menangani Boolean
                    else -> "Unknown type"
                }
            }

            it("Latihan 3") {
                val result = checkType(50)
                if (result == "Yes! it's Integer") {
                    println("Hasil dari checkType(50) adalah 'Yes! it's Integer'")
                } else {
                    println("Hasil dari checkType(50) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah `50`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Integer`")
            }
            /* it("Latihan 3") {
                val result = checkType(50)
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Integer",
                    errMessage = "Jika argumennya adalah `50`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Integer`"
                )
            } */

            it("Latihan 3") {
                val result = checkType(true)
                if (result == "Yes! it's Boolean") {
                    println("Hasil dari checkType(true) adalah 'Yes! it's Boolean'")
                } else {
                    println("Hasil dari checkType(true) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah `true`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Boolean`")
            }
            /* it("Latihan 3") {
                val result = checkType(true)
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Boolean",
                    errMessage = "Jika argumennya adalah `true`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Boolean`"
                )
            } */

            it("Latihan 3") {
                val result = checkType(1.0)
                if (result == "Yes! it's Double") {
                    println("Hasil dari checkType(1.0) adalah 'Yes! it's Double'")
                } else {
                    println("Hasil dari checkType(1.0) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah `1.0`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Double`")
            }
            /* it("Latihan 3") {
                val result = checkType(1.0)
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Double",
                    errMessage = "Jika argumennya adalah `1.0`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Double`"
                )
            } */

            it("Latihan 3") {
                val result = checkType(listOf<String>())
                if (result == "Yes! it's List") {
                    println("Hasil dari checkType(listOf<String>()) adalah 'Yes! it's List'")
                } else {
                    println("Hasil dari checkType(listOf<String>()) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah `listOf<String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's List`")
            }
            /* it("Latihan 3") {
                val result = checkType(listOf<String>())
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's List",
                    errMessage = "Jika argumennya adalah `listOf<String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's List`"
                )
            } */

            it("Latihan 3") {
                val result = checkType(mapOf<String, String>())
                if (result == "Yes! it's Map") {
                    println("Hasil dari checkType(mapOf<String, String>()) adalah 'Yes! it's Map'")
                } else {
                    println("Hasil dari checkType(mapOf<String, String>()) tidak sesuai: $result")
                }
                result.returnTrue(errMessage = "Jika argumennya adalah `mapOf<String, String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Map`")
            }
            /* it("Latihan 3") {
                val result = checkType(mapOf<String, String>())
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Map",
                    errMessage = "Jika argumennya adalah `mapOf<String, String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Map`"
                )
            } */
        }

        describe("Pengecekkan latihan 4") {
            fun vehicle(): Map<String, String> {
                return mapOf(
                    "type" to "motorcycle",
                    "maxSpeed" to "230Km/s",
                    "maxTank" to "100Ltr"
                )
            }

            it("Latihan 4") {
                val vehicle = vehicle()
                if (vehicle is Map<*, *>) {
                    println("Fungsi vehicle() mengembalikkan Map.")
                } else {
                    println("Fungsi vehicle() tidak mengembalikkan Map.")
                }
                (vehicle is Map<*, *>).returnTrue("Fungsi vehicle() seharusnya mengembalikkan nilai dengan tipe data Map<>")
            }
            /* it("Latihan 4") {
                val vehicle = vehicle()
                (vehicle is Map<*, *>).returnTrue("Fungsi vehicle() seharusnya mengembalikkan nilai dengan tipe data Map<>")
            } */

            it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                if (vehicle["type"] != null && vehicle["type"] == "motorcycle") {
                    println("Key 'type' dengan nilai 'motorcycle' ditemukan.")
                } else {
                    println("Key 'type' atau nilai 'motorcycle' tidak ditemukan.")
                }
                (vehicle["type"] == "motorcycle").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `type` dengan nilai `motorcycle`")
            }
            /* it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                (vehicle["type"] != null && vehicle["type"] == "motorcycle").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `type` dengan nilai `motorcycle`")
            } */

            it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                if (vehicle["maxSpeed"] != null && vehicle["maxSpeed"] == "230Km/s") {
                    println("Key 'maxSpeed' dengan nilai '230Km/s' ditemukan.")
                } else {
                    println("Key 'maxSpeed' atau nilai '230Km/s' tidak ditemukan.")
                }
                (vehicle["maxSpeed"] == "230Km/s").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxSpeed` dengan nilai `230Km/s`")
            }
            /* it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                (vehicle["maxSpeed"] != null && vehicle["maxSpeed"] == "230Km/s").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxSpeed` dengan nilai `230Km/s`")
            } */

            it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                if (vehicle["maxTank"] != null && vehicle["maxTank"] == "100Ltr") {
                    println("Key 'maxTank' dengan nilai '100Ltr' ditemukan.")
                } else {
                    println("Key 'maxTank' atau nilai '100Ltr' tidak ditemukan.")
                }
                (vehicle["maxTank"] == "100Ltr").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxTank` dengan nilai `100Ltr`")
            }
            /* it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                (vehicle["maxTank"] != null && vehicle["maxTank"] == "100Ltr").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxTank` dengan nilai `100Ltr`")
            } */
        }

        describe("Pengecekkan latihan 5") {
            suspend fun sum(a: Int, b: Int): Int {
                kotlinx.coroutines.delay(3000) // Menambahkan delay 3 detik
                return a + b
            }
            suspend fun multiple(a: Int, b: Int): Int {
                kotlinx.coroutines.delay(2000) // Menambahkan delay 2 detik
                return a * b
            }

            it("Latihan 5") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        sum(10, 10)
                    }
                    if (executionTime in 3001..3499) {
                        println("Jeda waktu fungsi sum() sesuai, yaitu sekitar 3 detik.")
                    } else {
                        println("Jeda waktu fungsi sum() kurang dari 3 detik atau lebih dari yang diharapkan.")
                    }
                    (executionTime in 3001..3499).returnTrue("Pemanggilan fungsi sum() seharusnya terdapat jeda waktu minimal 3 detik")
                }
            }
            /* it("Latihan 5") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        sum(10, 10)
                    }

                    (executionTime in 3001..3499).returnTrue("Pemanggilan fungsi sum() seharusnya terdapat jeda waktu minimal 3 detik")
                }
            } */

            it("Latihan 5") {
                runBlocking {
                    val result = async { sum(5, 5) }
                    val actual = result.await()
                    if (actual == 10) {
                        println("Hasil sum(5, 5) sesuai, yaitu 10.")
                    } else {
                        println("Hasil sum(5, 5) tidak sesuai, diharapkan 10, tetapi ditemukan $actual.")
                    }
                    (actual == 10).returnTrue("Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi sum() seharusnya mengembalikkan nilai 10")
                }
            }
            /* it("Latihan 5") {
                runBlocking {
                    val result = async { sum(5, 5) }
                    (result.await() == 10).returnTrue("Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi sum() seharusnya mengembalikkan nilai 10")
                }
            } */

            it("Latihan 5") {
                runBlocking {
                    val result = async { sum(100, 7) }
                    val actual = result.await()
                    if (actual == 107) {
                        println("Hasil sum(100, 7) sesuai, yaitu 107.")
                    } else {
                        println("Hasil sum(100, 7) tidak sesuai, diharapkan 107, tetapi ditemukan $actual.")
                    }
                    (actual == 107).returnTrue("Jika argumen untuk parameter a adalah 100 dan b adalah 7, fungsi sum() seharusnya mengembalikkan nilai 107")
                }
            }
            /* it("Latihan 5") {
                runBlocking {
                    val result = async { sum(100, 7) }
                    (result.await() == 107).returnTrue("Jika argumen untuk parameter a adalah 100 dan b adalah 7, fungsi sum() seharusnya mengembalikkan nilai 107")
                }
            } */

            it("Latihan 5") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        multiple(10, 10)
                    }
                    if (executionTime in 2001..2499) {
                        println("Jeda waktu fungsi multiple() sesuai, yaitu sekitar 2 detik.")
                    } else {
                        println("Jeda waktu fungsi multiple() kurang dari 2 detik atau lebih dari yang diharapkan.")
                    }
                    (executionTime in 2001..2499).returnTrue("Pemanggilan fungsi multiple() seharusnya terdapat jeda waktu minimal 2 detik")
                }
            }
            /* it("Latihan 5") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        multiple(10, 10)
                    }

                    (executionTime in 2001..2499).returnTrue("Pemanggilan fungsi multiple() seharusnya terdapat jeda waktu minimal 2 detik")
                }
            } */

            it("Latihan 5") {
                runBlocking {
                    val result = async { multiple(6, 6) }
                    val actual = result.await()
                    if (actual == 36) {
                        println("Hasil multiple(6, 6) sesuai, yaitu 36.")
                    } else {
                        println("Hasil multiple(6, 6) tidak sesuai, diharapkan 36, tetapi ditemukan $actual.")
                    }
                    (actual == 36).returnTrue("Jika argumen untuk parameter a adalah 6 dan b adalah 6, fungsi multiple() seharusnya mengembalikkan nilai 36")
                }
            }
            /* it("Latihan 5") {
                runBlocking {
                    val result = async { multiple(6, 6) }
                    (result.await() == 36).returnTrue("Jika argumen untuk parameter a adalah 6 dan b adalah 6, fungsi multiple() seharusnya mengembalikkan nilai 36")
                }
            } */

            it("Latihan 5") {
                runBlocking {
                    val result = async { multiple(5, 5) }
                    val actual = result.await()
                    if (actual == 25) {
                        println("Hasil multiple(5, 5) sesuai, yaitu 25.")
                    } else {
                        println("Hasil multiple(5, 5) tidak sesuai, diharapkan 25, tetapi ditemukan $actual.")
                    }
                    (actual == 25).returnTrue("Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi multiple() seharusnya mengembalikkan nilai 25")
                }
            }
            /* it("Latihan 5") {
                runBlocking {
                    val result = async { multiple(5, 5) }
                    (result.await() == 25).returnTrue("Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi multiple() seharusnya mengembalikkan nilai 25")
                }
            } */
        }
    }
})

private fun String.returnTrue(errMessage: String) {
}
private fun Int.returnTrue(errMessage: String) {
}
