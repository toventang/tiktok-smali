package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.i;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(39981);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f65060a;

        static {
            Covode.recordClassIndex(39983);
        }

        b(EditText editText) {
            this.f65060a = editText;
        }

        public final void run() {
            this.f65060a.requestFocus();
            KeyboardUtils.b(this.f65060a);
        }
    }

    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f65058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f65059b;

        static {
            Covode.recordClassIndex(39982);
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            this.f65059b.a(this.f65058a.getId(), editable);
        }

        a(EditText editText, p pVar) {
            this.f65058a = editText;
            this.f65059b = pVar;
        }
    }

    public static final void a(EditText editText) {
        l.d(editText, "");
        editText.postDelayed(new b(editText), 500);
    }

    public static final boolean b(EditText editText) {
        l.d(editText, "");
        return TextUtils.isEmpty(editText.getText());
    }

    public static final void a(EditText editText, p pVar) {
        l.d(editText, "");
        l.d(pVar, "");
        editText.addTextChangedListener(new a(editText, pVar));
    }
}
