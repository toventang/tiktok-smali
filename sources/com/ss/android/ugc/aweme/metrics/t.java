package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;
import java.io.Serializable;
import java.util.HashMap;

public abstract class t implements Serializable {
    protected final HashMap<String, String> params = new HashMap<>();

    static {
        Covode.recordClassIndex(70145);
    }

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(c cVar) {
        HashMap<String, String> buildParams = buildParams();
        if (cVar != null) {
            cVar.a(buildParams);
        }
    }

    public final void appendParam(String str, String str2, c.a aVar) {
        this.params.put(str, aVar.a(str2));
    }
}
