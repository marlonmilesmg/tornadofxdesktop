package com.example.view

import tornadofx.*

class MyView2 : View("My View") {
    override val root = vbox {
        button("Go to MainView") {
            action {
                replaceWith<MainView>()
            }
        }
    }
}
