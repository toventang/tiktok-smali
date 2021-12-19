package com.ss.android.ugc.aweme.choosemusic.model.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.ah;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f70596a;

    /* renamed from: b  reason: collision with root package name */
    public final ah f70597b;

    static {
        Covode.recordClassIndex(43538);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f70596a, dVar.f70596a) && l.a(this.f70597b, dVar.f70597b);
    }

    public final int hashCode() {
        e eVar = this.f70596a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        ah ahVar = this.f70597b;
        if (ahVar != null) {
            i2 = ahVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MusicListRequestData(musicListRequestParam=" + this.f70596a + ", musicPickResponse=" + this.f70597b + ")";
    }

    public d(e eVar, ah ahVar) {
        l.d(eVar, "");
        l.d(ahVar, "");
        this.f70596a = eVar;
        this.f70597b = ahVar;
    }
}
