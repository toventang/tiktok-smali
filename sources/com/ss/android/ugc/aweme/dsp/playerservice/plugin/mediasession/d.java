package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f83652a;

    /* renamed from: b  reason: collision with root package name */
    public final b f83653b;

    /* renamed from: c  reason: collision with root package name */
    public final g f83654c;

    static {
        Covode.recordClassIndex(52197);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f83652a, dVar.f83652a) && l.a(this.f83653b, dVar.f83653b) && l.a(this.f83654c, dVar.f83654c);
    }

    public final int hashCode() {
        c cVar = this.f83652a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        b bVar = this.f83653b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        g gVar = this.f83654c;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MediaSessionConfig(coverLoader=" + this.f83652a + ", backgroundHelper=" + this.f83653b + ", notification=" + this.f83654c + ")";
    }

    public d(c cVar, b bVar, g gVar) {
        l.d(gVar, "");
        this.f83652a = cVar;
        this.f83653b = bVar;
        this.f83654c = gVar;
    }
}
