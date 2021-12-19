package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class d implements e, g, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36951b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final CopyOnWriteArrayList<g> f36952a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(22197);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22198);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        this.f36952a.clear();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e
    public final void b(g gVar) {
        l.c(gVar, "");
        this.f36952a.remove(gVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e
    public final void a(g gVar) {
        l.c(gVar, "");
        if (!this.f36952a.contains(gVar)) {
            this.f36952a.add(gVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final h a(h hVar) {
        Iterator<T> it = this.f36952a.iterator();
        while (it.hasNext()) {
            try {
                hVar = it.next().a(hVar);
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return hVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final i a(i iVar) {
        l.c(iVar, "");
        Iterator<T> it = this.f36952a.iterator();
        while (it.hasNext()) {
            try {
                iVar = it.next().a(iVar);
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return iVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final f a(f fVar, c cVar) {
        Iterator<T> it = this.f36952a.iterator();
        while (it.hasNext()) {
            try {
                fVar = it.next().a(fVar, cVar);
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return fVar;
    }
}
