package com.ss.android.ugc.aweme.ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f66148a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66149b = new a();

    private a() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_google_ua", true);
        } catch (Throwable unused) {
            return f66148a;
        }
    }

    static {
        Covode.recordClassIndex(40665);
    }
}
