package com.ss.android.ugc.aweme.setting.unit.privacy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.api.SocialRelationDataCheckResponse;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.concurrent.TimeUnit;

public final class e extends com.ss.android.ugc.aweme.dc.c implements View.OnClickListener, com.ss.android.ugc.aweme.setting.serverpush.b.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f122991j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.a f122992a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    boolean f122993b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.setting.serverpush.b.f f122994c;

    /* renamed from: d  reason: collision with root package name */
    public long f122995d;

    /* renamed from: e  reason: collision with root package name */
    public long f122996e;

    /* renamed from: f  reason: collision with root package name */
    public int f122997f;

    /* renamed from: g  reason: collision with root package name */
    public final String f122998g = "click";

    /* renamed from: h  reason: collision with root package name */
    public f.a.b.b f122999h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.page.a f123000i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f123001k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f123002l = h.i.a((h.f.a.a) new d(this));
    private final h.h o = h.i.a((h.f.a.a) new j(this));

    static {
        Covode.recordClassIndex(80764);
    }

    public final Context e() {
        return (Context) this.f123002l.getValue();
    }

    public final FindCtxViewModel f() {
        return (FindCtxViewModel) this.o.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80765);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void cf_() {
        g();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.d b() {
        return b();
    }

    static final class d extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            return this.this$0.f123000i.getActivity();
        }
    }

    static final class j extends m implements h.f.a.a<FindCtxViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FindCtxViewModel invoke() {
            return ae.a(this.this$0.f123000i, (ad.b) null).a(FindCtxViewModel.class);
        }
    }

    public final void i() {
        this.f123001k = false;
        a(C3187e.f123005a);
    }

    public final void j() {
        this.f123001k = true;
        a(f.f123006a);
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f123008b;

        static {
            Covode.recordClassIndex(80771);
        }

        g(e eVar, int i2) {
            this.f123007a = eVar;
            this.f123008b = i2;
        }

        public final void run() {
            int i2 = this.f123008b;
            if (i2 == 0) {
                this.f123007a.a(AnonymousClass1.f123009a);
            } else if (i2 == 1) {
                this.f123007a.a(AnonymousClass2.f123010a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void av_() {
        new com.ss.android.ugc.aweme.tux.a.i.a(e()).a(R.string.fbu).a();
        com.ss.android.ugc.aweme.setting.h.a.a(true);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.d d() {
        super.d();
        com.ss.android.ugc.aweme.setting.serverpush.b.f fVar = new com.ss.android.ugc.aweme.setting.serverpush.b.f();
        fVar.a_(this);
        this.f122994c = fVar;
        i();
        h();
        return (com.ss.android.ugc.aweme.be.d) l();
    }

    public final void g() {
        com.ss.android.ugc.aweme.setting.h.a.a(false);
        j();
        a(0);
        new com.ss.android.ugc.aweme.tux.a.i.a(e()).a(R.string.bpa).a();
    }

    public final void h() {
        PushSettingsApiManager.a(2).a(new b(this), b.i.f4824a, null);
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final com.ss.android.ugc.aweme.be.d a() {
        com.bytedance.tux.table.cell.b bVar = com.bytedance.tux.table.cell.b.DESTRUCTIVE;
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.g3);
        l.b(string, "");
        return new com.ss.android.ugc.aweme.be.d(string, null, this, null, false, null, null, false, bVar, false, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.g2), false, this, 108026);
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.base.utils.m.a(new g(this, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$e  reason: collision with other inner class name */
    public static final class C3187e extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3187e f123005a = new C3187e();

        static {
            Covode.recordClassIndex(80769);
        }

        C3187e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
            com.ss.android.ugc.aweme.be.d dVar2 = dVar;
            l.d(dVar2, "");
            return com.ss.android.ugc.aweme.be.d.a(dVar2, null, null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 126975);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f123006a = new f();

        static {
            Covode.recordClassIndex(80770);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
            com.ss.android.ugc.aweme.be.d dVar2 = dVar;
            l.d(dVar2, "");
            return com.ss.android.ugc.aweme.be.d.a(dVar2, null, null, null, null, false, null, null, null, false, null, false, null, true, false, null, false, 0, 126975);
        }
    }

    public e(com.ss.android.ugc.aweme.setting.page.a aVar) {
        l.d(aVar, "");
        this.f123000i = aVar;
        aVar.getLifecycle().a(new RemoveFBFriendsUnit$1(this));
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123012a;

        static {
            Covode.recordClassIndex(80775);
        }

        i(e eVar) {
            this.f123012a = eVar;
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f123013a;

            static {
                Covode.recordClassIndex(80776);
            }

            a(i iVar) {
                this.f123013a = iVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
                if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && !dVar.f141690b.f141691a) {
                    l.b(dVar, "");
                    c cVar = new c(dVar, "facebook");
                    FindCtxViewModel f2 = this.f123013a.f123012a.f();
                    if (f2 != null) {
                        f2.a(cVar);
                    }
                    this.f123013a.f123012a.f122992a.a();
                } else if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && dVar.f141690b.f141693c != 0) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f123013a.f123012a.e()).a(R.string.bpa).a();
                    this.f123013a.f123012a.f122992a.a();
                }
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            Context e2;
            com.ss.android.ugc.aweme.setting.h.a.a(true, 2);
            com.ss.android.ugc.aweme.setting.page.privacy.a.a.c(true);
            this.f123012a.a(1);
            com.ss.android.ugc.aweme.setting.serverpush.b.f fVar = this.f123012a.f122994c;
            if (fVar != null) {
                fVar.a(2);
            }
            FindCtxViewModel f2 = this.f123012a.f();
            if (!(f2 == null || !f2.f122961b || (e2 = this.f123012a.e()) == null)) {
                Class<? extends com.ss.android.ugc.aweme.ufr.a> f3 = com.ss.android.ugc.aweme.friends.service.a.f97047a.f();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                f.a.b.b d2 = com.ss.android.ugc.aweme.ufr.b.b(e2, f3, curUser.getUid(), "privacy_setting", this.f123012a.f122998g).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new a(this));
                l.b(d2, "");
                f.a.j.a.a(d2, this.f123012a.f122992a);
            }
            e eVar = this.f123012a;
            eVar.f122999h = t.a(0, 1, TimeUnit.SECONDS).d(new c(eVar));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123003a;

        static {
            Covode.recordClassIndex(80766);
        }

        b(e eVar) {
            this.f123003a = eVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (!p.a("error", ((SocialRelationDataCheckResponse) iVar.d()).message, true)) {
                    if (!((SocialRelationDataCheckResponse) iVar.d()).getHasRemainingData()) {
                        f.a.b.b bVar = this.f123003a.f122999h;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        if (com.ss.android.ugc.aweme.setting.page.privacy.a.a.b()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f123003a.e()).a(R.string.fx).a();
                        }
                        this.f123003a.i();
                        com.ss.android.ugc.aweme.setting.page.privacy.a.a.c(false);
                        this.f123003a.a(0);
                    } else if (com.ss.android.ugc.aweme.setting.page.privacy.a.a.b()) {
                        this.f123003a.a(1);
                        this.f123003a.i();
                    } else {
                        this.f123003a.a(0);
                        this.f123003a.j();
                    }
                    return z.f158842a;
                }
            }
            this.f123003a.j();
            return z.f158842a;
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123004a;

        static {
            Covode.recordClassIndex(80767);
        }

        c(e eVar) {
            this.f123004a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Long l2 = (Long) obj;
            if (this.f123004a.f122997f >= 10 || !com.ss.android.ugc.aweme.setting.page.privacy.a.a.b()) {
                f.a.b.b bVar = this.f123004a.f122999h;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f123004a.g();
                e eVar = this.f123004a;
                com.ss.android.ugc.aweme.setting.page.privacy.a.a.c(false);
                eVar.f122997f = 0;
                eVar.f122995d = 0;
                eVar.f122996e = 0;
            }
            long j2 = this.f123004a.f122996e + this.f123004a.f122995d;
            if (l2 != null && l2.longValue() == j2 && this.f123004a.f122997f < 10) {
                this.f123004a.f122996e += this.f123004a.f122995d;
                this.f123004a.f122997f++;
                this.f123004a.f122995d = h.i.c.Default.nextLong(5, 10);
                this.f123004a.h();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        com.ss.android.ugc.aweme.setting.h.a.c(2);
        if (this.f123001k) {
            com.ss.android.ugc.aweme.setting.h.a.d(2);
            new a.C0731a(e()).a(R.string.g3).b(R.string.fbs).b(R.string.g0, (DialogInterface.OnClickListener) h.f123011a, false).a(R.string.g1, (DialogInterface.OnClickListener) new i(this), false).a().c();
            return;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.fy).a();
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f123011a = new h();

        static {
            Covode.recordClassIndex(80774);
        }

        h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.setting.h.a.a(false, 2);
        }
    }
}
