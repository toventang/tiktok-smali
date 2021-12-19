package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class f {
    static {
        Covode.recordClassIndex(88784);
    }

    public static String a(Context context) {
        Locale locale;
        if (context == null) {
            return "zh-CN";
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            return locale.getLanguage() + "-" + locale.getCountry();
        } catch (Exception unused) {
            return "zh-CN";
        }
    }
}
