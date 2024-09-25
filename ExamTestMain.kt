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
import kotlin.test.assertEquals // Pastikan import ini ada untuk penggunaan assertEquals

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

class ExamTestMain : Spek({
    group("Pengujian otomatis latihan") {
        describe("Pengecekkan Latihan 1") {
            it("Latihan 1 - Kasus 2") {
                assertEquals(true, isEvenNumber(2), "Jika argumennya adalah 2, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1 - Kasus 6") {
                assertEquals(true, isEvenNumber(6), "Jika argumennya adalah 6, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1 - Kasus 7") {
                assertEquals(false, isEvenNumber(7), "Jika argumennya adalah 7, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1 - Kasus 1") {
                assertEquals(false, isEvenNumber(1), "Jika argumennya adalah 1, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            }

            for (number in 1..99 step 2) {
                it("Latihan 1 - Kasus Bilangan Ganjil $number") {
                    assertEquals(false, isEvenNumber(number), "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
                }
            }

            for (number in 0..100 step 2) {
                it("Latihan 1 - Kasus Bilangan Genap $number") {
                    assertEquals(true, isEvenNumber(number), "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
                }
            }

            it("Latihan 1 - Kasus 1") {
                assertEquals(false, moreThanFive(1), "Jika argumennya adalah 1, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1 - Kasus 3") {
                assertEquals(false, moreThanFive(3), "Jika argumennya adalah 3, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1 - Kasus 5") {
                assertEquals(false, moreThanFive(5), "Jika argumennya adalah 5, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1 - Kasus 10") {
                assertEquals(true, moreThanFive(10), "Jika argumennya adalah 10, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1 - Kasus 30") {
                assertEquals(true, moreThanFive(30), "Jika argumennya adalah 30, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1 - Hasil 20") {
                val expect = com.dicoding.exam.exam1.result(20)
                assertEquals(600, expect, "Jika argumennya adalah 20, fungsi result() seharusnya mengembalikkan nilai 600")
            }
        }

        describe("Latihan 2") {
            it("Latihan 2 - Kasus Normal") {
                val result = calculate(101, 52, 99)
                assertEquals(54, result, "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `99`, fungsi calculate() seharusnya mengembalikkan nilai 54")
            }

            it("Latihan 2 - Kasus Null") {
                val result = calculate(101, 52, null)
                assertEquals(103, result, "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `null`, fungsi calculate() seharusnya mengembalikkan nilai 103")
            }

            it("Latihan 2 - Hasil 103") {
                val result = result(103)
                assertEquals("Result is 103", result, "Jika argumennya adalah 103, fungsi result() seharusnya mengembalikkan pesan `Result is 103`")
            }
        }

        describe("Pengecekkan latihan 3") {
            it("Latihan 3 - Kasus Integer") {
                val result = checkType(50)
                assertEquals("Yes! it's Integer", result, "Jika argumennya adalah `50`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Integer`")
            }

            it("Latihan 3 - Kasus Boolean") {
                val result = checkType(true)
                assertEquals("Yes! it's Boolean", result, "Jika argumennya adalah `true`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Boolean`")
            }

            it("Latihan 3 - Kasus String") {
                val result = checkType("Dicoding Indonesia")
                assertEquals("Yes! it's String", result, "Jika argumennya adalah `Dicoding Indonesia`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's String`")
            }

            it("Latihan 3 - Kasus Double") {
                val result = checkType(1.0)
                assertEquals("Yes! it's Double", result, "Jika argumennya adalah `1.0`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Double`")
            }

            it("Latihan 3 - Kasus List") {
                val result = checkType(listOf<String>())
                assertEquals("Yes! it's List", result, "Jika argumennya adalah `listOf<String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's List`")
            }

            it("Latihan 3 - Kasus Map") {
                val result = checkType(mapOf<String, String>())
                assertEquals("Yes! it's Map", result, "Jika argumennya adalah `mapOf<String, String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Map`")
            }
        }

        describe("Pengecekkan latihan 4") {
            it("Latihan 4 - Tipe Data") {
                val vehicle = vehicle()
                (vehicle is Map<*, *>).returnTrue("Fungsi vehicle() seharusnya mengembalikkan nilai dengan tipe data Map<>")
            }

            it("Latihan 4 - Key Type") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                (vehicle["type"] != null && vehicle["type"] == "motorcycle").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `type` dengan nilai `motorcycle`")
            }

            it("Latihan 4 - Key Max Speed") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                (vehicle["maxSpeed"] != null && vehicle["maxSpeed"] == "230Km/s").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxSpeed` dengan nilai `230Km/s`")
            }

            it("Latihan 4 - Key Max Tank") {
                val vehicle: Map<String, String> = vehicle() as Map<String, String>
                (vehicle["maxTank"] != null && vehicle["maxTank"] == "100Ltr").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxTank` dengan nilai `100Ltr`")
            }
        }

        describe("Pengecekkan latihan 5") {
            it("Latihan 5 - Waktu Sum") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        sum(10, 10)
                    }

                    (executionTime in 3001..3499).returnTrue("Pemanggilan fungsi sum() seharusnya terdapat jeda waktu minimal 3 detik")
                }
            }

            it("Latihan 5 - Asynchronous Sum") {
                runBlocking {
                    val result = async { sum(5, 5) }
                    assertEquals(10, result.await(), "Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi sum() seharusnya mengembalikkan nilai 10")
                }
            }

            it("Latihan 5 - Multiple") {
                val result = multiple(3, 5)
                assertEquals(15, result, "Jika argumen untuk parameter a adalah 3 dan b adalah 5, fungsi multiple() seharusnya mengembalikkan nilai 15")
            }
        }
    }
})
