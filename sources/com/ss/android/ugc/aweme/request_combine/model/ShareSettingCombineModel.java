package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.setting.model.p;
import h.f.b.l;

public final class ShareSettingCombineModel extends a {
    @c(a = "body")
    private p shareSetting;

    static {
        Covode.recordClassIndex(78550);
    }

    public static /* synthetic */ ShareSettingCombineModel copy$default(ShareSettingCombineModel shareSettingCombineModel, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = shareSettingCombineModel.shareSetting;
        }
        return shareSettingCombineModel.copy(pVar);
    }

    public final p component1() {
        return this.shareSetting;
    }

    public final ShareSettingCombineModel copy(p pVar) {
        l.d(pVar, "");
        return new ShareSettingCombineModel(pVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ShareSettingCombineModel) && l.a(this.shareSetting, ((ShareSettingCombineModel) obj).shareSetting);
        }
        return true;
    }

    public final int hashCode() {
        p pVar = this.shareSetting;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ShareSettingCombineModel(shareSetting=" + this.shareSetting + ")";
    }

    public final p getShareSetting() {
        return this.shareSetting;
    }

    public final void setShareSetting(p pVar) {
        l.d(pVar, "");
        this.shareSetting = pVar;
    }

    public ShareSettingCombineModel(p pVar) {
        l.d(pVar, "");
        this.shareSetting = pVar;
    }
}
