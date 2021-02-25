package com.example.view

import com.example.Styles
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javafx.stage.StageStyle
import javafx.collections.FXCollections
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.control.Button

class MainView : View("Hello TornadoFX") {
    override val root = vbox {
        button("Go to MyView1") {
            action {
                replaceWith<MyView1>()
            }
        }

    }

    init {
        with(root) {
            button("Press Me") {
                textFill = Color.RED
                action { println("Button pressed!") }
            }
        }

        hbox {
            label("First Name")
            textfield()
        }
        hbox {
            label("Last Name")
            textfield()
        }
        button("LOGIN") {
            useMaxWidth = true
        }
    }

    override fun onDock() {
        println("Docking MyView1!")
    }

    override fun onUndock() {
        println("Undocking MyView1!")
    }
}




