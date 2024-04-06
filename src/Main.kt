//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val notes = NoteApp("writeText","createWords","editText","blue","newText","addImages")
    notes.images()
    notes.text()
    notes.color()
    notes.words()
    notes.edit()
}

class NoteApp(var text: String, var words: String, var edit: String, var color: String, var words2:String,var images:String) {
    fun text() {
        if (text == "writeText") {
            println("saveText")
        } else {
            println("unSaved")
        }
    }
    fun words() {
        if (words == "createWords") {
            println("addedWords")
        } else {
            println("NoNotes")
        }
    }
    fun images() {
        if (images == "image") {
            println("imageAdded")
        } else {
            println("ImageNotFound")
        }
    }
    fun edit() {
        if (edit == "editText") {
            println("edit and add content")
        } else {
            println("viewContent")
        }
    }
    fun color() {
        if (words2 == "new") {
            println("changeColor")
        } else {
            println("normalColor")
        }


    }
}












