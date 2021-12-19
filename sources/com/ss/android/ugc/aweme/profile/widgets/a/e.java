package com.ss.android.ugc.aweme.profile.widgets.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.feed.ba;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class e extends com.bytedance.assem.arch.d.a implements i, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.profile.api.a f117571j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.profile.api.a f117572k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f117573l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f117574m;
    public boolean n;
    public boolean o;
    public DampScrollableLayout p;
    public boolean q;
    private com.ss.android.ugc.aweme.commercialize.profile.api.a r;
    private final o s = new o(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.e$e  reason: collision with other inner class name */
    static final class C2983e implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C2983e f117582a = new C2983e();

        static {
            Covode.recordClassIndex(76006);
        }

        C2983e() {
        }
    }

    static final class f implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f117583a = new f();

        static {
            Covode.recordClassIndex(76007);
        }

        f() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f117584a = new g();

        static {
            Covode.recordClassIndex(76008);
        }

        g() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final h f117585a = new h();

        static {
            Covode.recordClassIndex(76009);
        }

        h() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final i f117586a = new i();

        static {
            Covode.recordClassIndex(76010);
        }

        i() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f117587a = new j();

        static {
            Covode.recordClassIndex(76011);
        }

        j() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final k f117588a = new k();

        static {
            Covode.recordClassIndex(76012);
        }

        k() {
        }
    }

    static {
        Covode.recordClassIndex(76000);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(342, new org.greenrobot.eventbus.g(e.class, "onNativeGPViewHiddenEvent", a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(343, new org.greenrobot.eventbus.g(e.class, "onEvent", com.ss.android.ugc.aweme.ecommerce.a.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.a.i
    public final boolean x() {
        return this.o;
    }

    public static final class a extends com.ss.android.ugc.aweme.commercialize.profile.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f117575a;

        static {
            Covode.recordClassIndex(76001);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.profile.api.d
        public final void a() {
            this.f117575a.f117573l = true;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.profile.api.d
        public final void b() {
            this.f117575a.w();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f117575a = eVar;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.commercialize.profile.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f117576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f117577b;

        static {
            Covode.recordClassIndex(76002);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.profile.api.d
        public final void a() {
            this.f117576a.f117573l = true;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.profile.api.d
        public final void b() {
            e eVar = this.f117576a;
            Aweme u = eVar.u();
            com.ss.android.ugc.aweme.commercialize.g.a().b(eVar.ar_(), u, "button");
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.w(u)) {
                com.ss.android.ugc.aweme.commercialize.g.c().a(eVar.ar_(), u, 8, f.f117583a);
            } else if (!com.ss.android.ugc.aweme.profile.service.a.f116616a.openTopViewLive(eVar.ar_(), u, 8, new d(eVar, u))) {
                com.ss.android.ugc.aweme.commercialize.g.c().a(eVar.ar_(), u, 8, C2983e.f117582a);
                eVar.b(300);
            }
        }

        b(e eVar, Aweme aweme) {
            this.f117576a = eVar;
            this.f117577b = aweme;
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.commercialize.profile.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f117578a;

        static {
            Covode.recordClassIndex(76003);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.profile.api.d
        public final void b() {
            this.f117578a.w();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(e eVar) {
            this.f117578a = eVar;
        }
    }

    public static final class o implements ScrollableLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f117589a;

        static {
            Covode.recordClassIndex(76016);
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final boolean an_() {
            this.f117589a.q = false;
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(e eVar) {
            this.f117589a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void a(float f2, float f3) {
            String str;
            Aweme u = this.f117589a.u();
            if (f3 > 5.0f) {
                if (!this.f117589a.q) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aD(u) || this.f117589a.f117574m) {
                        this.f117589a.b(300);
                    } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.ay(u)) {
                        this.f117589a.c(300);
                    } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aB(u)) {
                        com.ss.android.ugc.aweme.profile.service.a.f116616a.closeProfilePopUpWebPage(com.bytedance.assem.arch.extensions.b.b(this.f117589a));
                    } else {
                        this.f117589a.a(300);
                    }
                    this.f117589a.q = true;
                }
            } else if (f3 < -5.0f && !this.f117589a.q) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aD(u) || this.f117589a.f117574m) {
                    this.f117589a.b(false);
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.ay(u)) {
                    this.f117589a.c(false);
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aB(u)) {
                    com.ss.android.ugc.aweme.profile.service.a aVar = com.ss.android.ugc.aweme.profile.service.a.f116616a;
                    Context ar_ = this.f117589a.ar_();
                    if (u != null) {
                        str = u.getAid();
                    } else {
                        str = null;
                    }
                    aVar.openProfilePopUpWebPageInTwoMode(ar_, u, str, false);
                } else {
                    this.f117589a.a(false);
                }
                this.f117589a.q = true;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        cg.a(this);
    }

    public static final class d implements bo {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f117579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f117580b;

        static final class a implements com.ss.android.ugc.aweme.commercialize.j.b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f117581a = new a();

            static {
                Covode.recordClassIndex(76005);
            }

            a() {
            }
        }

        static {
            Covode.recordClassIndex(76004);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.bo
        public final void a() {
            com.ss.android.ugc.aweme.commercialize.g.c().a(this.f117579a.ar_(), this.f117580b, 8, a.f117581a);
            this.f117579a.b(300);
        }

        d(e eVar, Aweme aweme) {
            this.f117579a = eVar;
            this.f117580b = aweme;
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        o oVar;
        super.p();
        DampScrollableLayout dampScrollableLayout = this.p;
        if (!(dampScrollableLayout == null || (oVar = this.s) == null || !dampScrollableLayout.L.contains(oVar))) {
            dampScrollableLayout.L.remove(oVar);
        }
        cg.b(this);
    }

    public final Aweme u() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117249g;
        }
        return null;
    }

    public final String v() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117246d;
        }
        return null;
    }

    public final void w() {
        AwemeRawAd awemeRawAd;
        Aweme u = u();
        if (u != null && u.isAd() && (awemeRawAd = u.getAwemeRawAd()) != null) {
            h.f.b.l.b(awemeRawAd, "");
            String type = awemeRawAd.getType();
            if (!TextUtils.isEmpty(type) && type != null) {
                switch (type.hashCode()) {
                    case 96801:
                        if (!type.equals("app")) {
                            return;
                        }
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aM(u())) {
                            com.ss.android.ugc.aweme.commercialize.g.c().a(ar_(), u(), 8, j.f117587a);
                            return;
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aN(u())) {
                            com.ss.android.ugc.aweme.commercialize.g.c().b(ar_(), u);
                            return;
                        } else {
                            return;
                        }
                    case 117588:
                        if (type.equals("web")) {
                            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.az(u())) {
                                com.ss.android.ugc.aweme.commercialize.g.a().p(ar_(), u);
                                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_button", awemeRawAd).c();
                                com.ss.android.ugc.aweme.commercialize.g.a().q(ar_(), u);
                            }
                            com.ss.android.ugc.aweme.commercialize.g.c().a(ar_(), u, 8, i.f117586a);
                            return;
                        }
                        return;
                    case 3083120:
                        if (type.equals("dial")) {
                            com.ss.android.ugc.aweme.commercialize.g.a().r(ar_(), u);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_call", awemeRawAd).c();
                            com.ss.android.ugc.aweme.commercialize.g.a().q(ar_(), u);
                            return;
                        }
                        return;
                    case 3148996:
                        if (type.equals("form")) {
                            com.ss.android.ugc.aweme.commercialize.g.a().s(ar_(), u);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_form", awemeRawAd).c();
                            com.ss.android.ugc.aweme.commercialize.g.a().q(ar_(), u);
                            ba c2 = com.ss.android.ugc.aweme.commercialize.g.c();
                            Context ar_ = ar_();
                            if (!(ar_ instanceof Activity)) {
                                ar_ = null;
                            }
                            c2.a((Activity) ar_, u, 8);
                            return;
                        }
                        return;
                    case 957829685:
                        if (type.equals("counsel")) {
                            com.ss.android.ugc.aweme.commercialize.g.a().p(ar_(), u);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_button", awemeRawAd).c();
                            com.ss.android.ugc.aweme.commercialize.g.a().q(ar_(), u);
                            com.ss.android.ugc.aweme.commercialize.g.c().a(ar_(), u, 8, g.f117584a);
                            com.ss.android.ugc.aweme.commercialize.g.a().p(ar_(), u);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_button", awemeRawAd).c();
                            com.ss.android.ugc.aweme.commercialize.g.a().q(ar_(), u);
                            com.ss.android.ugc.aweme.commercialize.g.c().a(ar_(), u, 8, h.f117585a);
                            return;
                        }
                        return;
                    case 1893962841:
                        if (type.equals("redpacket")) {
                            com.ss.android.ugc.aweme.commercialize.g.a().q(ar_(), u);
                            com.ss.android.ugc.aweme.commercialize.g.a().t(ar_(), u);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_redpacket", awemeRawAd).c();
                            com.ss.android.ugc.aweme.commercialize.g.c().a(ar_(), u, 8, k.f117588a);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                this.this$0.f117573l = false;
                this.this$0.f117574m = false;
            }
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.commercialize.profile.api.a aVar;
        if (this.f25594h && (aVar = this.f117571j) != null) {
            aVar.a(i2);
        }
    }

    public final void b(int i2) {
        com.ss.android.ugc.aweme.commercialize.profile.api.a aVar;
        if (this.f25594h && (aVar = this.f117572k) != null) {
            aVar.a(i2);
        }
    }

    public final void c(int i2) {
        com.ss.android.ugc.aweme.commercialize.profile.api.a aVar;
        if (this.f25594h && (aVar = this.r) != null) {
            aVar.a(i2);
            this.n = false;
        }
    }

    @r
    public final void onNativeGPViewHiddenEvent(a aVar) {
        h.f.b.l.d(aVar, "");
        c(false);
    }

    public final void a(Aweme aweme) {
        com.ss.android.ugc.aweme.commercialize.profile.api.a aVar = this.r;
        if (aVar != null) {
            aVar.a(new com.ss.android.ugc.aweme.commercialize.profile.api.e().a(ar_(), aweme, v(), new c(this)));
        }
    }

    public final void b(Aweme aweme) {
        com.ss.android.ugc.aweme.commercialize.profile.api.a aVar = this.f117571j;
        if (aVar != null) {
            aVar.a(new com.ss.android.ugc.aweme.commercialize.profile.api.e().a(ar_(), aweme, v(), new a(this)));
        }
    }

    public final void a(boolean z) {
        com.ss.android.ugc.aweme.commercialize.profile.api.a aVar;
        if (this.f25594h && this.f117571j != null && !this.f117573l && com.ss.android.ugc.aweme.commercialize.e.a.b.aG(u()) && (aVar = this.f117571j) != null) {
            aVar.a(z);
        }
    }

    public final void b(boolean z) {
        if (this.f25594h && this.f117572k != null && !this.f117573l) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aG(u()) || this.f117574m) {
                if (z) {
                    this.f117574m = true;
                }
                com.ss.android.ugc.aweme.commercialize.profile.api.a aVar = this.f117572k;
                if (aVar != null) {
                    aVar.a(z);
                }
            }
        }
    }

    public final void c(boolean z) {
        if (this.f25594h && this.r != null && com.ss.android.ugc.aweme.commercialize.e.a.b.ay(u()) && !this.n) {
            this.n = true;
            com.ss.android.ugc.aweme.commercialize.profile.api.a aVar = this.r;
            if (aVar == null) {
                h.f.b.l.b();
            }
            aVar.a(z);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Aweme, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Aweme aweme) {
            Aweme aweme2 = aweme;
            if (aweme2 != null) {
                this.this$0.o = aweme2.isAd();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aD(aweme2)) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aF(aweme2)) {
                        this.this$0.a(aweme2);
                        this.this$0.b(aweme2);
                    }
                    e eVar = this.this$0;
                    com.ss.android.ugc.aweme.commercialize.profile.api.a aVar = eVar.f117572k;
                    if (aVar != null) {
                        aVar.a(new com.ss.android.ugc.aweme.commercialize.profile.api.e().a(eVar.ar_(), aweme2, eVar.v(), new b(eVar, aweme2)));
                    }
                    this.this$0.a(0);
                    this.this$0.c(0);
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.ay(aweme2)) {
                    this.this$0.a(aweme2);
                    this.this$0.a(0);
                    this.this$0.b(0);
                } else if (com.ss.android.ugc.aweme.commercialize.g.d().a(aweme2)) {
                    this.this$0.b(aweme2);
                    this.this$0.b(0);
                    this.this$0.c(0);
                } else {
                    this.this$0.a(0);
                    this.this$0.b(0);
                    this.this$0.c(0);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        DampScrollableLayout dampScrollableLayout = (DampScrollableLayout) view.findViewById(R.id.dtd);
        this.p = dampScrollableLayout;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.a(this.s);
        }
        com.ss.android.ugc.aweme.commercialize.profile.api.e eVar = new com.ss.android.ugc.aweme.commercialize.profile.api.e();
        eVar.f75144e = (ViewStub) view.findViewById(R.id.dk);
        com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = CommercializeAdServiceImpl.a().c(ar_(), eVar);
        if (c2 instanceof com.ss.android.ugc.aweme.commercialize.profile.api.a) {
            com.ss.android.ugc.aweme.commercialize.profile.api.a aVar = (com.ss.android.ugc.aweme.commercialize.profile.api.a) c2;
            this.f117571j = aVar;
            if (aVar != null) {
                aVar.a();
            }
        }
        com.ss.android.ugc.aweme.commercialize.profile.api.b bVar = new com.ss.android.ugc.aweme.commercialize.profile.api.b();
        bVar.f75138a = (ViewStub) view.findViewById(R.id.cuc);
        com.ss.android.ugc.aweme.commercialize_ad_api.b.a c3 = CommercializeAdServiceImpl.a().c(ar_(), bVar);
        if (c3 instanceof com.ss.android.ugc.aweme.commercialize.profile.api.a) {
            com.ss.android.ugc.aweme.commercialize.profile.api.a aVar2 = (com.ss.android.ugc.aweme.commercialize.profile.api.a) c3;
            this.f117572k = aVar2;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        com.ss.android.ugc.aweme.commercialize.profile.api.c cVar = new com.ss.android.ugc.aweme.commercialize.profile.api.c();
        cVar.f75139a = (ViewStub) view.findViewById(R.id.d6x);
        com.ss.android.ugc.aweme.commercialize_ad_api.b.a c4 = CommercializeAdServiceImpl.a().c(ar_(), cVar);
        if (c4 instanceof com.ss.android.ugc.aweme.commercialize.profile.api.a) {
            com.ss.android.ugc.aweme.commercialize.profile.api.a aVar3 = (com.ss.android.ugc.aweme.commercialize.profile.api.a) c4;
            this.r = aVar3;
            if (aVar3 == null) {
                h.f.b.l.b();
            }
            aVar3.a();
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), f.f117590a, new l(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), g.f117591a, new m(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), h.f117592a, new n(this));
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.ecommerce.a.b bVar) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        h.f.b.l.d(bVar, "");
        int i2 = bVar.f84199b;
        AwemeRawAd awemeRawAd5 = null;
        if (i2 == 1) {
            Integer num = bVar.f84200c;
            if (num != null && num.intValue() == 3) {
                Aweme u = u();
                if (u != null) {
                    awemeRawAd = u.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd).b("refer", "halfscreen_page").b();
                Aweme u2 = u();
                if (u2 != null) {
                    awemeRawAd2 = u2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow", awemeRawAd2).b("refer", "halfscreen_page").b();
            }
            Integer num2 = bVar.f84200c;
            if (num2 != null && num2.intValue() == 2) {
                Aweme u3 = u();
                if (u3 != null) {
                    awemeRawAd3 = u3.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd3).b("refer", "button").b();
                Aweme u4 = u();
                if (u4 != null) {
                    awemeRawAd5 = u4.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow", awemeRawAd5).b("refer", "button").b();
            }
        } else if (i2 == 2) {
            Aweme u5 = u();
            if (u5 != null) {
                awemeRawAd5 = u5.getAwemeRawAd();
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", awemeRawAd5).b("refer", "halfscreen_page").b();
        } else if (i2 == 4) {
            Integer num3 = bVar.f84200c;
            if (num3 != null && num3.intValue() == 2) {
                Aweme u6 = u();
                if (u6 != null) {
                    awemeRawAd4 = u6.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd4).b();
            }
            Integer num4 = bVar.f84200c;
            if (num4 != null && num4.intValue() == 3) {
                Aweme u7 = u();
                if (u7 != null) {
                    awemeRawAd5 = u7.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd5).b("refer", "halfscreen_page").b();
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            AwemeRawAd awemeRawAd;
            NativeAuthorInfo nativeAuthorInfo;
            Integer valueOf;
            AwemeRawAd awemeRawAd2;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                Aweme u = this.this$0.u();
                if (aVar2.f25631b.booleanValue()) {
                    this.this$0.f117573l = false;
                    this.this$0.f117574m = false;
                    this.this$0.n = false;
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aD(u)) {
                        this.this$0.b(true);
                    } else {
                        String str = null;
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aC(u)) {
                            this.this$0.b(0);
                            com.ss.android.ugc.aweme.profile.service.a aVar3 = com.ss.android.ugc.aweme.profile.service.a.f116616a;
                            Context ar_ = this.this$0.ar_();
                            if (u != null) {
                                str = u.getAid();
                            }
                            aVar3.openProfilePopUpWebPageInTwoMode(ar_, u, str);
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.ay(u)) {
                            this.this$0.b(0);
                            this.this$0.c(true);
                            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aA(u)) {
                                AwemeRawAd awemeRawAd3 = u.getAwemeRawAd();
                                BottomBanner bottomBanner = u.getAwemeRawAd().getNativeAuthorInfo().getBottomBanner();
                                if (!TextUtils.isEmpty(awemeRawAd3.getOpenUrl()) && bottomBanner.getVersion() == 1 && u.getAwemeRawAd().getNativeAuthorInfo().getAutoPullStyle() == 1 && awemeRawAd3.isOpenUrlSupportPullUp() && !awemeRawAd3.isDisableUserprofileAdLabel()) {
                                    Context ar_2 = this.this$0.ar_();
                                    StringBuilder sb = new StringBuilder();
                                    if (!(u == null || (awemeRawAd2 = u.getAwemeRawAd()) == null)) {
                                        str = awemeRawAd2.getOpenUrl();
                                    }
                                    SmartRouter.buildRoute(ar_2, sb.append(com.ss.android.ugc.aweme.bullet.utils.c.b(str, "fullScreen")).append("&fullScreen=false&player_control=0&collapsible=0&collapsedHeight=0.6&expandHeight=0.9").toString()).open();
                                }
                            }
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aB(u)) {
                            this.this$0.b(0);
                            if (!(u == null || (awemeRawAd = u.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (valueOf = Integer.valueOf(nativeAuthorInfo.getAutoPullStyle())) == null)) {
                                if (valueOf.intValue() == 1) {
                                    com.ss.android.ugc.aweme.profile.service.a aVar4 = com.ss.android.ugc.aweme.profile.service.a.f116616a;
                                    Context ar_3 = this.this$0.ar_();
                                    if (u != null) {
                                        str = u.getAid();
                                    }
                                    aVar4.openProfilePopUpWebPageInSixTwoMode(ar_3, u, str);
                                } else if (valueOf.intValue() == 2) {
                                    com.ss.android.ugc.aweme.profile.service.a aVar5 = com.ss.android.ugc.aweme.profile.service.a.f116616a;
                                    Context ar_4 = this.this$0.ar_();
                                    if (u != null) {
                                        str = u.getAid();
                                    }
                                    aVar5.openProfilePopUpWebPageInTwoExpandMode(ar_4, u, str);
                                }
                            }
                            com.ss.android.ugc.aweme.profile.service.a aVar6 = com.ss.android.ugc.aweme.profile.service.a.f116616a;
                            Context ar_5 = this.this$0.ar_();
                            if (u != null) {
                                str = u.getAid();
                            }
                            aVar6.openProfilePopUpWebPageInTwoMode(ar_5, u, str, true);
                        } else {
                            this.this$0.a(true);
                        }
                    }
                } else {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aB(u)) {
                        com.ss.android.ugc.aweme.profile.service.a.f116616a.closeProfilePopUpWebPage(com.bytedance.assem.arch.extensions.b.b(this.this$0));
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.ay(u)) {
                        this.this$0.c(0);
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aC(u)) {
                        com.ss.android.ugc.aweme.profile.service.a.f116616a.closeProfilePopUpWebPage(com.bytedance.assem.arch.extensions.b.b(this.this$0));
                        this.this$0.c(0);
                    }
                }
            }
            return z.f158842a;
        }
    }
}
