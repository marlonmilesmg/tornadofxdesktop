package com.example.view

import tornadofx.*

class MyView1 : View("My View") {

    override val root = vbox {
        button("Go to MyView2") {
            action {
                replaceWith(MyView2::class, ViewTransition.Slide(5.3.seconds, ViewTransition.Direction.LEFT))
            }
        }
    }

    override fun onDock() {
        println("Docking MyView2!")
    }

    override fun onUndock() {
        println("Undocking MyView2!")
    }
}
