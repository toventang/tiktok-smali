package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f130967a;

    /* renamed from: b  reason: collision with root package name */
    public final String f130968b;

    /* renamed from: c  reason: collision with root package name */
    public final T f130969c;

    static {
        Covode.recordClassIndex(85836);
    }

    public i() {
        this(0, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f130967a == iVar.f130967a && l.a(this.f130968b, iVar.f130968b) && l.a(this.f130969c, iVar.f130969c);
    }

    public final int hashCode() {
        int i2 = this.f130967a * 31;
        String str = this.f130968b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.f130969c;
        if (t != null) {
            i3 = t.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ExecuteResult(ret=" + this.f130967a + ", failedMsg=" + this.f130968b + ", data=" + ((Object) this.f130969c) + ")";
    }

    public final boolean a() {
        if (this.f130967a != 0) {
            return true;
        }
        return false;
    }

    public i(int i2, String str, T t) {
        l.d(str, "");
        this.f130967a = i2;
        this.f130968b = str;
        this.f130969c = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i2, String str, Object obj, int i3) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : obj);
    }
}
