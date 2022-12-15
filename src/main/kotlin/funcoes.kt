fun sum(x: Int, y: Int): Int = (x+y)
fun printMessageWithPrefix(vararg Message: String, prefix: String ="sei lá" ){
    for(m in Message) println(prefix + Message)
}







fun main(){
    sum(4,5)
    printMessageWithPrefix("oi", "calma cara", "ela é linda")
    printMessageWithPrefix("ela é linda", "amo ela" )


}