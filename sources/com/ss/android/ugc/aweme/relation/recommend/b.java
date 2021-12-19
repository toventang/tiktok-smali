package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.recommend.l;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    public final String f120407a;

    /* renamed from: b  reason: collision with root package name */
    public final String f120408b;

    static {
        Covode.recordClassIndex(78357);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f120407a, bVar.f120407a) && l.a(this.f120408b, bVar.f120408b);
    }

    public final int hashCode() {
        String str = this.f120407a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f120408b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "HeaderItem(title=" + this.f120407a + ", subTitle=" + this.f120408b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        super(l.a.HEADER);
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        this.f120407a = str;
        this.f120408b = str2;
    }
}
