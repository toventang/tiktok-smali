package com.ss.android.ugc.aweme.comment.widget;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public final class c implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final int f73042a;

    static {
        Covode.recordClassIndex(44985);
    }

    public c(int i2) {
        this.f73042a = i2;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int length = this.f73042a - (spanned.length() - (i5 - i4));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(com.ss.android.ugc.aweme.framework.d.a.f96678a.getResources().getString(R.string.fl5, Integer.valueOf(this.f73042a))).a();
            }
            return "";
        } else if (length >= i3 - i2) {
            return null;
        } else {
            int i6 = length + i2;
            if (!Character.isHighSurrogate(charSequence.charAt(i6 - 1)) || i6 - 1 != i2) {
                new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(com.ss.android.ugc.aweme.framework.d.a.f96678a.getResources().getString(R.string.fl5, Integer.valueOf(this.f73042a))).a();
                return charSequence.subSequence(i2, i6);
            }
            new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(com.ss.android.ugc.aweme.framework.d.a.f96678a.getResources().getString(R.string.fl5, Integer.valueOf(this.f73042a))).a();
            return "";
        }
    }
}
