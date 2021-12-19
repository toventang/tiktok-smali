package com.ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;

public final class r implements j {

    /* renamed from: a */
    public final boolean f92491a;

    /* renamed from: b */
    public final e f92492b;

    /* renamed from: c */
    public final f f92493c;

    /* renamed from: d */
    public final a<Boolean> f92494d;

    /* renamed from: e */
    public final p<Integer, Integer> f92495e;

    /* renamed from: f */
    public final d f92496f;

    /* renamed from: g */
    public final a<p<b, Object>> f92497g;

    static {
        Covode.recordClassIndex(58568);
    }

    public r() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f92491a == rVar.f92491a && l.a(this.f92492b, rVar.f92492b) && l.a(this.f92493c, rVar.f92493c) && l.a(this.f92494d, rVar.f92494d) && l.a(this.f92495e, rVar.f92495e) && l.a(this.f92496f, rVar.f92496f) && l.a(this.f92497g, rVar.f92497g);
    }

    public final int hashCode() {
        boolean z = this.f92491a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        e eVar = this.f92492b;
        int i6 = 0;
        int hashCode = (i5 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        f fVar = this.f92493c;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        a<Boolean> aVar = this.f92494d;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        p<Integer, Integer> pVar = this.f92495e;
        int hashCode4 = (hashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        d dVar = this.f92496f;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        a<p<b, Object>> aVar2 = this.f92497g;
        if (aVar2 != null) {
            i6 = aVar2.hashCode();
        }
        return hashCode5 + i6;
    }

    public final String toString() {
        return "VideoShareState(shareVisibility=" + this.f92491a + ", shareCountState=" + this.f92492b + ", shareIconState=" + this.f92493c + ", containerAnimation=" + this.f92494d + ", containerScale=" + this.f92495e + ", shareContainerState=" + this.f92496f + ", animationEvent=" + this.f92497g + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(d dVar, int i2) {
        this(false, null, null, null, null, (i2 & 32) != 0 ? null : dVar, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends h.p<? extends com.ss.android.ugc.aweme.feed.assem.share.b, ? extends java.lang.Object>> */
    /* JADX WARN: Multi-variable type inference failed */
    private r(boolean z, e eVar, f fVar, a<Boolean> aVar, p<Integer, Integer> pVar, d dVar, a<? extends p<? extends b, ? extends Object>> aVar2) {
        this.f92491a = z;
        this.f92492b = eVar;
        this.f92493c = fVar;
        this.f92494d = aVar;
        this.f92495e = pVar;
        this.f92496f = dVar;
        this.f92497g = aVar2;
    }

    public static /* synthetic */ r a(r rVar, boolean z, e eVar, f fVar, a aVar, p pVar, d dVar, a aVar2, int i2) {
        a aVar3 = aVar2;
        d dVar2 = dVar;
        p pVar2 = pVar;
        boolean z2 = z;
        e eVar2 = eVar;
        f fVar2 = fVar;
        a aVar4 = aVar;
        if ((i2 & 1) != 0) {
            z2 = rVar.f92491a;
        }
        if ((i2 & 2) != 0) {
            eVar2 = rVar.f92492b;
        }
        if ((i2 & 4) != 0) {
            fVar2 = rVar.f92493c;
        }
        if ((i2 & 8) != 0) {
            aVar4 = rVar.f92494d;
        }
        if ((i2 & 16) != 0) {
            pVar2 = rVar.f92495e;
        }
        if ((i2 & 32) != 0) {
            dVar2 = rVar.f92496f;
        }
        if ((i2 & 64) != 0) {
            aVar3 = rVar.f92497g;
        }
        return new r(z2, eVar2, fVar2, aVar4, pVar2, dVar2, aVar3);
    }
}
