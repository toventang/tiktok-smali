package com.ss.android.ugc.aweme.discover.ui.Dialog;

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
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.g.f;
import androidx.core.h.n;
import androidx.core.h.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.utils.iw;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.f.b.r;
import h.z;

public final class SearchNestedLayout extends LinearLayout implements n {
    private static final f.c<Rect> K = new f.c<>(12);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f82090a = {new r(SearchNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final b f82091h = new b((byte) 0);
    private final h.h A;
    private final h.h B;
    private boolean C;
    private final h.h D;
    private h.f.a.b<? super Boolean, z> E;
    private final i F;
    private final d G;
    private final boolean H;
    private int I;
    private int J;

    /* renamed from: b  reason: collision with root package name */
    public float f82092b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f82093c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f82094d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f82095e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f82096f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f82097g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f82098i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f82099j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f82100k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f82101l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f82102m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private ObjectAnimator v;
    private ae w;
    private c x;
    private View.OnClickListener y;
    private final h.h.e z;

    public SearchNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final View getMCommentBgContainer() {
        return (View) this.B.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f82101l.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f82100k.getValue()).floatValue();
    }

    private final ViewGroup getMPlaceholder() {
        return (ViewGroup) this.A.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.z.a(this, f82090a[0])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f82099j.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f82102m.getValue();
    }

    private final void setMTouchScrollingChild(boolean z2) {
        this.z.a(f82090a[0], Boolean.valueOf(z2));
    }

    public final NestedScrollingChildFrameLayout getMScrollingChild() {
        return (NestedScrollingChildFrameLayout) this.D.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f82098i.getValue();
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
            Covode.recordClassIndex(51083);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final boolean getHaveBangs() {
        return this.H;
    }

    public final int getHeightOffset() {
        return this.J;
    }

    public final ae getMOnShowHeightChangeListener() {
        return this.w;
    }

    public final int getNotchHeight() {
        return this.I;
    }

    public final View.OnClickListener getOnCancelListener() {
        return this.y;
    }

    public final c getOnDialogListener() {
        return this.x;
    }

    static final class k extends m implements h.f.a.a<VelocityTracker> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f82109a = new k();

        static {
            Covode.recordClassIndex(51093);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    static final class l extends m implements h.f.a.a<ViewConfiguration> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(51094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewConfiguration invoke() {
            return ViewConfiguration.get(this.$context);
        }
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ SearchNestedLayout this$0;

        static {
            Covode.recordClassIndex(51084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.this$0 = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.alb);
        }
    }

    static final class h extends m implements h.f.a.a<NestedScrollingChildFrameLayout> {
        final /* synthetic */ SearchNestedLayout this$0;

        static {
            Covode.recordClassIndex(51090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.this$0 = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NestedScrollingChildFrameLayout invoke() {
            return this.this$0.findViewById(R.id.ali);
        }
    }

    private final boolean getMAnimating() {
        if (this.f82094d || this.f82095e) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.u = false;
        setMTouchScrollingChild(false);
        this.C = false;
        this.t = 0.0f;
    }

    static final class e extends m implements h.f.a.a<Float> {
        final /* synthetic */ SearchNestedLayout this$0;

        static {
            Covode.recordClassIndex(51086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.this$0 = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            h.f.b.l.b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    static final class f extends m implements h.f.a.a<Float> {
        final /* synthetic */ SearchNestedLayout this$0;

        static {
            Covode.recordClassIndex(51087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.this$0 = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.this$0.getMViewConfiguration();
            h.f.b.l.b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    static final class g extends m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ SearchNestedLayout this$0;

        static {
            Covode.recordClassIndex(51088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.this$0 = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            ViewGroup viewGroup = (ViewGroup) this.this$0.findViewById(R.id.d0t);
            viewGroup.setOnClickListener(new a(this));
            return viewGroup;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f82107a;

            static {
                Covode.recordClassIndex(51089);
            }

            a(g gVar) {
                this.f82107a = gVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f82107a.this$0.a(false, true);
            }
        }
    }

    static final class j extends m implements h.f.a.a<Integer> {
        final /* synthetic */ SearchNestedLayout this$0;

        static {
            Covode.recordClassIndex(51092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.this$0 = searchNestedLayout;
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
        if (this.f82095e) {
            return true;
        }
        if (this.f82094d || getTranslationY() >= this.f82092b) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(51080);
    }

    public final void setHeightOffset(int i2) {
        this.J = i2;
    }

    public final void setMOnShowHeightChangeListener(ae aeVar) {
        this.w = aeVar;
    }

    public final void setNotchHeight(int i2) {
        this.I = i2;
    }

    public final void setOnCancelListener(View.OnClickListener onClickListener) {
        this.y = onClickListener;
    }

    public final void setOnDialogListener(c cVar) {
        this.x = cVar;
    }

    public final void setPreScrollChangeListener(h.f.a.b<? super Boolean, z> bVar) {
        this.E = bVar;
    }

    public final void setVisibleChangedListener(h.f.a.b<? super Boolean, z> bVar) {
        this.f82097g = bVar;
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchNestedLayout f82106a;

        static {
            Covode.recordClassIndex(51085);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(SearchNestedLayout searchNestedLayout) {
            this.f82106a = searchNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f82106a.f82094d = false;
            this.f82106a.b();
            this.f82106a.setMIsFocus(false);
            c onDialogListener = this.f82106a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.a(false);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            this.f82106a.f82094d = false;
            this.f82106a.setVisibility(8);
            this.f82106a.b();
            this.f82106a.setMIsFocus(false);
            c onDialogListener = this.f82106a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.a(false);
            }
            View.OnClickListener onCancelListener = this.f82106a.getOnCancelListener();
            if (onCancelListener != null) {
                onCancelListener.onClick(this.f82106a);
            }
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.b<? super Boolean, z> bVar;
            if ((this.f82106a.f82095e || (!this.f82106a.f82094d && this.f82106a.getTranslationY() <= this.f82106a.f82092b)) && (bVar = this.f82106a.f82097g) != null) {
                bVar.invoke(false);
            }
            this.f82106a.f82094d = true;
        }
    }

    public static final class i implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchNestedLayout f82108a;

        static {
            Covode.recordClassIndex(51091);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(SearchNestedLayout searchNestedLayout) {
            this.f82108a = searchNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f82108a.f82095e = false;
            this.f82108a.b();
            this.f82108a.setMIsFocus(true);
            c onDialogListener = this.f82108a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.a(true);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            this.f82108a.f82095e = false;
            this.f82108a.b();
            this.f82108a.setMIsFocus(true);
            c onDialogListener = this.f82108a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.a(true);
            }
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.b<? super Boolean, z> bVar;
            if (!this.f82108a.a() && (bVar = this.f82108a.f82097g) != null) {
                bVar.invoke(true);
            }
            this.f82108a.setVisibility(0);
            this.f82108a.f82095e = true;
        }
    }

    public final void setTranslationY(float f2) {
        super.setTranslationY(f2);
        ae aeVar = this.w;
        if (aeVar != null) {
            float f3 = this.f82092b;
            aeVar.a(f3 - f2, f3);
        }
    }

    @Override // androidx.core.h.n
    public final void onStopNestedScroll(View view) {
        boolean z2;
        h.f.b.l.d(view, "");
        getTranslationY();
        getTranslationY();
        if (getTranslationY() * 2.0f < this.f82092b) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2, false);
    }

    public final void setMIsFocus(boolean z2) {
        if (this.f82096f ^ z2) {
            setFocusable(z2);
            setFocusableInTouchMode(z2);
            if (z2) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f82096f = z2;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.n = getMAnimating();
        }
        if (this.n && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.n = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            b();
            float x2 = motionEvent.getX();
            this.o = x2;
            this.q = x2;
            float y2 = motionEvent.getY();
            this.p = y2;
            this.r = y2;
            this.s = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            ViewGroup mPlaceholder = getMPlaceholder();
            h.f.b.l.b(mPlaceholder, "");
            this.C = a(mPlaceholder, motionEvent);
            NestedScrollingChildFrameLayout mScrollingChild = getMScrollingChild();
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
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.C) {
                    return false;
                }
                float y3 = this.r - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.u || Math.abs(y3) > ((float) getMTouchSlop()))) {
                    this.u = true;
                    return true;
                }
            }
        } else if (this.C) {
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
                if (this.t < 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a(z2, false);
            }
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                onStopNestedScroll(this);
                b();
            }
        } else if (!getMTouchScrollingChild()) {
            getMVelocityTracker().addMovement(motionEvent);
            float x2 = this.o - motionEvent.getX();
            float y2 = this.p - motionEvent.getY();
            if (this.u || Math.abs(y2) > ((float) getMTouchSlop())) {
                this.u = true;
                NestedScrollingChildFrameLayout mScrollingChild = getMScrollingChild();
                h.f.b.l.b(mScrollingChild, "");
                onNestedPreScroll(mScrollingChild, (int) x2, (int) y2, new int[]{0, 0});
                h.f.a.b<? super Boolean, z> bVar = this.E;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
            this.t = motionEvent.getRawY() - this.s;
            this.s = motionEvent.getRawY();
        }
        return true;
    }

    private final boolean a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        f.c<Rect> cVar = K;
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
            K.release(acquire);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2326);
        super.onMeasure(i2, i3);
        ViewGroup mPlaceholder = getMPlaceholder();
        h.f.b.l.b(mPlaceholder, "");
        this.f82092b = ((float) getMeasuredHeight()) - ((float) mPlaceholder.getMeasuredHeight());
        MethodCollector.o(2326);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout.a(boolean, boolean):void");
    }

    public static final class a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f82104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchNestedLayout f82105b;

        static {
            Covode.recordClassIndex(51082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, SearchNestedLayout searchNestedLayout) {
            super(obj2);
            this.f82104a = obj;
            this.f82105b = searchNestedLayout;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, Boolean bool, Boolean bool2) {
            boolean z;
            h.f.b.l.d(iVar, "");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                SearchNestedLayout searchNestedLayout = this.f82105b;
                if (searchNestedLayout.getMScrollingChild().computeVerticalScrollExtent() >= this.f82105b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                searchNestedLayout.f82093c = z;
            }
        }
    }

    private /* synthetic */ SearchNestedLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
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

    @Override // androidx.core.h.n
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        boolean z2;
        h.f.b.l.d(view, "");
        if ((view instanceof t) && ((t) view).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (getTranslationY() * 2.0f < this.f82092b) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2, false);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchNestedLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        boolean z2 = false;
        MethodCollector.i(2366);
        this.f82098i = h.i.a((h.f.a.a) new l(context));
        this.f82099j = h.i.a((h.f.a.a) new j(this));
        this.f82100k = h.i.a((h.f.a.a) new f(this));
        this.f82101l = h.i.a((h.f.a.a) new e(this));
        this.f82102m = h.i.a((h.f.a.a) k.f82109a);
        this.z = new a(false, false, this);
        this.A = h.i.a((h.f.a.a) new g(this));
        this.B = h.i.a((h.f.a.a) new c(this));
        this.D = h.i.a((h.f.a.a) new h(this));
        this.F = new i(this);
        this.G = new d(this);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchNestedLayout f82103a;

            static {
                Covode.recordClassIndex(51081);
            }

            {
                this.f82103a = r1;
            }

            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (!this.f82103a.a() || i2 != 4) {
                    return false;
                }
                h.f.b.l.b(keyEvent, "");
                if (keyEvent.getAction() == 1) {
                    this.f82103a.a(false, true);
                }
                return true;
            }
        });
        if (com.ss.android.ugc.aweme.app.b.a.a(getContext()) && com.ss.android.ugc.aweme.adaptation.c.f66197m == 0) {
            z2 = true;
        }
        this.H = z2;
        this.I = com.ss.android.ugc.aweme.adaptation.c.d(context);
        this.J = com.ss.android.ugc.aweme.base.utils.n.a(8.0d);
        MethodCollector.o(2366);
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
            float f4 = this.f82092b;
            if (f2 > f4) {
                f2 = f4;
            }
            setTranslationY(f2);
            if (getMTouchScrollingChild()) {
                iArr[1] = iArr[1] + i3;
            }
        } else if (translationY == 0.0f) {
            if (view instanceof t) {
                i4 = ((t) view).computeVerticalScrollOffset();
            } else {
                i4 = 0;
            }
            if (i3 < 0 && (i4 == 0 || !getMTouchScrollingChild())) {
                float f5 = translationY - ((float) i3);
                float f6 = this.f82092b;
                if (f5 > f6) {
                    f5 = f6;
                }
                setTranslationY(f5);
            }
        }
        getMTouchScrollingChild();
    }
}
