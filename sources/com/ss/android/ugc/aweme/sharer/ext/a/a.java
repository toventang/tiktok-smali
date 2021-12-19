package com.ss.android.ugc.aweme.sharer.ext.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f124530a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f124531b = new a();

    private a() {
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("delay_initialize_share_SDK", true);
        } catch (Throwable unused) {
            return f124530a;
        }
    }

    static {
        Covode.recordClassIndex(81808);
    }
}
