package com.ss.android.ugc.aweme.kids.commonfeed.e;

import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.v;
import com.ss.android.ugc.aweme.kids.commonfeed.a.a;
import com.ss.android.ugc.aweme.kids.commonfeed.g.a;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a extends v implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public VerticalViewPager f106020a;

    /* renamed from: b  reason: collision with root package name */
    LikeLayout f106021b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f106022c;

    /* renamed from: d  reason: collision with root package name */
    public View f106023d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.commonfeed.b.a f106024e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.commonfeed.f.a f106025f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f106026g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f106027h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f106028i;

    /* renamed from: j  reason: collision with root package name */
    public int f106029j;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.a<Boolean> f106030k;

    /* renamed from: l  reason: collision with root package name */
    public List<Aweme> f106031l;

    /* renamed from: m  reason: collision with root package name */
    public String f106032m;
    public String n;
    private FeedSwipeRefreshLayout o;
    private LoadMoreFrameLayout p;
    private View q;
    private WeakHandler r;
    private final h.h s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$a  reason: collision with other inner class name */
    public static final class C2702a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C2702a f106033a = new C2702a();

        static {
            Covode.recordClassIndex(67830);
        }

        C2702a() {
        }
    }

    static {
        Covode.recordClassIndex(67829);
    }

    /* access modifiers changed from: package-private */
    public final IKidsWellbeingService a() {
        return (IKidsWellbeingService) this.s.getValue();
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f106035a;

        static {
            Covode.recordClassIndex(67832);
        }

        c(ImageView imageView) {
            this.f106035a = imageView;
        }

        public final void run() {
            this.f106035a.setVisibility(8);
        }
    }

    static final class i extends m implements h.f.a.a<IKidsWellbeingService> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f106043a = new i();

        static {
            Covode.recordClassIndex(67838);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IKidsWellbeingService invoke() {
            return KidsWellbeingServiceImpl.c();
        }
    }

    public /* synthetic */ a() {
        this("");
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.feed.q.v
    public final void r() {
        super.r();
        com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = d();
        if (d2 != null) {
            d2.c();
        }
    }

    public final void f() {
        com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar = this.f106025f;
        if (aVar == null) {
            l.a("playController");
        }
        aVar.d();
        IKidsWellbeingService a2 = a();
        if (a2 != null) {
            a2.b();
        }
        com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = d();
        if (d2 != null) {
            d2.e();
        }
    }

    public final void g() {
        com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar = this.f106025f;
        if (aVar == null) {
            l.a("playController");
        }
        aVar.b();
        IKidsWellbeingService a2 = a();
        if (a2 != null) {
            a2.a();
        }
    }

    public final void b() {
        VerticalViewPager verticalViewPager = this.f106020a;
        if (verticalViewPager == null) {
            l.a("viewPager");
        }
        View view = this.q;
        if (view == null) {
            l.a("topSpace");
        }
        View view2 = this.f106023d;
        if (view2 == null) {
            l.a("bottomSpace");
        }
        com.ss.android.b.a.a.a.a(new com.ss.android.ugc.aweme.kids.commonfeed.a.b(this.bv, verticalViewPager, view2, view, C2702a.f106033a));
    }

    public final void c() {
        ImageView imageView = this.f106022c;
        if (imageView == null) {
            l.a("ivPlay");
        }
        imageView.setVisibility(0);
        imageView.animate().alpha(0.0f).setDuration(100).withEndAction(new c(imageView));
        imageView.setSelected(false);
    }

    public final void e() {
        c();
        com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar = this.f106025f;
        if (aVar == null) {
            l.a("playController");
        }
        aVar.c();
        IKidsWellbeingService a2 = a();
        if (a2 != null) {
            a2.a();
        }
        com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = d();
        if (d2 != null) {
            d2.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f106036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f106037b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f106038c;

        static {
            Covode.recordClassIndex(67833);
        }

        d(String str, Aweme aweme, Aweme aweme2) {
            this.f106036a = str;
            this.f106037b = aweme;
            this.f106038c = aweme2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.kids.common.c.f.a(this.f106036a, new com.ss.android.ugc.aweme.app.f.c().a("from_group_id", this.f106037b.getAid()).a("to_group_id", this.f106038c.getAid()).a("author_id", this.f106037b.getAuthorUid()).a("log_pb", this.f106037b.getLogPbString()).a());
            return z.f158842a;
        }
    }

    public final com.ss.android.ugc.aweme.kids.commonfeed.h.a d() {
        VerticalViewPager verticalViewPager = this.f106020a;
        if (verticalViewPager == null) {
            l.a("viewPager");
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
            VerticalViewPager verticalViewPager2 = this.f106020a;
            if (verticalViewPager2 == null) {
                l.a("viewPager");
            }
            Object tag = verticalViewPager2.getChildAt(childCount).getTag(R.id.c3o);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.viewholder.IFeedViewHolder");
            com.ss.android.ugc.aweme.kids.commonfeed.h.a aVar = (com.ss.android.ugc.aweme.kids.commonfeed.h.a) tag;
            VerticalViewPager verticalViewPager3 = this.f106020a;
            if (verticalViewPager3 == null) {
                l.a("viewPager");
            }
            int currentItem = verticalViewPager3.getCurrentItem();
            if (aVar != null) {
                com.ss.android.ugc.aweme.kids.commonfeed.b.a aVar2 = this.f106024e;
                if (aVar2 == null) {
                    l.a("feedAdapter");
                }
                if (aVar2.a(currentItem) == aVar.b()) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public static final class e implements com.ss.android.ugc.aweme.kids.commonfeed.h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106039a;

        static {
            Covode.recordClassIndex(67834);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f106039a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.b
        public final void a(int i2) {
            com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = this.f106039a.d();
            if (d2 != null && this.f106039a.f106028i && i2 == d2.h()) {
                com.ss.android.ugc.aweme.kids.commonfeed.f.a a2 = a.a(this.f106039a);
                a2.f106044a.a(d2.g());
                this.f106039a.f106028i = false;
            }
        }
    }

    public static final class f implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106040a;

        static {
            Covode.recordClassIndex(67835);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f106040a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
            if (r0.getCount() <= 3) goto L_0x00b4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x010d  */
        @Override // androidx.viewpager.widget.ViewPager.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageSelected(int r9) {
            /*
            // Method dump skipped, instructions count: 301
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.e.a.f.onPageSelected(int):void");
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (this.f106040a.f106027h && this.f106040a.f106026g && f2 == 0.0f && i3 == 0) {
                onPageSelected(i2);
                this.f106040a.f106026g = false;
            }
        }
    }

    public static final class h implements a.AbstractC2705a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106042a;

        static {
            Covode.recordClassIndex(67837);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f106042a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.g.a.AbstractC2705a
        public final void a(MotionEvent motionEvent) {
            float f2;
            float f3;
            ImageView poll;
            DataCenter f4;
            MethodCollector.i(8187);
            a aVar = this.f106042a;
            com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = aVar.d();
            if (!(d2 == null || (f4 = d2.f()) == null)) {
                f4.a("digg_aweme", (Object) null);
            }
            LikeLayout likeLayout = aVar.f106021b;
            if (likeLayout == null) {
                l.a("likeLayout");
            }
            if (motionEvent != null) {
                f2 = motionEvent.getRawX();
                f3 = motionEvent.getRawY();
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (likeLayout.f106274a.isEmpty()) {
                poll = new ImageView(likeLayout.f106275b);
                if (LikeLayout.f106273f == null) {
                    LikeLayout.f106273f = androidx.core.content.b.a(likeLayout.f106275b, 2131232975);
                }
            } else {
                poll = likeLayout.f106274a.poll();
            }
            poll.setImageDrawable(LikeLayout.f106273f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(likeLayout.f106277d, likeLayout.f106276c);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.topMargin = (int) (f3 - ((float) (likeLayout.f106276c / 2)));
            if (androidx.core.h.v.e(likeLayout) == 1) {
                f2 = ((float) likeLayout.f106279g) - f2;
            }
            layoutParams.setMarginStart((int) (f2 - ((float) (likeLayout.f106277d / 2))));
            poll.setLayoutParams(layoutParams);
            if (poll.getParent() == null) {
                likeLayout.addView(poll);
            }
            float nextInt = (float) (likeLayout.f106278e.nextInt(40) - 20);
            poll.setRotation(nextInt);
            AnimationSet animationSet = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillBefore(true);
            scaleAnimation.setDuration(300);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.setDuration(500);
            animationSet2.setStartOffset(500);
            animationSet2.setFillAfter(true);
            animationSet2.setInterpolator(new DecelerateInterpolator());
            float nextInt2 = (((float) likeLayout.f106278e.nextInt(10)) + 20.0f) / 10.0f;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            int b2 = (int) n.b(likeLayout.f106275b, 50.0f);
            float f5 = (float) (-(likeLayout.f106278e.nextInt(b2) + b2));
            double d3 = (double) f5;
            double d4 = (double) nextInt;
            Double.isNaN(d4);
            double tan = Math.tan((d4 * 3.141592653589793d) / 360.0d);
            Double.isNaN(d3);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d3 * tan), 0.0f, f5);
            animationSet2.addAnimation(scaleAnimation2);
            animationSet2.addAnimation(alphaAnimation);
            animationSet2.addAnimation(translateAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(animationSet2);
            poll.startAnimation(animationSet);
            animationSet.setAnimationListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0159: INVOKE  
                  (r8v0 'animationSet' android.view.animation.AnimationSet)
                  (wrap: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout$1 : 0x0156: CONSTRUCTOR  (r2v18 com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout$1) = 
                  (r0v2 'likeLayout' com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout)
                  (r1v5 'poll' android.widget.ImageView)
                 call: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout.1.<init>(com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout, android.widget.ImageView):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.animation.AnimationSet.setAnimationListener(android.view.animation.Animation$AnimationListener):void in method: com.ss.android.ugc.aweme.kids.commonfeed.e.a.h.a(android.view.MotionEvent):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0156: CONSTRUCTOR  (r2v18 com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout$1) = 
                  (r0v2 'likeLayout' com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout)
                  (r1v5 'poll' android.widget.ImageView)
                 call: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout.1.<init>(com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout, android.widget.ImageView):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.kids.commonfeed.e.a.h.a(android.view.MotionEvent):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 14 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 20 more
                */
            /*
            // Method dump skipped, instructions count: 366
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.e.a.h.a(android.view.MotionEvent):void");
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.f.a a(a aVar) {
        com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar2 = aVar.f106025f;
        if (aVar2 == null) {
            l.a("playController");
        }
        return aVar2;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.b.a b(a aVar) {
        com.ss.android.ugc.aweme.kids.commonfeed.b.a aVar2 = aVar.f106024e;
        if (aVar2 == null) {
            l.a("feedAdapter");
        }
        return aVar2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106034a;

        static {
            Covode.recordClassIndex(67831);
        }

        b(a aVar) {
            this.f106034a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f106034a;
            com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar2 = aVar.f106025f;
            if (aVar2 == null) {
                l.a("playController");
            }
            if (!aVar2.a()) {
                com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar3 = aVar.f106025f;
                if (aVar3 == null) {
                    l.a("playController");
                }
                aVar3.c();
                IKidsWellbeingService a2 = aVar.a();
                if (a2 != null) {
                    a2.a();
                }
                com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = aVar.d();
                if (d2 != null) {
                    d2.d();
                }
                aVar.c();
            }
        }
    }

    private a(String str) {
        l.d(str, "");
        this.f106032m = str;
        this.n = null;
        this.f106026g = true;
        this.f106027h = true;
        this.f106028i = true;
        this.f106031l = new ArrayList();
        this.s = h.i.a((h.f.a.a) i.f106043a);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 0) {
            com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar = this.f106025f;
            if (aVar == null) {
                l.a("playController");
            }
            if (aVar.a()) {
                com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar2 = this.f106025f;
                if (aVar2 == null) {
                    l.a("playController");
                }
                aVar2.d();
                IKidsWellbeingService a2 = a();
                if (a2 != null) {
                    a2.b();
                }
                com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = d();
                if (d2 != null) {
                    d2.e();
                }
                ImageView imageView = this.f106022c;
                if (imageView == null) {
                    l.a("ivPlay");
                }
                imageView.setVisibility(0);
                imageView.setScaleX(2.5f);
                imageView.setScaleY(2.5f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                imageView.setSelected(false);
                return;
            }
            com.ss.android.ugc.aweme.kids.commonfeed.f.a aVar3 = this.f106025f;
            if (aVar3 == null) {
                l.a("playController");
            }
            aVar3.c();
            IKidsWellbeingService a3 = a();
            if (a3 != null) {
                a3.a();
            }
            com.ss.android.ugc.aweme.kids.commonfeed.h.a d3 = d();
            if (d3 != null) {
                d3.d();
            }
            c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.feed.q.v
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.e.a.a(android.view.View, android.os.Bundle):void");
    }

    static final class g implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106041a;

        static {
            Covode.recordClassIndex(67836);
        }

        g(a aVar) {
            this.f106041a = aVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (i2 != i6 || i3 != i7 || i5 != i9 || i4 != i8) {
                this.f106041a.b();
            }
        }
    }
}
