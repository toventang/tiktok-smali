package com.ss.android.ugc.aweme.ug.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f141952a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(92753);
    }

    public static c a() {
        try {
            return (c) SettingsManager.a().a("ugc_permission_setting", c.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
