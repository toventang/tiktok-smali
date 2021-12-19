package com.ss.android.ugc.aweme.choosemusic.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f70540a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final d f70541b = new d();

    private d() {
    }

    public static boolean a() {
        boolean z = f70540a;
        try {
            return SettingsManager.a().a("support_local_music_optimize", true);
        } catch (Throwable unused) {
            return z;
        }
    }

    static {
        Covode.recordClassIndex(43503);
    }
}
