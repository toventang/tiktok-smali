package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import com.ss.android.ugc.aweme.request_combine.a;

public final class AwemeSettingCombineModel extends a {
    @c(a = "body")
    private l awemeSetting;

    static {
        Covode.recordClassIndex(78543);
    }

    public static /* synthetic */ AwemeSettingCombineModel copy$default(AwemeSettingCombineModel awemeSettingCombineModel, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = awemeSettingCombineModel.awemeSetting;
        }
        return awemeSettingCombineModel.copy(lVar);
    }

    public final l component1() {
        return this.awemeSetting;
    }

    public final AwemeSettingCombineModel copy(l lVar) {
        h.f.b.l.d(lVar, "");
        return new AwemeSettingCombineModel(lVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AwemeSettingCombineModel) && h.f.b.l.a(this.awemeSetting, ((AwemeSettingCombineModel) obj).awemeSetting);
        }
        return true;
    }

    public final int hashCode() {
        l lVar = this.awemeSetting;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AwemeSettingCombineModel(awemeSetting=" + this.awemeSetting + ")";
    }

    public final l getAwemeSetting() {
        return this.awemeSetting;
    }

    public final void setAwemeSetting(l lVar) {
        h.f.b.l.d(lVar, "");
        this.awemeSetting = lVar;
    }

    public AwemeSettingCombineModel(l lVar) {
        h.f.b.l.d(lVar, "");
        this.awemeSetting = lVar;
    }
}
