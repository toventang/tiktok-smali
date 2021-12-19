package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import java.util.Locale;

public final class en {
    static {
        Covode.recordClassIndex(93488);
    }

    public static Locale a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.a().getResources().getConfiguration().getLocales().get(0);
        }
        return d.a().getResources().getConfiguration().locale;
    }

    public static boolean b() {
        if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
            return true;
        }
        return false;
    }
}
