package com.ss.android.ugc.aweme.common;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class ae implements InputFilter {
    static {
        Covode.recordClassIndex(47142);
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        l.d(charSequence, "");
        String obj = charSequence.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        if (!TextUtils.isEmpty(p.b((CharSequence) obj).toString()) || charSequence.length() <= 0 || i4 != 0) {
            return null;
        }
        return "";
    }
}
