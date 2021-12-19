package com.ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "show_entrance")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f78376a;
    @c(a = "have_permission")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f78377b;
    @c(a = "click_schema")

    /* renamed from: c  reason: collision with root package name */
    public final String f78378c;

    static {
        Covode.recordClassIndex(48674);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f78376a == bVar.f78376a && this.f78377b == bVar.f78377b && l.a(this.f78378c, bVar.f78378c);
    }

    public final int hashCode() {
        boolean z = this.f78376a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f78377b) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str = this.f78378c;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ShowCaseModel(showEntrance=" + this.f78376a + ", havePermission=" + this.f78377b + ", clickSchema=" + this.f78378c + ")";
    }
}
