package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.login.f;
import com.ss.android.ugc.aweme.login.g;
import com.ss.android.ugc.aweme.login.h;
import com.ss.android.ugc.aweme.net.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;

public final class a implements bf {

    /* renamed from: a  reason: collision with root package name */
    private final C1504a f66883a = new C1504a();

    /* renamed from: b  reason: collision with root package name */
    private final b f66884b = new b();

    static {
        Covode.recordClassIndex(41191);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.services.a$a  reason: collision with other inner class name */
    public static final class C1504a implements IAccountService.a {
        static {
            Covode.recordClassIndex(41192);
        }

        C1504a() {
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.a
        public final i<Bundle> a(Bundle bundle) {
            l.d(bundle, "");
            i<Bundle> b2 = i.b(new e(bundle), i.f4826c);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.a
        public final i<Bundle> b(Bundle bundle) {
            l.d(bundle, "");
            i<Bundle> b2 = i.b(new f(bundle), i.f4826c);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.a
        public final i<Bundle> a(Bundle bundle, com.ss.android.ugc.aweme.ac.b bVar) {
            i<Bundle> b2;
            l.d(bundle, "");
            l.d(bVar, "");
            if (bVar.f62561a) {
                b2 = i.b(new h(bundle, bVar), i.f4825b);
            } else {
                b2 = i.b(new g(bundle, bVar), i.f4825b);
            }
            l.b(b2, "");
            return b2;
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.legacy.b {
        static {
            Covode.recordClassIndex(41193);
        }

        b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.app.services.a$b$a  reason: collision with other inner class name */
        public static final class C1505a implements d<Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.legacy.a f66885a;

            static {
                Covode.recordClassIndex(41194);
            }

            @Override // com.ss.android.ugc.aweme.net.d
            public final void a(Exception exc) {
            }

            @Override // com.ss.android.ugc.aweme.net.d
            public final void a() {
                this.f66885a.a();
            }

            C1505a(com.ss.android.ugc.aweme.legacy.a aVar) {
                this.f66885a = aVar;
            }
        }

        @Override // com.ss.android.ugc.aweme.legacy.b
        public final void a() {
            v.O().B();
        }

        @Override // com.ss.android.ugc.aweme.legacy.b
        public final void a(String str, com.ss.android.ugc.aweme.legacy.a aVar) {
            l.d(str, "");
            l.d(aVar, "");
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(str);
            gVar.a(StringSet.type, "0");
            com.ss.android.ugc.aweme.net.b bVar = new com.ss.android.ugc.aweme.net.b(gVar.toString(), com.ss.android.ugc.aweme.net.i.GET, String.class);
            bVar.f112221a = new C1505a(aVar);
            bVar.a(com.bytedance.ies.ugc.appcontext.d.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final IAccountService.a e() {
        return this.f66883a;
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final com.ss.android.ugc.aweme.legacy.b f() {
        return this.f66884b;
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final String b() {
        return com.ss.android.ugc.aweme.compliance.api.a.k().b();
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final String c() {
        return com.ss.android.ugc.aweme.compliance.api.a.k().c();
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final int d() {
        return com.ss.android.ugc.aweme.compliance.api.a.h().a();
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final boolean a() {
        com.ss.android.ugc.aweme.compliance.api.a.k().a();
        b();
        c();
        if (!com.ss.android.ugc.aweme.compliance.api.a.k().a() || TextUtils.isEmpty(b()) || TextUtils.isEmpty(c())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.bf
    public final void a(Activity activity) {
        IExternalService a2 = AVExternalServiceImpl.a();
        a2.publishService().cancelSynthesis(activity, "ftc_login");
        a2.abilityService().effectService().clearCacheInFTC();
    }
}
