package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "default")

    /* renamed from: a  reason: collision with root package name */
    public final b f112398a;
    @com.google.gson.a.c(a = "custom")

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f112399b;

    static {
        Covode.recordClassIndex(72247);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f112398a, cVar.f112398a) && l.a(this.f112399b, cVar.f112399b);
    }

    public final int hashCode() {
        b bVar = this.f112398a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        List<b> list = this.f112399b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "HeaderParamConfigSetting(default=" + this.f112398a + ", custom=" + this.f112399b + ")";
    }

    private c() {
        this.f112398a = null;
        this.f112399b = null;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
