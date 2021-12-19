package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;

public abstract /* synthetic */ class h {
    static {
        Covode.recordClassIndex(40959);
    }

    public static i a(g gVar) {
        a requestInfo = gVar.getRequestInfo();
        if (requestInfo == null) {
            return null;
        }
        return (i) g.f66615d.a(requestInfo.y, i.class);
    }
}
