package com.example.demo.view

import com.example.demo.app.Styles
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val no_sets: Int = 5


    override val root =vbox {
        useMaxHeight = true
        background = Background(BackgroundFill(Color.LIGHTSTEELBLUE, CornerRadii(3.toDouble()), Insets.EMPTY))
        alignment = Pos.CENTER
        hbox {

            alignment = Pos.BASELINE_CENTER
            vbox {
                label("Serve") {
                    useMaxWidth = true
                    addClass(Styles.heading)
                }
                label("X") {
                    useMaxWidth = true
                    addClass(Styles.serve)
                }
                label() {
                    useMaxWidth = true
                    addClass(Styles.serve)
                }
            }

            vbox {
                label("Player") {
                    useMaxWidth = true
                    addClass(Styles.heading)
                }
                label("Steffen") {
                    useMaxWidth = true
                    addClass(Styles.name)
                }
                label("Adler") {
                    useMaxWidth = true
                    addClass(Styles.name)
                }

            }

            vbox {
                label("Points") {
                    useMaxWidth = true
                    addClass(Styles.heading)
                }
                label("40") {
                    useMaxWidth = true
                    addClass(Styles.points)
                }
                label("15") {
                    useMaxWidth = true
                    addClass(Styles.points)
                }
            }

            for (i in 1..no_sets) {
                vbox {
                    label((i).toString()) {
                        useMaxWidth = true
                        addClass(Styles.heading)
                    }
                    label("0") {
                        useMaxWidth = true
                        addClass(Styles.games)
                    }
                    label("0") {
                        useMaxWidth = true
                        addClass(Styles.games)
                    }
                }
            }

            vbox {
                label("Sets") {
                    useMaxWidth = true
                    addClass(Styles.heading)
                }
                label("3") {
                    useMaxWidth = true
                    addClass(Styles.sets)
                }
                label("1") {
                    useMaxWidth = true
                    addClass(Styles.sets)
                }
            }

            /*gridpane {
            row {
                label("Serve") {
                    addClass(Styles.heading)
                }
                label("Player") {
                    addClass(Styles.heading)
                }
                label("Points"){
                    addClass(Styles.heading)
                }
                for (i in 1..no_sets){
                    label((i).toString()) {
                        addClass(Styles.heading)
                    }
                }
                label("Sets") {
                    addClass(Styles.heading)
                }

            }

            row {
                label("X") {
                    addClass(Styles.serve)
                }
                label("Steffen") {
                    addClass(Styles.name)
                }
                label("40") {
                    addClass(Styles.points)
                }
                for (i in 1..no_sets){
                    label("0"){
                        addClass(Styles.games)
                    }
                }
                label("2"){
                    addClass(Styles.sets)
                }
            }

            row {
                label() {
                    addClass(Styles.serve)
                }
                label("Adler") {
                    addClass(Styles.name)
                }
                label("15") {
                    addClass(Styles.points)
                }
                for (i in 1..no_sets){
                    label("0") {
                        addClass(Styles.games)
                    }
                }
                label("1") {
                    addClass(Styles.sets)
                }
            }
        }
        */

        }
    }
}