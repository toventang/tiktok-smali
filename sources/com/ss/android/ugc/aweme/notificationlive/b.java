package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.aq;
import h.f.b.l;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f114313a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Boolean> f114314b;

    /* renamed from: c  reason: collision with root package name */
    public final int f114315c;

    /* renamed from: d  reason: collision with root package name */
    public final d f114316d;

    /* renamed from: e  reason: collision with root package name */
    public final d f114317e;

    static {
        Covode.recordClassIndex(73504);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f114313a, bVar.f114313a) && l.a(this.f114314b, bVar.f114314b) && this.f114315c == bVar.f114315c && l.a(this.f114316d, bVar.f114316d) && l.a(this.f114317e, bVar.f114317e);
    }

    public final int hashCode() {
        String str = this.f114313a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a<Boolean> aVar = this.f114314b;
        int hashCode2 = (((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f114315c) * 31;
        d dVar = this.f114316d;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        d dVar2 = this.f114317e;
        if (dVar2 != null) {
            i2 = dVar2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "GameResponseState(statusMsg=" + this.f114313a + ", open=" + this.f114314b + ", statusCode=" + this.f114315c + ", cacheEvent=" + this.f114316d + ", networkEvent=" + this.f114317e + ")";
    }

    public /* synthetic */ b() {
        this("", aq.f39400a, -1, null, null);
    }

    public static /* synthetic */ b a(b bVar, a aVar, int i2, d dVar) {
        String str = bVar.f114313a;
        d dVar2 = bVar.f114316d;
        l.d(str, "");
        l.d(aVar, "");
        return new b(str, aVar, i2, dVar2, dVar);
    }

    private b(String str, a<Boolean> aVar, int i2, d dVar, d dVar2) {
        l.d(str, "");
        l.d(aVar, "");
        this.f114313a = str;
        this.f114314b = aVar;
        this.f114315c = i2;
        this.f114316d = dVar;
        this.f114317e = dVar2;
    }
}
