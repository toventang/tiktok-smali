package com.bytedance.android.live_settings.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public class OtherRepo extends BaseRepo {
    public static final OtherRepo INSTANCE = new OtherRepo();

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "OtherRepo";
    }

    private OtherRepo() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepoSync("live_settings_other_repo", 0);
    }

    static {
        Covode.recordClassIndex(7373);
    }
}
