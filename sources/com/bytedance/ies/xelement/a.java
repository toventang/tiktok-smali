package com.bytedance.ies.xelement;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.ui.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class a extends NestedScrollView implements a.AbstractC1260a {

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f36566d;

    /* renamed from: e  reason: collision with root package name */
    public HorizontalScrollView f36567e;

    /* renamed from: f  reason: collision with root package name */
    public int f36568f;

    /* renamed from: g  reason: collision with root package name */
    boolean f36569g;

    /* renamed from: h  reason: collision with root package name */
    public int f36570h;

    /* renamed from: i  reason: collision with root package name */
    public int f36571i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f36572j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f36573k;

    /* renamed from: l  reason: collision with root package name */
    ArrayList<AbstractC0888a> f36574l;

    /* renamed from: m  reason: collision with root package name */
    public com.lynx.tasm.behavior.ui.a f36575m;
    public int n;
    public int o;
    public int p = 300;
    public int q;
    private boolean r;
    private int s;
    private Runnable t;

    /* renamed from: com.bytedance.ies.xelement.a$a  reason: collision with other inner class name */
    public interface AbstractC0888a {
        static {
            Covode.recordClassIndex(21969);
        }

        void a(int i2);

        void a(int i2, int i3, int i4, int i5);
    }

    static {
        Covode.recordClassIndex(21966);
    }

    public final int getContentHeight() {
        return this.f36571i;
    }

    public final int getContentWidth() {
        return this.f36570h;
    }

    public final HorizontalScrollView getHScrollView() {
        return this.f36567e;
    }

    public final LinearLayout getLinearLayout() {
        return this.f36566d;
    }

    public final int getOrientation() {
        return this.f36566d.getOrientation();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        removeCallbacks(this.t);
        super.finalize();
    }

    private void c() {
        c(2);
        Iterator<AbstractC0888a> it = this.f36574l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a() {
        this.n = getScrollY();
        this.o = this.f36567e.getScrollX();
        postDelayed(this.t, (long) this.p);
    }

    public final void b() {
        c(1);
        Iterator<AbstractC0888a> it = this.f36574l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void removeAllViews() {
        MethodCollector.i(2187);
        if (this.r) {
            this.f36566d.removeAllViews();
            MethodCollector.o(2187);
            return;
        }
        super.removeAllViews();
        this.r = true;
        MethodCollector.o(2187);
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f36578a;

        static {
            Covode.recordClassIndex(21970);
        }

        public final void run() {
            if (this.f36578a.get() != null) {
                a aVar = this.f36578a.get();
                int scrollY = aVar.getScrollY();
                int scrollX = aVar.f36567e.getScrollX();
                if ((!aVar.f36569g || aVar.o - scrollX != 0) && (aVar.f36569g || aVar.n - scrollY != 0)) {
                    aVar.n = scrollY;
                    aVar.o = scrollX;
                    aVar.postDelayed(this, (long) aVar.p);
                    return;
                }
                aVar.c(0);
                Iterator<AbstractC0888a> it = aVar.f36574l.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        public b(a aVar) {
            this.f36578a = new WeakReference<>(aVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.a.AbstractC1260a
    public final void bindDrawChildHook(com.lynx.tasm.behavior.ui.a aVar) {
        this.f36575m = aVar;
    }

    public final void setOnScrollListener(AbstractC0888a aVar) {
        this.f36574l.add(aVar);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f36569g) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        this.f36567e.setHorizontalScrollBarEnabled(z);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void addView(View view) {
        MethodCollector.i(2176);
        if (this.r) {
            this.f36566d.addView(view);
            MethodCollector.o(2176);
            return;
        }
        super.addView(view);
        this.r = true;
        MethodCollector.o(2176);
    }

    public final void removeView(View view) {
        MethodCollector.i(2183);
        if (this.r) {
            this.f36566d.removeView(view);
            MethodCollector.o(2183);
            return;
        }
        super.removeView(view);
        this.r = true;
        MethodCollector.o(2183);
    }

    public final void removeViewAt(int i2) {
        MethodCollector.i(2185);
        if (this.r) {
            this.f36566d.removeViewAt(i2);
            MethodCollector.o(2185);
            return;
        }
        super.removeViewAt(i2);
        this.r = true;
        MethodCollector.o(2185);
    }

    public final void setOrientation(int i2) {
        if (i2 == 0) {
            this.f36566d.setOrientation(0);
            this.f36569g = true;
        } else if (i2 == 1) {
            this.f36566d.setOrientation(1);
            this.f36569g = false;
        }
    }

    public final void c(int i2) {
        this.q = i2;
        Iterator<AbstractC0888a> it = this.f36574l.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36569g) {
            return false;
        }
        a(motionEvent);
        if (motionEvent.getAction() == 0) {
            c(this.q);
        }
        if (motionEvent.getAction() == 1) {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(2171);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.f36574l = new ArrayList<>();
        if (this.f36566d == null) {
            AnonymousClass1 r1 = new LinearLayout(getContext()) {
                /* class com.bytedance.ies.xelement.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(21967);
                }

                /* access modifiers changed from: protected */
                public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                }

                /* access modifiers changed from: protected */
                public final void dispatchDraw(Canvas canvas) {
                    if (a.this.f36575m != null) {
                        a.this.f36575m.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    if (a.this.f36575m != null) {
                        a.this.f36575m.afterDispatchDraw(canvas);
                    }
                }

                {
                    MethodCollector.i(1577);
                    MethodCollector.o(1577);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i2, int i3) {
                    setMeasuredDimension(a.this.f36570h, a.this.f36571i);
                }

                /* access modifiers changed from: protected */
                public final boolean drawChild(Canvas canvas, View view, long j2) {
                    if (a.this.f36575m != null) {
                        a.this.f36575m.beforeDrawChild(canvas, view, j2);
                    }
                    boolean drawChild = super.drawChild(canvas, view, j2);
                    if (a.this.f36575m != null) {
                        a.this.f36575m.afterDrawChild(canvas, view, j2);
                    }
                    return drawChild;
                }
            };
            this.f36566d = r1;
            r1.setOrientation(1);
            this.f36566d.setWillNotDraw(true);
            AnonymousClass2 r12 = new HorizontalScrollView(getContext()) {
                /* class com.bytedance.ies.xelement.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(21968);
                }

                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (a.this.f36569g) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                }

                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!a.this.f36569g) {
                        return false;
                    }
                    a.this.a(motionEvent);
                    if (motionEvent.getAction() == 0) {
                        a aVar = a.this;
                        aVar.c(aVar.q);
                    }
                    if (motionEvent.getAction() == 1) {
                        a.this.a();
                    }
                    return super.onTouchEvent(motionEvent);
                }

                {
                    MethodCollector.i(1572);
                    MethodCollector.o(1572);
                }

                /* access modifiers changed from: protected */
                public final void onMeasure(int i2, int i3) {
                    MethodCollector.i(1573);
                    super.onMeasure(i2, i3);
                    MethodCollector.o(1573);
                }

                /* access modifiers changed from: protected */
                public final void onScrollChanged(int i2, int i3, int i4, int i5) {
                    super.onScrollChanged(i2, i3, i4, i5);
                    if (i2 != a.this.f36568f) {
                        if (!a.this.f36572j || a.this.f36573k) {
                            a.this.a(i2, i3, i4, i5);
                        } else {
                            a.this.f36573k = true;
                            a.this.b();
                        }
                        if (a.this.f36568f != getScrollX()) {
                            a.this.f36568f = getScrollX();
                        }
                    }
                }
            };
            this.f36567e = r12;
            r12.setHorizontalScrollBarEnabled(false);
            this.f36567e.setOverScrollMode(2);
            this.f36567e.setFadingEdgeLength(0);
            this.f36567e.setWillNotDraw(true);
            this.f36567e.addView(this.f36566d, new FrameLayout.LayoutParams(-1, -1));
            addView(this.f36567e, new FrameLayout.LayoutParams(-2, -2));
        }
        this.t = new b(this);
        MethodCollector.o(2171);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f36572j = true;
        } else if (motionEvent.getAction() == 1) {
            if (this.f36573k) {
                c();
            }
            this.f36573k = false;
            this.f36572j = false;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        MethodCollector.i(2178);
        if (this.r) {
            this.f36566d.addView(view, i2);
            MethodCollector.o(2178);
            return;
        }
        super.addView(view, i2);
        this.r = true;
        MethodCollector.o(2178);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(2180);
        if (this.r) {
            this.f36566d.addView(view, layoutParams);
            MethodCollector.o(2180);
            return;
        }
        super.addView(view, layoutParams);
        this.r = true;
        MethodCollector.o(2180);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        MethodCollector.i(2181);
        if (this.r) {
            this.f36566d.addView(view, i2, i3);
            MethodCollector.o(2181);
            return;
        }
        super.addView(view, i2, i3);
        this.r = true;
        MethodCollector.o(2181);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(2179);
        if (this.r) {
            this.f36566d.addView(view, i2, layoutParams);
            MethodCollector.o(2179);
            return;
        }
        super.addView(view, i2, layoutParams);
        this.r = true;
        MethodCollector.o(2179);
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f36566d.setPadding(i2, i3, i4, i5);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        c(this.q);
        Iterator<AbstractC0888a> it = this.f36574l.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, i4, i5);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (i3 != this.s) {
            if (!this.f36572j || this.f36573k) {
                a(i2, i3, i4, i5);
            } else {
                this.f36573k = true;
                b();
            }
            if (this.s != getScrollY()) {
                this.s = getScrollY();
            }
        }
    }
}
