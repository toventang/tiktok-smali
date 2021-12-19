package com.ss.android.ugc.aweme.discover.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f81401a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(50590);
    }

    public static final c a() {
        try {
            return (c) SettingsManager.a().a("search_transfer_settings", c.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
