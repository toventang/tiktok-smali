package com.ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.api.model.c;
import com.ss.android.ugc.aweme.compliance.api.model.g;
import com.ss.android.ugc.aweme.compliance.api.model.h;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import f.a.t;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f77491a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final UserSettingsApi f77492b = ((UserSettingsApi) RetrofitFactory.a().a(com.ss.android.ugc.aweme.compliance.common.a.a.f77273a).a(UserSettingsApi.class));

    private b() {
    }

    static {
        Covode.recordClassIndex(47951);
    }

    public static t<f> a() {
        String b2 = com.ss.android.ugc.aweme.co.b.b().b(d.a(), "last_user_setting_version", "");
        UserSettingsApi userSettingsApi = f77492b;
        l.b(b2, "");
        t<f> a2 = userSettingsApi.getUserSettings(b2).b(a.f77493a).a(C1791b.f77494a);
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77493a = new a();

        static {
            Covode.recordClassIndex(47952);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/user/settings/", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b$b  reason: collision with other inner class name */
    public static final class C1791b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C1791b f77494a = new C1791b();

        static {
            Covode.recordClassIndex(47953);
        }

        C1791b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/user/settings/", com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th), com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th));
        }
    }

    public static void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.co.b.b().a(d.a(), "last_user_setting_version", str);
    }

    public static q a(f fVar, q qVar) {
        q qVar2 = qVar;
        l.d(fVar, "");
        g gVar = new g(fVar.v, fVar.s, fVar.u, fVar.r);
        com.ss.android.ugc.aweme.compliance.api.model.t tVar = new com.ss.android.ugc.aweme.compliance.api.model.t(fVar.ah, fVar.ai, fVar.aj, fVar.ak, fVar.al);
        h hVar = new h(fVar.J);
        c cVar = new c(fVar.am);
        com.ss.android.ugc.aweme.compliance.api.model.d dVar = new com.ss.android.ugc.aweme.compliance.api.model.d(fVar.C, fVar.F);
        boolean b2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.b();
        if (qVar2 == null) {
            qVar2 = new q(null, null, null, null, null, null, null, 0);
        }
        return q.a(qVar2, gVar, tVar, hVar, cVar, dVar, null, null, b2 ? 1 : 0, 96);
    }
}
