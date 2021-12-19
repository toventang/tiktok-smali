package com.bytedance.frameworks.baselib.network.http.cronet.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.d;

public final class a implements com.bytedance.retrofit2.client.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f29089a;

    static {
        Covode.recordClassIndex(17031);
    }

    @Override // com.bytedance.retrofit2.client.a
    public final d a(Request request) {
        Context context = this.f29089a;
        request.getUrl();
        h a2 = h.a(context);
        if (a2 != null) {
            return a2.a(request);
        }
        return null;
    }
}
