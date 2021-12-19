package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f78477a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(48739);
    }

    public static a a() {
        try {
            return (a) SettingsManager.a().a("nlg_creators", a.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
