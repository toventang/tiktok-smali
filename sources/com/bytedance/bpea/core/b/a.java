package com.bytedance.bpea.core.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f26628a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26629b;

    /* renamed from: c  reason: collision with root package name */
    public final T f26630c;

    static {
        Covode.recordClassIndex(15680);
    }

    public a() {
        this(0, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26628a == aVar.f26628a && l.a(this.f26629b, aVar.f26629b) && l.a(this.f26630c, aVar.f26630c);
    }

    public final int hashCode() {
        int i2 = this.f26628a * 31;
        String str = this.f26629b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.f26630c;
        if (t != null) {
            i3 = t.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ResultData(code=" + this.f26628a + ", msg=" + this.f26629b + ", data=" + ((Object) this.f26630c) + ")";
    }

    private a(int i2, String str, T t) {
        this.f26628a = i2;
        this.f26629b = str;
        this.f26630c = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, String str, Object obj, int i3) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : obj);
    }
}
