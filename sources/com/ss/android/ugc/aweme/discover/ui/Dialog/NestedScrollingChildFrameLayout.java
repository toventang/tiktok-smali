package com.ss.android.ugc.aweme.discover.ui.Dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.j;
import androidx.core.h.m;
import androidx.core.h.n;
import androidx.core.h.t;
import androidx.core.h.y;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NestedScrollingChildFrameLayout extends FrameLayout implements j, t {

    /* renamed from: a  reason: collision with root package name */
    private int f82076a;

    /* renamed from: b  reason: collision with root package name */
    private int f82077b = -1;

    /* renamed from: c  reason: collision with root package name */
    private float f82078c;

    /* renamed from: d  reason: collision with root package name */
    private float f82079d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f82080e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    private final int[] f82081f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private boolean f82082g;

    /* renamed from: h  reason: collision with root package name */
    private final m f82083h = new m(this);

    /* renamed from: i  reason: collision with root package name */
    private a f82084i;

    /* renamed from: j  reason: collision with root package name */
    private n f82085j;

    /* renamed from: k  reason: collision with root package name */
    private b f82086k = new b() {
        /* class com.ss.android.ugc.aweme.discover.ui.Dialog.NestedScrollingChildFrameLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(51078);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private boolean f82087l = false;

    /* renamed from: m  reason: collision with root package name */
    private int f82088m = 0;
    private boolean n = false;

    static {
        Covode.recordClassIndex(51077);
    }

    public b getiDispatchNestedPreFling() {
        return this.f82086k;
    }

    public boolean hasNestedScrollingParent() {
        return this.f82083h.a(0);
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return this.f82083h.f2548a;
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        this.f82083h.b(0);
    }

    private RecyclerView getScrollingView() {
        a aVar = this.f82084i;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    public int computeHorizontalScrollExtent() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeHorizontalScrollExtent();
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeHorizontalScrollOffset();
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeHorizontalScrollRange();
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeVerticalScrollExtent();
        return 0;
    }

    @Override // androidx.core.h.t
    public int computeVerticalScrollOffset() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeVerticalScrollOffset();
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (getScrollingView() == null) {
            return 0;
        }
        getScrollingView().computeVerticalScrollRange();
        return 0;
    }

    public void setGetScrollingView(a aVar) {
        this.f82084i = aVar;
    }

    public void setNestedScrollingParent(n nVar) {
        this.f82085j = nVar;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f82083h.a(z);
    }

    public boolean startNestedScroll(int i2) {
        return this.f82083h.a(i2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r3 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L_0x003a
            if (r3 == r2) goto L_0x002a
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x002a
        L_0x0010:
            boolean r0 = super.dispatchTouchEvent(r5)
            return r0
        L_0x0015:
            int r0 = r4.f82077b
            float r1 = a(r5, r0)
            float r0 = r4.f82078c
            float r0 = r0 - r1
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r4.f82076a
            if (r1 < r0) goto L_0x0010
            r4.f82087l = r2
            goto L_0x0010
        L_0x002a:
            boolean r0 = r4.f82087l
            if (r0 == 0) goto L_0x0035
            boolean r0 = r4.n
            if (r0 == 0) goto L_0x0035
            r4.stopNestedScroll()
        L_0x0035:
            r4.f82087l = r1
            r4.n = r1
            goto L_0x0010
        L_0x003a:
            r4.f82087l = r1
            int r0 = r5.getPointerId(r1)
            r4.f82077b = r0
            float r0 = a(r5, r0)
            r4.f82078c = r0
            com.ss.android.ugc.aweme.discover.ui.Dialog.a r0 = r4.f82084i
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0055
        L_0x0052:
            r4.n = r2
            goto L_0x0010
        L_0x0055:
            r2 = 0
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.Dialog.NestedScrollingChildFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r6 != 3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.Dialog.NestedScrollingChildFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private static float a(MotionEvent motionEvent, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(findPointerIndex);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return y.a((ViewGroup) this.f82085j, this, f2, f3);
    }

    public NestedScrollingChildFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2292);
        setNestedScrollingEnabled(true);
        this.f82076a = ViewConfiguration.get(context).getScaledTouchSlop();
        MethodCollector.o(2292);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f82083h.a(f2, f3, z);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f82083h.a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f82083h.a(i2, i3, i4, i5, iArr);
    }
}
