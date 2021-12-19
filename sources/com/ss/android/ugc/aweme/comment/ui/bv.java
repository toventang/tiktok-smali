package com.ss.android.ugc.aweme.comment.ui;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.h;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public final class bv implements h {

    /* renamed from: a  reason: collision with root package name */
    public int f72637a;

    /* renamed from: b  reason: collision with root package name */
    private EditText f72638b;

    /* renamed from: c  reason: collision with root package name */
    private InputConnection f72639c;

    /* renamed from: d  reason: collision with root package name */
    private dd f72640d;

    static {
        Covode.recordClassIndex(44748);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.h
    public final void b() {
        this.f72640d.e();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.h
    public final void a() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        InputConnection inputConnection = this.f72639c;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        } else {
            this.f72638b.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.h
    public final void a(int i2) {
        this.f72640d.b(i2);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.h
    public final void a(String str, int i2) {
        if (this.f72638b.getText().length() + str.length() > this.f72637a) {
            new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(com.ss.android.ugc.aweme.framework.d.a.f96678a.getResources().getString(R.string.fl5, Integer.valueOf(this.f72637a))).a();
            return;
        }
        if (i2 == 2) {
            this.f72640d.a(str, i2);
        }
        int selectionStart = this.f72638b.getSelectionStart();
        int selectionEnd = this.f72638b.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.f72638b.getText().insert(max, str);
        } else {
            try {
                this.f72638b.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException e2) {
                e2.printStackTrace();
            }
        }
        int length = max + str.length();
        if (length >= this.f72638b.length()) {
            EditText editText = this.f72638b;
            editText.setSelection(editText.length());
            return;
        }
        this.f72638b.setSelection(length);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.h
    public final void a(com.ss.android.ugc.aweme.emoji.b.a aVar, int i2, int i3) {
        this.f72640d.a(aVar.f89106d, i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.h
    public final void b(com.ss.android.ugc.aweme.emoji.b.a aVar, int i2, int i3) {
        this.f72640d.b(aVar.f89106d, i2, i3);
    }

    public bv(EditText editText, int i2, dd ddVar) {
        this.f72638b = editText;
        this.f72639c = editText.onCreateInputConnection(new EditorInfo());
        this.f72637a = i2;
        this.f72640d = ddVar;
    }
}
