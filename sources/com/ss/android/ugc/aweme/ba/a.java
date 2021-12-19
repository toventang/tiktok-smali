package com.ss.android.ugc.aweme.ba;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private boolean f67865a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1532a f67866b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f67867c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67868d;

    /* renamed from: com.ss.android.ugc.aweme.ba.a$a  reason: collision with other inner class name */
    public interface AbstractC1532a {
        static {
            Covode.recordClassIndex(41773);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(41772);
    }

    public a(AbstractC1532a aVar, EditText editText, int i2) {
        l.d(editText, "");
        this.f67866b = aVar;
        this.f67867c = editText;
        this.f67868d = i2;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        l.d(charSequence, "");
        l.d(spanned, "");
        if (i4 == i5 && l.a((Object) charSequence, (Object) "")) {
            return null;
        }
        if (i4 == i5 && this.f67865a) {
            this.f67865a = false;
            return null;
        } else if (i4 >= this.f67868d) {
            return charSequence;
        } else {
            AbstractC1532a aVar = this.f67866b;
            if (aVar != null) {
                aVar.a();
            }
            this.f67865a = true;
            this.f67867c.setText(spanned);
            return spanned.subSequence(i4, i5);
        }
    }
}
