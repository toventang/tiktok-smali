package com.ss.android.ugc.aweme.im.sdk.share.ui.nested;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.g.f;
import androidx.core.h.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a;
import com.ss.android.ugc.aweme.utils.iw;
import com.zhiliaoapp.musically.R;
import h.f.b.r;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class ShareNestedLayout extends LinearLayout implements androidx.core.h.n {
    private static final f.c<Rect> N = new f.c<>(12);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f103652a = {new r(ShareNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final b f103653j = new b((byte) 0);
    private float A;
    private final h.h.e B;
    private final h.h C;
    private final h.h D;
    private final h.h E;
    private final h.h F;
    private boolean G;
    private boolean H;
    private final h.h I;
    private h.f.a.b<? super Boolean, z> J;
    private final l K;
    private final g L;
    private boolean M;
    private HashMap O;

    /* renamed from: b  reason: collision with root package name */
    public float f103654b;

    /* renamed from: c  reason: collision with root package name */
    float f103655c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f103656d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f103657e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f103658f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f103659g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f103660h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f103661i;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f103662k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f103663l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f103664m;
    private final h.h n;
    private final h.h o;
    private boolean p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private boolean x;
    private ObjectAnimator y;
    private boolean z;

    public ShareNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.n.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f103664m.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.C.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.B.a(this, f103652a[0])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f103663l.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.o.getValue();
    }

    private final void setMTouchScrollingChild(boolean z2) {
        this.B.a(f103652a[0], Boolean.valueOf(z2));
    }

    public final View c() {
        if (this.O == null) {
            this.O = new HashMap();
        }
        View view = (View) this.O.get(Integer.valueOf((int) R.id.aea));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.aea);
        this.O.put(Integer.valueOf((int) R.id.aea), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final AppBarLayout getAppBar() {
        return (AppBarLayout) this.E.getValue();
    }

    public final CoordinatorLayout getCoordinatorLayout() {
        return (CoordinatorLayout) this.F.getValue();
    }

    /* access modifiers changed from: package-private */
    public final LinearLayout getMContent() {
        return (LinearLayout) this.D.getValue();
    }

    public final RecyclerView getMScrollingChild() {
        return (RecyclerView) this.I.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f103662k.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    @Override // androidx.core.h.n
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        h.f.b.l.d(view, "");
        return false;
    }

    @Override // androidx.core.h.n
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        h.f.b.l.d(view, "");
    }

    @Override // androidx.core.h.n
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(view2, "");
    }

    public static final class b {
        static {
            Covode.recordClassIndex(66409);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean getMCanDragUp() {
        return this.z;
    }

    public final float getPeekHeight() {
        return this.A;
    }

    static final class n extends h.f.b.m implements h.f.a.a<VelocityTracker> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f103672a = new n();

        static {
            Covode.recordClassIndex(66422);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<ViewConfiguration> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(66423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewConfiguration invoke() {
            return ViewConfiguration.get(this.$context);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<AppBarLayout> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AppBarLayout invoke() {
            return this.this$0.findViewById(R.id.bkc);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<CoordinatorLayout> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CoordinatorLayout invoke() {
            return this.this$0.findViewById(R.id.bkd);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.aea);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(66416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(com.bytedance.common.utility.n.b(this.$context, 1000.0f));
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.findViewById(R.id.ad5);
        }
    }

    private final boolean getMAnimating() {
        if (this.f103657e || this.f103658f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.x = false;
        setMTouchScrollingChild(false);
        this.H = false;
        this.w = 0.0f;
    }

    static final class h extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            h.f.b.l.b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View findViewById = this.this$0.findViewById(R.id.d57);
            findViewById.setOnClickListener(new a(this));
            return findViewById;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f103670a;

            static {
                Covode.recordClassIndex(66418);
            }

            a(j jVar) {
                this.f103670a = jVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f103670a.this$0.a(false, true);
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ ShareNestedLayout this$0;

        static {
            Covode.recordClassIndex(66421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.this$0 = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            h.f.b.l.b(mViewConfiguration, "");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    public final boolean a() {
        if (this.f103658f) {
            return true;
        }
        if (this.f103657e || getTranslationY() >= this.f103654b) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(66406);
    }

    public final void setMCanDragUp(boolean z2) {
        this.z = z2;
    }

    public final void setPeekHeight(float f2) {
        this.A = f2;
    }

    public final void setPreScrollChangeListener(h.f.a.b<? super Boolean, z> bVar) {
        this.J = bVar;
    }

    public final void setVisibleChangedListener(h.f.a.b<? super Boolean, z> bVar) {
        this.f103660h = bVar;
    }

    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareNestedLayout f103669a;

        static {
            Covode.recordClassIndex(66414);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(ShareNestedLayout shareNestedLayout) {
            this.f103669a = shareNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f103669a.f103657e = false;
            this.f103669a.b();
            this.f103669a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f103669a.f103657e = false;
            this.f103669a.setVisibility(8);
            this.f103669a.b();
            this.f103669a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.b<? super Boolean, z> bVar;
            if ((this.f103669a.f103658f || (!this.f103669a.f103657e && this.f103669a.getTranslationY() <= this.f103669a.f103654b)) && (bVar = this.f103669a.f103660h) != null) {
                bVar.invoke(false);
            }
            this.f103669a.f103657e = true;
        }
    }

    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareNestedLayout f103671a;

        static {
            Covode.recordClassIndex(66420);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(ShareNestedLayout shareNestedLayout) {
            this.f103671a = shareNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f103671a.f103658f = false;
            this.f103671a.b();
            this.f103671a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f103671a.f103658f = false;
            this.f103671a.b();
            this.f103671a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.b<? super Boolean, z> bVar;
            if (!this.f103671a.a() && (bVar = this.f103671a.f103660h) != null) {
                bVar.invoke(true);
            }
            this.f103671a.setVisibility(0);
            this.f103671a.f103658f = true;
        }
    }

    public static final class p extends com.ss.android.ugc.aweme.im.sdk.relations.ui.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareNestedLayout f103673a;

        static {
            Covode.recordClassIndex(66424);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(ShareNestedLayout shareNestedLayout) {
            this.f103673a = shareNestedLayout;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a
        public final void a(a.EnumC2617a aVar) {
            boolean z;
            ShareNestedLayout shareNestedLayout = this.f103673a;
            if (aVar == a.EnumC2617a.EXPANDED) {
                z = true;
            } else {
                z = false;
            }
            shareNestedLayout.f103661i = z;
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(this.f103673a.getContext())) {
                return;
            }
            if (aVar == a.EnumC2617a.EXPANDED) {
                this.f103673a.getCoordinatorLayout().setPadding(0, 0, 0, 0);
            } else if (aVar == a.EnumC2617a.COLLAPSED) {
                this.f103673a.getCoordinatorLayout().setPadding(0, 0, 0, com.ss.android.ugc.aweme.base.utils.i.c());
            }
        }
    }

    public final void setMIsFocus(boolean z2) {
        if (this.f103659g ^ z2) {
            setFocusable(z2);
            setFocusableInTouchMode(z2);
            if (z2) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f103659g = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareNestedLayout f103668a;

        static {
            Covode.recordClassIndex(66410);
        }

        c(ShareNestedLayout shareNestedLayout) {
            this.f103668a = shareNestedLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            int floatValue = (int) ((Float) animatedValue).floatValue();
            LinearLayout linearLayout = (LinearLayout) this.f103668a.c();
            h.f.b.l.b(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = floatValue;
            LinearLayout linearLayout2 = (LinearLayout) this.f103668a.c();
            h.f.b.l.b(linearLayout2, "");
            linearLayout2.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.p = getMAnimating();
        }
        if (this.p && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.p = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final void a(int i2) {
        if (!getMAnimating()) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, getTranslationY(), 0.0f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f103654b, (float) i2);
            h.f.b.l.b(ofFloat2, "");
            ofFloat2.addUpdateListener(new c(this));
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
        }
    }

    @Override // androidx.core.h.n
    public final void onStopNestedScroll(View view) {
        h.f.b.l.d(view, "");
        int f2 = com.ss.android.ugc.aweme.base.utils.i.f(getContext());
        float f3 = this.A;
        float f4 = (((float) f2) + f3) / 2.0f;
        float f5 = f3 / 2.0f;
        if (!this.z) {
            float f6 = this.f103654b;
            if (getTranslationY() * 2.0f > f6) {
                a(false, false);
            } else {
                a((int) f6);
            }
        } else if (this.f103654b - getTranslationY() > f4) {
            a(f2);
        } else if (this.f103654b - getTranslationY() < f5) {
            a(false, false);
        } else {
            a((int) this.A);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            b();
            float x2 = motionEvent.getX();
            this.q = x2;
            this.s = x2;
            float y2 = motionEvent.getY();
            this.r = y2;
            this.t = y2;
            this.u = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            h.f.b.l.b(mPlaceholder, "");
            this.H = a(mPlaceholder, motionEvent);
            RecyclerView mScrollingChild = getMScrollingChild();
            h.f.b.l.b(mScrollingChild, "");
            setMTouchScrollingChild(a(mScrollingChild, motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            b();
        }
        if (motionEvent.getActionMasked() == 1) {
            b();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = this.f103661i;
            if (this.H) {
                return false;
            }
        } else if (actionMasked == 2) {
            if (this.H) {
                return false;
            }
            float y3 = this.t - motionEvent.getY();
            if (this.z && this.f103655c > 0.0f && Math.abs(y3) > ((float) getMTouchSlop()) && y3 > 0.0f) {
                this.x = true;
                return true;
            } else if (this.M && !getMScrollingChild().canScrollVertically(-1) && Math.abs(y3) > ((float) getMTouchSlop()) && y3 < 0.0f) {
                this.x = true;
                return true;
            } else if (!getMTouchScrollingChild() && (this.x || Math.abs(y3) > ((float) getMTouchSlop()))) {
                this.x = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (getMAnimating()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker mVelocityTracker = getMVelocityTracker();
            mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
            if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                if (this.w >= 0.0f) {
                    a(false, false);
                } else if (this.z) {
                    a(com.ss.android.ugc.aweme.base.utils.i.f(getContext()));
                }
                b();
            }
            onStopNestedScroll(this);
            b();
        } else if (actionMasked == 2) {
            getMVelocityTracker().addMovement(motionEvent);
            float rawX = this.u - motionEvent.getRawX();
            float rawY = this.v - motionEvent.getRawY();
            this.w = motionEvent.getRawY() - this.v;
            this.u = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            if (this.x || Math.abs(rawY) > ((float) getMTouchSlop())) {
                this.x = true;
                RecyclerView mScrollingChild = getMScrollingChild();
                h.f.b.l.b(mScrollingChild, "");
                onNestedPreScroll(mScrollingChild, (int) rawX, (int) rawY, new int[]{0, 0});
                h.f.a.b<? super Boolean, z> bVar = this.J;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
        } else if (actionMasked == 3) {
            onStopNestedScroll(this);
            b();
        }
        return true;
    }

    public final void a(boolean z2, float f2) {
        this.z = z2;
        if (z2 && f2 != 0.0f) {
            this.A = f2;
        }
    }

    private final boolean a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        f.c<Rect> cVar = N;
        Rect acquire = cVar.acquire();
        if (acquire == null) {
            acquire = new Rect();
        }
        iw.a(this, view, acquire);
        try {
            boolean contains = acquire.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            acquire.setEmpty();
            cVar.release(acquire);
            return contains;
        } catch (Throwable th) {
            acquire.setEmpty();
            N.release(acquire);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(6714);
        super.onMeasure(i2, i3);
        View mPlaceholder = getMPlaceholder();
        h.f.b.l.b(mPlaceholder, "");
        this.f103655c = (float) mPlaceholder.getMeasuredHeight();
        float measuredHeight = (float) getMeasuredHeight();
        View mPlaceholder2 = getMPlaceholder();
        h.f.b.l.b(mPlaceholder2, "");
        this.f103654b = measuredHeight - ((float) mPlaceholder2.getMeasuredHeight());
        MethodCollector.o(6714);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout.a(boolean, boolean):void");
    }

    public static final class a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f103666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareNestedLayout f103667b;

        static {
            Covode.recordClassIndex(66408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, ShareNestedLayout shareNestedLayout) {
            super(obj2);
            this.f103666a = obj;
            this.f103667b = shareNestedLayout;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, Boolean bool, Boolean bool2) {
            boolean z;
            h.f.b.l.d(iVar, "");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                ShareNestedLayout shareNestedLayout = this.f103667b;
                if (shareNestedLayout.getMScrollingChild().computeVerticalScrollExtent() >= this.f103667b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                shareNestedLayout.f103656d = z;
            }
        }
    }

    private /* synthetic */ ShareNestedLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    @Override // androidx.core.h.n
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        boolean z2;
        h.f.b.l.d(view, "");
        if ((view instanceof t) && ((t) view).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (f3 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2, false);
        return true;
    }

    @Override // androidx.core.h.n
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(view2, "");
        if (!(view2 instanceof androidx.core.h.j) || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShareNestedLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(7328);
        this.f103662k = h.i.a((h.f.a.a) new o(context));
        this.f103663l = h.i.a((h.f.a.a) new m(this));
        this.f103664m = h.i.a((h.f.a.a) new i(context));
        this.n = h.i.a((h.f.a.a) new h(this));
        this.o = h.i.a((h.f.a.a) n.f103672a);
        this.z = true;
        this.B = new a(false, false, this);
        this.C = h.i.a((h.f.a.a) new j(this));
        this.D = h.i.a((h.f.a.a) new f(this));
        this.E = h.i.a((h.f.a.a) new d(this));
        this.F = h.i.a((h.f.a.a) new e(this));
        this.I = h.i.a((h.f.a.a) new k(this));
        this.K = new l(this);
        this.L = new g(this);
        this.f103661i = true;
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ShareNestedLayout f103665a;

            static {
                Covode.recordClassIndex(66407);
            }

            {
                this.f103665a = r1;
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (!this.f103665a.a() || i2 != 4) {
                    return false;
                }
                h.f.b.l.b(keyEvent, "");
                if (keyEvent.getAction() == 1) {
                    this.f103665a.a(false, true);
                }
                return true;
            }
        });
        MethodCollector.o(7328);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0096, code lost:
        if (r0 == null) goto L_0x0098;
     */
    @Override // androidx.core.h.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(android.view.View r6, int r7, int r8, int[] r9) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }
}
