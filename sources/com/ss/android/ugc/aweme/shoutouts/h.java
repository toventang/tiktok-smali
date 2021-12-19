package com.ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final i f133177a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final h f133178b = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(87091);
    }

    public static i a() {
        if (b() == null) {
            return new i();
        }
        i b2 = b();
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    private static i b() {
        return (i) SettingsManager.a().a("shoutouts_config_collection", i.class, f133177a);
    }
}
