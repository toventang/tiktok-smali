package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class av {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f67601a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final av f67602b = new av();

    private av() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_cqrcode_intercept", true);
        } catch (Throwable unused) {
            return f67601a;
        }
    }

    static {
        Covode.recordClassIndex(41617);
    }
}
