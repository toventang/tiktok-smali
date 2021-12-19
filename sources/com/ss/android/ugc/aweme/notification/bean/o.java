package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class o extends BaseResponse {
    @c(a = "inbox")

    /* renamed from: a  reason: collision with root package name */
    public final n f113273a = null;

    static {
        Covode.recordClassIndex(72826);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof o) && l.a(this.f113273a, ((o) obj).f113273a);
        }
        return true;
    }

    public final int hashCode() {
        n nVar = this.f113273a;
        if (nVar != null) {
            return nVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NotificationSubscribeSettings(subscribeData=" + this.f113273a + ")";
    }

    private o() {
    }
}
