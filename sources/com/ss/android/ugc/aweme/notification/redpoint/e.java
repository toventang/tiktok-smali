package com.ss.android.ugc.aweme.notification.redpoint;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import h.f.b.l;
import java.util.List;

public final class e extends BaseResponse {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public List<NoticeList> f113800a = null;

    static {
        Covode.recordClassIndex(73181);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f113800a, ((e) obj).f113800a);
        }
        return true;
    }

    public final int hashCode() {
        List<NoticeList> list = this.f113800a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MultiUserNoticeCountResponse(noticeLists=" + this.f113800a + ")";
    }

    private e() {
    }
}
