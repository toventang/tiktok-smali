package com.lynx.tasm.behavior.ui.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.a;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class a extends ScrollView implements a.AbstractC1260a {

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f56282a;

    /* renamed from: b  reason: collision with root package name */
    public HorizontalScrollView f56283b;

    /* renamed from: c  reason: collision with root package name */
    public int f56284c;

    /* renamed from: d  reason: collision with root package name */
    boolean f56285d;

    /* renamed from: e  reason: collision with root package name */
    public int f56286e;

    /* renamed from: f  reason: collision with root package name */
    public int f56287f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f56288g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f56289h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<AbstractC1263a> f56290i;

    /* renamed from: j  reason: collision with root package name */
    public com.lynx.tasm.behavior.ui.a f56291j;

    /* renamed from: k  reason: collision with root package name */
    public int f56292k;

    /* renamed from: l  reason: collision with root package name */
    public int f56293l;

    /* renamed from: m  reason: collision with root package name */
    public int f56294m = 300;
    public c n;
    public boolean o;
    public int p;
    public int q;
    private boolean r;
    private int s;
    private Runnable t;
    private Rect u;

    /* renamed from: com.lynx.tasm.behavior.ui.scroll.a$a  reason: collision with other inner class name */
    public interface AbstractC1263a {
        static {
            Covode.recordClassIndex(35147);
        }

        void a();

        void a(int i2);

        void a(int i2, int i3, int i4, int i5);

        void b();
    }

    static {
        Covode.recordClassIndex(35143);
    }

    public int getContentHeight() {
        return this.f56287f;
    }

    public int getContentWidth() {
        return this.f56286e;
    }

    public HorizontalScrollView getHScrollView() {
        return this.f56283b;
    }

    public LinearLayout getLinearLayout() {
        return this.f56282a;
    }

    public int getOrientation() {
        return this.f56282a.getOrientation();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        removeCallbacks(this.t);
        super.finalize();
    }

    public int getRealScrollX() {
        if (this.f56285d) {
            return this.f56283b.getScrollX();
        }
        return getScrollX();
    }

    public int getRealScrollY() {
        if (this.f56285d) {
            return this.f56283b.getScrollY();
        }
        return getScrollY();
    }

    private void c() {
        a(2);
        Iterator<AbstractC1263a> it = this.f56290i.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a() {
        this.f56292k = getScrollY();
        this.f56293l = this.f56283b.getScrollX();
        postDelayed(this.t, (long) this.f56294m);
    }

    public final void b() {
        a(1);
        Iterator<AbstractC1263a> it = this.f56290i.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void removeAllViews() {
        MethodCollector.i(14270);
        if (this.r) {
            this.f56282a.removeAllViews();
            MethodCollector.o(14270);
            return;
        }
        super.removeAllViews();
        this.r = true;
        MethodCollector.o(14270);
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f56299a;

        static {
            Covode.recordClassIndex(35148);
        }

        public final void run() {
            if (this.f56299a.get() != null) {
                a aVar = this.f56299a.get();
                int scrollY = aVar.getScrollY();
                int scrollX = aVar.f56283b.getScrollX();
                if ((!aVar.f56285d || aVar.f56293l - scrollX != 0) && (aVar.f56285d || aVar.f56292k - scrollY != 0)) {
                    aVar.f56292k = scrollY;
                    aVar.f56293l = scrollX;
                    aVar.postDelayed(this, (long) aVar.f56294m);
                    return;
                }
                aVar.a(0);
                Iterator<AbstractC1263a> it = aVar.f56290i.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }

        public b(a aVar) {
            this.f56299a = new WeakReference<>(aVar);
        }
    }

    class c implements Runnable {
        static {
            Covode.recordClassIndex(35149);
        }

        public final void run() {
            if (a.this.o) {
                int realScrollX = a.this.getRealScrollX();
                int realScrollY = a.this.getRealScrollY();
                if (!a.this.f56285d) {
                    a aVar = a.this;
                    aVar.a(realScrollX, aVar.p + realScrollY, false);
                    if (realScrollY + a.this.p + a.this.getMeasuredHeight() < a.this.f56282a.getMeasuredHeight()) {
                        a aVar2 = a.this;
                        aVar2.postDelayed(aVar2.n, 16);
                        return;
                    }
                    a.this.o = false;
                    return;
                }
                a aVar3 = a.this;
                aVar3.a(aVar3.p + realScrollX, realScrollY, false);
                if (realScrollX + a.this.p + a.this.getMeasuredWidth() < a.this.f56282a.getMeasuredWidth()) {
                    a aVar4 = a.this;
                    aVar4.postDelayed(aVar4.n, 16);
                    return;
                }
                a.this.o = false;
            }
        }

        private c() {
        }

        /* synthetic */ c(a aVar, byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.a.AbstractC1260a
    public void bindDrawChildHook(com.lynx.tasm.behavior.ui.a aVar) {
        this.f56291j = aVar;
    }

    public void setOnScrollListener(AbstractC1263a aVar) {
        this.f56290i.add(aVar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f56285d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setEnableScroll(final boolean z) {
        AnonymousClass1 r1 = new View.OnTouchListener() {
            /* class com.lynx.tasm.behavior.ui.scroll.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35144);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!z) {
                    return true;
                }
                return false;
            }
        };
        this.f56283b.setOnTouchListener(r1);
        setOnTouchListener(r1);
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        this.f56283b.setHorizontalScrollBarEnabled(z);
    }

    public void addView(View view) {
        MethodCollector.i(14115);
        if (this.r) {
            this.f56282a.addView(view);
            MethodCollector.o(14115);
            return;
        }
        super.addView(view);
        this.r = true;
        MethodCollector.o(14115);
    }

    public void removeView(View view) {
        MethodCollector.i(14237);
        if (this.r) {
            this.f56282a.removeView(view);
            MethodCollector.o(14237);
            return;
        }
        super.removeView(view);
        this.r = true;
        MethodCollector.o(14237);
    }

    public void removeViewAt(int i2) {
        MethodCollector.i(14238);
        if (this.r) {
            this.f56282a.removeViewAt(i2);
            MethodCollector.o(14238);
            return;
        }
        super.removeViewAt(i2);
        this.r = true;
        MethodCollector.o(14238);
    }

    public void setOrientation(int i2) {
        if (i2 == 0) {
            this.f56282a.setOrientation(0);
            this.f56285d = true;
        } else if (i2 == 1) {
            this.f56282a.setOrientation(1);
            this.f56285d = false;
        }
    }

    public final void a(int i2) {
        this.q = i2;
        Iterator<AbstractC1263a> it = this.f56290i.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f56285d) {
            return false;
        }
        a(motionEvent);
        if (motionEvent.getAction() == 0) {
            a(this.q);
        }
        if (motionEvent.getAction() == 1) {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    private static void a(View view) {
        Field field;
        try {
            if (view instanceof HorizontalScrollView) {
                field = HorizontalScrollView.class.getDeclaredField("mScroller");
            } else {
                if (view instanceof ScrollView) {
                    field = ScrollView.class.getDeclaredField("mScroller");
                }
                LLog.c("AndroidScrollView", "did not find mScroller in " + view.getClass().getName());
            }
            if (field != null) {
                field.setAccessible(true);
                OverScroller overScroller = (OverScroller) field.get(view);
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    return;
                }
                return;
            }
            LLog.c("AndroidScrollView", "did not find mScroller in " + view.getClass().getName());
        } catch (Throwable th) {
            LLog.c("AndroidScrollView", th.getMessage());
        }
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(14076);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.f56290i = new ArrayList<>();
        this.u = new Rect();
        if (this.f56282a == null) {
            AnonymousClass2 r1 = new LinearLayout(getContext()) {
                /* class com.lynx.tasm.behavior.ui.scroll.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35145);
                }

                /* access modifiers changed from: protected */
                public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                }

                /* access modifiers changed from: protected */
                public final void dispatchDraw(Canvas canvas) {
                    if (a.this.f56291j != null) {
                        a.this.f56291j.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    if (a.this.f56291j != null) {
                        a.this.f56291j.afterDispatchDraw(canvas);
                    }
                }

                {
                    MethodCollector.i(11359);
                    MethodCollector.o(11359);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i2, int i3) {
                    setMeasuredDimension(a.this.f56286e, a.this.f56287f);
                }

                /* access modifiers changed from: protected */
                public final boolean drawChild(Canvas canvas, View view, long j2) {
                    boolean drawChild;
                    Rect beforeDrawChild;
                    if (a.this.f56291j == null || (beforeDrawChild = a.this.f56291j.beforeDrawChild(canvas, view, j2)) == null) {
                        drawChild = super.drawChild(canvas, view, j2);
                    } else {
                        canvas.save();
                        canvas.clipRect(beforeDrawChild);
                        drawChild = super.drawChild(canvas, view, j2);
                        canvas.restore();
                    }
                    if (a.this.f56291j != null) {
                        a.this.f56291j.afterDrawChild(canvas, view, j2);
                    }
                    return drawChild;
                }
            };
            this.f56282a = r1;
            r1.setOrientation(1);
            this.f56282a.setWillNotDraw(true);
            this.f56282a.setFocusableInTouchMode(true);
            AnonymousClass3 r12 = new HorizontalScrollView(getContext()) {
                /* class com.lynx.tasm.behavior.ui.scroll.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(35146);
                }

                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (a.this.f56285d) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                }

                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!a.this.f56285d) {
                        return false;
                    }
                    a.this.a(motionEvent);
                    if (motionEvent.getAction() == 0) {
                        a aVar = a.this;
                        aVar.a(aVar.q);
                    }
                    if (motionEvent.getAction() == 1) {
                        a.this.a();
                    }
                    return super.onTouchEvent(motionEvent);
                }

                {
                    MethodCollector.i(13623);
                    MethodCollector.o(13623);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i2, int i3) {
                    MethodCollector.i(13688);
                    super.onMeasure(i2, i3);
                    MethodCollector.o(13688);
                }

                /* access modifiers changed from: protected */
                public final void onScrollChanged(int i2, int i3, int i4, int i5) {
                    super.onScrollChanged(i2, i3, i4, i5);
                    if (i2 != a.this.f56284c) {
                        if (!a.this.f56288g || a.this.f56289h) {
                            a.this.a(i2, i3, i4, i5);
                        } else {
                            a.this.f56289h = true;
                            a.this.b();
                        }
                        if (a.this.f56284c != getScrollX()) {
                            a.this.f56284c = getScrollX();
                        }
                    }
                }
            };
            this.f56283b = r12;
            r12.setHorizontalScrollBarEnabled(false);
            this.f56283b.setOverScrollMode(2);
            this.f56283b.setFadingEdgeLength(0);
            this.f56283b.setWillNotDraw(true);
            this.f56283b.addView(this.f56282a, new FrameLayout.LayoutParams(-1, -1));
            addView(this.f56283b, new FrameLayout.LayoutParams(-2, -2));
        }
        this.t = new b(this);
        MethodCollector.o(14076);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background instanceof BackgroundDrawable) {
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) background;
            RectF b2 = backgroundDrawable.b();
            com.lynx.tasm.behavior.ui.utils.b bVar = backgroundDrawable.f56372g;
            Rect bounds = background.getBounds();
            Path path = new Path();
            RectF rectF = new RectF(((float) bounds.left) + b2.left, ((float) bounds.top) + b2.top + ((float) this.s), ((float) bounds.right) - b2.right, (((float) bounds.bottom) - b2.bottom) + ((float) this.s));
            if (bVar == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, BackgroundDrawable.b.a(bVar.a(), b2, 1.0f), Path.Direction.CW);
            }
            int save = canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        if (getParent() instanceof ViewGroup) {
            int i2 = Build.VERSION.SDK_INT;
            if (!((ViewGroup) getParent()).getClipChildren() && getClipBounds() == null) {
                this.u.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
                canvas.clipRect(this.u);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f56288g = true;
        } else if (motionEvent.getAction() == 1) {
            if (this.f56289h) {
                c();
            }
            this.f56289h = false;
            this.f56288g = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        MethodCollector.i(14146);
        if (this.r) {
            this.f56282a.addView(view, i2);
            MethodCollector.o(14146);
            return;
        }
        super.addView(view, i2);
        this.r = true;
        MethodCollector.o(14146);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(14184);
        if (this.r) {
            this.f56282a.addView(view, layoutParams);
            MethodCollector.o(14184);
            return;
        }
        super.addView(view, layoutParams);
        this.r = true;
        MethodCollector.o(14184);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        MethodCollector.i(14214);
        if (this.r) {
            this.f56282a.addView(view, i2, i3);
            MethodCollector.o(14214);
            return;
        }
        super.addView(view, i2, i3);
        this.r = true;
        MethodCollector.o(14214);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(14147);
        if (this.r) {
            this.f56282a.addView(view, i2, layoutParams);
            MethodCollector.o(14147);
            return;
        }
        super.addView(view, i2, layoutParams);
        this.r = true;
        MethodCollector.o(14147);
    }

    public final void a(int i2, int i3, boolean z) {
        if (this.f56284c != i2 || this.s != i3) {
            if (z) {
                if (this.f56285d) {
                    this.f56283b.setSmoothScrollingEnabled(true);
                    this.f56283b.smoothScrollTo(i2, i3);
                    return;
                }
                setSmoothScrollingEnabled(true);
                smoothScrollTo(i2, i3);
            } else if (this.f56285d) {
                a(this.f56283b);
                this.f56283b.scrollTo(i2, i3);
            } else {
                a(this);
                scrollTo(i2, i3);
            }
        }
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f56282a.setPadding(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (i3 != this.s) {
            if (!this.f56288g || this.f56289h) {
                a(i2, i3, i4, i5);
            } else {
                this.f56289h = true;
                b();
            }
            if (this.s != getScrollY()) {
                this.s = getScrollY();
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        a(this.q);
        Iterator<AbstractC1263a> it = this.f56290i.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, i4, i5);
        }
    }
}
