package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class a extends RelativeLayout {
    private int A;
    private GestureDetector B;
    private RunnableC2745a C;
    private b D;
    private GestureDetector.SimpleOnGestureListener E = new GestureDetector.SimpleOnGestureListener() {
        /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(68450);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            a.this.f107015k = false;
            return super.onDown(motionEvent);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            a aVar = a.this;
            aVar.f107015k = aVar.f107011g.performLongClick();
            if (a.this.f107015k) {
                if (a.this.f107005a) {
                    a.this.a(null);
                }
                a.this.a();
            }
        }
    };
    private Property<a, Integer> F = new Property<a, Integer>(Integer.class, "rippleAlpha") {
        /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a.AnonymousClass5 */

        static {
            Covode.recordClassIndex(68453);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(a aVar) {
            return Integer.valueOf(aVar.getRippleAlpha());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, Integer num) {
            aVar.setRippleAlpha(num);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f107005a;

    /* renamed from: b  reason: collision with root package name */
    int f107006b;

    /* renamed from: c  reason: collision with root package name */
    public int f107007c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f107008d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f107009e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f107010f;

    /* renamed from: g  reason: collision with root package name */
    public View f107011g;

    /* renamed from: h  reason: collision with root package name */
    ObjectAnimator f107012h;

    /* renamed from: i  reason: collision with root package name */
    boolean f107013i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f107014j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f107015k;

    /* renamed from: l  reason: collision with root package name */
    Property<a, Float> f107016l = new Property<a, Float>(Float.class, "radius") {
        /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a.AnonymousClass4 */

        static {
            Covode.recordClassIndex(68452);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(a aVar) {
            return Float.valueOf(aVar.getRadius());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, Float f2) {
            aVar.setRadius(f2.floatValue());
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private final Paint f107017m;
    private final Rect n = new Rect();
    private int o;
    private boolean p;
    private int q;
    private int r;
    private Drawable s;
    private float t;
    private float u;
    private AdapterView v;
    private AnimatorSet w;
    private Point x = new Point();
    private Point y = new Point();
    private int z;

    static {
        Covode.recordClassIndex(68448);
    }

    public boolean isInEditMode() {
        return true;
    }

    public <T extends View> T getChildView() {
        return (T) this.f107011g;
    }

    public float getRadius() {
        return this.u;
    }

    private void d() {
        int i2 = Build.VERSION.SDK_INT;
    }

    public int getRippleAlpha() {
        return this.f107017m.getAlpha();
    }

    public final void a() {
        b bVar = this.D;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f107014j = false;
        }
    }

    private void c() {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w.removeAllListeners();
        }
        ObjectAnimator objectAnimator = this.f107012h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final AdapterView b() {
        AdapterView adapterView = this.v;
        if (adapterView != null) {
            return adapterView;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof AdapterView)) {
            try {
                parent = parent.getParent();
            } catch (NullPointerException unused) {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        }
        AdapterView adapterView2 = (AdapterView) parent;
        this.v = adapterView2;
        return adapterView2;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a$a  reason: collision with other inner class name */
    class RunnableC2745a implements Runnable {
        static {
            Covode.recordClassIndex(68454);
        }

        public final void run() {
            if (!a.this.f107015k) {
                if (a.this.getParent() instanceof AdapterView) {
                    if (!a.this.f107011g.performClick()) {
                        a((AdapterView) a.this.getParent());
                    }
                } else if (a.this.f107010f) {
                    a(a.this.b());
                } else {
                    a.this.f107011g.performClick();
                }
            }
        }

        private RunnableC2745a() {
        }

        private void a(AdapterView adapterView) {
            long j2;
            int positionForView = adapterView.getPositionForView(a.this);
            if (adapterView.getAdapter() != null) {
                j2 = adapterView.getAdapter().getItemId(positionForView);
            } else {
                j2 = 0;
            }
            if (positionForView != -1) {
                adapterView.performItemClick(a.this, positionForView, j2);
            }
        }

        /* synthetic */ RunnableC2745a(a aVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final MotionEvent f107026b;

        static {
            Covode.recordClassIndex(68455);
        }

        public final void run() {
            a.this.f107014j = false;
            a.this.f107011g.setLongClickable(false);
            a.this.f107011g.onTouchEvent(this.f107026b);
            a.this.f107011g.setPressed(true);
            if (a.this.f107005a) {
                a aVar = a.this;
                if (!aVar.f107013i) {
                    if (aVar.f107012h != null) {
                        aVar.f107012h.cancel();
                    }
                    float sqrt = (float) (Math.sqrt(Math.pow((double) aVar.getWidth(), 2.0d) + Math.pow((double) aVar.getHeight(), 2.0d)) * 1.2000000476837158d);
                    aVar.f107012h = ObjectAnimator.ofFloat(aVar, aVar.f107016l, (float) aVar.f107006b, sqrt).setDuration(2500L);
                    aVar.f107012h.setInterpolator(new LinearInterpolator());
                    aVar.f107012h.start();
                }
            }
        }

        public b(MotionEvent motionEvent) {
            this.f107026b = motionEvent;
        }
    }

    private float getEndRadius() {
        int i2;
        int i3;
        int width = getWidth();
        int height = getHeight();
        int i4 = height / 2;
        if (width / 2 > this.x.x) {
            i2 = width - this.x.x;
        } else {
            i2 = this.x.x;
        }
        float f2 = (float) i2;
        if (i4 > this.x.y) {
            i3 = height - this.x.y;
        } else {
            i3 = this.x.y;
        }
        return ((float) Math.sqrt(Math.pow((double) f2, 2.0d) + Math.pow((double) ((float) i3), 2.0d))) * 1.2f;
    }

    public void setRippleDelayClick(boolean z2) {
        this.f107008d = z2;
    }

    public void setRippleDiameter(int i2) {
        this.f107006b = i2;
    }

    public void setRippleDuration(int i2) {
        this.q = i2;
    }

    public void setRippleFadeDuration(int i2) {
        this.r = i2;
    }

    public void setRippleHover(boolean z2) {
        this.f107005a = z2;
    }

    public void setRippleInAdapter(boolean z2) {
        this.f107010f = z2;
    }

    public void setRippleOverlay(boolean z2) {
        this.p = z2;
    }

    public void setRipplePersistent(boolean z2) {
        this.f107009e = z2;
    }

    public void setRadius(float f2) {
        this.u = f2;
        invalidate();
    }

    public void setRippleRoundedCorners(int i2) {
        this.t = (float) i2;
        d();
    }

    public void setDefaultRippleAlpha(float f2) {
        int i2 = (int) (f2 * 255.0f);
        this.f107007c = i2;
        this.f107017m.setAlpha(i2);
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View view = this.f107011g;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        View view = this.f107011g;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setRippleAlpha(Integer num) {
        this.f107017m.setAlpha(num.intValue());
        invalidate();
    }

    public void setRippleBackground(int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        this.s = colorDrawable;
        colorDrawable.setBounds(this.n);
        invalidate();
    }

    public void setRippleColor(int i2) {
        this.o = i2;
        this.f107017m.setColor(i2);
        this.f107017m.setAlpha(this.f107007c);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.View r8 = r10.f107011g
            float r0 = r11.getX()
            int r9 = (int) r0
            float r0 = r11.getY()
            int r7 = (int) r0
        L_0x000c:
            boolean r0 = r8 instanceof android.view.ViewGroup
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0039
            r4 = r8
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3 = 0
        L_0x0016:
            int r0 = r4.getChildCount()
            if (r3 >= r0) goto L_0x0056
            android.view.View r2 = r4.getChildAt(r3)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.getHitRect(r1)
            boolean r0 = r1.contains(r9, r7)
            if (r0 == 0) goto L_0x0036
            int r0 = r1.left
            int r9 = r9 - r0
            int r0 = r1.top
            int r7 = r7 - r0
            r8 = r2
            goto L_0x000c
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0039:
            android.view.View r0 = r10.f107011g
            if (r8 == r0) goto L_0x0056
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r8.isClickable()
            if (r0 != 0) goto L_0x0055
            boolean r0 = r8.isLongClickable()
            if (r0 != 0) goto L_0x0055
            boolean r0 = r8.isFocusableInTouchMode()
            if (r0 == 0) goto L_0x005c
        L_0x0055:
            return r5
        L_0x0056:
            boolean r0 = r8.isFocusableInTouchMode()
            if (r0 != 0) goto L_0x0055
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void a(final Runnable runnable) {
        if (!this.f107013i) {
            float endRadius = getEndRadius();
            c();
            AnimatorSet animatorSet = new AnimatorSet();
            this.w = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(68451);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (!a.this.f107009e) {
                        a.this.setRadius(0.0f);
                        a aVar = a.this;
                        aVar.setRippleAlpha(Integer.valueOf(aVar.f107007c));
                    }
                    if (runnable != null && a.this.f107008d) {
                        runnable.run();
                    }
                    a.this.f107011g.setPressed(false);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.f107016l, this.u, endRadius);
            ofFloat.setDuration((long) this.q);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.F, this.f107007c, 0);
            ofInt.setDuration((long) this.r);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setStartDelay((long) ((this.q - this.r) - 50));
            if (this.f107009e) {
                this.w.play(ofFloat);
            } else if (getRadius() > endRadius) {
                ofInt.setStartDelay(0);
                this.w.play(ofInt);
            } else {
                this.w.playTogether(ofFloat, ofInt);
            }
            this.w.start();
        }
    }

    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3 = false;
        if (this.f107010f) {
            int positionForView = b().getPositionForView(this);
            if (positionForView != this.A) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.A = positionForView;
            if (z2) {
                a();
                c();
                this.f107011g.setPressed(false);
                setRadius(0.0f);
            }
            z3 = z2;
        }
        if (this.p) {
            if (!z3) {
                this.s.draw(canvas);
            }
            super.draw(canvas);
            if (!z3) {
                if (this.t != 0.0f) {
                    Path path = new Path();
                    RectF rectF = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    float f2 = this.t;
                    path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                    canvas.clipPath(path);
                }
                canvas.drawCircle((float) this.x.x, (float) this.x.y, this.u, this.f107017m);
                return;
            }
            return;
        }
        if (!z3) {
            this.s.draw(canvas);
            canvas.drawCircle((float) this.x.x, (float) this.x.y, this.u, this.f107017m);
        }
        super.draw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r4 == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        MethodCollector.i(4251);
        Paint paint = new Paint(1);
        this.f107017m = paint;
        setWillNotDraw(false);
        this.B = new GestureDetector(context, this.E);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.a1z, R.attr.a20, R.attr.a21, R.attr.a22, R.attr.a23, R.attr.a24, R.attr.a25, R.attr.a26, R.attr.a27, R.attr.a28, R.attr.a29, R.attr.a2_});
        this.o = obtainStyledAttributes.getColor(2, -1);
        this.f107006b = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(1, 35.0f, getResources().getDisplayMetrics()));
        this.p = obtainStyledAttributes.getBoolean(9, false);
        this.f107005a = obtainStyledAttributes.getBoolean(7, true);
        this.q = obtainStyledAttributes.getInt(5, 350);
        this.f107007c = (int) (obtainStyledAttributes.getFloat(0, 0.2f) * 255.0f);
        this.f107008d = obtainStyledAttributes.getBoolean(3, true);
        this.r = obtainStyledAttributes.getInteger(6, 75);
        this.s = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
        this.f107009e = obtainStyledAttributes.getBoolean(10, false);
        this.f107010f = obtainStyledAttributes.getBoolean(8, false);
        this.t = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        obtainStyledAttributes.recycle();
        paint.setColor(this.o);
        paint.setAlpha(this.f107007c);
        d();
        MethodCollector.o(4251);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(4255);
        if (getChildCount() <= 0) {
            this.f107011g = view;
            super.addView(view, i2, layoutParams);
            MethodCollector.o(4255);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("MaterialRippleLayout can host only one child");
        MethodCollector.o(4255);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.n.set(0, 0, i2, i3);
        this.s.setBounds(this.n);
    }
}
