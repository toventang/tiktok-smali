package com.ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f109964a;

    /* renamed from: b  reason: collision with root package name */
    public String f109965b;

    /* renamed from: c  reason: collision with root package name */
    public String f109966c;

    static {
        Covode.recordClassIndex(70481);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f109964a == jVar.f109964a && l.a(this.f109965b, jVar.f109965b) && l.a(this.f109966c, jVar.f109966c);
    }

    public final int hashCode() {
        int i2 = this.f109964a * 31;
        String str = this.f109965b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f109966c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "EditPlayListNameFragmentData(openFragmentType=" + this.f109964a + ", lastName=" + this.f109965b + ", mixId=" + this.f109966c + ")";
    }

    public /* synthetic */ j() {
        this(1, null, null);
    }

    public j(int i2, String str, String str2) {
        this.f109964a = i2;
        this.f109965b = str;
        this.f109966c = str2;
    }
}
