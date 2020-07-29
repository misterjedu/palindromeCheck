fun main (){
   println( checkPalindrome("eye for of  eye."))
}

fun checkPalindrome(word: String): Boolean{

    var converted = word.toLowerCase().filter { it.isLetterOrDigit() }

    var reversedString = ""

    for(i in converted.length-1 downTo 0 ){
        reversedString += converted[i]
    }

    return converted == reversedString
}



