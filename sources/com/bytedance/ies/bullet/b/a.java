package com.bytedance.ies.bullet.b;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.b;
import com.bytedance.ies.bullet.a.h;
import com.bytedance.ies.bullet.c.a;
import com.bytedance.ies.bullet.c.c;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.e;
import com.bytedance.ies.bullet.kit.a.j;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ad;
import com.bytedance.ies.bullet.service.base.af;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.b.f;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.base.q;
import com.bytedance.ies.bullet.service.base.u;
import com.bytedance.ies.bullet.service.f.g;
import h.f.b.l;

public final class a extends com.bytedance.ies.bullet.a.a {

    /* renamed from: c  reason: collision with root package name */
    private h f31951c;

    static {
        Covode.recordClassIndex(18701);
    }

    /* renamed from: com.bytedance.ies.bullet.b.a$a  reason: collision with other inner class name */
    public static final class C0668a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f31952a;

        static {
            Covode.recordClassIndex(18702);
        }

        @Override // com.bytedance.ies.bullet.c.e
        public final /* bridge */ /* synthetic */ d.b a() {
            return this.f31952a;
        }

        C0668a(b bVar) {
            this.f31952a = bVar;
        }
    }

    @Override // com.bytedance.ies.bullet.a.a
    public final b.a a() {
        Application application = this.f31951c.a().f31977c;
        b.a aVar = this.f31938b;
        f.a a2 = aVar.f31943a.a(ad.class, new com.bytedance.ies.bullet.service.e.b(application)).a(af.class, new g(this.f31951c.b())).a(q.class, new com.bytedance.ies.bullet.service.c.b(this.f31951c.g())).a(u.class, new com.bytedance.ies.bullet.service.popup.h(this.f31951c.h())).a(com.bytedance.ies.bullet.service.base.c.b.class, new com.bytedance.j.a.d(this.f31951c.f()));
        j jVar = new j(application);
        jVar.init(this.f31951c.c());
        a2.a(IResourceLoaderService.class, jVar).a(o.class, new com.bytedance.ies.bullet.service.b.a(this.f31951c.d(), this.f31951c.e()));
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(h hVar) {
        super(hVar);
        l.c(hVar, "");
        this.f31951c = hVar;
    }

    @Override // com.bytedance.ies.bullet.a.a
    public final b a(String str) {
        l.c(str, "");
        Application application = this.f31951c.a().f31977c;
        com.bytedance.ies.bullet.c.a.a aVar = new com.bytedance.ies.bullet.c.a.a(this.f31951c.a().f31977c);
        if (str.length() == 0) {
            str = this.f31951c.a().f31975a;
        }
        l.c(str, "");
        aVar.f31975a = str;
        aVar.a(this.f31951c.a().f31976b);
        b.a a2 = a();
        e.a.a().a(aVar.f31975a, a2.f31943a.a(aVar.f31975a).a());
        b.a aVar2 = (b.a) a2.a(ILynxKitApi.class);
        l.c(application, "");
        a.C0669a aVar3 = aVar2.f31944b;
        com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
        bVar.b(Application.class, application);
        l.c(bVar, "");
        aVar3.f31966a = bVar;
        l.c(aVar, "");
        a.C0669a aVar4 = aVar2.f31944b;
        l.c(aVar, "");
        aVar4.f31967b = aVar;
        com.bytedance.ies.bullet.a.g gVar = this.f31937a;
        if (gVar != null) {
            gVar.a(aVar2, aVar);
        }
        b a3 = aVar2.a();
        c.a(aVar.f31975a, new C0668a(a3));
        return a3;
    }
}
