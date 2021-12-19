package com.ss.android.ugc.aweme.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final String f69583a;

    /* renamed from: b  reason: collision with root package name */
    public final long f69584b;

    /* renamed from: c  reason: collision with root package name */
    public final long f69585c;

    static {
        Covode.recordClassIndex(42924);
    }

    @Override // com.ss.android.ugc.aweme.c.e
    public final boolean a(e eVar) {
        l.d(eVar, "");
        if (l.a(eVar, this)) {
            return true;
        }
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        if (!(!l.a((Object) this.f69583a, (Object) bVar.f69583a)) && this.f69584b == bVar.f69584b && this.f69585c == bVar.f69585c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, long j2, long j3) {
        super((byte) 0);
        l.d(str, "");
        this.f69583a = str;
        this.f69584b = j2;
        this.f69585c = j3;
    }
}
