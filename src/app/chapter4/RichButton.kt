package app.chapter4

open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {} // can be overwritten
    final override fun click() {} // open by default
}