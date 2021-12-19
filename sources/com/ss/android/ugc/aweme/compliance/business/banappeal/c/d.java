package com.ss.android.ugc.aweme.compliance.business.banappeal.c;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f76796a;

    /* renamed from: b  reason: collision with root package name */
    public final String f76797b;

    /* renamed from: c  reason: collision with root package name */
    public final b<View, z> f76798c;

    static {
        Covode.recordClassIndex(47469);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f76796a, dVar.f76796a) && l.a(this.f76797b, dVar.f76797b) && l.a(this.f76798c, dVar.f76798c);
    }

    public final int hashCode() {
        String str = this.f76796a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76797b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        b<View, z> bVar = this.f76798c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DialogHyperLinkState(prefixLinkText=" + this.f76796a + ", linkText=" + this.f76797b + ", linkClickListener=" + this.f76798c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super android.view.View, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, String str2, b<? super View, z> bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        this.f76796a = str;
        this.f76797b = str2;
        this.f76798c = bVar;
    }
}
