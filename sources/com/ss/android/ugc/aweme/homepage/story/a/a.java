package com.ss.android.ugc.aweme.homepage.story.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.ag;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.feed.ak;
import com.ss.android.ugc.aweme.feed.i.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.profile.f.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class a extends com.bytedance.assem.arch.d.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final d u = new d((byte) 0);
    private final h.h A;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f99235j;

    /* renamed from: k  reason: collision with root package name */
    public androidx.fragment.app.e f99236k;

    /* renamed from: l  reason: collision with root package name */
    public DrawerViewModel f99237l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f99238m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    private boolean v;
    private final com.bytedance.assem.arch.viewModel.b w;
    private final h.h x;
    private HomePageDataViewModel y;
    private final h.h z;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, com.ss.android.ugc.aweme.homepage.story.feed.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(63224);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.feed.d invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(63222);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(232, new org.greenrobot.eventbus.g(a.class, "onComplianceDialogCheckEvent", com.ss.android.ugc.aweme.compliance.api.b.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(233, new org.greenrobot.eventbus.g(a.class, "onRestoreDialogCheckEvent", aa.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final StorySidebarFeedVM u() {
        return (StorySidebarFeedVM) this.w.getValue();
    }

    public final Keva v() {
        return (Keva) this.z.getValue();
    }

    /* access modifiers changed from: package-private */
    public final int w() {
        return ((Number) this.A.getValue()).intValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(63226);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.b.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f99241a = new e();

        static {
            Covode.recordClassIndex(63227);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.b.e.a invoke() {
            return new com.bytedance.b.e.a();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f99249a = new n();

        static {
            Covode.recordClassIndex(63236);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("repo_story_cold_start");
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        cg.a(this);
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void p() {
        super.p();
        cg.b(this);
    }

    static final class f extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f99242a = new f();

        static {
            Covode.recordClassIndex(63228);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("tiktok_story_sidebar_auto_show_count_limit_per_day", 2));
        }
    }

    static String z() {
        User c2 = ai.c();
        if (c2 != null) {
            return c2.getUid();
        }
        return null;
    }

    public final boolean x() {
        if (!v().getBoolean("key_guide_animation_has_shown", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.a.a$a  reason: collision with other inner class name */
    public static final class C2427a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2427a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void n() {
        super.n();
        if (!((com.bytedance.b.e.a) this.x.getValue()).f26184a && com.bytedance.ies.ugc.appcontext.f.j() == null) {
            this.v = true;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f99239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f99240b;

        static {
            Covode.recordClassIndex(63225);
        }

        c(FrameLayout frameLayout, FrameLayout frameLayout2) {
            this.f99239a = frameLayout;
            this.f99240b = frameLayout2;
        }

        public final void run() {
            float f2;
            View findViewById = this.f99239a.findViewById(R.id.bxd);
            h.f.b.l.b(findViewById, "");
            AnimationImageView animationImageView = (AnimationImageView) findViewById;
            if (animationImageView != null) {
                if (gb.a(this.f99240b.getContext())) {
                    f2 = -1.0f;
                } else {
                    f2 = 1.0f;
                }
                animationImageView.setScaleX(f2);
                animationImageView.b(true);
                animationImageView.setAnimation("story_guide_hand_swip_lottie.json");
                animationImageView.a();
            }
        }
    }

    public final boolean y() {
        long j2 = v().getLong("key_guide_show_last_time_" + z(), 0);
        int i2 = v().getInt("key_guide_show_count_limit_" + z(), 0);
        if (j2 == 0 || ib.a(Long.valueOf(j2)) > 0) {
            return true;
        }
        if (ib.a(Long.valueOf(j2)) != 0 || i2 >= w()) {
            return false;
        }
        return true;
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(StorySidebarFeedVM.class);
        C2427a aVar2 = new C2427a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.w = bVar;
        this.x = h.i.a((h.f.a.a) e.f99241a);
        this.z = h.i.a((h.f.a.a) n.f99249a);
        this.A = h.i.a((h.f.a.a) f.f99242a);
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        String str;
        super.j();
        if (this.v) {
            this.v = false;
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
            if (b2 != null) {
                this.y = HomePageDataViewModel.a.a(b2);
                Aweme a2 = AwemeChangeCallBack.a(b2);
                if (a2 != null && !a2.isAd() && this.f99238m) {
                    if (v().getInt("key_setting", 0) == 5) {
                        if (v().getLong("key_tutorial_last_time", 0) != 0) {
                            com.ss.android.ugc.aweme.story.g gVar = com.ss.android.ugc.aweme.story.g.f137757a;
                            HomePageDataViewModel homePageDataViewModel = this.y;
                            if (homePageDataViewModel == null || (str = homePageDataViewModel.c()) == null) {
                                str = "";
                            }
                            gVar.a(b2, str);
                        }
                    } else if (!x() && y()) {
                        List<Aweme> h2 = u().h();
                        ArrayList arrayList = new ArrayList();
                        for (T t2 : h2) {
                            UserStory userStory = t2.getUserStory();
                            if (userStory != null && !userStory.getAllViewed()) {
                                arrayList.add(t2);
                            }
                        }
                        if (arrayList.size() >= com.ss.android.ugc.aweme.homepage.experiment.c.a()) {
                            u().j();
                        }
                    }
                }
            }
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.homepage.story.container.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99243a;

        static {
            Covode.recordClassIndex(63229);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(int i2, boolean z, boolean z2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.d
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.d
        public final void d() {
        }

        g(a aVar) {
            this.f99243a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(float f2) {
            if (this.f99243a.f99235j != null) {
                this.f99243a.a("");
                DrawerViewModel drawerViewModel = this.f99243a.f99237l;
                if (drawerViewModel != null) {
                    drawerViewModel.b(this);
                }
            }
        }
    }

    public static final class h implements com.bytedance.hox.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99244a;

        static {
            Covode.recordClassIndex(63230);
        }

        h(a aVar) {
            this.f99244a = aVar;
        }

        @Override // com.bytedance.hox.a.d
        public final void a(Bundle bundle) {
            h.f.b.l.d(bundle, "");
            this.f99244a.f99238m = true;
        }

        @Override // com.bytedance.hox.a.d
        public final void b(Bundle bundle) {
            h.f.b.l.d(bundle, "");
            this.f99244a.f99238m = false;
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99248a;

        static {
            Covode.recordClassIndex(63235);
        }

        m(a aVar) {
            this.f99248a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f99248a.a("auto");
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onComplianceDialogCheckEvent(com.ss.android.ugc.aweme.compliance.api.b.a aVar) {
        if (aVar != null) {
            this.r = true;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onRestoreDialogCheckEvent(aa aaVar) {
        if (aaVar != null) {
            this.s = true;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99246a;

        static {
            Covode.recordClassIndex(63233);
        }

        k(a aVar) {
            this.f99246a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f99246a.a("click");
        }
    }

    static final class l<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99247a;

        static {
            Covode.recordClassIndex(63234);
        }

        l(a aVar) {
            this.f99247a = aVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            h.f.b.l.d(obj, "");
            FrameLayout frameLayout = this.f99247a.f99235j;
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            this.f99236k = b2;
            Hox.a.a(b2).a("HOME", new h(this));
            f.a.a(this, u(), b.f99250a, (com.bytedance.assem.arch.viewModel.k) null, new i(this), 6);
            AwemeChangeCallBack.a(b2, b2, new j(this));
        }
    }

    public final void a(String str) {
        DrawerViewModel drawerViewModel;
        t<Boolean> tVar;
        MethodCollector.i(4714);
        h.f.b.l.d(str, "");
        if (!(this.f99236k == null || (drawerViewModel = this.f99237l) == null || (tVar = drawerViewModel.f99261d) == null)) {
            tVar.postValue(false);
        }
        FrameLayout frameLayout = this.f99235j;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.f99235j = null;
        if (!TextUtils.isEmpty(str)) {
            ak.a("exit", str);
        }
        u().k();
        MethodCollector.o(4714);
    }

    static final class j implements AwemeChangeCallBack.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99245a;

        static {
            Covode.recordClassIndex(63232);
        }

        j(a aVar) {
            this.f99245a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b6, code lost:
            if (r8 != null) goto L_0x00ed;
         */
        @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
            /*
            // Method dump skipped, instructions count: 490
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.a.a.j.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<p, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(63231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(pVar, "");
            int i2 = this.this$0.v().getInt("key_setting", 0);
            if (i2 > 0 && i2 != 5 && this.this$0.v().getBoolean("key_new_version", false) && intValue == 6) {
                List<Aweme> h2 = this.this$0.u().h();
                if (!this.this$0.x() || !(!h2.isEmpty())) {
                    if (this.this$0.y()) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : h2) {
                            UserStory userStory = t.getUserStory();
                            if (userStory != null && !userStory.getAllViewed()) {
                                arrayList.add(t);
                            }
                        }
                        if (arrayList.size() >= com.ss.android.ugc.aweme.homepage.experiment.c.a() && !com.ss.android.ugc.aweme.story.c.g.a()) {
                            this.this$0.n = false;
                            this.this$0.o = true;
                            this.this$0.p = true;
                        }
                    }
                    this.this$0.n = false;
                    this.this$0.o = false;
                } else {
                    this.this$0.n = true;
                    this.this$0.p = true;
                }
            }
            return z.f158842a;
        }
    }
}
