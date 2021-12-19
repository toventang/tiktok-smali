package com.bytedance.ies.xelement.defaultimpl.player.engine.api.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f36964a;

    /* renamed from: b  reason: collision with root package name */
    public final e f36965b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e f36966c;

    /* renamed from: d  reason: collision with root package name */
    public final g f36967d;

    /* renamed from: e  reason: collision with root package name */
    public final c f36968e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b f36969f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.b f36970g;

    static {
        Covode.recordClassIndex(22219);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f36964a, bVar.f36964a) && l.a(this.f36965b, bVar.f36965b) && l.a(this.f36966c, bVar.f36966c) && l.a(this.f36967d, bVar.f36967d) && l.a(this.f36968e, bVar.f36968e) && l.a(this.f36969f, bVar.f36969f) && l.a(this.f36970g, bVar.f36970g);
    }

    public final int hashCode() {
        d dVar = this.f36964a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        e eVar = this.f36965b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e eVar2 = this.f36966c;
        int hashCode3 = (hashCode2 + (eVar2 != null ? eVar2.hashCode() : 0)) * 31;
        g gVar = this.f36967d;
        int hashCode4 = (hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        c cVar = this.f36968e;
        int hashCode5 = (hashCode4 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar = this.f36969f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b bVar2 = this.f36970g;
        if (bVar2 != null) {
            i2 = bVar2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "AttachInfo(queueListenerRegistry=" + this.f36964a + ", playerListenerRegistry=" + this.f36965b + ", queueOperationInterceptorRegistry=" + this.f36966c + ", playerOperationInterceptorRegistry=" + this.f36967d + ", audioPlayer=" + this.f36968e + ", audioQueue=" + this.f36969f + ", audioPlayerQueueController=" + this.f36970g + ")";
    }

    public b(d dVar, e eVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e eVar2, g gVar, c cVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b bVar2) {
        l.c(dVar, "");
        l.c(eVar, "");
        l.c(eVar2, "");
        l.c(gVar, "");
        l.c(cVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        this.f36964a = dVar;
        this.f36965b = eVar;
        this.f36966c = eVar2;
        this.f36967d = gVar;
        this.f36968e = cVar;
        this.f36969f = bVar;
        this.f36970g = bVar2;
    }
}
