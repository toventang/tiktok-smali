package com.ss.android.ugc.aweme.discover.mixfeed.cs;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.api.a.a;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f81705a;

    /* renamed from: b  reason: collision with root package name */
    public final String f81706b;

    /* renamed from: c  reason: collision with root package name */
    public final String f81707c;

    /* renamed from: d  reason: collision with root package name */
    public final a<ClickSearchResponse> f81708d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f81709e;

    static {
        Covode.recordClassIndex(50759);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f81705a == bVar.f81705a && l.a(this.f81706b, bVar.f81706b) && l.a(this.f81707c, bVar.f81707c) && l.a(this.f81708d, bVar.f81708d) && this.f81709e == bVar.f81709e;
    }

    public final int hashCode() {
        int i2 = this.f81705a * 31;
        String str = this.f81706b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f81707c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        a<ClickSearchResponse> aVar = this.f81708d;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z = this.f81709e;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "ClickSearchData(awemeIndex=" + this.f81705a + ", aid=" + this.f81706b + ", query=" + this.f81707c + ", result=" + this.f81708d + ", useAnimation=" + this.f81709e + ")";
    }

    public /* synthetic */ b() {
        this(-1, null, null, null, true);
    }

    public b(int i2, String str, String str2, a<ClickSearchResponse> aVar, boolean z) {
        this.f81705a = i2;
        this.f81706b = str;
        this.f81707c = str2;
        this.f81708d = aVar;
        this.f81709e = z;
    }
}
