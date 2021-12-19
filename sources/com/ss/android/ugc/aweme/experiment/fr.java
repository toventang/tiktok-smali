package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class fr {

    /* renamed from: a  reason: collision with root package name */
    public static final ProfileMusicTabConfig f90075a = new ProfileMusicTabConfig();

    /* renamed from: b  reason: collision with root package name */
    public static final fr f90076b = new fr();

    private fr() {
    }

    static {
        Covode.recordClassIndex(56519);
    }

    public static ProfileMusicTabConfig a() {
        ProfileMusicTabConfig profileMusicTabConfig = (ProfileMusicTabConfig) SettingsManager.a().a("profile_music_tab_config", ProfileMusicTabConfig.class, f90075a);
        if (profileMusicTabConfig == null) {
            return new ProfileMusicTabConfig();
        }
        return profileMusicTabConfig;
    }
}
