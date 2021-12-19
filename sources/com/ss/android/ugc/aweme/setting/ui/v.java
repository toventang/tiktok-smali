package com.ss.android.ugc.aweme.setting.ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.be.e;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.dc.c;
import com.ss.android.ugc.aweme.dc.d;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.setting.ui.cell.CommonItemViewCell;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingFooterCell;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingUnLoginCell;
import com.ss.android.ugc.aweme.setting.unit.a.a;
import com.ss.android.ugc.aweme.setting.unit.a.b;
import com.ss.android.ugc.aweme.setting.utils.m;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public abstract class v extends a implements IAccountService.b, i, j {
    com.ss.android.ugc.aweme.setting.unit.a.a A;
    com.ss.android.ugc.aweme.setting.unit.a.a B;
    c C;
    com.ss.android.ugc.aweme.setting.unit.a.a D;
    com.ss.android.ugc.aweme.setting.unit.a.a E;
    b F;
    com.ss.android.ugc.aweme.setting.unit.a.a G;
    com.ss.android.ugc.aweme.setting.unit.a.a H;
    com.ss.android.ugc.aweme.setting.unit.a.a I;
    com.ss.android.ugc.aweme.setting.unit.a.a J;
    com.ss.android.ugc.aweme.setting.unit.a.a K;
    com.ss.android.ugc.aweme.setting.unit.a.a L;
    com.ss.android.ugc.aweme.setting.unit.a.a M;
    com.ss.android.ugc.aweme.setting.unit.a.a N;
    com.ss.android.ugc.aweme.setting.unit.a.a O;
    com.ss.android.ugc.aweme.setting.unit.a.a P;
    com.ss.android.ugc.aweme.setting.unit.a.a Q;
    com.ss.android.ugc.aweme.setting.unit.a.a R;
    com.ss.android.ugc.aweme.setting.unit.a.a S;
    com.ss.android.ugc.aweme.setting.unit.a.a T;
    com.ss.android.ugc.aweme.setting.unit.a.a U;
    com.ss.android.ugc.aweme.setting.unit.a.a V;
    com.ss.android.ugc.aweme.setting.unit.a.a W;
    com.ss.android.ugc.aweme.setting.unit.a.a X;
    com.ss.android.ugc.aweme.setting.unit.a.a Y;
    com.ss.android.ugc.aweme.setting.unit.a.a Z;

    /* renamed from: a  reason: collision with root package name */
    private int f122925a;
    com.ss.android.ugc.aweme.setting.unit.a.a aa;
    com.ss.android.ugc.aweme.setting.unit.a.b ab;
    d ac;
    d ad;
    d ae;
    d af;
    d ag;
    d ah;
    List<Aweme> ai;
    protected List<CommonItemView> aj = new ArrayList();
    com.ss.android.ugc.aweme.login.a ak;
    protected HashSet<com.ss.android.ugc.aweme.dc.a<com.ss.android.ugc.aweme.be.a>> al;

    /* renamed from: b  reason: collision with root package name */
    private long f122926b;

    /* renamed from: c  reason: collision with root package name */
    View f122927c;

    /* renamed from: d  reason: collision with root package name */
    ViewGroup f122928d;

    /* renamed from: e  reason: collision with root package name */
    TextTitleBar f122929e;

    /* renamed from: f  reason: collision with root package name */
    PowerList f122930f;

    /* renamed from: g  reason: collision with root package name */
    dm f122931g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.unit.a.a f122932h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.unit.a.a f122933i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.unit.a.a f122934j;

    /* renamed from: k  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.unit.a.a f122935k;

    /* renamed from: l  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.unit.a.a f122936l;

    /* renamed from: m  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.unit.a.a f122937m;
    com.ss.android.ugc.aweme.setting.unit.a.a n;
    com.ss.android.ugc.aweme.setting.unit.a.a o;
    com.ss.android.ugc.aweme.setting.unit.a.a p;
    com.ss.android.ugc.aweme.setting.unit.a.a q;
    com.ss.android.ugc.aweme.setting.unit.a.a r;
    com.ss.android.ugc.aweme.setting.unit.a.a s;
    com.ss.android.ugc.aweme.setting.unit.a.a t;
    com.ss.android.ugc.aweme.setting.unit.a.a u;
    com.ss.android.ugc.aweme.setting.unit.a.a v;
    com.ss.android.ugc.aweme.setting.unit.a.a w;
    com.ss.android.ugc.aweme.setting.unit.a.a x;
    com.ss.android.ugc.aweme.setting.unit.a.a y;
    public com.ss.android.ugc.aweme.setting.unit.a.c z;

    static {
        Covode.recordClassIndex(80706);
    }

    /* access modifiers changed from: protected */
    public abstract void A();

    /* access modifiers changed from: protected */
    public void C() {
    }

    /* access modifiers changed from: protected */
    public abstract void D();

    /* access modifiers changed from: protected */
    public abstract void H();

    /* access modifiers changed from: protected */
    public abstract void I();

    /* access modifiers changed from: protected */
    public abstract void J();

    /* access modifiers changed from: protected */
    public abstract void a(com.ss.android.ugc.aweme.profile.e.a aVar);

    public abstract com.ss.android.ugc.aweme.dc.a[] b();

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public int f() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void O();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new g(v.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void P();

    /* access modifiers changed from: protected */
    public abstract void o();

    /* access modifiers changed from: protected */
    public void p() {
    }

    /* access modifiers changed from: protected */
    public abstract void q();

    /* access modifiers changed from: protected */
    public abstract void r();

    /* access modifiers changed from: protected */
    public abstract void s();

    /* access modifiers changed from: protected */
    public abstract void t();

    /* access modifiers changed from: protected */
    public abstract void u();

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public abstract void w();

    /* access modifiers changed from: protected */
    public abstract void x();

    /* access modifiers changed from: protected */
    public abstract void y();

    /* access modifiers changed from: protected */
    public abstract void z();

    private static boolean E() {
        return com.ss.android.ugc.aweme.compliance.api.a.d().c();
    }

    private static boolean F() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void N() {
        a(new com.ss.android.ugc.aweme.profile.e.a("settings_page", "switch_account"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Q() {
        com.ss.android.ugc.aweme.base.h.d.h().b("show_insights_red", false);
        m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public x R() {
        x xVar = new x((byte) 0);
        xVar.f65555a = false;
        xVar.f65562h = false;
        xVar.f65561g = R.color.us;
        return xVar;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        super.onDestroy();
        h.a(this.ai);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        super.onStart();
        IBenchmarkService c2 = BenchmarkServiceImpl.c();
        if (c2 != null) {
            c2.a(1);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        super.onStop();
        IBenchmarkService c2 = BenchmarkServiceImpl.c();
        if (c2 != null) {
            c2.a();
        }
    }

    private static boolean B() {
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar = com.ss.android.ugc.aweme.setting.g.a.f122197a;
        if (cVar == null) {
            return false;
        }
        if ((!cVar.f122557a || TextUtils.isEmpty(cVar.f122558b)) && !TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "beta")) {
            return false;
        }
        return true;
    }

    public static boolean L() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean F2 = F();
        com.ss.android.ugc.aweme.lancet.j.f107229h = F2;
        return F2;
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.A.a("Debug Test");
        this.A.a(false);
        this.ai = h.f95332b;
        G();
    }

    /* access modifiers changed from: protected */
    public void j() {
        r.a("enter_account_safety", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").f66730a);
    }

    /* access modifiers changed from: protected */
    public void n() {
        r.a("display_settings", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").f66730a);
    }

    /* access modifiers changed from: protected */
    public void G() {
        if (com.ss.android.ugc.aweme.experiment.a.a.a()) {
            t.a(bm.f122871a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new z<Boolean>() {
                /* class com.ss.android.ugc.aweme.setting.ui.v.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(80708);
                }

                @Override // f.a.z
                public final void onComplete() {
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                }

                @Override // f.a.z
                public final void onSubscribe(f.a.b.b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(Boolean bool) {
                    if (bool.booleanValue()) {
                        v.this.x.b(true);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void K() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            if (this.al == null) {
                this.al = new HashSet<>();
            }
            if (com.ss.android.ugc.aweme.ug.h.a.a()) {
                this.f122935k.a(true);
            }
            m.a(this, this.al);
        }
    }

    public final void M() {
        int i2;
        boolean c2 = com.ss.android.ugc.aweme.compliance.api.a.o().c();
        boolean a2 = com.ss.android.ugc.aweme.compliance.api.a.o().a();
        if (!c2) {
            if (!a2) {
                D();
                return;
            }
        } else if (!a2) {
            i2 = R.string.a9u;
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(i2).a();
        }
        i2 = R.string.a9t;
        new com.ss.android.ugc.aweme.tux.a.i.a(this).a(i2).a();
    }

    /* access modifiers changed from: protected */
    public void m() {
        com.ss.android.common.c.a.a("click_insight", (JSONObject) null);
        r.a("click_insight", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").f66730a);
        r.a("enter_insight_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "settings_page").f66730a);
    }

    /* access modifiers changed from: protected */
    public void a() {
        c cVar = this.C;
        cVar.a(new c.a(cVar));
        this.f122929e.setTitle(R.string.aja);
        this.f122929e.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.setting.ui.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80707);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                v.this.exit(view);
            }
        });
        if (com.ss.android.ugc.aweme.livewallpaper.f.f.c()) {
            this.B.a(false);
        } else {
            this.B.a(true);
            com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
            aVar.f44749a = R.raw.icon_live_wallpaper;
            int a2 = n.a(20.0d);
            aVar.f44751c = a2;
            aVar.f44750b = a2;
            aVar.f44753e = Integer.valueOf((int) R.attr.bj);
            com.bytedance.tux.c.b a3 = aVar.a(this);
            com.ss.android.ugc.aweme.setting.unit.a.a aVar2 = this.B;
            aVar2.a(new a.d(aVar2));
            com.ss.android.ugc.aweme.setting.unit.a.a aVar3 = this.B;
            l.d(a3, "");
            aVar3.a(new a.c(aVar3, a3));
        }
        this.D.a(false);
        if (com.ss.android.ugc.aweme.account.b.b().isEnableMultiAccountLogin() && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            com.ss.android.ugc.aweme.setting.unit.a.a aVar4 = this.D;
            String avatarUrl = AccountService.a().e().getAvatarUrl();
            CommonItemView.a aVar5 = CommonItemView.a.CIRCULAR;
            l.d(avatarUrl, "");
            l.d(aVar5, "");
            aVar4.a(new a.f(aVar4, avatarUrl, aVar5));
            this.D.a(true);
        }
        b orderCenterEntry = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getOrderCenterEntry();
        this.F = orderCenterEntry;
        orderCenterEntry.a(getLifecycle(), new bl(this));
        this.ah.a(false);
        if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            this.ah.a(true);
            this.ah.a(getResources().getString(R.string.fp8));
        }
        com.ss.android.ugc.aweme.setting.unit.a.b bVar = this.ab;
        bVar.a(new b.a(bVar, androidx.core.content.b.c(this, R.color.f159928l)));
        this.R.a(false);
        if (com.ss.android.ugc.aweme.setting.l.c()) {
            ZeroRatingServiceImpl.f().c().b();
            this.V.a(true);
        }
        if (Build.VERSION.SDK_INT >= 21 && "googleplay".equals(com.bytedance.ies.ugc.appcontext.d.s) && (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getInappUpdateSwitchStrategy().intValue() == 3 || com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getInappUpdateSwitchStrategy().intValue() == 2)) {
            this.W.a(true);
        }
        if (B()) {
            this.Y.a(true);
        }
        if (E()) {
            this.X.a(true);
        }
        com.ss.android.ugc.aweme.ug.h.c a4 = com.ss.android.ugc.aweme.ug.h.d.a();
        if (a4 != null && !TextUtils.isEmpty(a4.f141950a)) {
            this.Z.a(true);
            this.Z.a(a4.f141950a);
        }
        this.S.a(true);
        this.U.a(false);
        if (com.ss.android.ugc.aweme.feed.experiment.b.a()) {
            this.T.a(true);
            com.ss.android.ugc.aweme.setting.unit.a.a aVar6 = this.T;
            aVar6.a(new a.b(aVar6));
        }
    }

    public void exit(View view) {
        finish();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            v();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            y();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            q();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            A();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            k();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            n();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void s(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            I();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            p();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void w(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            t();
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("user", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this, this.f122928d, jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            if (((com.ss.android.ugc.aweme.setting.ui.b.a) this.x.f79368m).f122838h) {
                this.x.b(false);
                com.ss.android.ugc.aweme.setting.n.a.a().storeLong("last_show_disk_manager_dot_time", System.currentTimeMillis());
                if (!com.ss.android.ugc.aweme.setting.n.a.a(false)) {
                    com.ss.android.ugc.aweme.setting.n.a.a().storeBoolean("has_show_disk_manager_dot", true);
                }
            }
            H();
        }
    }

    public void onUserInfoClick(View view) {
        String str = ((com.ss.android.ugc.aweme.setting.ui.b.b) this.ab.f79368m).f122850i;
        try {
            av.a("user_info", str, this, PrivacyCert.Builder.with("bpea-213").usage("User can share suggesting of feedback to TikTok in app. Click on the app information on the settings page, and copy the app related information to the clipboard. ").tag("click_to_copy_app_info").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        } catch (com.bytedance.bpea.basics.a e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.agy).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            r.a("uc_user_logout_click", new com.ss.android.ugc.aweme.app.f.d().a("params_for_special", "uc_login").a("uid", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).f66730a);
            if (!AVExternalServiceImpl.a().publishService().isPublishable()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.f0w).a();
            } else if (!L()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            } else if (!isActive()) {
            } else {
                if (!com.ss.android.ugc.aweme.compliance.api.a.o().d()) {
                    D();
                } else if (com.ss.android.ugc.aweme.compliance.api.a.p().a() == IFamilyPairingService.a.CHILD || com.ss.android.ugc.aweme.compliance.api.a.p().a() == IFamilyPairingService.a.UNLINK_LOCKED) {
                    com.ss.android.ugc.aweme.compliance.api.a.o().a(new com.ss.android.ugc.aweme.compliance.api.services.teenmode.a() {
                        /* class com.ss.android.ugc.aweme.setting.ui.v.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(80709);
                        }

                        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
                        public final void a() {
                            v.this.M();
                        }

                        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
                        public final void a(Exception exc) {
                            v.this.M();
                        }
                    });
                } else {
                    r.a("time_lock_block_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "logout").f66730a);
                    com.ss.android.ugc.aweme.compliance.api.a.o().a(new com.ss.android.ugc.aweme.base.ui.session.b<Boolean>() {
                        /* class com.ss.android.ugc.aweme.setting.ui.v.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(80710);
                        }

                        @Override // com.ss.android.ugc.aweme.base.ui.session.b
                        public final /* synthetic */ void a() {
                            v.this.D();
                        }
                    }, "logout");
                }
            }
        }
    }

    public void onVersionClick(View view) {
        com.ss.android.ugc.aweme.live.c cVar;
        String str;
        if (System.currentTimeMillis() - this.f122926b < 500) {
            this.f122925a++;
        } else {
            this.f122925a = 0;
        }
        if (this.f122925a >= 4) {
            com.ss.android.ugc.aweme.setting.unit.a.b bVar = this.ab;
            bVar.a(new b.c(bVar));
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.a().configService().avsettingsConfig();
            if (LiveOuterService.s() != null) {
                cVar = LiveOuterService.s().d();
            } else {
                cVar = null;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder append = sb.append("UserId: " + com.ss.android.ugc.aweme.account.b.g().getCurUserId()).append("\n").append("DeviceId: ".concat(String.valueOf(serverDeviceId))).append("\n").append("UpdateVersionCode: " + com.bytedance.ies.ugc.appcontext.d.d()).append("\n").append("Channel: " + com.bytedance.ies.ugc.appcontext.d.s).append("\n").append("GitSHA: " + com.bytedance.ies.ugc.appcontext.d.p).append("\n").append("VESDK: " + avsettingsConfig.getVESDKVersion()).append("\n").append("EffectSdk: " + avsettingsConfig.getEffectVersion()).append("\n");
            StringBuilder sb2 = new StringBuilder("LiveCore: ");
            if (cVar != null) {
                str = cVar.q();
            } else {
                str = "";
            }
            append.append(sb2.append(str).toString()).append("\n").append(com.ss.android.ugc.aweme.app.i.a());
            com.ss.android.ugc.aweme.setting.unit.a.b bVar2 = this.ab;
            String sb3 = sb.toString();
            l.d(sb3, "");
            bVar2.a(new b.C3185b(bVar2, sb3));
            this.f122925a = 0;
        }
        this.f122926b = System.currentTimeMillis();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        ap apVar;
        bc bcVar;
        bg bgVar;
        activityConfiguration(new w(this));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(f());
        this.f122930f = (PowerList) findViewById(R.id.bhi);
        this.z = new com.ss.android.ugc.aweme.setting.unit.a.c(new com.ss.android.ugc.aweme.setting.ui.b.c(getString(R.string.fq7), (byte) 0));
        this.f122934j = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233692, getString(R.string.d1x), new x(this), "account_and_safety", (byte) 0));
        this.f122936l = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233722, getString(R.string.cd), new ai(this), "privacy_manager", (byte) 0));
        this.S = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233724, getString(R.string.frv), new at(this), "security_center", (byte) 0));
        this.U = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233719, getString(R.string.ezn), be.f122863a, null));
        this.K = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233710, getString(R.string.fng), new bo(this), null));
        this.L = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233733, getString(R.string.gdz), new br(this), null));
        this.M = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233695, getString(R.string.a7s), new bs(this), null));
        this.G = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233732, getString(R.string.fx3), new bt(this), "order_center"));
        this.E = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233739, getString(R.string.hdp), new bu(this), "my_wallet", (byte) 0));
        this.I = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233720, getString(R.string.fnk), new y(this), null));
        this.H = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233726, getString(R.string.fp9), new z(this), "share_profile", (byte) 0));
        this.f122932h = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(getString(R.string.bk8), new aa(this)));
        this.P = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233703, " ", new ab(this), null));
        this.f122935k = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233718, getString(R.string.fnl), new ac(this), "notification_manager", (byte) 0));
        this.o = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233705, getString(R.string.fr2), new ad(this), "common_protocol", (byte) 0));
        this.f122933i = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233698, getString(R.string.fms), new ae(this), "content_preference", (byte) 0));
        this.T = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(R.raw.icon_headphone, getString(R.string.vx), new af(this), "background_audio"));
        this.p = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233715, getString(R.string.eg7), new ag(this), "notification_manager"));
        this.q = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(R.drawable.bfm, getString(R.string.d1d), new ah(this), "setting_ads"));
        this.f122937m = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233704, getString(R.string.ghe), new aj(this), "digital_wellbeing", (byte) 0));
        this.n = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233707, getString(R.string.bm), new ak(this), "family_pairing"));
        this.Q = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233691, getString(R.string.mx), new al(this), "accessibility", (byte) 0));
        this.R = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233672, getString(R.string.a2u), new am(this), "powermode", (byte) 0));
        this.N = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233730, "", null, null, (byte) 0));
        this.Z = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233689, " ", new an(this), "join_amplify"));
        this.x = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233696, getString(R.string.ago), new ao(this), "clear_cache", (byte) 0));
        String string = getString(R.string.b4l);
        if (com.ss.android.ugc.aweme.setting.l.c()) {
            apVar = new ap(this);
        } else {
            apVar = null;
        }
        this.V = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233702, string, apVar, null));
        this.B = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233714, getString(R.string.hdr), new aq(this), null));
        this.W = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233727, getString(R.string.ad5), new ar(this), null));
        this.s = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233721, getString(R.string.d_r), new as(this), "feedback_and_help", (byte) 0));
        this.r = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(R.drawable.bg1, getString(R.string.bwa), new au(this), "helper_center", (byte) 0));
        this.O = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233723, getString(R.string.ffh), new av(this), "safety_center", (byte) 0));
        this.y = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(R.drawable.bft, getString(R.string.b3y), new aw(this), "creators_portal", (byte) 0));
        this.aa = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233738, getString(R.string.enx), new ax(this), "live_subscription", (byte) 0));
        this.J = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233697, getString(R.string.as3), new ay(this), "community_guidelines", (byte) 0));
        this.t = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233728, getString(R.string.f0d), new az(this), "terms_of_use", (byte) 0));
        this.v = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233729, getString(R.string.eub), new ba(this), "privacy_policy", (byte) 0));
        this.w = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233699, getString(R.string.aur), new bb(this), "copyright_policy", (byte) 0));
        String string2 = getString(R.string.cqb);
        if (B()) {
            bcVar = new bc(this);
        } else {
            bcVar = null;
        }
        this.Y = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233712, string2, bcVar, "join_testers"));
        this.A = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233722, getString(R.string.b58), new bd(this), null));
        this.u = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233690, getString(R.string.mk), new bf(this), null));
        String string3 = getString(R.string.fm7);
        if (E()) {
            bgVar = new bg(this);
        } else {
            bgVar = null;
        }
        this.X = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(2131233736, string3, bgVar, null));
        this.D = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(R.drawable.bez, getString(R.string.apt), new bh(this), "switch_account"));
        com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
        aVar.f44749a = R.raw.icon_arrow_to_left;
        this.C = new c(new com.ss.android.ugc.aweme.be.d(getString(R.string.d0u), aVar, new bi(this), "logout"));
        this.ab = new com.ss.android.ugc.aweme.setting.unit.a.b(new com.ss.android.ugc.aweme.setting.ui.b.b("settings_footer_container", getResources().getColor(R.color.f159928l), new bj(this), new bk(this), (byte) 0));
        this.ac = new d(new e(getString(R.string.fp6), (byte) 0));
        this.ad = new d(new e(getString(R.string.atv)));
        this.ae = new d(new e(getString(R.string.a8l)));
        this.af = new d(new e(getString(R.string.gar)));
        this.ag = new d(new e(getString(R.string.fp5)));
        this.ah = new d(new e(getString(R.string.fp8), true, false));
        dm dmVar = new dm(this.f122930f);
        this.f122931g = dmVar;
        dmVar.f82878a.a(CommonItemViewCell.class);
        this.f122931g.f82878a.a(SettingFooterCell.class);
        this.f122931g.f82878a.a(SettingUnLoginCell.class);
        this.f122931g.a(this.ac);
        this.f122931g.a(this.z);
        this.f122931g.a(this.f122934j);
        this.f122931g.a(this.f122936l);
        this.f122931g.a(this.S);
        this.f122931g.a(this.U);
        this.f122931g.a(this.K);
        this.f122931g.a(this.L);
        this.f122931g.a(this.M);
        this.f122931g.a(this.G);
        this.f122931g.a(this.E);
        this.f122931g.a(this.I);
        this.f122931g.a(this.H);
        this.f122931g.a(this.f122932h);
        this.f122931g.a(this.P);
        this.f122931g.a(this.ad);
        this.f122931g.a(this.f122935k);
        this.f122931g.a(this.aa);
        this.f122931g.a(this.o);
        this.f122931g.a(this.f122933i);
        this.f122931g.a(this.T);
        this.f122931g.a(this.p);
        this.f122931g.a(this.q);
        this.f122931g.a(this.f122937m);
        this.f122931g.a(this.n);
        this.f122931g.a(this.Q);
        this.f122931g.a(this.R);
        this.f122931g.a(this.N);
        this.f122931g.a(this.Z);
        this.f122931g.a(this.ae);
        this.f122931g.a(this.x);
        this.f122931g.a(this.V);
        this.f122931g.a(this.B);
        this.f122931g.a(this.W);
        this.f122931g.a(this.af);
        this.f122931g.a(this.s);
        this.f122931g.a(this.r);
        this.f122931g.a(this.O);
        this.f122931g.a(this.y);
        this.f122931g.a(this.ag);
        this.f122931g.a(this.J);
        this.f122931g.a(this.t);
        this.f122931g.a(this.v);
        this.f122931g.a(this.w);
        this.f122931g.a(this.Y);
        this.f122931g.a(this.A);
        this.f122931g.a(this.u);
        this.f122931g.a(this.X);
        this.f122931g.a(this.ah);
        this.f122931g.a(this.D);
        this.f122931g.a(this.C);
        this.f122931g.a(this.ab);
        this.f122927c = findViewById(R.id.e_f);
        this.f122928d = (ViewGroup) findViewById(R.id.dqe);
        this.f122929e = (TextTitleBar) findViewById(R.id.em8);
        a();
        c();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public void onAccountResult(int i2, boolean z2, int i3, User user) {
        com.ss.android.ugc.aweme.login.a aVar;
        if (!isFinishing() && (aVar = this.ak) != null && aVar.isShowing()) {
            this.ak.dismiss();
        }
    }
}
