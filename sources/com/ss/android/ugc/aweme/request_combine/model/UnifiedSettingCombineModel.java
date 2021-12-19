package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import com.ss.android.ugc.aweme.request_combine.a;

public final class UnifiedSettingCombineModel extends a {
    @c(a = "body")
    private l setting;

    static {
        Covode.recordClassIndex(78551);
    }

    public static /* synthetic */ UnifiedSettingCombineModel copy$default(UnifiedSettingCombineModel unifiedSettingCombineModel, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = unifiedSettingCombineModel.setting;
        }
        return unifiedSettingCombineModel.copy(lVar);
    }

    public final l component1() {
        return this.setting;
    }

    public final UnifiedSettingCombineModel copy(l lVar) {
        h.f.b.l.d(lVar, "");
        return new UnifiedSettingCombineModel(lVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UnifiedSettingCombineModel) && h.f.b.l.a(this.setting, ((UnifiedSettingCombineModel) obj).setting);
        }
        return true;
    }

    public final int hashCode() {
        l lVar = this.setting;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UnifiedSettingCombineModel(setting=" + this.setting + ")";
    }

    public final l getSetting() {
        return this.setting;
    }

    public final void setSetting(l lVar) {
        h.f.b.l.d(lVar, "");
        this.setting = lVar;
    }

    public UnifiedSettingCombineModel(l lVar) {
        h.f.b.l.d(lVar, "");
        this.setting = lVar;
    }
}
