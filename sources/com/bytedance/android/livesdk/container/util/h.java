package com.bytedance.android.livesdk.container.util;

import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f16899a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(9387);
    }

    public static String a(Configuration configuration) {
        if (configuration != null && (configuration.uiMode & 48) == 32) {
            return "dark";
        }
        return "light";
    }
}
