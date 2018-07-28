package edwinvanrooij.github.io.reboard_android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edwinvanrooij.github.io.reboard_android.bus.MessageBus
import edwinvanrooij.github.io.reboard_android.bus.MessageHandler

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

  }

  fun onButtonClick(v: View) {
//    val editText: EditText = findViewById(R.id.editText)
//    val text: String = editText.text.toString() // access text by property syntax
//
//    Toast.makeText(this, "\'%s\'".format(text), Toast.LENGTH_LONG)
//        .show()


  }
}
