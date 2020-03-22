package com.example.demo.classes

import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Match (
        p1Name: String,
        p2Name: String,
        sets: Int,
        gamesPerSet: Int,
        serve: Int,
        secServe: Boolean = false,
        setRecord: MutableList<Set> = mutableListOf<Set>(),
        currSet: Int = 1,
        currGame: Int = 1
) {
    val setRecordProperty = SimpleObjectProperty<MutableList<Set>>(setRecord)
    var setRecord by setRecordProperty
    val gamesPerSetProperty = SimpleIntegerProperty(gamesPerSet)
    var gamesPerSet by gamesPerSetProperty
    val setsProperty = SimpleIntegerProperty(sets)
    var sets by setsProperty
    val p2NameProperty = SimpleStringProperty(p2Name)
    var p2Name by p2NameProperty
    val p1NameProperty = SimpleStringProperty(p1Name)
    var p1Name by p1NameProperty
    val currSetProperty = SimpleIntegerProperty(currSet)
    var currSet by currSetProperty
    val currGameProperty = SimpleIntegerProperty(currGame)
    var currGame by currGameProperty
    val serveProperty = SimpleIntegerProperty(serve)
    var serve by serveProperty
    val secServeProperty = SimpleBooleanProperty(secServe)
    var secServe by secServeProperty


}

class MatchModel : ItemViewModel<Match>() {
    val setRecord = bind(Match::setRecordProperty)
    val gamesPerSet = bind(Match::gamesPerSetProperty)
    val sets = bind(Match::setsProperty)
    val p2Name = bind(Match::p2NameProperty)
    val p1Name = bind(Match::p1NameProperty)
    val currSet = bind(Match::currSetProperty)
    val currGame = bind(Match::currGameProperty)
    val serve = bind(Match::serveProperty)
    val secServe = bind(Match::secServeProperty)
}

