package com.ss.android.ugc.aweme.dsp.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final MusicDspConfig f83304a = new MusicDspConfig();

    /* renamed from: b  reason: collision with root package name */
    public static final b f83305b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(51943);
    }

    public static final MusicDspConfig a() {
        MusicDspConfig musicDspConfig = (MusicDspConfig) SettingsManager.a().a("music_dsp_config", MusicDspConfig.class, f83304a);
        if (musicDspConfig == null) {
            return new MusicDspConfig();
        }
        return musicDspConfig;
    }
}
