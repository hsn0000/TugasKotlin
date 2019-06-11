package com.example.tugasmaterikotlin


class Konstanta {
    companion object {
        var username: String = ""
            get() = field
            set(value) {
                field = value
            }
        lateinit var jk: String

        fun setJK(jk : String){
            this.jk = jk
        }

        fun getJK() : String{
            return this.jk
        }
    }
}