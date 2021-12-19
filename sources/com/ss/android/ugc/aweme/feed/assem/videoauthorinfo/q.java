package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;

public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f92589a;

    /* renamed from: b  reason: collision with root package name */
    public final int f92590b;

    /* renamed from: c  reason: collision with root package name */
    public final p<String, String> f92591c;

    /* renamed from: d  reason: collision with root package name */
    public final String f92592d;

    static {
        Covode.recordClassIndex(58663);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f92589a, qVar.f92589a) && this.f92590b == qVar.f92590b && l.a(this.f92591c, qVar.f92591c) && l.a(this.f92592d, qVar.f92592d);
    }

    public final int hashCode() {
        String str = this.f92589a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f92590b) * 31;
        p<String, String> pVar = this.f92591c;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str2 = this.f92592d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "VideoAuthorInfoState(titleViewText=" + this.f92589a + ", titleViewVisible=" + this.f92590b + ", titleVerifyInfo=" + this.f92591c + ", postTimeText=" + this.f92592d + ")";
    }

    public /* synthetic */ q() {
        this(null, 8, null, null);
    }

    public q(String str, int i2, p<String, String> pVar, String str2) {
        this.f92589a = str;
        this.f92590b = i2;
        this.f92591c = pVar;
        this.f92592d = str2;
    }
}
