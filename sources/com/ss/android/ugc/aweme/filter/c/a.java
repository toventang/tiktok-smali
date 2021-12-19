package com.ss.android.ugc.aweme.filter.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f95493a;

    /* renamed from: b  reason: collision with root package name */
    public final FilterBean f95494b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f95495c;

    /* renamed from: d  reason: collision with root package name */
    public final String f95496d;

    static {
        Covode.recordClassIndex(60501);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f95493a == aVar.f95493a && l.a(this.f95494b, aVar.f95494b) && this.f95495c == aVar.f95495c && l.a(this.f95496d, aVar.f95496d);
    }

    public final int hashCode() {
        boolean z = this.f95493a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        FilterBean filterBean = this.f95494b;
        int i7 = 0;
        int hashCode = (i6 + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        if (!this.f95495c) {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 31;
        String str = this.f95496d;
        if (str != null) {
            i7 = str.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "FilterBeanOp(isAutoUse=" + this.f95493a + ", filter=" + this.f95494b + ", isComposerFilter=" + this.f95495c + ", curNodePath=" + this.f95496d + ")";
    }

    public /* synthetic */ a(boolean z, FilterBean filterBean) {
        this(z, filterBean, false, null);
    }

    public a(boolean z, FilterBean filterBean, boolean z2, String str) {
        this.f95493a = z;
        this.f95494b = filterBean;
        this.f95495c = false;
        this.f95496d = str;
    }
}
