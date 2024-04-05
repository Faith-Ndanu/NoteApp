//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    noteApp("text")
    noteApp("words")
    noteApp("images")
    noteApp("texts")

    noteApp("deleteContent")
}
fun noteApp(notes:String,){
    if(notes=="text"){
        println("newText")
    }
    else if(notes=="words"){
        println("addText")
    }
    else if(notes=="texts"){
        println("editText")
    }
    else if(notes=="images") {
        println("addImages")
    }
    else{
        println("deleteContent")
    }

}












