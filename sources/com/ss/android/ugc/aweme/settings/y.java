package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final int f123146a = 31457279;

    /* renamed from: b  reason: collision with root package name */
    public static final y f123147b = new y();

    private y() {
    }

    public static int a() {
        int i2 = f123146a;
        try {
            return SettingsManager.a().a("music_preload_size_videocache", 31457279);
        } catch (Throwable unused) {
            return i2;
        }
    }

    static {
        Covode.recordClassIndex(80874);
    }
}
