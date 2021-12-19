package com.ss.android.ugc.aweme.qna.fragment;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f119419a;

    /* renamed from: b  reason: collision with root package name */
    public final int f119420b;

    /* renamed from: c  reason: collision with root package name */
    public final c f119421c;

    static {
        Covode.recordClassIndex(77552);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f119419a, fVar.f119419a) && this.f119420b == fVar.f119420b && l.a(this.f119421c, fVar.f119421c);
    }

    public final int hashCode() {
        String str = this.f119419a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f119420b) * 31;
        c cVar = this.f119421c;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BottomSheetActionUiModel(actionTitle=" + this.f119419a + ", tuxActionSheetVariant=" + this.f119420b + ", bottomSheetActionEnum=" + this.f119421c + ")";
    }

    public f(String str, int i2, c cVar) {
        l.d(str, "");
        l.d(cVar, "");
        this.f119419a = str;
        this.f119420b = i2;
        this.f119421c = cVar;
    }
}
