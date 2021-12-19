package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class j extends t {
    private final HashMap<String, String> inputParam;

    static {
        Covode.recordClassIndex(70135);
    }

    @Override // com.ss.android.ugc.aweme.metrics.t
    public final HashMap<String, String> buildParams() {
        return this.inputParam;
    }

    public final HashMap<String, String> getInputParam() {
        return this.inputParam;
    }

    public j(HashMap<String, String> hashMap) {
        l.d(hashMap, "");
        this.inputParam = hashMap;
    }
}
