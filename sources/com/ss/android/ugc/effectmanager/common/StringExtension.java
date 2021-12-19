package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public final class StringExtension {
    static {
        Covode.recordClassIndex(95256);
    }

    private StringExtension() {
    }

    static int lastIndexOfRegex(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i2 = -1;
        while (matcher.find()) {
            i2 = matcher.start();
        }
        return i2;
    }

    static int lastIndexOfRegex(String str, String str2, int i2) {
        return lastIndexOfRegex(str.substring(0, i2), str2);
    }
}
