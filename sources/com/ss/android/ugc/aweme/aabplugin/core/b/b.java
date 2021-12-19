package com.ss.android.ugc.aweme.aabplugin.core.b;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.m.b.a;
import com.bytedance.m.c;
import com.google.android.play.core.e.f;
import com.google.android.play.core.e.g;
import com.ss.android.ugc.aweme.aabplugin.core.base.m;
import java.util.Locale;

public final class b extends m<d> implements g {
    static {
        Covode.recordClassIndex(38431);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final void b() {
        com.bytedance.m.a.b.b().f41311a.add(this);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final void c() {
        com.bytedance.m.a.b.b().f41311a.remove(this);
    }

    public b(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(a aVar) {
        b(aVar);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final boolean b(com.bytedance.ies.foundation.activity.a aVar) {
        f a2;
        d dVar = (d) this.f62500g;
        if (dVar == null || (a2 = e.a(dVar.q.getLanguage())) == null) {
            return false;
        }
        return com.bytedance.m.a.b.b().f41313c.a(a2, aVar, this.f62496c);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.play.core.c.a
    public final /* synthetic */ void a(f fVar) {
        f fVar2 = fVar;
        d dVar = (d) this.f62500g;
        if (fVar2.g().size() > 0 && dVar != null) {
            Locale locale = dVar.q;
            for (String str : fVar2.g()) {
                if (TextUtils.equals(new Locale(str).getLanguage(), locale.getLanguage())) {
                    e.f62457a.put(locale.getLanguage(), fVar2);
                    a aVar = new a("com.ss.android.ugc.aweme.dflanguage", c.f41338c.b(), fVar2.b());
                    aVar.f41330d = fVar2.e();
                    aVar.f41331e = fVar2.d();
                    aVar.f41334h = fVar2.h();
                    aVar.f41333g = fVar2.c();
                    i.b(new c(this, aVar), i.f4824a);
                    return;
                }
            }
        }
    }
}
