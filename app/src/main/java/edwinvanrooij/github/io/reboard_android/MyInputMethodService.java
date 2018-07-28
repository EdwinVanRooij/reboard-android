package edwinvanrooij.github.io.reboard_android;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Toast;

public class MyInputMethodService extends InputMethodService
    implements KeyboardView.OnKeyboardActionListener {

  @Override
  public View onCreateInputView() {
    // get the KeyboardView and add our Keyboard layout to it
    KeyboardView keyboardView =
        (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard_view, null);
    Keyboard keyboard = new Keyboard(this, R.xml.number_pad);
    keyboardView.setKeyboard(keyboard);
    keyboardView.setOnKeyboardActionListener(this);
    return keyboardView;
  }

  @Override
  public void onKey(int primaryCode, int[] keyCodes) {
    final int JOIN = -500;
    InputConnection ic = getCurrentInputConnection();
    if (ic == null) return;
    switch (primaryCode) {
      case Keyboard.KEYCODE_DELETE:
        ic.deleteSurroundingText(1, 0);
        ic.commitText("", 1);
        break;
      case JOIN:
        Toast.makeText(this, "Joining!", Toast.LENGTH_SHORT).show();
        break;
      default:
        char code = (char) primaryCode;
        ic.commitText(String.valueOf(code), 1);
    }
  }

  @Override
  public void onPress(int primaryCode) {
  }

  @Override
  public void onRelease(int primaryCode) {
  }

  @Override
  public void onText(CharSequence text) {
  }

  @Override
  public void swipeLeft() {
  }

  @Override
  public void swipeRight() {
  }

  @Override
  public void swipeDown() {
  }

  @Override
  public void swipeUp() {
  }
}
