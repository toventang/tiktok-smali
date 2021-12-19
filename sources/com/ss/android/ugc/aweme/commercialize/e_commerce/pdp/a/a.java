package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f73807a = 0.73f;

    /* renamed from: b  reason: collision with root package name */
    public final float f73808b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public final String f73809c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<z> f73810d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<z> f73811e;

    static {
        Covode.recordClassIndex(45455);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f73807a, aVar.f73807a) == 0 && Float.compare(this.f73808b, aVar.f73808b) == 0 && l.a(this.f73809c, aVar.f73809c) && l.a(this.f73810d, aVar.f73810d) && l.a(this.f73811e, aVar.f73811e);
    }

    public final String toString() {
        return "BulletBottomSheetConfig(peekHeightRatio=" + this.f73807a + ", maxHeightRatio=" + this.f73808b + ", schema=" + this.f73809c + ", onHideCallback=" + this.f73810d + ", onShowCallback=" + this.f73811e + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int floatToIntBits = ((Float.floatToIntBits(this.f73807a) * 31) + Float.floatToIntBits(this.f73808b)) * 31;
        String str = this.f73809c;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (floatToIntBits + i2) * 31;
        h.f.a.a<z> aVar = this.f73810d;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        h.f.a.a<z> aVar2 = this.f73811e;
        if (aVar2 != null) {
            i4 = aVar2.hashCode();
        }
        return i6 + i4;
    }

    public a(String str, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        l.d(str, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f73809c = str;
        this.f73810d = aVar;
        this.f73811e = aVar2;
    }
}
