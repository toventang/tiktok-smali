package com.ss.android.ugc.aweme.setting.unit.privacy;

import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.dc.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class f extends h implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final a f123014c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f123015a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.page.a f123016b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f123017d = i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f123018e = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(80778);
    }

    public final FindCtxViewModel e() {
        return (FindCtxViewModel) this.f123017d.getValue();
    }

    public final androidx.fragment.app.e f() {
        return (androidx.fragment.app.e) this.f123018e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80779);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    static final class b extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(80780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            return this.this$0.f123016b.requireActivity();
        }
    }

    static final class e extends m implements h.f.a.a<FindCtxViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(80783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FindCtxViewModel invoke() {
            ac a2 = ae.a(this.this$0.f123016b, (ad.b) null).a(FindCtxViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        boolean z = e().f122960a;
        String string = f().getString(R.string.gbi);
        l.b(string, "");
        return new com.ss.android.ugc.aweme.be.h(z, string, this, false, null, null, this, null, f().getString(R.string.gbh), false, 15288);
    }

    public f(com.ss.android.ugc.aweme.setting.page.a aVar) {
        l.d(aVar, "");
        this.f123016b = aVar;
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f123019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f123020b;

        static {
            Covode.recordClassIndex(80781);
        }

        c(androidx.fragment.app.e eVar, f fVar) {
            this.f123019a = eVar;
            this.f123020b = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.SYNC_STATUS && !dVar.f141690b.f141691a) {
                l.b(dVar, "");
                c cVar = new c(dVar, "contact");
                FindCtxViewModel e2 = this.f123020b.e();
                if (e2 != null) {
                    e2.a(cVar);
                }
                this.f123020b.f123015a.a();
            } else if (dVar.f141689a == g.SYNC_STATUS && dVar.f141690b.f141693c != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f123020b.f()).a(R.string.bpa).a();
                this.f123020b.f123015a.a();
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f123021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f123022b;

        static {
            Covode.recordClassIndex(80782);
        }

        d(androidx.fragment.app.e eVar, f fVar) {
            this.f123021a = eVar;
            this.f123022b = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.SYNC_STATUS && dVar.f141690b.f141691a) {
                l.b(dVar, "");
                c cVar = new c(dVar, "contact");
                FindCtxViewModel e2 = this.f123022b.e();
                if (e2 != null) {
                    e2.a(cVar);
                }
                this.f123022b.f123015a.a();
            } else if (dVar.f141689a == g.SYNC_STATUS && dVar.f141690b.f141693c != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f123022b.f()).a(R.string.bpa).a();
                this.f123022b.f123015a.a();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        if (com.ss.android.ugc.aweme.setting.page.privacy.a.a.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(f()).a(R.string.fbu).a();
        } else if (((com.ss.android.ugc.aweme.be.h) l()).f68599c) {
            com.ss.android.ugc.aweme.setting.h.a.b(1);
            androidx.fragment.app.e f2 = f();
            if (f2 != null) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                String uid = curUser.getUid();
                if (uid != null) {
                    l.b(f2, "");
                    f.a.b.b d2 = com.ss.android.ugc.aweme.ufr.b.b(f2, com.ss.android.ugc.aweme.friends.service.a.f97047a.c(), uid, "privacy_setting", "click").d(new c(f2, this));
                    l.b(d2, "");
                    f.a.j.a.a(d2, this.f123015a);
                }
            }
        } else {
            com.ss.android.ugc.aweme.setting.h.a.a(1);
            androidx.fragment.app.e f3 = f();
            if (f3 != null) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                User curUser2 = g3.getCurUser();
                l.b(curUser2, "");
                String uid2 = curUser2.getUid();
                if (uid2 != null) {
                    l.b(f3, "");
                    f.a.b.b d3 = com.ss.android.ugc.aweme.ufr.b.a(f3, com.ss.android.ugc.aweme.friends.service.a.f97047a.c(), uid2, "privacy_setting", "click", true).d(new d(f3, this));
                    l.b(d3, "");
                    f.a.j.a.a(d3, this.f123015a);
                }
            }
        }
    }
}
