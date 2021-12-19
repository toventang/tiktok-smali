package com.bytedance.ies.xelement.input.b;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private final NoCopySpan[] f37134a;

    static {
        Covode.recordClassIndex(22337);
    }

    public c(NoCopySpan... noCopySpanArr) {
        l.c(noCopySpanArr, "");
        this.f37134a = noCopySpanArr;
    }

    public final Editable newEditable(CharSequence charSequence) {
        l.c(charSequence, "");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (NoCopySpan noCopySpan : this.f37134a) {
            valueOf.setSpan(noCopySpan, 0, charSequence.length(), 18);
        }
        l.a((Object) valueOf, "");
        return valueOf;
    }
}
