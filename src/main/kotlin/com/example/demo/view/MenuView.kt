package com.example.demo.view

import com.example.demo.classes.Match
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.util.*

class MenuView: View("Create Game") {
    val player1 = SimpleStringProperty("")
    val player2 = SimpleStringProperty("")
    val sets = SimpleObjectProperty<Int>(3)
    val gamesPerSet = SimpleObjectProperty(5)

    override val root = vbox {
        form() {
            fieldset("Name of Players") {
                field("Player 1"){
                    textfield().bind(player1)
                }
                field("Player 2"){
                    textfield().bind(player2)
                }
            }
            fieldset("Options") {
                field("No of Sets"){
                    spinner(1, 5, 3, 2).bind(sets)
                }
                field("No of Games per Set"){
                    spinner(1, 11, 5, 2).bind(gamesPerSet)
                }
            }
            button("Start Match") {
                useMaxWidth = true
                enableWhen {
                    player1.isNotEmpty.and(player2.isNotEmpty)
                }
                action {
                    val firstServe: Int = listOf<Int>(0, 1).shuffled().first()
                    val match = Match(player1.get(), player2.get(), sets.get(), gamesPerSet.get(), firstServe)
                    this@MenuView.currentStage?.isMaximized = true
                    this@MenuView.replaceWith<MainView>()
                }
            }
        }
    }
}