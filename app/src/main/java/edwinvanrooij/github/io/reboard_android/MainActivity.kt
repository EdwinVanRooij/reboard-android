package edwinvanrooij.github.io.reboard_android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  /**
   * Called on 'Create Track Event' button click
   */
  fun onButtonClick(v: View) {
    val editText: EditText = findViewById(R.id.editText)
    val text: String = editText.text.toString() // access text by property syntax

    Toast.makeText(this, "\'%s\'".format(text), Toast.LENGTH_LONG)
        .show()
  }
}
