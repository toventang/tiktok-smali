package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import com.ss.android.ugc.aweme.feed.background.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.o;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public o f92896a;

    static {
        Covode.recordClassIndex(58931);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final h k() {
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final i l() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean h() {
        o oVar = this.f92896a;
        if (oVar == null) {
            l.a("playerController");
        }
        if (oVar.I() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean i() {
        o oVar = this.f92896a;
        if (oVar == null) {
            l.a("playerController");
        }
        if (oVar.A() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean j() {
        o oVar = this.f92896a;
        if (oVar == null) {
            l.a("playerController");
        }
        if (oVar.z() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f m() {
        o oVar = this.f92896a;
        if (oVar == null) {
            l.a("playerController");
        }
        Aweme I = oVar.I();
        if (I != null) {
            return a.a(I);
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f n() {
        o oVar = this.f92896a;
        if (oVar == null) {
            l.a("playerController");
        }
        Aweme A = oVar.A();
        if (A != null) {
            return a.a(A);
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f o() {
        o oVar = this.f92896a;
        if (oVar == null) {
            l.a("playerController");
        }
        Aweme z = oVar.z();
        if (z != null) {
            return a.a(z);
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(h hVar) {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(i iVar) {
        l.d(iVar, "");
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(f fVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }
}
