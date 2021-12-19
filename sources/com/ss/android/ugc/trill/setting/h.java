package com.ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f150593a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(99030);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("tts_voice_option_key", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
