package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import h.a.n;
import java.util.List;

public final class e implements a {
    static {
        Covode.recordClassIndex(22189);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a
    public final f a(h hVar) {
        List<f> b2;
        if (hVar == null || (b2 = hVar.b()) == null) {
            return null;
        }
        return (f) n.b((List) b2, hVar.c() - 1);
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
    public final f c(h hVar) {
        List<f> b2;
        if (hVar == null || (b2 = hVar.b()) == null) {
            return null;
        }
        return (f) n.b((List) b2, hVar.c() + 1);
    }
}
