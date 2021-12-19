package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public class TTPatternUtil {
    static {
        Covode.recordClassIndex(103402);
    }

    public static boolean isPatternStringValid(String str) {
        try {
            Pattern.compile(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
