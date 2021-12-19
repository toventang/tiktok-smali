package com.ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.qrcode.d.c;
import java.util.concurrent.ExecutionException;

public final class RiskApi {

    /* renamed from: a  reason: collision with root package name */
    static final f f119706a = a.a(Api.f66569d);

    /* access modifiers changed from: package-private */
    public interface RealApi {
        static {
            Covode.recordClassIndex(77764);
        }

        @h(a = "/aweme/v2/risk/url/")
        q<c> getRiskUrlModel(@z(a = "request_url") String str);
    }

    static {
        Covode.recordClassIndex(77763);
    }

    public static c a(String str) {
        try {
            return ((RealApi) f119706a.a(RealApi.class)).getRiskUrlModel(str).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
