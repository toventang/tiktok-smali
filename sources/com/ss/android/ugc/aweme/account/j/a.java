package com.ss.android.ugc.aweme.account.j;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.b.g;
import com.bytedance.sdk.a.a.d.k;
import com.bytedance.sdk.a.a.e;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.m.e;
import com.ss.android.ugc.aweme.account.util.u;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.bx;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.y;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f63065a = false;

    /* renamed from: b  reason: collision with root package name */
    static int f63066b = -1;

    /* renamed from: c  reason: collision with root package name */
    static List<String> f63067c;

    /* renamed from: d  reason: collision with root package name */
    public static String f63068d = "";

    /* renamed from: e  reason: collision with root package name */
    public static final a f63069e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final h f63070f = i.a((h.f.a.a) d.f63081a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f63071g = i.a((h.f.a.a) C1396a.f63072a);

    public static IAccountUserService a() {
        return (IAccountUserService) f63070f.getValue();
    }

    public static final class c implements bx {
        static {
            Covode.recordClassIndex(38856);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.bx
        public final void a() {
            a.b();
        }

        @Override // com.ss.android.ugc.aweme.bx
        public final void a(Integer num, String str) {
            a.b();
            com.ss.android.ugc.aweme.ac.b bVar = new com.ss.android.ugc.aweme.ac.b(false);
            l.d(bVar, "");
            Bundle bundle = new Bundle();
            cj.e();
            y.a(bundle, bVar);
        }
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.j.a$a  reason: collision with other inner class name */
    static final class C1396a extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1396a f63072a = new C1396a();

        static {
            Covode.recordClassIndex(38852);
        }

        C1396a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return com.bytedance.sdk.a.f.d.a(com.ss.android.ugc.aweme.a.f62426a);
        }
    }

    static final class d extends m implements h.f.a.a<IAccountUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63081a = new d();

        static {
            Covode.recordClassIndex(38857);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAccountUserService invoke() {
            return cj.f71084b.e();
        }
    }

    public static void b() {
        f63067c = null;
        f63066b = -1;
        f63068d = "";
    }

    public static final class b extends g {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f63073c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ bx f63074d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f63075e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f63076f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Bundle f63077g;

        static {
            Covode.recordClassIndex(38853);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.a$b$a  reason: collision with other inner class name */
        public static final class C1397a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f63078a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f63079b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f63080c;

            static {
                Covode.recordClassIndex(38854);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                a.a(this.f63078a.f63075e, this.f63078a.f63077g, this.f63078a.f63076f, false, this.f63078a.f63074d);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
                if (this.f63079b == 1364) {
                    a.a(this.f63078a.f63075e, this.f63078a.f63077g, this.f63078a.f63076f, true, this.f63078a.f63074d);
                } else {
                    this.f63080c.invoke();
                }
            }

            C1397a(b bVar, int i2, h.f.a.a aVar) {
                this.f63078a = bVar;
                this.f63079b = i2;
                this.f63080c = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.a$b$b  reason: collision with other inner class name */
        static final class C1398b extends m implements h.f.a.a<z> {
            final /* synthetic */ int $errorCode;
            final /* synthetic */ k $response;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(38855);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1398b(b bVar, int i2, k kVar) {
                super(0);
                this.this$0 = bVar;
                this.$errorCode = i2;
                this.$response = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String str = null;
                cj.a(false, null);
                bx bxVar = this.this$0.f63074d;
                if (bxVar == null) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(this.$errorCode);
                k kVar = this.$response;
                if (kVar != null) {
                    str = kVar.f43075f;
                }
                bxVar.a(valueOf, str);
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void e(k kVar) {
            com.bytedance.sdk.a.n.a aVar;
            k kVar2 = kVar;
            if (kVar2 != null) {
                aVar = kVar2.f43082j;
            } else {
                aVar = null;
            }
            cj.a(aVar);
            Bundle bundle = this.f63073c;
            if (bundle == null) {
                l.b(b.i.a(new Exception("Bundle is empty")), "");
            } else {
                l.b(u.a(bundle).b(new d.g(bundle)).b(new d.h(bundle)).b(new d.i(cj.f71084b.e(), bundle)), "");
            }
            com.ss.android.ugc.aweme.account.i.b.b();
            e.a.a(0, (Integer) 0, "");
            bx bxVar = this.f63074d;
            if (bxVar != null) {
                bxVar.a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void a(k kVar, int i2) {
            Integer num;
            String str;
            Integer num2;
            String str2;
            String str3;
            k kVar2 = kVar;
            if (i2 == 1 || i2 == 4) {
                long currentTimeMillis = System.currentTimeMillis();
                q.a(this.f63075e, currentTimeMillis, false);
                q.b(this.f63075e, currentTimeMillis);
                q.a(cj.f71084b.e().findSignificanUserInfo(this.f63075e));
                a.a().delete(this.f63075e, "switch error:1|4");
            }
            String str4 = null;
            if (kVar2 != null) {
                num = Integer.valueOf(kVar2.f43073d);
                str = kVar2.f43075f;
            } else {
                num = null;
                str = null;
            }
            com.ss.android.ugc.aweme.account.i.b.a(num, str);
            if (kVar2 != null) {
                num2 = Integer.valueOf(kVar2.f43073d);
            } else {
                num2 = null;
            }
            StringBuilder sb = new StringBuilder();
            if (kVar2 != null) {
                str2 = kVar2.f43075f;
            } else {
                str2 = null;
            }
            StringBuilder append = sb.append(str2).append('|');
            if (kVar2 != null) {
                str3 = kVar2.f43076g;
            } else {
                str3 = null;
            }
            e.a.a(1, num2, append.append(str3).toString());
            if (a.f63067c != null && this.f63076f) {
                int i3 = a.f63066b - 1;
                a.f63066b = i3;
                if (i3 >= 0) {
                    List<String> list = a.f63067c;
                    if (list == null) {
                        l.b();
                    }
                    a.a(list.get(a.f63066b), this.f63077g, true, false, this.f63074d);
                    return;
                }
            }
            C1398b bVar = new C1398b(this, i2, kVar2);
            if (i2 == 1349 || i2 == 1364) {
                Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                if (kVar2 != null) {
                    str4 = kVar2.f43075f;
                }
                f.a(j2, str4, new C1397a(this, i2, bVar), "settings_page", "switch_account_bind");
                return;
            }
            bVar.invoke();
        }

        b(Bundle bundle, bx bxVar, String str, boolean z, Bundle bundle2) {
            this.f63073c = bundle;
            this.f63074d = bxVar;
            this.f63075e = str;
            this.f63076f = z;
            this.f63077g = bundle2;
        }
    }

    static {
        Covode.recordClassIndex(38851);
    }

    public static final void a(String str, Bundle bundle, boolean z, boolean z2, bx bxVar) {
        Bundle bundle2;
        String str2;
        String str3;
        if (str != null && str.length() != 0) {
            IAccountUserService a2 = a();
            l.b(a2, "");
            if (!p.a(str, a2.getCurUserId(), true)) {
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                IAccountUserService a3 = a();
                l.b(a3, "");
                if (a3.isLogin()) {
                    IAccountUserService a4 = a();
                    l.b(a4, "");
                    str2 = a4.getCurUserId();
                } else {
                    str2 = f63068d;
                }
                bundle2.putString("previous_uid", str2);
                com.bytedance.sdk.a.a.e eVar = (com.bytedance.sdk.a.a.e) f63071g.getValue();
                if (z2) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                eVar.a(str, ag.a(new h.p("force_switch", str3)), (g) new b(bundle2, bxVar, str, z, bundle));
            }
        }
    }
}
