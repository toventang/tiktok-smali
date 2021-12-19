package com.ss.android.ugc.aweme.im.sdk.relations.b;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class d {
    static {
        Covode.recordClassIndex(66012);
    }

    public static SpannableString a(int i2, String str, String str2, int i3) {
        if (str2.contains(".")) {
            str2 = str2.replace(".", "\\.");
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            Matcher matcher = Pattern.compile(str2).matcher(spannableString);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (start >= i3) {
                    spannableString.setSpan(new ForegroundColorSpan(i2), start, end, 33);
                }
            }
            return spannableString;
        } catch (PatternSyntaxException e2) {
            e2.printStackTrace();
            return spannableString;
        }
    }
}
