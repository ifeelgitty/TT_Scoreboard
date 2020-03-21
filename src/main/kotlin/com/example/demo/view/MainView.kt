package com.example.demo.view

import com.example.demo.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val no_sets: Int = 5


    override val root = hbox {
        gridpane {
            row {
                label("Serve")
                label("Player")
                label("Points")
                for (i in 1..no_sets){
                    label((i).toString())
                }
                label("Sets")

            }

            row {
                label("X")
                label("Steffen")
                label("40")
                for (i in 1..no_sets){
                    label("0")
                }
                label("2")
            }

            row {
                label()
                label("Adler")
                label("15")
                for (i in 1..no_sets){
                    label("0")
                }
                label("1")
            }
        }


    }
}