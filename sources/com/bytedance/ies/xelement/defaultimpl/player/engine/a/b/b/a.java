package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.k;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c;
import h.f.b.l;

public final class a implements d, f, k {

    /* renamed from: a  reason: collision with root package name */
    public c f36887a;

    /* renamed from: b  reason: collision with root package name */
    private c f36888b;

    /* renamed from: c  reason: collision with root package name */
    private c f36889c;

    /* renamed from: d  reason: collision with root package name */
    private c f36890d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a f36891e;

    static {
        Covode.recordClassIndex(22147);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(long j2) {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(n nVar) {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final n b(n nVar) {
        return nVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void b() {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void b(long j2) {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void d() {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void e() {
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean f() {
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.k
    public final c g() {
        return this.f36887a;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean c(c cVar) {
        this.f36889c = cVar;
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean d(c cVar) {
        this.f36890d = cVar;
        return false;
    }

    public a(com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a aVar) {
        l.c(aVar, "");
        this.f36891e = aVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(b bVar) {
        l.c(bVar, "");
        l.c(bVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
        l.c(lVar, "");
        l.c(lVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean b(c cVar) {
        this.f36887a = cVar;
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(o oVar) {
        l.c(oVar, "");
        l.c(oVar, "");
        if (oVar == o.PLAYBACK_STATE_STOPPED) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d h2 = this.f36891e.h();
            if (h2.f36899a != null && h2.a().j()) {
                this.f36890d = new c("STOP_FROM_PLAY_COMPLETION");
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(q qVar) {
        l.c(qVar, "");
        l.c(qVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean a(c cVar) {
        this.f36888b = cVar;
        return false;
    }
}
