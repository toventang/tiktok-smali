package com.bytedance.ies.b.c;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import k.g;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public final class d extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    RequestBody f31936a;

    static {
        Covode.recordClassIndex(18677);
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f31936a.contentType();
    }

    public d(RequestBody requestBody) {
        Objects.requireNonNull(requestBody, "requestBody == null");
        this.f31936a = requestBody;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(g gVar) {
        this.f31936a.writeTo(gVar);
        gVar.flush();
    }
}
