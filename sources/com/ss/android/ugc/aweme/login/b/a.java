package com.ss.android.ugc.aweme.login.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;

public final class a {
    static {
        Covode.recordClassIndex(69811);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getTakeDownReason() != 6) {
            return false;
        }
        return true;
    }

    public static boolean b(Aweme aweme) {
        if (!a(aweme) || !m.a(aweme)) {
            return false;
        }
        return true;
    }

    public static String a(Aweme aweme, int i2) {
        if (aweme == null || TextUtils.isEmpty(aweme.getTakeDownDesc()) || !a(aweme)) {
            return d.a().getString(i2);
        }
        return aweme.getTakeDownDesc();
    }
}
