package com.ss.android.ugc.aweme.kids.discovery.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "aweme_details")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f106438a = null;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f106439b = 0;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f106440c = 0;
    @c(a = "log_pb")

    /* renamed from: d  reason: collision with root package name */
    public LogPbBean f106441d = null;

    static {
        Covode.recordClassIndex(68016);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f106438a, dVar.f106438a) && this.f106439b == dVar.f106439b && this.f106440c == dVar.f106440c && l.a(this.f106441d, dVar.f106441d);
    }

    public final int hashCode() {
        List<? extends Aweme> list = this.f106438a;
        int i2 = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f106439b) * 31) + this.f106440c) * 31;
        LogPbBean logPbBean = this.f106441d;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "KDisocverDetailList(items=" + this.f106438a + ", cursor=" + this.f106439b + ", hasMore=" + this.f106440c + ", logPbBean=" + this.f106441d + ")";
    }

    private d() {
    }
}
