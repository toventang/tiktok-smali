package com.bytedance.android.live_settings.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public class MockSettingsRepo extends BaseRepo {
    public static final MockSettingsRepo INSTANCE = new MockSettingsRepo();

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "MockSettingsRepo";
    }

    private MockSettingsRepo() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepoSync("live_mock_settings_repo", 0);
    }

    static {
        Covode.recordClassIndex(7372);
    }
}
