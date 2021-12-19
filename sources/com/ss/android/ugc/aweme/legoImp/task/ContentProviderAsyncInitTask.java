package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.c;
import com.bytedance.ies.powerlist.debug.Dr;
import com.ss.android.ugc.aweme.experiment.bc;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.da;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class ContentProviderAsyncInitTask implements w {
    static {
        Covode.recordClassIndex(68957);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class a extends m implements b<com.bytedance.ies.powerlist.debug.b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107763a = new a();

        static {
            Covode.recordClassIndex(68958);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.powerlist.debug.b bVar) {
            com.bytedance.ies.powerlist.debug.b bVar2 = bVar;
            l.d(bVar2, "");
            da.a.a(bVar2.f34285b).a(bVar2.f34284a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        if (!d.d() && (bc.b() || bc.c())) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            c.a((Application) applicationContext);
        }
        com.bytedance.ies.powerlist.debug.a aVar = new com.bytedance.ies.powerlist.debug.a(a.f107763a);
        l.c(aVar, "");
        Dr.f34270a = aVar;
        Dr.f34271b = false;
    }
}
