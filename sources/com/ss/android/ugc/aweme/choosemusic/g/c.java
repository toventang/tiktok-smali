package com.ss.android.ugc.aweme.choosemusic.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f70538a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f70539b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(43502);
    }

    public static String a() {
        b bVar = f70538a;
        try {
            bVar = (b) SettingsManager.a().a("tt_commercial_music_info", b.class, bVar);
        } catch (Throwable unused) {
        }
        if (bVar != null) {
            return bVar.f70537a;
        }
        return null;
    }
}
