package com.example.demo.app

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight
import javafx.scene.text.TextAlignment
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val serve by cssclass()
        val name by cssclass()
        val points by cssclass()
        val games by cssclass()
        val sets by cssclass()

    }

    init {
        label and heading {
            padding = box(30.px)
            fontSize = 50.px
            fontStyle = FontPosture.ITALIC
            fontWeight = FontWeight.SEMI_BOLD
            backgroundColor += Color.BLACK
            textFill = Color.ANTIQUEWHITE
        }

        serve {
            padding = box(30.px)
            fontSize = 50.px
            fontWeight = FontWeight.BOLD
            alignment = Pos.CENTER
            fitToWidth = true
            fillWidth = true
            backgroundColor += Color.STEELBLUE
            textFill = Color.ANTIQUEWHITE
        }

        name {
            padding = box(30.px)
            fontSize = 50.px
            fontWeight = FontWeight.MEDIUM
            fontStyle = FontPosture.ITALIC
            textAlignment = TextAlignment.CENTER
            backgroundColor += Color.STEELBLUE
            textFill = Color.ANTIQUEWHITE
        }

        points {
            padding = box(30.px)
            fontSize = 50.px
            fontWeight = FontWeight.EXTRA_BOLD
            fontStyle = FontPosture.ITALIC
            alignment = Pos.CENTER
            backgroundColor += Color.WHITE
        }

        games {
            padding = box(30.px)
            fontSize = 50.px
            fontWeight = FontWeight.BOLD
            fontStyle = FontPosture.ITALIC
            textFill = Color.ANTIQUEWHITE
            backgroundColor += Color.STEELBLUE
        }

        sets {
            padding = box(30.px)
            fontSize = 50.px
            fontWeight = FontWeight.EXTRA_BOLD
            fontStyle = FontPosture.ITALIC
            alignment = Pos.CENTER
            backgroundColor += Color.INDIANRED
            textFill = Color.ANTIQUEWHITE
        }
    }
}