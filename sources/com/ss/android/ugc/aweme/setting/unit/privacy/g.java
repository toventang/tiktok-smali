package com.ss.android.ugc.aweme.setting.unit.privacy;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.dc.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class g extends h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f123023a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.page.a f123024b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f123025c = i.a((h.f.a.a) new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f123026d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(80784);
    }

    public final FindCtxViewModel e() {
        return (FindCtxViewModel) this.f123025c.getValue();
    }

    public final e f() {
        return (e) this.f123026d.getValue();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    static final class a extends m implements h.f.a.a<e> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(80785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return this.this$0.f123024b.requireActivity();
        }
    }

    static final class d extends m implements h.f.a.a<FindCtxViewModel> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(80788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FindCtxViewModel invoke() {
            ac a2 = ae.a(this.this$0.f123024b, (ad.b) null).a(FindCtxViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        boolean z = e().f122961b;
        String string = f().getString(R.string.fs_);
        l.b(string, "");
        return new com.ss.android.ugc.aweme.be.h(z, string, this, false, null, null, this, null, f().getString(R.string.fs9), false, 15288);
    }

    public g(com.ss.android.ugc.aweme.setting.page.a aVar) {
        l.d(aVar, "");
        this.f123024b = aVar;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f123028b;

        static {
            Covode.recordClassIndex(80786);
        }

        b(e eVar, g gVar) {
            this.f123027a = eVar;
            this.f123028b = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && !dVar.f141690b.f141691a) {
                l.b(dVar, "");
                c cVar = new c(dVar, "facebook");
                FindCtxViewModel e2 = this.f123028b.e();
                if (e2 != null) {
                    e2.a(cVar);
                }
                this.f123028b.f123023a.a();
            } else if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && dVar.f141690b.f141693c != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f123028b.f()).a(R.string.bpa).a();
                this.f123028b.f123023a.a();
            }
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f123030b;

        static {
            Covode.recordClassIndex(80787);
        }

        c(e eVar, g gVar) {
            this.f123029a = eVar;
            this.f123030b = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && dVar.f141690b.f141691a) {
                l.b(dVar, "");
                c cVar = new c(dVar, "facebook");
                FindCtxViewModel e2 = this.f123030b.e();
                if (e2 != null) {
                    e2.a(cVar);
                }
                this.f123030b.f123023a.a();
            } else if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && dVar.f141690b.f141693c != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f123030b.f()).a(R.string.bpa).a();
                this.f123030b.f123023a.a();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        if (com.ss.android.ugc.aweme.setting.page.privacy.a.a.b()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(f()).a(R.string.fbu).a();
        } else if (((com.ss.android.ugc.aweme.be.h) l()).f68599c) {
            com.ss.android.ugc.aweme.setting.h.a.b(2);
            e f2 = f();
            if (f2 != null) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                String uid = curUser.getUid();
                if (uid != null) {
                    l.b(f2, "");
                    f.a.b.b d2 = com.ss.android.ugc.aweme.ufr.b.b(f2, com.ss.android.ugc.aweme.friends.service.a.f97047a.f(), uid, "privacy_setting", "click").d(new b(f2, this));
                    l.b(d2, "");
                    f.a.j.a.a(d2, this.f123023a);
                }
            }
        } else {
            com.ss.android.ugc.aweme.setting.h.a.a(2);
            e f3 = f();
            if (f3 != null) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                User curUser2 = g3.getCurUser();
                l.b(curUser2, "");
                String uid2 = curUser2.getUid();
                if (uid2 != null) {
                    l.b(f3, "");
                    f.a.b.b d3 = com.ss.android.ugc.aweme.ufr.b.a(f3, com.ss.android.ugc.aweme.friends.service.a.f97047a.f(), uid2, "privacy_setting", "click", true).d(new c(f3, this));
                    l.b(d3, "");
                    f.a.j.a.a(d3, this.f123023a);
                }
            }
        }
    }
}
