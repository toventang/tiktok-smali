package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SmartDataTrackConfig {
    @c(a = "configs")
    private List<OneSmartDataTrackConfig> configList;

    static {
        Covode.recordClassIndex(70826);
    }

    public final List<OneSmartDataTrackConfig> getConfigList() {
        return this.configList;
    }

    public String toString() {
        return "SmartDataTrackConfig{configList=" + this.configList + "}";
    }

    public final void setConfigList(List<OneSmartDataTrackConfig> list) {
        this.configList = list;
    }
}
