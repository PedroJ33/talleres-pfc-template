package taller

class TorresHanoi {
    def movsTorresHanoi(n: Int): BigInt = {
        if (n == 0) {
            0  // Si no hay discos, no hay movimientos
        } else {
            2 * movsTorresHanoi(n - 1) + 1  // Mover n-1 discos, luego mover el disco grande, y finalmente los n-1 discos restantes
        }
    }
     
    def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
        if (n == 0) {
            List()  // Si no hay discos, no hay movimientos
        } else {
            // Movemos n-1 discos de t1 a t2 usando t3 como auxiliar
            val movimientos1 = torresHanoi(n - 1, t1, t3, t2)
    
            // Movemos el disco n de t1 a t3
            val movimientoDisco = (t1, t3)
    
            // Movemos n-1 discos de t2 a t3 usando t1 como auxiliar
            val movimientos2 = torresHanoi(n - 1, t2, t1, t3)
    
            // Combinamos los movimientos
            movimientos1 ++ List(movimientoDisco) ++ movimientos2
            }

    }
}