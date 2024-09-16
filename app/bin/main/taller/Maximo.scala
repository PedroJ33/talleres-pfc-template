package taller

import scala.annotation.tailrec

class Maximo {
    def maxLin(l:List[Int]): Int = {
        if (l.isEmpty) {
            throw new IllegalArgumentException("La lista no debe estar vacía")
        } else if (l.tail.isEmpty) {
            l.head  // Si la lista tiene un solo elemento, ese es el máximo
        } else {
             max(l.head , maxLin(l.tail))  // Compara el primer elemento con el máximo del resto
        }   
    }

    def maxIt(l: List[Int]): Int = {
        @tailrec
        def maxItAux(l: List[Int], max: Int): Int = {
        if (l.isEmpty) max
        else {
            maxItAux(l.tail, Math.max(l.head, max))
        }
        }
        if (l.isEmpty)
            throw new IllegalArgumentException("La lista no puede estar vacía")
        else
            maxItAux(l.tail, l.head)
    }
    def max(a: Int, b: Int): Int = if (a > b) a else b
}