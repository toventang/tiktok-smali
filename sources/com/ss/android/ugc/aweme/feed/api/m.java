package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f91948a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f91949b;

    /* renamed from: c  reason: collision with root package name */
    public String f91950c;

    static {
        Covode.recordClassIndex(57902);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f91948a, mVar.f91948a) && l.a(this.f91949b, mVar.f91949b) && l.a(this.f91950c, mVar.f91950c);
    }

    public final int hashCode() {
        String str = this.f91948a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f91949b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f91950c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NetworkExtraInfo(requestLog=" + this.f91948a + ", retryTimes=" + this.f91949b + ", url=" + this.f91950c + ")";
    }

    public m(String str, Integer num, String str2) {
        this.f91948a = str;
        this.f91949b = num;
        this.f91950c = str2;
    }
}
