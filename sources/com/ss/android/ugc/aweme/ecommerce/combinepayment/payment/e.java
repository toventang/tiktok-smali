package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.j;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.s;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.v;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.i;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final String f85364h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f85365i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public j f85366a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f85367b;

    /* renamed from: c  reason: collision with root package name */
    public final String f85368c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f85369d;

    /* renamed from: e  reason: collision with root package name */
    public final String f85370e;

    /* renamed from: f  reason: collision with root package name */
    public final String f85371f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, Object> f85372g;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f85373j = i.a((h.f.a.a) new c(this));

    public final com.ss.android.ugc.aweme.views.i a() {
        return (com.ss.android.ugc.aweme.views.i) this.f85373j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53394);
        }

        private a() {
        }

        public static m a() {
            return new m(e.f85364h, "0", 915455);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f85382a;

        static {
            Covode.recordClassIndex(53402);
        }

        public f(e eVar) {
            this.f85382a = eVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f85382a.b();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(53396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0.f85367b);
        }
    }

    public final void b() {
        try {
            a().dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static {
        Covode.recordClassIndex(53393);
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        f85364h = uuid;
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f85384a;

        static {
            Covode.recordClassIndex(53406);
        }

        public h(e eVar) {
            this.f85384a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f85384a.a((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f85374a;

        static {
            Covode.recordClassIndex(53395);
        }

        b(e eVar) {
            this.f85374a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.views.i a2 = this.f85374a.a();
            a2.setCanceledOnTouchOutside(false);
            a2.show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e$e  reason: collision with other inner class name */
    static final class C2041e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f85380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85381b;

        static {
            Covode.recordClassIndex(53401);
        }

        C2041e(e eVar, h.f.a.a aVar) {
            this.f85380a = eVar;
            this.f85381b = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f85380a.b();
            this.f85380a.a((String) null);
            this.f85381b.invoke();
        }
    }

    public final t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<j>>> a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.i iVar) {
        l.d(iVar, "");
        return ((PaymentApi) PaymentApi.a.f85242a.a(PaymentApi.class)).pay(iVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c(new b(this));
    }

    public final void a(String str) {
        Resources resources;
        if (str != null || ((resources = this.f85367b.getResources()) != null && (str = resources.getString(R.string.fy7)) != null)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f85367b).a(str).a();
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f85383a;

        static {
            Covode.recordClassIndex(53403);
        }

        public g(e eVar) {
            this.f85383a = eVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<n, z> {
            final /* synthetic */ r $it;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(53404);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, g gVar) {
                super(1);
                this.$it = rVar;
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(n nVar) {
                Object obj;
                String c2;
                n nVar2 = nVar;
                String str = "";
                l.d(nVar2, str);
                String str2 = null;
                if (nVar2.f85328a != null) {
                    e eVar = this.this$0.f85383a;
                    AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e.g.a.AnonymousClass1 */
                        final /* synthetic */ a this$0;

                        static {
                            Covode.recordClassIndex(53405);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            this.this$0.$it.dismissAllowingStateLoss();
                            return z.f158842a;
                        }
                    };
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.i iVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.i(eVar.f85368c, eVar.f85369d, true, d.a(nVar2, false), w.a(null, null, eVar.f85370e, nVar2, eVar.f85372g), w.a(eVar.f85370e, nVar2, eVar.f85372g), a.a());
                    HashMap<String, Object> hashMap = eVar.f85372g;
                    if (hashMap != null) {
                        obj = hashMap.get("previous_page");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = obj;
                    }
                    String str3 = str2;
                    if (str3 == null) {
                        str3 = str;
                    }
                    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<j>>> a2 = eVar.a(iVar);
                    if (a2 != null) {
                        p[] pVarArr = new p[2];
                        pVarArr[0] = v.a("order_id", String.valueOf(eVar.f85369d));
                        o oVar = nVar2.f85329b;
                        if (!(oVar == null || (c2 = oVar.c()) == null)) {
                            str = c2;
                        }
                        pVarArr[1] = v.a("pay_type", str);
                        t a3 = com.ss.android.ugc.aweme.ecommerce.track.b.a(a2, str3, pVarArr);
                        if (a3 != null) {
                            a3.a(new d(eVar, r3, nVar2), new C2041e(eVar, r3));
                        }
                    }
                } else {
                    this.this$0.f85383a.a((String) null);
                    this.$it.dismissAllowingStateLoss();
                }
                return z.f158842a;
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            r rVar;
            List<s> list;
            T t = ((u) obj).f42630b;
            this.f85383a.f85366a = t.data;
            if (!t.isCodeOK() || this.f85383a.f85366a == null) {
                this.f85383a.a(t.message);
                return;
            }
            r rVar2 = new r();
            Integer valueOf = Integer.valueOf(c.a.PAY_NOW.ordinal());
            j jVar = this.f85383a.f85366a;
            Address address = null;
            if (jVar != null) {
                rVar = jVar.f85324e;
            } else {
                rVar = null;
            }
            String str = this.f85383a.f85371f;
            j jVar2 = this.f85383a.f85366a;
            if (jVar2 != null) {
                list = jVar2.f85325f;
            } else {
                list = null;
            }
            j jVar3 = this.f85383a.f85366a;
            if (jVar3 != null) {
                address = jVar3.f85323d;
            }
            rVar2.a(new c(null, null, valueOf, rVar, str, false, null, this.f85383a.f85372g, list, address, 96));
            rVar2.a(new a(rVar2, this));
            Context context = this.f85383a.f85367b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) context).getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            rVar2.show(supportFragmentManager, "payment_fragment");
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f85375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85376b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f85377c;

        static {
            Covode.recordClassIndex(53397);
        }

        d(e eVar, h.f.a.a aVar, n nVar) {
            this.f85375a = eVar;
            this.f85376b = aVar;
            this.f85377c = nVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.google.gson.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f fVar;
            final T t = ((u) obj).f42630b;
            this.f85375a.f85366a = t.data;
            if (!t.isCodeOK() || this.f85375a.f85366a == null) {
                this.f85375a.a().dismiss();
                T t2 = t.data;
                if (t2 == null || t2.f85326g == null) {
                    this.f85375a.a(t.message);
                    this.f85376b.invoke();
                    return;
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d.a(this.f85375a.f85367b, String.valueOf(t.code), t.data.f85326g, true, AnonymousClass1.f85378a, this.f85376b, null, null, null, new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e.d.AnonymousClass2 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(53399);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        RedirectContent redirectContent;
                        ExceptionUX exceptionUX = t.data.f85326g;
                        if (!(exceptionUX == null || (redirectContent = exceptionUX.getRedirectContent()) == null)) {
                            String jumpSchema = redirectContent.getJumpSchema();
                            if (jumpSchema != null) {
                                Uri.Builder buildUpon = Uri.parse(jumpSchema).buildUpon();
                                buildUpon.appendQueryParameter("source", this.this$0.f85375a.f85370e);
                                buildUpon.appendQueryParameter("trackParams", dg.a().b(this.this$0.f85375a.f85372g));
                                SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), buildUpon.toString()).open();
                            }
                            if (l.a((Object) redirectContent.getClosePage(), (Object) true)) {
                                this.this$0.f85376b.invoke();
                            }
                        }
                        return z.f158842a;
                    }
                });
                return;
            }
            v.a aVar = new v.a(this.f85375a.f85367b);
            aVar.f85449b = this.f85375a.f85369d;
            aVar.f85450c = this.f85375a.f85368c;
            j jVar = this.f85375a.f85366a;
            if (!(jVar == null || (fVar = jVar.f85322c) == null)) {
                aVar.f85452e = fVar;
            }
            aVar.f85457j = this.f85375a.f85370e;
            j jVar2 = this.f85375a.f85366a;
            if (!(jVar2 == null || (oVar = jVar2.f85320a) == null)) {
                aVar.f85454g = oVar;
            }
            aVar.f85455h = this.f85377c;
            aVar.a(this.f85375a.f85372g).f85453f = new u(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e.d.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f85379a;

                static {
                    Covode.recordClassIndex(53400);
                }

                @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.u
                public final void b() {
                }

                @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.u
                public final void a() {
                    this.f85379a.f85375a.b();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f85379a = r1;
                }
            };
            w.a(aVar.a());
            this.f85376b.invoke();
        }
    }

    public e(Context context, String str, List<String> list, String str2, String str3, HashMap<String, Object> hashMap) {
        l.d(context, "");
        this.f85367b = context;
        this.f85368c = str;
        this.f85369d = list;
        this.f85370e = str2;
        this.f85371f = str3;
        this.f85372g = hashMap;
    }
}
