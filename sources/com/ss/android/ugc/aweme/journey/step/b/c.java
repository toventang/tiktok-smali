package com.ss.android.ugc.aweme.journey.step.b;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Locale;
import java.util.Objects;

public final class c implements com.ss.android.ugc.aweme.journey.step.c<b, d> {

    /* renamed from: a  reason: collision with root package name */
    private b f104954a;

    static {
        Covode.recordClassIndex(67284);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final b<d, z> a() {
        return a.f104955a;
    }

    static final class a extends m implements b<d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104955a = new a();

        static {
            Covode.recordClassIndex(67285);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            l.d(dVar, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.ss.android.ugc.aweme.journey.step.c
    public final /* synthetic */ long a(d dVar) {
        l.d(dVar, "");
        return 0;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        b bVar = new b();
        this.f104954a = bVar;
        return bVar;
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ void c(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        b<Fragment, z> f2 = dVar.f();
        b bVar = this.f104954a;
        if (bVar == null) {
            l.b();
        }
        f2.invoke(bVar);
    }

    @Override // com.ss.android.d.a.a
    public final /* synthetic */ boolean a(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        String h2 = SettingServiceImpl.v().h();
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(h2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = h2.toUpperCase(locale);
        l.b(upperCase, "");
        if (TextUtils.equals("EN", upperCase) && TextUtils.equals("MY", d.g()) && dVar.a() && !dVar.c().contains(Integer.valueOf(com.ss.android.c.c.JOURNEY_APP_LANGUAGE_ID.getId()))) {
            return true;
        }
        return false;
    }
}
