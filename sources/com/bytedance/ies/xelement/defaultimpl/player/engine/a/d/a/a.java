package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import h.a.n;
import java.util.List;

public final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a {
    static {
        Covode.recordClassIndex(22185);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a
    public final f b(h hVar) {
        List<f> b2;
        if (hVar == null || (b2 = hVar.b()) == null) {
            return null;
        }
        return (f) n.b((List) b2, hVar.c());
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a
    public final f a(h hVar) {
        int c2;
        if (hVar == null) {
            return null;
        }
        if (hVar.c() - 1 < 0) {
            c2 = n.a((List) hVar.b());
        } else {
            c2 = hVar.c() - 1;
        }
        return (f) n.b((List) hVar.b(), c2);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a
    public final f c(h hVar) {
        int c2;
        if (hVar == null) {
            return null;
        }
        if (hVar.c() + 1 > n.a((List) hVar.b())) {
            c2 = 0;
        } else {
            c2 = hVar.c() + 1;
        }
        return (f) n.b((List) hVar.b(), c2);
    }
}
