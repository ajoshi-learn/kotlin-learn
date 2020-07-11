package app.chapter4

import java.io.Serializable

class Button : Clickable {
    override fun click() = println("Button clicked")
    //    override fun showOff() {
//        super<Clickable>.showOff() call specific parent
//    }
    class ButtonState : State // nested by default

    //    inner class ButtonState: State
    inner class InnerExample {
        fun getOuterReference(): Button = this@Button
    }
}

interface State : Serializable