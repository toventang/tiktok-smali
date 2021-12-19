package com.bytedance.ies.bullet.service.webkit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.d;
import com.bytedance.ies.bullet.service.base.web.e;
import com.bytedance.ies.bullet.service.base.web.i;
import com.bytedance.ies.bullet.service.base.web.j;
import com.bytedance.ies.bullet.service.base.web.m;
import com.bytedance.ies.bullet.service.base.web.n;
import com.bytedance.ies.bullet.service.base.web.q;
import com.bytedance.webx.h;
import h.f.b.l;

public final class b extends com.bytedance.ies.bullet.service.base.b.a implements d {
    static {
        Covode.recordClassIndex(19705);
    }

    public static final class a extends h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f33016a;

        static {
            Covode.recordClassIndex(19706);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f33016a = bVar;
        }

        @Override // com.bytedance.webx.h.d
        public final void a(h.a aVar) {
            l.c(aVar, "");
            j jVar = (j) this.f33016a.a(j.class);
            if (jVar != null) {
                jVar.a(aVar);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.d
    public final i a(q qVar) {
        l.c(qVar, "");
        return new c(this, qVar);
    }

    @Override // com.bytedance.ies.bullet.service.base.web.d
    public final void a(Context context, m mVar) {
        e eVar;
        l.c(context, "");
        l.c(mVar, "");
        h.a(context);
        h.a("webx_webkit", com.bytedance.webx.e.a.e.class, new a(this));
        a(j.class);
        n nVar = mVar.f32649a;
        if (nVar != null && (eVar = (e) a(e.class)) != null) {
            eVar.a(context, nVar);
        }
    }
}
