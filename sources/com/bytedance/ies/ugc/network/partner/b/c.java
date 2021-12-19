package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import h.f.b.l;
import okhttp3.RequestBody;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f35259a;

    /* renamed from: b  reason: collision with root package name */
    public TypedOutput f35260b;

    /* renamed from: c  reason: collision with root package name */
    public final RequestBody f35261c;

    static {
        Covode.recordClassIndex(21129);
    }

    public c(Request request) {
        l.d(request, "");
        String method = request.getMethod();
        if (method != null) {
            this.f35259a = method;
            this.f35260b = request.getBody();
            this.f35261c = request.getRequestBody();
            return;
        }
        throw new NullPointerException("Method must not be null.");
    }
}
