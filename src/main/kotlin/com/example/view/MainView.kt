package com.example.view

import com.example.Styles
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javafx.stage.StageStyle
import javafx.collections.FXCollections
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane

class MainView : View("Hello TornadoFX") {
    override val root = vbox {
        button("Go to MyView1") {
            action {
                replaceWith<MyView1>()
            }
        }
    }
    }


