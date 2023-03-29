fun main() {
 val fruits = listOf("banana","apple","mango","avocado")
    println(fruits)

    val zamunda = mutableListOf(1250000,"Alfayo",true,20.6,34.6f)

//    fruits.add("watermelon") // listof is for non changeable list
    zamunda.add ("Constitutional monarchy")
    zamunda.remove(34.6f)
    println(zamunda)

    //LIST INBUILT FUNCTIONS
    val numbers = listOf(45,90,5,23,43,97,43,86 ,45)
    println(numbers.count()) //counts number of elements
    println(numbers.max())
    println(numbers.min())
    println(numbers.sum())
    println(numbers.first())
    println(numbers.last())


//   var num =0

    //INDICES == list indexing
    println(numbers.get(4)) // obtaining a number by its index or use (numbers[4])
    println(numbers.indexOf(86))  //getting index of a num if you know that number abd dont know the index
    println(numbers.lastIndexOf(45)) // if this element has occured severally
    println(numbers.lastIndex) // index of the last element
    listt(listOf(34,56,89,94,67))
    digits()

    val kiwi = Product("kiwi",100.00)
    println(kiwi is Product)
    createProductList()
    filter()
    filters()





}



fun listt(numbers:List<Int>){

     var num = 0
    for (n in numbers){
        num+=n
    }
    println(num)


}
fun digits(){
    val numb = mutableListOf(87,54,32,76,51,23,56,89,)
    numb.sorted()  //.sort arranges in order without creating another list
                   // .sorted returns a copy of the elements // for this you have to create
                  // another variable to hold the new sorted array/list
    val sotredNum = numb.sorted()
    println(sotredNum)
}
data class Product(var name : String, var price :Double)

fun createProductList(){
    val prod1 = Product("iphone", 120000.0)
    val switch= Product("switch", 500.0)
    val prod3 = Product("Mango", 50.0)
    val shoe = Product("Adidas", 3500.0)

    val products = listOf(prod1,switch,prod3,shoe)
    println(products)
    val items = products.filter { product-> product.price<=5000 }  // items you can afford filter out the ones you cant afford
    println(items)

    val sorted = products.sortedBy{ product -> product.name.toLowerCase()}
    println(sorted)
    val sortedd = products.sortedByDescending{ product -> product.price}
    println(sortedd)


}
// FILTERING
fun filter(){
    val numbs = listOf(12,79,45,3,98,22,17,67,80)
    var sum = listOf<Int>()
    for (nu in numbs){
        if (nu % 2== 0){
            sum += nu
        }

    }
    println(sum)
}
fun filters() {
    val numbss = listOf(11, 78, 45, 3, 92, 21, 17, 60, 80)
    val evenNums = numbss.filter { nu -> nu % 2 == 0 }
    println(evenNums)
}




