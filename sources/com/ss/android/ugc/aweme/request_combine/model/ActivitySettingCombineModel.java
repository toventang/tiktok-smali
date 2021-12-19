package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.request_combine.a;
import h.f.b.l;

public final class ActivitySettingCombineModel extends a {
    @c(a = "body")
    private com.ss.android.ugc.aweme.bg.a activitySetting;

    static {
        Covode.recordClassIndex(78542);
    }

    public static /* synthetic */ ActivitySettingCombineModel copy$default(ActivitySettingCombineModel activitySettingCombineModel, com.ss.android.ugc.aweme.bg.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = activitySettingCombineModel.activitySetting;
        }
        return activitySettingCombineModel.copy(aVar);
    }

    public final com.ss.android.ugc.aweme.bg.a component1() {
        return this.activitySetting;
    }

    public final ActivitySettingCombineModel copy(com.ss.android.ugc.aweme.bg.a aVar) {
        l.d(aVar, "");
        return new ActivitySettingCombineModel(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ActivitySettingCombineModel) && l.a(this.activitySetting, ((ActivitySettingCombineModel) obj).activitySetting);
        }
        return true;
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.bg.a aVar = this.activitySetting;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ActivitySettingCombineModel(activitySetting=" + this.activitySetting + ")";
    }

    public final com.ss.android.ugc.aweme.bg.a getActivitySetting() {
        return this.activitySetting;
    }

    public final void setActivitySetting(com.ss.android.ugc.aweme.bg.a aVar) {
        l.d(aVar, "");
        this.activitySetting = aVar;
    }

    public ActivitySettingCombineModel(com.ss.android.ugc.aweme.bg.a aVar) {
        l.d(aVar, "");
        this.activitySetting = aVar;
    }
}
