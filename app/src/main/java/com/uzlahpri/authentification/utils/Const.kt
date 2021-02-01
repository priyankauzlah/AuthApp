package com.uzlahpri.authentification.utils

object Const {

    val COLLECTION_PATH = "recipe"

    fun setTimeStamp (): Long{
        val time = (-1*System.currentTimeMillis())
        return time
    }
}