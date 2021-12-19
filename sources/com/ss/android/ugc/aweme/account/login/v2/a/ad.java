package com.ss.android.ugc.aweme.account.login.v2.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.n.e;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.d.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f64203a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.m.a<d> f64204b;

    /* renamed from: c  reason: collision with root package name */
    private final h f64205c = i.a((h.f.a.a) a.f64208a);

    /* renamed from: d  reason: collision with root package name */
    private final h f64206d = i.a((h.f.a.a) b.f64209a);

    /* renamed from: e  reason: collision with root package name */
    private final g<String, org.a.b<d>> f64207e = f.f64215a;

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f64213a = new d();

        static {
            Covode.recordClassIndex(39558);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f64214a = new e();

        static {
            Covode.recordClassIndex(39559);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39553);
    }

    private final HashMap<String, String> c() {
        return (HashMap) this.f64205c.getValue();
    }

    public final HashMap<String, String> a() {
        return (HashMap) this.f64206d.getValue();
    }

    static final class a extends m implements h.f.a.a<HashMap<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f64208a = new a();

        static {
            Covode.recordClassIndex(39554);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            return new HashMap();
        }
    }

    static final class b extends m implements h.f.a.a<HashMap<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64209a = new b();

        static {
            Covode.recordClassIndex(39555);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            return new HashMap();
        }
    }

    public final void b() {
        f.a.m.a<d> aVar = this.f64204b;
        if (aVar != null && !aVar.isDisposed()) {
            f.a.m.a<d> aVar2 = this.f64204b;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.dispose();
        }
        f.a.b.b bVar = this.f64203a;
        if (bVar != null && !bVar.isDisposed()) {
            f.a.b.b bVar2 = this.f64203a;
            if (bVar2 == null) {
                l.b();
            }
            bVar2.dispose();
        }
    }

    static final class f<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f64215a = new f();

        static {
            Covode.recordClassIndex(39560);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b() {
                /* class com.ss.android.ugc.aweme.account.login.v2.a.ad.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(39561);
                }

                @Override // org.a.b
                public final void a_(org.a.c<? super d> cVar) {
                    Object a2 = NetworkProxyAccount.f65195b.a().a(str, (Class) d.class);
                    if (a2 == null) {
                        a2 = new d();
                    }
                    cVar.onNext(a2);
                }
            };
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c f64211b;

        static {
            Covode.recordClassIndex(39556);
        }

        public c(String str, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            this.f64210a = str;
            this.f64211b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            f fVar = (f) obj;
            String str2 = this.f64210a;
            e eVar = fVar.f64239b;
            if (eVar != null) {
                str = eVar.f64237c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                e eVar2 = fVar.f64239b;
                if (eVar2 == null) {
                    l.b();
                }
                str2 = eVar2.f64237c;
                if (str2 == null) {
                    l.b();
                }
            }
            com.ss.android.ugc.aweme.user.e.f142364k.b(str2);
            User b2 = com.ss.android.ugc.aweme.user.e.f142364k.b();
            if (b2 != null) {
                b2.setNicknameUpdateReminder(false);
            }
            IAccountUserService e2 = cj.f71084b.e();
            l.b(e2, "");
            if (!e2.isChildrenMode()) {
                com.bytedance.sdk.a.e.a a2 = com.ss.android.ugc.aweme.account.n.e.a();
                if (a2 == null) {
                    Bundle arguments = this.f64211b.getArguments();
                    if (arguments == null) {
                        l.b();
                    }
                    arguments.putInt("next_page", k.FINISH.getValue());
                    com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64211b;
                    Bundle arguments2 = cVar.getArguments();
                    if (arguments2 == null) {
                        l.b();
                    }
                    l.b(arguments2, "");
                    cVar.a(arguments2);
                    return;
                }
                Bundle arguments3 = this.f64211b.getArguments();
                if (arguments3 != null) {
                    arguments3.putString("gms_store_platform", com.ss.android.ugc.aweme.account.n.e.f65166a);
                }
                com.ss.android.ugc.aweme.account.n.e.a(this.f64211b.getActivity(), this.f64211b.getArguments(), new e.a(this) {
                    /* class com.ss.android.ugc.aweme.account.login.v2.a.ad.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f64212a;

                    static {
                        Covode.recordClassIndex(39557);
                    }

                    @Override // com.ss.android.ugc.aweme.account.n.e.a
                    public final void a() {
                        Bundle arguments = this.f64212a.f64211b.getArguments();
                        if (arguments == null) {
                            l.b();
                        }
                        arguments.putInt("next_page", k.FINISH.getValue());
                        com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.f64212a.f64211b;
                        Bundle arguments2 = this.f64212a.f64211b.getArguments();
                        if (arguments2 == null) {
                            l.b();
                        }
                        l.b(arguments2, "");
                        cVar.a(arguments2);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f64212a = r1;
                    }
                }, a2);
                if (com.ss.android.ugc.aweme.account.login.v2.ui.a.g.f64825b) {
                    com.ss.android.ugc.aweme.compliance.api.a.s().b("email_consent");
                    return;
                }
                return;
            }
            Bundle arguments4 = this.f64211b.getArguments();
            if (arguments4 == null) {
                l.b();
            }
            arguments4.putInt("next_page", k.FINISH.getValue());
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar2 = this.f64211b;
            Bundle arguments5 = cVar2.getArguments();
            if (arguments5 == null) {
                l.b();
            }
            l.b(arguments5, "");
            cVar2.a(arguments5);
        }
    }

    public final void a(String str, f.a.m.a<d> aVar) {
        l.d(str, "");
        l.d(aVar, "");
        b();
        this.f64204b = aVar;
        c().put("unique_id", str);
        NetworkProxyAccount.f65195b.c("/aweme/v1/unique/id/check/", c()).a(this.f64207e).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a((f.a.l<? super R>) aVar);
    }
}
