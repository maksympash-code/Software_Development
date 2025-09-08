fun main() {
    // && - and
    // || - or

    val withFriends = true
    val isSunnyDay = true
    val isHighTemp = false
//    val goOut = isSunnyDay && isHighTemp // 1 && 1 = 1, else = 0
//    val goOut = isSunnyDay || isHighTemp // 0 || 0 = 0, else = 1

    val goOut = (isSunnyDay || isHighTemp) && withFriends


    if (goOut){
        println("Go out and play")
    }
    else{
        println("Stay in home and watch movies")
    }


}