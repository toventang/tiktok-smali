package com.bytedance.android.live.core.f;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import com.bytedance.covode.number.Covode;

public final class ab {
    static {
        Covode.recordClassIndex(4608);
    }

    public static SpannableString a(String str, int i2, int i3) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.6777f), i2, i3, 18);
        return spannableString;
    }
}
