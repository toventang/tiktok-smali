package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.h.v;
import androidx.customview.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class a extends ViewGroup {
    public static final C0919a t = new C0919a((byte) 0);
    private int A;

    /* renamed from: a  reason: collision with root package name */
    public View f37416a;

    /* renamed from: b  reason: collision with root package name */
    public View f37417b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f37418c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f37419d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f37420e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f37421f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f37422g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f37423h;

    /* renamed from: i  reason: collision with root package name */
    int f37424i = 300;

    /* renamed from: j  reason: collision with root package name */
    public int f37425j;

    /* renamed from: k  reason: collision with root package name */
    public int f37426k = 1;

    /* renamed from: l  reason: collision with root package name */
    public int f37427l;

    /* renamed from: m  reason: collision with root package name */
    public int f37428m;
    int n = 1;
    public androidx.customview.a.a o;
    androidx.core.h.d p;
    public b q;
    final a.AbstractC0038a r;
    final GestureDetector.OnGestureListener s;
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private boolean w;
    private float x;
    private float y = -1.0f;
    private float z = -1.0f;

    public interface b {
        static {
            Covode.recordClassIndex(22501);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(22499);
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.a$a  reason: collision with other inner class name */
    public static final class C0919a {
        static {
            Covode.recordClassIndex(22500);
        }

        private C0919a() {
        }

        public /* synthetic */ C0919a(byte b2) {
            this();
        }
    }

    public static final class c implements Interpolator {
        static {
            Covode.recordClassIndex(22502);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }

        c() {
        }
    }

    public final int getDragEdge() {
        return this.n;
    }

    public final int getMinFlingVelocity() {
        return this.f37424i;
    }

    public final void computeScroll() {
        androidx.customview.a.a aVar = this.o;
        if (aVar == null) {
            l.a();
        }
        if (aVar.c()) {
            v.c(this);
        }
    }

    private final int getMainOpenLeft() {
        int i2 = this.n;
        if (i2 == 1) {
            int i3 = this.f37418c.left;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            return i3 + view.getWidth();
        } else if (i2 == 2) {
            int i4 = this.f37418c.left;
            View view2 = this.f37417b;
            if (view2 == null) {
                l.a();
            }
            return i4 - view2.getWidth();
        } else if (i2 == 4 || i2 == 8) {
            return this.f37418c.left;
        } else {
            return 0;
        }
    }

    private final int getMainOpenTop() {
        int i2 = this.n;
        if (i2 == 1 || i2 == 2) {
            return this.f37418c.top;
        }
        if (i2 == 4) {
            int i3 = this.f37418c.top;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            return i3 + view.getHeight();
        } else if (i2 != 8) {
            return 0;
        } else {
            int i4 = this.f37418c.top;
            View view2 = this.f37417b;
            if (view2 == null) {
                l.a();
            }
            return i4 - view2.getHeight();
        }
    }

    private final int getSecOpenLeft() {
        int i2;
        if (this.f37426k == 0 || (i2 = this.n) == 8 || i2 == 4) {
            return this.u.left;
        }
        if (i2 == 1) {
            int i3 = this.u.left;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            return i3 + view.getWidth();
        }
        int i4 = this.u.left;
        View view2 = this.f37417b;
        if (view2 == null) {
            l.a();
        }
        return i4 - view2.getWidth();
    }

    private final int getSecOpenTop() {
        int i2;
        if (this.f37426k == 0 || (i2 = this.n) == 1 || i2 == 2) {
            return this.u.top;
        }
        if (i2 == 4) {
            int i3 = this.u.top;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            return i3 + view.getHeight();
        }
        int i4 = this.u.top;
        View view2 = this.f37417b;
        if (view2 == null) {
            l.a();
        }
        return i4 - view2.getHeight();
    }

    public final int getHalfwayPivotHorizontal() {
        if (this.n == 1) {
            int i2 = this.f37418c.left;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            return i2 + (view.getWidth() / 2);
        }
        int i3 = this.f37418c.right;
        View view2 = this.f37417b;
        if (view2 == null) {
            l.a();
        }
        return i3 - (view2.getWidth() / 2);
    }

    public final int getHalfwayPivotVertical() {
        if (this.n == 4) {
            int i2 = this.f37418c.top;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            return i2 + (view.getHeight() / 2);
        }
        int i3 = this.f37418c.bottom;
        View view2 = this.f37417b;
        if (view2 == null) {
            l.a();
        }
        return i3 - (view2.getHeight() / 2);
    }

    public final int getClosestEdgeDistance() {
        int i2 = this.n;
        if (i2 == 1) {
            int i3 = this.f37418c.left;
            View view = this.f37417b;
            if (view == null) {
                l.a();
            }
            int width = i3 + view.getWidth();
            View view2 = this.f37416a;
            if (view2 == null) {
                l.a();
            }
            int left = view2.getLeft() - this.f37418c.left;
            View view3 = this.f37416a;
            if (view3 == null) {
                l.a();
            }
            return Math.min(left, width - view3.getLeft());
        } else if (i2 == 2) {
            int i4 = this.f37418c.right;
            View view4 = this.f37417b;
            if (view4 == null) {
                l.a();
            }
            int width2 = i4 - view4.getWidth();
            View view5 = this.f37416a;
            if (view5 == null) {
                l.a();
            }
            int right = view5.getRight() - width2;
            int i5 = this.f37418c.right;
            View view6 = this.f37416a;
            if (view6 == null) {
                l.a();
            }
            return Math.min(right, i5 - view6.getRight());
        } else if (i2 == 4) {
            int i6 = this.f37418c.top;
            View view7 = this.f37417b;
            if (view7 == null) {
                l.a();
            }
            int height = i6 + view7.getHeight();
            View view8 = this.f37416a;
            if (view8 == null) {
                l.a();
            }
            int bottom = view8.getBottom() - height;
            View view9 = this.f37416a;
            if (view9 == null) {
                l.a();
            }
            return Math.min(bottom, height - view9.getTop());
        } else if (i2 != 8) {
            return 0;
        } else {
            int i7 = this.f37418c.bottom;
            View view10 = this.f37417b;
            if (view10 == null) {
                l.a();
            }
            int height2 = i7 - view10.getHeight();
            int i8 = this.f37418c.bottom;
            View view11 = this.f37416a;
            if (view11 == null) {
                l.a();
            }
            int bottom2 = i8 - view11.getBottom();
            View view12 = this.f37416a;
            if (view12 == null) {
                l.a();
            }
            return Math.min(bottom2, view12.getBottom() - height2);
        }
    }

    public final void setDragEdge(int i2) {
        this.n = i2;
    }

    public final void setLockDrag(boolean z2) {
        this.f37423h = z2;
    }

    public final void setMinFlingVelocity(int i2) {
        this.f37424i = i2;
    }

    public final void setMode$x_element_reveal_view_release(int i2) {
        this.f37426k = i2;
    }

    public final void setSwipeListener(b bVar) {
        this.q = bVar;
    }

    public static final class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f37432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f37433b;

        static {
            Covode.recordClassIndex(22504);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f37433b = aVar;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            l.c(motionEvent, "");
            this.f37433b.f37422g = false;
            this.f37432a = false;
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.c(motionEvent, "");
            l.c(motionEvent2, "");
            this.f37433b.f37422g = true;
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            l.c(motionEvent, "");
            l.c(motionEvent2, "");
            boolean z2 = true;
            this.f37433b.f37422g = true;
            if (this.f37433b.getParent() != null) {
                if (!this.f37432a) {
                    if (this.f37433b.getClosestEdgeDistance() >= this.f37433b.f37420e) {
                        z = true;
                        this.f37432a = true;
                    } else {
                        z = false;
                    }
                    z2 = z;
                }
                this.f37433b.getParent().requestDisallowInterceptTouchEvent(z2);
            }
            return false;
        }
    }

    public final void a(View view) {
        l.c(view, "");
        View view2 = this.f37417b;
        if (view2 != null) {
            removeView(view2);
        }
        this.f37417b = view;
        addView(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.c(motionEvent, "");
        androidx.core.h.d dVar = this.p;
        if (dVar == null) {
            l.a();
        }
        dVar.a(motionEvent);
        androidx.customview.a.a aVar = this.o;
        if (aVar == null) {
            l.a();
        }
        aVar.b(motionEvent);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.c(context, "");
        MethodCollector.i(640);
        this.r = new d(this, context);
        this.s = new e(this);
        MethodCollector.o(640);
    }

    public final void a(boolean z2) {
        this.w = true;
        this.f37421f = false;
        if (z2) {
            this.f37425j = 3;
            androidx.customview.a.a aVar = this.o;
            if (aVar == null) {
                l.a();
            }
            View view = this.f37416a;
            if (view == null) {
                l.a();
            }
            aVar.a(view, this.f37419d.left, this.f37419d.top);
        } else {
            this.f37425j = 2;
            androidx.customview.a.a aVar2 = this.o;
            if (aVar2 == null) {
                l.a();
            }
            aVar2.b();
            View view2 = this.f37416a;
            if (view2 == null) {
                l.a();
            }
            view2.layout(this.f37419d.left, this.f37419d.top, this.f37419d.right, this.f37419d.bottom);
            View view3 = this.f37417b;
            if (view3 == null) {
                l.a();
            }
            view3.layout(this.v.left, this.v.top, this.v.right, this.v.bottom);
        }
        v.c(this);
    }

    public final void b(boolean z2) {
        this.w = false;
        this.f37421f = false;
        if (z2) {
            this.f37425j = 1;
            androidx.customview.a.a aVar = this.o;
            if (aVar == null) {
                l.a();
            }
            View view = this.f37416a;
            if (view == null) {
                l.a();
            }
            aVar.a(view, this.f37418c.left, this.f37418c.top);
        } else {
            this.f37425j = 0;
            androidx.customview.a.a aVar2 = this.o;
            if (aVar2 == null) {
                l.a();
            }
            aVar2.b();
            View view2 = this.f37416a;
            if (view2 == null) {
                l.a();
            }
            view2.layout(this.f37418c.left, this.f37418c.top, this.f37418c.right, this.f37418c.bottom);
            View view3 = this.f37417b;
            if (view3 == null) {
                l.a();
            }
            view3.layout(this.u.left, this.u.top, this.u.right, this.u.bottom);
        }
        v.c(this);
    }

    public static final class d extends a.AbstractC0038a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f37430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f37431b;

        static {
            Covode.recordClassIndex(22503);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
            if (r0.getLeft() == r5.f37430a.f37418c.left) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
            if (r0.getTop() == r5.f37430a.f37418c.top) goto L_0x0034;
         */
        @Override // androidx.customview.a.a.AbstractC0038a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r6) {
            /*
                r5 = this;
                super.a(r6)
                r2 = 0
                r4 = 1
                r1 = 2
                if (r6 == 0) goto L_0x000f
                if (r6 == r4) goto L_0x000b
            L_0x000a:
                return
            L_0x000b:
                com.bytedance.ies.xelement.reveal.a r3 = r5.f37430a
                r2 = 4
                goto L_0x0034
            L_0x000f:
                com.bytedance.ies.xelement.reveal.a r3 = r5.f37430a
                int r0 = r3.getDragEdge()
                if (r0 == r4) goto L_0x001f
                com.bytedance.ies.xelement.reveal.a r0 = r5.f37430a
                int r0 = r0.getDragEdge()
                if (r0 != r1) goto L_0x0037
            L_0x001f:
                com.bytedance.ies.xelement.reveal.a r0 = r5.f37430a
                android.view.View r0 = r0.f37416a
                if (r0 != 0) goto L_0x0028
                h.f.b.l.a()
            L_0x0028:
                int r1 = r0.getLeft()
                com.bytedance.ies.xelement.reveal.a r0 = r5.f37430a
                android.graphics.Rect r0 = r0.f37418c
                int r0 = r0.left
                if (r1 != r0) goto L_0x004d
            L_0x0034:
                r3.f37425j = r2
                goto L_0x000a
            L_0x0037:
                com.bytedance.ies.xelement.reveal.a r0 = r5.f37430a
                android.view.View r0 = r0.f37416a
                if (r0 != 0) goto L_0x0040
                h.f.b.l.a()
            L_0x0040:
                int r1 = r0.getTop()
                com.bytedance.ies.xelement.reveal.a r0 = r5.f37430a
                android.graphics.Rect r0 = r0.f37418c
                int r0 = r0.top
                if (r1 != r0) goto L_0x004d
                goto L_0x0034
            L_0x004d:
                r2 = 2
                goto L_0x0034
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.reveal.a.d.a(int):void");
        }

        d(a aVar, Context context) {
            this.f37430a = aVar;
            this.f37431b = context;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            l.c(view, "");
            this.f37430a.f37421f = false;
            if (this.f37430a.f37423h) {
                return false;
            }
            androidx.customview.a.a aVar = this.f37430a.o;
            if (aVar == null) {
                l.a();
            }
            View view2 = this.f37430a.f37416a;
            if (view2 == null) {
                l.a();
            }
            aVar.a(view2, i2);
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            l.c(view, "");
            int dragEdge = this.f37430a.getDragEdge();
            if (dragEdge == 1) {
                int i3 = this.f37430a.f37418c.left;
                View view2 = this.f37430a.f37417b;
                if (view2 == null) {
                    l.a();
                }
                return Math.max(Math.min(i2, i3 + view2.getWidth()), this.f37430a.f37418c.left);
            } else if (dragEdge != 2) {
                return view.getLeft();
            } else {
                int min = Math.min(i2, this.f37430a.f37418c.left);
                int i4 = this.f37430a.f37418c.left;
                View view3 = this.f37430a.f37417b;
                if (view3 == null) {
                    l.a();
                }
                return Math.max(min, i4 - view3.getWidth());
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2, int i3) {
            boolean z;
            boolean z2;
            boolean z3;
            super.a(i2, i3);
            if (!this.f37430a.f37423h) {
                boolean z4 = false;
                if (this.f37430a.getDragEdge() == 2 && i2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f37430a.getDragEdge() == 1 && i2 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f37430a.getDragEdge() == 8 && i2 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f37430a.getDragEdge() == 4 && i2 == 8) {
                    z4 = true;
                }
                if (z || z2 || z3 || z4) {
                    androidx.customview.a.a aVar = this.f37430a.o;
                    if (aVar == null) {
                        l.a();
                    }
                    View view = this.f37430a.f37416a;
                    if (view == null) {
                        l.a();
                    }
                    aVar.a(view, i3);
                }
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            l.c(view, "");
            int dragEdge = this.f37430a.getDragEdge();
            if (dragEdge == 4) {
                int i4 = this.f37430a.f37418c.top;
                View view2 = this.f37430a.f37417b;
                if (view2 == null) {
                    l.a();
                }
                return Math.max(Math.min(i2, i4 + view2.getHeight()), this.f37430a.f37418c.top);
            } else if (dragEdge != 8) {
                return view.getTop();
            } else {
                int min = Math.min(i2, this.f37430a.f37418c.top);
                int i5 = this.f37430a.f37418c.top;
                View view3 = this.f37430a.f37417b;
                if (view3 == null) {
                    l.a();
                }
                return Math.max(min, i5 - view3.getHeight());
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            boolean z;
            boolean z2;
            boolean z3;
            l.c(view, "");
            int i2 = (int) f2;
            boolean z4 = false;
            if (com.bytedance.ies.xelement.reveal.a.a.a(this.f37431b, i2) >= this.f37430a.getMinFlingVelocity()) {
                z = true;
            } else {
                z = false;
            }
            if (com.bytedance.ies.xelement.reveal.a.a.a(this.f37431b, i2) <= (-this.f37430a.getMinFlingVelocity())) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = (int) f3;
            if (com.bytedance.ies.xelement.reveal.a.a.a(this.f37431b, i3) <= (-this.f37430a.getMinFlingVelocity())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (com.bytedance.ies.xelement.reveal.a.a.a(this.f37431b, i3) >= this.f37430a.getMinFlingVelocity()) {
                z4 = true;
            }
            int halfwayPivotHorizontal = this.f37430a.getHalfwayPivotHorizontal();
            int halfwayPivotVertical = this.f37430a.getHalfwayPivotVertical();
            int dragEdge = this.f37430a.getDragEdge();
            if (dragEdge != 1) {
                if (dragEdge != 2) {
                    if (dragEdge != 4) {
                        if (dragEdge == 8) {
                            if (z3) {
                                this.f37430a.a(true);
                                return;
                            } else if (!z4) {
                                View view2 = this.f37430a.f37416a;
                                if (view2 == null) {
                                    l.a();
                                }
                                if (view2.getBottom() < halfwayPivotVertical) {
                                    this.f37430a.a(true);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!z3) {
                        if (z4) {
                            this.f37430a.a(true);
                            return;
                        }
                        View view3 = this.f37430a.f37416a;
                        if (view3 == null) {
                            l.a();
                        }
                        if (view3.getTop() >= halfwayPivotVertical) {
                            this.f37430a.a(true);
                            return;
                        }
                    }
                } else if (!z) {
                    if (z2) {
                        this.f37430a.a(true);
                        return;
                    }
                    View view4 = this.f37430a.f37416a;
                    if (view4 == null) {
                        l.a();
                    }
                    if (view4.getRight() < halfwayPivotHorizontal) {
                        this.f37430a.a(true);
                        return;
                    } else {
                        this.f37430a.b(true);
                        return;
                    }
                }
            } else if (z) {
                this.f37430a.a(true);
                return;
            } else if (!z2) {
                View view5 = this.f37430a.f37416a;
                if (view5 == null) {
                    l.a();
                }
                if (view5.getLeft() >= halfwayPivotHorizontal) {
                    this.f37430a.a(true);
                    return;
                }
            }
            this.f37430a.b(true);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0167  */
        @Override // androidx.customview.a.a.AbstractC0038a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r5, int r6, int r7, int r8, int r9) {
            /*
            // Method dump skipped, instructions count: 408
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.reveal.a.d.a(android.view.View, int, int, int, int):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.reveal.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (getChildCount() >= 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int childCount = getChildCount();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                measureChild(childAt, i2, i3);
                l.a((Object) childAt, "");
                i4 = Math.max(childAt.getMeasuredWidth(), i4);
                i5 = Math.max(childAt.getMeasuredHeight(), i5);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, mode);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, mode2);
            int size = View.MeasureSpec.getSize(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                l.a((Object) childAt2, "");
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        childAt2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        childAt2.setMinimumWidth(size);
                    }
                }
                measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
                i4 = Math.max(childAt2.getMeasuredWidth(), i4);
                i5 = Math.max(childAt2.getMeasuredHeight(), i5);
            }
            int paddingLeft = i4 + getPaddingLeft() + getPaddingRight();
            int paddingTop = i5 + getPaddingTop() + getPaddingBottom();
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingLeft = size;
                }
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(paddingLeft, size);
                } else {
                    size = paddingLeft;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingTop = size2;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(paddingTop, size2);
                } else {
                    size2 = paddingTop;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int min;
        int min2;
        int min3;
        int min4;
        boolean z3;
        boolean z4;
        int i6 = 0;
        this.f37421f = false;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            int paddingLeft = getPaddingLeft();
            int max = Math.max((i4 - getPaddingRight()) - i2, i6);
            int paddingTop = getPaddingTop();
            int max2 = Math.max((i5 - getPaddingBottom()) - i3, i6);
            l.a((Object) childAt, "");
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.height == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (layoutParams.width == -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3) {
                    measuredHeight = max2 - paddingTop;
                    if (layoutParams == null) {
                        l.a();
                    }
                    layoutParams.height = measuredHeight;
                }
                if (z4) {
                    measuredWidth = max - paddingLeft;
                    if (layoutParams == null) {
                        l.a();
                    }
                    layoutParams.width = measuredWidth;
                }
            }
            int i8 = this.n;
            if (i8 != 1) {
                if (i8 == 2) {
                    min = Math.max(((i4 - measuredWidth) - getPaddingRight()) - i2, paddingLeft);
                    min2 = Math.min(getPaddingTop(), max2);
                    min3 = Math.max((i4 - getPaddingRight()) - i2, paddingLeft);
                    min4 = Math.min(measuredHeight + getPaddingTop(), max2);
                } else if (i8 != 4) {
                    if (i8 != 8) {
                        min = 0;
                        min2 = 0;
                        min3 = 0;
                        min4 = 0;
                    } else {
                        min = Math.min(getPaddingLeft(), max);
                        min2 = Math.max(((i5 - measuredHeight) - getPaddingBottom()) - i3, paddingTop);
                        min3 = Math.min(measuredWidth + getPaddingLeft(), max);
                        min4 = Math.max((i5 - getPaddingBottom()) - i3, paddingTop);
                    }
                }
                childAt.layout(min, min2, min3, min4);
                i7++;
                i6 = 0;
            }
            min = Math.min(getPaddingLeft(), max);
            min2 = Math.min(getPaddingTop(), max2);
            min3 = Math.min(measuredWidth + getPaddingLeft(), max);
            min4 = Math.min(measuredHeight + getPaddingTop(), max2);
            childAt.layout(min, min2, min3, min4);
            i7++;
            i6 = 0;
        }
        if (this.f37426k == 1) {
            int i9 = this.n;
            if (i9 == 1) {
                View view = this.f37417b;
                if (view == null) {
                    l.a();
                }
                View view2 = this.f37417b;
                if (view2 == null) {
                    l.a();
                }
                view.offsetLeftAndRight(-view2.getWidth());
            } else if (i9 == 2) {
                View view3 = this.f37417b;
                if (view3 == null) {
                    l.a();
                }
                View view4 = this.f37417b;
                if (view4 == null) {
                    l.a();
                }
                view3.offsetLeftAndRight(view4.getWidth());
            } else if (i9 == 4) {
                View view5 = this.f37417b;
                if (view5 == null) {
                    l.a();
                }
                View view6 = this.f37417b;
                if (view6 == null) {
                    l.a();
                }
                view5.offsetTopAndBottom(-view6.getHeight());
            } else if (i9 == 8) {
                View view7 = this.f37417b;
                if (view7 == null) {
                    l.a();
                }
                View view8 = this.f37417b;
                if (view8 == null) {
                    l.a();
                }
                view7.offsetTopAndBottom(view8.getHeight());
            }
        }
        Rect rect = this.f37418c;
        View view9 = this.f37416a;
        if (view9 == null) {
            l.a();
        }
        int left = view9.getLeft();
        View view10 = this.f37416a;
        if (view10 == null) {
            l.a();
        }
        int top = view10.getTop();
        View view11 = this.f37416a;
        if (view11 == null) {
            l.a();
        }
        int right = view11.getRight();
        View view12 = this.f37416a;
        if (view12 == null) {
            l.a();
        }
        rect.set(left, top, right, view12.getBottom());
        Rect rect2 = this.u;
        View view13 = this.f37417b;
        if (view13 == null) {
            l.a();
        }
        int left2 = view13.getLeft();
        View view14 = this.f37417b;
        if (view14 == null) {
            l.a();
        }
        int top2 = view14.getTop();
        View view15 = this.f37417b;
        if (view15 == null) {
            l.a();
        }
        int right2 = view15.getRight();
        View view16 = this.f37417b;
        if (view16 == null) {
            l.a();
        }
        rect2.set(left2, top2, right2, view16.getBottom());
        Rect rect3 = this.f37419d;
        int mainOpenLeft = getMainOpenLeft();
        int mainOpenTop = getMainOpenTop();
        int mainOpenLeft2 = getMainOpenLeft();
        View view17 = this.f37416a;
        if (view17 == null) {
            l.a();
        }
        int width = mainOpenLeft2 + view17.getWidth();
        int mainOpenTop2 = getMainOpenTop();
        View view18 = this.f37416a;
        if (view18 == null) {
            l.a();
        }
        rect3.set(mainOpenLeft, mainOpenTop, width, mainOpenTop2 + view18.getHeight());
        Rect rect4 = this.v;
        int secOpenLeft = getSecOpenLeft();
        int secOpenTop = getSecOpenTop();
        int secOpenLeft2 = getSecOpenLeft();
        View view19 = this.f37417b;
        if (view19 == null) {
            l.a();
        }
        int width2 = secOpenLeft2 + view19.getWidth();
        int secOpenTop2 = getSecOpenTop();
        View view20 = this.f37417b;
        if (view20 == null) {
            l.a();
        }
        rect4.set(secOpenLeft, secOpenTop, width2, secOpenTop2 + view20.getHeight());
        if (this.w) {
            a(false);
        } else {
            b(false);
        }
        View view21 = this.f37416a;
        if (view21 == null) {
            l.a();
        }
        this.f37427l = view21.getLeft();
        View view22 = this.f37416a;
        if (view22 == null) {
            l.a();
        }
        this.f37428m = view22.getTop();
        this.A++;
    }
}
