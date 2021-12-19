package com.ss.android.ugc.aweme.commentStickerPanel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.tabs.TabLayout;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.effect.s;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: k  reason: collision with root package name */
    public static final c f73169k = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<String> f73170a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager f73171b;

    /* renamed from: c  reason: collision with root package name */
    public TabLayout f73172c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f73173d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f73174e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f73175f;

    /* renamed from: g  reason: collision with root package name */
    public float f73176g = Float.POSITIVE_INFINITY;

    /* renamed from: h  reason: collision with root package name */
    public float f73177h;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.als.k<z> f73178i = new com.bytedance.als.k<>();

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.als.k<CommentVideoModel> f73179j = new com.bytedance.als.k<>();

    /* renamed from: l  reason: collision with root package name */
    private final h.h f73180l;
    private View t;
    private View u;
    private CommentStickerPanelContainer v;
    private final h.h w = h.i.a((h.f.a.a) new C1631g(this));
    private com.ss.android.ugc.tools.view.a.c x;
    private final f y = new f(this);
    private final com.bytedance.o.f z;

    static {
        Covode.recordClassIndex(45072);
    }

    public final CommentAndQuestionAndQuestionStickerPanelViewModel a() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f73180l.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(45075);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.z;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(45076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$g  reason: collision with other inner class name */
    static final class C1631g extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(45079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1631g(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            g gVar = this.this$0;
            Activity t = gVar.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) t).getSupportFragmentManager();
            h.f.b.l.b(supportFragmentManager, "");
            return new b(gVar, supportFragmentManager, n.k(this.this$0.f73173d), g.b(this.this$0));
        }
    }

    public final void C() {
        List<e> list = this.f73173d;
        ViewPager viewPager = this.f73171b;
        if (viewPager == null) {
            h.f.b.l.a("mPager");
        }
        e eVar = list.get(viewPager.getCurrentItem());
        l lVar = eVar.f73159f;
        if (lVar != null) {
            lVar.b();
        }
        l lVar2 = eVar.f73156c;
        if (lVar2 != null) {
            lVar2.b();
        }
        l lVar3 = eVar.f73157d;
        if (lVar3 != null) {
            lVar3.b();
        }
        l lVar4 = eVar.f73158e;
        if (lVar4 != null) {
            lVar4.b();
        }
        l lVar5 = eVar.f73160g;
        if (lVar5 != null) {
            lVar5.b();
        }
    }

    public final CommentVideoModel d() {
        CommentVideoModel commentVideoModel = a().f73094e;
        if (commentVideoModel == null) {
            return new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        }
        return commentVideoModel;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(45073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_commentStickerPanel_CommentAndQuestionStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_commentStickerPanel_CommentAndQuestionStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentStickerPanel.g.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_commentStickerPanel_CommentAndQuestionStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void b() {
        if (!a().a(CommentAndQuestionAndQuestionStickerPanelViewModel.a.SuggestTab)) {
            ViewPager viewPager = this.f73171b;
            if (viewPager == null) {
                h.f.b.l.a("mPager");
            }
            viewPager.setCurrentItem(0);
            ViewPager viewPager2 = this.f73171b;
            if (viewPager2 == null) {
                h.f.b.l.a("mPager");
            }
            PagerAdapter adapter = viewPager2.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelScene.CommentStickerPanelPageAdapter");
            adapter.notifyDataSetChanged();
            return;
        }
        ViewPager viewPager3 = this.f73171b;
        if (viewPager3 == null) {
            h.f.b.l.a("mPager");
        }
        if (viewPager3.getCurrentItem() == 0) {
            ViewPager viewPager4 = this.f73171b;
            if (viewPager4 == null) {
                h.f.b.l.a("mPager");
            }
            viewPager4.setCurrentItem(1);
            ViewPager viewPager5 = this.f73171b;
            if (viewPager5 == null) {
                h.f.b.l.a("mPager");
            }
            PagerAdapter adapter2 = viewPager5.getAdapter();
            Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelScene.CommentStickerPanelPageAdapter");
            adapter2.notifyDataSetChanged();
        }
    }

    public static final class e implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f73184a;

        static {
            Covode.recordClassIndex(45077);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f73184a = gVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            if (i2 == 0 && this.f73184a.a().f73093d) {
                this.f73184a.C();
                this.f73184a.a().f73093d = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            CommentAndQuestionAndQuestionStickerPanelViewModel.a aVar;
            CommentAndQuestionAndQuestionStickerPanelViewModel a2 = this.f73184a.a();
            if (i2 == 0) {
                aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.a.SuggestTab;
            } else {
                aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.a.FavoriteTab;
            }
            h.f.b.l.d(aVar, "");
            a2.f73092c = aVar;
            if (this.f73184a.f73175f) {
                this.f73184a.a().f73093d = true;
                this.f73184a.d(0);
                if (!this.f73184a.f73174e) {
                    this.f73184a.a().a((String) g.b(this.f73184a).get(i2), "slide");
                }
            }
            this.f73184a.f73174e = false;
            this.f73184a.f73175f = true;
        }
    }

    public static final class f implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f73185a;

        static {
            Covode.recordClassIndex(45078);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(g gVar) {
            this.f73185a = gVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f73185a.z()) {
                return false;
            }
            this.f73185a.a().b();
            return true;
        }
    }

    final class b extends androidx.fragment.app.l {

        /* renamed from: a  reason: collision with root package name */
        public final List<Fragment> f73181a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f73182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f73183c;

        static {
            Covode.recordClassIndex(45074);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.l
        public final Fragment a(int i2) {
            return this.f73181a.get(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            return this.f73182b.get(i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar, androidx.fragment.app.i iVar, List<? extends Fragment> list, List<String> list2) {
            super(iVar);
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list, "");
            h.f.b.l.d(list2, "");
            this.f73183c = gVar;
            this.f73181a = list;
            this.f73182b = list2;
        }
    }

    public static final /* synthetic */ TabLayout a(g gVar) {
        TabLayout tabLayout = gVar.f73172c;
        if (tabLayout == null) {
            h.f.b.l.a("mTabs");
        }
        return tabLayout;
    }

    public static final /* synthetic */ List b(g gVar) {
        List<String> list = gVar.f73170a;
        if (list == null) {
            h.f.b.l.a("tabTitles");
        }
        return list;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class m<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f73189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f73190b;

        static {
            Covode.recordClassIndex(45085);
        }

        m(g gVar, boolean z) {
            this.f73189a = gVar;
            this.f73190b = z;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            if (this.f73190b) {
                this.f73189a.C();
                return;
            }
            com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) this.f73189a.o;
            if (bVar != null) {
                bVar.d(this.f73189a);
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<String, TabLayout.f> {
        final /* synthetic */ TabLayout $this_apply;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(45080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TabLayout tabLayout, g gVar) {
            super(1);
            this.$this_apply = tabLayout;
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TabLayout.f invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            View a2 = com.a.a(LayoutInflater.from(this.this$0.s()), R.layout.no, g.a(this.this$0), false);
            View findViewById = a2.findViewById(R.id.a_x);
            h.f.b.l.b(findViewById, "");
            ((TuxTextView) findViewById).setText(str2);
            TabLayout.f a3 = this.$this_apply.newTab().a(a2);
            h.f.b.l.b(a3, "");
            return a3;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f73186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73187b;

        static {
            Covode.recordClassIndex(45081);
        }

        i(g gVar, int i2) {
            this.f73186a = gVar;
            this.f73187b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73186a.f73174e = true;
            this.f73186a.a().a((String) g.b(this.f73186a).get(this.f73187b), "click");
            TabLayout.f tabAt = g.a(this.f73186a).getTabAt(this.f73187b);
            if (tabAt != null) {
                tabAt.a();
            }
            ViewPager viewPager = this.f73186a.f73171b;
            if (viewPager == null) {
                h.f.b.l.a("mPager");
            }
            viewPager.setCurrentItem(this.f73187b);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<MotionEvent, Boolean> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(45084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            h.f.b.l.d(motionEvent2, "");
            if (h.f.b.l.a((Object) this.this$0.a().f73096g.getValue(), (Object) true)) {
                int action = motionEvent2.getAction();
                if (action == 0) {
                    this.this$0.f73176g = motionEvent2.getY();
                } else if (action == 1) {
                    this.this$0.f73176g = Float.POSITIVE_INFINITY;
                    if (this.this$0.f73177h > 200.0f) {
                        this.this$0.a().b();
                        this.this$0.f73177h = 0.0f;
                    }
                } else if (action == 2) {
                    this.this$0.f73177h = motionEvent2.getY() - this.this$0.f73176g;
                }
            }
            return false;
        }
    }

    public g(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.z = fVar;
        h.k.c a2 = h.f.b.ab.a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        this.f73180l = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public final void a(boolean z2) {
        if (z2) {
            b();
            d(1);
            com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) this.o;
            if (bVar != null) {
                bVar.e(this);
            }
            com.ss.android.ugc.tools.view.a.c cVar = this.x;
            if (cVar != null) {
                cVar.b(this.y);
            }
        } else {
            com.ss.android.ugc.tools.view.a.c cVar2 = this.x;
            if (cVar2 != null) {
                cVar2.c(this.y);
            }
        }
        CommentStickerPanelContainer commentStickerPanelContainer = this.v;
        if (commentStickerPanelContainer == null) {
            h.f.b.l.a("insideView");
        }
        View view = this.t;
        if (view == null) {
            h.f.b.l.a("root");
        }
        s.a(commentStickerPanelContainer, z2, 593, view, 100, new m(this, z2));
    }

    public final void d(int i2) {
        CommentAndQuestionAndQuestionStickerPanelViewModel.a aVar;
        Map<String, String> map;
        CommentAndQuestionAndQuestionStickerPanelViewModel a2 = a();
        ViewPager viewPager = this.f73171b;
        if (viewPager == null) {
            h.f.b.l.a("mPager");
        }
        if (viewPager.getCurrentItem() == 0) {
            aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.a.SuggestTab;
        } else {
            aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.a.FavoriteTab;
        }
        String tabName = aVar.getTabName();
        boolean a3 = a2.a(aVar);
        h.f.b.l.d(tabName, "");
        String str = a2.f73091b.get(tabName);
        if (str != null) {
            k kVar = a2.v;
            h.f.b.l.d(str, "");
            com.ss.android.ugc.tools.f.b a4 = kVar.a();
            if (a4 != null) {
                a4.a("tab_name", str);
                a4.a("is_landing", i2);
                a4.a("is_blank", a3 ? 1 : 0);
                map = a4.f149193a;
            } else {
                map = null;
            }
            com.ss.android.ugc.aweme.utils.d.a("reply_panel_show", map);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        View view;
        super.a(bundle);
        View c2 = c(R.id.aag);
        h.f.b.l.b(c2, "");
        this.f73171b = (ViewPager) c2;
        View c3 = c(R.id.aad);
        h.f.b.l.b(c3, "");
        this.f73172c = (TabLayout) c3;
        View c4 = c(R.id.aaa);
        h.f.b.l.b(c4, "");
        this.u = c4;
        View c5 = c(R.id.aa_);
        h.f.b.l.b(c5, "");
        this.v = (CommentStickerPanelContainer) c5;
        List<String> list = a().f73090a;
        this.f73170a = list;
        if (list == null) {
            h.f.b.l.a("tabTitles");
        }
        for (T t2 : list) {
            List<e> list2 = this.f73173d;
            h.f.b.l.d(t2, "");
            Bundle bundle2 = new Bundle();
            bundle2.putString("tabTitle", t2);
            e eVar = new e();
            eVar.setArguments(bundle2);
            list2.add(eVar);
        }
        ViewPager viewPager = this.f73171b;
        if (viewPager == null) {
            h.f.b.l.a("mPager");
        }
        viewPager.setAdapter((b) this.w.getValue());
        ViewPager viewPager2 = this.f73171b;
        if (viewPager2 == null) {
            h.f.b.l.a("mPager");
        }
        Context s = s();
        h.f.b.l.b(s, "");
        viewPager2.setPageMargin((int) r.a(s, 24.0f));
        ViewPager viewPager3 = this.f73171b;
        if (viewPager3 == null) {
            h.f.b.l.a("mPager");
        }
        List<String> list3 = this.f73170a;
        if (list3 == null) {
            h.f.b.l.a("tabTitles");
        }
        viewPager3.setCurrentItem(list3.size() - 1);
        a().a(new d(this));
        ViewPager viewPager4 = this.f73171b;
        if (viewPager4 == null) {
            h.f.b.l.a("mPager");
        }
        viewPager4.addOnPageChangeListener(new e(this));
        TabLayout tabLayout = this.f73172c;
        if (tabLayout == null) {
            h.f.b.l.a("mTabs");
        }
        h hVar = new h(tabLayout, this);
        List<String> list4 = this.f73170a;
        if (list4 == null) {
            h.f.b.l.a("tabTitles");
        }
        for (String str : list4) {
            tabLayout.addTab((TabLayout.f) hVar.invoke(str));
        }
        List<String> list5 = this.f73170a;
        if (list5 == null) {
            h.f.b.l.a("tabTitles");
        }
        int size = list5.size();
        for (int i2 = 0; i2 < size; i2++) {
            TabLayout tabLayout2 = this.f73172c;
            if (tabLayout2 == null) {
                h.f.b.l.a("mTabs");
            }
            TabLayout.f tabAt = tabLayout2.getTabAt(i2);
            View view2 = null;
            ViewParent parent = (tabAt == null || (view = tabAt.f52655f) == null) ? null : view.getParent();
            if (parent instanceof View) {
                view2 = parent;
            }
            View view3 = view2;
            if (view3 != null) {
                view3.setOnClickListener(new i(this, i2));
            }
        }
        TabLayout tabLayout3 = this.f73172c;
        if (tabLayout3 == null) {
            h.f.b.l.a("mTabs");
        }
        ViewPager viewPager5 = this.f73171b;
        if (viewPager5 == null) {
            h.f.b.l.a("mPager");
        }
        tabLayout3.setupWithViewPager(viewPager5);
        b.a.b(this, a(), h.f73191a, new j(this));
        CommentAndQuestionAndQuestionStickerPanelViewModel a2 = a();
        h.f.b.l.d(this, "");
        a2.t.observe(this, new CommentAndQuestionAndQuestionStickerPanelViewModel.h(a2));
        View view4 = this.u;
        if (view4 == null) {
            h.f.b.l.a("outSideView");
        }
        view4.setOnTouchListener(new k(this));
        if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            this.x = (com.ss.android.ugc.tools.view.a.c) activity;
        }
        CommentStickerPanelContainer commentStickerPanelContainer = this.v;
        if (commentStickerPanelContainer == null) {
            h.f.b.l.a("insideView");
        }
        commentStickerPanelContainer.setOnInterceptorHandler(new l(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(45082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.f73178i.a(z.f158842a);
            return z.f158842a;
        }
    }

    static final class k implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f73188a;

        static {
            Covode.recordClassIndex(45083);
        }

        k(g gVar) {
            this.f73188a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h.f.b.l.b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                this.f73188a.a().b();
            }
            return true;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.nj, viewGroup, false);
        h.f.b.l.b(a2, "");
        this.t = a2;
        if (a2 == null) {
            h.f.b.l.a("root");
        }
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
