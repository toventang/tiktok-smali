package com.ss.android.ugc.aweme.mix.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f109968a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(70484);
    }

    public static boolean a() {
        if (SettingsManager.a().a("can_exp_playlist", 0) == 1) {
            return true;
        }
        return false;
    }
}
