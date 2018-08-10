package edwinvanrooij.github.io.reboard_android

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Comments should explain WHY something's done
    // The code should explain HOW something's done

    val delay = 1L // delay required because of screen rendering
    showKeyboard(delay) // so we can select our own keyboard
  }

  private fun showKeyboard(delay: Long) {
    Thread(Runnable {
      Thread.sleep(delay * 1000)
      val editText: EditText = findViewById(R.id.editText)
      editText.requestFocus()

      val imm: InputMethodManager =
        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
      imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }).start()
  }

  fun onButtonClick(v: View) {
    val editText: EditText = findViewById(R.id.editText)
    val text: String = editText.text.toString() // access text by property syntax
    Toast.makeText(this, "\'%s\'".format(text), Toast.LENGTH_LONG)
        .show()
  }
}
