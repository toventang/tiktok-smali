package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.h.b.l;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.login.recover.a.b;
import com.ss.android.ugc.aweme.account.login.recover.a.f;
import com.ss.android.ugc.aweme.account.login.v2.a.s;
import com.ss.android.ugc.aweme.account.login.v2.a.w;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.g;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.t;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.u;
import com.ss.android.ugc.aweme.account.m.c;
import com.ss.android.ugc.aweme.account.m.d;
import com.ss.android.ugc.aweme.account.m.f;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f64274a = new x();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f64275b = h.i.a((h.f.a.a) cp.f64579a);

    public static boolean a() {
        return ((Boolean) f64275b.getValue()).booleanValue();
    }

    private x() {
    }

    public static /* synthetic */ f.a.n a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3, boolean z2, h.f.a.b bVar, int i2) {
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            bVar = null;
        }
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        f.a.n b2 = f.a.n.a((f.a.q) new as(str3, cVar, z3, str2, str)).d(new at(str3, cVar, str, str2, z3)).b(new au(str3, bVar, cVar, z3));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.k>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        boolean z2 = jVar == com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP;
        f.a.n d2 = f.a.n.a((f.a.q) new ay(z2, cVar, jVar, kVar, str, str2)).b(new az(z2, cVar)).d(new ba(z2, cVar));
        h.f.b.l.b(d2, "");
        return z.a(cVar, d2);
    }

    public static /* synthetic */ f.a.n a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2, String str3, String str4, int i2) {
        if ((i2 & 16) != 0) {
            str2 = "";
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        return a(cVar, str, jVar, kVar, str2, str3, str4, (Map<String, String>) null);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2, String str3, String str4, Map<String, String> map) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        int a2 = a(jVar);
        int a3 = a(kVar);
        f.a.n d2 = f.a.n.a((f.a.q) new bw(str3, a3, cVar, jVar, kVar, map, str, str2, a2)).b(new bx(a3, str4, kVar, cVar, str3, str)).d(new by(a3, str4, str3, str));
        h.f.b.l.b(d2, "");
        return z.a(cVar, d2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2, String str3) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        int a2 = a(jVar);
        int a3 = a(kVar);
        f.a.n d2 = f.a.n.a((f.a.q) new cf(str2, a3, cVar, str, str3, a2, jVar, kVar)).b(new cg(a3, kVar, cVar, str2, str)).d(new ch(a3, str2, str));
        h.f.b.l.b(d2, "");
        return z.a(cVar, d2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.d.a> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, int i2, Map<String, String> map, h.f.a.b<? super w, h.z> bVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        f.a.n b2 = f.a.n.a((f.a.q) new q(cVar, str, str2, i2, map)).d(new r(cVar)).b(new s(bVar, cVar));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.d.a> a(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2, String str3, int i2, Map<String, String> map, h.f.a.b<? super w, h.z> bVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        f.a.n b2 = f.a.n.a((f.a.q) new ab(cVar, map, str2, str3, i2)).d(new ac(str, cVar)).b(new ad(str, cVar, bVar));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str2, "");
        int a2 = a(kVar);
        f.a.n b2 = f.a.n.a((f.a.q) new bt(str2, a2, cVar, kVar, str)).d(new bu(a2, str2, str)).b(new bv(a2, str2, str));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2, String str3, String str4) {
        String str5;
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str4, "");
        int a2 = a(jVar);
        int a3 = a(kVar);
        if (!TextUtils.isEmpty(cVar.x())) {
            str5 = cVar.x();
        } else {
            int i2 = y.f64690c[kVar.ordinal()];
            str5 = (i2 == 1 || i2 == 2) ? "first_bind_phone_click" : i2 != 3 ? (i2 == 4 || i2 == 5) ? "rebind_phone_click" : "" : "change_bind_phone_click";
        }
        h.f.b.l.b(str5, "");
        f.a.n b2 = f.a.n.a((f.a.q) new bn(str4, a3, str5, cVar, jVar, kVar, str, str2, a2, str3)).d(new bo(a3, str4, str)).b(new bp(a3, str4, str));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3, String str4) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        f.a.n b2 = f.a.n.a((f.a.q) new av(str3, cVar, str2, str, str4)).d(new aw(cVar, str3)).b(new ax(str3, cVar));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.d.b> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        f.a.n a2 = f.a.n.a((f.a.q) new v(cVar, str2, str));
        h.f.b.l.b(a2, "");
        return z.a(cVar, a2);
    }

    public static f.a.n<u> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3, String str4, Map<String, String> map) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(str4, "");
        f.a.n a2 = f.a.n.a((f.a.q) new ao(cVar, map, str, str2, str3, str4));
        h.f.b.l.b(a2, "");
        return z.a(cVar, a2);
    }

    public static final class z implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64687a;

        static {
            Covode.recordClassIndex(39746);
        }

        public z(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64687a = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f64687a.b_(0);
        }
    }

    static final class cp extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final cp f64579a = new cp();

        static {
            Covode.recordClassIndex(39700);
        }

        cp() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.account.experiment.o.a());
        }
    }

    static {
        Covode.recordClassIndex(39600);
    }

    /* access modifiers changed from: package-private */
    public static final class at<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64368d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f64369e;

        static {
            Covode.recordClassIndex(39632);
        }

        at(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2, String str3, boolean z) {
            this.f64365a = str;
            this.f64366b = cVar;
            this.f64367c = str2;
            this.f64368d = str3;
            this.f64369e = z;
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ com.bytedance.sdk.a.a.a.d $it;
            final /* synthetic */ at this$0;

            static {
                Covode.recordClassIndex(39634);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(at atVar, com.bytedance.sdk.a.a.a.d dVar) {
                super(0);
                this.this$0 = atVar;
                this.$it = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                if (!h.f.b.l.a((Object) this.this$0.f64365a, (Object) "phone")) {
                    com.ss.android.ugc.aweme.account.login.v2.base.e.a(this.this$0.f64366b, this.this$0.f64367c);
                }
                com.ss.android.ugc.aweme.account.n.e.a(this.this$0.f64367c, this.this$0.f64368d, this.this$0.f64365a, this.this$0.f64366b, this.this$0.f64369e ? 1 : 0, "login");
                v.a(false, this.this$0.f64365a, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.this$0.f64366b, ((com.bytedance.sdk.a.h.a.o) this.$it.f43081j).u, (Map) null, this.this$0.f64369e, 16);
                com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.this$0.f64366b;
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.this$0.f64366b.V_();
                com.bytedance.sdk.a.n.a aVar = ((com.bytedance.sdk.a.h.a.o) this.$it.f43081j).u;
                h.f.b.l.b(aVar, "");
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
                return h.z.f158842a;
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            final a aVar = new a(this, dVar);
            if (((com.bytedance.sdk.a.h.a.o) dVar.f43081j).u.f43474l) {
                com.ss.android.ugc.aweme.compliance.api.a.q().a(true, new Runnable() {
                    /* class com.ss.android.ugc.aweme.account.login.v2.a.x.at.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(39633);
                    }

                    public final void run() {
                        aVar.invoke();
                    }
                });
            } else {
                aVar.invoke();
            }
        }
    }

    public static final class a<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64278c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f64279d;

        static {
            Covode.recordClassIndex(39601);
        }

        public a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, boolean z) {
            this.f64276a = cVar;
            this.f64277b = str;
            this.f64278c = str2;
            this.f64279d = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$a$a  reason: collision with other inner class name */
        public static final class C1439a extends h {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f64280c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64281d;

            static {
                Covode.recordClassIndex(39602);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<i> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64281d.a(dVar);
            }

            C1439a(a aVar, f.a.o oVar) {
                this.f64280c = aVar;
                this.f64281d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64281d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64280c.f64276a.A(), this.f64280c.f64276a.V_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<i> dVar, int i2) {
                int i3;
                String str;
                i iVar;
                JSONObject jSONObject;
                f.a.o oVar = this.f64281d;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                } else {
                    i3 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j A = this.f64280c.f64276a.A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64280c.f64276a.V_();
                if (!(dVar == null || (iVar = (i) dVar.f43081j) == null || (jSONObject = iVar.f43284m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.a((Throwable) new w(i3, str, A, V_, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<i>> oVar) {
            String str;
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.account.b.c.b(this.f64276a.w(), "email");
            C1439a aVar = new C1439a(this, oVar);
            this.f64276a.b(aVar);
            Context context = this.f64276a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str2 = this.f64277b;
            String str3 = this.f64278c;
            boolean z = this.f64279d;
            h.f.b.l.d(context, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(aVar, "");
            i iVar = new i(str2, str3);
            a.C1046a aVar2 = new a.C1046a();
            if (z) {
                str = "/passport/email/bind_with_change_password/";
            } else {
                str = "/passport/email/bind/";
            }
            aVar2.f43153a = str;
            h.f.b.l.d(iVar, "");
            HashMap hashMap = new HashMap();
            String c2 = com.bytedance.common.utility.m.c(iVar.f64242a);
            h.f.b.l.b(c2, "");
            hashMap.put("email", c2);
            String c3 = com.bytedance.common.utility.m.c(iVar.f64243b);
            h.f.b.l.b(c3, "");
            hashMap.put("code", c3);
            hashMap.put("mix_mode", "1");
            com.bytedance.sdk.a.d.a c4 = aVar2.a(hashMap).c();
            h.f.b.l.b(c4, "");
            new g(context, c4, iVar, aVar).d();
        }
    }

    public static final class ae<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64297c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64298d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64299e;

        static {
            Covode.recordClassIndex(39608);
        }

        public ae(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3, String str4) {
            this.f64295a = cVar;
            this.f64296b = str;
            this.f64297c = str2;
            this.f64298d = str3;
            this.f64299e = str4;
        }

        public static final class a extends p {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ae f64300c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64301d;

            static {
                Covode.recordClassIndex(39609);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<q> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64301d.a(dVar);
            }

            a(ae aeVar, f.a.o oVar) {
                this.f64300c = aeVar;
                this.f64301d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64301d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64300c.f64295a.A(), this.f64300c.f64295a.V_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<q> dVar, int i2) {
                String str;
                f.a.o oVar = this.f64301d;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64300c.f64295a.A(), this.f64300c.f64295a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<q>> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64295a.b(aVar);
            Context context = this.f64295a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64296b;
            String str2 = this.f64297c;
            String str3 = this.f64298d;
            String str4 = this.f64299e;
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d("", "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str4, "");
            h.f.b.l.d(aVar, "");
            q qVar = new q(str, "", str2, str3, str4);
            a.C1046a aVar2 = new a.C1046a();
            aVar2.f43153a = c.a.a("/passport/app/email/code_login/");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(qVar.f64256d)) {
                hashMap.put("captcha", qVar.f64256d);
            }
            String c2 = com.bytedance.common.utility.m.c(qVar.f64255c);
            h.f.b.l.b(c2, "");
            hashMap.put("code", c2);
            String c3 = com.bytedance.common.utility.m.c(qVar.f64257e);
            h.f.b.l.b(c3, "");
            hashMap.put(StringSet.type, c3);
            hashMap.put("verify_ticket", qVar.f64258f);
            hashMap.put("not_login_ticket", qVar.f64259g);
            hashMap.put("mix_mode", "1");
            com.bytedance.sdk.a.d.a c4 = aVar2.a(hashMap).c();
            h.f.b.l.b(c4, "");
            new r(context, c4, qVar, aVar, (byte) 0).d();
        }
    }

    public static final class ah<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f64307d;

        static {
            Covode.recordClassIndex(39612);
        }

        public ah(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, boolean z) {
            this.f64304a = cVar;
            this.f64305b = str;
            this.f64306c = str2;
            this.f64307d = z;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.e {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ah f64308c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64309d;

            static {
                Covode.recordClassIndex(39613);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.e> dVar) {
                h.f.b.l.d(dVar, "");
                if (dVar.f43081j == null || ((com.bytedance.sdk.a.h.a.e) dVar.f43081j).f43265e == null) {
                    this.f64309d.a((Throwable) new w(-1, "no data", com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, com.ss.android.ugc.aweme.account.login.v2.base.k.CREATE_PASSWORD_FOR_EMAIL, null, null, 32, null));
                } else {
                    this.f64309d.a(dVar);
                }
            }

            a(ah ahVar, f.a.o oVar) {
                this.f64308c = ahVar;
                this.f64309d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                f.a.o oVar = this.f64309d;
                int i2 = dVar.f43073d;
                String str2 = dVar.f43075f;
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP;
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64308c.f64304a.V_();
                String str3 = dVar.f43075f;
                h.f.b.l.b(str3, "");
                oVar.a((Throwable) new w(i2, str2, jVar, V_, null, str3));
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
                if (r6 == null) goto L_0x000c;
             */
            @Override // com.bytedance.sdk.a.e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.e> r12, int r13) {
                /*
                // Method dump skipped, instructions count: 115
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.a.x.ah.a.a(com.bytedance.sdk.a.a.a.d, int):void");
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.e>> oVar) {
            h.f.b.l.d(oVar, "");
            v.a((Boolean) true, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64304a, false, (Map) null, false, 56);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            linkedHashMap.putAll(com.ss.android.ugc.aweme.account.agegate.util.h.b());
            if (com.ss.android.ugc.aweme.account.util.p.a()) {
                linkedHashMap.putAll(com.ss.android.ugc.aweme.account.util.p.b());
            }
            if (this.f64307d) {
                linkedHashMap.put("multi_signup", "1");
            } else {
                linkedHashMap.put("multi_signup", "0");
            }
            this.f64304a.b(aVar);
            this.f64304a.z().a(this.f64306c, this.f64305b, "", "", linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class as<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f64360c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64361d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64362e;

        static {
            Covode.recordClassIndex(39630);
        }

        as(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, boolean z, String str2, String str3) {
            this.f64358a = str;
            this.f64359b = cVar;
            this.f64360c = z;
            this.f64361d = str2;
            this.f64362e = str3;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.n {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ as f64363c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64364d;

            static {
                Covode.recordClassIndex(39631);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o> dVar) {
                h.f.b.l.d(dVar, "");
                if (dVar.f43081j == null || ((com.bytedance.sdk.a.h.a.o) dVar.f43081j).u == null) {
                    this.f64364d.a((Throwable) new w(-1, "no data", com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN, com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_FIND_PASSWORD, null, "no data"));
                } else {
                    this.f64364d.a(dVar);
                }
            }

            a(as asVar, f.a.o oVar) {
                this.f64363c = asVar;
                this.f64364d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                h.f.b.l.d(str, "");
                f.a.o oVar = this.f64364d;
                int i2 = dVar.f43073d;
                String str2 = dVar.f43075f;
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64363c.f64359b.V_();
                String str3 = dVar.f43075f;
                h.f.b.l.b(str3, "");
                oVar.a((Throwable) new w(i2, str2, jVar, V_, null, str3));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o> dVar, int i2) {
                int i3;
                String str;
                JSONObject jSONObject;
                String str2;
                com.bytedance.sdk.a.h.a.o oVar;
                JSONObject jSONObject2;
                f.a.o oVar2 = this.f64364d;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                } else {
                    i3 = -10000;
                }
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64363c.f64359b.V_();
                if (dVar == null || (oVar = (com.bytedance.sdk.a.h.a.o) dVar.f43081j) == null || (jSONObject2 = oVar.f43284m) == null || (jSONObject = jSONObject2.getJSONObject("data")) == null) {
                    jSONObject = null;
                } else {
                    jSONObject.put("loginType", this.f64363c.f64358a);
                    jSONObject.put("pwd", this.f64363c.f64361d);
                    jSONObject.put("handle", this.f64363c.f64362e);
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f43076g;
                }
                oVar2.a((Throwable) new w(i3, str, jVar, V_, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o>> oVar) {
            h.f.b.l.d(oVar, "");
            v.a((Boolean) false, this.f64358a, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64359b, false, (Map) null, this.f64360c, 24);
            a aVar = new a(this, oVar);
            this.f64359b.b(aVar);
            String str = this.f64358a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode != 106642798) {
                }
                this.f64359b.z().c(this.f64362e, this.f64361d, "", aVar);
                return;
            } else if (str.equals("email")) {
                this.f64359b.z().b(this.f64362e, this.f64361d, "", aVar);
                return;
            }
            this.f64359b.z().a(this.f64362e, this.f64361d, "", aVar);
        }
    }

    static final class av<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64376b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64377c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64378d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64379e;

        static {
            Covode.recordClassIndex(39636);
        }

        av(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2, String str3, String str4) {
            this.f64375a = str;
            this.f64376b = cVar;
            this.f64377c = str2;
            this.f64378d = str3;
            this.f64379e = str4;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.n {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ av f64380c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64381d;

            static {
                Covode.recordClassIndex(39637);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o> dVar) {
                h.f.b.l.d(dVar, "");
                if (dVar.f43081j == null || ((com.bytedance.sdk.a.h.a.o) dVar.f43081j).u == null) {
                    this.f64381d.a((Throwable) new w(-1, "no data", com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN, com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_FIND_PASSWORD, null, "no data"));
                } else {
                    this.f64381d.a(dVar);
                }
            }

            a(av avVar, f.a.o oVar) {
                this.f64380c = avVar;
                this.f64381d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                h.f.b.l.d(str, "");
                f.a.o oVar = this.f64381d;
                int i2 = dVar.f43073d;
                String str2 = dVar.f43075f;
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64380c.f64376b.V_();
                String str3 = dVar.f43075f;
                h.f.b.l.b(str3, "");
                oVar.a((Throwable) new w(i2, str2, jVar, V_, null, str3));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o> dVar, int i2) {
                int i3;
                String str;
                JSONObject jSONObject;
                String str2;
                com.bytedance.sdk.a.h.a.o oVar;
                JSONObject jSONObject2;
                f.a.o oVar2 = this.f64381d;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                } else {
                    i3 = -10000;
                }
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64380c.f64376b.V_();
                if (dVar == null || (oVar = (com.bytedance.sdk.a.h.a.o) dVar.f43081j) == null || (jSONObject2 = oVar.f43284m) == null || (jSONObject = jSONObject2.getJSONObject("data")) == null) {
                    jSONObject = null;
                } else {
                    jSONObject.put("loginType", this.f64380c.f64375a);
                    jSONObject.put("pwd", this.f64380c.f64377c);
                    jSONObject.put("handle", this.f64380c.f64378d);
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f43076g;
                }
                oVar2.a((Throwable) new w(i3, str, jVar, V_, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.o>> oVar) {
            h.f.b.l.d(oVar, "");
            v.a((Boolean) false, this.f64375a, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64376b, false, (Map) null, false, 48);
            a aVar = new a(this, oVar);
            this.f64376b.b(aVar);
            String str = this.f64375a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    Context context = this.f64376b.getContext();
                    if (context == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(context, "");
                    f.a.a(context, this.f64379e, "", "", "", "", this.f64377c, "", "", com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN.getValue(), 3, aVar).d();
                    return;
                }
            } else if (str.equals("email")) {
                Context context2 = this.f64376b.getContext();
                if (context2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(context2, "");
                f.a.a(context2, this.f64379e, "", "", "", "", this.f64377c, "", "", com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN.getValue(), 2, aVar).d();
                return;
            }
            this.f64376b.z().a(this.f64378d, this.f64377c, "", aVar);
        }
    }

    static final class ay<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f64386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64388c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64389d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64390e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64391f;

        static {
            Covode.recordClassIndex(39640);
        }

        ay(boolean z, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str, String str2) {
            this.f64386a = z;
            this.f64387b = cVar;
            this.f64388c = jVar;
            this.f64389d = kVar;
            this.f64390e = str;
            this.f64391f = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.i {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ay f64392c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64393d;

            static {
                Covode.recordClassIndex(39641);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.k> dVar) {
                h.f.b.l.d(dVar, "");
                if (dVar.f43081j == null || ((com.bytedance.sdk.a.h.a.k) dVar.f43081j).f43291d == null) {
                    this.f64393d.a((Throwable) w.a.a(this.f64392c.f64388c, this.f64392c.f64389d));
                } else {
                    this.f64393d.a(dVar);
                }
            }

            a(ay ayVar, f.a.o oVar) {
                this.f64392c = ayVar;
                this.f64393d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                f.a.o oVar = this.f64393d;
                int i2 = dVar.f43073d;
                String str2 = dVar.f43075f;
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64392c.f64388c;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64392c.f64389d;
                String str3 = dVar.f43075f;
                h.f.b.l.b(str3, "");
                oVar.a((Throwable) new w(i2, str2, jVar, kVar, null, str3));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.k> dVar, int i2) {
                String str;
                JSONObject jSONObject;
                String str2;
                com.bytedance.sdk.a.h.a.k kVar;
                JSONObject jSONObject2;
                f.a.o oVar = this.f64393d;
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64392c.f64388c;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar2 = this.f64392c.f64389d;
                if (dVar == null || (kVar = (com.bytedance.sdk.a.h.a.k) dVar.f43081j) == null || (jSONObject2 = kVar.f43284m) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f43076g;
                }
                oVar.a((Throwable) new w(i2, str, jVar, kVar2, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.k>> oVar) {
            h.f.b.l.d(oVar, "");
            boolean z = this.f64386a;
            if (!z) {
                v.a(Boolean.valueOf(z), "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64387b, false, (Map) null, false, 56);
            }
            a aVar = new a(this, oVar);
            this.f64387b.b(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(com.ss.android.ugc.aweme.account.agegate.util.h.b());
            if (com.ss.android.ugc.aweme.account.util.p.a()) {
                linkedHashMap.putAll(com.ss.android.ugc.aweme.account.util.p.b());
            }
            Bundle arguments = this.f64387b.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            h.f.b.l.b(arguments, "");
            if (arguments.getBoolean("is_multi_account_same_user", false)) {
                linkedHashMap.put("multi_signup", "1");
            } else {
                linkedHashMap.put("multi_signup", "0");
            }
            this.f64387b.z().a(this.f64390e, this.f64391f, linkedHashMap, aVar);
        }
    }

    public static final class bb<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64402d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64403e;

        static {
            Covode.recordClassIndex(39645);
        }

        public bb(com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str, String str2) {
            this.f64399a = jVar;
            this.f64400b = cVar;
            this.f64401c = kVar;
            this.f64402d = str;
            this.f64403e = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.j {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bb f64404c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64405d;

            static {
                Covode.recordClassIndex(39646);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.l> dVar) {
                h.f.b.l.d(dVar, "");
                if (dVar.f43081j == null || ((com.bytedance.sdk.a.h.a.l) dVar.f43081j).f43296e == null) {
                    this.f64405d.a((Throwable) new w(-1, "no data", this.f64404c.f64399a, this.f64404c.f64401c, null, "no data"));
                } else {
                    this.f64405d.a(dVar.f43081j);
                }
            }

            a(bb bbVar, f.a.o oVar) {
                this.f64404c = bbVar;
                this.f64405d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                f.a.o oVar = this.f64405d;
                int i2 = dVar.f43073d;
                String str2 = dVar.f43075f;
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64404c.f64399a;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64404c.f64401c;
                String str3 = dVar.f43075f;
                h.f.b.l.b(str3, "");
                oVar.a((Throwable) new w(i2, str2, jVar, kVar, null, str3));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.l> dVar, int i2) {
                String str;
                JSONObject jSONObject;
                String str2;
                com.bytedance.sdk.a.h.a.l lVar;
                JSONObject jSONObject2;
                f.a.o oVar = this.f64405d;
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64404c.f64399a;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64404c.f64401c;
                if (dVar == null || (lVar = (com.bytedance.sdk.a.h.a.l) dVar.f43081j) == null || (jSONObject2 = lVar.f43284m) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f43076g;
                }
                oVar.a((Throwable) new w(i2, str, jVar, kVar, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.h.a.l> oVar) {
            boolean z;
            h.f.b.l.d(oVar, "");
            if (this.f64399a == com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP) {
                z = true;
            } else {
                z = false;
            }
            v.a(Boolean.valueOf(z), "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64400b, false, (Map) null, false, 56);
            a aVar = new a(this, oVar);
            this.f64400b.b(aVar);
            this.f64400b.z().a(this.f64402d, this.f64403e, "", aVar);
        }
    }

    public static final class be<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64414c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64416e;

        static {
            Covode.recordClassIndex(39649);
        }

        public be(com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64412a = jVar;
            this.f64413b = kVar;
            this.f64414c = cVar;
            this.f64415d = str;
            this.f64416e = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.h {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ be f64417c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64418d;

            static {
                Covode.recordClassIndex(39650);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.m> dVar) {
                if (dVar == null || dVar.f43081j == null || ((com.bytedance.sdk.a.h.a.m) dVar.f43081j).f43301e == null) {
                    this.f64418d.a((Throwable) new w(-1, "no data", this.f64417c.f64412a, this.f64417c.f64413b, null, "no data"));
                } else {
                    this.f64418d.a(dVar.f43081j);
                }
            }

            a(be beVar, f.a.o oVar) {
                this.f64417c = beVar;
                this.f64418d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                if (dVar != null) {
                    f.a.o oVar = this.f64418d;
                    int i2 = dVar.f43073d;
                    String str2 = dVar.f43075f;
                    com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64417c.f64412a;
                    com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64417c.f64413b;
                    String str3 = dVar.f43075f;
                    h.f.b.l.b(str3, "");
                    oVar.a((Throwable) new w(i2, str2, jVar, kVar, null, str3));
                }
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.m> dVar, int i2) {
                String str;
                JSONObject jSONObject;
                String str2;
                com.bytedance.sdk.a.h.a.m mVar;
                JSONObject jSONObject2;
                f.a.o oVar = this.f64418d;
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64417c.f64412a;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64417c.f64413b;
                if (dVar == null || (mVar = (com.bytedance.sdk.a.h.a.m) dVar.f43081j) == null || (jSONObject2 = mVar.f43284m) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f43076g;
                }
                oVar.a((Throwable) new w(i2, str, jVar, kVar, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.h.a.m> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64414c.b(aVar);
            Context context = this.f64414c.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64415d;
            String str2 = this.f64416e;
            h.f.b.l.d(context, "");
            h.f.b.l.d("", "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d("", "");
            h.f.b.l.d(aVar, "");
            com.bytedance.sdk.a.h.a.m mVar = new com.bytedance.sdk.a.h.a.m("", str2, 0, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(mVar.f43297a)) {
                String c2 = com.bytedance.common.utility.m.c(mVar.f43297a);
                h.f.b.l.b(c2, "");
                hashMap.put("mobile", c2);
            }
            if (!TextUtils.isEmpty(mVar.f43300d)) {
                hashMap.put("captcha", mVar.f43300d);
            }
            String c3 = com.bytedance.common.utility.m.c(mVar.f43298b.toString());
            h.f.b.l.b(c3, "");
            hashMap.put("code", c3);
            hashMap.put("mix_mode", "1");
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            Map<String, String> b2 = com.ss.android.ugc.aweme.account.agegate.util.h.b();
            if (!b2.isEmpty()) {
                h.a.ag.b(hashMap, b2);
            }
            a.C1046a aVar2 = new a.C1046a();
            aVar2.f43153a = c.a.a("/passport/mobile/sms_login/");
            com.bytedance.sdk.a.d.a c4 = aVar2.a(hashMap).a().c();
            h.f.b.l.b(c4, "");
            new com.ss.android.ugc.aweme.account.login.recover.a.c(context, c4, mVar, aVar).d();
        }
    }

    static final class bn<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64442b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64443c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64444d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64445e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64446f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f64447g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f64448h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f64449i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f64450j;

        static {
            Covode.recordClassIndex(39661);
        }

        bn(String str, int i2, String str2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str3, String str4, int i3, String str5) {
            this.f64441a = str;
            this.f64442b = i2;
            this.f64443c = str2;
            this.f64444d = cVar;
            this.f64445e = jVar;
            this.f64446f = kVar;
            this.f64447g = str3;
            this.f64448h = str4;
            this.f64449i = i3;
            this.f64450j = str5;
        }

        public static final class a extends com.ss.android.ugc.aweme.account.login.c.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bn f64451c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64452d;

            static {
                Covode.recordClassIndex(39662);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar) {
                f.a.o oVar = this.f64452d;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                oVar.a(dVar);
            }

            a(bn bnVar, f.a.o oVar) {
                this.f64451c = bnVar;
                this.f64452d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64452d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64451c.f64445e, this.f64451c.f64446f, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar, int i2) {
                String str;
                String str2;
                com.bytedance.sdk.a.h.a.n nVar;
                JSONObject jSONObject;
                JSONObject optJSONObject;
                com.bytedance.sdk.a.h.a.n nVar2;
                JSONObject jSONObject2 = new JSONObject();
                if (dVar == null || (nVar2 = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (str = nVar2.f43305d) == null) {
                    str = "";
                }
                jSONObject2.put("next_url", str);
                if (i2 == 2030) {
                    if (!(dVar == null || (nVar = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (jSONObject = nVar.f43284m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                        jSONObject2.put("data", optJSONObject);
                    }
                    jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                }
                f.a.o oVar = this.f64452d;
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                oVar.a((Throwable) new w(i2, str2, this.f64451c.f64445e, this.f64451c.f64446f, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_sms", new com.ss.android.ugc.aweme.account.a.b.a().a("send_method", this.f64441a).a("send_reason", this.f64442b).a("enter_method", this.f64443c).a("enter_from", this.f64444d.w()).f62575a);
            boolean a2 = com.ss.android.ugc.aweme.account.n.f.a(com.ss.android.ugc.aweme.a.f62426a);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (x.a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f64444d.b(aVar);
            this.f64444d.z().a(this.f64447g, this.f64442b, this.f64448h, this.f64449i, a2 ? 1 : 0, "", this.f64450j, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bq<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f64461c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f64462d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f64463e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64464f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f64465g;

        static {
            Covode.recordClassIndex(39665);
        }

        bq(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, int i2, Map map, Integer num, String str2, String str3) {
            this.f64459a = str;
            this.f64460b = cVar;
            this.f64461c = i2;
            this.f64462d = map;
            this.f64463e = num;
            this.f64464f = str2;
            this.f64465g = str3;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.g {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f.a.o f64466c;

            static {
                Covode.recordClassIndex(39666);
            }

            a(f.a.o oVar) {
                this.f64466c = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.g> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64466c.a(dVar);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64466c.a((Throwable) new w(dVar.f43073d, dVar.f43075f, com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN, com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_EMAIL_FIND_PASSWORD, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.g> dVar, int i2) {
                int i3;
                String str;
                com.bytedance.sdk.a.h.a.g gVar;
                JSONObject jSONObject;
                f.a.o oVar = this.f64466c;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                } else {
                    i3 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_EMAIL_FIND_PASSWORD;
                if (!(dVar == null || (gVar = (com.bytedance.sdk.a.h.a.g) dVar.f43081j) == null || (jSONObject = gVar.f43284m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.a((Throwable) new w(i3, str, jVar, kVar, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.g>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_email_code", new com.ss.android.ugc.aweme.account.a.b.a().a("send_method", this.f64459a).a("enter_method", this.f64460b.x()).a("enter_from", this.f64460b.w()).a("send_reason", this.f64461c).f62575a);
            a aVar = new a(oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f64462d;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("rules_version", "v2");
            this.f64460b.b(aVar);
            if (this.f64463e == null) {
                this.f64460b.z().a(this.f64464f, this.f64465g, this.f64461c, linkedHashMap, aVar);
            } else {
                this.f64460b.z().a(this.f64464f, this.f64465g, this.f64461c, this.f64463e.intValue(), (Map<String, String>) linkedHashMap, (com.bytedance.sdk.a.h.b.a.g) aVar);
            }
        }
    }

    static final class bt<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64474d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64475e;

        static {
            Covode.recordClassIndex(39669);
        }

        bt(String str, int i2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2) {
            this.f64471a = str;
            this.f64472b = i2;
            this.f64473c = cVar;
            this.f64474d = kVar;
            this.f64475e = str2;
        }

        public static final class a extends com.ss.android.ugc.aweme.account.login.c.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bt f64476c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64477d;

            static {
                Covode.recordClassIndex(39670);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar) {
                super.a(dVar);
                f.a.o oVar = this.f64477d;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                oVar.a(dVar);
            }

            a(bt btVar, f.a.o oVar) {
                this.f64476c = btVar;
                this.f64477d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                h.f.b.l.d(str, "");
                this.f64477d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN, this.f64476c.f64474d, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar, int i2) {
                int i3;
                String str;
                com.bytedance.sdk.a.h.a.n nVar;
                JSONObject jSONObject;
                super.a(dVar, i2);
                f.a.o oVar = this.f64477d;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                } else {
                    i3 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64476c.f64474d;
                if (!(dVar == null || (nVar = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (jSONObject = nVar.f43284m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.a((Throwable) new w(i3, str, jVar, kVar, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_sms", new com.ss.android.ugc.aweme.account.a.b.a().a("send_method", this.f64471a).a("send_reason", this.f64472b).a("enter_method", this.f64473c.x()).a("enter_from", this.f64473c.w()).f62575a);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (x.a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f64473c.b(aVar);
            this.f64473c.z().a(this.f64475e, this.f64472b, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bw<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64487d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64488e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f64489f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f64490g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f64491h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f64492i;

        static {
            Covode.recordClassIndex(39673);
        }

        bw(String str, int i2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, Map map, String str2, String str3, int i3) {
            this.f64484a = str;
            this.f64485b = i2;
            this.f64486c = cVar;
            this.f64487d = jVar;
            this.f64488e = kVar;
            this.f64489f = map;
            this.f64490g = str2;
            this.f64491h = str3;
            this.f64492i = i3;
        }

        public static final class a extends com.ss.android.ugc.aweme.account.login.c.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bw f64493c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64494d;

            static {
                Covode.recordClassIndex(39674);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar) {
                f.a.o oVar = this.f64494d;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                oVar.a(dVar);
            }

            a(bw bwVar, f.a.o oVar) {
                this.f64493c = bwVar;
                this.f64494d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64494d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64493c.f64487d, this.f64493c.f64488e, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar, int i2) {
                String str;
                String str2;
                com.bytedance.sdk.a.h.a.n nVar;
                JSONObject jSONObject = new JSONObject();
                if (dVar == null || (nVar = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (str = nVar.f43305d) == null) {
                    str = "";
                }
                jSONObject.put("next_url", str);
                f.a.o oVar = this.f64494d;
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                oVar.a((Throwable) new w(i2, str2, this.f64493c.f64487d, this.f64493c.f64488e, jSONObject, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_sms", new com.ss.android.ugc.aweme.account.a.b.a().a("send_method", this.f64484a).a("send_reason", this.f64485b).a("enter_method", this.f64486c.x()).a("enter_from", this.f64486c.w()).f62575a);
            boolean a2 = com.ss.android.ugc.aweme.account.n.f.a(com.ss.android.ugc.aweme.a.f62426a);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (x.a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            Map map = this.f64489f;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f64486c.b(aVar);
            this.f64486c.z().a(this.f64490g, this.f64485b, this.f64491h, this.f64492i, a2 ? 1 : 0, null, null, linkedHashMap, aVar);
        }
    }

    static final class bz<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64506b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64507c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64508d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64509e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64510f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f64511g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f64512h;

        static {
            Covode.recordClassIndex(39677);
        }

        bz(String str, int i2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2, String str3, int i3) {
            this.f64505a = str;
            this.f64506b = i2;
            this.f64507c = cVar;
            this.f64508d = jVar;
            this.f64509e = kVar;
            this.f64510f = str2;
            this.f64511g = str3;
            this.f64512h = i3;
        }

        public static final class a extends com.ss.android.ugc.aweme.account.login.c.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bz f64513c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64514d;

            static {
                Covode.recordClassIndex(39678);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar) {
                f.a.o oVar = this.f64514d;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                oVar.a(dVar);
            }

            a(bz bzVar, f.a.o oVar) {
                this.f64513c = bzVar;
                this.f64514d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64514d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64513c.f64508d, this.f64513c.f64509e, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar, int i2) {
                String str;
                String str2;
                com.bytedance.sdk.a.h.a.n nVar;
                JSONObject jSONObject;
                JSONObject optJSONObject;
                com.bytedance.sdk.a.h.a.n nVar2;
                JSONObject jSONObject2 = new JSONObject();
                if (dVar == null || (nVar2 = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (str = nVar2.f43305d) == null) {
                    str = "";
                }
                jSONObject2.put("next_url", str);
                if (i2 == 2030) {
                    if (!(dVar == null || (nVar = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (jSONObject = nVar.f43284m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                        jSONObject2.put("data", optJSONObject);
                    }
                    jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                } else if (i2 == 1206) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(R.string.ar2).a();
                }
                f.a.o oVar = this.f64514d;
                if (dVar != null) {
                    str2 = dVar.f43075f;
                } else {
                    str2 = null;
                }
                oVar.a((Throwable) new w(i2, str2, this.f64513c.f64508d, this.f64513c.f64509e, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_sms", new com.ss.android.ugc.aweme.account.a.b.a().a("send_method", this.f64505a).a("send_reason", this.f64506b).a("enter_method", this.f64507c.x()).a("enter_from", this.f64507c.w()).f62575a);
            boolean a2 = com.ss.android.ugc.aweme.account.n.f.a(com.ss.android.ugc.aweme.a.f62426a);
            a aVar = new a(this, oVar);
            Map<? extends String, ? extends String> linkedHashMap = new LinkedHashMap<>();
            if (x.a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f64507c.b(aVar);
            Context context = this.f64507c.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64510f;
            int i2 = this.f64506b;
            String str2 = this.f64511g;
            int i3 = this.f64512h;
            h.f.b.l.d(context, "");
            h.f.b.l.d("", "");
            h.f.b.l.d("", "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(aVar, "");
            com.bytedance.sdk.a.h.a.n nVar = new com.bytedance.sdk.a.h.a.n("", "", i2, str2, i3, a2 ? 1 : 0);
            Map<String, String> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.putAll(linkedHashMap);
            Map<? extends String, ? extends String> map = nVar.z;
            if ((map instanceof Map) && map != null) {
                linkedHashMap2.putAll(map);
            }
            a.C1046a aVar2 = new a.C1046a();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(nVar.f43302a)) {
                hashMap.put("mobile", com.bytedance.common.utility.m.c(nVar.f43302a));
            }
            if (!TextUtils.isEmpty(nVar.f43308g)) {
                hashMap.put("old_mobile", com.bytedance.common.utility.m.c(nVar.f43308g));
            }
            if (!TextUtils.isEmpty(nVar.f43303b)) {
                hashMap.put("captcha", nVar.f43303b);
            }
            hashMap.put(StringSet.type, com.bytedance.common.utility.m.c(String.valueOf(nVar.f43306e)));
            hashMap.put("unbind_exist", com.bytedance.common.utility.m.c(String.valueOf(nVar.f43307f)));
            hashMap.put("mix_mode", "1");
            if (nVar.A == 1) {
                hashMap.put("check_register", "1");
            } else if (nVar.A == 0) {
                hashMap.put("check_register", "0");
            }
            if (com.ss.android.ugc.aweme.account.experiment.o.a()) {
                hashMap.put("is6Digits", "1");
            } else {
                hashMap.put("is6Digits", "0");
            }
            if (!TextUtils.isEmpty(nVar.u)) {
                hashMap.put("ticket", nVar.u);
            }
            hashMap.put("auto_read", String.valueOf(nVar.v));
            if (!TextUtils.isEmpty(nVar.w)) {
                hashMap.put("shark_ticket", nVar.w);
            }
            if (!TextUtils.isEmpty(nVar.y)) {
                hashMap.put("auth_token", nVar.y);
            }
            if (!TextUtils.isEmpty(nVar.x)) {
                hashMap.put("unusable_mobile_ticket", nVar.x);
            }
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            a.C1046a a3 = aVar2.a(hashMap, linkedHashMap2);
            h.f.b.l.b(a3, "");
            a3.f43153a = c.a.a("/passport/mobile/send_code/v1/");
            com.bytedance.sdk.a.d.a c2 = a3.c();
            h.f.b.l.b(c2, "");
            new com.ss.android.ugc.aweme.account.login.recover.a.e(context, c2, nVar, aVar).d();
        }
    }

    static final class cc<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64527d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64528e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64529f;

        static {
            Covode.recordClassIndex(39682);
        }

        cc(int i2, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2) {
            this.f64524a = i2;
            this.f64525b = str;
            this.f64526c = jVar;
            this.f64527d = kVar;
            this.f64528e = cVar;
            this.f64529f = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.l {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ cc f64530c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64531d;

            static {
                Covode.recordClassIndex(39683);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64531d.a(dVar);
            }

            a(cc ccVar, f.a.o oVar) {
                this.f64530c = ccVar;
                this.f64531d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64531d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64530c.f64526c, this.f64530c.f64527d, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar, int i2) {
                String str;
                String str2;
                com.bytedance.sdk.a.h.a.n nVar;
                f.a.o oVar = this.f64531d;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64530c.f64526c;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64530c.f64527d;
                JSONObject jSONObject = new JSONObject();
                if (dVar == null || (nVar = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (str2 = nVar.f43305d) == null) {
                    str2 = "";
                }
                jSONObject.put("next_url", str2);
                oVar.a((Throwable) new w(i2, str, jVar, kVar, jSONObject, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_voice_verification_code", new com.ss.android.ugc.aweme.account.a.b.a().a("send_reason", String.valueOf(this.f64524a)).a("send_method", this.f64525b).f62575a);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (x.a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f64528e.b(aVar);
            this.f64528e.z().a(this.f64529f, "", this.f64524a, linkedHashMap, aVar);
        }
    }

    public static final class ct<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64589b;

        static {
            Covode.recordClassIndex(39705);
        }

        public ct(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64588a = cVar;
            this.f64589b = str;
        }

        public static final class a extends af {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ct f64590c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64591d;

            static {
                Covode.recordClassIndex(39706);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<ag> dVar) {
                h.f.b.l.d(dVar, "");
                ag agVar = (ag) dVar.f43081j;
                if (agVar == null || agVar.f64223b == null) {
                    this.f64591d.a((Throwable) w.a.a(this.f64590c.f64588a.A(), this.f64590c.f64588a.V_()));
                } else {
                    this.f64591d.a(dVar);
                }
            }

            a(ct ctVar, f.a.o oVar) {
                this.f64590c = ctVar;
                this.f64591d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                super.a(dVar, str);
                this.f64591d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64590c.f64588a.A(), this.f64590c.f64588a.V_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<ag> dVar, int i2) {
                String str;
                f.a.o oVar = this.f64591d;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64590c.f64588a.A(), this.f64590c.f64588a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<ag>> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64588a.b(aVar);
            Context context = this.f64588a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64589b;
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d("", "");
            h.f.b.l.d(aVar, "");
            ag agVar = new ag(str, "");
            a.C1046a aVar2 = new a.C1046a();
            aVar2.f43153a = c.a.a("/passport/account/verify/");
            h.f.b.l.d(agVar, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(agVar.f64224c)) {
                hashMap.put("captcha", agVar.f64224c);
            }
            String c2 = com.bytedance.common.utility.m.c(agVar.f64223b);
            h.f.b.l.b(c2, "");
            hashMap.put("password", c2);
            hashMap.put("mix_mode", "1");
            com.bytedance.sdk.a.d.a c3 = aVar2.a(hashMap).c();
            h.f.b.l.b(c3, "");
            new ah(context, c3, agVar, aVar, (byte) 0).d();
        }
    }

    public static final class cx<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64602c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64603d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64604e;

        static {
            Covode.recordClassIndex(39711);
        }

        public cx(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str, String str2) {
            this.f64600a = cVar;
            this.f64601b = jVar;
            this.f64602c = kVar;
            this.f64603d = str;
            this.f64604e = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.f {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ cx f64605c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64606d;

            static {
                Covode.recordClassIndex(39712);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.f> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64606d.a(dVar.f43081j);
            }

            a(cx cxVar, f.a.o oVar) {
                this.f64605c = cxVar;
                this.f64606d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64606d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64605c.f64601b, this.f64605c.f64602c, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.f> dVar, int i2) {
                String str;
                com.bytedance.sdk.a.h.a.f fVar;
                JSONObject jSONObject;
                f.a.o oVar = this.f64606d;
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = this.f64605c.f64601b;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = this.f64605c.f64602c;
                if (!(dVar == null || (fVar = (com.bytedance.sdk.a.h.a.f) dVar.f43081j) == null || (jSONObject = fVar.f43284m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.a((Throwable) new w(i2, str, jVar, kVar, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.h.a.f> oVar) {
            h.f.b.l.d(oVar, "");
            v.a((Boolean) true, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64600a, false, (Map) null, false, 56);
            a aVar = new a(this, oVar);
            this.f64600a.b(aVar);
            this.f64600a.z().a(this.f64603d, this.f64604e, com.ss.android.ugc.aweme.account.agegate.util.h.b(), aVar);
        }
    }

    public static final class d<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64611c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f64612d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64613e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64614f;

        static {
            Covode.recordClassIndex(39715);
        }

        public d(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, boolean z, String str, String str2) {
            this.f64609a = cVar;
            this.f64610b = jVar;
            this.f64611c = kVar;
            this.f64612d = z;
            this.f64613e = str;
            this.f64614f = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.a {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f64615c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64616d;

            static {
                Covode.recordClassIndex(39716);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.a> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64616d.a(dVar);
            }

            a(d dVar, f.a.o oVar) {
                this.f64615c = dVar;
                this.f64616d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64616d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64615c.f64610b, this.f64615c.f64611c, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.a> dVar, int i2) {
                h.f.b.l.d(dVar, "");
                this.f64616d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64615c.f64610b, this.f64615c.f64611c, null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.a>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.account.b.c.b(this.f64609a.w(), "mobile");
            a aVar = new a(this, oVar);
            this.f64609a.b(aVar);
            if (this.f64612d) {
                Context context = this.f64609a.getContext();
                if (context == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(context, "");
                String str = this.f64613e;
                String str2 = this.f64614f;
                h.f.b.l.d(context, "");
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
                h.f.b.l.d("", "");
                h.f.b.l.d("", "");
                h.f.b.l.d(aVar, "");
                com.bytedance.sdk.a.h.a.a aVar2 = new com.bytedance.sdk.a.h.a.a(str, str2, "", "", 0);
                a.C1046a aVar3 = new a.C1046a();
                aVar3.f43153a = "/passport/mobile/bind_with_change_password/";
                h.f.b.l.d(aVar2, "");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(aVar2.f43243c)) {
                    String str3 = aVar2.f43243c;
                    h.f.b.l.b(str3, "");
                    hashMap.put("captcha", str3);
                }
                String c2 = com.bytedance.common.utility.m.c(aVar2.f43242b);
                h.f.b.l.b(c2, "");
                hashMap.put("code", c2);
                String c3 = com.bytedance.common.utility.m.c(aVar2.f43241a);
                h.f.b.l.b(c3, "");
                hashMap.put("mobile", c3);
                if (!TextUtils.isEmpty(aVar2.f43244d)) {
                    String c4 = com.bytedance.common.utility.m.c(aVar2.f43244d);
                    h.f.b.l.b(c4, "");
                    hashMap.put("password", c4);
                }
                String c5 = com.bytedance.common.utility.m.c(String.valueOf(aVar2.f43245e));
                h.f.b.l.b(c5, "");
                hashMap.put("unbind_exist", c5);
                hashMap.put("mix_mode", "1");
                com.bytedance.sdk.a.d.a c6 = aVar3.a(hashMap).c();
                h.f.b.l.b(c6, "");
                new a(context, c6, aVar2, aVar).d();
                return;
            }
            this.f64609a.z().a(this.f64613e, this.f64614f, "", aVar);
        }
    }

    public static final class g<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64623c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64624d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f64625e;

        static {
            Covode.recordClassIndex(39719);
        }

        public g(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3, boolean z) {
            this.f64621a = cVar;
            this.f64622b = str;
            this.f64623c = str2;
            this.f64624d = str3;
            this.f64625e = z;
        }

        public static final class a extends m {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f64626c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64627d;

            static {
                Covode.recordClassIndex(39720);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<n> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64627d.a(dVar);
            }

            a(g gVar, f.a.o oVar) {
                this.f64626c = gVar;
                this.f64627d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64627d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64626c.f64621a.A(), this.f64626c.f64621a.V_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<n> dVar, int i2) {
                int i3;
                String str;
                n nVar;
                JSONObject jSONObject;
                f.a.o oVar = this.f64627d;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                } else {
                    i3 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j A = this.f64626c.f64621a.A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64626c.f64621a.V_();
                if (!(dVar == null || (nVar = (n) dVar.f43081j) == null || (jSONObject = nVar.f43284m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.a((Throwable) new w(i3, str, A, V_, jSONObject2, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<n>> oVar) {
            String str;
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64621a.b(aVar);
            Context context = this.f64621a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str2 = this.f64622b;
            String str3 = this.f64623c;
            String str4 = this.f64624d;
            boolean z = this.f64625e;
            h.f.b.l.d(context, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str4, "");
            h.f.b.l.d(aVar, "");
            n nVar = new n(str2, str3, str4);
            a.C1046a aVar2 = new a.C1046a();
            if (z) {
                str = "/passport/email/change_with_update_password/";
            } else {
                str = "/passport/email/change/";
            }
            aVar2.f43153a = str;
            h.f.b.l.d(nVar, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(nVar.f64250c)) {
                hashMap.put("ticket", nVar.f64250c);
            }
            String c2 = com.bytedance.common.utility.m.c(nVar.f64248a);
            h.f.b.l.b(c2, "");
            hashMap.put("code", c2);
            hashMap.put("mix_mode", "1");
            String c3 = com.bytedance.common.utility.m.c(nVar.f64249b);
            h.f.b.l.b(c3, "");
            hashMap.put("email", c3);
            String c4 = com.bytedance.common.utility.m.c("6");
            h.f.b.l.b(c4, "");
            hashMap.put(StringSet.type, c4);
            com.bytedance.sdk.a.d.a c5 = aVar2.a(hashMap).c();
            h.f.b.l.b(c5, "");
            new o(context, c5, nVar, aVar).d();
        }
    }

    public static final class h<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64629b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64630c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64631d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64632e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64633f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.c.a f64634g;

        static {
            Covode.recordClassIndex(39721);
        }

        public h(com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3, androidx.c.a aVar) {
            this.f64628a = jVar;
            this.f64629b = kVar;
            this.f64630c = cVar;
            this.f64631d = str;
            this.f64632e = str2;
            this.f64633f = str3;
            this.f64634g = aVar;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h f64635c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64636d;

            static {
                Covode.recordClassIndex(39722);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.b> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64636d.a(dVar);
            }

            a(h hVar, f.a.o oVar) {
                this.f64635c = hVar;
                this.f64636d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64636d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64635c.f64628a, this.f64635c.f64629b, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.b> dVar, int i2) {
                h.f.b.l.d(dVar, "");
                this.f64636d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64635c.f64628a, this.f64635c.f64629b, null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.b>> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64630c.b(aVar);
            this.f64630c.z().a(this.f64631d, this.f64632e, "", this.f64633f, this.f64634g, aVar);
        }
    }

    public static final class k<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64641c;

        static {
            Covode.recordClassIndex(39725);
        }

        public k(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64639a = cVar;
            this.f64640b = str;
            this.f64641c = str2;
        }

        public static final class a extends k {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f64642c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64643d;

            static {
                Covode.recordClassIndex(39726);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<l> dVar) {
                h.f.b.l.d(dVar, "");
                l lVar = (l) dVar.f43081j;
                if (lVar == null || lVar.f64247b == null) {
                    this.f64643d.a((Throwable) w.a.a(this.f64642c.f64639a.A(), this.f64642c.f64639a.V_()));
                } else {
                    this.f64643d.a(dVar);
                }
            }

            a(k kVar, f.a.o oVar) {
                this.f64642c = kVar;
                this.f64643d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                super.a(dVar, str);
                this.f64643d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64642c.f64639a.A(), this.f64642c.f64639a.V_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<l> dVar, int i2) {
                String str;
                f.a.o oVar = this.f64643d;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64642c.f64639a.A(), this.f64642c.f64639a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<l>> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64639a.b(aVar);
            Context context = this.f64639a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64640b;
            String str2 = this.f64641c;
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(aVar, "");
            l lVar = new l(str, str2);
            a.C1046a aVar2 = new a.C1046a();
            aVar2.f43153a = "/passport/email/change_password/";
            h.f.b.l.d(lVar, "");
            HashMap hashMap = new HashMap();
            String c2 = com.bytedance.common.utility.m.c(lVar.f64246a);
            h.f.b.l.b(c2, "");
            hashMap.put("ticket", c2);
            String c3 = com.bytedance.common.utility.m.c(lVar.f64247b);
            h.f.b.l.b(c3, "");
            hashMap.put("password", c3);
            hashMap.put("mix_mode", "1");
            hashMap.put("rules_version", "v2");
            com.bytedance.sdk.a.d.a c4 = aVar2.a(hashMap).c();
            h.f.b.l.b(c4, "");
            new j(context, c4, lVar, aVar, (byte) 0).d();
        }
    }

    public static final class n<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64648c;

        static {
            Covode.recordClassIndex(39729);
        }

        public n(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64646a = cVar;
            this.f64647b = str;
            this.f64648c = str2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.c {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n f64649c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64650d;

            static {
                Covode.recordClassIndex(39730);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.c> dVar) {
                h.f.b.l.d(dVar, "");
                com.bytedance.sdk.a.h.a.c cVar = (com.bytedance.sdk.a.h.a.c) dVar.f43081j;
                if (cVar == null || cVar.f43255b == null) {
                    this.f64650d.a((Throwable) w.a.a(this.f64649c.f64646a.A(), this.f64649c.f64646a.V_()));
                } else {
                    this.f64650d.a(dVar);
                }
            }

            a(n nVar, f.a.o oVar) {
                this.f64649c = nVar;
                this.f64650d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                super.a(dVar, str);
                this.f64650d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64649c.f64646a.A(), this.f64649c.f64646a.V_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.c> dVar, int i2) {
                String str;
                f.a.o oVar = this.f64650d;
                if (dVar != null) {
                    str = dVar.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64649c.f64646a.A(), this.f64649c.f64646a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.c>> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64646a.b(aVar);
            Context context = this.f64646a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64647b;
            String str2 = this.f64648c;
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d("", "");
            h.f.b.l.d(aVar, "");
            com.bytedance.sdk.a.h.a.c cVar = new com.bytedance.sdk.a.h.a.c(str, str2, "");
            a.C1046a aVar2 = new a.C1046a();
            aVar2.f43153a = c.a.a("/passport/password/change/");
            h.f.b.l.d(cVar, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(cVar.f43256c)) {
                String str3 = cVar.f43256c;
                h.f.b.l.b(str3, "");
                hashMap.put("captcha", str3);
            }
            String c2 = com.bytedance.common.utility.m.c(cVar.f43254a);
            h.f.b.l.b(c2, "");
            hashMap.put("ticket", c2);
            String c3 = com.bytedance.common.utility.m.c(cVar.f43255b);
            h.f.b.l.b(c3, "");
            hashMap.put("password", c3);
            hashMap.put("mix_mode", "1");
            hashMap.put("rules_version", "v2");
            com.bytedance.sdk.a.d.a c4 = aVar2.a(hashMap).c();
            h.f.b.l.b(c4, "");
            new aa(context, c4, cVar, aVar, (byte) 0).d();
        }
    }

    public static final class t<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64664b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64665c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64666d;

        static {
            Covode.recordClassIndex(39737);
        }

        public t(com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64663a = jVar;
            this.f64664b = kVar;
            this.f64665c = cVar;
            this.f64666d = str;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.d {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ t f64667c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64668d;

            static {
                Covode.recordClassIndex(39738);
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                e((com.bytedance.sdk.a.a.a.d) bVar);
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.d> dVar) {
                h.f.b.l.d(dVar, "");
                this.f64668d.a(dVar.f43081j);
            }

            a(t tVar, f.a.o oVar) {
                this.f64667c = tVar;
                this.f64668d = oVar;
            }

            @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
            public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                a((com.bytedance.sdk.a.a.a.d) bVar, i2);
            }

            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                h.f.b.l.d(dVar, "");
                this.f64668d.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64667c.f64663a, this.f64667c.f64664b, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.a.e
            public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.d> dVar, int i2) {
                int i3;
                String str;
                f.a.o oVar = this.f64668d;
                if (dVar != null) {
                    i3 = dVar.f43073d;
                    str = dVar.f43075f;
                } else {
                    i3 = -10000;
                    str = null;
                }
                oVar.a((Throwable) new w(i3, str, this.f64667c.f64663a, this.f64667c.f64664b, null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.h.a.d> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64665c.b(aVar);
            this.f64665c.z().a(this.f64666d, h.a.ag.a(), "", aVar);
        }
    }

    public static final class aa<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64282a;

        static {
            Covode.recordClassIndex(39603);
        }

        public aa(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64282a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64282a.b_(1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cr<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64586a;

        static {
            Covode.recordClassIndex(39703);
        }

        cr(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64586a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            v.a(true, this.f64586a);
        }
    }

    static final class r<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64660a;

        static {
            Covode.recordClassIndex(39735);
        }

        r(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64660a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            v.a(true, this.f64660a);
        }
    }

    static final class ab<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f64284b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64285c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64286d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f64287e;

        static {
            Covode.recordClassIndex(39604);
        }

        ab(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, Map map, String str, String str2, int i2) {
            this.f64283a = cVar;
            this.f64284b = map;
            this.f64285c = str;
            this.f64286d = str2;
            this.f64287e = i2;
        }

        public static final class a extends com.bytedance.sdk.a.a.b.a {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ab f64288c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64289d;

            static {
                Covode.recordClassIndex(39605);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.a aVar) {
                h.f.b.l.d(aVar, "");
                this.f64289d.a(aVar);
            }

            a(ab abVar, f.a.o oVar) {
                this.f64288c = abVar;
                this.f64289d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.a aVar, int i2) {
                String str;
                com.bytedance.sdk.a.a.d.a aVar2 = aVar;
                f.a.o oVar = this.f64289d;
                if (aVar2 != null) {
                    str = aVar2.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64288c.f64283a.A(), this.f64288c.f64283a.V_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.a aVar, String str) {
                com.bytedance.sdk.a.a.d.a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                this.f64289d.a((Throwable) new w(aVar2.f43073d, aVar2.f43075f, this.f64288c.f64283a.A(), this.f64288c.f64283a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.a> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f64284b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("rules_version", "v2");
            this.f64283a.b(aVar);
            this.f64283a.z().b(this.f64285c, this.f64286d, this.f64287e, linkedHashMap, aVar);
        }
    }

    public static final class bh<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64423c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64424d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f64425e;

        static {
            Covode.recordClassIndex(39653);
        }

        public bh(com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, int i2) {
            this.f64421a = jVar;
            this.f64422b = kVar;
            this.f64423c = cVar;
            this.f64424d = str;
            this.f64425e = i2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.p {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bh f64426c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64427d;

            static {
                Covode.recordClassIndex(39654);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.f fVar) {
                h.f.b.l.d(fVar, "");
                this.f64427d.a(fVar);
            }

            a(bh bhVar, f.a.o oVar) {
                this.f64426c = bhVar;
                this.f64427d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.f fVar, int i2) {
                com.bytedance.sdk.a.a.a.f fVar2 = fVar;
                h.f.b.l.d(fVar2, "");
                this.f64427d.a((Throwable) new w(fVar2.f43073d, fVar2.f43075f, this.f64426c.f64421a, this.f64426c.f64422b, null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.f fVar, String str) {
                com.bytedance.sdk.a.a.a.f fVar2 = fVar;
                h.f.b.l.d(fVar2, "");
                this.f64427d.a((Throwable) new w(fVar2.f43073d, fVar2.f43075f, this.f64426c.f64421a, this.f64426c.f64422b, null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.f> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64423c.b(aVar);
            this.f64423c.z().a(this.f64424d, this.f64425e, "", aVar);
        }
    }

    public static final class cl<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64565b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64566c;

        static {
            Covode.recordClassIndex(39694);
        }

        public cl(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64564a = cVar;
            this.f64565b = str;
            this.f64566c = str2;
        }

        public static final class a extends com.bytedance.sdk.a.a.b.h {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ cl f64567c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64568d;

            static {
                Covode.recordClassIndex(39695);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.l lVar) {
                h.f.b.l.d(lVar, "");
                this.f64568d.a(lVar);
            }

            a(cl clVar, f.a.o oVar) {
                this.f64567c = clVar;
                this.f64568d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.l lVar, int i2) {
                com.bytedance.sdk.a.a.d.l lVar2 = lVar;
                h.f.b.l.d(lVar2, "");
                this.f64568d.a((Throwable) new w(i2, lVar2.f43075f, com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD, this.f64567c.f64564a.V_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.l lVar, String str) {
                com.bytedance.sdk.a.a.d.l lVar2 = lVar;
                h.f.b.l.d(lVar2, "");
                this.f64568d.a((Throwable) new w(lVar2.f43073d, lVar2.f43075f, com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD, this.f64567c.f64564a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.l> oVar) {
            h.f.b.l.d(oVar, "");
            v.a((Boolean) false, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64564a, true, (Map) null, false, 48);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f64564a.b(aVar);
            com.bytedance.sdk.a.a.e z = this.f64564a.z();
            String str = this.f64565b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            z.b(h.m.p.b((CharSequence) str).toString(), this.f64566c, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cq<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f64581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64582c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f64583d;

        static {
            Covode.recordClassIndex(39701);
        }

        cq(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, Map map, String str, int i2) {
            this.f64580a = cVar;
            this.f64581b = map;
            this.f64582c = str;
            this.f64583d = i2;
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.p {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ cq f64584c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64585d;

            static {
                Covode.recordClassIndex(39702);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.f fVar) {
                h.f.b.l.d(fVar, "");
                this.f64585d.a(fVar);
            }

            a(cq cqVar, f.a.o oVar) {
                this.f64584c = cqVar;
                this.f64585d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.f fVar, int i2) {
                String str;
                com.bytedance.sdk.a.a.a.f fVar2 = fVar;
                f.a.o oVar = this.f64585d;
                if (fVar2 != null) {
                    str = fVar2.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64584c.f64580a.A(), this.f64584c.f64580a.V_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.f fVar, String str) {
                com.bytedance.sdk.a.a.a.f fVar2 = fVar;
                h.f.b.l.d(fVar2, "");
                this.f64585d.a((Throwable) new w(fVar2.f43073d, fVar2.f43075f, this.f64584c.f64580a.A(), this.f64584c.f64580a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.f> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f64581b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f64580a.b(aVar);
            this.f64580a.z().a(this.f64582c, this.f64583d, linkedHashMap, aVar);
        }
    }

    static final class cw<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f64595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f64596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64597d;

        static {
            Covode.recordClassIndex(39709);
        }

        cw(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, Map map, int i2, String str) {
            this.f64594a = cVar;
            this.f64595b = map;
            this.f64596c = i2;
            this.f64597d = str;
        }

        public static final class a extends com.bytedance.sdk.a.a.b.k {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ cw f64598c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64599d;

            static {
                Covode.recordClassIndex(39710);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.o oVar) {
                h.f.b.l.d(oVar, "");
                this.f64599d.a(oVar);
            }

            a(cw cwVar, f.a.o oVar) {
                this.f64598c = cwVar;
                this.f64599d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.o oVar, int i2) {
                int i3;
                String str;
                JSONObject jSONObject;
                com.bytedance.sdk.a.a.d.o oVar2 = oVar;
                f.a.o oVar3 = this.f64599d;
                if (oVar2 != null) {
                    i3 = oVar2.f43073d;
                } else {
                    i3 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (oVar2 != null) {
                    str = oVar2.f43075f;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j A = this.f64598c.f64594a.A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64598c.f64594a.V_();
                if (!(oVar2 == null || (jSONObject = oVar2.f43077h) == null)) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                }
                oVar3.a((Throwable) new w(i3, str, A, V_, jSONObject2, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.o oVar, String str) {
                com.bytedance.sdk.a.a.d.o oVar2 = oVar;
                h.f.b.l.d(oVar2, "");
                this.f64599d.a((Throwable) new w(oVar2.f43073d, oVar2.f43075f, this.f64598c.f64594a.A(), this.f64598c.f64594a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.o> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f64595b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f64594a.b(aVar);
            this.f64594a.z().a(this.f64596c, this.f64597d, linkedHashMap, aVar);
        }
    }

    static final class q<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64655c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f64656d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f64657e;

        static {
            Covode.recordClassIndex(39733);
        }

        q(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, int i2, Map map) {
            this.f64653a = cVar;
            this.f64654b = str;
            this.f64655c = str2;
            this.f64656d = i2;
            this.f64657e = map;
        }

        public static final class a extends com.bytedance.sdk.a.a.b.a {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q f64658c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64659d;

            static {
                Covode.recordClassIndex(39734);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.a aVar) {
                h.f.b.l.d(aVar, "");
                this.f64659d.a(aVar);
            }

            a(q qVar, f.a.o oVar) {
                this.f64658c = qVar;
                this.f64659d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.a aVar, int i2) {
                String str;
                com.bytedance.sdk.a.a.d.a aVar2 = aVar;
                f.a.o oVar = this.f64659d;
                if (aVar2 != null) {
                    str = aVar2.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, this.f64658c.f64653a.A(), this.f64658c.f64653a.V_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.a aVar, String str) {
                com.bytedance.sdk.a.a.d.a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                this.f64659d.a((Throwable) new w(aVar2.f43073d, aVar2.f43075f, this.f64658c.f64653a.A(), this.f64658c.f64653a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.a> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64653a.b(aVar);
            this.f64653a.z().a(this.f64654b, this.f64655c, this.f64656d, this.f64657e, aVar);
        }
    }

    public static final class bi<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64428a;

        static {
            Covode.recordClassIndex(39655);
        }

        public bi(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64428a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.b.c.a(this.f64428a.w(), "change_bind_phone_click", "phone", 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bs<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64470b;

        static {
            Covode.recordClassIndex(39668);
        }

        bs(String str, int i2) {
            this.f64469a = str;
            this.f64470b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            v.a(0, this.f64469a, this.f64470b, "mail", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cs<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64587a;

        static {
            Covode.recordClassIndex(39704);
        }

        cs(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64587a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof w) {
                v.a(false, this.f64587a);
            }
        }
    }

    public static final class w<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64676a;

        static {
            Covode.recordClassIndex(39742);
        }

        public w(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64676a = cVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            h.f.b.l.d(str, "");
            return new org.a.b(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.x.w.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ w f64677a;

                static {
                    Covode.recordClassIndex(39743);
                }

                {
                    this.f64677a = r1;
                }

                @Override // org.a.b
                public final void a_(org.a.c<? super f> cVar) {
                    int i2;
                    String str;
                    Integer num;
                    f fVar = (f) NetworkProxyAccount.f65195b.a().a(str, (Class) f.class);
                    if (TextUtils.equals(fVar.f64238a, "success")) {
                        cVar.onNext(fVar);
                    } else {
                        e eVar = fVar.f64239b;
                        if (eVar == null || (num = eVar.f64235a) == null) {
                            i2 = -1;
                        } else {
                            i2 = num.intValue();
                        }
                        e eVar2 = fVar.f64239b;
                        if (eVar2 != null) {
                            str = eVar2.f64236b;
                        } else {
                            str = null;
                        }
                        cVar.onError(new w(i2, str, com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, this.f64677a.f64676a.V_(), null, null, 32, null));
                    }
                    cVar.onComplete();
                }
            };
        }
    }

    public static final class ak<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64313b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64314c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f64315d = 1;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f64316e = 3;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f64317f = null;

        static {
            Covode.recordClassIndex(39616);
        }

        public ak(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64312a = cVar;
            this.f64313b = str;
            this.f64314c = str2;
        }

        public static final class a extends com.bytedance.sdk.a.c<com.bytedance.sdk.a.a.d.e> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ak f64318c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64319d;

            static {
                Covode.recordClassIndex(39617);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.e eVar) {
                h.f.b.l.d(eVar, "");
                com.ss.android.ugc.aweme.account.login.v2.ui.a.i.a(this.f64318c.f64312a, true, 0);
                this.f64319d.a(eVar);
            }

            a(ak akVar, f.a.o oVar) {
                this.f64318c = akVar;
                this.f64319d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.e eVar, int i2) {
                com.bytedance.sdk.a.a.d.e eVar2 = eVar;
                com.ss.android.ugc.aweme.account.login.v2.ui.a.i.a(this.f64318c.f64312a, false, i2);
                if (eVar2 == null) {
                    this.f64319d.a((Throwable) w.a.a(this.f64318c.f64312a.A(), this.f64318c.f64312a.V_()));
                } else {
                    this.f64319d.a((Throwable) new w(i2, eVar2.f43075f, this.f64318c.f64312a.A(), this.f64318c.f64312a.V_(), eVar2.f43077h, null, 32, null));
                }
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.e> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            this.f64312a.b(aVar);
            this.f64312a.z().a(this.f64313b, this.f64314c, this.f64315d, this.f64316e, this.f64317f, aVar);
        }
    }

    public static final class bk<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64431b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64433d;

        static {
            Covode.recordClassIndex(39657);
        }

        public bk(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, boolean z, String str, String str2) {
            this.f64430a = cVar;
            this.f64431b = z;
            this.f64432c = str;
            this.f64433d = str2;
        }

        public static final class a extends com.bytedance.sdk.a.a.b.h {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bk f64434c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64435d;

            static {
                Covode.recordClassIndex(39658);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.l lVar) {
                com.bytedance.sdk.a.a.d.l lVar2 = lVar;
                h.f.b.l.d(lVar2, "");
                if (lVar2.f43082j == null) {
                    w.a.a(com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD, this.f64434c.f64430a.V_());
                } else {
                    this.f64435d.a(lVar2);
                }
            }

            a(bk bkVar, f.a.o oVar) {
                this.f64434c = bkVar;
                this.f64435d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.l lVar, int i2) {
                String str;
                com.bytedance.sdk.a.a.d.l lVar2 = lVar;
                f.a.o oVar = this.f64435d;
                if (lVar2 != null) {
                    str = lVar2.f43075f;
                } else {
                    str = null;
                }
                oVar.a((Throwable) new w(i2, str, com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD, this.f64434c.f64430a.V_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.l lVar, String str) {
                com.bytedance.sdk.a.a.d.l lVar2 = lVar;
                h.f.b.l.d(lVar2, "");
                this.f64435d.a((Throwable) new w(lVar2.f43073d, lVar2.f43075f, com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD, this.f64434c.f64430a.V_(), null, null, 32, null));
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.l> oVar) {
            h.f.b.l.d(oVar, "");
            v.a((Boolean) false, "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64430a, true, (Map) null, this.f64431b, 16);
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f64430a.b(aVar);
            this.f64430a.z().a(this.f64432c, this.f64433d, linkedHashMap, aVar);
        }
    }

    static final class ac<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64291b;

        static {
            Covode.recordClassIndex(39606);
        }

        ac(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64290a = str;
            this.f64291b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = this.f64290a;
            String x = this.f64291b.x();
            h.f.b.l.b(x, "");
            v.a(0, str, x);
        }
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64396a;

        static {
            Covode.recordClassIndex(39643);
        }

        public b(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64396a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.b.c.a(this.f64396a.w(), "email", 0, null, null);
            com.ss.android.ugc.aweme.account.b.c.a(this.f64396a.w(), this.f64396a.x(), "email", 0);
        }
    }

    public static final class bc<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f64406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64408c;

        static {
            Covode.recordClassIndex(39647);
        }

        public bc(boolean z, boolean z2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64406a = z;
            this.f64407b = z2;
            this.f64408c = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            com.bytedance.sdk.a.h.a.l lVar = (com.bytedance.sdk.a.h.a.l) obj;
            boolean z = this.f64406a;
            if (this.f64407b) {
                str = "whatsapp";
            } else {
                str = "sms_verification";
            }
            v.a(z, str, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64408c, lVar.f43296e, (Map) null, false, 48);
        }
    }

    public static final class bg<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final bg f64420a = new bg();

        static {
            Covode.recordClassIndex(39652);
        }

        bg() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            if (wVar.getErrorCode() != 1011) {
                d.a.b(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            }
        }
    }

    public static final class bj<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64429a;

        static {
            Covode.recordClassIndex(39656);
        }

        public bj(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64429a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            com.ss.android.ugc.aweme.account.b.c.a(this.f64429a.w(), "change_bind_phone_click", "phone", ((w) th).getErrorCode());
        }
    }

    static final class bo<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64454b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64455c;

        static {
            Covode.recordClassIndex(39663);
        }

        bo(int i2, String str, String str2) {
            this.f64453a = i2;
            this.f64454b = str;
            this.f64455c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.a(0, this.f64453a, 0, "");
            v.a(0, this.f64454b, this.f64453a, "text", (String) null, this.f64455c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class br<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64468b;

        static {
            Covode.recordClassIndex(39667);
        }

        br(String str, int i2) {
            this.f64467a = str;
            this.f64468b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            v.a(wVar.getErrorCode(), this.f64467a, this.f64468b, "mail", wVar.getErrorMsg(), (String) null);
        }
    }

    static final class bu<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64479b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64480c;

        static {
            Covode.recordClassIndex(39671);
        }

        bu(int i2, String str, String str2) {
            this.f64478a = i2;
            this.f64479b = str;
            this.f64480c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.a(0, this.f64478a, 0, "");
            v.a(0, this.f64479b, this.f64478a, "text", (String) null, this.f64480c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class by<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64502b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64503c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64504d;

        static {
            Covode.recordClassIndex(39676);
        }

        by(int i2, String str, String str2, String str3) {
            this.f64501a = i2;
            this.f64502b = str;
            this.f64503c = str2;
            this.f64504d = str3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.a(0, this.f64501a, 0, "", this.f64502b);
            v.a(0, this.f64503c, this.f64501a, "text", (String) null, this.f64504d);
        }
    }

    static final class cb<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64523c;

        static {
            Covode.recordClassIndex(39681);
        }

        cb(int i2, String str, String str2) {
            this.f64521a = i2;
            this.f64522b = str;
            this.f64523c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.a(0, this.f64521a, 0, "", this.f64522b);
            v.a(0, this.f64523c, this.f64521a, "text", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ch<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64555b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64556c;

        static {
            Covode.recordClassIndex(39689);
        }

        ch(int i2, String str, String str2) {
            this.f64554a = i2;
            this.f64555b = str;
            this.f64556c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.b(0, this.f64554a, 0, "");
            v.a(0, this.f64555b, this.f64554a, "whatsapp", (String) null, this.f64556c);
        }
    }

    public static final class cu<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64592a;

        static {
            Covode.recordClassIndex(39707);
        }

        public cu(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64592a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64592a.w();
            h.f.b.l.b(w, "");
            String x = this.f64592a.x();
            h.f.b.l.b(x, "");
            v.b(true, "mobile", w, x);
        }
    }

    public static final class cv<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64593a;

        static {
            Covode.recordClassIndex(39708);
        }

        public cv(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64593a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64593a.w();
            h.f.b.l.b(w, "");
            String x = this.f64593a.x();
            h.f.b.l.b(x, "");
            v.b(false, "mobile", w, x);
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64637a;

        static {
            Covode.recordClassIndex(39723);
        }

        public i(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64637a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.a.b(0, "changePhone", 0, "");
            com.ss.android.ugc.aweme.account.b.c.a(this.f64637a.w(), "rebind_phone_click", "phone", 0);
        }
    }

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64644a;

        static {
            Covode.recordClassIndex(39727);
        }

        public l(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64644a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64644a.w();
            h.f.b.l.b(w, "");
            String x = this.f64644a.x();
            h.f.b.l.b(x, "");
            v.a(true, "email", w, x);
        }
    }

    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64645a;

        static {
            Covode.recordClassIndex(39728);
        }

        public m(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64645a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64645a.w();
            h.f.b.l.b(w, "");
            String x = this.f64645a.x();
            h.f.b.l.b(x, "");
            v.a(false, "email", w, x);
        }
    }

    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64651a;

        static {
            Covode.recordClassIndex(39731);
        }

        public o(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64651a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64651a.w();
            h.f.b.l.b(w, "");
            String x = this.f64651a.x();
            h.f.b.l.b(x, "");
            v.a(true, "phone", w, x);
        }
    }

    public static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64652a;

        static {
            Covode.recordClassIndex(39732);
        }

        public p(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64652a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64652a.w();
            h.f.b.l.b(w, "");
            String x = this.f64652a.x();
            h.f.b.l.b(x, "");
            v.a(false, "phone", w, x);
        }
    }

    static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f64661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64662b;

        static {
            Covode.recordClassIndex(39736);
        }

        s(h.f.a.b bVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64661a = bVar;
            this.f64662b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof w) {
                h.f.a.b bVar = this.f64661a;
                if (bVar != null) {
                    bVar.invoke(obj);
                }
                v.a(false, this.f64662b);
            }
        }
    }

    private static int a(com.ss.android.ugc.aweme.account.login.v2.base.j jVar) {
        int i2 = y.f64689b[jVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            return 1;
        }
        return -1;
    }

    public static final class al<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f64321b = null;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64323d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f64324e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f64325f;

        static {
            Covode.recordClassIndex(39618);
        }

        public al(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64320a = cVar;
            this.f64322c = str;
            this.f64323d = str2;
            this.f64324e = 1;
            this.f64325f = 3;
        }

        public static final class a extends com.bytedance.sdk.a.c<com.bytedance.sdk.a.a.a.e> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ al f64326c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64327d;

            static {
                Covode.recordClassIndex(39619);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.e eVar) {
                com.bytedance.sdk.a.a.a.e eVar2 = eVar;
                h.f.b.l.d(eVar2, "");
                if (eVar2.f43082j == null) {
                    this.f64327d.a((Throwable) new w(-1, "no data", this.f64326c.f64320a.A(), this.f64326c.f64320a.V_(), null, null, 32, null));
                } else {
                    this.f64327d.a(eVar2);
                }
            }

            a(al alVar, f.a.o oVar) {
                this.f64326c = alVar;
                this.f64327d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
                if (r6 == null) goto L_0x000e;
             */
            @Override // com.bytedance.sdk.a.c
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.e r12, int r13) {
                /*
                    r11 = this;
                    com.bytedance.sdk.a.a.a.e r12 = (com.bytedance.sdk.a.a.a.e) r12
                    f.a.o r2 = r11.f64327d
                    com.ss.android.ugc.aweme.account.login.v2.a.w r4 = new com.ss.android.ugc.aweme.account.login.v2.a.w
                    if (r12 == 0) goto L_0x005c
                    int r5 = r12.f43073d
                    java.lang.String r6 = r12.f43075f
                    if (r6 != 0) goto L_0x0010
                L_0x000e:
                    java.lang.String r6 = ""
                L_0x0010:
                    com.ss.android.ugc.aweme.account.login.v2.a.x$al r0 = r11.f64326c
                    com.ss.android.ugc.aweme.account.login.v2.base.c r0 = r0.f64320a
                    com.ss.android.ugc.aweme.account.login.v2.base.j r7 = r0.A()
                    com.ss.android.ugc.aweme.account.login.v2.a.x$al r0 = r11.f64326c
                    com.ss.android.ugc.aweme.account.login.v2.base.c r0 = r0.f64320a
                    com.ss.android.ugc.aweme.account.login.v2.base.k r8 = r0.V_()
                    if (r12 == 0) goto L_0x002e
                    org.json.JSONObject r1 = r12.f43077h
                    if (r1 == 0) goto L_0x002e
                    java.lang.String r0 = "data"
                    org.json.JSONObject r9 = r1.getJSONObject(r0)
                    if (r9 != 0) goto L_0x0033
                L_0x002e:
                    org.json.JSONObject r9 = new org.json.JSONObject
                    r9.<init>()
                L_0x0033:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r3 = 0
                    if (r12 == 0) goto L_0x005a
                    java.lang.String r0 = r12.f43075f
                L_0x003d:
                    java.lang.StringBuilder r1 = r1.append(r0)
                    r0 = 124(0x7c, float:1.74E-43)
                    java.lang.StringBuilder r0 = r1.append(r0)
                    if (r12 == 0) goto L_0x004b
                    java.lang.String r3 = r12.f43076g
                L_0x004b:
                    java.lang.StringBuilder r0 = r0.append(r3)
                    java.lang.String r10 = r0.toString()
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    r2.a(r4)
                    return
                L_0x005a:
                    r0 = r3
                    goto L_0x003d
                L_0x005c:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r5 = -10000(0xffffffffffffd8f0, float:NaN)
                    goto L_0x000e
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.a.x.al.a.a(com.bytedance.sdk.a.a.a.b, int):void");
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.e> oVar) {
            Map<String, String> linkedHashMap;
            h.f.b.l.d(oVar, "");
            v.a((Boolean) true, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64320a, false, (Map) null, false, 56);
            a aVar = new a(this, oVar);
            Map map = this.f64321b;
            if (map != null) {
                linkedHashMap = h.a.ag.d(map);
            } else {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.put("rules_version", "v2");
            linkedHashMap.putAll(com.ss.android.ugc.aweme.account.agegate.util.h.b());
            if (com.ss.android.ugc.aweme.account.util.p.a()) {
                linkedHashMap.putAll(com.ss.android.ugc.aweme.account.util.p.b());
            }
            this.f64320a.b(aVar);
            this.f64320a.z().b(this.f64322c, this.f64323d, this.f64324e, this.f64325f, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ao<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f64331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64332c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64333d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64334e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64335f;

        static {
            Covode.recordClassIndex(39622);
        }

        ao(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, Map map, String str, String str2, String str3, String str4) {
            this.f64330a = cVar;
            this.f64331b = map;
            this.f64332c = str;
            this.f64333d = str2;
            this.f64334e = str3;
            this.f64335f = str4;
        }

        public static final class a extends t {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ao f64336c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64337d;

            static {
                Covode.recordClassIndex(39623);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void e(u uVar) {
                int i2;
                if (uVar == null || uVar.p == null) {
                    f.a.o oVar = this.f64337d;
                    if (uVar != null) {
                        i2 = uVar.f43073d;
                    } else {
                        i2 = -1;
                    }
                    oVar.a((Throwable) new w(i2, "no data", com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN, com.ss.android.ugc.aweme.account.login.v2.base.k.CHANGE_PASSWORD, null, "no data"));
                    return;
                }
                this.f64337d.a(uVar);
            }

            a(ao aoVar, f.a.o oVar) {
                this.f64336c = aoVar;
                this.f64337d = oVar;
            }

            /* access modifiers changed from: private */
            public void a(u uVar, int i2) {
                if (uVar == null) {
                    this.f64337d.a((Throwable) w.a.a(this.f64336c.f64330a.A(), this.f64336c.f64330a.V_()));
                } else {
                    this.f64337d.a((Throwable) new w(i2, uVar.f43075f, this.f64336c.f64330a.A(), this.f64336c.f64330a.V_(), uVar.f43077h, null, 32, null));
                }
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<u> oVar) {
            String str;
            String str2;
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            Map map = this.f64331b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f64330a.b(aVar);
            Context context = this.f64330a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            String str3 = this.f64332c;
            String str4 = this.f64333d;
            String str5 = this.f64334e;
            String str6 = this.f64335f;
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str4, "");
            h.f.b.l.d(str5, "");
            h.f.b.l.d(str6, "");
            s.b bVar = new s.b(str4, str5, str6);
            a.C1046a aVar2 = new a.C1046a();
            if (h.f.b.l.a((Object) str3, (Object) "email")) {
                str = "/passport/password/forced_reset_by_email_ticket/";
            } else {
                str = "/passport/password/forced_reset_by_mobile_ticket/";
            }
            aVar2.f43153a = str;
            boolean z = !h.f.b.l.a((Object) str3, (Object) "email");
            HashMap hashMap = new HashMap();
            hashMap.put("conditional_login_ticket", com.bytedance.common.utility.m.c(bVar.f64268b));
            hashMap.put("password", com.bytedance.common.utility.m.c(bVar.f64267a));
            if (z) {
                str2 = com.bytedance.common.utility.m.c(bVar.f64269c);
            } else {
                str2 = bVar.f64269c;
            }
            hashMap.put("ticket", str2);
            hashMap.put("mix_mode", "1");
            hashMap.putAll(linkedHashMap);
            s sVar = new s(context, aVar2.a(hashMap).c(), bVar, aVar);
            sVar.f64263e = !h.f.b.l.a((Object) str3, (Object) "email");
            sVar.d();
        }
    }

    static final class v<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64671b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f64672c = null;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64673d;

        static {
            Covode.recordClassIndex(39740);
        }

        v(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64670a = cVar;
            this.f64671b = str;
            this.f64673d = str2;
        }

        public static final class a extends com.bytedance.sdk.a.a.b.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f64674c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64675d;

            static {
                Covode.recordClassIndex(39741);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.b bVar) {
                int i2;
                com.bytedance.sdk.a.a.d.b bVar2 = bVar;
                if (bVar2 == null || !bVar2.f43071b) {
                    f.a.o oVar = this.f64675d;
                    if (bVar2 != null) {
                        i2 = bVar2.f43073d;
                    } else {
                        i2 = -1;
                    }
                    oVar.a((Throwable) new w(i2, "no data", com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD, com.ss.android.ugc.aweme.account.login.v2.base.k.CHANGE_PASSWORD, null, "no data"));
                    return;
                }
                this.f64675d.a(bVar2);
            }

            a(v vVar, f.a.o oVar) {
                this.f64674c = vVar;
                this.f64675d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.b bVar, int i2) {
                com.bytedance.sdk.a.a.d.b bVar2 = bVar;
                if (bVar2 == null) {
                    this.f64675d.a((Throwable) w.a.a(this.f64674c.f64670a.A(), this.f64674c.f64670a.V_()));
                } else {
                    this.f64675d.a((Throwable) new w(i2, bVar2.f43075f, this.f64674c.f64670a.A(), this.f64674c.f64670a.V_(), bVar2.f43077h, null, 32, null));
                }
            }
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.b> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            linkedHashMap.put("conditional_login_ticket", this.f64671b);
            Map map = this.f64672c;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f64670a.b(aVar);
            this.f64670a.z().a(this.f64673d, (Map<String, String>) linkedHashMap, (com.bytedance.sdk.a.a.b.b) aVar);
        }
    }

    static final class ad<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f64294c;

        static {
            Covode.recordClassIndex(39607);
        }

        ad(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, h.f.a.b bVar) {
            this.f64292a = str;
            this.f64293b = cVar;
            this.f64294c = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            int errorCode = wVar.getErrorCode();
            String str = this.f64292a;
            String x = this.f64293b.x();
            h.f.b.l.b(x, "");
            v.a(errorCode, str, x);
            h.f.a.b bVar = this.f64294c;
            if (bVar != null) {
                bVar.invoke(wVar);
            }
        }
    }

    public static final class af<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64302a;

        static {
            Covode.recordClassIndex(39610);
        }

        public af(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64302a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f64302a.w();
            h.f.b.l.b(w, "");
            String x = this.f64302a.x();
            h.f.b.l.b(x, "");
            v.b(0, w, x);
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64302a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64302a.V_();
            T t = ((com.bytedance.sdk.a.a.a.d) obj).f43081j;
            h.f.b.l.b(t, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, ((q) t).f64254b);
        }
    }

    public static final class ag<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64303a;

        static {
            Covode.recordClassIndex(39611);
        }

        public ag(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64303a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            int errorCode = ((w) th).getErrorCode();
            String w = this.f64303a.w();
            h.f.b.l.b(w, "");
            String x = this.f64303a.x();
            h.f.b.l.b(x, "");
            v.b(errorCode, w, x);
        }
    }

    public static final class aj<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64311a;

        static {
            Covode.recordClassIndex(39615);
        }

        public aj(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64311a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            String x = this.f64311a.x();
            h.f.b.l.b(x, "");
            w wVar = (w) th;
            v.a(false, "email", "register", x, wVar.getErrorCode());
            v.a(true, wVar.getErrorCode(), "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64311a, (Map) null, false, 48);
            d.a.a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
        }
    }

    public static final class am<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64328a;

        static {
            Covode.recordClassIndex(39620);
        }

        public am(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64328a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.e eVar = (com.bytedance.sdk.a.a.a.e) obj;
            String x = this.f64328a.x();
            h.f.b.l.b(x, "");
            v.a(true, "email", "register", x);
            v.a(true, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64328a, eVar.f43082j, (Map) null, false, 48);
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64328a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64328a.V_();
            com.bytedance.sdk.a.n.a aVar = eVar.f43082j;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
            if (com.ss.android.ugc.aweme.account.util.p.a()) {
                com.ss.android.ugc.aweme.account.util.p.f65498a = null;
            }
        }
    }

    public static final class an<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64329a;

        static {
            Covode.recordClassIndex(39621);
        }

        public an(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64329a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            String x = this.f64329a.x();
            h.f.b.l.b(x, "");
            w wVar = (w) th;
            v.a(false, "email", "register", x, wVar.getErrorCode());
            v.a(true, wVar.getErrorCode(), "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64329a, (Map) null, false, 48);
            d.a.a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
        }
    }

    static final class aw<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64383b;

        static {
            Covode.recordClassIndex(39638);
        }

        aw(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64382a = cVar;
            this.f64383b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64382a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64382a.V_();
            com.bytedance.sdk.a.n.a aVar = ((com.bytedance.sdk.a.h.a.o) dVar.f43081j).u;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
            v.a(false, this.f64383b, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64382a, ((com.bytedance.sdk.a.h.a.o) dVar.f43081j).u, (Map) null, false, 48);
        }
    }

    static final class ax<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64385b;

        static {
            Covode.recordClassIndex(39639);
        }

        ax(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64384a = str;
            this.f64385b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            if (h.f.b.l.a((Object) this.f64384a, (Object) "phone")) {
                d.a.a(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            } else {
                d.a.a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            }
            v.a(false, wVar.getErrorCode(), this.f64384a, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64385b, (Map) null, false, 48);
        }
    }

    static final class az<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f64394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64395b;

        static {
            Covode.recordClassIndex(39642);
        }

        az(boolean z, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64394a = z;
            this.f64395b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            v.a(this.f64394a, wVar.getErrorCode(), "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64395b, (Map) null, false, 48);
            d.a.b(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
        }
    }

    static final class ba<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f64397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64398b;

        static {
            Covode.recordClassIndex(39644);
        }

        ba(boolean z, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64397a = z;
            this.f64398b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            v.a(this.f64397a, "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64398b, ((com.bytedance.sdk.a.h.a.k) dVar.f43081j).f43291d, (Map) null, false, 48);
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64398b;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64398b.V_();
            com.bytedance.sdk.a.n.a aVar = ((com.bytedance.sdk.a.h.a.k) dVar.f43081j).f43291d;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
            if (com.ss.android.ugc.aweme.account.util.p.a()) {
                com.ss.android.ugc.aweme.account.util.p.f65498a = null;
            }
        }
    }

    public static final class bd<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f64409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64411c;

        static {
            Covode.recordClassIndex(39648);
        }

        public bd(boolean z, boolean z2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64409a = z;
            this.f64410b = z2;
            this.f64411c = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            if (!this.f64409a || wVar.getErrorCode() != 1011) {
                d.a.b(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
                boolean z = this.f64409a;
                int errorCode = wVar.getErrorCode();
                if (this.f64410b) {
                    str = "whatsapp";
                } else {
                    str = "sms_verification";
                }
                v.a(z, errorCode, str, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64411c, (Map) null, false, 48);
            }
        }
    }

    public static final class bf<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64419a;

        static {
            Covode.recordClassIndex(39651);
        }

        public bf(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64419a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.h.a.m mVar = (com.bytedance.sdk.a.h.a.m) obj;
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64419a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64419a.V_();
            com.bytedance.sdk.a.n.a aVar = mVar.f43301e;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
            v.a(false, "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64419a, mVar.f43301e, (Map) null, false, 48);
        }
    }

    public static final class bm<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64440b;

        static {
            Covode.recordClassIndex(39660);
        }

        public bm(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, boolean z) {
            this.f64439a = cVar;
            this.f64440b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof w) {
                w wVar = (w) th;
                v.a(false, wVar.getErrorCode(), "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64439a, (Map) null, this.f64440b, 16);
                if (this.f64439a.V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.RESET_PASSWORD_FOR_PHONE) {
                    com.ss.android.ugc.aweme.cj.a(8, 3, (Object) wVar.getErrorMsg());
                }
            }
        }
    }

    static final class bp<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64458c;

        static {
            Covode.recordClassIndex(39664);
        }

        bp(int i2, String str, String str2) {
            this.f64456a = i2;
            this.f64457b = str;
            this.f64458c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            f.a.a(1, this.f64456a, wVar.getErrorCode(), wVar.getErrorMsg());
            v.a(wVar.getErrorCode(), this.f64457b, this.f64456a, "text", wVar.getErrorMsg(), this.f64458c);
        }
    }

    static final class bv<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64482b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64483c;

        static {
            Covode.recordClassIndex(39672);
        }

        bv(int i2, String str, String str2) {
            this.f64481a = i2;
            this.f64482b = str;
            this.f64483c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            f.a.a(1, this.f64481a, wVar.getErrorCode(), wVar.getMessage());
            v.a(wVar.getErrorCode(), this.f64482b, this.f64481a, "text", wVar.getErrorMsg(), this.f64483c);
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64515a;

        static {
            Covode.recordClassIndex(39679);
        }

        public c(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64515a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            com.ss.android.ugc.aweme.account.b.c.a(this.f64515a.w(), "email", wVar.getErrorCode(), wVar.getErrorMsg(), null);
            com.ss.android.ugc.aweme.account.b.c.a(this.f64515a.w(), this.f64515a.x(), "email", wVar.getErrorCode());
        }
    }

    static final class cd<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64534c;

        static {
            Covode.recordClassIndex(39684);
        }

        cd(int i2, String str, String str2) {
            this.f64532a = i2;
            this.f64533b = str;
            this.f64534c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            f.a.a(1, this.f64532a, wVar.getErrorCode(), wVar.getMessage());
            v.a(wVar.getErrorCode(), this.f64533b, this.f64532a, "voice", wVar.getErrorMsg(), this.f64534c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ci<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64558b;

        static {
            Covode.recordClassIndex(39690);
        }

        ci(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64557a = cVar;
            this.f64558b = str;
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.a.d<l.a>> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f64557a.b(aVar);
            this.f64557a.z().a(this.f64558b, (Map<String, String>) linkedHashMap, (com.bytedance.sdk.a.h.b.a.m) aVar);
        }

        public static final class a extends com.bytedance.sdk.a.h.b.a.m {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ci f64559c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64560d;

            static {
                Covode.recordClassIndex(39691);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.a.a.a.a
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.d<l.a> dVar) {
                com.bytedance.sdk.a.a.a.d<l.a> dVar2 = dVar;
                if (dVar2 == null) {
                    this.f64560d.a((Throwable) new w(-1, "no data", com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, this.f64559c.f64557a.V_(), null, null, 32, null));
                } else if (dVar2.f43073d != 0) {
                    this.f64560d.a((Throwable) new w(dVar2.f43073d, dVar2.f43075f, com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, this.f64559c.f64557a.V_(), null, null, 32, null));
                } else {
                    this.f64560d.a(dVar2);
                }
            }

            a(ci ciVar, f.a.o oVar) {
                this.f64559c = ciVar;
                this.f64560d = oVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cj<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64562b;

        static {
            Covode.recordClassIndex(39692);
        }

        cj(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64561a = cVar;
            this.f64562b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.n.e.a(com.ss.android.ugc.aweme.account.login.h.a.a(com.ss.android.ugc.aweme.account.login.v2.base.e.b(this.f64561a)), this.f64562b, "phone", this.f64561a, 0, "register");
            String w = this.f64561a.w();
            h.f.b.l.b(w, "");
            String x = this.f64561a.x();
            h.f.b.l.b(x, "");
            v.a(true, "phone", w, x);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ck<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64563a;

        static {
            Covode.recordClassIndex(39693);
        }

        ck(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64563a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String w = this.f64563a.w();
            h.f.b.l.b(w, "");
            String x = this.f64563a.x();
            h.f.b.l.b(x, "");
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            v.a(false, "phone", w, x, ((w) th).getErrorCode());
        }
    }

    public static final class cn<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64572a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64573b;

        static {
            Covode.recordClassIndex(39697);
        }

        public cn(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, boolean z) {
            this.f64572a = cVar;
            this.f64573b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            String x = this.f64572a.x();
            h.f.b.l.b(x, "");
            v.a(false, "email", "reset_password", x, wVar.getErrorCode());
            v.a(false, wVar.getErrorCode(), "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64572a, (Map) null, this.f64573b, 16);
        }
    }

    public static final class co<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64576c;

        static {
            Covode.recordClassIndex(39698);
        }

        public co(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64574a = cVar;
            this.f64575b = str;
            this.f64576c = str2;
        }

        @Override // f.a.q
        public final void a(f.a.o<com.bytedance.sdk.a.a.d.m> oVar) {
            h.f.b.l.d(oVar, "");
            a aVar = new a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f64574a.b(aVar);
            this.f64574a.z().a(this.f64575b, this.f64576c, linkedHashMap, aVar);
        }

        public static final class a extends com.bytedance.sdk.a.a.b.i {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ co f64577c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f.a.o f64578d;

            static {
                Covode.recordClassIndex(39699);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.m mVar) {
                com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64577c.f64574a;
                h.f.b.l.d(cVar, "");
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(com.ss.android.ugc.aweme.a.f62426a.getString(R.string.d_5)).a();
                androidx.fragment.app.e activity = cVar.getActivity();
                if (activity != null) {
                    Bundle arguments = cVar.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.FINISH.getValue());
                    h.f.b.l.b(arguments, "");
                    ((ActionResultModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(ActionResultModel.class)).f64698a.postValue(arguments);
                }
            }

            a(co coVar, f.a.o oVar) {
                this.f64577c = coVar;
                this.f64578d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.a.c
            public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.m mVar, int i2) {
                com.bytedance.sdk.a.a.d.m mVar2 = mVar;
                if (mVar2 == null) {
                    this.f64578d.a((Throwable) w.a.a(this.f64577c.f64574a.A(), this.f64577c.f64574a.V_()));
                } else {
                    this.f64578d.a((Throwable) new w(i2, mVar2.f43075f, this.f64577c.f64574a.A(), this.f64577c.f64574a.V_(), mVar2.f43077h, null, 32, null));
                }
            }
        }
    }

    public static final class cy<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64607a;

        static {
            Covode.recordClassIndex(39713);
        }

        public cy(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64607a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d.a.a(0, 0, "");
            String x = this.f64607a.x();
            h.f.b.l.b(x, "");
            v.a(0, "register", x);
            v.a(true, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64607a, ((com.bytedance.sdk.a.h.a.f) obj).f43271f, (Map) null, false, 48);
        }
    }

    public static final class cz<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64608a;

        static {
            Covode.recordClassIndex(39714);
        }

        public cz(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64608a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            d.a.a(1, wVar.getErrorCode(), wVar.getErrorMsg());
            int errorCode = wVar.getErrorCode();
            String x = this.f64608a.x();
            h.f.b.l.b(x, "");
            v.a(errorCode, "register", x);
            v.a(true, wVar.getErrorCode(), "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64608a, (Map) null, false, 48);
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64618b;

        static {
            Covode.recordClassIndex(39717);
        }

        public e(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64617a = cVar;
            this.f64618b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.a.a(0, "bindPhone", 0, "");
            com.ss.android.ugc.aweme.account.b.c.a(this.f64617a.w(), "mobile", 0, null, this.f64618b);
            com.ss.android.ugc.aweme.account.b.c.a(this.f64617a.w(), this.f64617a.x(), "phone", 0);
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64638a;

        static {
            Covode.recordClassIndex(39724);
        }

        public j(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64638a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            c.a.b(1, "changePhone", wVar.getErrorCode(), wVar.getErrorMsg());
            com.ss.android.ugc.aweme.account.b.c.a(this.f64638a.w(), "rebind_phone_click", "phone", wVar.getErrorCode());
        }
    }

    public static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64669a;

        static {
            Covode.recordClassIndex(39739);
        }

        public u(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64669a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            Integer valueOf = Integer.valueOf(wVar.getErrorCode());
            String x = this.f64669a.x();
            h.f.b.l.b(x, "");
            g.a.a(valueOf, x);
            d.a.a(1, wVar.getErrorCode(), "CheckEmail:" + wVar.getErrorMsg());
        }
    }

    public static final class ai<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64310a;

        static {
            Covode.recordClassIndex(39614);
        }

        public ai(com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64310a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            String x = this.f64310a.x();
            h.f.b.l.b(x, "");
            v.a(true, "email", "register", x);
            v.a(true, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64310a, ((com.bytedance.sdk.a.h.a.e) dVar.f43081j).f43265e, (Map) null, false, 48);
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64310a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64310a.V_();
            com.bytedance.sdk.a.n.a aVar = ((com.bytedance.sdk.a.h.a.e) dVar.f43081j).f43265e;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
            if (com.ss.android.ugc.aweme.account.util.p.a()) {
                com.ss.android.ugc.aweme.account.util.p.f65498a = null;
            }
        }
    }

    static final class aq<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64347c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64348d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64349e;

        static {
            Covode.recordClassIndex(39626);
        }

        aq(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
            this.f64345a = cVar;
            this.f64346b = str;
            this.f64347c = str2;
            this.f64348d = jVar;
            this.f64349e = kVar;
        }

        @Override // f.a.q
        public final void a(final f.a.o<com.ss.android.ugc.aweme.account.login.recover.a.b.a> oVar) {
            h.f.b.l.d(oVar, "");
            Context context = this.f64345a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64346b;
            String str2 = this.f64347c;
            AnonymousClass1 r2 = new com.ss.android.ugc.aweme.account.login.recover.a.a.a(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.x.aq.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ aq f64350c;

                static {
                    Covode.recordClassIndex(39627);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void e(com.ss.android.ugc.aweme.account.login.recover.a.b.a aVar) {
                    if (aVar != null) {
                        oVar.a(aVar);
                    } else {
                        oVar.a((Throwable) new w(-1, "no data", this.f64350c.f64348d, this.f64350c.f64349e, null, null, 32, null));
                    }
                }

                {
                    this.f64350c = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.a aVar, int i2) {
                    String str;
                    com.ss.android.ugc.aweme.account.login.recover.a.b.a aVar2 = aVar;
                    f.a.o oVar = oVar;
                    if (aVar2 != null) {
                        str = aVar2.f43075f;
                    } else {
                        str = null;
                    }
                    oVar.a((Throwable) new w(i2, str, this.f64350c.f64348d, this.f64350c.f64349e, null, null, 32, null));
                }
            };
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(r2, "");
            a.C1046a aVar = new a.C1046a();
            HashMap hashMap = new HashMap();
            hashMap.put("need_limit_platform", "0");
            hashMap.put("need_limit_os", "0");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("not_login_ticket", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    h.f.b.l.b();
                }
                hashMap.put("ticket", str2);
            }
            a.C1046a a2 = aVar.a(hashMap);
            h.f.b.l.b(a2, "");
            a2.f43153a = c.a.a("/passport/auth/available_ways/");
            com.bytedance.sdk.a.d.a c2 = a2.c();
            h.f.b.l.b(c2, "");
            new com.ss.android.ugc.aweme.account.login.recover.a.a(context, c2, r2).d();
        }
    }

    static final class ar<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64353b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64355d;

        static {
            Covode.recordClassIndex(39628);
        }

        ar(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
            this.f64352a = cVar;
            this.f64353b = str;
            this.f64354c = jVar;
            this.f64355d = kVar;
        }

        @Override // f.a.q
        public final void a(final f.a.o<com.ss.android.ugc.aweme.account.login.recover.a.b.c> oVar) {
            h.f.b.l.d(oVar, "");
            Context context = this.f64352a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64353b;
            AnonymousClass1 r3 = new com.ss.android.ugc.aweme.account.login.recover.a.a.c(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.x.ar.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ar f64356c;

                static {
                    Covode.recordClassIndex(39629);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void e(com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar) {
                    if (cVar != null) {
                        oVar.a(cVar);
                    } else {
                        oVar.a((Throwable) new w(-1, "no data", this.f64356c.f64354c, this.f64356c.f64355d, null, null, 32, null));
                    }
                }

                {
                    this.f64356c = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar, String str) {
                    com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar2 = cVar;
                    if (cVar2 != null) {
                        oVar.a((Throwable) new w(cVar2.f43073d, cVar2.f43075f, this.f64356c.f64354c, this.f64356c.f64355d, null, null, 32, null));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar, int i2) {
                    String str;
                    com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar2 = cVar;
                    f.a.o oVar = oVar;
                    if (cVar2 != null) {
                        str = cVar2.f43075f;
                    } else {
                        str = null;
                    }
                    oVar.a((Throwable) new w(i2, str, this.f64356c.f64354c, this.f64356c.f64355d, null, null, 32, null));
                }
            };
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(r3, "");
            a.C1046a aVar = new a.C1046a();
            HashMap hashMap = new HashMap();
            hashMap.put("not_login_ticket", str);
            a.C1046a a2 = aVar.a(hashMap);
            h.f.b.l.b(a2, "");
            a2.f43153a = "/passport/shark/safe_verify/";
            com.bytedance.sdk.a.d.a c2 = a2.c();
            h.f.b.l.b(c2, "");
            new com.ss.android.ugc.aweme.account.login.recover.a.d(context, c2, r3).d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class au<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f64372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64373c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f64374d;

        static {
            Covode.recordClassIndex(39635);
        }

        au(String str, h.f.a.b bVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, boolean z) {
            this.f64371a = str;
            this.f64372b = bVar;
            this.f64373c = cVar;
            this.f64374d = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            if (h.f.b.l.a((Object) this.f64371a, (Object) "phone")) {
                d.a.a(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            } else {
                d.a.a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            }
            h.f.a.b bVar = this.f64372b;
            if (bVar != null) {
                bVar.invoke(wVar);
            }
            v.a(false, wVar.getErrorCode(), this.f64371a, (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64373c, (Map) null, this.f64374d, 16);
        }
    }

    public static final class bl<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f64438c;

        static {
            Covode.recordClassIndex(39659);
        }

        public bl(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, boolean z) {
            this.f64436a = cVar;
            this.f64437b = str;
            this.f64438c = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.d.l lVar = (com.bytedance.sdk.a.a.d.l) obj;
            com.ss.android.ugc.aweme.account.n.e.a(com.ss.android.ugc.aweme.account.login.h.a.a(com.ss.android.ugc.aweme.account.login.v2.base.e.b(this.f64436a)), this.f64437b, "phone", this.f64436a, this.f64438c ? 1 : 0, "set_password");
            v.a(false, "sms_verification", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64436a, lVar.f43082j, (Map) null, this.f64438c, 16);
            String x = this.f64436a.x();
            h.f.b.l.b(x, "");
            v.a(true, "phone", "reset_password", x);
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64436a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64436a.V_();
            com.bytedance.sdk.a.n.a aVar = lVar.f43082j;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bx<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64498d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64499e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f64500f;

        static {
            Covode.recordClassIndex(39675);
        }

        bx(int i2, String str, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2, String str3) {
            this.f64495a = i2;
            this.f64496b = str;
            this.f64497c = kVar;
            this.f64498d = cVar;
            this.f64499e = str2;
            this.f64500f = str3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            f.a.a(1, this.f64495a, wVar.getErrorCode(), wVar.getMessage(), this.f64496b);
            if (this.f64497c == com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_SIGN_UP) {
                Integer valueOf = Integer.valueOf(wVar.getErrorCode());
                String x = this.f64498d.x();
                h.f.b.l.b(x, "");
                u.a.a(valueOf, x);
            } else if (this.f64497c == com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_LOGIN) {
                String x2 = this.f64498d.x();
                h.f.b.l.b(x2, "");
                t.a.a(false, x2);
            }
            v.a(wVar.getErrorCode(), this.f64499e, this.f64495a, "text", wVar.getErrorMsg(), this.f64500f);
        }
    }

    static final class ca<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64518c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64519d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64520e;

        static {
            Covode.recordClassIndex(39680);
        }

        ca(int i2, String str, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2) {
            this.f64516a = i2;
            this.f64517b = str;
            this.f64518c = kVar;
            this.f64519d = cVar;
            this.f64520e = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            f.a.a(1, this.f64516a, wVar.getErrorCode(), wVar.getMessage(), this.f64517b);
            if (this.f64518c == com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_SIGN_UP) {
                Integer valueOf = Integer.valueOf(wVar.getErrorCode());
                String x = this.f64519d.x();
                h.f.b.l.b(x, "");
                u.a.a(valueOf, x);
            } else if (this.f64518c == com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_LOGIN) {
                String x2 = this.f64519d.x();
                h.f.b.l.b(x2, "");
                t.a.a(false, x2);
            }
            v.a(wVar.getErrorCode(), this.f64520e, this.f64516a, "text", wVar.getErrorMsg(), (String) null);
        }
    }

    static final class ce<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64537c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64538d;

        static {
            Covode.recordClassIndex(39685);
        }

        ce(int i2, String str, String str2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64535a = i2;
            this.f64536b = str;
            this.f64537c = str2;
            this.f64538d = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.a(0, this.f64535a, 0, "");
            v.a(0, this.f64536b, this.f64535a, "voice", (String) null, this.f64537c);
            androidx.fragment.app.e activity = this.f64538d.getActivity();
            if (activity != null) {
                Boolean.valueOf(!activity.isFinishing());
            }
            androidx.fragment.app.e activity2 = this.f64538d.getActivity();
            if (activity2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity2, "");
            a.C0731a aVar = new a.C0731a(activity2);
            aVar.f33401a = activity2.getString(R.string.ar3, new Object[]{this.f64537c});
            aVar.a(R.string.asq, (DialogInterface.OnClickListener) null, false).a().c().setCancelable(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cg<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f64549a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64550b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64551c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64552d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64553e;

        static {
            Covode.recordClassIndex(39688);
        }

        cg(int i2, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            this.f64549a = i2;
            this.f64550b = kVar;
            this.f64551c = cVar;
            this.f64552d = str;
            this.f64553e = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            f.a.b(1, this.f64549a, wVar.getErrorCode(), wVar.getMessage());
            if (this.f64550b == com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_SIGN_UP) {
                Integer valueOf = Integer.valueOf(wVar.getErrorCode());
                String x = this.f64551c.x();
                h.f.b.l.b(x, "");
                u.a.a(valueOf, x);
            } else if (this.f64550b == com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_LOGIN) {
                String x2 = this.f64551c.x();
                h.f.b.l.b(x2, "");
                t.a.a(false, x2);
            }
            v.a(wVar.getErrorCode(), this.f64552d, this.f64549a, "whatsapp", wVar.getErrorMsg(), this.f64553e);
        }
    }

    public static final class cm<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f64571c;

        static {
            Covode.recordClassIndex(39696);
        }

        public cm(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, boolean z) {
            this.f64569a = cVar;
            this.f64570b = str;
            this.f64571c = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.d.l lVar = (com.bytedance.sdk.a.a.d.l) obj;
            com.ss.android.ugc.aweme.account.n.e.a(com.ss.android.ugc.aweme.account.login.v2.base.e.a(this.f64569a), this.f64570b, "email", this.f64569a, this.f64571c ? 1 : 0, "set_password");
            String x = this.f64569a.x();
            h.f.b.l.b(x, "");
            v.a(true, "email", "reset_password", x);
            v.a(false, "email", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f64569a, lVar.f43082j, (Map) null, this.f64571c, 16);
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64569a;
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SET_OR_RESET_PASSWORD;
            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64569a.V_();
            com.bytedance.sdk.a.n.a aVar = lVar.f43082j;
            h.f.b.l.b(aVar, "");
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, jVar, V_, aVar);
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64620b;

        static {
            Covode.recordClassIndex(39718);
        }

        public f(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
            this.f64619a = cVar;
            this.f64620b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            w wVar = (w) th;
            c.a.a(1, "bindPhone", wVar.getErrorCode(), wVar.getErrorMsg());
            com.ss.android.ugc.aweme.account.b.c.a(this.f64619a.w(), "mobile", wVar.getErrorCode(), wVar.getErrorMsg(), this.f64620b);
            com.ss.android.ugc.aweme.account.b.c.a(this.f64619a.w(), this.f64619a.x(), "phone", wVar.getErrorCode());
        }
    }

    public static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64684b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64685c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64686d;

        static {
            Covode.recordClassIndex(39745);
        }

        public y(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3) {
            this.f64683a = cVar;
            this.f64684b = str;
            this.f64685c = str2;
            this.f64686d = str3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.common.r.a("set_username_response", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f64683a.w()).a("enter_method", this.f64683a.x()).a("platform", this.f64684b).a("is_success", 1).a("origin_username", this.f64685c).a("result_username", this.f64686d).f62575a);
        }
    }

    public static int a(com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
        switch (y.f64688a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return com.ss.android.ugc.aweme.account.h.u;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return com.ss.android.ugc.aweme.account.h.f63041d;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return com.ss.android.ugc.aweme.account.h.f63045h;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return com.ss.android.ugc.aweme.account.h.z;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return com.ss.android.ugc.aweme.account.h.q;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return com.ss.android.ugc.aweme.account.h.f63050m;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return com.ss.android.ugc.aweme.account.h.s;
            case ABRConfig.ABR_SELECT_SCENE:
                return com.ss.android.ugc.aweme.account.h.s;
            default:
                return com.ss.android.ugc.aweme.account.h.u;
        }
    }

    static final class ap<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.C1417b f64339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64341d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64342e;

        static {
            Covode.recordClassIndex(39624);
        }

        ap(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, b.C1417b bVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str) {
            this.f64338a = cVar;
            this.f64339b = bVar;
            this.f64340c = jVar;
            this.f64341d = kVar;
            this.f64342e = str;
        }

        @Override // f.a.q
        public final void a(final f.a.o<com.ss.android.ugc.aweme.account.login.recover.a.b.b> oVar) {
            h.f.b.l.d(oVar, "");
            Context context = this.f64338a.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            b.C1417b bVar = this.f64339b;
            AnonymousClass1 r3 = new com.ss.android.ugc.aweme.account.login.recover.a.a.b(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.x.ap.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ap f64343c;

                static {
                    Covode.recordClassIndex(39625);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void e(com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar) {
                    if (bVar != null) {
                        oVar.a(bVar);
                    } else {
                        oVar.a((Throwable) new w(-1, "no data", this.f64343c.f64340c, this.f64343c.f64341d, null, null, 32, null));
                    }
                }

                {
                    this.f64343c = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar, String str) {
                    com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        oVar.a((Throwable) new w(bVar2.f43073d, bVar2.f43075f, this.f64343c.f64340c, this.f64343c.f64341d, null, null, 32, null));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar, int i2) {
                    String str;
                    com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar2 = bVar;
                    f.a.o oVar = oVar;
                    if (bVar2 != null) {
                        str = bVar2.f43075f;
                    } else {
                        str = null;
                    }
                    oVar.a((Throwable) new w(i2, str, this.f64343c.f64340c, this.f64343c.f64341d, null, null, 32, null));
                    com.ss.android.ugc.aweme.common.r.a("login_click_next_result", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", this.f64343c.f64342e).a("status", 0).a("error_code", i2).f62575a);
                }
            };
            h.f.b.l.d(context, "");
            h.f.b.l.d(r3, "");
            a.C1046a aVar = new a.C1046a();
            HashMap hashMap = new HashMap();
            hashMap.put("mix_mode", "1");
            if (bVar != null) {
                hashMap.put("find_way", String.valueOf(bVar.getFind_way()));
                int find_way = bVar.getFind_way();
                if (find_way == 0) {
                    if (bVar.getArea_code() != null) {
                        hashMap.put("area_code", bVar.getArea_code());
                    }
                    if (bVar.getMobile() != null) {
                        hashMap.put("mobile", bVar.getMobile());
                    }
                } else if (find_way != 1) {
                    if (find_way == 4 && bVar.getEmail() != null) {
                        hashMap.put("email", bVar.getEmail());
                    }
                } else if (bVar.getLogin_name() != null) {
                    hashMap.put("login_name", bVar.getLogin_name());
                }
            }
            a.C1046a a2 = aVar.a(hashMap);
            h.f.b.l.b(a2, "");
            a2.f43153a = "/passport/mobile/get_account/";
            new com.ss.android.ugc.aweme.account.login.recover.a.b(context, a2.c(), r3).d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$x  reason: collision with other inner class name */
    public static final class C1440x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64680b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f64681c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64682d;

        static {
            Covode.recordClassIndex(39744);
        }

        public C1440x(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, String str3) {
            this.f64679a = cVar;
            this.f64680b = str;
            this.f64681c = str2;
            this.f64682d = str3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            String str;
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f64679a.w()).a("enter_method", this.f64679a.x()).a("platform", this.f64680b).a("is_success", 0);
            boolean z = th instanceof w;
            if (z) {
                i2 = ((w) th).getErrorCode();
            } else {
                i2 = -1;
            }
            com.ss.android.ugc.aweme.account.a.b.a a3 = a2.a("error_code", i2);
            String str2 = "";
            if (!z) {
                str = th.getMessage();
            } else {
                str = str2;
            }
            com.ss.android.ugc.aweme.common.r.a("set_username_response", a3.a("error_desc", str).a("origin_username", this.f64681c).a("result_username", this.f64682d).f62575a);
            if (z) {
                w wVar = (w) th;
                if (wVar.getErrorCode() == 4 || wVar.getErrorCode() == 1337) {
                    androidx.fragment.app.e activity = this.f64679a.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64679a;
                int errorCode = wVar.getErrorCode();
                String message = th.getMessage();
                if (message != null) {
                    str2 = message;
                }
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(cVar, errorCode, str2, wVar.getScene(), wVar.getStep(), wVar.getExtra());
                return;
            }
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar2 = this.f64679a;
            String string = cVar2.getString(R.string.de8);
            h.f.b.l.b(string, str2);
            cVar2.a(0, string);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cf<T> implements f.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64539a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f64540b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64541c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f64542d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f64543e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f64544f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.j f64545g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.k f64546h;

        static {
            Covode.recordClassIndex(39686);
        }

        cf(String str, int i2, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str2, String str3, int i3, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
            this.f64539a = str;
            this.f64540b = i2;
            this.f64541c = cVar;
            this.f64542d = str2;
            this.f64543e = str3;
            this.f64544f = i3;
            this.f64545g = jVar;
            this.f64546h = kVar;
        }

        @Override // f.a.q
        public final void a(final f.a.o<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> oVar) {
            h.f.b.l.d(oVar, "");
            com.ss.android.ugc.aweme.common.r.a("send_whatsapp_code", new com.ss.android.ugc.aweme.account.a.b.a().a("send_method", this.f64539a).a("send_reason", this.f64540b).a("enter_method", this.f64541c.x()).a("enter_from", this.f64541c.w()).f62575a);
            Context context = this.f64541c.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            String str = this.f64542d;
            int i2 = this.f64540b;
            String str2 = this.f64543e;
            int i3 = this.f64544f;
            boolean a2 = com.ss.android.ugc.aweme.account.n.f.a(com.ss.android.ugc.aweme.a.f62426a);
            AnonymousClass1 r2 = new com.bytedance.sdk.a.h.b.a.l(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.x.cf.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ cf f64547c;

                static {
                    Covode.recordClassIndex(39687);
                }

                @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
                public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
                    e((com.bytedance.sdk.a.a.a.d) bVar);
                }

                @Override // com.bytedance.sdk.a.e
                public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar) {
                    if (dVar != null) {
                        oVar.a(dVar);
                    } else {
                        oVar.a((Throwable) new w(-1, "no data", this.f64547c.f64545g, this.f64547c.f64546h, null, null, 32, null));
                    }
                }

                {
                    this.f64547c = r1;
                }

                @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
                public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
                    a((com.bytedance.sdk.a.a.a.d) bVar, i2);
                }

                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                    com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) bVar;
                    h.f.b.l.d(dVar, "");
                    oVar.a((Throwable) new w(dVar.f43073d, dVar.f43075f, this.f64547c.f64545g, this.f64547c.f64546h, null, null, 32, null));
                }

                @Override // com.bytedance.sdk.a.e
                public final void a(com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n> dVar, int i2) {
                    String str;
                    String str2;
                    com.bytedance.sdk.a.h.a.n nVar;
                    JSONObject jSONObject;
                    JSONObject optJSONObject;
                    com.bytedance.sdk.a.h.a.n nVar2;
                    JSONObject jSONObject2 = new JSONObject();
                    if (dVar == null || (nVar2 = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (str = nVar2.f43305d) == null) {
                        str = "";
                    }
                    jSONObject2.put("next_url", str);
                    if (i2 == 2030) {
                        if (!(dVar == null || (nVar = (com.bytedance.sdk.a.h.a.n) dVar.f43081j) == null || (jSONObject = nVar.f43284m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                            jSONObject2.put("data", optJSONObject);
                        }
                        jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                    }
                    f.a.o oVar = oVar;
                    if (dVar != null) {
                        str2 = dVar.f43075f;
                    } else {
                        str2 = null;
                    }
                    oVar.a((Throwable) new w(i2, str2, this.f64547c.f64545g, this.f64547c.f64546h, jSONObject2, null, 32, null));
                }
            };
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d("", "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(r2, "");
            com.bytedance.sdk.a.h.a.n nVar = new com.bytedance.sdk.a.h.a.n(str, "", i2, str2, i3, a2 ? 1 : 0);
            a.C1046a aVar = new a.C1046a();
            HashMap hashMap = new HashMap();
            String c2 = com.bytedance.common.utility.m.c(nVar.f43302a);
            h.f.b.l.b(c2, "");
            hashMap.put("mobile", c2);
            if (!TextUtils.isEmpty(nVar.f43308g)) {
                String c3 = com.bytedance.common.utility.m.c(nVar.f43308g);
                h.f.b.l.b(c3, "");
                hashMap.put("old_mobile", c3);
            }
            String str3 = nVar.f43303b;
            h.f.b.l.b(str3, "");
            hashMap.put("captcha", str3);
            String c4 = com.bytedance.common.utility.m.c(String.valueOf(nVar.f43306e));
            h.f.b.l.b(c4, "");
            hashMap.put(StringSet.type, c4);
            String c5 = com.bytedance.common.utility.m.c(String.valueOf(nVar.f43307f));
            h.f.b.l.b(c5, "");
            hashMap.put("unbind_exist", c5);
            hashMap.put("mix_mode", "1");
            if (nVar.A == 1) {
                hashMap.put("check_register", "1");
            } else if (nVar.A == 0) {
                hashMap.put("check_register", "0");
            }
            if (!TextUtils.isEmpty(nVar.u)) {
                String str4 = nVar.u;
                h.f.b.l.b(str4, "");
                hashMap.put("ticket", str4);
            }
            hashMap.put("auto_read", String.valueOf(nVar.v));
            if (!TextUtils.isEmpty(nVar.w)) {
                String str5 = nVar.w;
                h.f.b.l.b(str5, "");
                hashMap.put("shark_ticket", str5);
            }
            if (!TextUtils.isEmpty(nVar.x)) {
                String str6 = nVar.x;
                h.f.b.l.b(str6, "");
                hashMap.put("unusable_mobile_ticket", str6);
            }
            a.C1046a a3 = aVar.a(hashMap);
            h.f.b.l.b(a3, "");
            a3.f43153a = c.a.a("/passport/mobile/send_whatsapp_code/");
            com.bytedance.sdk.a.d.a c6 = a3.c();
            h.f.b.l.b(c6, "");
            new com.ss.android.ugc.aweme.account.api.a.a(context, c6, nVar, r2).d();
        }
    }

    public static /* synthetic */ f.a.n a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        f.a.n b2 = f.a.n.a((f.a.q) new ci(cVar, str)).d(new cj(cVar, str)).b(new ck(cVar));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.d.o> b(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, int i2, Map<String, String> map) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        f.a.n a2 = f.a.n.a((f.a.q) new cw(cVar, map, i2, str));
        h.f.b.l.b(a2, "");
        return z.a(cVar, a2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.f> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, int i2, Map<String, String> map) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        f.a.n b2 = f.a.n.a((f.a.q) new cq(cVar, map, str, i2)).d(new cr(cVar)).b(new cs(cVar));
        h.f.b.l.b(b2, "");
        return z.a(cVar, b2);
    }

    public static f.a.n<com.ss.android.ugc.aweme.account.login.recover.a.b.c> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        f.a.n a2 = f.a.n.a((f.a.q) new ar(cVar, str, jVar, kVar));
        h.f.b.l.b(a2, "");
        return z.a(cVar, a2);
    }

    public static f.a.n<com.ss.android.ugc.aweme.account.login.recover.a.b.b> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, b.C1417b bVar, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str, "");
        f.a.n a2 = f.a.n.a((f.a.q) new ap(cVar, bVar, jVar, kVar, str));
        h.f.b.l.b(a2, "");
        return z.a(cVar, a2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> b(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str2, "");
        int a2 = a(kVar);
        f.a.n d2 = f.a.n.a((f.a.q) new cc(a2, str2, jVar, kVar, cVar, str)).b(new cd(a2, str2, str)).d(new ce(a2, str2, str, cVar));
        h.f.b.l.b(d2, "");
        return z.a(cVar, d2);
    }

    public static f.a.n<com.ss.android.ugc.aweme.account.login.recover.a.b.a> b(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        f.a.n a2 = f.a.n.a((f.a.q) new aq(cVar, str, str2, jVar, kVar));
        h.f.b.l.b(a2, "");
        return z.a(cVar, a2);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> b(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, com.ss.android.ugc.aweme.account.login.v2.base.j jVar, com.ss.android.ugc.aweme.account.login.v2.base.k kVar, String str2, String str3, String str4) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        int a2 = a(jVar);
        int a3 = a(kVar);
        f.a.n d2 = f.a.n.a((f.a.q) new bz(str3, a3, cVar, jVar, kVar, str, str2, a2)).b(new ca(a3, str4, kVar, cVar, str3)).d(new cb(a3, str4, str3));
        h.f.b.l.b(d2, "");
        return z.a(cVar, d2);
    }

    public static /* synthetic */ f.a.n a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, int i2, String str2, Map map, String str3, int i3) {
        Map map2 = map;
        String str4 = null;
        if ((i3 & 16) != 0) {
            map2 = null;
        }
        if ((i3 & 32) == 0) {
            str4 = str3;
        }
        return a(cVar, str, i2, str2, map2, str4, (Integer) null);
    }

    public static f.a.n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.g>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, int i2, String str2, Map<String, String> map, String str3, Integer num) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        f.a.n d2 = f.a.n.a((f.a.q) new bq(str2, cVar, i2, map, num, str, str3)).b(new br(str2, i2)).d(new bs(str2, i2));
        h.f.b.l.b(d2, "");
        return z.a(cVar, d2);
    }
}
