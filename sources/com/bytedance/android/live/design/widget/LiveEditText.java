package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.emoji.widget.b;
import com.bytedance.android.live.design.a;
import com.bytedance.android.live.design.widget.b.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LiveEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9570a = a.C0139a.f9358a.a();

    /* renamed from: b  reason: collision with root package name */
    private b f9571b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9572c;

    /* renamed from: d  reason: collision with root package name */
    private e f9573d;

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().f2823b;
    }

    static {
        Covode.recordClassIndex(4852);
    }

    private b getEmojiEditTextHelper() {
        if (this.f9571b == null) {
            this.f9571b = new b(this);
        }
        return this.f9571b;
    }

    public LiveEditText(Context context) {
        this(context, null);
    }

    public void setMaxEmojiCount(int i2) {
        getEmojiEditTextHelper().a(i2);
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        this.f9573d.a(i2);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (f9570a) {
            return getEmojiEditTextHelper().a(onCreateInputConnection, editorInfo);
        }
        return onCreateInputConnection;
    }

    public void setKeyListener(KeyListener keyListener) {
        if (f9570a && keyListener != null) {
            keyListener = getEmojiEditTextHelper().a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveEditText(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.sf);
        if (!this.f9572c) {
            this.f9572c = true;
            e eVar = new e(this);
            this.f9573d = eVar;
            eVar.a(attributeSet, R.attr.sf, 0);
            if (f9570a) {
                setMaxEmojiCount(Integer.MAX_VALUE);
                setKeyListener(super.getKeyListener());
            }
        }
    }
}
