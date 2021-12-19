package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class AfrResponse extends DataBaseResponse {
    @c(a = "afr_data")
    private List<AfrData> afrData;

    static {
        Covode.recordClassIndex(91983);
    }

    public final List<AfrData> getAfrData() {
        return this.afrData;
    }

    public final void setAfrData(List<AfrData> list) {
        this.afrData = list;
    }
}
