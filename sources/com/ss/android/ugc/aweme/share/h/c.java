package com.ss.android.ugc.aweme.share.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f123560a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final c f123561b = new c();

    private c() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("pk_allow_client_watermark", true);
        } catch (Throwable unused) {
            return f123560a;
        }
    }

    static {
        Covode.recordClassIndex(81114);
    }
}
