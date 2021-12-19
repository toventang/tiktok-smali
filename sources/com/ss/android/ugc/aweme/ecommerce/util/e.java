package com.ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f87562a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Object> f87563b;

    /* renamed from: c  reason: collision with root package name */
    public final int f87564c;

    static {
        Covode.recordClassIndex(55043);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f87562a, eVar.f87562a) && l.a(this.f87563b, eVar.f87563b) && this.f87564c == eVar.f87564c;
    }

    public final int hashCode() {
        String str = this.f87562a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a<Object> aVar = this.f87563b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f87564c;
    }

    public final String toString() {
        return "HighLightText(text=" + this.f87562a + ", block=" + this.f87563b + ", textColor=" + this.f87564c + ")";
    }

    private e(String str, int i2) {
        l.d(str, "");
        this.f87562a = str;
        this.f87563b = null;
        this.f87564c = i2;
    }

    public /* synthetic */ e(String str, int i2, byte b2) {
        this(str, i2);
    }
}
