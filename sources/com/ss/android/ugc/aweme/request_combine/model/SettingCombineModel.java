package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class SettingCombineModel extends BaseResponse {
    @c(a = "data")
    private SettingCombineDataModel data;

    static {
        Covode.recordClassIndex(78549);
    }

    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public final void setData(SettingCombineDataModel settingCombineDataModel) {
        l.d(settingCombineDataModel, "");
        this.data = settingCombineDataModel;
    }

    public SettingCombineModel(SettingCombineDataModel settingCombineDataModel) {
        l.d(settingCombineDataModel, "");
        this.data = settingCombineDataModel;
    }
}
