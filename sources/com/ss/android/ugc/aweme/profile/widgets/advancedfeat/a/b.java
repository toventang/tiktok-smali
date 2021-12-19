package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.d;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureTranslationsAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.i;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.r;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class b extends f {
    static {
        Covode.recordClassIndex(76022);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        super.b(view);
        a aVar = a.f117594a;
        l.d(this, "");
        l.d(aVar, "");
        d dVar = new d();
        aVar.invoke(dVar);
        List<com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.a<AREA>> list = dVar.f117599a;
        l.d(list, "");
        this.f117601j = ((com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.a) n.i((List) list)).f117596a.getId();
        com.bytedance.assem.arch.extensions.d.a(this, new f.c(this, list));
    }

    static final class a extends m implements h.f.a.b<d<a>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117594a = new a();

        static {
            Covode.recordClassIndex(76023);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d<a> dVar) {
            d<a> dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(a.LiveEvent, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.a.class));
            dVar2.a(a.QA, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.f.class));
            dVar2.a(a.Translations, ab.a(ProfileAdvancedFeatureTranslationsAssem.class));
            dVar2.a(a.Supporting, ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.n.class));
            dVar2.a(a.Shoutouts, ab.a(i.class));
            dVar2.a(a.Tipping, ab.a(r.class));
            return z.f158842a;
        }
    }
}
