package com.ss.android.ugc.aweme.profile.widgets.navbar.b.b;

import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class i extends com.ss.android.ugc.aweme.profile.widgets.navbar.a.i {
    static {
        Covode.recordClassIndex(76581);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.i, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        d.a(this, ab.a(j.class), j.f118027a, new a(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(g gVar) {
        g gVar2 = gVar;
        l.d(gVar2, "");
        gVar2.a("");
    }

    static final class a extends m implements b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            final T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            this.this$0.a(new b<g, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.i.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(76583);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(g gVar) {
                    g gVar2 = gVar;
                    l.d(gVar2, "");
                    gVar2.a(i.a(t)).b(i.b(t));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }
}
