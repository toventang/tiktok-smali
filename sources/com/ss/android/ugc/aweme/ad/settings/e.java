package com.ss.android.ugc.aweme.ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f66156a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final e f66157b = new e();

    private e() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("modify_xrw", true);
        } catch (Throwable unused) {
            return f66156a;
        }
    }

    static {
        Covode.recordClassIndex(40669);
    }
}
