package com.ss.android.ugc.aweme.profile.ui.v2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.a.a;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static Keva f117241a;

    /* renamed from: b  reason: collision with root package name */
    public static final aa f117242b = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(75705);
        try {
            f117241a = Keva.getRepoFromSp(d.a(), "ProfileV2Preferences", 0);
        } catch (Throwable th) {
            a.a("SharedPreferencesAnnotatedManager getSP failed " + th.getMessage());
        }
    }
}
