package com.ss.android.ugc.aweme.upvote.detail.panel;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f142183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f142184b;

    /* renamed from: c  reason: collision with root package name */
    public final String f142185c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f142186d;

    static {
        Covode.recordClassIndex(92948);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f142183a, fVar.f142183a) && l.a(this.f142184b, fVar.f142184b) && l.a(this.f142185c, fVar.f142185c) && this.f142186d == fVar.f142186d;
    }

    public final int hashCode() {
        String str = this.f142183a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142184b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f142185c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f142186d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "UpvoteDetailPanelInitData(aid=" + this.f142183a + ", vmIdentifier=" + this.f142184b + ", upvoteId=" + this.f142185c + ", firstTimeOpen=" + this.f142186d + ")";
    }

    public f(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f142183a = str;
        this.f142184b = str2;
        this.f142185c = str3;
        this.f142186d = z;
    }
}
