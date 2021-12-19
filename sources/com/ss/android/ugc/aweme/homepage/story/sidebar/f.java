package com.ss.android.ugc.aweme.homepage.story.sidebar;

import android.view.View;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

public final class f extends com.bytedance.ext_power_list.m<StorySidebarListVM> implements com.ss.android.ugc.aweme.homepage.story.container.e, IStoryPublishAnimateListener, com.ss.android.ugc.aweme.story.base.d, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: l  reason: collision with root package name */
    public static boolean f99465l = true;

    /* renamed from: m  reason: collision with root package name */
    public static final d f99466m = new d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final h.h f99467j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f99468k;
    private final h.h n = h.i.a((h.f.a.a) new C2433f(this));
    private final com.bytedance.assem.a.a o;
    private final com.bytedance.assem.arch.viewModel.b p;
    private final h.h q;
    private final h.h r;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, com.ss.android.ugc.aweme.homepage.story.feed.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(63427);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.feed.d invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<o, o> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(63428);
        }

        public c() {
            super(1);
        }

        public final o invoke(o oVar) {
            h.f.b.l.c(oVar, "");
            return oVar;
        }
    }

    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final k f99475a = new k();

        static {
            Covode.recordClassIndex(63436);
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f99478a = new t();

        static {
            Covode.recordClassIndex(63448);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_sidebar_list";
        }
    }

    private final DrawerViewModel C() {
        return (DrawerViewModel) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.homepage.story.container.a
    public final void a() {
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

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(375, new org.greenrobot.eventbus.g(f.class, "onFeedRefreshEvent", com.ss.android.ugc.aweme.ug.guide.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.n.getValue();
    }

    /* renamed from: x */
    public final StorySidebarListVM u() {
        return (StorySidebarListVM) this.o.getValue();
    }

    public final StorySidebarFeedVM y() {
        return (StorySidebarFeedVM) this.p.getValue();
    }

    /* access modifiers changed from: package-private */
    public final IMainPageFragment z() {
        return (IMainPageFragment) this.r.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(63429);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.story.container.e
    public final void d() {
        B();
    }

    static final class g extends h.f.b.m implements h.f.a.a<IMainPageFragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f99469a = new g();

        static {
            Covode.recordClassIndex(63432);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IMainPageFragment invoke() {
            return MainPageFragmentImpl.i();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
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

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.f$f  reason: collision with other inner class name */
    static final class C2433f extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2433f(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.fdj);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<IAVPublishService> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f99476a = new o();

        static {
            Covode.recordClassIndex(63441);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVPublishService invoke() {
            return AVExternalServiceImpl.a().publishService();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateFinish() {
        u().a(1.0f);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateStart() {
        u().a(0.0f);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63426);
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

    static {
        Covode.recordClassIndex(63425);
    }

    public final void A() {
        u().a(y().f99376m.f99399a, y().h());
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        cg.b(this);
        StoryPublishServiceImpl.a().removePublishAnimateListener(this);
        u().n = null;
        DrawerViewModel C = C();
        if (C != null) {
            C.b(this);
        }
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34357b = false;
        cVar.f34356a = 8;
        return cVar.a(LoadingFooterCell.class);
    }

    public final void B() {
        int k2;
        int m2;
        RecyclerView.i layoutManager = v().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (k2 = linearLayoutManager.k()) != -1 && k2 <= (m2 = linearLayoutManager.m())) {
            while (true) {
                RecyclerView.ViewHolder f2 = v().f(k2);
                if (!(f2 instanceof StorySidebarListCell)) {
                    f2 = null;
                }
                StorySidebarListCell storySidebarListCell = (StorySidebarListCell) f2;
                if (storySidebarListCell != null) {
                    storySidebarListCell.a("story_show");
                }
                if (k2 != m2) {
                    k2++;
                } else {
                    return;
                }
            }
        }
    }

    public f() {
        com.bytedance.assem.arch.viewModel.b bVar;
        t tVar = t.f99478a;
        this.o = new com.bytedance.assem.a.a(ab.a(StorySidebarListVM.class), tVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, c.INSTANCE, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(StorySidebarFeedVM.class);
        a aVar2 = new a(a2);
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
        this.p = bVar;
        this.q = h.i.a((h.f.a.a) new e(this));
        this.r = h.i.a((h.f.a.a) g.f99469a);
        this.f99467j = h.i.a((h.f.a.a) o.f99476a);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        h.k.c a2;
        super.f();
        cg.a(this);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        String curUserId = g2.getCurUserId();
        h.f.b.l.b(curUserId, "");
        h.k.k[] kVarArr = new h.k.k[0];
        com.ss.android.ugc.aweme.story.userstory.b bVar = com.ss.android.ugc.aweme.story.userstory.b.f138510c;
        if (h.f.b.l.a(ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class), ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
            a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class);
        } else {
            a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class);
        }
        StoryReceiver storyReceiver = new StoryReceiver(curUserId, this, bVar);
        if (h.f.b.l.a(a2, ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
            bVar.a((com.ss.android.ugc.aweme.story.base.d) this, storyReceiver);
        }
        f.a.b.b a3 = bVar.a().a(new h(curUserId, bVar)).d(new i(kVarArr)).a(bVar.f136888b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new j(this, curUserId), k.f99475a);
        h.f.b.l.b(a3, "");
        com.ss.android.ugc.aweme.story.base.distribution.dispatcher.d.a(a3, storyReceiver);
        StoryPublishServiceImpl.a().addPublishAnimateListener(this);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateUpdate(float f2) {
        u().a(f2);
    }

    public static final class i<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k[] f99472a;

        static {
            Covode.recordClassIndex(63434);
        }

        public i(h.k.k[] kVarArr) {
            this.f99472a = kVarArr;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            return c.a.a(aVar.f136890a, aVar.f136891b, aVar.f136892c, this.f99472a);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            f.a(this.this$0.u(), new h.f.a.b<o, z>(this) {
                /* class com.ss.android.ugc.aweme.homepage.story.sidebar.f.r.AnonymousClass1 */
                final /* synthetic */ r this$0;

                static {
                    Covode.recordClassIndex(63445);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(o oVar) {
                    o oVar2 = oVar;
                    h.f.b.l.d(oVar2, "");
                    List<ITEM> list = oVar2.f99487a.f28670d;
                    if (list != null && !list.isEmpty() && this.this$0.this$0.f99468k) {
                        this.this$0.this$0.s().post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.homepage.story.sidebar.f.r.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f99477a;

                            static {
                                Covode.recordClassIndex(63446);
                            }

                            {
                                this.f99477a = r1;
                            }

                            public final void run() {
                                this.f99477a.this$0.this$0.v().b(0);
                            }
                        });
                        this.this$0.this$0.f99468k = false;
                    }
                    this.this$0.this$0.B();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final class h<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f99470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c f99471b;

        static {
            Covode.recordClassIndex(63433);
        }

        public h(Object obj, com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c cVar) {
            this.f99470a = obj;
            this.f99471b = cVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            if (!h.f.b.l.a(this.f99471b.a((Object) aVar.f136891b, (Object) aVar.f136892c), this.f99470a) || !(!aVar.f136890a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(com.ss.android.ugc.aweme.ug.guide.c cVar) {
        String str = "";
        h.f.b.l.d(cVar, str);
        int i2 = cVar.f141894a;
        if (i2 == 0) {
            str = "pull down in feed";
        } else if (i2 == 1) {
            str = "home tab in feed";
        } else if (i2 == 2) {
            str = "for you in feed";
        }
        if (hk.a(str)) {
            y().a(str);
            this.f99468k = true;
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f99473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f99474b;

        static {
            Covode.recordClassIndex(63435);
        }

        public j(f fVar, String str) {
            this.f99473a = fVar;
            this.f99474b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int intValue;
            List i2;
            Aweme clone = ((c.a) obj).f136892c.clone();
            h.f.b.l.b(clone, "");
            UserStory userStory = clone.getUserStory();
            if (userStory != null && com.ss.android.ugc.aweme.story.d.a.a(userStory)) {
                StorySidebarListVM x = this.f99473a.u();
                String str = this.f99474b;
                h.f.b.l.b(str, "");
                h.f.b.l.d(str, "");
                List i3 = x.i();
                if (i3 != null) {
                    Iterator it = i3.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                            break;
                        } else if (h.f.b.l.a((Object) str, (Object) ((n) it.next()).f99486a.getAuthorUid())) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i4);
                    if (valueOf != null && (intValue = valueOf.intValue()) >= 0 && (i2 = this.f99473a.u().i()) != null && intValue < i2.size()) {
                        this.f99473a.u().a(intValue);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        v().a(StorySidebarListCell.class);
        v().setItemAnimator(null);
        super.b(view);
        f.a.a(this, y(), g.f99479a, (com.bytedance.assem.arch.viewModel.k) null, new l(this), 6);
        f.a.a(this, y(), h.f99480a, (com.bytedance.assem.arch.viewModel.k) null, new m(this), 6);
        f.a.a(this, y(), i.f99481a, com.bytedance.assem.arch.viewModel.l.a(), new n(this), 4);
        f.a.a(this, u(), k.f99483a, (com.bytedance.assem.arch.viewModel.k) null, new q(this), 6);
        AssemViewModel.a(u(), l.f99484a, null, null, null, new r(this), 14);
        f.a.a(this, u(), m.f99485a, (com.bytedance.assem.arch.viewModel.k) null, new s(this), 6);
        f.a.a(this, u(), j.f99482a, com.bytedance.assem.arch.viewModel.l.a(), new p(this), 4);
        if (f99465l) {
            f99465l = false;
        } else {
            y().a("hot start");
        }
        DrawerViewModel C = C();
        if (C != null) {
            C.a(this);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends String>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar, "");
            this.this$0.f99468k = true;
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
            final int intValue = num.intValue();
            h.f.b.l.d(pVar, "");
            com.bytedance.assem.arch.core.p.a(this.this$0.y(), new h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, z>(this) {
                /* class com.ss.android.ugc.aweme.homepage.story.sidebar.f.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(63439);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
                    com.ss.android.ugc.aweme.homepage.story.feed.d dVar2 = dVar;
                    h.f.b.l.d(dVar2, "");
                    int i2 = intValue;
                    if ((i2 & 2) > 0) {
                        if (i2 == 6) {
                            this.this$0.this$0.u().o.clear();
                        }
                        if (dVar2.f99402a == 1) {
                            this.this$0.this$0.A();
                        }
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            if (aVar2.f25631b.intValue() == 0) {
                StorySidebarListVM x = this.this$0.u();
                if (x.j()) {
                    x.a(Long.valueOf(x.f99450m));
                }
            }
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(pVar, "");
            int b2 = this.this$0.v().getState().b();
            if (intValue >= 0 && b2 > intValue) {
                this.this$0.v().b(intValue);
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Integer num) {
            androidx.fragment.app.e b2;
            int intValue = num.intValue();
            h.f.b.l.d(pVar, "");
            f fVar = this.this$0;
            if (intValue == 1) {
                fVar.A();
                if (!fVar.y().a(true)) {
                    fVar.y().a("cache expired upon open sidebar");
                }
            }
            if (((IAVPublishService) fVar.f99467j.getValue()).isPublishing() && (b2 = com.bytedance.assem.arch.extensions.b.b(fVar)) != null) {
                if (intValue == 1) {
                    fVar.z().a(b2);
                } else if (intValue == 0) {
                    fVar.z().b(b2);
                }
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.ext_power_list.a<n>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(63443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.ext_power_list.a<n> aVar) {
            ArrayList arrayList;
            com.bytedance.ext_power_list.a<n> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            if (this.this$0.y().g()) {
                List<ITEM> list = aVar2.f28670d;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(h.a.n.a(list, 10));
                    for (ITEM item : list) {
                        arrayList2.add(item.f99486a);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = h.a.z.INSTANCE;
                }
                this.this$0.y().a(arrayList);
            }
            return z.f158842a;
        }
    }
}
