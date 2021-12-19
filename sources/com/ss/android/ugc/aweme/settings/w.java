package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f123142a = 30000;

    /* renamed from: b  reason: collision with root package name */
    public static final w f123143b = new w();

    private w() {
    }

    public static int a() {
        int i2 = f123142a;
        try {
            return SettingsManager.a().a("music_media_player_time", 30000);
        } catch (Throwable unused) {
            return i2;
        }
    }

    static {
        Covode.recordClassIndex(80872);
    }
}
