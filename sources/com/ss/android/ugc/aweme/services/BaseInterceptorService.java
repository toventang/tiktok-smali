package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bm;
import com.ss.android.ugc.aweme.tux.a.i.a;
import h.f.b.l;
import java.util.Collections;
import java.util.Map;

public class BaseInterceptorService implements bm {
    static {
        Covode.recordClassIndex(79425);
    }

    public boolean shouldIntercept(Request request) {
        l.d(request, "");
        return false;
    }

    public Map<String, String> interceptAndGetNewParams(int i2, Request request, u<Object> uVar) {
        return Collections.emptyMap();
    }

    @Override // com.ss.android.ugc.aweme.bm
    public void promptIfNeededOrToast(Context context, String str, int i2) {
        l.d(context, "");
        l.d(str, "");
        new a(context).a(str).a();
    }

    public Map<String, String> interceptAndGetNewParams(int i2, String str, Request request, String str2) {
        return Collections.emptyMap();
    }
}
