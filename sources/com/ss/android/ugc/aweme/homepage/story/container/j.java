package com.ss.android.ugc.aweme.homepage.story.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.BounceInterpolator;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ak;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer;
import com.ss.android.ugc.aweme.homepage.story.container.b;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.ss.android.ugc.aweme.services.story.IStoryView;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class j extends RelativeLayout implements com.bytedance.assem.arch.viewModel.h, c {
    public static final f p = new f((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public StorySidebarFeedVM f99322a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f99323b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f99324c;

    /* renamed from: d  reason: collision with root package name */
    View f99325d;

    /* renamed from: e  reason: collision with root package name */
    public int f99326e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f99327f;

    /* renamed from: g  reason: collision with root package name */
    final b f99328g;

    /* renamed from: h  reason: collision with root package name */
    public IStoryView f99329h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f99330i;

    /* renamed from: j  reason: collision with root package name */
    public h.p<Boolean, ? extends Aweme> f99331j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f99332k;

    /* renamed from: l  reason: collision with root package name */
    public ObjectAnimator f99333l;

    /* renamed from: m  reason: collision with root package name */
    EnterStoryParam f99334m;
    public boolean n;
    final f o;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;

    static {
        Covode.recordClassIndex(63272);
    }

    private final IStoryPublishService getStoryPublishService() {
        return (IStoryPublishService) this.t.getValue();
    }

    public final DrawerViewModel getDrawerViewModel() {
        return (DrawerViewModel) this.q.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final HomePageDataViewModel getHomeViewModel() {
        return (HomePageDataViewModel) this.r.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final IStoryService getStoryToolsService() {
        return (IStoryService) this.s.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public static final class f {
        static {
            Covode.recordClassIndex(63278);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    public final b getEvent() {
        return this.f99328g;
    }

    public final boolean getHasData() {
        return this.f99327f;
    }

    public final f getStoryContainer() {
        return this.o;
    }

    public final void a(boolean z) {
        Aweme aweme;
        Aweme aweme2;
        String aid;
        if (this.f99331j.getFirst().booleanValue() != z) {
            if (!z) {
                aweme = (Aweme) this.f99331j.getSecond();
                aweme2 = null;
            } else {
                aweme = getHomeViewModel().f99128k;
                aweme2 = aweme;
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.c.b(z, aweme, 2));
            if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                com.ss.android.ugc.d.a.c.a(new ah(z, aid));
            }
            this.f99331j = this.f99331j.copy(Boolean.valueOf(z), aweme2);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.story.container.c
    public final boolean a() {
        IStoryView iStoryView;
        boolean z = false;
        if (this.f99329h != null && this.o.c() && (!h.f.b.l.a((Object) getDrawerViewModel().f99260c.getValue(), (Object) true) || this.f99325d.getVisibility() != 0 || (iStoryView = this.f99329h) == null || !(z = iStoryView.onBackPressed()))) {
            this.o.b();
        }
        return z;
    }

    static final class p extends h.f.b.m implements h.f.a.a<IStoryPublishService> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f99354a = new p();

        static {
            Covode.recordClassIndex(63290);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IStoryPublishService invoke() {
            return StoryPublishServiceImpl.a();
        }
    }

    public final void c() {
        this.f99325d.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f99313a = this;
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f99340b;

        static {
            Covode.recordClassIndex(63275);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void b() {
            Runnable runnable = this.f99339a.f99330i;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.e
        public final void c() {
            StorySidebarFeedVM storySidebarFeedVM = this.f99339a.f99322a;
            if (storySidebarFeedVM != null) {
                storySidebarFeedVM.a(0);
            }
            this.f99339a.a(false);
            b event = this.f99339a.getEvent();
            r.a("close_westwindow", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", event.f99296a).a("enter_method", event.f99299d).f66730a);
            b event2 = this.f99339a.getEvent();
            long j2 = event2.f99300e;
            if (j2 != 0) {
                event2.f99300e = 0;
                r.a("westwindow_stay_time", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "westwindow").a("duration", System.currentTimeMillis() - j2).f66730a);
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.e
        public final void d() {
            StorySidebarFeedVM storySidebarFeedVM = this.f99339a.f99322a;
            if (storySidebarFeedVM != null) {
                storySidebarFeedVM.a(1);
            }
            this.f99339a.a(true);
            this.f99339a.getEvent().f99300e = System.currentTimeMillis();
            b event = this.f99339a.getEvent();
            String str = this.f99339a.getDrawerViewModel().f99266i;
            String str2 = this.f99339a.getDrawerViewModel().f99267j;
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            r.a("enter_westwindow", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", event.f99296a).a("enter_method", event.f99298c).a("notice_type", str).a("author_id", str2).f66730a);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.e
        public final void b(float f2) {
            if ((!h.f.b.l.a((Object) this.f99339a.getDrawerViewModel().f99259b.getValue(), (Object) true)) && f2 > 0.4f && (this.f99339a.f99326e & 2) == 0) {
                this.f99339a.f99326e |= 2;
                StorySidebarFeedVM storySidebarFeedVM = this.f99339a.f99322a;
                if (storySidebarFeedVM != null) {
                    storySidebarFeedVM.a(1);
                }
            }
        }

        c(j jVar, Context context) {
            this.f99339a = jVar;
            this.f99340b = context;
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(int i2, boolean z, boolean z2) {
            StorySidebarFeedVM storySidebarFeedVM;
            if (i2 == 0 && !z2 && (storySidebarFeedVM = this.f99339a.f99322a) != null) {
                storySidebarFeedVM.a(0);
            }
        }
    }

    public static final class d implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f99342b;

        static {
            Covode.recordClassIndex(63276);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.d
        public final void c() {
            this.f99341a.d(true);
            this.f99341a.b(false);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.d
        public final void d() {
            IStoryView iStoryView;
            this.f99341a.d(false);
            this.f99341a.b();
            if ((this.f99341a.f99326e & 1) == 0 && (iStoryView = this.f99341a.f99329h) != null) {
                iStoryView.onSlideExitStoryShoot();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01bd  */
        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(float r23) {
            /*
            // Method dump skipped, instructions count: 563
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.container.j.d.a(float):void");
        }

        d(j jVar, Context context) {
            this.f99341a = jVar;
            this.f99342b = context;
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(int i2, boolean z, boolean z2) {
            if (i2 == 0) {
                if (!this.f99341a.getStoryContainer().c() || ((z2 || !z) && (!h.f.b.l.a((Object) this.f99341a.getDrawerViewModel().f99260c.getValue(), (Object) true)))) {
                    this.f99341a.d(false);
                    this.f99341a.b();
                }
                if (!((this.f99341a.f99326e & 16) == 0 || (this.f99341a.f99326e & 32) == 0 || (this.f99341a.f99326e & 4) == 0)) {
                    this.f99341a.a(this.f99342b);
                }
                if (this.f99341a.n) {
                    this.f99341a.n = false;
                    ak.a("exit", "slide");
                }
                this.f99341a.e(true);
            } else if (i2 == 1) {
                this.f99341a.f99326e |= 32;
                this.f99341a.getEvent().c("slide_left");
                this.f99341a.getEvent().b("slide");
                this.f99341a.getEvent().a("slide_right");
                DrawerViewModel drawerViewModel = this.f99341a.getDrawerViewModel();
                h.f.b.l.d("slide", "");
                drawerViewModel.f99265h = "slide";
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(63286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            Context context = this.$context;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return DrawerViewModel.a.a((androidx.fragment.app.e) context);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<HomePageDataViewModel> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(63288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HomePageDataViewModel invoke() {
            Context context = this.$context;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return HomePageDataViewModel.a.a((androidx.fragment.app.e) context);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<IStoryService> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f99355a = new q();

        static {
            Covode.recordClassIndex(63291);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IStoryService invoke() {
            return AVExternalServiceImpl.a().storyService();
        }
    }

    private final float getDensity() {
        Resources resources = getResources();
        h.f.b.l.b(resources, "");
        return resources.getDisplayMetrics().density;
    }

    public final void d() {
        ViewGroup viewGroup;
        int i2;
        if (this.f99327f) {
            viewGroup = this.f99323b;
            i2 = 0;
        } else {
            viewGroup = this.f99323b;
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    public final int getSideBarViewWidth() {
        return (int) ((getDensity() * 92.0f) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h.f99313a = null;
        e();
    }

    public final void e() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f99333l;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.f99333l) != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.lifecycle.i lifecycle = ((androidx.core.app.d) context).getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    public static final class o implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f99352b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f99353c = false;

        static {
            Covode.recordClassIndex(63289);
        }

        public final void onGlobalLayout() {
            if (this.f99351a.getHasData()) {
                this.f99352b.element = this.f99351a.getSideBarViewWidth();
            }
            this.f99351a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f99351a.a(this.f99352b.element, this.f99353c);
        }

        o(j jVar, z.c cVar) {
            this.f99351a = jVar;
            this.f99352b = cVar;
        }
    }

    public final void b() {
        Fragment asFragment;
        IStoryView iStoryView = this.f99329h;
        if (iStoryView != null && (asFragment = iStoryView.asFragment()) != null && !asFragment.isDetached()) {
            this.o.getHostFragment().getChildFragmentManager().a().d(asFragment).c();
        }
    }

    public static final class g implements u<h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99345a;

        static {
            Covode.recordClassIndex(63279);
        }

        g(j jVar) {
            this.f99345a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(h.z zVar) {
            if (zVar != null) {
                this.f99345a.getStoryContainer().b();
            }
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99350a;

        static {
            Covode.recordClassIndex(63285);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(j jVar) {
            this.f99350a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f99350a.getStoryContainer().d();
            this.f99350a.f99323b.setVisibility(8);
        }
    }

    public final void a(Context context) {
        h.f.b.l.d(context, "");
        IStoryService storyToolsService = getStoryToolsService();
        if (storyToolsService != null) {
            storyToolsService.showPublishingToast(context);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f99344b;

        static {
            Covode.recordClassIndex(63277);
        }

        e(j jVar, Context context) {
            this.f99343a = jVar;
            this.f99344b = context;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                j jVar = this.f99343a;
                jVar.f99331j = jVar.f99331j.copy(false, null);
            }
        }
    }

    public final void d(boolean z) {
        e(false);
        if (z) {
            this.f99323b.setVisibility(8);
            c();
            return;
        }
        d();
        this.f99325d.setVisibility(8);
    }

    public final void setLockReleaseStep(boolean z) {
        if (this.o.f99274d != z) {
            h.a("StorySidebarContainer >>> setLockReleaseStep: ".concat(String.valueOf(z)));
            this.o.setLockReleaseStep(z);
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f99336b;

        static {
            Covode.recordClassIndex(63273);
        }

        a(j jVar, Context context) {
            this.f99335a = jVar;
            this.f99336b = context;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = this.f99335a.f99324c.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null && num != null && num.intValue() != layoutParams2.bottomMargin) {
                layoutParams2.bottomMargin = num.intValue();
                this.f99335a.f99324c.setLayoutParams(layoutParams2);
            }
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99346a;

        static {
            Covode.recordClassIndex(63280);
        }

        h(j jVar) {
            this.f99346a = jVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            IStoryView iStoryView;
            h.u uVar = (h.u) obj;
            if (uVar != null && (iStoryView = this.f99346a.f99329h) != null) {
                iStoryView.onActivityResult(((Number) uVar.getFirst()).intValue(), ((Number) uVar.getSecond()).intValue(), (Intent) uVar.getThird());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$j  reason: collision with other inner class name */
    static final class C2429j extends h.f.b.m implements h.f.a.b<Assembler, h.z> {
        final /* synthetic */ androidx.fragment.app.e $this_apply;

        static {
            Covode.recordClassIndex(63283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2429j(androidx.fragment.app.e eVar) {
            super(1);
            this.$this_apply = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            androidx.fragment.app.e eVar = this.$this_apply;
            AnonymousClass1 r1 = AnonymousClass1.f99349a;
            h.f.b.l.c(eVar, "");
            h.f.b.l.c(r1, "");
            AssemSupervisor assemSupervisor = assembler2.f25540a.get(eVar);
            if (assemSupervisor != null) {
                com.bytedance.assem.arch.core.r rVar = new com.bytedance.assem.arch.core.r();
                r1.invoke(rVar);
                com.bytedance.assem.arch.d.b b2 = rVar.a();
                Assembler.a(rVar.f25603c, b2, assemSupervisor.f25534g);
                assemSupervisor.a(b2);
                assemSupervisor.a(false, (com.bytedance.assem.arch.core.a) null);
            }
            return h.z.f158842a;
        }
    }

    public final boolean c(boolean z) {
        IStoryPublishService storyPublishService = getStoryPublishService();
        Context context = getContext();
        h.f.b.l.b(context, "");
        boolean isPublishing = storyPublishService.isPublishing(context);
        if (isPublishing && z) {
            Context context2 = getContext();
            h.f.b.l.b(context2, "");
            a(context2);
        }
        if (isPublishing) {
            return true;
        }
        ObjectAnimator objectAnimator = this.f99333l;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public final void e(boolean z) {
        int i2;
        this.f99325d.setAlpha(1.0f);
        this.f99323b.setAlpha(1.0f);
        if (z) {
            i2 = 0;
        } else {
            i2 = this.f99326e & 53;
        }
        this.f99326e = i2;
    }

    public final void b(boolean z) {
        Fragment asFragment;
        IStoryView iStoryView;
        IStoryView iStoryView2 = this.f99329h;
        if (iStoryView2 != null && (asFragment = iStoryView2.asFragment()) != null) {
            if (asFragment.isDetached()) {
                EnterStoryParam enterStoryParam = this.f99334m;
                if (!(enterStoryParam == null || (iStoryView = this.f99329h) == null)) {
                    String str = this.f99328g.f99296a;
                    if (str == null) {
                        str = "unknown";
                    }
                    iStoryView.updateEnterStoryParam(EnterStoryParam.copy$default(enterStoryParam, null, this.f99328g.f99297b, str, false, false, this.f99327f, false, 89, null));
                }
                this.o.getHostFragment().getChildFragmentManager().a().e(asFragment).c();
            } else if (!z) {
                IStoryView iStoryView3 = this.f99329h;
                if (iStoryView3 != null) {
                    iStoryView3.onOpenCompletely();
                }
                if (h.f99316d) {
                    this.f99332k = true;
                }
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f99338b;

        static {
            Covode.recordClassIndex(63274);
        }

        b(j jVar, Context context) {
            this.f99337a = jVar;
            this.f99338b = context;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int left;
            ObjectAnimator objectAnimator;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                j jVar = this.f99337a;
                ObjectAnimator objectAnimator2 = jVar.f99333l;
                if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = jVar.f99333l) == null)) {
                    objectAnimator.cancel();
                }
                Context context = jVar.getContext();
                h.f.b.l.b(context, "");
                boolean a2 = com.bytedance.tux.h.i.a(context);
                int sideBarViewWidth = jVar.getSideBarViewWidth();
                jVar.f99323b.setVisibility(0);
                if (a2) {
                    left = jVar.getLeft() - (sideBarViewWidth / 2);
                } else {
                    left = jVar.getLeft() + (sideBarViewWidth / 2);
                }
                jVar.f99333l = ObjectAnimator.ofInt(jVar.o, "fakeLeft", jVar.getLeft(), left, jVar.getLeft()).setDuration(1200L);
                ObjectAnimator objectAnimator3 = jVar.f99333l;
                if (objectAnimator3 != null) {
                    objectAnimator3.setRepeatCount(10);
                }
                ObjectAnimator objectAnimator4 = jVar.f99333l;
                if (objectAnimator4 != null) {
                    objectAnimator4.setRepeatMode(1);
                }
                ObjectAnimator objectAnimator5 = jVar.f99333l;
                if (objectAnimator5 != null) {
                    objectAnimator5.setInterpolator(new BounceInterpolator());
                }
                ObjectAnimator objectAnimator6 = jVar.f99333l;
                if (objectAnimator6 != null) {
                    objectAnimator6.start();
                }
                ObjectAnimator objectAnimator7 = jVar.f99333l;
                if (objectAnimator7 != null) {
                    objectAnimator7.addListener(new k(jVar));
                    return;
                }
                return;
            }
            this.f99337a.e();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<b.EnumC2428b, String, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(63287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(b.EnumC2428b bVar, String str) {
            com.ss.android.ugc.aweme.homepage.story.feed.e eVar;
            StorySidebarFeedVM storySidebarFeedVM;
            com.ss.android.ugc.aweme.homepage.story.feed.e eVar2;
            b.EnumC2428b bVar2 = bVar;
            String str2 = str;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(str2, "");
            int i2 = k.f99356a[bVar2.ordinal()];
            if (i2 == 1) {
                StorySidebarFeedVM storySidebarFeedVM2 = this.this$0.f99322a;
                if (!(storySidebarFeedVM2 == null || (eVar = storySidebarFeedVM2.f99373j) == null)) {
                    h.f.b.l.d(str2, "");
                    eVar.f99409a = str2;
                }
            } else if (!(i2 != 2 || (storySidebarFeedVM = this.this$0.f99322a) == null || (eVar2 = storySidebarFeedVM.f99373j) == null)) {
                h.f.b.l.d(str2, "");
                eVar2.f99410b = str2;
            }
            return h.z.f158842a;
        }
    }

    public static /* synthetic */ void a(j jVar, boolean z) {
        jVar.f99327f = z;
        z.c cVar = new z.c();
        cVar.element = 0;
        if (jVar.getWidth() > 0) {
            if (jVar.f99327f) {
                cVar.element = jVar.getSideBarViewWidth();
            }
            jVar.a(cVar.element, false);
            return;
        }
        jVar.getViewTreeObserver().addOnGlobalLayoutListener(new o(jVar, cVar));
    }

    public static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(3862);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(3862);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.homepage.story.feed.b>, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(63281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.homepage.story.feed.b> aVar) {
            boolean z;
            StorySidebarFeedVM storySidebarFeedVM;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.homepage.story.feed.b> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar2, "");
            T t = aVar2.f25631b;
            final boolean z2 = t.f99397a;
            if (h.f.b.l.a((Object) this.this$0.getDrawerViewModel().f99258a.getValue(), (Object) true) || (this.this$0.f99326e & 2) != 0) {
                z = true;
                this.this$0.f99330i = new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.homepage.story.container.j.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f99347a;

                    static {
                        Covode.recordClassIndex(63282);
                    }

                    {
                        this.f99347a = r1;
                    }

                    public final void run() {
                        j.a(this.f99347a.this$0, z2);
                    }
                };
            } else {
                z = false;
                this.this$0.f99330i = null;
                j.a(this.this$0, z2);
            }
            if (k.f99357b[t.f99398b.ordinal()] == 1 && (storySidebarFeedVM = this.this$0.f99322a) != null) {
                storySidebarFeedVM.a(StorySidebarFeedVM.l.f99382a);
            }
            h.a("StorySidebarContainer >>> hasData:" + this.this$0.getHasData() + " , newData:" + z2 + " , needPending:" + z);
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(Context context, f fVar) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        h.f.b.l.d(fVar, "");
        androidx.fragment.app.e eVar = null;
        MethodCollector.i(4081);
        this.o = fVar;
        this.q = h.i.a((h.f.a.a) new l(context));
        this.r = h.i.a((h.f.a.a) new n(context));
        this.f99328g = new b(new m(this));
        this.s = h.i.a((h.f.a.a) q.f99355a);
        this.f99331j = new h.p<>(false, null);
        this.t = h.i.a((h.f.a.a) p.f99354a);
        com.a.a(LayoutInflater.from(context), R.layout.a3y, this, true);
        View findViewById = findViewById(R.id.e47);
        h.f.b.l.b(findViewById, "");
        this.f99324c = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.e46);
        h.f.b.l.b(findViewById2, "");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.f99323b = viewGroup;
        viewGroup.getLayoutParams().width = getSideBarViewWidth();
        View findViewById3 = findViewById(R.id.d1k);
        h.f.b.l.b(findViewById3, "");
        this.f99325d = findViewById3;
        d(false);
        this.f99323b.setVisibility(4);
        androidx.fragment.app.e eVar2 = context instanceof androidx.fragment.app.e ? context : eVar;
        if (eVar2 != null) {
            com.ss.android.ugc.aweme.adaptation.c.p.observe(eVar2, new a(this, context));
            getDrawerViewModel().f99261d.observe(eVar2, new b(this, context));
            getDrawerViewModel().a(new c(this, context));
            getDrawerViewModel().a(new d(this, context));
            getHomeViewModel().a().observe(eVar2, new e(this, context));
            MethodCollector.o(4081);
            return;
        }
        MethodCollector.o(4081);
    }

    public final void a(int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof StepDrawerContainer.c)) {
            layoutParams = null;
        }
        StepDrawerContainer.c cVar = (StepDrawerContainer.c) layoutParams;
        if (cVar != null) {
            int a2 = androidx.core.b.a.a(i2, 0, getWidth());
            if (a2 == 0) {
                cVar.f99287a = null;
            } else {
                cVar.f99287a = new h.u<>(Float.valueOf(((float) a2) / ((float) getWidth())), Integer.valueOf(a2), Boolean.valueOf(z));
            }
            if (cVar.f99287a != null || !z) {
                this.o.a((f) false, false, "set:StepSlideOffset");
            } else {
                this.o.a((f) true, false, "set:StepSlideOffset");
            }
        }
    }

    public /* synthetic */ j(Context context, f fVar, byte b2) {
        this(context, fVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
