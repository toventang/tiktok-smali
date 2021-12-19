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

public final class d extends com.ss.android.ugc.aweme.dc.c implements View.OnClickListener, com.ss.android.ugc.aweme.setting.serverpush.b.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f122968j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.a f122969a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    boolean f122970b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.setting.serverpush.b.e f122971c;

    /* renamed from: d  reason: collision with root package name */
    public long f122972d;

    /* renamed from: e  reason: collision with root package name */
    public long f122973e;

    /* renamed from: f  reason: collision with root package name */
    public int f122974f;

    /* renamed from: g  reason: collision with root package name */
    public final String f122975g = "click";

    /* renamed from: h  reason: collision with root package name */
    public f.a.b.b f122976h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.page.a f122977i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f122978k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f122979l = h.i.a((h.f.a.a) new C3186d(this));
    private final h.h o;

    static {
        Covode.recordClassIndex(80750);
    }

    public final Context e() {
        return (Context) this.f122979l.getValue();
    }

    public final FindCtxViewModel f() {
        return (FindCtxViewModel) this.o.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80751);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void cf_() {
        j();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.d b() {
        return b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$d  reason: collision with other inner class name */
    static final class C3186d extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(80754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3186d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            return this.this$0.f122977i.getActivity();
        }
    }

    static final class j extends m implements h.f.a.a<FindCtxViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(80763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FindCtxViewModel invoke() {
            return ae.a(this.this$0.f122977i, (ad.b) null).a(FindCtxViewModel.class);
        }
    }

    public final void h() {
        this.f122978k = false;
        a(e.f122982a);
    }

    public final void i() {
        this.f122978k = true;
        a(f.f122983a);
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f122985b;

        static {
            Covode.recordClassIndex(80757);
        }

        g(d dVar, int i2) {
            this.f122984a = dVar;
            this.f122985b = i2;
        }

        public final void run() {
            int i2 = this.f122985b;
            if (i2 == 0) {
                this.f122984a.a(AnonymousClass1.f122986a);
            } else if (i2 == 1) {
                this.f122984a.a(AnonymousClass2.f122987a);
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
        com.ss.android.ugc.aweme.be.d dVar = (com.ss.android.ugc.aweme.be.d) super.d();
        com.ss.android.ugc.aweme.setting.serverpush.b.e eVar = new com.ss.android.ugc.aweme.setting.serverpush.b.e();
        eVar.a_(this);
        this.f122971c = eVar;
        h();
        g();
        return dVar;
    }

    public final void g() {
        PushSettingsApiManager.a(1).a(new b(this), b.i.f4824a, null);
    }

    public final void j() {
        com.ss.android.ugc.aweme.setting.h.a.a(false);
        i();
        a(0);
        new com.ss.android.ugc.aweme.tux.a.i.a(e()).a(R.string.bpa).a();
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final com.ss.android.ugc.aweme.be.d a() {
        com.bytedance.tux.table.cell.b bVar = com.bytedance.tux.table.cell.b.DESTRUCTIVE;
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.fbw);
        l.b(string, "");
        return new com.ss.android.ugc.aweme.be.d(string, null, this, null, false, null, null, false, bVar, false, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.fbr), false, this, 108026);
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.base.utils.m.a(new g(this, i2));
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f122982a = new e();

        static {
            Covode.recordClassIndex(80755);
        }

        e() {
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
        public static final f f122983a = new f();

        static {
            Covode.recordClassIndex(80756);
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

    public d(com.ss.android.ugc.aweme.setting.page.a aVar) {
        l.d(aVar, "");
        this.f122977i = aVar;
        aVar.getLifecycle().a(new RemoveContactsUnit$1(this));
        this.o = h.i.a((h.f.a.a) new j(this));
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122989a;

        static {
            Covode.recordClassIndex(80761);
        }

        i(d dVar) {
            this.f122989a = dVar;
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f122990a;

            static {
                Covode.recordClassIndex(80762);
            }

            a(i iVar) {
                this.f122990a = iVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
                if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && !dVar.f141690b.f141691a) {
                    l.b(dVar, "");
                    c cVar = new c(dVar, "contact");
                    FindCtxViewModel f2 = this.f122990a.f122989a.f();
                    if (f2 != null) {
                        f2.a(cVar);
                    }
                    this.f122990a.f122989a.f122969a.a();
                } else if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS && dVar.f141690b.f141693c != 0) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f122990a.f122989a.e()).a(R.string.bpa).a();
                    this.f122990a.f122989a.f122969a.a();
                }
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            Context e2;
            com.ss.android.ugc.aweme.setting.h.a.a(true, 1);
            com.ss.android.ugc.aweme.setting.page.privacy.a.a.b(true);
            this.f122989a.a(1);
            com.ss.android.ugc.aweme.setting.serverpush.b.e eVar = this.f122989a.f122971c;
            if (eVar != null) {
                eVar.a(1);
            }
            FindCtxViewModel f2 = this.f122989a.f();
            if (!(f2 == null || !f2.f122960a || (e2 = this.f122989a.e()) == null)) {
                Class<? extends com.ss.android.ugc.aweme.ufr.a> c2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.c();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                f.a.b.b d2 = com.ss.android.ugc.aweme.ufr.b.b(e2, c2, curUser.getUid(), "privacy_setting", this.f122989a.f122975g).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new a(this));
                l.b(d2, "");
                f.a.j.a.a(d2, this.f122989a.f122969a);
            }
            d dVar = this.f122989a;
            dVar.f122976h = t.a(0, 1, TimeUnit.SECONDS).d(new c(dVar));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122980a;

        static {
            Covode.recordClassIndex(80752);
        }

        b(d dVar) {
            this.f122980a = dVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (!p.a("error", ((SocialRelationDataCheckResponse) iVar.d()).message, true)) {
                    if (!((SocialRelationDataCheckResponse) iVar.d()).getHasRemainingData()) {
                        f.a.b.b bVar = this.f122980a.f122976h;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        if (com.ss.android.ugc.aweme.setting.page.privacy.a.a.a()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f122980a.e()).a(R.string.fbv).a();
                        }
                        this.f122980a.h();
                        com.ss.android.ugc.aweme.setting.page.privacy.a.a.b(false);
                        this.f122980a.a(0);
                    } else if (com.ss.android.ugc.aweme.setting.page.privacy.a.a.a()) {
                        this.f122980a.a(1);
                        this.f122980a.h();
                    } else {
                        this.f122980a.a(0);
                        this.f122980a.i();
                    }
                    return z.f158842a;
                }
            }
            this.f122980a.i();
            return z.f158842a;
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122981a;

        static {
            Covode.recordClassIndex(80753);
        }

        c(d dVar) {
            this.f122981a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Long l2 = (Long) obj;
            if (this.f122981a.f122974f >= 10 || !com.ss.android.ugc.aweme.setting.page.privacy.a.a.a()) {
                f.a.b.b bVar = this.f122981a.f122976h;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f122981a.j();
                d dVar = this.f122981a;
                com.ss.android.ugc.aweme.setting.page.privacy.a.a.b(false);
                dVar.f122974f = 0;
                dVar.f122973e = 0;
                dVar.f122972d = 0;
            }
            long j2 = this.f122981a.f122973e + this.f122981a.f122972d;
            if (l2 != null && l2.longValue() == j2 && this.f122981a.f122974f < 10) {
                this.f122981a.f122973e += this.f122981a.f122972d;
                this.f122981a.f122974f++;
                this.f122981a.f122972d = h.i.c.Default.nextLong(5, 10);
                this.f122981a.g();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        com.ss.android.ugc.aweme.setting.h.a.c(1);
        if (this.f122978k) {
            com.ss.android.ugc.aweme.setting.h.a.d(1);
            new a.C0731a(e()).a(R.string.fbw).b(R.string.fbs).b(R.string.fbp, (DialogInterface.OnClickListener) h.f122988a, false).a(R.string.fbq, (DialogInterface.OnClickListener) new i(this), false).a().c();
            return;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.giz).a();
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f122988a = new h();

        static {
            Covode.recordClassIndex(80760);
        }

        h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.setting.h.a.a(false, 1);
        }
    }
}
