package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a<Boolean> f121853a;

    /* renamed from: b  reason: collision with root package name */
    public final ShortVideoContext f121854b;

    /* renamed from: c  reason: collision with root package name */
    public final a<z> f121855c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<Boolean, z> f121856d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.b<Integer, Integer> f121857e;

    static {
        Covode.recordClassIndex(79910);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f121853a, bVar.f121853a) && l.a(this.f121854b, bVar.f121854b) && l.a(this.f121855c, bVar.f121855c) && l.a(this.f121856d, bVar.f121856d) && l.a(this.f121857e, bVar.f121857e);
    }

    public final int hashCode() {
        a<Boolean> aVar = this.f121853a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        ShortVideoContext shortVideoContext = this.f121854b;
        int hashCode2 = (hashCode + (shortVideoContext != null ? shortVideoContext.hashCode() : 0)) * 31;
        a<z> aVar2 = this.f121855c;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        h.f.a.b<Boolean, z> bVar = this.f121856d;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        h.f.a.b<Integer, Integer> bVar2 = this.f121857e;
        if (bVar2 != null) {
            i2 = bVar2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AddLiveModuleFunctionContext(isSupportLive=" + this.f121853a + ", shortVideoContext=" + this.f121854b + ", mobWithoutLiveForSetting=" + this.f121855c + ", mobWithoutLiveForApi=" + this.f121856d + ", getLiveIndex=" + this.f121857e + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a<Boolean> aVar, ShortVideoContext shortVideoContext, a<z> aVar2, h.f.a.b<? super Boolean, z> bVar, h.f.a.b<? super Integer, Integer> bVar2) {
        l.d(aVar, "");
        l.d(shortVideoContext, "");
        l.d(aVar2, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f121853a = aVar;
        this.f121854b = shortVideoContext;
        this.f121855c = aVar2;
        this.f121856d = bVar;
        this.f121857e = bVar2;
    }
}
