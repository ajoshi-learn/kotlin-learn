package app.chapter4

sealed class Interface {
    class FirstChild(val value: Int) : Interface()
    class SecondChild(val left: Interface, val right: Interface) : Interface()
}