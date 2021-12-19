package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final int f118596a = 16000;

    /* renamed from: b  reason: collision with root package name */
    public static final s f118597b = new s();

    private s() {
    }

    public static final int a() {
        return SettingsManager.a().a("caption_audio_sample_rate", 16000);
    }

    static {
        Covode.recordClassIndex(77017);
    }
}
