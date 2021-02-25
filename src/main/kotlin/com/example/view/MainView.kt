package com.example.view

import com.example.Styles
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javafx.stage.StageStyle
import javafx.collections.FXCollections
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.text.Font
import java.time.LocalDate

class MainView : View("Hello TornadoFX") {

    var firstNameField: TextField by singleAssign()
    var lastNameField: TextField by singleAssign()

    override val root = vbox {
        button("Go to MyView1") {
            action {
                replaceWith<MyView1>()
            }
        }

    }

    val texasCities = FXCollections.observableArrayList(
        "Austin",
        "Dallas", "Midland", "San Antonio", "Fort Worth"
    )

    val selectedCity = SimpleStringProperty()

    val dateProperty = SimpleObjectProperty<LocalDate>()

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
            action {
                println("Logging in as ${firstNameField.text} ${lastNameField.text}")
            }
        }

        textfield("Input something") {
            textProperty().addListener { obs, old, new ->
                println("You typed: " + new)
            }
        }

        passwordfield("password123") {
            requestFocus()
        }

        combobox(selectedCity, texasCities)

        datepicker(dateProperty) {
            value = LocalDate.now()
        }

        textflow {
            text("Tornado") {
                fill = Color.PURPLE
                font = Font(20.0)
            }
            text("FX") {
                fill = Color.ORANGE
                font = Font(28.0)
            }
        }

        button("Commit") {
            tooltip("Writes input to the database") {
                font = Font.font("Verdana")
            }
        }

        button("Save") {
            action { doSave() }
            shortcut("Ctrl+S")
        }
    }

    private fun doSave() {
        TODO("Not yet implemented")
    }

    override fun onDock() {
        println("Docking MyView1!")
    }

    override fun onUndock() {
        println("Undocking MyView1!")
    }
}




