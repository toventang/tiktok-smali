package com.ss.android.ugc.aweme.kids.homepage.policynotice.response;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "policy_notices")

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f106633a;

    static {
        Covode.recordClassIndex(68132);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f106633a, ((c) obj).f106633a);
        }
        return true;
    }

    public final int hashCode() {
        List<a> list = this.f106633a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PolicyNoticeResponse(policyNotices=" + this.f106633a + ")";
    }

    private /* synthetic */ c() {
        this(z.INSTANCE);
    }

    private c(List<a> list) {
        l.d(list, "");
        this.f106633a = list;
    }
}
