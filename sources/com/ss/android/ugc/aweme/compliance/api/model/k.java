package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class k extends BaseResponse {
    @c(a = "policy_notices")

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f76679a;

    static {
        Covode.recordClassIndex(47355);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f76679a, ((k) obj).f76679a);
        }
        return true;
    }

    public final int hashCode() {
        List<i> list = this.f76679a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PolicyNoticeResponse(policyNotices=" + this.f76679a + ")";
    }

    private /* synthetic */ k() {
        this(z.INSTANCE);
    }

    private k(List<i> list) {
        l.d(list, "");
        this.f76679a = list;
    }
}
