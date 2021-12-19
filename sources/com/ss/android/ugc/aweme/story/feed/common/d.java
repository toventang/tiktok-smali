package com.ss.android.ugc.aweme.story.feed.common;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.adapter.ai;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar;
import com.ss.android.ugc.aweme.story.view.ReactionBubbleList;
import com.ss.android.ugc.aweme.story.view.StoryHeaderView;
import com.ss.android.ugc.aweme.utils.cz;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.dl;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import h.a.n;
import h.f.b.ab;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class d extends a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {
    public static final a s = new a((byte) 0);
    private final dl A = new e(this);
    private final s<ag> B;
    private final h.h C;
    private final int D;
    private com.ss.android.ugc.aweme.story.interaction.c.a E;
    private final boolean F;
    private boolean G;
    private ViewPager.h H;
    public final Context n;
    public final View o;
    public final StoryListProgressBar p;
    public final c q;
    public boolean r;
    private StoryHeaderView t;
    private final com.ss.android.ugc.aweme.feed.param.b u;
    private ReactionBubbleList v;
    private boolean w;
    private int x;
    private final h.h y;
    private boolean z;

    static {
        Covode.recordClassIndex(90069);
    }

    public final StoryFeedViewModel m() {
        return (StoryFeedViewModel) this.y.getValue();
    }

    public final DmtRtlViewPager n() {
        return (DmtRtlViewPager) this.C.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90072);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final com.ss.android.ugc.aweme.story.view.a h() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(Aweme aweme, int i2) {
        h.k.c a2;
        h.f.b.l.d(aweme, "");
        super.a(aweme, i2);
        this.f137628b = null;
        this.f137638l.clear();
        com.ss.android.ugc.aweme.story.b.h.b("auto");
        UserStory userStory = aweme.getUserStory();
        if (userStory != null) {
            h.f.b.l.b(userStory, "");
            com.ss.android.ugc.aweme.story.g gVar = com.ss.android.ugc.aweme.story.g.f137757a;
            String str = this.f137639m.f91775j;
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f137639m.f91770e.param;
            h.f.b.l.b(bVar, "");
            a(gVar.a(str, bVar.getFrom()));
            this.f137633g = userStory;
            m();
            c(StoryFeedViewModel.a(aweme));
            StoryFeedViewModel m2 = m();
            String str2 = this.f137636j;
            h.f.b.l.d(aweme, "");
            h.f.b.l.d(str2, "");
            UserStory userStory2 = aweme.getUserStory();
            if (userStory2 != null) {
                h.f.b.l.b(userStory2, "");
                m2.f137598c.put(str2, aweme);
                if (m2.f(str2)) {
                    m2.a(str2, userStory2);
                    com.ss.android.ugc.aweme.story.userstory.mine.b.a(new StoryFeedViewModel.h(userStory2));
                }
                m2.e(str2);
                h.f.b.l.d(str2, "");
                if (StoryFeedViewModel.g(str2) && !m2.f137601f && !m2.j() && !m2.f()) {
                    h.k.k[] kVarArr = new h.k.k[0];
                    com.ss.android.ugc.aweme.story.userstory.b bVar2 = com.ss.android.ugc.aweme.story.userstory.b.f138510c;
                    if (h.f.b.l.a(ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class), ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                        a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class);
                    } else {
                        a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class);
                    }
                    StoryReceiver storyReceiver = new StoryReceiver(str2, m2, bVar2);
                    if (h.f.b.l.a(a2, ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                        bVar2.a((com.ss.android.ugc.aweme.story.base.d) m2, storyReceiver);
                    }
                    f.a.b.b a3 = bVar2.a().a(new StoryFeedViewModel.i(str2, bVar2)).d(new StoryFeedViewModel.j(kVarArr)).a(bVar2.f136888b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new StoryFeedViewModel.k(m2, str2), StoryFeedViewModel.l.f137620a);
                    h.f.b.l.b(a3, "");
                    com.ss.android.ugc.aweme.story.base.distribution.dispatcher.d.a(a3, storyReceiver);
                    m2.f137601f = true;
                }
            }
            this.f137632f = aweme;
            this.f137630d = i2;
            if (this.w || !t() || u()) {
                b(aweme, i2);
                return;
            }
            List<Aweme> d2 = m().d(this.f137636j);
            if (d2 != null) {
                int a4 = m().a(this.f137636j, (List<? extends Aweme>) d2);
                this.p.a(d2.size());
                if (a4 >= 0 && d2.size() > 0 && a4 < d2.size()) {
                    this.p.a((StoryListProgressBar) a4, 0.0f, 4.2E-43f);
                    DataCenter dataCenter = this.f91581a;
                    if (dataCenter != null) {
                        dataCenter.a("prebind_story", new com.ss.android.ugc.aweme.story.b.c(d2.get(a4)));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015c, code lost:
        if (r4 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    @Override // com.ss.android.ugc.aweme.story.feed.common.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.d.a(int, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.a, com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(com.ss.android.ugc.aweme.story.f.a aVar) {
        Story story;
        h.f.b.l.d(aVar, "");
        c cVar = this.q;
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        Aweme c2 = cVar.c(n2.getCurrentItem());
        if (c2 == null || (story = c2.getStory()) == null || !story.isPublishing()) {
            super.a(aVar);
        } else {
            b(com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_VIDEO);
        }
    }

    public final boolean o() {
        if (this.f137639m.f91778m == 12) {
            return true;
        }
        return false;
    }

    static final class k extends m implements h.f.a.a<DmtRtlViewPager> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtRtlViewPager invoke() {
            View view = this.this$0.o;
            h.f.b.l.b(view, "");
            return view.findViewById(R.id.fkt);
        }
    }

    private final void r() {
        this.p.a(this.q.getCount());
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        a(n2.getCurrentItem(), false);
    }

    private final boolean u() {
        Aweme aweme;
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2 = this.f137632f;
        if (aweme2 == null || (userStory = aweme2.getUserStory()) == null || (stories = userStory.getStories()) == null) {
            aweme = null;
        } else {
            aweme = (Aweme) n.h((List) stories);
        }
        return com.ss.android.ugc.aweme.story.d.a.e(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.a
    public final int k() {
        if (m().c(this.f137636j)) {
            return this.q.getCount() - 1;
        }
        return this.q.getCount();
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        if (m().a().isRunning()) {
            m().a().cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.a
    public final int l() {
        int count;
        int currentItem;
        if (m().c(this.f137636j)) {
            count = this.q.getCount() - 2;
            DmtRtlViewPager n2 = n();
            h.f.b.l.b(n2, "");
            currentItem = n2.getCurrentItem();
        } else {
            count = this.q.getCount() - 1;
            DmtRtlViewPager n3 = n();
            h.f.b.l.b(n3, "");
            currentItem = n3.getCurrentItem();
        }
        return count - currentItem;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ Aweme $aweme$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Aweme aweme) {
            super(0);
            this.this$0 = dVar;
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.metrics.f f2 = new com.ss.android.ugc.aweme.metrics.f().a(this.this$0.f137639m.f91775j).g(this.$aweme$inlined);
            String str = "";
            if (this.$aweme$inlined.getAuthor() != null) {
                User author = this.$aweme$inlined.getAuthor();
                h.f.b.l.b(author, str);
                str = author.getUid();
            }
            f2.f109569b = str;
            f2.V = com.ss.android.ugc.aweme.story.b.h.a(this.$aweme$inlined.getAuthor());
            f2.u = true;
            f2.v = com.ss.android.ugc.aweme.story.d.a.b(this.$aweme$inlined);
            f2.f();
            DataCenter dataCenter = this.this$0.f91581a;
            if (dataCenter != null) {
                dataCenter.a("video_share_click", (Object) null);
            }
            return z.f158842a;
        }
    }

    static final class l extends m implements h.f.a.a<StoryFeedViewModel> {
        final /* synthetic */ cf $params;

        static {
            Covode.recordClassIndex(90083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(cf cfVar) {
            super(0);
            this.$params = cfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryFeedViewModel invoke() {
            ac a2;
            Fragment fragment = this.$params.f91768c;
            Fragment fragment2 = this.$params.f91768c;
            com.ss.android.ugc.aweme.feed.param.b bVar = this.$params.f91770e.param;
            h.f.b.l.b(bVar, "");
            h.f.b.l.d(fragment, "");
            h.f.b.l.d(fragment2, "");
            h.f.b.l.d(bVar, "");
            o oVar = new o(fragment, bVar);
            com.ss.android.ugc.aweme.arch.widgets.base.d.a(com.ss.android.ugc.aweme.arch.widgets.base.d.a(fragment));
            ad adVar = new ad(fragment2.getViewModelStore(), oVar);
            String eventType = bVar.getEventType();
            if (StoryFeedViewModel.class.equals(ScopeViewModel.class)) {
                a2 = adVar.a(eventType, StoryFeedViewModel.class);
            } else {
                a2 = adVar.a(eventType, StoryFeedViewModel.class);
                androidx.lifecycle.ab.a(a2, adVar);
            }
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    private final boolean t() {
        if (!com.ss.android.ugc.aweme.story.c.c.a()) {
            return false;
        }
        if (m().b() || m().f() || m().d() || m().e() || m().i() || m().h()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final aj d() {
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        if (a(n2.getCurrentItem(), this.f137628b)) {
            return this.f137628b;
        }
        DmtRtlViewPager n3 = n();
        h.f.b.l.b(n3, "");
        for (int childCount = n3.getChildCount() - 1; childCount >= 0; childCount--) {
            Object tag = n().getChildAt(childCount).getTag(R.id.b1q);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            aj ajVar = (aj) tag;
            DmtRtlViewPager n4 = n();
            h.f.b.l.b(n4, "");
            if (a(n4.getCurrentItem(), ajVar)) {
                UserStory userStory = this.f137633g;
                if (userStory != null) {
                    DmtRtlViewPager n5 = n();
                    h.f.b.l.b(n5, "");
                    int currentItem = n5.getCurrentItem();
                    m();
                    p.a(this.f137636j, userStory, Integer.valueOf(currentItem), this.q.c(currentItem));
                }
                return ajVar;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void f() {
        ai v2;
        int count = this.q.getCount();
        if (count > 0) {
            com.ss.android.ugc.aweme.story.b.h.b("click");
            DmtRtlViewPager n2 = n();
            h.f.b.l.b(n2, "");
            if (n2.getCurrentItem() + 1 < count) {
                aj ajVar = this.f137628b;
                if (!((ajVar == null && (ajVar = d()) == null) || (v2 = ajVar.v()) == null)) {
                    v2.aa();
                }
                DmtRtlViewPager n3 = n();
                DmtRtlViewPager n4 = n();
                h.f.b.l.b(n4, "");
                n3.a(n4.getCurrentItem() + 1, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void g() {
        ai v2;
        if (this.q.getCount() > 0) {
            com.ss.android.ugc.aweme.story.b.h.b("click");
            DmtRtlViewPager n2 = n();
            h.f.b.l.b(n2, "");
            if (n2.getCurrentItem() - 1 >= 0) {
                aj ajVar = this.f137628b;
                if (!((ajVar == null && (ajVar = d()) == null) || (v2 = ajVar.v()) == null)) {
                    v2.aa();
                }
                DmtRtlViewPager n3 = n();
                DmtRtlViewPager n4 = n();
                h.f.b.l.b(n4, "");
                n3.a(n4.getCurrentItem() - 1, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void i() {
        super.i();
        d("story_collection_play_end");
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        for (int childCount = n2.getChildCount() - 1; childCount >= 0; childCount--) {
            Object tag = n().getChildAt(childCount).getTag(R.id.b1q);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            ((aj) tag).j();
        }
        cz b2 = da.a.b("story_horizontally_viewpager");
        if (b2 != null) {
            b2.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.a, com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void e() {
        int a2;
        n().b(this.H);
        cz b2 = da.a.b("story_horizontally_viewpager");
        if (b2 != null) {
            b2.c();
        }
        this.z = false;
        com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        d("story_collection_play_end");
        if (m().b() || m().c()) {
            m();
            if (StoryFeedViewModel.g(this.f137636j) && (a2 = m().a(this.f137636j, (List<? extends Aweme>) this.q.e())) >= 0) {
                n().a(a2, false);
            }
        }
        q();
        super.e();
    }

    public final void p() {
        int count = this.q.getCount();
        if (count > 0) {
            int i2 = e.f137668b[this.f137629c.ordinal()];
            if (i2 == 2) {
                DmtRtlViewPager n2 = n();
                h.f.b.l.b(n2, "");
                if (n2.getCurrentItem() + 1 >= count) {
                    DmtRtlViewPager n3 = n();
                    h.f.b.l.b(n3, "");
                    n3.setCurrentItem(0);
                    a(com.ss.android.ugc.aweme.story.b.g.ON_SHOULD_SCROLL_TO_NEXT_USER, (com.ss.android.ugc.aweme.story.b.a) null);
                    DataCenter dataCenter = this.f91581a;
                    if (dataCenter != null) {
                        dataCenter.a("on_should_scroll_to_next_user", (Object) null);
                        return;
                    }
                    return;
                }
            } else if (i2 == 3) {
                DmtRtlViewPager n4 = n();
                h.f.b.l.b(n4, "");
                if (n4.getCurrentItem() + 1 >= count) {
                    n().a(0, false);
                    return;
                }
            } else if (i2 == 4) {
                DmtRtlViewPager n5 = n();
                h.f.b.l.b(n5, "");
                if (n5.getCurrentItem() + 1 >= count) {
                    androidx.fragment.app.e activity = this.f137639m.f91768c.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            DmtRtlViewPager n6 = n();
            DmtRtlViewPager n7 = n();
            h.f.b.l.b(n7, "");
            n6.a(n7.getCurrentItem() + 1, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a() {
        super.a();
        this.f137632f = null;
        com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = null;
        this.f137628b = null;
        this.q.a(h.a.z.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$d  reason: collision with other inner class name */
    public static final class C3618d implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f137660a;

        /* renamed from: b  reason: collision with root package name */
        private int f137661b;

        static {
            Covode.recordClassIndex(90075);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3618d(d dVar) {
            this.f137660a = dVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            d dVar = this.f137660a;
            dVar.a(i2, !dVar.r);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            ai v;
            this.f137661b = i2;
            if (i2 == 1) {
                aj ajVar = this.f137660a.f137628b;
                if (!((ajVar == null && (ajVar = this.f137660a.d()) == null) || (v = ajVar.v()) == null)) {
                    v.aa();
                }
                this.f137660a.a(com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_VIDEO);
            } else if (i2 == 0) {
                d dVar = this.f137660a;
                com.ss.android.ugc.aweme.story.g gVar = com.ss.android.ugc.aweme.story.g.f137757a;
                String str = this.f137660a.f137639m.f91775j;
                com.ss.android.ugc.aweme.feed.param.b bVar = this.f137660a.f137639m.f91770e.param;
                h.f.b.l.b(bVar, "");
                dVar.a(gVar.a(str, bVar.getFrom()));
            }
        }
    }

    public static final class e implements dl {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f137662a;

        static {
            Covode.recordClassIndex(90076);
        }

        @Override // com.ss.android.ugc.aweme.utils.dl
        public final void b(String str) {
            h.f.b.l.d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f137662a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.dl
        public final void a(String str) {
            h.f.b.l.d(str, "");
            cz b2 = da.a.b(str);
            if (b2 != null) {
                String str2 = this.f137662a.f137634h;
                h.f.b.l.b(str2, "");
                b2.a("enter_from", str2);
            }
        }
    }

    public static final class h extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cz f137663a;

        static {
            Covode.recordClassIndex(90079);
        }

        h(cz czVar) {
            this.f137663a = czVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            if (i2 == 0) {
                this.f137663a.b();
            } else if (i2 != 1) {
                this.f137663a.a();
            } else {
                this.f137663a.a();
            }
        }
    }

    static final class f extends m implements h.f.a.b<b, z> {
        final /* synthetic */ boolean $isHorScrollSelected;
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(90077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2, boolean z) {
            super(1);
            this.$position = i2;
            this.$isHorScrollSelected = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(this.$position);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<b, z> {
        final /* synthetic */ boolean $isHorScrollSelected;
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(90078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2, boolean z) {
            super(1);
            this.$position = i2;
            this.$isHorScrollSelected = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.b(this.$position);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<b, z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(90074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Aweme aweme, int i2) {
            super(1);
            this.$aweme = aweme;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(this.$aweme, this.$position);
            return z.f158842a;
        }
    }

    private final void a(ViewGroup viewGroup) {
        View a2 = com.a.a(LayoutInflater.from(this.n), R.layout.b2j, viewGroup, true);
        h.f.b.l.b(a2, "");
        this.v = (ReactionBubbleList) a2.findViewById(R.id.a09);
    }

    private final void f(Aweme aweme) {
        if (this.z && l() == 0) {
            m();
            p.a(aweme.getAuthorUid(), aweme.getUserStory());
        }
    }

    private final void c(Aweme aweme) {
        String str;
        aweme.getAid();
        ReactionBubbleList reactionBubbleList = this.v;
        if (reactionBubbleList != null) {
            com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.E;
            if (aVar != null) {
                aVar.c();
            }
            String str2 = this.f137639m.f91775j;
            String groupId = aweme.getGroupId();
            int a2 = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
            if (com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
                str = "story";
            } else {
                str = UGCMonitor.TYPE_POST;
            }
            reactionBubbleList.setMobEventParam(new com.ss.android.ugc.aweme.story.interaction.b.g(aweme, str2, groupId, a2, str, com.ss.android.ugc.aweme.story.d.a.b(aweme)));
            com.ss.android.ugc.aweme.story.interaction.c.a aVar2 = this.E;
            if (aVar2 != null) {
                aVar2.a(aweme);
            }
        }
    }

    private final void d(Aweme aweme) {
        if (com.ss.android.ugc.aweme.story.d.a.e(aweme)) {
            com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.E;
            if (aVar != null) {
                aVar.c();
            }
            StoryHeaderView storyHeaderView = this.t;
            if (storyHeaderView != null) {
                storyHeaderView.setVisibility(4);
            }
        } else if (com.ss.android.ugc.aweme.story.d.a.h(aweme)) {
            com.ss.android.ugc.aweme.story.interaction.c.a aVar2 = this.E;
            if (aVar2 != null) {
                aVar2.c();
            }
            a(aweme);
        } else if (!TextUtils.isEmpty(aweme.getAid())) {
            a(aweme);
            c(aweme);
        } else {
            com.ss.android.ugc.aweme.story.interaction.c.a aVar3 = this.E;
            if (aVar3 != null) {
                aVar3.c();
            }
        }
    }

    private final int e(String str) {
        List<Aweme> d2 = this.q.d();
        int i2 = 0;
        for (Aweme aweme : d2) {
            if (!h.f.b.l.a((Object) aweme.getAid(), (Object) str)) {
                i2++;
            } else if (i2 < 0) {
                return i2;
            } else {
                d2.remove(i2);
                return i2;
            }
        }
        return -1;
    }

    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f137664a;

        static {
            Covode.recordClassIndex(90080);
        }

        i(d dVar) {
            this.f137664a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f2;
            StoryListProgressBar storyListProgressBar = this.f137664a.p;
            DmtRtlViewPager n = this.f137664a.n();
            h.f.b.l.b(n, "");
            int currentItem = n.getCurrentItem();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float)) {
                animatedValue = null;
            }
            Float f3 = (Float) animatedValue;
            if (f3 != null) {
                f2 = f3.floatValue();
            } else {
                f2 = 0.0f;
            }
            storyListProgressBar.a(currentItem, f2, 0);
            if (h.f.b.l.a(valueAnimator.getAnimatedValue(), Float.valueOf(1.0f))) {
                if (this.f137664a.m().b()) {
                    com.ss.android.ugc.aweme.story.b.h.a("auto");
                    androidx.fragment.app.e activity = this.f137664a.f137639m.f91768c.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                if (this.f137664a.m().c(this.f137664a.f137636j)) {
                    this.f137664a.p();
                }
            }
        }
    }

    private final void e(Aweme aweme) {
        Story story;
        Story story2;
        if (this.z && (story = aweme.getStory()) != null && !story.getViewed()) {
            Story story3 = aweme.getStory();
            if (story3 == null || story3.isFaked() || (story2 = aweme.getStory()) == null || story2.isPublishing()) {
                Story story4 = aweme.getStory();
                if (story4 != null) {
                    story4.setViewed(true);
                }
                aweme.getAid();
                return;
            }
            String aid = aweme.getAid();
            if (aid != null) {
                Story story5 = aweme.getStory();
                if (story5 != null) {
                    story5.setViewed(true);
                }
                com.ss.android.ugc.aweme.story.g.f137757a.c(aid);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final aj a(String str) {
        if (str == null) {
            return null;
        }
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        int childCount = n2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Object tag = n().getChildAt(i2).getTag(R.id.b1q);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            aj ajVar = (aj) tag;
            if (!(ajVar == null || ajVar.P() == null)) {
                Aweme P = ajVar.P();
                h.f.b.l.b(P, "");
                if (TextUtils.equals(P.getAid(), str)) {
                    return ajVar;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        StoryListProgressBar storyListProgressBar = this.p;
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        storyListProgressBar.a((StoryListProgressBar) n2.getCurrentItem(), 1.0f, 4.2E-43f);
        com.ss.android.ugc.aweme.story.b.h.b("auto");
        if (m().c(this.f137636j)) {
            DmtRtlViewPager n3 = n();
            h.f.b.l.b(n3, "");
            if (n3.getCurrentItem() == this.q.getCount() - 2) {
                d("story_collection_play_finish");
            }
        } else {
            DmtRtlViewPager n4 = n();
            h.f.b.l.b(n4, "");
            if (n4.getCurrentItem() == this.q.getCount() - 1) {
                d("story_collection_play_finish");
            }
        }
        p();
    }

    private final void a(UserStoryCurrentInfo userStoryCurrentInfo) {
        Integer num;
        List<Aweme> d2 = m().d(this.f137636j);
        if (d2 != null) {
            DmtRtlViewPager n2 = n();
            h.f.b.l.b(n2, "");
            int currentItem = n2.getCurrentItem();
            this.q.a(d2);
            this.p.a(d2.size());
            if (d2.size() != 0) {
                if (userStoryCurrentInfo != null) {
                    num = userStoryCurrentInfo.getCurrentIndex();
                } else {
                    num = null;
                }
                if (num != null) {
                    Integer currentIndex = userStoryCurrentInfo.getCurrentIndex();
                    if (currentIndex != null) {
                        currentItem = currentIndex.intValue();
                    } else {
                        currentItem = 0;
                    }
                    if (currentItem >= d2.size() || currentItem < 0) {
                        currentItem = d2.size() - 1;
                        n().a(currentItem, false);
                    } else {
                        n().a(currentItem, false);
                    }
                } else if (currentItem >= d2.size() || currentItem < 0) {
                    currentItem = d2.size() - 1;
                    n().a(currentItem, false);
                } else {
                    n().a(currentItem, false);
                }
                m();
                p.a(this.f137636j, this.f137633g, Integer.valueOf(currentItem), d2.get(currentItem));
            }
        }
    }

    static final class j<T> implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f137665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cf f137666b;

        static {
            Covode.recordClassIndex(90081);
        }

        j(d dVar, cf cfVar) {
            this.f137665a = dVar;
            this.f137666b = cfVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v7, types: [com.ss.android.ugc.aweme.story.b.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.ss.android.ugc.aweme.feed.i.s
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.d.j.a(java.lang.Object):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.d.b(java.lang.String):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        int currentItem;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        DataCenter dataCenter;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        Aweme aweme = this.f137632f;
        if (aweme != null && bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 291667849) {
                if (hashCode == 1211050238 && str.equals("LOAD_USER_STORY_SUCCESS")) {
                    UserStory userStory = (UserStory) bVar2.a();
                    if (h.f.b.l.a(aweme.getUserStory(), userStory)) {
                        this.f137633g = userStory;
                        h.f.b.l.b(userStory, "");
                        if (com.ss.android.ugc.aweme.story.d.a.a(userStory)) {
                            a(com.ss.android.ugc.aweme.story.b.g.ON_DELETE_COLLECTION, new com.ss.android.ugc.aweme.story.b.m(this.f137630d));
                            return;
                        }
                        a(userStory.getCurrentInfo());
                        if (this.z) {
                            DmtRtlViewPager n2 = n();
                            h.f.b.l.b(n2, "");
                            a(n2.getCurrentItem(), true);
                        } else {
                            DmtRtlViewPager n3 = n();
                            h.f.b.l.b(n3, "");
                            a(n3.getCurrentItem(), false);
                        }
                        f(aweme);
                        c cVar = this.q;
                        DmtRtlViewPager n4 = n();
                        h.f.b.l.b(n4, "");
                        Aweme c2 = cVar.c(n4.getCurrentItem());
                        if (!(c2 == null || (dataCenter = this.f91581a) == null)) {
                            dataCenter.a("ON_STORY_DATA_CHANGED", new com.ss.android.ugc.aweme.story.b.c(c2));
                        }
                        StoryFeedViewModel m2 = m();
                        String str2 = this.f137636j;
                        DmtRtlViewPager n5 = n();
                        h.f.b.l.b(n5, "");
                        m2.a(str2, n5.getCurrentItem(), this.q.e());
                    }
                }
            } else if (str.equals("ON_CURRENT_INFO_CHANGED")) {
                UserStory userStory2 = (UserStory) bVar2.a();
                if (h.f.b.l.a(aweme.getUserStory(), userStory2)) {
                    this.f137633g = userStory2;
                    DmtRtlViewPager n6 = n();
                    h.f.b.l.b(n6, "");
                    if (userStory2 == null || (currentInfo = userStory2.getCurrentInfo()) == null || (currentIndex = currentInfo.getCurrentIndex()) == null) {
                        DmtRtlViewPager n7 = n();
                        h.f.b.l.b(n7, "");
                        currentItem = n7.getCurrentItem();
                    } else {
                        currentItem = currentIndex.intValue();
                    }
                    n6.setCurrentItem(currentItem);
                    StoryFeedViewModel m3 = m();
                    String str3 = this.f137636j;
                    DmtRtlViewPager n8 = n();
                    h.f.b.l.b(n8, "");
                    m3.a(str3, n8.getCurrentItem(), this.q.e());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.a, com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(int i2) {
        Aweme aweme;
        com.ss.android.ugc.aweme.story.interaction.c.a dVar;
        UserStory userStory;
        DmtRtlViewPager n2 = n();
        if (n2 != null) {
            cz a2 = da.a.a("story_horizontally_viewpager").a(this.A);
            com.ss.android.ugc.aweme.at.k.a("story_horizontally_viewpager");
            h hVar = new h(a2);
            this.H = hVar;
            n2.a(hVar);
        }
        this.z = true;
        this.f137638l.clear();
        com.ss.android.ugc.aweme.story.interaction.c.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        ReactionBubbleList reactionBubbleList = this.v;
        if (reactionBubbleList != null) {
            com.ss.android.ugc.aweme.story.interaction.c.a aVar2 = null;
            String str = null;
            String str2 = null;
            aVar2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            com.ss.android.ugc.aweme.story.interaction.c.f fVar = null;
            String str7 = null;
            if (o()) {
                int i3 = this.D;
                if (i3 == 1) {
                    reactionBubbleList.d(false);
                    if (!m().f()) {
                        Aweme aweme2 = this.f137632f;
                        if (aweme2 != null) {
                            str6 = aweme2.getAid();
                        }
                        fVar = new com.ss.android.ugc.aweme.story.interaction.c.f(str6, this.f137639m, reactionBubbleList);
                    }
                    this.E = fVar;
                } else if (i3 == 2) {
                    reactionBubbleList.d(false);
                    CommentService e2 = CommentServiceImpl.e();
                    Aweme aweme3 = this.f137632f;
                    if (aweme3 == null || (userStory = aweme3.getUserStory()) == null) {
                        aweme = null;
                    } else {
                        aweme = UserStoryKt.currentStory(userStory);
                    }
                    if (e2.c(aweme)) {
                        Aweme aweme4 = this.f137632f;
                        if (aweme4 != null) {
                            str3 = aweme4.getAid();
                        }
                        dVar = new com.ss.android.ugc.aweme.story.interaction.c.f(str3, this.f137639m, reactionBubbleList);
                    } else if (m().f()) {
                        Aweme aweme5 = this.f137632f;
                        if (aweme5 != null) {
                            str4 = aweme5.getAid();
                        }
                        dVar = new com.ss.android.ugc.aweme.story.interaction.c.e(str4, this.f137639m, reactionBubbleList);
                    } else {
                        Aweme aweme6 = this.f137632f;
                        if (aweme6 != null) {
                            str5 = aweme6.getAid();
                        }
                        dVar = new com.ss.android.ugc.aweme.story.interaction.c.d(str5, this.f137639m, reactionBubbleList);
                    }
                    aVar2 = dVar;
                } else if (!m().g()) {
                    if (m().f()) {
                        Aweme aweme7 = this.f137632f;
                        if (aweme7 != null) {
                            str = aweme7.getAid();
                        }
                        this.E = new com.ss.android.ugc.aweme.story.interaction.c.e(str, this.f137639m, reactionBubbleList);
                        reactionBubbleList.d(true);
                    } else {
                        Aweme aweme8 = this.f137632f;
                        if (aweme8 != null) {
                            str2 = aweme8.getAid();
                        }
                        this.E = new com.ss.android.ugc.aweme.story.interaction.c.c(str2, this.f137639m, reactionBubbleList);
                        reactionBubbleList.d(true);
                    }
                }
                reactionBubbleList.setBubbleListManager(this.E);
            } else if (this.D == 2) {
                Aweme aweme9 = this.f137632f;
                if (aweme9 != null) {
                    str7 = aweme9.getAid();
                }
                aVar2 = new com.ss.android.ugc.aweme.story.interaction.c.e(str7, this.f137639m, reactionBubbleList);
            }
            this.E = aVar2;
            reactionBubbleList.setBubbleListManager(this.E);
        }
        if (!t() || u()) {
            r();
        } else if (this.x == 0) {
            if (!this.w) {
                b(this.f137632f, this.f137630d);
            } else {
                r();
            }
        } else if (this.w) {
            r();
        }
        d("story_collection_play");
        super.a(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x03f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
        // Method dump skipped, instructions count: 1074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.d.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    private final boolean a(int i2, aj ajVar) {
        Aweme d2;
        Aweme P;
        if (ajVar == null || (d2 = this.q.d(i2)) == null || (P = ajVar.P()) == null) {
            return false;
        }
        if (com.ss.android.ugc.aweme.story.d.a.c(d2)) {
            return TextUtils.equals(d2.getAid(), P.getAid());
        }
        return h.f.b.l.a((Object) d2.getAid(), (Object) P.getAid());
    }

    private final void b(Aweme aweme, int i2) {
        this.w = true;
        if (aweme != null) {
            this.r = true;
            List<Aweme> d2 = m().d(this.f137636j);
            if (d2 != null) {
                int a2 = m().a(this.f137636j, (List<? extends Aweme>) d2);
                this.q.a(d2);
                if (d2.size() > 0 && a2 >= 0) {
                    this.G = true;
                    DmtRtlViewPager n2 = n();
                    h.f.b.l.b(n2, "");
                    n2.setCurrentItem(a2);
                    if (this.G) {
                        a(a2, false);
                    }
                }
                this.p.a(d2.size());
            }
            this.r = false;
            a(new c(aweme, i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(int i2, int i3) {
        super.a(i2, i3);
        this.x = i3;
        if (t() && !u() && !this.w && this.x == 0) {
            b(this.f137632f, this.f137630d);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
        String str2;
        if (j3 != 0) {
            c cVar = this.q;
            DmtRtlViewPager n2 = n();
            h.f.b.l.b(n2, "");
            Aweme c2 = cVar.c(n2.getCurrentItem());
            if (c2 != null) {
                str2 = c2.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str, str2)) {
                long j4 = j3 - j2;
                if (j4 <= 300) {
                    j2 = j3;
                } else {
                    j4 = 300;
                }
                double d2 = (double) j2;
                double d3 = (double) j3;
                Double.isNaN(d2);
                Double.isNaN(d3);
                StoryListProgressBar storyListProgressBar = this.p;
                DmtRtlViewPager n3 = n();
                h.f.b.l.b(n3, "");
                storyListProgressBar.a(n3.getCurrentItem(), (float) (d2 / d3), j4);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup, com.ss.android.ugc.playerkit.videoview.k kVar, final cf cfVar, ViewGroup viewGroup2, final ViewGroup viewGroup3, ViewGroup viewGroup4, h.f.a.b<? super String, ? extends View> bVar) {
        super(viewGroup, kVar, cfVar);
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(cfVar, "");
        h.f.b.l.d(viewGroup2, "");
        h.f.b.l.d(viewGroup3, "");
        h.f.b.l.d(viewGroup4, "");
        MethodCollector.i(5833);
        Context context = viewGroup.getContext();
        this.n = context;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b2d, viewGroup, true);
        this.o = a2;
        com.ss.android.ugc.aweme.feed.param.b bVar2 = cfVar.f91770e.param;
        this.u = bVar2;
        this.y = h.i.a((h.f.a.a) new l(cfVar));
        j jVar = new j(this, cfVar);
        this.B = jVar;
        h.f.b.l.b(context, "");
        LayoutInflater from = LayoutInflater.from(context);
        h.f.b.l.b(from, "");
        c cVar = new c(context, from, jVar, cfVar.f91768c, cfVar.f91769d, cfVar.f91770e, cfVar.f91771f);
        cVar.f91654d = bVar;
        this.q = cVar;
        this.C = h.i.a((h.f.a.a) new k(this));
        int a3 = com.ss.android.ugc.aweme.story.c.b.a();
        this.D = a3;
        String str = this.f137634h;
        h.f.b.l.b(str, "");
        boolean a4 = com.ss.android.ugc.aweme.story.f.a(str);
        this.F = a4;
        StoryFeedViewModel m2 = m();
        m2.a("LOAD_USER_STORY_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        m2.a("LOAD_USER_STORY_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        m2.a("SUBSCRIBE_MINE_STORY_CHANGED", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        m2.a("ON_CURRENT_INFO_CHANGED", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        viewGroup2.setVisibility(0);
        View a5 = com.a.a(LayoutInflater.from(context), R.layout.b2e, viewGroup2, true);
        h.f.b.l.b(a5, "");
        StoryListProgressBar storyListProgressBar = (StoryListProgressBar) a5.findViewById(R.id.dc1);
        h.f.b.l.b(storyListProgressBar, "");
        this.p = storyListProgressBar;
        if (!com.ss.android.ugc.aweme.story.c.e.a()) {
            viewGroup4.setVisibility(0);
            a(viewGroup4);
        } else if (!o() ? a3 != 2 : a3 == 1 ? m().f() : a3 != 2 && m().g()) {
            viewGroup4.setVisibility(8);
        } else {
            viewGroup4.setVisibility(0);
            a(viewGroup4);
        }
        h.f.b.l.b(bVar2, "");
        if (bVar2.getStoryType() == 1) {
            storyListProgressBar.setVisibility(8);
        }
        if (com.ss.android.ugc.aweme.adaptation.c.f66197m == 0) {
            int a6 = com.bytedance.ies.uikit.c.a.a(context);
            h.f.b.l.b(a2, "");
            View findViewById = a2.findViewById(R.id.e_f);
            h.f.b.l.b(findViewById, "");
            findViewById.getLayoutParams().height = a6;
        } else {
            h.f.b.l.b(a2, "");
            View findViewById2 = a2.findViewById(R.id.e_f);
            h.f.b.l.b(findViewById2, "");
            findViewById2.getLayoutParams().height = 0;
        }
        if (!com.ss.android.ugc.aweme.story.c.e.a() || com.ss.android.ugc.aweme.story.c.b.b()) {
            h.f.b.l.b(a2, "");
            View inflate = ((ViewStub) a2.findViewById(R.id.bf4)).inflate();
            StoryHeaderView storyHeaderView = (StoryHeaderView) (!(inflate instanceof StoryHeaderView) ? null : inflate);
            this.t = storyHeaderView;
            if (storyHeaderView != null) {
                SmartImageView smartImageView = (SmartImageView) storyHeaderView.b(R.id.ov);
                h.f.b.l.b(smartImageView, "");
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                    TuxIconView tuxIconView = (TuxIconView) storyHeaderView.b(R.id.cnm);
                    h.f.b.l.b(tuxIconView, "");
                    ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
                    if (layoutParams2 != null) {
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
                        if (a4) {
                            Resources system = Resources.getSystem();
                            h.f.b.l.a((Object) system, "");
                            aVar.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics())));
                            Resources system2 = Resources.getSystem();
                            h.f.b.l.a((Object) system2, "");
                            aVar2.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics())));
                        } else {
                            Resources system3 = Resources.getSystem();
                            h.f.b.l.a((Object) system3, "");
                            aVar.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 0.0f, system3.getDisplayMetrics())));
                            Resources system4 = Resources.getSystem();
                            h.f.b.l.a((Object) system4, "");
                            aVar2.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 40.0f, system4.getDisplayMetrics())));
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        MethodCollector.o(5833);
                        throw nullPointerException;
                    }
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.o(5833);
                    throw nullPointerException2;
                }
            }
        }
        DmtRtlViewPager n2 = n();
        h.f.b.l.b(n2, "");
        n2.setAdapter(cVar);
        n().a(new C3618d(this));
        b(new h.f.a.b<List<b>, z>(this) {
            /* class com.ss.android.ugc.aweme.story.feed.common.d.AnonymousClass1 */
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(90070);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<b> list) {
                List<b> list2 = list;
                h.f.b.l.d(list2, "");
                if (!com.ss.android.ugc.aweme.story.c.e.a()) {
                    d.a(list2, new com.ss.android.ugc.aweme.story.feed.common.b.a(viewGroup3));
                } else if (this.this$0.o()) {
                    d.a(list2, new com.ss.android.ugc.aweme.story.feed.common.b.a(viewGroup3));
                }
                d.a(list2, new com.ss.android.ugc.aweme.story.feed.common.a.a());
                return z.f158842a;
            }
        });
        a(new h.f.a.b<b, z>(this) {
            /* class com.ss.android.ugc.aweme.story.feed.common.d.AnonymousClass2 */
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(90071);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(b bVar) {
                b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                c cVar = this.this$0.q;
                d dVar = this.this$0;
                StoryFeedViewModel m2 = dVar.m();
                DmtRtlViewPager n = this.this$0.n();
                h.f.b.l.b(n, "");
                Context context = this.this$0.n;
                h.f.b.l.b(context, "");
                StoryListProgressBar storyListProgressBar = this.this$0.p;
                cf cfVar = cfVar;
                View view = this.this$0.o;
                h.f.b.l.b(view, "");
                h.f.b.l.d(cVar, "");
                h.f.b.l.d(n, "");
                h.f.b.l.d(m2, "");
                h.f.b.l.d(dVar, "");
                h.f.b.l.d(context, "");
                h.f.b.l.d(storyListProgressBar, "");
                h.f.b.l.d(cfVar, "");
                h.f.b.l.d(view, "");
                bVar2.f137640a = cVar;
                bVar2.f137641b = n;
                bVar2.f137642c = m2;
                bVar2.f137643d = dVar;
                bVar2.f137644e = context;
                bVar2.f137645f = storyListProgressBar;
                bVar2.f137646g = cfVar;
                bVar2.f137647h = view;
                bVar2.g();
                return z.f158842a;
            }
        });
        MethodCollector.o(5833);
    }
}
