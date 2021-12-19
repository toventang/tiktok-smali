package androidx.emoji.widget;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji.a.a;
import com.bytedance.covode.number.Covode;

final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f2830a;

    static {
        Covode.recordClassIndex(999);
    }

    public final boolean deleteSurroundingText(int i2, int i3) {
        if (a.a((InputConnection) this, this.f2830a.getEditableText(), i2, i3, false) || super.deleteSurroundingText(i2, i3)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        if (a.a((InputConnection) this, this.f2830a.getEditableText(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3)) {
            return true;
        }
        return false;
    }

    d(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f2830a = textView;
        a a2 = a.a();
        if (a2.d() && editorInfo != null && editorInfo.extras != null) {
            a2.f2744a.a(editorInfo);
        }
    }
}
