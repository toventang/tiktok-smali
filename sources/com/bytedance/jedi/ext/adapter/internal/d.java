package com.bytedance.jedi.ext.adapter.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.c;
import com.bytedance.jedi.ext.adapter.internal.c;
import h.f.b.l;
import h.z;
import java.util.concurrent.CopyOnWriteArraySet;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39736d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f39737a;

    /* renamed from: b  reason: collision with root package name */
    public b f39738b;

    /* renamed from: c  reason: collision with root package name */
    public g f39739c;

    /* renamed from: e  reason: collision with root package name */
    private final CopyOnWriteArraySet<c> f39740e = new CopyOnWriteArraySet<>();

    /* renamed from: f  reason: collision with root package name */
    private final i f39741f;

    static {
        Covode.recordClassIndex(24479);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(24481);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(i iVar, c cVar) {
            d a2 = cVar.a(iVar);
            if (a2 != null) {
                return a2;
            }
            d dVar = new d(iVar, cVar);
            cVar.a(iVar, dVar);
            return dVar;
        }

        public static d a(e eVar, Fragment fragment) {
            c a2 = c.a.a(eVar, fragment);
            i lifecycle = a2.getLifecycle();
            l.a((Object) lifecycle, "");
            return a(lifecycle, a2);
        }
    }

    public final d a(com.bytedance.jedi.ext.adapter.c cVar) {
        l.c(cVar, "");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) cVar;
        if (this.f39740e.add(jediViewHolderProxy)) {
            jediViewHolderProxy.f39716d = this;
            this.f39741f.a(jediViewHolderProxy);
        }
        return this;
    }

    public final d b(com.bytedance.jedi.ext.adapter.c cVar) {
        l.c(cVar, "");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) cVar;
        this.f39741f.b(jediViewHolderProxy);
        int i2 = e.f39742a[this.f39741f.a().ordinal()];
        if (i2 != 2) {
            if (i2 == 3) {
                jediViewHolderProxy.onDestroy();
            } else if (i2 == 4) {
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
            } else if (i2 == 5) {
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
            }
        } else if (!jediViewHolderProxy.f39717e) {
            jediViewHolderProxy.onDestroy();
        }
        jediViewHolderProxy.f39716d = null;
        this.f39740e.remove(jediViewHolderProxy);
        return this;
    }

    public d(i iVar, c cVar) {
        l.c(iVar, "");
        l.c(cVar, "");
        this.f39741f = iVar;
        this.f39737a = cVar;
        AnonymousClass1 r1 = new h.f.a.a<z>(this) {
            /* class com.bytedance.jedi.ext.adapter.internal.d.AnonymousClass1 */
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(24480);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f39737a = null;
                b bVar = this.this$0.f39738b;
                if (bVar != null) {
                    bVar.a();
                }
                g gVar = this.this$0.f39739c;
                if (gVar != null) {
                    gVar.a();
                }
                return z.f158842a;
            }
        };
        l.c(r1, "");
        cVar.f39732b.add(r1);
    }
}
