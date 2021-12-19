package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36942c = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final i f36943f = i.SEQUENCE;

    /* renamed from: g  reason: collision with root package name */
    private static final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a f36944g = com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a.b.a(i.SEQUENCE);

    /* renamed from: a  reason: collision with root package name */
    public h f36945a;

    /* renamed from: b  reason: collision with root package name */
    public i f36946b = f36943f;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a f36947d = f36944g;

    /* renamed from: e  reason: collision with root package name */
    private final c f36948e;

    public static final class a {
        static {
            Covode.recordClassIndex(22191);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void f() {
        this.f36945a = null;
        this.f36947d = null;
    }

    public final boolean a() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (e() != null) {
            return true;
        }
        return false;
    }

    public final f c() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a aVar = this.f36947d;
        if (aVar != null) {
            return aVar.b(this.f36945a);
        }
        return null;
    }

    public final f d() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a aVar = this.f36947d;
        if (aVar != null) {
            return aVar.c(this.f36945a);
        }
        return null;
    }

    public final f e() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a aVar = this.f36947d;
        if (aVar != null) {
            return aVar.a(this.f36945a);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(22190);
    }

    public b(c cVar) {
        l.c(cVar, "");
        this.f36948e = cVar;
    }

    public final void a(h hVar) {
        f fVar;
        List<f> b2;
        this.f36945a = hVar;
        this.f36948e.a_(hVar);
        if (hVar == null || (b2 = hVar.b()) == null) {
            fVar = null;
        } else {
            fVar = (f) n.b((List) b2, hVar.c());
        }
        a(fVar);
    }

    public final void a(f fVar) {
        String str;
        h hVar = this.f36945a;
        if (hVar != null) {
            int i2 = -1;
            List<f> b2 = hVar.b();
            if (b2 != null) {
                int i3 = 0;
                Iterator<f> it = b2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String id = it.next().getId();
                    if (fVar != null) {
                        str = fVar.getId();
                    } else {
                        str = null;
                    }
                    if (l.a((Object) id, (Object) str)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
            hVar.a(i2);
        }
        this.f36948e.a(fVar);
    }

    public final void a(i iVar) {
        l.c(iVar, "");
        this.f36946b = iVar;
        this.f36947d = com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a.b.a(iVar);
        this.f36948e.a_(iVar);
    }
}
