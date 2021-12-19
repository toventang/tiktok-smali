package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final BaseResponse<String> f104545a;

    /* renamed from: b  reason: collision with root package name */
    public final String f104546b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f104547c;

    static {
        Covode.recordClassIndex(66977);
    }

    public a() {
        this((BaseResponse) null, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f104545a, aVar.f104545a) && l.a(this.f104546b, aVar.f104546b) && l.a(this.f104547c, aVar.f104547c);
    }

    public final int hashCode() {
        BaseResponse<String> baseResponse = this.f104545a;
        int i2 = 0;
        int hashCode = (baseResponse != null ? baseResponse.hashCode() : 0) * 31;
        String str = this.f104546b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.f104547c;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "OperateProductResult(response=" + this.f104545a + ", productId=" + this.f104546b + ", throwable=" + this.f104547c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BaseResponse baseResponse, String str, int i2) {
        this((i2 & 1) != 0 ? null : baseResponse, (i2 & 2) != 0 ? null : str, (Throwable) null);
    }

    public a(BaseResponse<String> baseResponse, String str, Throwable th) {
        this.f104545a = baseResponse;
        this.f104546b = str;
        this.f104547c = th;
    }
}
