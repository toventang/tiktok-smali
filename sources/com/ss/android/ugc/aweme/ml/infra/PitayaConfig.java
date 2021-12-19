package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class PitayaConfig {
    @c(a = "business_name")
    private String businessName;

    static {
        Covode.recordClassIndex(70969);
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final String toString() {
        return "{businessName=" + this.businessName + '}';
    }

    public final void setBusinessName(String str) {
        this.businessName = str;
    }
}
