package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ep {

    /* renamed from: a  reason: collision with root package name */
    public static final ep f118501a = new ep();

    private ep() {
    }

    static {
        Covode.recordClassIndex(76970);
    }

    public static final boolean a() {
        return SettingsManager.a().a("upload_origin_audio_track", false);
    }
}
