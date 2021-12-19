package com.ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.f;
import com.ss.android.ugc.aweme.editSticker.interact.view.a;
import com.ss.android.ugc.aweme.editSticker.interact.view.d;
import h.f.b.l;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f88094a;

    /* renamed from: b  reason: collision with root package name */
    public final int f88095b;

    /* renamed from: c  reason: collision with root package name */
    public final f f88096c;

    /* renamed from: d  reason: collision with root package name */
    public final a f88097d;

    /* renamed from: e  reason: collision with root package name */
    public final d f88098e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.a<z> f88099f;

    static {
        Covode.recordClassIndex(55382);
    }

    public c() {
        this(0, 0, (f) null, (a) null, (d) null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f88094a == cVar.f88094a && this.f88095b == cVar.f88095b && l.a(this.f88096c, cVar.f88096c) && l.a(this.f88097d, cVar.f88097d) && l.a(this.f88098e, cVar.f88098e) && l.a(this.f88099f, cVar.f88099f);
    }

    public final int hashCode() {
        int i2 = ((this.f88094a * 31) + this.f88095b) * 31;
        f fVar = this.f88096c;
        int i3 = 0;
        int hashCode = (i2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        a aVar = this.f88097d;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        d dVar = this.f88098e;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        h.f.a.a<z> aVar2 = this.f88099f;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        return "EditStickerConfig(defaultVideoWidth=" + this.f88094a + ", defaultVideoHeight=" + this.f88095b + ", stickerDeleteViewFactory=" + this.f88096c + ", borderLineViewFactory=" + this.f88097d + ", fakeFeedViewFactory=" + this.f88098e + ", textStickerConvertToQaSticker=" + this.f88099f + ")";
    }

    public c(int i2, int i3, f fVar, a aVar, d dVar, h.f.a.a<z> aVar2) {
        this.f88094a = i2;
        this.f88095b = i3;
        this.f88096c = fVar;
        this.f88097d = aVar;
        this.f88098e = dVar;
        this.f88099f = aVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, int i3, f fVar, a aVar, d dVar, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? new com.ss.android.ugc.aweme.editSticker.interact.a() : fVar, (i4 & 8) != 0 ? new com.ss.android.ugc.aweme.editSticker.interact.view.c() : aVar, (i4 & 16) != 0 ? null : dVar, (h.f.a.a<z>) null);
    }
}
