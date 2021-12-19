package com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f101547a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f101548b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f101549c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f101550d;

    static {
        Covode.recordClassIndex(64930);
    }

    public d() {
        this(null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f101547a, dVar.f101547a) && this.f101548b == dVar.f101548b && this.f101549c == dVar.f101549c && this.f101550d == dVar.f101550d;
    }

    public final int hashCode() {
        String str = this.f101547a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f101548b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f101549c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f101550d) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "GroupNameInfo(groupName=" + this.f101547a + ", groupNameModified=" + this.f101548b + ", groupNameEditing=" + this.f101549c + ", groupNameChecking=" + this.f101550d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, boolean z, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, false, false);
    }

    public d(String str, boolean z, boolean z2, boolean z3) {
        l.d(str, "");
        this.f101547a = str;
        this.f101548b = z;
        this.f101549c = z2;
        this.f101550d = z3;
    }

    public static /* synthetic */ d a(d dVar, String str, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            str = dVar.f101547a;
        }
        if ((i2 & 2) != 0) {
            z = dVar.f101548b;
        }
        if ((i2 & 4) != 0) {
            z2 = dVar.f101549c;
        }
        if ((i2 & 8) != 0) {
            z3 = dVar.f101550d;
        }
        l.d(str, "");
        return new d(str, z, z2, z3);
    }
}
