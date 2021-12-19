package com.ss.android.ugc.aweme.account.agegate.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.agegate.c.b;
import com.ss.android.ugc.aweme.account.login.u;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import f.a.d.k;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f62730a = new b();

    /* renamed from: b  reason: collision with root package name */
    f.a.b.b f62731b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f62732c;

    /* renamed from: d  reason: collision with root package name */
    f.a.b.b f62733d;

    /* renamed from: e  reason: collision with root package name */
    f.a.l.c<String> f62734e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f62735f;

    /* renamed from: g  reason: collision with root package name */
    public final g f62736g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f62737h;

    /* renamed from: i  reason: collision with root package name */
    public final String f62738i;

    /* renamed from: j  reason: collision with root package name */
    public final String f62739j;

    static {
        Covode.recordClassIndex(38647);
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c cVar = this.this$0;
            cVar.f62736g.i();
            cVar.f62736g.a(true);
            cVar.f62736g.a((List<String>) null);
            return z.f158842a;
        }
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62741a = new b();

        static {
            Covode.recordClassIndex(38649);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            return hk.a(str);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62744a;

        static {
            Covode.recordClassIndex(38652);
        }

        e(c cVar) {
            this.f62744a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f62744a.f62736g.a(null, Integer.valueOf((int) R.string.bpc));
        }
    }

    static final class g extends m implements h.f.a.b<String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            c cVar = this.this$0;
            cVar.f62736g.a(Integer.valueOf((int) R.string.da_), null);
            u.a(false, cVar.f62738i, cVar.f62739j, cVar.f62735f);
            return z.f158842a;
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62740a;

        static {
            Covode.recordClassIndex(38648);
        }

        a(c cVar) {
            this.f62740a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.b.b bVar;
            this.f62740a.f62736g.a(false);
            f.a.b.b bVar2 = this.f62740a.f62732c;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f62740a.f62732c) == null)) {
                bVar.dispose();
            }
            this.f62740a.f62735f = false;
            this.f62740a.f62736g.b(false);
        }
    }

    static final class f extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            c cVar = this.this$0;
            if (booleanValue) {
                cVar.f62736g.e();
            } else {
                cVar.f62736g.g();
            }
            u.a(true, cVar.f62738i, cVar.f62739j, cVar.f62735f);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.c$c  reason: collision with other inner class name */
    static final class C1380c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62742a;

        static {
            Covode.recordClassIndex(38650);
        }

        C1380c(c cVar) {
            this.f62742a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            c cVar = this.f62742a;
            l.b(str, "");
            cVar.f62736g.b(true);
            h hVar = new h(cVar);
            i iVar = new i(cVar);
            l.d(str, "");
            l.d(hVar, "");
            l.d(iVar, "");
            new com.bytedance.sdk.a.f.i(com.ss.android.account.f.a().b()).a("/passport/login_name/check/", ag.a(v.a("login_name", str)), new b.f(str, iVar, hVar));
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62743a;

        static {
            Covode.recordClassIndex(38651);
        }

        d(c cVar) {
            this.f62743a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.d dVar = (b.d) obj;
            if (dVar instanceof b.d.C1379b) {
                c cVar = this.f62743a;
                f fVar = new f(cVar);
                g gVar = new g(cVar);
                l.d(fVar, "");
                l.d(gVar, "");
                cj.f71084b.e().getSetPasswordStatus(new b.h(fVar, gVar));
            } else if (dVar instanceof b.d.a) {
                u.a(false, this.f62743a.f62738i, this.f62743a.f62739j, this.f62743a.f62735f);
                this.f62743a.f62736g.b(((b.d.a) dVar).f62716b);
            }
        }
    }

    static final class i extends m implements h.f.a.m<List<? extends String>, String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.account.agegate.c.g */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(List<? extends String> list, String str) {
            List<? extends String> list2 = list;
            String str2 = str;
            c cVar = this.this$0;
            int i2 = 0;
            cVar.f62736g.a(false);
            cVar.f62736g.a((List<String>) list2);
            cVar.f62736g.b(false);
            if (hk.a(str2)) {
                cVar.f62736g.b(str2);
            } else {
                cVar.f62736g.a(null, Integer.valueOf((int) R.string.bpc));
            }
            if (str2 == null) {
                str2 = "network error";
            }
            if (list2 != null && !list2.isEmpty()) {
                i2 = 1;
            }
            r.a("show_create_account_error", new com.ss.android.ugc.aweme.account.a.b.a().a("error_desc", str2).a("show_suggest", i2).f62575a);
            return z.f158842a;
        }
    }

    public c(g gVar, boolean z, String str, String str2) {
        l.d(gVar, "");
        l.d(str, "");
        l.d(str2, "");
        this.f62736g = gVar;
        this.f62737h = z;
        this.f62738i = str;
        this.f62739j = str2;
        f.a.l.c<String> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f62734e = cVar;
    }
}
