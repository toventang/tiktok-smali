package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f102204a = "👋👋👋";

    /* renamed from: b  reason: collision with root package name */
    public static final e f102205b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(65400);
    }

    public static String a() {
        try {
            String a2 = SettingsManager.a().a("im_say_hi_message", "👋👋👋");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return f102204a;
        }
    }
}
