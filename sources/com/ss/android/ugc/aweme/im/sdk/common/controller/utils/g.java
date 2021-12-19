package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f102412a;

    /* renamed from: b  reason: collision with root package name */
    public final List<CharSequence> f102413b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<Object[]> f102414c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Context f102415d;

    static {
        Covode.recordClassIndex(65561);
    }

    public final Spanned a() {
        int i2;
        CharSequence charSequence = this.f102412a;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i3 = 0;
            int i4 = 0;
            while (i3 < charSequence.length()) {
                if (charSequence.charAt(i3) == '%' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == 's') {
                    i3 += 2;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(this.f102413b.get(i4));
                    int length2 = spannableStringBuilder.length();
                    for (Object obj : this.f102414c.get(i4)) {
                        spannableStringBuilder.setSpan(obj, length, length2, 33);
                    }
                    i4++;
                } else {
                    spannableStringBuilder.append(charSequence.charAt(i3));
                    i3++;
                }
            }
            return spannableStringBuilder;
        }
        throw new NullPointerException("string can not be null");
    }

    public g(Context context) {
        l.d(context, "");
        this.f102415d = context;
    }
}
