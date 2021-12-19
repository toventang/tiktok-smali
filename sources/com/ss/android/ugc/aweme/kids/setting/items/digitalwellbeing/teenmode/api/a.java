package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "log_pb")

    /* renamed from: a  reason: collision with root package name */
    public final LogPbBean f106930a;

    static {
        Covode.recordClassIndex(68394);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f106930a, ((a) obj).f106930a);
        }
        return true;
    }

    public final int hashCode() {
        LogPbBean logPbBean = this.f106930a;
        if (logPbBean != null) {
            return logPbBean.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MinorSettingResp(logPb=" + this.f106930a + ")";
    }
}
