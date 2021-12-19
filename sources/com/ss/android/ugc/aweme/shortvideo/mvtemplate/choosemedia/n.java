package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.e.k;
import com.zhiliaoapp.musically.R;

public final class n extends LinearLayout {
    private float A;
    private float B;
    private long C;
    private boolean D;

    /* renamed from: a  reason: collision with root package name */
    public int f129153a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f129154b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f129155c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f129156d;

    /* renamed from: e  reason: collision with root package name */
    View f129157e;

    /* renamed from: f  reason: collision with root package name */
    ViewPropertyAnimator f129158f;

    /* renamed from: g  reason: collision with root package name */
    public ViewPropertyAnimator f129159g;

    /* renamed from: h  reason: collision with root package name */
    public a f129160h;

    /* renamed from: i  reason: collision with root package name */
    public c f129161i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f129162j;

    /* renamed from: k  reason: collision with root package name */
    boolean f129163k;

    /* renamed from: l  reason: collision with root package name */
    public String f129164l;

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f129165m;
    float n;
    float o;
    public boolean p;
    boolean q;
    public boolean r;
    final RecyclerView.n s;
    float t;
    private int u;
    private int v;
    private int w;
    private ValueAnimator x;
    private final Runnable y;
    private boolean z;

    public interface a {
        static {
            Covode.recordClassIndex(84786);
        }

        void a(boolean z);
    }

    public interface c {
        static {
            Covode.recordClassIndex(84788);
        }

        CharSequence a(int i2);
    }

    static {
        Covode.recordClassIndex(84780);
    }

    static class b implements Runnable {
        static {
            Covode.recordClassIndex(84787);
        }

        private b() {
        }

        public final void run() {
            k.a().e().f47840e.b();
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.removeAllUpdateListeners();
            this.x = null;
        }
        if (this.r) {
            this.f129156d.setTranslationX(0.0f);
            a(this.f129154b, com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 146.0f));
        }
    }

    public final void c() {
        this.f129157e.setVisibility(8);
        if (!this.r) {
            this.f129156d.setVisibility(4);
            ViewGroup.LayoutParams layoutParams = this.f129154b.getLayoutParams();
            layoutParams.width = (int) com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 56.0f);
            this.f129154b.setLayoutParams(layoutParams);
        }
        this.f129163k = false;
        this.f129158f = null;
    }

    public final void a() {
        this.D = false;
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.removeAllUpdateListeners();
            this.x = null;
        }
    }

    public final void setFastScrollListener(a aVar) {
        this.f129160h = aVar;
    }

    class d extends FloatEvaluator {
        static {
            Covode.recordClassIndex(84789);
        }

        private d() {
        }

        /* synthetic */ d(n nVar, byte b2) {
            this();
        }

        @Override // android.animation.FloatEvaluator
        public final Float evaluate(float f2, Number number, Number number2) {
            float floatValue = super.evaluate(f2, number, number2).floatValue();
            n.a(n.this.f129154b, floatValue);
            return Float.valueOf(floatValue);
        }
    }

    class e extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(84790);
        }

        private e() {
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            n.this.b();
            n.this.p = false;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            n.this.b();
            n.this.p = false;
        }

        /* synthetic */ e(n nVar, byte b2) {
            this();
        }
    }

    class f extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(84791);
        }

        private f() {
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            n.this.a();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            n.this.a();
        }

        /* synthetic */ f(n nVar, byte b2) {
            this();
        }
    }

    public n(Context context) {
        this(context, (byte) 0);
    }

    private static void a(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private void setHandleSelected(boolean z2) {
        this.f129154b.setSelected(z2);
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -1;
        super.setLayoutParams(layoutParams);
    }

    public final void setEnabled(boolean z2) {
        int i2;
        super.setEnabled(z2);
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    public static int a(RecyclerView.i iVar) {
        if (iVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) iVar).k();
        }
        if (iVar instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) iVar).a((int[]) null)[0];
        }
        return 0;
    }

    private void setScrollBarStartTransX(float f2) {
        if (this.q) {
            this.o = -f2;
            this.n = -20.0f;
            return;
        }
        this.o = f2;
        this.n = 20.0f;
    }

    public final void setViewPositions(float f2) {
        int measuredHeight = this.f129154b.getMeasuredHeight();
        this.u = measuredHeight;
        float a2 = (float) a(this.v - measuredHeight, (int) (f2 - ((float) (measuredHeight / 2))));
        this.f129154b.setY(a2);
        this.f129156d.setY(a2);
    }

    public final void setSectionIndexer(c cVar) {
        this.f129161i = cVar;
        if (this.z && cVar != null) {
            this.r = true;
            this.f129156d.setVisibility(0);
            a(this.f129154b, com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 146.0f));
            a(this.f129156d, com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 116.0f));
            setScrollBarStartTransX(146.0f);
        }
    }

    static void a(ViewPropertyAnimator viewPropertyAnimator) {
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void setLayoutParams(ViewGroup viewGroup) {
        RecyclerView recyclerView = this.f129155c;
        if (recyclerView == null || recyclerView.getId() == -1) {
            throw new IllegalArgumentException("RecyclerView must have a view ID");
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.height = -1;
            layoutParams.gravity = 8388613;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f129156d.measure(makeMeasureSpec, makeMeasureSpec);
            this.f129154b.measure(makeMeasureSpec, makeMeasureSpec);
            this.u = this.f129154b.getMeasuredHeight();
        } else {
            throw new IllegalArgumentException("Parent ViewGroup must be a ConstraintLayout, CoordinatorLayout, FrameLayout, or RelativeLayout");
        }
    }

    static boolean a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setRecyclerViewPosition(float r5) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.setRecyclerViewPosition(float):void");
    }

    public final float b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        this.u = this.f129154b.getMeasuredHeight();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float computeVerticalScrollRange = (float) ((recyclerView.computeVerticalScrollRange() - this.v) + this.u);
        float f2 = (float) computeVerticalScrollOffset;
        if (computeVerticalScrollRange <= 0.0f) {
            computeVerticalScrollRange = 1.0f;
        }
        float f3 = f2 / computeVerticalScrollRange;
        if (this.f129163k && this.f129158f != null) {
            getHandler().removeCallbacks(this.f129165m);
            a(this.f129158f);
        }
        if (Math.abs(computeVerticalScrollOffset - this.f129153a) > this.w / 4 && this.f129162j) {
            this.f129162j = false;
            if (!a(this.f129157e)) {
                this.f129157e.setAlpha(0.0f);
                this.f129157e.setVisibility(0);
                if (((float) this.f129155c.computeVerticalScrollRange()) - (((float) this.v) * 2.1f) > 0.0f) {
                    this.f129157e.setTranslationX(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, this.o));
                    this.f129163k = false;
                    this.f129158f = this.f129157e.animate().translationX(0.0f).alpha(1.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(84784);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            n nVar = n.this;
                            nVar.f129157e.setTranslationX(0.0f);
                            nVar.f129157e.setAlpha(1.0f);
                            if (nVar.r) {
                                nVar.f129159g.cancel();
                                nVar.f129159g = null;
                                nVar.f129156d.setTranslationX(0.0f);
                                nVar.f129156d.setAlpha(1.0f);
                            }
                        }
                    });
                }
                if (this.r) {
                    this.f129156d.setTranslationX(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, this.n));
                    this.f129156d.setAlpha(0.0f);
                    this.f129159g = this.f129156d.animate().translationX(0.0f).alpha(1.0f).setDuration(150).setStartDelay(150);
                }
            }
        }
        int i2 = this.v;
        int i3 = this.u;
        return (((float) (i2 - i3)) * f3) + (((float) i3) / 2.0f);
    }

    public final void a(RecyclerView recyclerView) {
        MethodCollector.i(9684);
        this.f129155c = recyclerView;
        if (getParent() instanceof ViewGroup) {
            setLayoutParams((ViewGroup) getParent());
        } else if (recyclerView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
            viewGroup.addView(this);
            setLayoutParams(viewGroup);
        }
        recyclerView.a(this.s);
        post(new p(this));
        MethodCollector.o(9684);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            requestDisallowInterceptTouchEvent(false);
            setHandleSelected(false);
            if (this.r) {
                if (this.D) {
                    a(this.f129159g);
                    a(this.x);
                }
                if (this.p && this.x == null) {
                    this.D = false;
                    float b2 = com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 146.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(this.t, b2).setDuration(300L);
                    this.x = duration;
                    duration.addUpdateListener(new r(this, b2));
                    this.x.addListener(new e(this, (byte) 0));
                    this.x.start();
                }
            } else {
                if (this.D) {
                    a(this.f129159g);
                    a(this.x);
                }
                if (a(this.f129156d) && this.x == null) {
                    int width = this.f129154b.getWidth();
                    this.D = false;
                    ViewPropertyAnimator listener = this.f129156d.animate().translationX(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, this.n)).alpha(0.0f).setDuration(150).setListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(84783);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            n.this.f129156d.setVisibility(4);
                            n.this.f129159g = null;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            n.this.f129156d.setVisibility(4);
                            n.this.f129159g = null;
                        }
                    });
                    this.f129159g = listener;
                    listener.start();
                    ValueAnimator ofObject = ValueAnimator.ofObject(new d(this, (byte) 0), Integer.valueOf(width), Float.valueOf(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 56.0f)));
                    this.x = ofObject;
                    ofObject.setStartDelay(175);
                    this.x.addListener(new e(this, (byte) 0));
                    this.x.setDuration(300L).start();
                }
            }
            getHandler().postDelayed(this.f129165m, 3400);
            a aVar = this.f129160h;
            if (aVar != null) {
                aVar.a(true);
            }
            if (k.a().e().f47840e.c()) {
                getHandler().removeCallbacks(this.y);
                k.a().e().f47840e.b();
            }
            return true;
        } else if (!a(this.f129157e)) {
            return false;
        } else {
            this.A = motionEvent.getY();
            this.B = this.f129154b.getY();
            FrameLayout frameLayout = this.f129154b;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (frameLayout != null) {
                int[] iArr = new int[2];
                frameLayout.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int measuredWidth = frameLayout.getMeasuredWidth() + i2;
                int measuredHeight = frameLayout.getMeasuredHeight() + i3;
                if (rawY < i3 || rawY > measuredHeight || rawX < i2 || rawX > measuredWidth || this.f129163k) {
                    return false;
                }
                requestDisallowInterceptTouchEvent(true);
                setHandleSelected(true);
                getHandler().removeCallbacks(this.f129165m);
                a(this.f129158f);
            }
            return false;
        }
        if (!k.a().e().f47840e.c()) {
            k.a().e().f47840e.a();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.C < 50) {
            getHandler().removeCallbacks(this.y);
        }
        this.C = currentTimeMillis;
        getHandler().postDelayed(this.y, 50);
        float y2 = motionEvent.getY();
        float f2 = this.B + (y2 - this.A) + (((float) this.u) / 2.0f);
        setViewPositions(f2);
        if (Math.abs(y2 - this.A) > 10.0f) {
            if (this.f129161i != null) {
                if (this.r) {
                    if (!this.p) {
                        this.D = true;
                        this.p = true;
                        float b3 = com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 146.0f);
                        ValueAnimator duration2 = ValueAnimator.ofFloat(b3, com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 178.0f)).setDuration(300L);
                        this.x = duration2;
                        duration2.addUpdateListener(new q(this, b3));
                        this.x.addListener(new f(this, (byte) 0));
                        this.x.start();
                    }
                } else if (!a(this.f129156d)) {
                    this.f129156d.setAlpha(0.0f);
                    this.f129156d.setVisibility(0);
                    this.D = true;
                    this.f129156d.setTranslationX(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, this.n));
                    this.f129159g = this.f129156d.animate().translationX(0.0f).alpha(1.0f).setDuration(150).setStartDelay(150).setListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(84782);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            n.this.f129159g = null;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            n.this.f129159g = null;
                        }
                    });
                    ValueAnimator ofObject2 = ValueAnimator.ofObject(new d(this, (byte) 0), Float.valueOf(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 56.0f)), Float.valueOf(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 178.0f)));
                    this.x = ofObject2;
                    ofObject2.addListener(new f(this, (byte) 0));
                    this.x.setDuration(300L).start();
                }
            }
            setRecyclerViewPosition(f2);
        }
        return true;
    }

    private n(Context context, byte b2) {
        this(context, (char) 0);
    }

    private static int a(int i2, int i3) {
        return Math.min(Math.max(0, i3), i2);
    }

    public static void a(View view, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) f2;
        view.setLayoutParams(layoutParams);
    }

    private n(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(9678);
        this.f129164l = "";
        this.f129165m = new o(this);
        this.n = 20.0f;
        this.o = 56.0f;
        this.p = false;
        this.q = false;
        this.r = false;
        this.y = new b((byte) 0);
        this.z = false;
        this.s = new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84781);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
                if (!n.this.isEnabled()) {
                    return;
                }
                if (i2 == 0) {
                    n.this.f129153a = recyclerView.computeVerticalScrollOffset();
                    if (!n.this.f129154b.isSelected()) {
                        n.this.getHandler().postDelayed(n.this.f129165m, 3000);
                        if (n.this.f129160h != null) {
                            n.this.f129160h.a(false);
                        }
                    }
                } else if (i2 == 1) {
                    n.this.getHandler().removeCallbacks(n.this.f129165m);
                    n.this.f129162j = true;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                if (!n.this.f129154b.isSelected() && n.this.isEnabled()) {
                    n nVar = n.this;
                    nVar.setViewPositions(nVar.b(recyclerView));
                }
                if (n.this.r && n.this.f129161i != null && recyclerView.getLayoutManager() != null) {
                    String charSequence = n.this.f129161i.a(n.a(recyclerView.getLayoutManager())).toString();
                    if (!n.this.f129164l.equals(charSequence)) {
                        n.this.f129164l = charSequence;
                        n.this.f129156d.setText(charSequence);
                    }
                }
            }
        };
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = false;
        this.t = 0.0f;
        inflate(context, R.layout.zm, this);
        setClipChildren(false);
        setOrientation(0);
        this.f129156d = (TextView) findViewById(R.id.b0f);
        this.f129154b = (FrameLayout) findViewById(R.id.b0g);
        this.f129157e = findViewById(R.id.b0h);
        this.w = com.bytedance.common.utility.n.a(context);
        if (com.ss.android.ugc.aweme.tools.c.a(context)) {
            this.q = true;
        }
        setScrollBarStartTransX(56.0f);
        MethodCollector.o(9678);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.v = i3;
    }
}
