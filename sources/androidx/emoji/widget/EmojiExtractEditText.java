package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;

public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: a  reason: collision with root package name */
    private b f2819a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2820b;

    static {
        Covode.recordClassIndex(992);
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().f2824c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().f2823b;
    }

    private b getEmojiEditTextHelper() {
        if (this.f2819a == null) {
            this.f2819a = new b(this);
        }
        return this.f2819a;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    public void setMaxEmojiCount(int i2) {
        getEmojiEditTextHelper().a(i2);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setEmojiReplaceStrategy(int i2) {
        b emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.f2824c = i2;
        emojiEditTextHelper.f2822a.b(i2);
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.f2820b) {
            this.f2820b = true;
            setMaxEmojiCount(new a(this, attributeSet).f2821a);
            setKeyListener(super.getKeyListener());
        }
    }
}
