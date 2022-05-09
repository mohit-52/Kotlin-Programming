import java.util.Arrays

fun main() {
    var array1 = arrayOf(2,4,6,8,10)
    var array2 = arrayOf(1,3,5,7,9)

     array1[0] += array2[0]
     array1[1] += array2[1]
     array1[2] += array2[2]
     array1[3] += array2[3]
     array1[4] += array2[4]

    println(Arrays.toString(array1))
}