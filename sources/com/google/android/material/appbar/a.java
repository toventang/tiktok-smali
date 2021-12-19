package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public abstract class a<V extends View> extends c<V> {

    /* renamed from: a  reason: collision with root package name */
    private Runnable f52195a;

    /* renamed from: b  reason: collision with root package name */
    OverScroller f52196b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52197c;

    /* renamed from: d  reason: collision with root package name */
    private int f52198d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f52199e;

    /* renamed from: f  reason: collision with root package name */
    private int f52200f = -1;

    /* renamed from: g  reason: collision with root package name */
    private VelocityTracker f52201g;

    static {
        Covode.recordClassIndex(32437);
    }

    /* access modifiers changed from: package-private */
    public void b(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    public boolean c(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return c();
    }

    public a() {
    }

    private void d() {
        if (this.f52201g == null) {
            this.f52201g = VelocityTracker.obtain();
        }
    }

    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    class RunnableC1218a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final CoordinatorLayout f52203b;

        /* renamed from: c  reason: collision with root package name */
        private final V f52204c;

        static {
            Covode.recordClassIndex(32438);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.material.appbar.a */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.material.appbar.a */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            if (this.f52204c != null && a.this.f52196b != null) {
                if (a.this.f52196b.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.b(this.f52203b, this.f52204c, aVar.f52196b.getCurrY());
                    v.a(this.f52204c, this);
                    return;
                }
                a.this.b(this.f52203b, this.f52204c);
            }
        }

        RunnableC1218a(CoordinatorLayout coordinatorLayout, V v) {
            this.f52203b = coordinatorLayout;
            this.f52204c = v;
        }
    }

    /* access modifiers changed from: package-private */
    public int a(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int b(V v) {
        return -v.getHeight();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return a(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != 3) goto L_0x002e;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r9 != 3) goto L_0x002d;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r22, V r23, android.view.MotionEvent r24) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public int a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        int a2;
        int c2 = c();
        if (i3 == 0 || c2 < i3 || c2 > i4 || c2 == (a2 = androidx.core.b.a.a(i2, i3, i4))) {
            return 0;
        }
        b(a2);
        return c2 - a2;
    }

    /* access modifiers changed from: package-private */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return a(coordinatorLayout, v, b() - i2, i3, i4);
    }
}
