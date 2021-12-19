package com.ss.android.ugc.aweme.journey.step.swipeup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Locale;

public final class c implements com.ss.android.ugc.aweme.journey.step.c<b, d> {

    /* renamed from: a  reason: collision with root package name */
    private b f105164a;

    static {
        Covode.recordClassIndex(67424);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<d, z> a() {
        return new a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(d dVar) {
        l.d(dVar, "");
        return 0;
    }

    static final class a extends m implements b<d, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(67425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            if (!c.a(dVar2)) {
                dVar2.p().invoke();
            }
            return z.f158842a;
        }
    }

    public static boolean a(d dVar) {
        com.ss.android.ugc.aweme.language.b n = dVar.n();
        if (n == null || TextUtils.equals(n.f(), dVar.o().f())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        b<Fragment, z> f2 = dVar.f();
        b bVar = this.f105164a;
        if (bVar == null) {
            l.b();
        }
        f2.invoke(bVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        if (!dVar.m() && !dVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_SWIPE_UP_ID.getId())) && !dVar.b().S_()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        this.f105164a = new b();
        if (!a(dVar)) {
            int i2 = Build.VERSION.SDK_INT;
            com.ss.android.ugc.aweme.language.b n = dVar.n();
            if (n != null) {
                Locale c2 = n.c();
                Context context = dVar.l().invoke().get();
                if (context != null) {
                    Resources resources = context.getResources();
                    l.b(resources, "");
                    Configuration configuration = new Configuration(resources.getConfiguration());
                    configuration.setLocale(c2);
                    b bVar = this.f105164a;
                    if (bVar == null) {
                        l.b();
                    }
                    bVar.f105149l = context.createConfigurationContext(configuration);
                }
            }
        }
        return this.f105164a;
    }
}
