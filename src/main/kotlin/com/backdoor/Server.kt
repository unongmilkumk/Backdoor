package com.backdoor

import java.io.*
import java.net.ServerSocket

fun main() {
    try {
        val ss = ServerSocket(1234)
        val socket = ss.accept()
        val din = DataInputStream(socket.getInputStream())
        val dout = DataOutputStream(socket.getOutputStream())

        while (din != null) {
            val br = BufferedReader(InputStreamReader(System.`in`))
            dout.writeUTF(br.readLine())
            val msg = din.readUTF()
            println(msg)
        }
    } catch (e : IOException) {
        e.printStackTrace()
    }
}
