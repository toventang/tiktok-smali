package com.ss.android.ugc.aweme.share.m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f124086a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(81492);
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }
}
