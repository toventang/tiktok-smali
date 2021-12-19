package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;

public final class bl {
    static {
        Covode.recordClassIndex(86628);
    }

    public static String a(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        if (strArr == null) {
            return sb.toString();
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            sb.append(strArr[i2]);
            if (i2 != strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static SpannableString a(SpannableString spannableString, int i2, int i3, int i4) {
        int max = Math.max(0, i2);
        if (!TextUtils.isEmpty(spannableString) && max <= i3 && max < spannableString.length() && i3 <= spannableString.length()) {
            spannableString.setSpan(new ForegroundColorSpan(i4), max, i3, 17);
        }
        return spannableString;
    }
}
