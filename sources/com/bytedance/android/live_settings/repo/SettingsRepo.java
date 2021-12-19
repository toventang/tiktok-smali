package com.bytedance.android.live_settings.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public class SettingsRepo extends BaseRepo {
    public static final SettingsRepo INSTANCE = new SettingsRepo();

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "SettingsRepo";
    }

    private SettingsRepo() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepoSync("live_settings_repo", 0);
    }

    static {
        Covode.recordClassIndex(7374);
    }
}
