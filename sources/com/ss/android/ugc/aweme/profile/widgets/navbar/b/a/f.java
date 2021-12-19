package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.c.d;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.i;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class f extends i {

    /* renamed from: h  reason: collision with root package name */
    public static final a f117984h = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f117985i = h.i.a((h.f.a.a) c.f117987a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f117986j = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(76514);
    }

    private final com.ss.android.ugc.aweme.profile.e.a w() {
        return (com.ss.android.ugc.aweme.profile.e.a) this.f117985i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76515);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f117988a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f117989b;

            static {
                Covode.recordClassIndex(76521);
            }

            a(User user, e eVar) {
                this.f117988a = user;
                this.f117989b = eVar;
            }

            public final void run() {
                this.f117989b.this$0.c(this.f117988a);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            View t2;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || (t2 = this.this$0.t()) == null)) {
                t2.post(new a(t, this));
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<androidx.fragment.app.i> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.i invoke() {
            Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this.this$0);
            if (a2 != null) {
                return a2.getFragmentManager();
            }
            return null;
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f117987a = new c();

        static {
            Covode.recordClassIndex(76517);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.profile.e.a invoke() {
            return new com.ss.android.ugc.aweme.profile.e.a("personal_homepage", "unfold_triangle");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f117991b;

        static {
            Covode.recordClassIndex(76524);
        }

        g(f fVar, int i2) {
            this.f117990a = fVar;
            this.f117991b = i2;
        }

        public final void run() {
            if (this.f117991b > 0) {
                this.f117990a.a(true);
            } else {
                this.f117990a.a(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.i, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), g.f117993a, new d(this));
        User c2 = in.c();
        if (c2 != null) {
            c(c2);
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), h.f117994a, new e(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void v() {
        MethodCollector.i(8642);
        String str = "profile_choose_account_dialog " + w().f116064a;
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.f117986j.getValue();
        if (iVar != null) {
            Fragment a2 = iVar.a(str);
            if (a2 == null || !a2.isAdded()) {
                d.a.a(iVar, w(), str);
                MethodCollector.o(8642);
                return;
            }
            MethodCollector.o(8642);
            return;
        }
        MethodCollector.o(8642);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.g gVar) {
        com.bytedance.tux.navigation.a.g gVar2 = gVar;
        l.d(gVar2, "");
        gVar2.a("");
    }

    static final class d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            final T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            this.this$0.a(new h.f.a.b<com.bytedance.tux.navigation.a.g, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(76519);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.g gVar) {
                    com.bytedance.tux.navigation.a.g gVar2 = gVar;
                    l.d(gVar2, "");
                    gVar2.a(f.a(t)).b(f.b(t));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f$f  reason: collision with other inner class name */
    public static final class C3010f extends m implements h.f.a.b<com.bytedance.tux.navigation.a.g, z> {
        final /* synthetic */ User $user;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3010f(f fVar, User user) {
            super(1);
            this.this$0 = fVar;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.g gVar) {
            com.bytedance.tux.navigation.a.g gVar2 = gVar;
            l.d(gVar2, "");
            gVar2.f45209c = R.raw.icon_chevron_down_fill;
            gVar2.a(f.a(this.$user)).b(f.b(this.$user)).a((h.f.a.a<z>) new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.f.C3010f.AnonymousClass1 */
                final /* synthetic */ C3010f this$0;

                static {
                    Covode.recordClassIndex(76523);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    f fVar = this.this$0.this$0;
                    bo b2 = com.ss.android.ugc.aweme.account.b.b();
                    l.b(b2, "");
                    if (b2.isEnableMultiAccountLogin()) {
                        fVar.v();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<com.bytedance.tux.navigation.a.g, z> {
        final /* synthetic */ User $user;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, User user) {
            super(1);
            this.this$0 = fVar;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.g gVar) {
            com.bytedance.tux.navigation.a.g gVar2 = gVar;
            l.d(gVar2, "");
            gVar2.f45209c = 0;
            com.bytedance.tux.navigation.a.g b2 = gVar2.a(f.a(this.$user)).b(f.b(this.$user));
            b2.f45209c = 0;
            b2.a((h.f.a.a<z>) AnonymousClass1.f117992a);
            return z.f158842a;
        }
    }

    public final void c(User user) {
        int a2;
        bo b2 = com.ss.android.ugc.aweme.account.b.b();
        l.b(b2, "");
        if (b2.isEnableMultiAccountLogin()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            List<String> allUidList = com.ss.android.ugc.aweme.account.b.g().allUidList();
            l.b(allUidList, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) allUidList, 10));
            for (T t : allUidList) {
                if (l.a((Object) curUserId, (Object) t)) {
                    a2 = 0;
                } else {
                    l.b(t, "");
                    a2 = com.ss.android.ugc.aweme.notice.api.b.a(t);
                }
                arrayList.add(Integer.valueOf(a2));
            }
            int u = n.u(arrayList);
            a(new C3010f(this, user));
            View t2 = t();
            if (t2 != null) {
                t2.post(new g(this, u));
                return;
            }
            return;
        }
        a(new h(this, user));
        a(false);
    }
}
