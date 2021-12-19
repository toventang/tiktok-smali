package com.ss.android.ugc.aweme.kids.setting.base.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.setting.items.language.d.c;

public final class a {
    static {
        Covode.recordClassIndex(68306);
    }

    public static String a(Context context) {
        String language = c.a(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }
}
