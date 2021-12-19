package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.bytedance.covode.number.Covode;

public final class TTSettingDataBean {
    private TTSettingDataAppBean app;

    /* renamed from: default  reason: not valid java name */
    private TTSettingDataDefaultBean f343default;

    static {
        Covode.recordClassIndex(21102);
    }

    public final TTSettingDataAppBean getApp() {
        return this.app;
    }

    public final TTSettingDataDefaultBean getDefault() {
        return this.f343default;
    }

    public final void setApp(TTSettingDataAppBean tTSettingDataAppBean) {
        this.app = tTSettingDataAppBean;
    }

    public final void setDefault(TTSettingDataDefaultBean tTSettingDataDefaultBean) {
        this.f343default = tTSettingDataDefaultBean;
    }
}
