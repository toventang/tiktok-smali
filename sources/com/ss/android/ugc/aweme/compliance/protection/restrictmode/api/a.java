package com.ss.android.ugc.aweme.compliance.protection.restrictmode.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "log_pb")

    /* renamed from: a  reason: collision with root package name */
    public final LogPbBean f77999a;

    static {
        Covode.recordClassIndex(48353);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f77999a, ((a) obj).f77999a);
        }
        return true;
    }

    public final int hashCode() {
        LogPbBean logPbBean = this.f77999a;
        if (logPbBean != null) {
            return logPbBean.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MinorSettingResp(logPb=" + this.f77999a + ")";
    }
}
