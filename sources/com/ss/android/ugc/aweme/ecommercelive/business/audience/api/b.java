package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.g;
import com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final BaseResponse<g> f87780a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f87781b;

    static {
        Covode.recordClassIndex(55206);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f87780a, bVar.f87780a) && l.a(this.f87781b, bVar.f87781b);
    }

    public final int hashCode() {
        BaseResponse<g> baseResponse = this.f87780a;
        int i2 = 0;
        int hashCode = (baseResponse != null ? baseResponse.hashCode() : 0) * 31;
        Throwable th = this.f87781b;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProductListResult(response=" + this.f87780a + ", throwable=" + this.f87781b + ")";
    }

    private /* synthetic */ b() {
        this(null, null);
    }

    public b(BaseResponse<g> baseResponse, Throwable th) {
        this.f87780a = baseResponse;
        this.f87781b = th;
    }
}
