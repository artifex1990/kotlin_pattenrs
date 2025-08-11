package functional

import patterns.common.headWords

fun commonRun() {
    /*
    Extension function
     */
    val list = listOf("hellO wOrlD", null, "fRom", "", "kOtlin");
    println(list.headWords())
}