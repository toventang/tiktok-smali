package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ee;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.inbox.q;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.notification.e.a.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class c implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f44367a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.uikit.a.b f44368b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.tiktok.homepage.mainpagefragment.dialog.c f44369c;

    /* renamed from: d  reason: collision with root package name */
    public TabChangeManager f44370d;

    /* renamed from: e  reason: collision with root package name */
    public IAccountService.b f44371e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f44372f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f44373g = true;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f44374h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f44375i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f44376j;

    /* renamed from: k  reason: collision with root package name */
    private final View f44377k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.compliance.api.c.f f44378l;

    /* renamed from: m  reason: collision with root package name */
    private final ScrollSwitchStateManager f44379m;
    private final MainAnimViewModel n;
    private boolean o;
    private int p;
    private boolean q = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
    private final DmNoticeProxy r;
    private final h.h s;

    static {
        Covode.recordClassIndex(27179);
    }

    public final DrawerViewModel a() {
        return (DrawerViewModel) this.s.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(142, new org.greenrobot.eventbus.g(c.class, "onNotificationIndicatorEvent", m.class, ThreadMode.MAIN, 0, true));
        hashMap.put(267, new org.greenrobot.eventbus.g(c.class, "onDoubleClickInbox", com.ss.android.ugc.aweme.notice.api.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$c  reason: collision with other inner class name */
    public static final class C1085c implements com.ss.android.ugc.aweme.homepage.story.container.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44389a;

        static {
            Covode.recordClassIndex(27184);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(int i2, boolean z, boolean z2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.e
        public final void b(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.e
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.e
        public final void d() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a() {
            this.f44389a.f44369c.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1085c(c cVar) {
            this.f44389a = cVar;
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f44393a;

        static {
            Covode.recordClassIndex(27187);
        }

        f(Map map) {
            this.f44393a = map;
        }

        public final void run() {
            r.a("double_click_tab_name", this.f44393a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44396a;

        static {
            Covode.recordClassIndex(27190);
        }

        i(c cVar) {
            this.f44396a = cVar;
        }

        public final void run() {
            this.f44396a.c();
        }
    }

    public static final class a implements com.bytedance.tiktok.homepage.mainpagefragment.dialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScrollSwitchStateManager f44381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainAnimViewModel f44382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1085c f44383d;

        static {
            Covode.recordClassIndex(27180);
        }

        /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$a$a  reason: collision with other inner class name */
        static final class RunnableC1084a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f44384a;

            static {
                Covode.recordClassIndex(27181);
            }

            RunnableC1084a(a aVar) {
                this.f44384a = aVar;
            }

            public final void run() {
                this.f44384a.f44380a.a().b(this.f44384a.f44383d);
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f44385a;

            static {
                Covode.recordClassIndex(27182);
            }

            b(a aVar) {
                this.f44385a = aVar;
            }

            public final void run() {
                this.f44385a.f44380a.a().b(this.f44385a.f44383d);
            }
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.b
        public final void b() {
            this.f44380a.f44373g = false;
            this.f44380a.d();
            Handler handler = this.f44380a.f44372f;
            if (handler != null) {
                handler.post(new b(this));
            }
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.b
        public final void c() {
            if (com.ss.android.ugc.aweme.notice.api.ab.b.b()) {
                this.f44380a.f44373g = false;
                this.f44380a.d();
                Handler handler = this.f44380a.f44372f;
                if (handler != null) {
                    handler.post(new RunnableC1084a(this));
                }
            }
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.b
        public final void d() {
            this.f44380a.f44373g = true;
            this.f44380a.c();
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b bVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b) HomeTabViewModel.a.a(this.f44380a.f44367a).a("PUBLISH");
            if (bVar != null) {
                bVar.j();
            }
            com.ss.android.ugc.aweme.notification.e.a.b.a("MainPageFragment", "UnReadCountMonitor isShowNotifyPop: " + this.f44380a.f44369c.f44314i);
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.b
        public final void a() {
            this.f44380a.a(true);
            c cVar = this.f44380a;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f44381b;
            MainAnimViewModel mainAnimViewModel = this.f44382c;
            l.d(scrollSwitchStateManager, "");
            l.d(mainAnimViewModel, "");
            if (!l.a((Object) "NOTIFICATION", (Object) cVar.f44370d.f109107d)) {
                cVar.f44370d.a("NOTIFICATION", false);
                v.O().B();
                com.ss.android.ugc.aweme.video.k.a().b();
                cVar.h();
                scrollSwitchStateManager.a(false);
                com.bytedance.ies.uikit.a.b bVar = cVar.f44368b;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
                ((MainPageFragment) bVar).b(true);
                s.a(af.NOTICE);
            }
            cVar.f44369c.a();
        }

        a(c cVar, ScrollSwitchStateManager scrollSwitchStateManager, MainAnimViewModel mainAnimViewModel, C1085c cVar2) {
            this.f44380a = cVar;
            this.f44381b = scrollSwitchStateManager;
            this.f44382c = mainAnimViewModel;
            this.f44383d = cVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f44392a;

        static {
            Covode.recordClassIndex(27186);
        }

        e(HashMap hashMap) {
            this.f44392a = hashMap;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            r.a("enter_homepage_message", this.f44392a);
            return null;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(27192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            return DrawerViewModel.a.a(this.this$0.f44367a);
        }
    }

    public final void h() {
        com.ss.android.ugc.aweme.main.h.a.b(this.f44368b.getActivity());
    }

    private final void i() {
        if (this.f44368b.ab_()) {
            if (com.ss.android.ugc.aweme.notice.api.b.c(12)) {
                com.ss.android.ugc.aweme.notice.api.b.d(12);
            }
        }
    }

    private final void j() {
        if (this.f44368b.ab_()) {
            if (com.ss.android.ugc.aweme.notice.api.b.c(1000)) {
                com.ss.android.ugc.aweme.notice.api.b.d(1000);
            }
        }
    }

    public final void f() {
        com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar;
        if (this.f44368b.ab_() && (aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(this.f44367a).b("USER")) != null) {
            aVar.n();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f44390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44391b;

        static {
            Covode.recordClassIndex(27185);
        }

        d(int i2, int i3) {
            this.f44390a = i2;
            this.f44391b = i3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final Object call() {
            HashMap hashMap = new HashMap();
            if (this.f44390a > 0) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(this.f44390a));
                hashMap.put("previous_show_cnt", String.valueOf(this.f44391b));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
            r.a("message_notice_show", hashMap);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44395a;

        static {
            Covode.recordClassIndex(27189);
        }

        h(c cVar) {
            this.f44395a = cVar;
        }

        public final void run() {
            Handler handler;
            if ((ActivityStack.getTopActivity() instanceof com.bytedance.ies.ugc.aweme.commercialize.splash.show.a) || this.f44395a.f44369c.f44317l) {
                Runnable runnable = this.f44395a.f44374h;
                if (runnable != null && (handler = this.f44395a.f44372f) != null) {
                    handler.postDelayed(runnable, 5000);
                    return;
                }
                return;
            }
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.f44395a.f44369c;
            if (!cVar.f44315j || !cVar.f44314i) {
                this.f44395a.f44369c.f44314i = true;
                this.f44395a.f44373g = false;
                this.f44395a.d();
            }
        }
    }

    private final void k() {
        int b2 = com.ss.android.ugc.aweme.notification.redpoint.g.b();
        if (b2 > this.p) {
            this.o = false;
        }
        if (!this.o) {
            boolean a2 = com.ss.android.ugc.aweme.notification.redpoint.g.a();
            if (b2 > 0 || a2) {
                b.i.b(new d(b2, this.p), r.a());
                this.o = true;
                this.p = b2;
            }
        }
    }

    public final void b() {
        Handler handler;
        this.f44372f = new Handler(Looper.getMainLooper());
        this.f44374h = new h(this);
        Handler handler2 = this.f44372f;
        if (handler2 != null) {
            handler2.post(new i(this));
        }
        this.f44373g = true;
        this.f44369c.f44314i = false;
        Runnable runnable = this.f44374h;
        if (runnable != null && (handler = this.f44372f) != null) {
            handler.postDelayed(runnable, 5000);
        }
    }

    public final void c() {
        if (this.f44368b.ab_()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "MainPageFragment", "UnReadCountMonitor hideNoticeCount");
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(this.f44367a).b("NOTIFICATION");
            if (aVar != null) {
                aVar.a(true, -1);
            }
        }
    }

    public final void d() {
        if (this.f44368b.ab_()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                e();
                return;
            }
            k();
            int b2 = com.ss.android.ugc.aweme.notification.redpoint.g.b();
            com.ss.android.ugc.aweme.inbox.d.d.a(b2);
            a(b2);
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(this.f44367a).b("NOTIFICATION");
            if (aVar != null) {
                aVar.a(true, b2);
            }
        }
    }

    public final void e() {
        if (this.f44368b.ab_()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "MainPageFragment", "UnReadCountMonitor hideNotificationDot");
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(this.f44367a).b("NOTIFICATION");
            if (aVar != null) {
                aVar.n();
            }
            if (com.ss.android.ugc.aweme.notice.api.b.c(0)) {
                com.ss.android.ugc.aweme.notice.api.b.d(0);
            }
            i();
            j();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f44387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f44388c;

        static {
            Covode.recordClassIndex(27183);
        }

        b(c cVar, Integer num, m mVar) {
            this.f44386a = cVar;
            this.f44387b = num;
            this.f44388c = mVar;
        }

        public final void run() {
            c cVar = this.f44386a;
            Integer num = this.f44387b;
            l.b(num, "");
            int intValue = num.intValue();
            m mVar = this.f44388c;
            Integer num2 = this.f44387b;
            l.b(num2, "");
            cVar.a(intValue, mVar.a(num2.intValue()));
            Integer num3 = this.f44387b;
            l.b(num3, "");
            if (com.ss.android.ugc.aweme.notification.redpoint.g.b(num3.intValue()) && !this.f44386a.f44373g && !this.f44386a.f44369c.f44315j) {
                this.f44386a.d();
            }
        }
    }

    public final void g() {
        if (this.f44368b.ab_() && !com.ss.android.ugc.aweme.im.a.a.a() && !com.ss.android.ugc.aweme.im.a.a.b()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                e();
            } else if (com.ss.android.ugc.aweme.notification.redpoint.g.b() > 0) {
                e();
            } else {
                k();
                com.ss.android.ugc.aweme.framework.a.a.a(4, "MainPageFragment", "UnReadCountMonitor showNotificationDot");
                com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(this.f44367a).b("NOTIFICATION");
                if (aVar != null) {
                    aVar.a(false, 0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f44394a;

        static {
            Covode.recordClassIndex(27188);
        }

        g(int i2) {
            this.f44394a = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "UnReadCountMonitor MainPageFragment reverse state:" + com.ss.android.ugc.aweme.inbox.a.a.a());
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "UnReadCountMonitor MainPageFragment showNoticeCountOptimize: [all," + this.f44394a + "][99," + com.ss.android.ugc.aweme.notice.api.b.a(99) + "][7," + com.ss.android.ugc.aweme.notice.api.b.a(7) + "][12," + com.ss.android.ugc.aweme.notice.api.b.a(12) + "][13," + com.ss.android.ugc.aweme.notice.api.b.a(13) + "][2," + com.ss.android.ugc.aweme.notice.api.b.a(2) + "][6," + com.ss.android.ugc.aweme.notice.api.b.a(6) + "][3," + com.ss.android.ugc.aweme.notice.api.b.a(3) + "][14," + com.ss.android.ugc.aweme.notice.api.b.a(14) + "][43," + com.ss.android.ugc.aweme.notice.api.b.a(43) + "][47," + com.ss.android.ugc.aweme.notice.api.b.a(47) + "][62," + com.ss.android.ugc.aweme.notice.api.b.a(62) + "][81," + com.ss.android.ugc.aweme.notice.api.b.a(81) + "][21," + com.ss.android.ugc.aweme.notice.api.b.a(21) + "][228," + com.ss.android.ugc.aweme.notice.api.b.a(228) + "]");
            return null;
        }
    }

    private static void a(int i2) {
        b.i.b(new g(i2), b.i.f4824a);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onDoubleClickInbox(com.ss.android.ugc.aweme.notice.api.b.a aVar) {
        l.d(aVar, "");
        int b2 = com.ss.android.ugc.aweme.notification.redpoint.g.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        if (b2 > 0) {
            linkedHashMap.put("notice_type", "number_dot");
            linkedHashMap.put("show_cnt", String.valueOf(b2));
        } else if (com.ss.android.ugc.aweme.notification.redpoint.g.a()) {
            linkedHashMap.put("notice_type", "yellow_dot");
            linkedHashMap.put("show_cnt", "0");
        } else {
            linkedHashMap.put("show_cnt", "0");
        }
        r.a().execute(new f(linkedHashMap));
    }

    public final void a(boolean z) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("notice_type", "bubble");
            int c2 = com.ss.android.ugc.aweme.notification.redpoint.g.c();
            int[] iArr = (int[]) com.ss.android.ugc.aweme.notification.redpoint.g.f113809a.getValue();
            hashMap.put("show_cnt", String.valueOf(com.ss.android.ugc.aweme.notice.api.b.a(Arrays.copyOf(iArr, iArr.length)) + c2));
        } else if (com.ss.android.ugc.aweme.notification.redpoint.g.a()) {
            hashMap.put("notice_type", "yellow_dot");
        } else {
            int b2 = com.ss.android.ugc.aweme.notification.redpoint.g.b();
            if (b2 > 0) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(b2));
            }
        }
        hashMap.put("message_cnt", String.valueOf(com.ss.android.ugc.aweme.notification.redpoint.g.c()));
        TabChangeManager tabChangeManager = this.f44370d;
        Fragment fragment = null;
        if (!(tabChangeManager == null || !tabChangeManager.a() || tabChangeManager.f109109f == null)) {
            androidx.fragment.app.i iVar = tabChangeManager.f109109f;
            if (iVar == null) {
                l.b();
            }
            fragment = iVar.a("NOTIFICATION");
        }
        if (fragment instanceof com.ss.android.ugc.aweme.notification.b) {
            str = ((com.ss.android.ugc.aweme.notification.b) fragment).h();
        } else if (fragment instanceof com.ss.android.ugc.aweme.inbox.l) {
            str = "chat";
        } else {
            str = "all";
        }
        hashMap.put("tab_name", str);
        String str3 = "1";
        if (q.CONTACTS.decideDisplay(this.f44367a) != com.ss.android.ugc.aweme.inbox.r.GONE) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("is_auth_show", str2);
        if (q.THIRD_PLATFORM.decideDisplay(this.f44367a) == com.ss.android.ugc.aweme.inbox.r.GONE) {
            str3 = "0";
        }
        hashMap.put("is_invite_show", str3);
        b.i.b(new e(hashMap), r.a());
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN, b = true)
    public final void onNotificationIndicatorEvent(m mVar) {
        String str;
        if (mVar != null) {
            com.ss.android.ugc.aweme.compliance.api.c.f fVar = this.f44378l;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f44379m;
            MainAnimViewModel mainAnimViewModel = this.n;
            l.d(mVar, "");
            l.d(fVar, "");
            l.d(scrollSwitchStateManager, "");
            l.d(mainAnimViewModel, "");
            l.d("MainPageFragment", "");
            b.i.b(new b.a(mVar, "MainPageFragment"), b.i.f4824a);
            DmNoticeProxy dmNoticeProxy = this.r;
            if (this.f44379m.b() instanceof com.ss.android.ugc.aweme.notification.b) {
                str = "notification_page";
            } else {
                if (this.f44379m.b() instanceof ae) {
                    if (this.f44379m.c() instanceof com.ss.android.ugc.aweme.feed.ui.af) {
                        str = "homepage_hot";
                    } else if (this.f44379m.c() instanceof p) {
                        str = "homepage_follow";
                    }
                }
                str = "";
            }
            dmNoticeProxy.a(mVar, str);
            C1085c cVar = new C1085c(this);
            a().a(cVar);
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar2 = this.f44369c;
            int i2 = mVar.f112697a;
            TabChangeManager tabChangeManager = this.f44370d;
            com.bytedance.ies.uikit.a.b bVar = this.f44368b;
            View view = this.f44377k;
            DrawerViewModel a2 = a();
            a aVar = new a(this, scrollSwitchStateManager, mainAnimViewModel, cVar);
            l.d(fVar, "");
            l.d(tabChangeManager, "");
            l.d(bVar, "");
            l.d(view, "");
            l.d(scrollSwitchStateManager, "");
            l.d(a2, "");
            l.d(aVar, "");
            cVar2.f44307b = fVar;
            cVar2.f44308c = tabChangeManager;
            cVar2.f44309d = bVar;
            cVar2.f44311f = view;
            cVar2.f44312g = scrollSwitchStateManager;
            cVar2.f44310e = aVar;
            cVar2.f44313h = a2;
            if (!cVar2.f44314i && i2 == -3) {
                cVar2.b();
            }
            if (mVar.f112699c == null || !this.q) {
                l.d(mVar, "");
                if (mVar.f112698b == -1) {
                    com.ss.android.ugc.aweme.notice.api.b.d(mVar.f112697a);
                    if (!com.ss.android.ugc.aweme.notification.redpoint.g.a(mVar.f112697a)) {
                        e();
                    } else {
                        return;
                    }
                }
                if (com.ss.android.ugc.aweme.notification.redpoint.g.a(mVar.f112697a)) {
                    com.ss.android.ugc.aweme.notice.api.b.a(mVar.f112697a, mVar.f112698b);
                    if (mVar.f112698b <= 0 || TextUtils.equals("NOTIFICATION", this.f44370d.f109107d)) {
                        e();
                    } else {
                        g();
                    }
                } else if (com.ss.android.ugc.aweme.notification.redpoint.g.b(mVar.f112697a)) {
                    com.ss.android.ugc.aweme.notice.api.b.a(mVar.f112697a, mVar.f112698b);
                    if (!this.f44373g && !this.f44369c.f44315j) {
                        d();
                    }
                }
                if (mVar.f112697a == 1000) {
                    EventBus.a().b(m.class);
                    return;
                }
                return;
            }
            for (Integer num : mVar.f112699c.keySet()) {
                if (ee.f89903c) {
                    com.bytedance.aweme.b.a.f25788b.f25790a.post(new b(this, num, mVar));
                } else {
                    l.b(num, "");
                    a(num.intValue(), mVar.a(num.intValue()));
                    if (com.ss.android.ugc.aweme.notification.redpoint.g.b(num.intValue()) && !this.f44373g && !this.f44369c.f44315j) {
                        d();
                    }
                }
            }
        }
    }

    public final void a(int i2, int i3) {
        if (i3 == -1) {
            com.ss.android.ugc.aweme.notice.api.b.d(i2);
            if (!com.ss.android.ugc.aweme.notification.redpoint.g.a(i2)) {
                e();
            } else {
                return;
            }
        }
        if (com.ss.android.ugc.aweme.notification.redpoint.g.a(i2)) {
            com.ss.android.ugc.aweme.notice.api.b.a(i2, i3);
            if (i3 <= 0 || TextUtils.equals("NOTIFICATION", this.f44370d.f109107d)) {
                e();
            } else {
                g();
            }
        } else if (com.ss.android.ugc.aweme.notification.redpoint.g.b(i2)) {
            com.ss.android.ugc.aweme.notice.api.b.a(i2, i3);
        }
        if (i2 == 1000) {
            EventBus.a().b(m.class);
        }
    }

    public static final class j implements IAccountService.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44397a;

        static {
            Covode.recordClassIndex(27191);
        }

        public j(c cVar) {
            this.f44397a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.b
        public final void onAccountResult(int i2, boolean z, int i3, User user) {
            if (z) {
                this.f44397a.b();
            }
        }
    }

    public c(androidx.fragment.app.e eVar, View view, com.bytedance.ies.uikit.a.b bVar, com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar, TabChangeManager tabChangeManager, com.ss.android.ugc.aweme.compliance.api.c.f fVar, ScrollSwitchStateManager scrollSwitchStateManager, MainAnimViewModel mainAnimViewModel) {
        l.d(eVar, "");
        l.d(view, "");
        l.d(bVar, "");
        l.d(cVar, "");
        l.d(tabChangeManager, "");
        l.d(fVar, "");
        l.d(scrollSwitchStateManager, "");
        l.d(mainAnimViewModel, "");
        this.f44367a = eVar;
        this.f44377k = view;
        this.f44368b = bVar;
        this.f44369c = cVar;
        this.f44370d = tabChangeManager;
        this.f44378l = fVar;
        this.f44379m = scrollSwitchStateManager;
        this.n = mainAnimViewModel;
        DmNoticeProxy e2 = DmNoticeProxyImpl.e();
        l.b(e2, "");
        this.r = e2;
        this.s = h.i.a((h.f.a.a) new k(this));
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.inbox.d.d.f104103a = SystemClock.uptimeMillis();
        com.ss.android.ugc.aweme.notice.api.services.b.f112773a.c();
        this.f44376j = true;
    }
}
