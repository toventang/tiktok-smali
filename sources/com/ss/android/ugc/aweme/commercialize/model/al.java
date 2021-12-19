package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class al {
    @c(a = "multiselect")

    /* renamed from: a  reason: collision with root package name */
    public final int f74862a;
    @c(a = "depth")

    /* renamed from: b  reason: collision with root package name */
    public final int f74863b;
    @c(a = "options")

    /* renamed from: c  reason: collision with root package name */
    public final List<ak> f74864c;
    @c(a = "selected")

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f74865d;

    static {
        Covode.recordClassIndex(46159);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return this.f74862a == alVar.f74862a && this.f74863b == alVar.f74863b && l.a(this.f74864c, alVar.f74864c) && l.a(this.f74865d, alVar.f74865d);
    }

    public final int hashCode() {
        int i2 = ((this.f74862a * 31) + this.f74863b) * 31;
        List<ak> list = this.f74864c;
        int i3 = 0;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.f74865d;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "OptionListParams(multiSelect=" + this.f74862a + ", depth=" + this.f74863b + ", options=" + this.f74864c + ", selected=" + this.f74865d + ")";
    }
}
