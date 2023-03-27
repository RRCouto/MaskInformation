package com.example.maskInformation.service

class MaskInformation {
    fun maskInformation(info: String?, posInitial: Int?, finalInitial: Int?): String{
        if (info.isNullOrEmpty()) {
            throw error("informações incorretas")
        }
        if (posInitial == null) {
            throw error("informações incorretas")
        }
        if (finalInitial == null){
            throw error("informações incorretas")
        }
        val maxSizeMask = posInitial + finalInitial
        var resultado = info.toString()
        if(maxSizeMask > resultado.length){
            throw error("quantidade para mascarar maior que a informação")
        }
        var i = 0
        while (i < posInitial){
            resultado = resultado.replaceRange(i,i+1,"*")
            i++
        }
        var j = 0
        while (j < finalInitial) {
            resultado = resultado.replaceRange(info.length - (j+1), info.length - (j), "*")
            j++
        }
        return resultado
    }
}