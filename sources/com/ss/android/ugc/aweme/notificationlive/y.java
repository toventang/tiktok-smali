package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class y implements j {

    /* renamed from: a  reason: collision with root package name */
    public final int f114481a;

    /* renamed from: b  reason: collision with root package name */
    public final int f114482b;

    /* renamed from: c  reason: collision with root package name */
    public final r f114483c;

    /* renamed from: d  reason: collision with root package name */
    public final r f114484d;

    static {
        Covode.recordClassIndex(73676);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f114481a == yVar.f114481a && this.f114482b == yVar.f114482b && l.a(this.f114483c, yVar.f114483c) && l.a(this.f114484d, yVar.f114484d);
    }

    public final int hashCode() {
        int i2 = ((this.f114481a * 31) + this.f114482b) * 31;
        r rVar = this.f114483c;
        int i3 = 0;
        int hashCode = (i2 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        r rVar2 = this.f114484d;
        if (rVar2 != null) {
            i3 = rVar2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ResponseVMState(pushState=" + this.f114481a + ", statusCode=" + this.f114482b + ", cacheEvent=" + this.f114483c + ", networkEvent=" + this.f114484d + ")";
    }

    public /* synthetic */ y() {
        this(-1, -1, null, null);
    }

    public y(int i2, int i3, r rVar, r rVar2) {
        this.f114481a = i2;
        this.f114482b = i3;
        this.f114483c = rVar;
        this.f114484d = rVar2;
    }
}
