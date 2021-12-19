package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f122680a = new u();

    private u() {
    }

    static {
        Covode.recordClassIndex(80524);
    }

    public static boolean a() {
        return SettingsManager.a().a("enable_bytevc1_hw_decoder", false);
    }
}
