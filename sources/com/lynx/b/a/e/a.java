package com.lynx.b.a.e;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.lynx.b.a.a.d;
import com.lynx.b.a.a.j;
import com.lynx.b.a.h.b;

public final class a implements ValueAnimator.AnimatorUpdateListener, d, com.lynx.b.a.g.a {

    /* renamed from: a  reason: collision with root package name */
    protected View f55178a;

    /* renamed from: b  reason: collision with root package name */
    protected View f55179b;

    /* renamed from: c  reason: collision with root package name */
    protected View f55180c;

    /* renamed from: d  reason: collision with root package name */
    protected View f55181d;

    /* renamed from: e  reason: collision with root package name */
    protected View f55182e;

    /* renamed from: f  reason: collision with root package name */
    protected int f55183f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f55184g = true;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f55185h = true;

    /* renamed from: i  reason: collision with root package name */
    protected d f55186i = new d();

    static {
        Covode.recordClassIndex(34600);
    }

    @Override // com.lynx.b.a.a.d
    public final View a() {
        return this.f55178a;
    }

    @Override // com.lynx.b.a.a.d
    public final View b() {
        return this.f55180c;
    }

    @Override // com.lynx.b.a.a.d
    public final boolean c() {
        if (!this.f55184g || !this.f55186i.a(this.f55178a)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.b.a.a.d
    public final boolean d() {
        if (!this.f55185h || !this.f55186i.b(this.f55178a)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.b.a.a.d
    public final void a(boolean z) {
        this.f55186i.f55189c = z;
    }

    @Override // com.lynx.b.a.a.d
    public final void a(j jVar) {
        if (jVar instanceof d) {
            this.f55186i = (d) jVar;
        } else {
            this.f55186i.f55188b = jVar;
        }
    }

    public a(View view) {
        this.f55180c = view;
        this.f55179b = view;
        this.f55178a = view;
    }

    @Override // com.lynx.b.a.a.d
    public final ValueAnimator.AnimatorUpdateListener a(int i2) {
        View view = this.f55180c;
        if (view == null || i2 == 0) {
            return null;
        }
        if (i2 < 0) {
            if (!b.a(view, 1)) {
                return null;
            }
        } else if (!b.a(this.f55180c, -1)) {
            return null;
        }
        this.f55183f = i2;
        return this;
    }

    @Override // com.lynx.b.a.a.d
    public final void a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset((float) (-this.f55178a.getLeft()), (float) (-this.f55178a.getTop()));
        View view = this.f55180c;
        View view2 = this.f55178a;
        if (view != view2) {
            this.f55180c = a(view2, pointF, view);
        }
        if (this.f55180c == this.f55178a) {
            this.f55186i.f55187a = null;
        } else {
            this.f55186i.f55187a = pointF;
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = ((float) (intValue - this.f55183f)) * this.f55180c.getScaleY();
            View view = this.f55180c;
            if (view instanceof AbsListView) {
                int i2 = Build.VERSION.SDK_INT;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.f55183f = intValue;
    }

    @Override // com.lynx.b.a.g.a
    public final void a(boolean z, boolean z2) {
        this.f55184g = z;
        this.f55185h = z2;
    }

    private View a(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (b.a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && b.b(childAt)) {
                        return childAt;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        View a2 = a(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a2;
                    }
                }
            }
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.lynx.b.a.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 1
            r5 = -1
            r2 = 0
            r4 = 0
            if (r8 == r5) goto L_0x0062
            android.view.View r0 = r6.f55179b
            android.view.View r1 = r0.findViewById(r8)
            if (r1 == 0) goto L_0x0062
            if (r7 <= 0) goto L_0x0057
            float r0 = (float) r7
            r1.setTranslationY(r0)
            r3 = 1
        L_0x0015:
            if (r9 == r5) goto L_0x004e
            android.view.View r0 = r6.f55179b
            android.view.View r1 = r0.findViewById(r9)
            if (r1 == 0) goto L_0x004e
            if (r7 >= 0) goto L_0x0043
            float r0 = (float) r7
            r1.setTranslationY(r0)
        L_0x0025:
            android.view.View r0 = r6.f55179b
            r0.setTranslationY(r4)
        L_0x002a:
            android.view.View r1 = r6.f55181d
            if (r1 == 0) goto L_0x0036
            int r0 = java.lang.Math.max(r2, r7)
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x0036:
            android.view.View r1 = r6.f55182e
            if (r1 == 0) goto L_0x0042
            int r0 = java.lang.Math.min(r2, r7)
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x0042:
            return
        L_0x0043:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r1.setTranslationY(r4)
        L_0x004e:
            if (r3 != 0) goto L_0x0025
            android.view.View r1 = r6.f55179b
            float r0 = (float) r7
            r1.setTranslationY(r0)
            goto L_0x002a
        L_0x0057:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0062
            r1.setTranslationY(r4)
        L_0x0062:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.e.a.a(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r3 == null) goto L_0x0058;
     */
    @Override // com.lynx.b.a.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.lynx.b.a.a.h r14, android.view.View r15, android.view.View r16) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.e.a.a(com.lynx.b.a.a.h, android.view.View, android.view.View):void");
    }
}
