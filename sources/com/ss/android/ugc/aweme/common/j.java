package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public final DATA f76451a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f76452b;

    static {
        Covode.recordClassIndex(47203);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f76451a, jVar.f76451a) && l.a(this.f76452b, jVar.f76452b);
    }

    public final int hashCode() {
        DATA data = this.f76451a;
        int i2 = 0;
        int hashCode = (data != null ? data.hashCode() : 0) * 31;
        Throwable th = this.f76452b;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EasyRxResponse(data=" + ((Object) this.f76451a) + ", error=" + this.f76452b + ")";
    }

    public /* synthetic */ j(Object obj) {
        this(obj, null);
    }

    public j(DATA data, Throwable th) {
        this.f76451a = data;
        this.f76452b = th;
    }
}
