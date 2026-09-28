fun main(args:Array<String>) {
    val clickListener = ClickListener
    val loginButton = Button("Sign up",1212,object:onClickListener {
        override fun onClick()
    })
    val signUpButton = Button("Log in",1234,object :OnClickListener {
        override fun onClick()
    })
}

class Button(val text:String, val int:Int,onClickListener:OnClickListener) 

class ClickListener:OnClickListener {
    override fun onClick(): kotlin.Unit {
        TODO("Not yet implemented")
    }
}


interface OnClickListener {
    fun onClick()
}