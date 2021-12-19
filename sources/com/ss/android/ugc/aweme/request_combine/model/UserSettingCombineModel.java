package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;

public final class UserSettingCombineModel extends a {
    @c(a = "body")
    private f userSetting;

    static {
        Covode.recordClassIndex(78552);
    }

    public static /* synthetic */ UserSettingCombineModel copy$default(UserSettingCombineModel userSettingCombineModel, f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = userSettingCombineModel.userSetting;
        }
        return userSettingCombineModel.copy(fVar);
    }

    public final f component1() {
        return this.userSetting;
    }

    public final UserSettingCombineModel copy(f fVar) {
        l.d(fVar, "");
        return new UserSettingCombineModel(fVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserSettingCombineModel) && l.a(this.userSetting, ((UserSettingCombineModel) obj).userSetting);
        }
        return true;
    }

    public final int hashCode() {
        f fVar = this.userSetting;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserSettingCombineModel(userSetting=" + this.userSetting + ")";
    }

    public final f getUserSetting() {
        return this.userSetting;
    }

    public final void setUserSetting(f fVar) {
        l.d(fVar, "");
        this.userSetting = fVar;
    }

    public UserSettingCombineModel(f fVar) {
        l.d(fVar, "");
        this.userSetting = fVar;
    }
}
