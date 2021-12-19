package com.ss.android.ugc.aweme.comment.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.core.g.f;
import androidx.core.h.n;
import androidx.core.h.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.utils.iw;
import com.zhiliaoapp.musically.R;
import h.f.b.r;
import h.z;

public final class CommentNestedLayout extends LinearLayout implements n {
    private static final f.c<Rect> L = new f.c<>(12);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f72997a = {new r(CommentNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final b f72998i = new b((byte) 0);
    private final h.h A;
    private View B;
    private final h.h C;
    private a.AbstractC1744a D;
    private boolean E;
    private final h.h F;
    private h.f.a.b<? super Boolean, z> G;
    private final j H;
    private final e I;
    private final boolean J;
    private int K;

    /* renamed from: b  reason: collision with root package name */
    public float f72999b;

    /* renamed from: c  reason: collision with root package name */
    public ae f73000c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f73001d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f73002e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f73003f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f73004g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f73005h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f73006j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f73007k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f73008l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f73009m;
    private final h.h n;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private boolean v;
    private ObjectAnimator w;
    private boolean x;
    private final h.h.e y;
    private final h.h z;

    public CommentNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final View getMCommentBgContainer() {
        return (View) this.A.getValue();
    }

    private final View getMCommentListContainer() {
        return (View) this.C.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f73009m.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f73008l.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.z.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.F.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.y.a(this, f72997a[0])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f73007k.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.n.getValue();
    }

    private final void setMTouchScrollingChild(boolean z2) {
        this.y.a(f72997a[0], Boolean.valueOf(z2));
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f73006j.getValue();
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
            Covode.recordClassIndex(44963);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean getBackFromVideo() {
        return this.x;
    }

    public final boolean getHaveBangs() {
        return this.J;
    }

    public final int getNotchHeight() {
        return this.K;
    }

    public final ae getOnShowHeightChangeListener() {
        return this.f73000c;
    }

    public final a.AbstractC1744a getScrollableContainer() {
        return this.D;
    }

    static final class l extends h.f.b.m implements h.f.a.a<VelocityTracker> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f73016a = new l();

        static {
            Covode.recordClassIndex(44974);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<ViewConfiguration> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(44975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewConfiguration invoke() {
            return ViewConfiguration.get(this.$context);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.b4w);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.ch6);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.findViewById(R.id.djj);
        }
    }

    private final boolean getMAnimating() {
        if (this.f73002e || this.f73003f) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (!this.x) {
            a(false, true);
        } else {
            this.x = false;
        }
    }

    public final void c() {
        this.v = false;
        setMTouchScrollingChild(false);
        this.E = false;
        this.u = 0.0f;
    }

    public final View getCommentContainer() {
        if (this.B == null) {
            this.B = findViewById(R.id.b4x);
        }
        return this.B;
    }

    static final class f extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            h.f.b.l.b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            h.f.b.l.b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View findViewById = this.this$0.findViewById(R.id.a_q);
            findViewById.setOnClickListener(new a(this));
            return findViewById;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f73014a;

            static {
                Covode.recordClassIndex(44970);
            }

            a(h hVar) {
                this.f73014a = hVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f73014a.this$0.b();
            }
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ CommentNestedLayout this$0;

        static {
            Covode.recordClassIndex(44973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.this$0 = commentNestedLayout;
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
        if (this.f73003f) {
            return true;
        }
        if (this.f73002e || getTranslationY() >= this.f72999b) {
            return false;
        }
        return true;
    }

    public final RecyclerView getMScrollingChild() {
        View view;
        a.AbstractC1744a aVar = this.D;
        RecyclerView recyclerView = null;
        if (aVar != null) {
            view = aVar.m();
        } else {
            view = null;
        }
        if (view instanceof RecyclerView) {
            recyclerView = view;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        RecyclerView mRecyclerView = getMRecyclerView();
        h.f.b.l.b(mRecyclerView, "");
        return mRecyclerView;
    }

    static {
        Covode.recordClassIndex(44960);
    }

    public final void setBackFromVideo(boolean z2) {
        this.x = z2;
    }

    public final void setCommentContainer(View view) {
        this.B = view;
    }

    public final void setNotchHeight(int i2) {
        this.K = i2;
    }

    public final void setOnShowHeightChangeListener(ae aeVar) {
        this.f73000c = aeVar;
    }

    public final void setPreScrollChangeListener(h.f.a.b<? super Boolean, z> bVar) {
        this.G = bVar;
    }

    public final void setScrollableContainer(a.AbstractC1744a aVar) {
        this.D = aVar;
    }

    public final void setVisibleChangedListener(h.f.a.b<? super Boolean, z> bVar) {
        this.f73005h = bVar;
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentNestedLayout f73013a;

        static {
            Covode.recordClassIndex(44966);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(CommentNestedLayout commentNestedLayout) {
            this.f73013a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f73013a.f73002e = false;
            this.f73013a.c();
            this.f73013a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f73013a.f73002e = false;
            this.f73013a.setVisibility(8);
            this.f73013a.c();
            this.f73013a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.b<? super Boolean, z> bVar;
            if ((this.f73013a.f73003f || (!this.f73013a.f73002e && this.f73013a.getTranslationY() <= this.f73013a.f72999b)) && (bVar = this.f73013a.f73005h) != null) {
                bVar.invoke(false);
            }
            this.f73013a.f73002e = true;
        }
    }

    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentNestedLayout f73015a;

        static {
            Covode.recordClassIndex(44972);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(CommentNestedLayout commentNestedLayout) {
            this.f73015a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f73015a.f73003f = false;
            this.f73015a.c();
            this.f73015a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f73015a.f73003f = false;
            this.f73015a.c();
            this.f73015a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.b<? super Boolean, z> bVar;
            if (!this.f73015a.a() && (bVar = this.f73015a.f73005h) != null) {
                bVar.invoke(true);
            }
            this.f73015a.setVisibility(0);
            this.f73015a.f73003f = true;
        }
    }

    public final void setTranslationY(float f2) {
        super.setTranslationY(f2);
        ae aeVar = this.f73000c;
        if (aeVar != null) {
            float f3 = this.f72999b;
            aeVar.a(f3 - f2, f3);
        }
    }

    @Override // androidx.core.h.n
    public final void onStopNestedScroll(View view) {
        boolean z2;
        h.f.b.l.d(view, "");
        if (getTranslationY() * 2.0f < this.f72999b) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2, false);
    }

    public final void setMIsFocus(boolean z2) {
        if (this.f73004g ^ z2) {
            setFocusable(z2);
            setFocusableInTouchMode(z2);
            if (z2) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f73004g = z2;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.o = getMAnimating();
        }
        if (this.o && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.o = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void a(boolean z2) {
        ObjectAnimator objectAnimator;
        h.f.a.b<? super Boolean, z> bVar;
        if (z2 && a() && (bVar = this.f73005h) != null) {
            bVar.invoke(false);
        }
        ObjectAnimator objectAnimator2 = this.w;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.w) == null)) {
            objectAnimator.cancel();
        }
        setVisibility(8);
        float f2 = this.f72999b;
        if (f2 > 0.0f) {
            setTranslationY(f2);
        }
        c();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            c();
            float x2 = motionEvent.getX();
            this.p = x2;
            this.r = x2;
            float y2 = motionEvent.getY();
            this.q = y2;
            this.s = y2;
            this.t = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            h.f.b.l.b(mPlaceholder, "");
            this.E = a(mPlaceholder, motionEvent);
            setMTouchScrollingChild(a(getMScrollingChild(), motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            c();
        }
        if (motionEvent.getActionMasked() == 1) {
            c();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.E) {
                    return false;
                }
                float y3 = this.s - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.v || Math.abs(y3) > ((float) getMTouchSlop()))) {
                    this.v = true;
                    return true;
                }
            }
        } else if (this.E) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        h.f.b.l.d(motionEvent, "");
        if (getMAnimating()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker mVelocityTracker = getMVelocityTracker();
            mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
            if (Math.abs(mVelocityTracker.getYVelocity()) <= getMMinimumVelocity() || getMAnimating()) {
                onStopNestedScroll(this);
            } else {
                if (this.u < 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a(z2, false);
            }
            c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                onStopNestedScroll(this);
                c();
            }
        } else if (!getMTouchScrollingChild()) {
            getMVelocityTracker().addMovement(motionEvent);
            float x2 = this.p - motionEvent.getX();
            float y2 = this.q - motionEvent.getY();
            if (this.v || Math.abs(y2) > ((float) getMTouchSlop())) {
                this.v = true;
                onNestedPreScroll(getMScrollingChild(), (int) x2, (int) y2, new int[]{0, 0});
                h.f.a.b<? super Boolean, z> bVar = this.G;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
            this.u = motionEvent.getRawY() - this.t;
            this.t = motionEvent.getRawY();
        }
        return true;
    }

    private final boolean a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        f.c<Rect> cVar = L;
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
            L.release(acquire);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(1222);
        super.onMeasure(i2, i3);
        View mPlaceholder = getMPlaceholder();
        h.f.b.l.b(mPlaceholder, "");
        this.f72999b = ((float) getMeasuredHeight()) - ((float) mPlaceholder.getMeasuredHeight());
        MethodCollector.o(1222);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout.a(boolean, boolean):void");
    }

    public static final class a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f73011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentNestedLayout f73012b;

        static {
            Covode.recordClassIndex(44962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, CommentNestedLayout commentNestedLayout) {
            super(obj2);
            this.f73011a = obj;
            this.f73012b = commentNestedLayout;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, Boolean bool, Boolean bool2) {
            boolean z;
            h.f.b.l.d(iVar, "");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                CommentNestedLayout commentNestedLayout = this.f73012b;
                if (commentNestedLayout.getMScrollingChild().computeVerticalScrollExtent() >= this.f73012b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                commentNestedLayout.f73001d = z;
            }
        }
    }

    private /* synthetic */ CommentNestedLayout(Context context, AttributeSet attributeSet, byte b2) {
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
    private CommentNestedLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        boolean z2 = false;
        MethodCollector.i(633);
        this.f73006j = h.i.a((h.f.a.a) new m(context));
        this.f73007k = h.i.a((h.f.a.a) new k(this));
        this.f73008l = h.i.a((h.f.a.a) new g(this));
        this.f73009m = h.i.a((h.f.a.a) new f(this));
        this.n = h.i.a((h.f.a.a) l.f73016a);
        this.y = new a(false, false, this);
        this.z = h.i.a((h.f.a.a) new h(this));
        this.A = h.i.a((h.f.a.a) new c(this));
        this.C = h.i.a((h.f.a.a) new d(this));
        this.F = h.i.a((h.f.a.a) new i(this));
        this.H = new j(this);
        this.I = new e(this);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CommentNestedLayout f73010a;

            static {
                Covode.recordClassIndex(44961);
            }

            {
                this.f73010a = r1;
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (!this.f73010a.a() || i2 != 4) {
                    return false;
                }
                h.f.b.l.b(keyEvent, "");
                if (keyEvent.getAction() == 1) {
                    this.f73010a.b();
                }
                return true;
            }
        });
        if (com.ss.android.ugc.aweme.app.b.a.a(getContext()) && com.ss.android.ugc.aweme.adaptation.c.f66197m == 0) {
            z2 = true;
        }
        this.J = z2;
        this.K = com.ss.android.ugc.aweme.adaptation.c.d(context);
        MethodCollector.o(633);
    }

    @Override // androidx.core.h.n
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4;
        h.f.b.l.d(view, "");
        h.f.b.l.d(iArr, "");
        float translationY = getTranslationY();
        float f2 = 0.0f;
        if (translationY > 0.0f) {
            float f3 = translationY - ((float) i3);
            if (f3 >= 0.0f) {
                f2 = f3;
            }
            float f4 = this.f72999b;
            if (f2 > f4) {
                f2 = f4;
            }
            setTranslationY(f2);
            if (getMTouchScrollingChild() && !this.f73001d) {
                iArr[1] = iArr[1] + i3;
            }
        } else if (translationY == 0.0f) {
            if (view instanceof t) {
                i4 = ((t) view).computeVerticalScrollOffset();
            } else {
                i4 = 0;
            }
            if (i3 >= 0) {
                return;
            }
            if (i4 == 0 || !getMTouchScrollingChild()) {
                float f5 = translationY - ((float) i3);
                float f6 = this.f72999b;
                if (f5 > f6) {
                    f5 = f6;
                }
                setTranslationY(f5);
            }
        }
    }
}
