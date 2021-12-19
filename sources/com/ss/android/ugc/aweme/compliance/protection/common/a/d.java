package com.ss.android.ugc.aweme.compliance.protection.common.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class d extends BaseResponse {
    @c(a = "fp")

    /* renamed from: a  reason: collision with root package name */
    public final b f77954a;
    @c(a = "dw")

    /* renamed from: b  reason: collision with root package name */
    public final a f77955b;

    static {
        Covode.recordClassIndex(48320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f77954a, dVar.f77954a) && l.a(this.f77955b, dVar.f77955b);
    }

    public final int hashCode() {
        b bVar = this.f77954a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        a aVar = this.f77955b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProtectionApiResponse(familyPairingBean=" + this.f77954a + ", digitalWellbeingBean=" + this.f77955b + ")";
    }

    private /* synthetic */ d() {
        this(new b(), new a());
    }

    private d(b bVar, a aVar) {
        this.f77954a = bVar;
        this.f77955b = aVar;
    }
}
