package kr.lago.logger

import android.util.Log

class Logger {

    companion object {

        private lateinit var TAG: String
        private var debugType: Boolean = false

        fun init(debugType: Boolean, TAG: String) {
            this.debugType = debugType
            this.TAG = TAG
        }

        fun v(message: String) {
            if (debugType) Log.v(TAG, buildLogMsg(message))
        }

        fun d(message: String) {
            if (debugType) Log.d(TAG, buildLogMsg(message))
        }

        fun e(message: String) {
            if (debugType) Log.e(TAG, buildLogMsg(message))
        }

        fun i(message: String) {
            if (debugType) Log.i(TAG, buildLogMsg(message))
        }

        private fun buildLogMsg(message: String): String {

            val ste: StackTraceElement = Thread.currentThread().stackTrace[4]
            val stb = StringBuilder()

            stb.append("[")
            stb.append(ste.fileName.replace("kt", ""))
            stb.append("::")
            stb.append(ste.methodName)
            stb.append("]")
            stb.append(message)

            return stb.toString()
        }

    }
}