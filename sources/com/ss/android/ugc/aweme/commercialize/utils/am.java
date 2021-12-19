package com.ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.e.a;
import h.f.b.l;
import java.util.List;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static final am f75580a = new am();

    private am() {
    }

    static {
        Covode.recordClassIndex(46624);
    }

    public static final List<String> a(String str) {
        l.d(str, "");
        if (TextUtils.equals(str, "splash") || TextUtils.equals(str, "topview")) {
            a a2 = com.ss.android.ugc.aweme.ad.utils.a.a();
            if (a2 != null) {
                return a2.getSplashAdAutoJumpAllowList();
            }
            return null;
        }
        a a3 = com.ss.android.ugc.aweme.ad.utils.a.a();
        if (a3 != null) {
            return a3.getAutoJumpAllowList();
        }
        return null;
    }
}
