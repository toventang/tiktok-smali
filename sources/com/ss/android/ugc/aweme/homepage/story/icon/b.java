package com.ss.android.ugc.aweme.homepage.story.icon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.services.story.event.StoryPublishEvent;
import com.ss.android.ugc.aweme.story.publish.d;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.fe;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

public final class b extends com.bytedance.assem.arch.d.a implements com.ss.android.ugc.aweme.story.avatar.f, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: m  reason: collision with root package name */
    public static final f f99422m = new f((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public int f99423j;

    /* renamed from: k  reason: collision with root package name */
    Aweme f99424k;

    /* renamed from: l  reason: collision with root package name */
    final com.bytedance.assem.a.a f99425l;
    private final com.bytedance.assem.arch.viewModel.b n;
    private final h.h o;
    private final com.bytedance.assem.arch.viewModel.b p;
    private final com.ss.android.ugc.aweme.story.publish.a q;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.b$b  reason: collision with other inner class name */
    public static final class C2430b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, com.ss.android.ugc.aweme.homepage.story.feed.d> {
        public static final C2430b INSTANCE = new C2430b();

        static {
            Covode.recordClassIndex(63338);
        }

        public C2430b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.feed.d invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<i, i> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(63340);
        }

        public d() {
            super(1);
        }

        public final i invoke(i iVar) {
            h.f.b.l.c(iVar, "");
            return iVar;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.sidebar.o, com.ss.android.ugc.aweme.homepage.story.sidebar.o> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(63341);
        }

        public e() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.sidebar.o invoke(com.ss.android.ugc.aweme.homepage.story.sidebar.o oVar) {
            h.f.b.l.c(oVar, "");
            return oVar;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f99429a = new s();

        static {
            Covode.recordClassIndex(63356);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_sidebar_list";
        }
    }

    static {
        Covode.recordClassIndex(63336);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, new org.greenrobot.eventbus.g(b.class, "onStoryPublishEventPost", StoryPublishEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(160, new org.greenrobot.eventbus.g(b.class, "onShowSidebar", com.ss.android.ugc.aweme.story.b.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final StorySidebarFeedVM u() {
        return (StorySidebarFeedVM) this.n.getValue();
    }

    public final DrawerViewModel v() {
        return (DrawerViewModel) this.o.getValue();
    }

    public final StoryIconVM w() {
        return (StoryIconVM) this.p.getValue();
    }

    public static final class f {
        static {
            Covode.recordClassIndex(63342);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.f
    public final androidx.lifecycle.m z() {
        return com.bytedance.assem.arch.extensions.b.b(this);
    }

    static final class g extends h.f.b.m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 != null) {
                return DrawerViewModel.a.a(b2);
            }
            return null;
        }
    }

    public final void x() {
        a(u(), new k(this));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        cg.a(this);
        a.f99420a.restoreScheduleInfoFromDraft(new h(this));
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        cg.b(this);
        com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
        if (d2 != null) {
            d2.a(this);
        }
    }

    private final void A() {
        this.f99423j = 0;
        TuxIconView tuxIconView = (TuxIconView) s().findViewById(R.id.bho);
        h.f.b.l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        StoryBrandView storyBrandView = (StoryBrandView) s().findViewById(R.id.bi3);
        h.f.b.l.b(storyBrandView, "");
        storyBrandView.setVisibility(4);
        AvatarImageView avatarImageView = (AvatarImageView) s().findViewById(R.id.bu0);
        h.f.b.l.b(avatarImageView, "");
        avatarImageView.setVisibility(4);
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99426a;

        static {
            Covode.recordClassIndex(63345);
        }

        i(b bVar) {
            this.f99426a = bVar;
        }

        public final void run() {
            Aweme aweme;
            int indexOf;
            if (this.f99426a.u().g()) {
                StoryIconVM w = this.f99426a.w();
                List<Aweme> h2 = this.f99426a.u().h();
                h.f.b.l.d(h2, "");
                if (com.ss.android.ugc.aweme.story.c.d.b() && (aweme = w.f99414j) != null && (indexOf = h2.indexOf(aweme)) > 0) {
                    int i2 = 0;
                    int i3 = 0;
                    do {
                        boolean b2 = StoryIconVM.b(h2.get(i2));
                        boolean a2 = StoryIconVM.a(h2.get(i2));
                        if (!b2 && !a2) {
                            break;
                        }
                        i3++;
                        i2++;
                    } while (i2 < indexOf);
                    if (i3 != indexOf) {
                        h.f.b.l.d(h2, "");
                        if (i3 != indexOf && i3 < h2.size()) {
                            h2 = h.a.n.g((Collection) h2);
                            h2.add(i3, h2.remove(indexOf));
                        }
                        this.f99426a.u().a(h2);
                    }
                }
            }
        }
    }

    public b() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(StorySidebarFeedVM.class);
        a aVar2 = new a(a2);
        C2430b bVar2 = C2430b.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
        this.o = h.i.a((h.f.a.a) new g(this));
        h.k.c a3 = ab.a(StoryIconVM.class);
        this.p = new com.bytedance.assem.arch.viewModel.b(a3, new c(a3), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), d.INSTANCE, u.b(this), u.c(this));
        this.q = com.ss.android.ugc.aweme.story.g.f137757a.f();
        s sVar = s.f99429a;
        this.f99425l = new com.bytedance.assem.a.a(ab.a(StorySidebarListVM.class), sVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, e.INSTANCE, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.icon.b.y():void");
    }

    public static final class j implements com.ss.android.ugc.aweme.story.publish.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99427a;

        static {
            Covode.recordClassIndex(63346);
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(com.ss.android.ugc.aweme.story.publish.i iVar) {
            h.f.b.l.d(iVar, "");
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(String str, com.ss.android.ugc.aweme.story.publish.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(eVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(b bVar) {
            this.f99427a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(int i2) {
            int i3;
            if (i2 > 1) {
                i3 = R.string.h6z;
            } else {
                i3 = R.string.g8l;
            }
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.f99427a);
            if (b2 != null) {
                new com.bytedance.tux.g.b(b2).e(i3).b();
            }
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(String str) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void b(String str, com.ss.android.ugc.aweme.story.publish.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(eVar, "");
            this.f99427a.y();
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void c(String str, com.ss.android.ugc.aweme.story.publish.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(eVar, "");
            d.a.a(str, eVar);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onShowSidebar(com.ss.android.ugc.aweme.story.b.b bVar) {
        h.f.b.l.d(bVar, "");
        a(false, "click");
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            com.ss.android.ugc.aweme.homepage.story.feed.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            if (dVar2.f99402a == 0 && dVar2.f99403b != 1) {
                this.this$0.y();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<List<? extends ScheduleInfo>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends ScheduleInfo> list) {
            List<? extends ScheduleInfo> list2 = list;
            h.f.b.l.d(list2, "");
            if (!list2.isEmpty()) {
                com.ss.android.ugc.aweme.story.publish.a f2 = com.ss.android.ugc.aweme.story.g.f137757a.f();
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    com.ss.android.ugc.aweme.story.publish.g gVar = new com.ss.android.ugc.aweme.story.publish.g(it.next());
                    gVar.f138141b.a(com.ss.android.ugc.aweme.story.publish.i.FAILED);
                    arrayList.add(gVar);
                }
                f2.a(h.a.n.g((Collection) arrayList));
                this.this$0.u().b(false);
            }
            return z.f158842a;
        }
    }

    private final void a(com.ss.android.ugc.aweme.tux.business.story.a aVar) {
        this.f99423j = 1;
        TuxIconView tuxIconView = (TuxIconView) s().findViewById(R.id.bho);
        h.f.b.l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        ((StoryBrandView) s().findViewById(R.id.bi3)).setMode(aVar);
        StoryBrandView storyBrandView = (StoryBrandView) s().findViewById(R.id.bi3);
        h.f.b.l.b(storyBrandView, "");
        storyBrandView.setVisibility(0);
        AvatarImageView avatarImageView = (AvatarImageView) s().findViewById(R.id.bu0);
        h.f.b.l.b(avatarImageView, "");
        avatarImageView.setVisibility(4);
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        A();
        s().setOnClickListener(new r(this));
        f.a.a(this, u(), c.f99430a, (com.bytedance.assem.arch.viewModel.k) null, new m(this), 6);
        f.a.a(this, u(), d.f99431a, (com.bytedance.assem.arch.viewModel.k) null, new n(this), 6);
        f.a.a(this, u(), e.f99432a, com.bytedance.assem.arch.viewModel.l.a(), new o(this), 4);
        f.a.a(this, u(), f.f99433a, (com.bytedance.assem.arch.viewModel.k) null, new p(this), 6);
        f.a.a(this, u(), g.f99434a, (com.bytedance.assem.arch.viewModel.k) null, new l(this), 6);
        f.a.a(this, w(), h.f99435a, (com.bytedance.assem.arch.viewModel.k) null, new q(this), 6);
        this.q.a("StoryIconAssem", new j(this));
        View s2 = s();
        com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
        if (d2 != null) {
            d2.a(this, "*");
        }
        ((StoryBrandView) s2.findViewById(R.id.bi3)).setThemeType(com.ss.android.ugc.aweme.tux.business.story.b.CONST);
        StorySidebarFeedVM u = u();
        i iVar = new i(this);
        h.f.b.l.d(iVar, "");
        u.p.add(iVar);
        if (com.ss.android.ugc.aweme.homepage.experiment.a.b()) {
            StorySidebarFeedVM u2 = u();
            u2.c(new StorySidebarFeedVM.c(u2));
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onStoryPublishEventPost(StoryPublishEvent storyPublishEvent) {
        androidx.fragment.app.e b2;
        h.f.b.l.d(storyPublishEvent, "");
        com.ss.android.ugc.aweme.story.publish.a aVar = this.q;
        List<ScheduleInfo> scheduleList = storyPublishEvent.getScheduleList();
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) scheduleList, 10));
        Iterator<T> it = scheduleList.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.ss.android.ugc.aweme.story.publish.g(it.next()));
        }
        aVar.a(h.a.n.g((Collection) arrayList));
        if (storyPublishEvent.getSwitch2FeedTab() && (b2 = com.bytedance.assem.arch.extensions.b.b(this)) != null) {
            String f2 = Hox.a.a(b2).f(be.f68531c);
            if (!(!h.f.b.l.a((Object) f2, (Object) "page_feed"))) {
                String f3 = Hox.a.a(b2).f(f2);
                if (!h.f.b.l.a((Object) f2, (Object) "HOME")) {
                    Hox a2 = Hox.a.a(b2);
                    Bundle bundle = new Bundle();
                    bundle.putString(be.f68530b, f3);
                    a2.b("HOME", bundle);
                }
            }
        }
        u().b(true);
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99428a;

        static {
            Covode.recordClassIndex(63355);
        }

        r(b bVar) {
            this.f99428a = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String requestId;
            ClickAgent.onClick(view);
            int i2 = this.f99428a.f99423j;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (((Boolean) com.ss.android.ugc.aweme.story.c.f.f136989a.getValue()).booleanValue()) {
                        b bVar = this.f99428a;
                        Activity topActivity = ActivityStack.getTopActivity();
                        User user = null;
                        if (!(topActivity instanceof androidx.appcompat.app.d)) {
                            topActivity = null;
                        }
                        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) topActivity;
                        if (dVar == null || dVar.isFinishing()) {
                            return;
                        }
                        if (!fe.a(dVar)) {
                            new com.bytedance.tux.g.b(dVar).e(R.string.de8).b();
                            return;
                        }
                        ((StorySidebarListVM) bVar.f99425l.getValue()).a(bVar.u().f99376m.f99399a, bVar.u().h());
                        SmartRoute buildRoute = SmartRouter.buildRoute(dVar, "aweme://story/detail");
                        StoryBrandView storyBrandView = (StoryBrandView) bVar.s().findViewById(R.id.bi3);
                        String str3 = "";
                        h.f.b.l.b(storyBrandView, str3);
                        androidx.core.app.b b2 = androidx.core.app.b.b(storyBrandView, storyBrandView.getWidth(), storyBrandView.getHeight());
                        h.f.b.l.b(b2, str3);
                        SmartRoute withParam = buildRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_SIDE_BAR").withParam("enter_from", "westwindow").withParam("previous_page", "westwindow");
                        Aweme aweme = bVar.f99424k;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        withParam.withParam("id", str).withParam("story_req_id", bVar.u().f99376m.f99401c).withParam("impr_id", bVar.u().f99376m.f99401c).withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true).withParam("enter_play_method", "click_avatar_dot");
                        buildRoute.open();
                        HashMap hashMap = new HashMap();
                        Aweme aweme2 = bVar.f99424k;
                        if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
                            str2 = str3;
                        }
                        hashMap.put("author_id", str2);
                        Aweme aweme3 = bVar.f99424k;
                        if (aweme3 != null) {
                            user = aweme3.getAuthor();
                        }
                        hashMap.put("follow_status", String.valueOf(com.ss.android.ugc.aweme.story.b.h.a(user)));
                        Aweme aweme4 = bVar.f99424k;
                        if (!(aweme4 == null || (requestId = aweme4.getRequestId()) == null)) {
                            str3 = requestId;
                        }
                        hashMap.put("req_id", str3);
                        hashMap.put("enter_method", "click_avatar_dot");
                        hashMap.put("enter_from", "westwindow");
                        com.ss.android.ugc.aweme.common.r.a("story_click", hashMap);
                        return;
                    }
                    this.f99428a.a(false, "click");
                    return;
                }
            } else if (!com.ss.android.ugc.aweme.homepage.experiment.a.b()) {
                DrawerViewModel v = this.f99428a.v();
                if (v != null) {
                    v.a(1, "click_upper_left_camera");
                    return;
                }
                return;
            }
            this.f99428a.a(false, "click");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.f
    public final void a(String str, Aweme aweme) {
        h.f.b.l.d(str, "");
        x();
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            if (aVar2.f25631b.booleanValue()) {
                this.this$0.x();
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
            final int intValue = num.intValue();
            h.f.b.l.d(pVar, "");
            com.bytedance.assem.arch.core.p.a(this.this$0.u(), new h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, z>(this) {
                /* class com.ss.android.ugc.aweme.homepage.story.icon.b.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(63350);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
                    User author;
                    User author2;
                    long j2;
                    com.ss.android.ugc.aweme.homepage.story.feed.d dVar2 = dVar;
                    h.f.b.l.d(dVar2, "");
                    if ((intValue & 2) != 0 && dVar2.f99402a == 0) {
                        StoryIconVM w = this.this$0.this$0.w();
                        List<Aweme> h2 = this.this$0.this$0.u().h();
                        h.f.b.l.d(h2, "");
                        if (com.ss.android.ugc.aweme.story.c.d.b()) {
                            T t = null;
                            r3 = null;
                            String str = null;
                            long j3 = 0;
                            T t2 = null;
                            for (T t3 : h2) {
                                UserStory userStory = t3.getUserStory();
                                if (userStory != null && !userStory.getAllViewed()) {
                                    User author3 = t3.getAuthor();
                                    if (!com.ss.android.ugc.aweme.homepage.story.c.b.a(author3 != null ? author3.getUid() : null) && !StoryIconVM.a((Aweme) t3)) {
                                        UserStory userStory2 = t3.getUserStory();
                                        if (userStory2 != null) {
                                            j2 = userStory2.getLastStoryCreatedAt();
                                        } else {
                                            j2 = 0;
                                        }
                                        if (j2 > j3) {
                                            t2 = t3;
                                            j3 = j2;
                                        }
                                    }
                                }
                            }
                            if (!h.f.b.l.a((Object) w.f99415k, (Object) ((t2 == null || (author2 = t2.getAuthor()) == null) ? null : author2.getUid()))) {
                                if (!(t2 == null || (author = t2.getAuthor()) == null)) {
                                    str = author.getUid();
                                }
                                w.f99415k = str;
                                t = t2;
                            }
                            w.f99414j = t;
                        }
                        this.this$0.this$0.y();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            if (aVar2.f25631b.booleanValue()) {
                this.this$0.x();
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z, String str) {
        int i2;
        if (z) {
            i2 = 35;
        } else {
            i2 = 3;
        }
        DrawerViewModel v = v();
        if (v != null) {
            v.a(i2, str);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends String>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends String> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            T t = aVar2.f25631b;
            com.ss.android.ugc.aweme.story.j.a.b("StoryIconAssem", "StoryIconAssem: openSidebarEvent, reason: ".concat(String.valueOf(t)));
            this.this$0.a(true, (String) t);
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            DrawerViewModel v;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            if (aVar2.f25631b.booleanValue() && (v = this.this$0.v()) != null) {
                v.a(4, "auto");
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            int intValue = num.intValue();
            h.f.b.l.d(pVar2, "");
            StoryIconVM w = this.this$0.w();
            if (com.ss.android.ugc.aweme.story.c.d.b()) {
                w.f99414j = null;
                w.g().a();
            }
            if (intValue == 0) {
                this.this$0.y();
                pVar2.s().setVisibility(0);
            } else if (intValue == 1) {
                pVar2.s().setVisibility(4);
            }
            return z.f158842a;
        }
    }
}
