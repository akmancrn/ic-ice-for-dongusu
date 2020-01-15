package com.example.myapplication


import java.io.PrintStream
import java.util.Scanner
import java.util.*

fun main (args : Array<String>)
{
   val range1 = 0..10
   val range2 = 0..10
   var carpım : Int

   for(i in range1)
   {
      for(j in range2)
      {
         carpım = i * j
         println("$i * $j = $carpım")
      }
      println(" ")
   }
}
