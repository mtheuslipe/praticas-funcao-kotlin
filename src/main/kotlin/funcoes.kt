fun printNumbersAndSum(x: Int, y: Int): Int{
    println(x)
    println(y)
    var sum: Int= x+y
    println(sum)
    return(sum)
}
fun printMessageWithPrefix(vararg Message: String, prefix: String ="sei lá" ){
    for(m in Message) println(prefix + m)
}
fun main(){
    printNumbersAndSum(4,5)
    printMessageWithPrefix(" oi", " calma cara", " ela é linda")
    printMessageWithPrefix(" ela é linda", " amo ela" )


}