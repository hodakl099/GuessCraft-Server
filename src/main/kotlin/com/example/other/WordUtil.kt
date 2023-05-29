package com.example.other

import io.ktor.application.*
import java.io.File

val words = ApplicationCallPipeline.ApplicationPhase::class.java.classLoader.getResource("wordlist.txt")?.let { readWordList(it.path) }


fun readWordList(fileName: String): List<String> {
    val inputStream = File(fileName).inputStream()
    val words = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { words.add(it) }
    return words
}

fun getRandomWords(amount: Int): List<String> {
    var curAmount = 0
    val result = mutableListOf<String>()
    while(curAmount < amount) {
        val word = words?.random()
        if(!result.contains(word)) {
            result.add(word!!)
            curAmount++
        }
    }
    return result
}

fun String.transformToUnderscores() =
    toCharArray().map {
        if(it != ' ') '_' else ' '
    }.joinToString(" ")