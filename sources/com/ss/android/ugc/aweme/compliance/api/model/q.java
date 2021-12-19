package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class q {
    @c(a = "item_settings")

    /* renamed from: a  reason: collision with root package name */
    public final g f76685a;
    @c(a = "suggest_settings")

    /* renamed from: b  reason: collision with root package name */
    public final t f76686b;
    @c(a = "liked_list")

    /* renamed from: c  reason: collision with root package name */
    public final h f76687c;
    @c(a = "follow_list")

    /* renamed from: d  reason: collision with root package name */
    public final c f76688d;
    @c(a = "im_settings")

    /* renamed from: e  reason: collision with root package name */
    public final d f76689e;
    @c(a = "involve_settings")

    /* renamed from: f  reason: collision with root package name */
    public final f f76690f;
    @c(a = "recommendation")

    /* renamed from: g  reason: collision with root package name */
    public final s f76691g;
    @c(a = "private_account")

    /* renamed from: h  reason: collision with root package name */
    public int f76692h;

    static {
        Covode.recordClassIndex(47363);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f76685a, qVar.f76685a) && l.a(this.f76686b, qVar.f76686b) && l.a(this.f76687c, qVar.f76687c) && l.a(this.f76688d, qVar.f76688d) && l.a(this.f76689e, qVar.f76689e) && l.a(this.f76690f, qVar.f76690f) && l.a(this.f76691g, qVar.f76691g) && this.f76692h == qVar.f76692h;
    }

    public final int hashCode() {
        g gVar = this.f76685a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        t tVar = this.f76686b;
        int hashCode2 = (hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31;
        h hVar = this.f76687c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        c cVar = this.f76688d;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d dVar = this.f76689e;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        f fVar = this.f76690f;
        int hashCode6 = (hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        s sVar = this.f76691g;
        if (sVar != null) {
            i2 = sVar.hashCode();
        }
        return ((hashCode6 + i2) * 31) + this.f76692h;
    }

    public final String toString() {
        return "PrivacyUserSettings(itemSettings=" + this.f76685a + ", suggestSettings=" + this.f76686b + ", likedList=" + this.f76687c + ", followList=" + this.f76688d + ", imSettings=" + this.f76689e + ", involveSettings=" + this.f76690f + ", recommendation=" + this.f76691g + ", privateAccount=" + this.f76692h + ")";
    }

    public q(g gVar, t tVar, h hVar, c cVar, d dVar, f fVar, s sVar, int i2) {
        this.f76685a = gVar;
        this.f76686b = tVar;
        this.f76687c = hVar;
        this.f76688d = cVar;
        this.f76689e = dVar;
        this.f76690f = fVar;
        this.f76691g = sVar;
        this.f76692h = i2;
    }

    public static /* synthetic */ q a(q qVar, g gVar, t tVar, h hVar, c cVar, d dVar, f fVar, s sVar, int i2, int i3) {
        int i4 = i2;
        s sVar2 = sVar;
        f fVar2 = fVar;
        d dVar2 = dVar;
        g gVar2 = gVar;
        t tVar2 = tVar;
        h hVar2 = hVar;
        c cVar2 = cVar;
        if ((i3 & 1) != 0) {
            gVar2 = qVar.f76685a;
        }
        if ((i3 & 2) != 0) {
            tVar2 = qVar.f76686b;
        }
        if ((i3 & 4) != 0) {
            hVar2 = qVar.f76687c;
        }
        if ((i3 & 8) != 0) {
            cVar2 = qVar.f76688d;
        }
        if ((i3 & 16) != 0) {
            dVar2 = qVar.f76689e;
        }
        if ((i3 & 32) != 0) {
            fVar2 = qVar.f76690f;
        }
        if ((i3 & 64) != 0) {
            sVar2 = qVar.f76691g;
        }
        if ((i3 & 128) != 0) {
            i4 = qVar.f76692h;
        }
        return new q(gVar2, tVar2, hVar2, cVar2, dVar2, fVar2, sVar2, i4);
    }
}
