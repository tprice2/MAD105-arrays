/*
Pseudocode
Variables: Supplies, i

Process:
Initialize an array variable called supplies with a list of food items
Initialize a counter variable called i
While this counter is less than the length of the array, print each value.
By doing this, every value in the array is printed.
 */
fun main(){
    val supplies = arrayOf<String>("Bun", "Meat","Lettuce","Cheese","Ketchup")
    var i = 0

    while (i < supplies.size) {
        println(supplies[i])
        i++
    }
}