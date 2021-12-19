package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.a.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "method")

    /* renamed from: a  reason: collision with root package name */
    public String f11763a;
    @c(a = "param")

    /* renamed from: b  reason: collision with root package name */
    public n f11764b;
    @c(a = "ts")

    /* renamed from: c  reason: collision with root package name */
    public Long f11765c;
    @c(a = "msg_id")

    /* renamed from: d  reason: collision with root package name */
    public String f11766d;

    static {
        Covode.recordClassIndex(6415);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f11763a, mVar.f11763a) && l.a(this.f11764b, mVar.f11764b) && l.a(this.f11765c, mVar.f11765c) && l.a(this.f11766d, mVar.f11766d);
    }

    public final int hashCode() {
        String str = this.f11763a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        n nVar = this.f11764b;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        Long l2 = this.f11765c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.f11766d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MultiLiveRTCMessage(method=" + this.f11763a + ", param=" + this.f11764b + ", timeStamp=" + this.f11765c + ", msgId=" + this.f11766d + ")";
    }

    public /* synthetic */ m() {
        this("", Long.valueOf(a.a()), "");
    }

    public final void a() {
        StringBuilder sb = new StringBuilder();
        f b2 = u.a().b();
        l.b(b2, "");
        this.f11766d = sb.append(String.valueOf(b2.c())).append("_").append(this.f11765c).toString();
    }

    public final void a(String str) {
        l.d(str, "");
        this.f11763a = str;
    }

    private m(String str, Long l2, String str2) {
        l.d(str, "");
        this.f11763a = str;
        this.f11764b = null;
        this.f11765c = l2;
        this.f11766d = str2;
    }
}
