package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import androidx.customview.a.a;
import com.bytedance.covode.number.Covode;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    androidx.customview.a.a f52243a;

    /* renamed from: b  reason: collision with root package name */
    public a f52244b;

    /* renamed from: c  reason: collision with root package name */
    public int f52245c = 2;

    /* renamed from: d  reason: collision with root package name */
    float f52246d = 0.5f;

    /* renamed from: e  reason: collision with root package name */
    public float f52247e;

    /* renamed from: f  reason: collision with root package name */
    public float f52248f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52249g;

    /* renamed from: h  reason: collision with root package name */
    private float f52250h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52251i;

    /* renamed from: j  reason: collision with root package name */
    private final a.AbstractC0038a f52252j = new a.AbstractC0038a() {
        /* class com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1 */

        /* renamed from: b  reason: collision with root package name */
        private int f52254b;

        /* renamed from: c  reason: collision with root package name */
        private int f52255c = -1;

        static {
            Covode.recordClassIndex(32449);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            if (SwipeDismissBehavior.this.f52244b != null) {
                SwipeDismissBehavior.this.f52244b.a(i2);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            if (this.f52255c != -1 || !SwipeDismissBehavior.this.a(view)) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2) {
            this.f52255c = i2;
            this.f52254b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            boolean z;
            int i3;
            int i4;
            int i5;
            if (v.e(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SwipeDismissBehavior.this.f52245c == 0) {
                if (z) {
                    i3 = this.f52254b - view.getWidth();
                    i5 = this.f52254b;
                } else {
                    i3 = this.f52254b;
                    i4 = view.getWidth();
                    i5 = i4 + i3;
                }
            } else if (SwipeDismissBehavior.this.f52245c != 1) {
                i3 = this.f52254b - view.getWidth();
                i5 = view.getWidth() + this.f52254b;
            } else if (z) {
                i3 = this.f52254b;
                i4 = view.getWidth();
                i5 = i4 + i3;
            } else {
                i3 = this.f52254b - view.getWidth();
                i5 = this.f52254b;
            }
            return Math.min(Math.max(i3, i2), i5);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            return view.getTop();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
            if (java.lang.Math.abs(r2) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f52253a.f52246d)) goto L_0x001c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
        @Override // androidx.customview.a.a.AbstractC0038a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.a(android.view.View, float, float):void");
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            float width = ((float) this.f52254b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f52247e);
            float width2 = ((float) this.f52254b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f52248f);
            float f2 = (float) i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(1.0f - ((f2 - width) / (width2 - width))));
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(32450);
        }

        void a(int i2);

        void a(View view);
    }

    static {
        Covode.recordClassIndex(32448);
    }

    public boolean a(View view) {
        return true;
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f52257b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f52258c;

        static {
            Covode.recordClassIndex(32451);
        }

        public final void run() {
            if (SwipeDismissBehavior.this.f52243a != null && SwipeDismissBehavior.this.f52243a.c()) {
                v.a(this.f52257b, this);
            } else if (this.f52258c && SwipeDismissBehavior.this.f52244b != null) {
                SwipeDismissBehavior.this.f52244b.a(this.f52257b);
            }
        }

        b(View view, boolean z) {
            this.f52257b = view;
            this.f52258c = z;
        }
    }

    public static float a(float f2) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        androidx.customview.a.a aVar = this.f52243a;
        if (aVar == null) {
            return false;
        }
        aVar.b(motionEvent);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        androidx.customview.a.a a2;
        boolean z = this.f52249g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f52249g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f52249g = false;
        }
        if (!z) {
            return false;
        }
        if (this.f52243a == null) {
            if (this.f52251i) {
                a2 = androidx.customview.a.a.a(coordinatorLayout, this.f52250h, this.f52252j);
            } else {
                a2 = androidx.customview.a.a.a(coordinatorLayout, this.f52252j);
            }
            this.f52243a = a2;
        }
        return this.f52243a.a(motionEvent);
    }
}
