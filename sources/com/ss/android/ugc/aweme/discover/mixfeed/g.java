package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Objects;

public final class g implements f {
    @c(a = "doc_id")

    /* renamed from: a  reason: collision with root package name */
    public String f81773a;
    @c(a = "ala_src")

    /* renamed from: b  reason: collision with root package name */
    public String f81774b;
    @c(a = "sounds_list_type")

    /* renamed from: c  reason: collision with root package name */
    public int f81775c;

    /* renamed from: d  reason: collision with root package name */
    public int f81776d;

    /* renamed from: e  reason: collision with root package name */
    public int f81777e;

    /* renamed from: f  reason: collision with root package name */
    public int f81778f = -1;

    static {
        Covode.recordClassIndex(50801);
    }

    public final int hashCode() {
        int i2;
        String str = this.f81773a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f81774b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((((((i4 + i3) * 31) + this.f81776d) * 31) + this.f81777e) * 31) + this.f81778f;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchCardInfo");
        g gVar = (g) obj;
        if (!(!l.a((Object) this.f81773a, (Object) gVar.f81773a)) && !(!l.a((Object) this.f81774b, (Object) gVar.f81774b)) && this.f81776d == gVar.f81776d && this.f81777e == gVar.f81777e && this.f81778f == gVar.f81778f) {
            return true;
        }
        return false;
    }
}
