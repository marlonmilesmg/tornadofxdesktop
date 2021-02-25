package com.example.view

import tornadofx.*

class MyView1 : View("My View") {
    override val root = vbox {
        button("Go to MyView2") {
            action {
                replaceWith<MyView2>()
            }
        }
    }
}
