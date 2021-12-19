package com.ss.android.ugc.aweme.compliance.privacy.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class UseOldApiSetting {
    public static final boolean DEFAULT = false;
    public static final UseOldApiSetting INSTANCE = new UseOldApiSetting();

    private UseOldApiSetting() {
    }

    static {
        Covode.recordClassIndex(48289);
    }

    public final boolean useOldApiSource() {
        return SettingsManager.a().a("privacy_data_use_old_api", false);
    }
}
