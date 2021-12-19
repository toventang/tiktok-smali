package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class f extends BaseResponse {
    @c(a = "initial_navis")

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.model.api.a.f> f110711a;

    static {
        Covode.recordClassIndex(71049);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f110711a, ((f) obj).f110711a);
        }
        return true;
    }

    public final int hashCode() {
        List<com.ss.android.ugc.aweme.model.api.a.f> list = this.f110711a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviStarterAvatarListResponse(starterAvatarList=" + this.f110711a + ")";
    }
}
