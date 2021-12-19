package com.ss.android.ugc.aweme.challenge;

import android.text.SpannableString;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(43110);
    }

    public static SpannableString a(SpannableString spannableString, int i2, int i3) {
        return new SpannableString(((Object) spannableString.subSequence(0, i2 - i3)) + "...");
    }
}
