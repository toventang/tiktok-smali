package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SmartPlaytimePredictConfig {
    @c(a = "services")
    private List<OnePlaytimePredictConfig> serviceList;

    static {
        Covode.recordClassIndex(70831);
    }

    public final List<OnePlaytimePredictConfig> getServiceList() {
        return this.serviceList;
    }

    public String toString() {
        return "{serviceList=" + this.serviceList + "}";
    }

    public final void setServiceList(List<OnePlaytimePredictConfig> list) {
        this.serviceList = list;
    }
}
