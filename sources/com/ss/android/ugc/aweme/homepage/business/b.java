package com.ss.android.ugc.aweme.homepage.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.lego.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static w f99171a;

    static {
        Covode.recordClassIndex(63183);
    }

    public static w a(Hox hox) {
        if (f99171a == null) {
            f99171a = new PreloadMainTask(hox);
        }
        return f99171a;
    }
}
