package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final k f135420a;

    /* renamed from: b  reason: collision with root package name */
    public final k f135421b;

    static {
        Covode.recordClassIndex(88469);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f135420a, lVar.f135420a) && h.f.b.l.a(this.f135421b, lVar.f135421b);
    }

    public final int hashCode() {
        k kVar = this.f135420a;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.f135421b;
        if (kVar2 != null) {
            i2 = kVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiStickerChangeEvent(from=" + this.f135420a + ", to=" + this.f135421b + ")";
    }

    private /* synthetic */ l() {
        this(new k(), new k());
    }

    public l(k kVar, k kVar2) {
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        this.f135420a = kVar;
        this.f135421b = kVar2;
    }
}
