package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.setting.d.f;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class k extends h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> implements i, j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f117997i = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public Keva f117998h;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f117999j;

    static {
        Covode.recordClassIndex(76538);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(214, new g(k.class, "onSwitchToCreatorAccount", f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(215, new g(k.class, "onSwitchToBusinessAccount", com.ss.android.ugc.aweme.setting.d.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(216, new g(k.class, "onSwitchToPersonalAccount", com.ss.android.ugc.aweme.setting.d.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(217, new g(k.class, "onShowBASuggestBubbleEvent", com.ss.android.ugc.aweme.setting.d.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76539);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.d.SuggestBA;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h
    public final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> v() {
        return n.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.d.FindFriends);
    }

    public static User z() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return g2.getCurUser();
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void p() {
        super.p();
        View t = t();
        if (t != null) {
            t.removeCallbacks(this.f117999j);
        }
        EventBus.a().b(this);
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f118001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f118002b;

        static {
            Covode.recordClassIndex(76542);
        }

        d(k kVar, User user) {
            this.f118001a = kVar;
            this.f118002b = user;
        }

        public final void run() {
            com.ss.android.ugc.aweme.commerce.d bizAccountInfo;
            k kVar = this.f118001a;
            User user = this.f118002b;
            if (!kVar.f117998h.getBoolean("has_shown_tips", false) && user != null && (bizAccountInfo = user.getBizAccountInfo()) != null && bizAccountInfo.getSuggestedAccountsEntranceTipType() == 1) {
                kVar.a(true);
                r.a("ttelite_BA_add_business_red_dot_show", new com.ss.android.ugc.aweme.app.f.d().a("user_category", user.getCategory()).f66730a);
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f118003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f118004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f118005c;

        static {
            Covode.recordClassIndex(76543);
        }

        e(View view, k kVar, User user) {
            this.f118003a = view;
            this.f118004b = kVar;
            this.f118005c = user;
        }

        public final void run() {
            Context ar_ = this.f118004b.ar_();
            if (ar_ != null) {
                ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(ar_).b(this.f118003a).a(com.bytedance.tux.tooltip.h.BOTTOM)).e(R.string.gkw).a(5000L).b(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.k.e.AnonymousClass1 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(76544);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        String str;
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        User user = this.this$0.f118005c;
                        if (user != null) {
                            str = user.getCategory();
                        } else {
                            str = null;
                        }
                        r.a("ttelite_BA_add_business_bubble_show", dVar.a("user_category", str).f66730a);
                        return z.f158842a;
                    }
                }).d().a();
            }
        }
    }

    public k() {
        String str;
        StringBuilder sb = new StringBuilder("BA_SUGGESTED_ACCOUNT");
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        this.f117998h = Keva.getRepo(sb.append(str).toString());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        EventBus.a(EventBus.a(), this);
        if (!s() || !in.h(z())) {
            y();
        } else {
            x();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(76541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            com.ss.android.ugc.aweme.commerce.d bizAccountInfo;
            this.this$0.a(false);
            this.this$0.f117998h.storeBoolean("has_shown_tips", true);
            Context ar_ = this.this$0.ar_();
            User z = k.z();
            String str2 = null;
            if (z == null || (bizAccountInfo = z.getBizAccountInfo()) == null) {
                str = null;
            } else {
                str = bizAccountInfo.getSuggestedAccountsLynxSchema();
            }
            SmartRouter.buildRoute(ar_, str).open();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            User z2 = k.z();
            if (z2 != null) {
                str2 = z2.getCategory();
            }
            r.a("ttelite_BA_add_business_icon_click", dVar.a("user_category", str2).f66730a);
            return z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(f fVar) {
        l.d(fVar, "");
        y();
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(com.ss.android.ugc.aweme.setting.d.b bVar) {
        l.d(bVar, "");
        y();
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118000a = new b();

        static {
            Covode.recordClassIndex(76540);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_briefcase_plus;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(com.bytedance.tux.c.c.a(b.f118000a)).a((h.f.a.a<z>) new c(this));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(com.ss.android.ugc.aweme.setting.d.e eVar) {
        l.d(eVar, "");
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (in.h(curUser)) {
            x();
        }
        View t = t();
        if (t != null) {
            t.post(new d(this, curUser));
        }
    }

    @org.greenrobot.eventbus.r
    public final void onShowBASuggestBubbleEvent(com.ss.android.ugc.aweme.setting.d.d dVar) {
        com.ss.android.ugc.aweme.commerce.d bizAccountInfo;
        l.d(dVar, "");
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        com.ss.android.ugc.aweme.profile.widgets.navbar.a.g gVar = ((com.ss.android.ugc.aweme.profile.widgets.navbar.a.c) this).f117963g;
        if (gVar == null) {
            l.a("service");
        }
        if (gVar.c(u()) && !this.f117998h.getBoolean("has_shown_tips", false) && curUser != null && (bizAccountInfo = curUser.getBizAccountInfo()) != null && bizAccountInfo.getSuggestedAccountsEntranceTipType() == 2) {
            a(false);
            View t = t();
            if (t != null) {
                e eVar = new e(t, this, curUser);
                this.f117999j = eVar;
                t.postDelayed(eVar, 300);
            }
            this.f117998h.storeBoolean("has_shown_tips", true);
        }
    }
}
