package com.ss.android.ugc.aweme.commercialize.live.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.live.b;
import h.f.b.l;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "component_data")

    /* renamed from: a  reason: collision with root package name */
    public final b f74539a;
    @com.google.gson.a.c(a = "live_products")

    /* renamed from: b  reason: collision with root package name */
    public final Object f74540b;

    static {
        Covode.recordClassIndex(45964);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f74539a, cVar.f74539a) && l.a(this.f74540b, cVar.f74540b);
    }

    public final int hashCode() {
        b bVar = this.f74539a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Object obj = this.f74540b;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LiveAdCardModel(componentData=" + this.f74539a + ", liveProduct=" + this.f74540b + ")";
    }

    public final d a() {
        if (this.f74540b == null) {
            return null;
        }
        return (d) b.a().a(b.a().b(this.f74540b), d.class);
    }
}
