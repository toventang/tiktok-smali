package com.ss.android.ugc.aweme.editSticker.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super StickerItemModel, Boolean> f88244a;

    static {
        Covode.recordClassIndex(55474);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f88244a, ((b) obj).f88244a);
        }
        return true;
    }

    public final int hashCode() {
        h.f.a.b<? super StickerItemModel, Boolean> bVar = this.f88244a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StickerItemModelConfigure(infoStickerTypeExtraPredicate=" + this.f88244a + ")";
    }

    public /* synthetic */ b() {
        this(AnonymousClass1.f88245a);
    }

    private b(h.f.a.b<? super StickerItemModel, Boolean> bVar) {
        l.d(bVar, "");
        this.f88244a = bVar;
    }
}
