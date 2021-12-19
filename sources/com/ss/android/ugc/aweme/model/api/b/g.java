package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class g extends BaseResponse {
    @c(a = "features")

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.model.api.a.c> f110712a;

    static {
        Covode.recordClassIndex(71050);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f110712a, ((g) obj).f110712a);
        }
        return true;
    }

    public final int hashCode() {
        List<com.ss.android.ugc.aweme.model.api.a.c> list = this.f110712a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviStarterAvatarResponse(features=" + this.f110712a + ")";
    }
}
