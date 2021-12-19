package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c implements f, g, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36895b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final CopyOnWriteArrayList<f> f36896a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(22148);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22149);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        this.f36896a.clear();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean f() {
        boolean z = false;
        for (T t : this.f36896a) {
            try {
                if (!z) {
                    z = t.f();
                }
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g
    public final void b(f fVar) {
        l.c(fVar, "");
        this.f36896a.remove(fVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g
    public final void a(f fVar) {
        l.c(fVar, "");
        if (!this.f36896a.contains(fVar)) {
            this.f36896a.add(fVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        boolean z = false;
        for (T t : this.f36896a) {
            try {
                if (!z) {
                    z = t.a(cVar);
                }
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final n b(n nVar) {
        Iterator<T> it = this.f36896a.iterator();
        while (it.hasNext()) {
            try {
                nVar = it.next().b(nVar);
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return nVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        boolean z = false;
        for (T t : this.f36896a) {
            try {
                if (!z) {
                    z = t.c(cVar);
                }
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        boolean z = false;
        for (T t : this.f36896a) {
            try {
                if (!z) {
                    z = t.d(cVar);
                }
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        boolean z = false;
        for (T t : this.f36896a) {
            try {
                if (!z) {
                    z = t.b(cVar);
                }
            } catch (Exception e2) {
                com.bytedance.ies.xelement.b.g.f36700a.c("MusicPlayerOperationInterceptorDispatcher", e2.getMessage());
            }
        }
        return z;
    }
}
