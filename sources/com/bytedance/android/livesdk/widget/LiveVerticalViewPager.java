package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveViewpagerSlideBlockSwitchSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class LiveVerticalViewPager extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f22508a = {16842931};
    private static final i an = new i();

    /* renamed from: g  reason: collision with root package name */
    static Field f22509g;

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f22510i = new Comparator<b>() {
        /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13280);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            return bVar.f22533b - bVar2.f22533b;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private static final Interpolator f22511j = new Interpolator() {
        /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(13281);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private boolean A;
    private boolean B;
    private boolean C;
    private int D = 1;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private int I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N = -1;
    private VelocityTracker O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private androidx.core.widget.d T;
    private androidx.core.widget.d U;
    private boolean V = false;
    private boolean W = false;
    private boolean aa = true;
    private boolean ab = false;
    private boolean ac;
    private int ad;
    private ViewPager.e ae;
    private ViewPager.e af;
    private e ag;
    private ViewPager.f ah;
    private Method ai;
    private f aj;
    private boolean ak = false;
    private int al;
    private ArrayList<View> am;
    private final Runnable ao = new Runnable() {
        /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(13282);
        }

        public final void run() {
            LiveVerticalViewPager.this.setScrollState(0);
            LiveVerticalViewPager.this.b();
        }
    };
    private int ap = 0;

    /* renamed from: b  reason: collision with root package name */
    public PagerAdapter f22512b;

    /* renamed from: c  reason: collision with root package name */
    public int f22513c;

    /* renamed from: d  reason: collision with root package name */
    public Scroller f22514d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22515e;

    /* renamed from: f  reason: collision with root package name */
    public g f22516f = null;

    /* renamed from: h  reason: collision with root package name */
    private int f22517h;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<b> f22518k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final b f22519l = new b();

    /* renamed from: m  reason: collision with root package name */
    private final Rect f22520m = new Rect();
    private int n = -1;
    private Parcelable o = null;
    private ClassLoader p = null;
    private boolean q;
    private h r;
    private int s;
    private Drawable t;
    private int u;
    private int v;
    private float w = -3.4028235E38f;
    private float x = Float.MAX_VALUE;
    private int y;
    private int z;

    interface a {
        static {
            Covode.recordClassIndex(13289);
        }
    }

    interface e {
        static {
            Covode.recordClassIndex(13293);
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(13294);
        }

        boolean a();
    }

    public interface g {
        static {
            Covode.recordClassIndex(13295);
        }

        void a();

        void b();
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f22532a;

        /* renamed from: b  reason: collision with root package name */
        int f22533b;

        /* renamed from: c  reason: collision with root package name */
        boolean f22534c;

        /* renamed from: d  reason: collision with root package name */
        float f22535d;

        /* renamed from: e  reason: collision with root package name */
        float f22536e;

        static {
            Covode.recordClassIndex(13290);
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class i implements Comparator<View> {
        static {
            Covode.recordClassIndex(13297);
        }

        i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.f22537a == cVar2.f22537a) {
                return cVar.f22541e - cVar2.f22541e;
            }
            if (cVar.f22537a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f22512b;
    }

    public int getCurrentItem() {
        return this.f22513c;
    }

    public int getOffscreenPageLimit() {
        return this.D;
    }

    public int getPageMargin() {
        return this.s;
    }

    public final void a(int i2, boolean z2) {
        this.C = false;
        a(i2, z2, false);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.f22512b;
        boolean z4 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f22513c != i2 || this.f22518k.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f22512b.getCount()) {
                i2 = this.f22512b.getCount() - 1;
            }
            int i4 = this.D;
            int i5 = this.f22513c;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f22518k.size(); i6++) {
                    this.f22518k.get(i6).f22534c = true;
                }
            }
            if (this.f22513c != i2) {
                z4 = true;
            }
            if (this.aa) {
                this.f22513c = i2;
                if (z4) {
                    ViewPager.e eVar = this.ae;
                    if (eVar != null) {
                        eVar.onPageSelected(i2);
                    }
                    ViewPager.e eVar2 = this.af;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i2);
                    }
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        b b2 = b(i2);
        int clientHeight = b2 != null ? (int) (((float) getClientHeight()) * Math.max(this.w, Math.min(b2.f22536e, this.x))) : 0;
        if (z2) {
            a(clientHeight, i3);
            if (z3) {
                ViewPager.e eVar = this.ae;
                if (eVar != null) {
                    eVar.onPageSelected(i2);
                }
                ViewPager.e eVar2 = this.af;
                if (eVar2 != null) {
                    eVar2.onPageSelected(i2);
                    return;
                }
                return;
            }
            return;
        }
        if (z3) {
            ViewPager.e eVar3 = this.ae;
            if (eVar3 != null) {
                eVar3.onPageSelected(i2);
            }
            ViewPager.e eVar4 = this.af;
            if (eVar4 != null) {
                eVar4.onPageSelected(i2);
            }
        }
        a(false);
        scrollTo(0, clientHeight);
        c(clientHeight);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int count = this.f22512b.getCount();
        this.f22517h = count;
        boolean z2 = this.f22518k.size() < (this.D * 2) + 1 && this.f22518k.size() < count;
        int i2 = this.f22513c;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f22518k.size()) {
            b bVar = this.f22518k.get(i3);
            int itemPosition = this.f22512b.getItemPosition(bVar.f22532a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f22518k.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f22512b.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f22512b.destroyItem((ViewGroup) this, bVar.f22533b, bVar.f22532a);
                    if (this.f22513c == bVar.f22533b) {
                        i2 = Math.max(0, Math.min(this.f22513c, count - 1));
                    }
                } else if (bVar.f22533b != itemPosition) {
                    if (bVar.f22533b == this.f22513c) {
                        i2 = itemPosition;
                    }
                    bVar.f22533b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f22512b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f22518k, f22510i);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.f22537a) {
                    cVar.f22539c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int count = this.f22512b.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.s) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i3 = bVar2.f22533b;
            if (i3 < bVar.f22533b) {
                float f3 = bVar2.f22536e + bVar2.f22535d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.f22533b && i5 < this.f22518k.size()) {
                    b bVar5 = this.f22518k.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 > bVar4.f22533b && i5 < this.f22518k.size() - 1) {
                            i5++;
                            bVar5 = this.f22518k.get(i5);
                        }
                    }
                    while (i4 < bVar4.f22533b) {
                        f3 += this.f22512b.getPageWidth(i4) + f2;
                        i4++;
                    }
                    bVar4.f22536e = f3;
                    f3 += bVar4.f22535d + f2;
                    i4++;
                }
            } else if (i3 > bVar.f22533b) {
                int size = this.f22518k.size() - 1;
                float f4 = bVar2.f22536e;
                int i6 = i3 - 1;
                while (i6 >= bVar.f22533b && size >= 0) {
                    b bVar6 = this.f22518k.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i6 < bVar3.f22533b && size > 0) {
                            size--;
                            bVar6 = this.f22518k.get(size);
                        }
                    }
                    while (i6 > bVar3.f22533b) {
                        f4 -= this.f22512b.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= bVar3.f22535d + f2;
                    bVar3.f22536e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.f22518k.size();
        float f5 = bVar.f22536e;
        int i7 = bVar.f22533b - 1;
        this.w = bVar.f22533b == 0 ? bVar.f22536e : -3.4028235E38f;
        int i8 = count - 1;
        this.x = bVar.f22533b == i8 ? (bVar.f22536e + bVar.f22535d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            b bVar7 = this.f22518k.get(i9);
            while (i7 > bVar7.f22533b) {
                f5 -= this.f22512b.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= bVar7.f22535d + f2;
            bVar7.f22536e = f5;
            if (bVar7.f22533b == 0) {
                this.w = f5;
            }
            i9--;
            i7--;
        }
        float f6 = bVar.f22536e + bVar.f22535d + f2;
        int i10 = bVar.f22533b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            b bVar8 = this.f22518k.get(i11);
            while (i10 < bVar8.f22533b) {
                f6 += this.f22512b.getPageWidth(i10) + f2;
                i10++;
            }
            if (bVar8.f22533b == i8) {
                this.x = (bVar8.f22535d + f6) - 1.0f;
            }
            bVar8.f22536e = f6;
            f6 += bVar8.f22535d + f2;
            i11++;
            i10++;
        }
        this.ab = false;
    }

    private void a(boolean z2) {
        boolean z3;
        if (this.ap == 2) {
            z3 = true;
            setScrollingCacheEnabled(false);
            if (!this.f22514d.isFinished()) {
                this.f22514d.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f22514d.getCurrX();
                int currY = this.f22514d.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        c(currY);
                    }
                }
            } else if (this.f22514d.getCurrY() != getScrollY() && LiveViewpagerSlideBlockSwitchSetting.INSTANCE.getValue()) {
                com.bytedance.android.live.core.c.a.a(6, "slide_log", "DmtViewPager completeScroll mScroller.getCurrY() != getScrollY() " + (this.f22514d.getCurrY() - getScrollY()));
                scrollTo(this.f22514d.getCurrX(), this.f22514d.getCurrY());
                com.bytedance.android.livesdk.util.rxutils.g.a(TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new z<Long>() {
                    /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass5 */

                    /* renamed from: a  reason: collision with root package name */
                    f.a.b.b f22524a;

                    /* renamed from: b  reason: collision with root package name */
                    int f22525b = 2;

                    static {
                        Covode.recordClassIndex(13284);
                    }

                    @Override // f.a.z
                    public final void onComplete() {
                    }

                    @Override // f.a.z
                    public final void onError(Throwable th) {
                    }

                    @Override // f.a.z
                    public final void onSubscribe(f.a.b.b bVar) {
                        this.f22524a = bVar;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.z
                    public final /* synthetic */ void onNext(Long l2) {
                        com.bytedance.android.live.core.c.a.a(6, "slide_log", "scroll " + (LiveVerticalViewPager.this.f22514d.getCurrY() - LiveVerticalViewPager.this.getScrollY()));
                        if (LiveVerticalViewPager.this.f22514d.getCurrY() == LiveVerticalViewPager.this.getScrollY()) {
                            this.f22525b--;
                            f.a.b.b bVar = this.f22524a;
                            if (bVar != null && !bVar.isDisposed() && this.f22525b <= 0) {
                                com.bytedance.android.live.core.c.a.a(6, "slide_log", "dispose " + LiveVerticalViewPager.this.f22514d.getCurrY());
                                this.f22524a.dispose();
                                return;
                            }
                            return;
                        }
                        LiveVerticalViewPager liveVerticalViewPager = LiveVerticalViewPager.this;
                        liveVerticalViewPager.scrollTo(liveVerticalViewPager.f22514d.getCurrX(), LiveVerticalViewPager.this.f22514d.getCurrY());
                    }
                });
            }
        } else {
            z3 = false;
        }
        this.C = false;
        for (int i2 = 0; i2 < this.f22518k.size(); i2++) {
            b bVar = this.f22518k.get(i2);
            if (bVar.f22534c) {
                bVar.f22534c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            v.a(this, this.ao);
        } else {
            this.ao.run();
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i4 + scrollY;
                if (i6 >= childAt.getTop() && i6 < childAt.getBottom() && (i5 = i3 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() && a(childAt, true, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z2 || !view.canScrollVertically(-i2)) {
            return false;
        }
        return true;
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.K = motionEvent.getY(i2);
            this.N = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static class c extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22537a;

        /* renamed from: b  reason: collision with root package name */
        public int f22538b;

        /* renamed from: c  reason: collision with root package name */
        float f22539c;

        /* renamed from: d  reason: collision with root package name */
        boolean f22540d;

        /* renamed from: e  reason: collision with root package name */
        int f22541e;

        /* renamed from: f  reason: collision with root package name */
        int f22542f;

        static {
            Covode.recordClassIndex(13291);
        }

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LiveVerticalViewPager.f22508a);
            this.f22538b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class h extends DataSetObserver {
        static {
            Covode.recordClassIndex(13296);
        }

        public final void onChanged() {
            LiveVerticalViewPager.this.a();
        }

        public final void onInvalidated() {
            LiveVerticalViewPager.this.a();
        }

        private h() {
        }

        /* synthetic */ h(LiveVerticalViewPager liveVerticalViewPager, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a(this.f22513c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aa = true;
    }

    private void f() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private void h() {
        this.E = false;
        this.F = false;
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O = null;
        }
    }

    private boolean i() {
        int i2 = this.f22513c;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = androidx.core.d.e.a(new androidx.core.d.f<SavedState>() {
            /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13288);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.d.f
            public final /* bridge */ /* synthetic */ SavedState[] a(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.d.f
            public final /* synthetic */ SavedState a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });

        /* renamed from: a  reason: collision with root package name */
        int f22529a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f22530b;

        /* renamed from: c  reason: collision with root package name */
        ClassLoader f22531c;

        static {
            Covode.recordClassIndex(13287);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f22529a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f22529a);
            parcel.writeParcelable(this.f22530b, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f22529a = parcel.readInt();
            this.f22530b = parcel.readParcelable(classLoader);
            this.f22531c = classLoader;
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(13292);
        }

        private boolean a() {
            if (LiveVerticalViewPager.this.f22512b == null || LiveVerticalViewPager.this.f22512b.getCount() <= 1) {
                return false;
            }
            return true;
        }

        d() {
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            androidx.core.h.a.f a2 = androidx.core.h.a.f.a();
            a2.a(a());
            if (accessibilityEvent.getEventType() == 4096 && LiveVerticalViewPager.this.f22512b != null) {
                a2.a(LiveVerticalViewPager.this.f22512b.getCount());
                a2.b(LiveVerticalViewPager.this.f22513c);
                a2.c(LiveVerticalViewPager.this.f22513c);
            }
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            try {
                super.a(view, dVar);
            } catch (Exception e2) {
                if (Logger.debug()) {
                    com.bytedance.android.live.core.c.a.a(6, "MyAccessibilityDelegate", e2.getMessage());
                }
            }
            dVar.a((CharSequence) ViewPager.class.getName());
            dVar.d(a());
            if (LiveVerticalViewPager.this.canScrollVertically(1)) {
                dVar.a(4096);
            }
            if (LiveVerticalViewPager.this.canScrollVertically(-1)) {
                dVar.a(8192);
            }
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !LiveVerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                LiveVerticalViewPager liveVerticalViewPager = LiveVerticalViewPager.this;
                liveVerticalViewPager.setCurrentItem(liveVerticalViewPager.f22513c - 1);
                return true;
            } else if (!LiveVerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                LiveVerticalViewPager liveVerticalViewPager2 = LiveVerticalViewPager.this;
                liveVerticalViewPager2.setCurrentItem(liveVerticalViewPager2.f22513c + 1);
                return true;
            }
        }
    }

    private boolean e() {
        this.N = -1;
        h();
        return this.T.a() | this.U.a();
    }

    private boolean j() {
        PagerAdapter pagerAdapter = this.f22512b;
        if (pagerAdapter == null || this.f22513c >= pagerAdapter.getCount() - 1) {
            return false;
        }
        a(this.f22513c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ao);
        Scroller scroller = this.f22514d;
        if (scroller != null && !scroller.isFinished()) {
            this.f22514d.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22529a = this.f22513c;
        PagerAdapter pagerAdapter = this.f22512b;
        if (pagerAdapter != null) {
            savedState.f22530b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(13279);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f22509g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void d() {
        if (this.al != 0) {
            ArrayList<View> arrayList = this.am;
            if (arrayList == null) {
                this.am = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.am.add(getChildAt(i2));
            }
            Collections.sort(this.am, an);
        }
    }

    private void c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f22514d = new Scroller(context, f22511j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.I = viewConfiguration.getScaledPagingTouchSlop();
        this.P = (int) (400.0f * f2);
        this.Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.T = new androidx.core.widget.d(context);
        this.U = new androidx.core.widget.d(context);
        this.R = (int) (25.0f * f2);
        this.S = (int) (2.0f * f2);
        this.G = (int) (f2 * 16.0f);
        v.a(this, new d());
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        v.a(this, new r() {
            /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass4 */

            /* renamed from: b  reason: collision with root package name */
            private final Rect f22523b = new Rect();

            static {
                Covode.recordClassIndex(13283);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad a2 = v.a(view, adVar);
                if (a2.f2507b.b()) {
                    return a2;
                }
                Rect rect = this.f22523b;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = LiveVerticalViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ad b2 = v.b(LiveVerticalViewPager.this.getChildAt(i2), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private b g() {
        float f2;
        float f3;
        int i2;
        int clientHeight = getClientHeight();
        float f4 = 0.0f;
        if (clientHeight > 0) {
            f2 = ((float) getScrollY()) / ((float) clientHeight);
            f3 = ((float) this.s) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        b bVar = null;
        float f5 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f22518k.size()) {
            b bVar2 = this.f22518k.get(i4);
            if (!z2 && bVar2.f22533b != (i2 = i3 + 1)) {
                bVar2 = this.f22519l;
                bVar2.f22536e = f4 + f5 + f3;
                bVar2.f22533b = i2;
                bVar2.f22535d = this.f22512b.getPageWidth(bVar2.f22533b);
                i4--;
            }
            f4 = bVar2.f22536e;
            float f6 = bVar2.f22535d + f4 + f3;
            if (!z2 && f2 < f4) {
                return bVar;
            }
            if (f2 < f6 || i4 == this.f22518k.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f22533b;
            f5 = bVar2.f22535d;
            i4++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.q = true;
        if (this.f22514d.isFinished() || !this.f22514d.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f22514d.getCurrX();
        int currY = this.f22514d.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!c(currY)) {
                this.f22514d.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        v.c(this);
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(e eVar) {
        this.ag = eVar;
    }

    public void setOnPageChangeListener(ViewPager.e eVar) {
        this.ae = eVar;
    }

    public void setOnSlideInterceptor(f fVar) {
        this.aj = fVar;
    }

    public void setOverScrollListener(g gVar) {
        this.f22516f = gVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i2) {
        this.C = false;
        a(i2, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public void setCurrentItem(int i2) {
        this.C = false;
        a(i2, !this.aa, false);
    }

    public void setPageMargin(int i2) {
        int i3 = this.s;
        this.s = i2;
        int height = getHeight();
        a(height, height, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.t) {
            return true;
        }
        return false;
    }

    private static float a(float f2) {
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    private b b(int i2) {
        for (int i3 = 0; i3 < this.f22518k.size(); i3++) {
            b bVar = this.f22518k.get(i3);
            if (bVar.f22533b == i2) {
                return bVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        MethodCollector.i(11049);
        if (this.A) {
            removeViewInLayout(view);
            MethodCollector.o(11049);
            return;
        }
        super.removeView(view);
        MethodCollector.o(11049);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2;
        this.t = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    private b a(View view) {
        for (int i2 = 0; i2 < this.f22518k.size(); i2++) {
            b bVar = this.f22518k.get(i2);
            if (this.f22512b.isViewFromObject(view, bVar.f22532a)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        b a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f22533b == this.f22513c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (this.f22512b == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i2 < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.w))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollY >= ((int) (((float) clientHeight) * this.x))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f22533b == this.f22513c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f22512b;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f22530b, savedState.f22531c);
            a(savedState.f22529a, false, true);
            return;
        }
        this.n = savedState.f22529a;
        this.o = savedState.f22530b;
        this.p = savedState.f22531c;
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (this.ai == null) {
            try {
                this.ai = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                com.bytedance.android.live.core.c.a.b("LiveVerticalViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
            }
        }
        try {
            this.ai.invoke(this, Boolean.valueOf(z2));
        } catch (Exception e3) {
            com.bytedance.android.live.core.c.a.b("LiveVerticalViewPager", "Error changing children drawing order", e3);
        }
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            com.bytedance.android.live.core.c.a.a(5, "LiveVerticalViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.D) {
            this.D = i2;
            b();
        }
    }

    public void setScrollState(int i2) {
        boolean z2;
        int i3;
        if (this.ap != i2) {
            this.ap = i2;
            if (this.ah != null) {
                if (i2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    if (z2) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    getChildAt(i4).setLayerType(i3, null);
                }
            }
            ViewPager.e eVar = this.ae;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i2);
            }
        }
    }

    public LiveVerticalViewPager(Context context) {
        super(context);
        MethodCollector.i(10854);
        c();
        MethodCollector.o(10854);
    }

    private b b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    z2 = d(17);
                } else if (keyCode == 22) {
                    z2 = d(66);
                } else if (keyCode == 61) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (keyEvent.hasNoModifiers()) {
                        z2 = d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z2 = d(1);
                    }
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private boolean b(float f2) {
        boolean z2;
        this.K = f2;
        float scrollY = ((float) getScrollY()) + (this.K - f2);
        float clientHeight = (float) getClientHeight();
        float f3 = this.w * clientHeight;
        float f4 = this.x * clientHeight;
        boolean z3 = false;
        b bVar = this.f22518k.get(0);
        ArrayList<b> arrayList = this.f22518k;
        boolean z4 = true;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f22533b != 0) {
            f3 = bVar.f22536e * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.f22533b != this.f22512b.getCount() - 1) {
            f4 = bVar2.f22536e * clientHeight;
            z4 = false;
        }
        if (scrollY < f3) {
            if (z2) {
                z3 = this.T.a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z4) {
                z3 = this.U.a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.J += scrollY - ((float) i2);
        scrollTo(getScrollX(), i2);
        c(i2);
        return z3;
    }

    private boolean c(int i2) {
        if (this.f22518k.size() != 0) {
            b g2 = g();
            int clientHeight = getClientHeight();
            int i3 = this.s;
            int i4 = clientHeight + i3;
            float f2 = (float) i3;
            float f3 = (float) clientHeight;
            int i5 = g2.f22533b;
            float f4 = ((((float) i2) / f3) - g2.f22536e) / (g2.f22535d + (f2 / f3));
            this.ac = false;
            a(i5, f4, (int) (((float) i4) * f4));
            if (this.ac) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.aa) {
            return false;
        } else {
            this.ac = false;
            a(0, 0.0f, 0);
            if (this.ac) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r8 != 2) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(int r8) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.d(int):boolean");
    }

    public void draw(Canvas canvas) {
        boolean z2;
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f22512b) != null && pagerAdapter.getCount() > 1)) {
                if (!this.T.f2636a.isFinished()) {
                    int save = canvas.save();
                    int height = getHeight();
                    int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.translate((float) getPaddingLeft(), this.w * ((float) height));
                    this.T.a(width, height);
                    z2 = this.T.a(canvas) | false;
                    canvas.restoreToCount(save);
                    if (!this.V) {
                        this.V = true;
                        if (this.f22516f != null) {
                            post(new Runnable() {
                                /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass6 */

                                static {
                                    Covode.recordClassIndex(13285);
                                }

                                public final void run() {
                                    if (LiveVerticalViewPager.this.f22516f != null) {
                                        LiveVerticalViewPager.this.f22516f.a();
                                    }
                                }
                            });
                        }
                    }
                } else {
                    z2 = false;
                }
                if (!this.U.f2636a.isFinished()) {
                    int save2 = canvas.save();
                    int height2 = getHeight();
                    int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.rotate(180.0f);
                    canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.x + 1.0f)) * ((float) height2));
                    this.U.a(width2, height2);
                    z2 |= this.U.a(canvas);
                    canvas.restoreToCount(save2);
                    if (!this.W) {
                        this.W = true;
                        if (this.f22516f != null) {
                            post(new Runnable() {
                                /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AnonymousClass7 */

                                static {
                                    Covode.recordClassIndex(13286);
                                }

                                public final void run() {
                                    if (LiveVerticalViewPager.this.f22516f != null) {
                                        LiveVerticalViewPager.this.f22516f.b();
                                    }
                                }
                            });
                        }
                    }
                }
                if (z2) {
                    v.c(this);
                    return;
                }
            } else {
                this.T.f2636a.finish();
                this.U.f2636a.finish();
            }
            if (this.V) {
                this.V = false;
            }
            if (this.W) {
                this.W = false;
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("LiveVerticalViewPager", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        int i2 = 11062;
        MethodCollector.i(11062);
        super.onDraw(canvas);
        if (this.s > 0 && this.t != null && this.f22518k.size() > 0 && this.f22512b != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f3 = (float) height;
            float f4 = ((float) this.s) / f3;
            int i3 = 0;
            b bVar = this.f22518k.get(0);
            float f5 = bVar.f22536e;
            int size = this.f22518k.size();
            int i4 = bVar.f22533b;
            int i5 = this.f22518k.get(size - 1).f22533b;
            while (true) {
                if (i4 >= i5) {
                    break;
                }
                while (i4 > bVar.f22533b && i3 < size) {
                    i3++;
                    bVar = this.f22518k.get(i3);
                }
                if (i4 == bVar.f22533b) {
                    f2 = (bVar.f22536e + bVar.f22535d) * f3;
                    f5 = bVar.f22536e + bVar.f22535d + f4;
                } else {
                    float pageWidth = this.f22512b.getPageWidth(i4);
                    f2 = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                int i6 = this.s;
                if (((float) i6) + f2 > ((float) scrollY)) {
                    this.t.setBounds(this.u, (int) f2, this.v, (int) (((float) i6) + f2 + 0.5f));
                    this.t.draw(canvas);
                }
                if (f2 > ((float) (scrollY + height))) {
                    i2 = 11062;
                    break;
                } else {
                    i4++;
                    i2 = 11062;
                }
            }
        }
        MethodCollector.o(i2);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f22512b;
        if (pagerAdapter2 != null) {
            a(pagerAdapter2, (h) null);
            this.f22512b.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f22518k.size(); i2++) {
                b bVar = this.f22518k.get(i2);
                this.f22512b.destroyItem((ViewGroup) this, bVar.f22533b, bVar.f22532a);
            }
            this.f22512b.finishUpdate((ViewGroup) this);
            this.f22518k.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((c) getChildAt(i3).getLayoutParams()).f22537a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f22513c = 0;
            scrollTo(0, 0);
        }
        this.f22512b = pagerAdapter;
        this.f22517h = 0;
        if (pagerAdapter != null) {
            if (this.r == null) {
                this.r = new h(this, (byte) 0);
            }
            a(this.f22512b, this.r);
            this.C = false;
            boolean z2 = this.aa;
            this.aa = true;
            this.f22517h = this.f22512b.getCount();
            if (this.n >= 0) {
                this.f22512b.restoreState(this.o, this.p);
                a(this.n, false, true);
                this.n = -1;
                this.o = null;
                this.p = null;
            } else if (!z2) {
                b();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f22515e) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.E) {
                            return true;
                        }
                        if (this.F) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.J = motionEvent.getX();
                        this.L = motionEvent.getX();
                        this.K = motionEvent.getY();
                        this.M = motionEvent.getY();
                        this.N = motionEvent.getPointerId(0);
                        this.F = false;
                        this.q = true;
                        this.f22514d.computeScrollOffset();
                        if (this.ap != 2 || Math.abs(this.f22514d.getFinalY() - this.f22514d.getCurrY()) <= this.S) {
                            a(false);
                            this.E = false;
                            this.ak = false;
                        } else {
                            this.f22514d.abortAnimation();
                            this.C = false;
                            b();
                            this.E = true;
                            f();
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i2 = this.N;
                        if (i2 != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i2);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float f3 = y2 - this.K;
                            float abs = Math.abs(f3);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float abs2 = Math.abs(x2 - this.L);
                            if (f3 != 0.0f) {
                                float f4 = this.K;
                                if (f4 >= ((float) this.H) || f3 <= 0.0f) {
                                    if (f4 <= ((float) (getHeight() - this.H)) || f3 >= 0.0f) {
                                        if (a(this, false, (int) f3, (int) x2, (int) y2)) {
                                            this.J = x2;
                                            this.K = y2;
                                            this.F = true;
                                            return false;
                                        }
                                    }
                                }
                            }
                            int i3 = this.I;
                            if (abs <= ((float) i3) || abs * 0.5f <= abs2) {
                                if (abs2 > ((float) i3)) {
                                    this.F = true;
                                }
                            } else if (this.ak) {
                                return false;
                            } else {
                                f fVar = this.aj;
                                if (fVar == null || !fVar.a()) {
                                    this.E = true;
                                    f();
                                    setScrollState(1);
                                    if (f3 > 0.0f) {
                                        f2 = this.M + ((float) this.I);
                                    } else {
                                        f2 = this.M - ((float) this.I);
                                    }
                                    this.K = f2;
                                    this.J = x2;
                                    setScrollingCacheEnabled(true);
                                } else {
                                    this.ak = true;
                                    return false;
                                }
                            }
                            if (this.E && b(y2)) {
                                v.c(this);
                            }
                        }
                    } else if (action == 6) {
                        a(motionEvent);
                    }
                    if (this.O == null) {
                        this.O = VelocityTracker.obtain();
                    }
                    this.O.addMovement(motionEvent);
                    return this.E;
                }
            }
            e();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z2;
        float f2;
        float f3;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f22515e) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f22512b) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.O == null) {
                        this.O = VelocityTracker.obtain();
                    }
                    this.O.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                if (!this.E) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.N);
                                    if (findPointerIndex == -1) {
                                        z2 = e();
                                    } else {
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y2 - this.K);
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x2 - this.J);
                                        if (abs > ((float) this.I) && abs > abs2) {
                                            this.E = true;
                                            f();
                                            float f4 = this.M;
                                            if (y2 - f4 > 0.0f) {
                                                f3 = f4 + ((float) this.I);
                                            } else {
                                                f3 = f4 - ((float) this.I);
                                            }
                                            this.K = f3;
                                            this.J = x2;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.E) {
                                    z2 = false | b(motionEvent.getY(motionEvent.findPointerIndex(this.N)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.K = motionEvent.getY(actionIndex);
                                    this.N = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    a(motionEvent);
                                    this.K = motionEvent.getY(motionEvent.findPointerIndex(this.N));
                                }
                            } else if (this.E) {
                                a(this.f22513c, true, 0, false);
                                z2 = e();
                            }
                        } else if (this.E) {
                            VelocityTracker velocityTracker = this.O;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.Q);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.N);
                            this.C = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            b g2 = g();
                            float f5 = (float) clientHeight;
                            int i2 = g2.f22533b;
                            float f6 = ((((float) scrollY) / f5) - g2.f22536e) / (g2.f22535d + (((float) this.s) / f5));
                            if (Math.abs((int) (motionEvent.getY(motionEvent.findPointerIndex(this.N)) - this.M)) <= this.R || Math.abs(yVelocity) <= this.P) {
                                if (i2 >= this.f22513c) {
                                    f2 = 0.6f;
                                } else {
                                    f2 = 0.4f;
                                }
                                i2 = (int) (((float) i2) + f6 + f2);
                            } else if (yVelocity <= 0) {
                                i2++;
                            }
                            if (this.f22518k.size() > 0) {
                                ArrayList<b> arrayList = this.f22518k;
                                i2 = Math.max(this.f22518k.get(0).f22533b, Math.min(i2, arrayList.get(arrayList.size() - 1).f22533b));
                            }
                            a(i2, true, true, yVelocity);
                            z2 = e();
                        }
                        if (z2) {
                            v.c(this);
                        }
                    } else {
                        this.f22514d.abortAnimation();
                        this.C = false;
                        b();
                        this.L = motionEvent.getX();
                        this.J = motionEvent.getX();
                        this.K = motionEvent.getY();
                        this.M = motionEvent.getY();
                        this.N = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r6.f22533b == r17.f22513c) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r12 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r12 < 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r13 = r17.f22518k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r11 = getClientHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r11 > 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        r1 = r17.f22513c - 1;
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r1 < 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r15 < r2) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r1 >= r3) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r13 == null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r1 != r13.f22533b) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r13.f22534c != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r17.f22518k.remove(r12);
        r17.f22512b.destroyItem((android.view.ViewGroup) r17, r1, r13.f22532a);
        r12 = r12 - 1;
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r12 < 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r13 = r17.f22518k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r13 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r1 != r13.f22533b) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r15 = r15 + r13.f22535d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        if (r12 < 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        r13 = r17.f22518k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        r15 = r15 + b(r1, r12 + 1).f22535d;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r12 < 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        r13 = r17.f22518k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        r2 = (2.0f - r6.f22535d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        if (r6 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        r3 = r6.f22535d;
        r2 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0107, code lost:
        if (r3 >= 2.0f) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (r2 >= r17.f22518k.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        r13 = r17.f22518k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        if (r11 > 0) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011c, code lost:
        r11 = r17.f22513c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011e, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        if (r11 >= r9) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r3 < r1) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        if (r11 <= r8) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        if (r13 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        if (r11 != r13.f22533b) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0130, code lost:
        if (r13.f22534c != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0132, code lost:
        r17.f22518k.remove(r2);
        r17.f22512b.destroyItem((android.view.ViewGroup) r17, r11, r13.f22532a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (r2 >= r17.f22518k.size()) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0146, code lost:
        r13 = r17.f22518k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014f, code lost:
        if (r13 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        if (r11 != r13.f22533b) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        r3 = r3 + r13.f22535d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0160, code lost:
        if (r2 >= r17.f22518k.size()) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0162, code lost:
        r13 = r17.f22518k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016b, code lost:
        r0 = b(r11, r2);
        r2 = r2 + 1;
        r3 = r3 + r0.f22535d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017a, code lost:
        if (r2 >= r17.f22518k.size()) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017c, code lost:
        r13 = r17.f22518k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0185, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0187, code lost:
        r1 = (((float) getPaddingRight()) / ((float) r11)) + 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0191, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0193, code lost:
        a(r6, r7, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r18) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.a(int):void");
    }

    private static void a(PagerAdapter pagerAdapter, h hVar) {
        try {
            f22509g.set(pagerAdapter, hVar);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.al == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.am.get(i3).getLayoutParams()).f22542f;
    }

    private b b(int i2, int i3) {
        b bVar = new b();
        bVar.f22533b = i2;
        bVar.f22532a = this.f22512b.instantiateItem((ViewGroup) this, i2);
        bVar.f22535d = this.f22512b.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f22518k.size()) {
            this.f22518k.add(bVar);
        } else {
            this.f22518k.add(i3, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        b a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f22533b == this.f22513c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public LiveVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(11030);
        c();
        MethodCollector.o(11030);
    }

    private void a(int i2, int i3) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f22514d;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.q) {
                scrollY = this.f22514d.getCurrY();
            } else {
                scrollY = this.f22514d.getStartY();
            }
            this.f22514d.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i4 = 0 - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i6 = clientHeight / 2;
        float f2 = (float) clientHeight;
        float f3 = (float) i6;
        float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a2 / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i4)) / ((f2 * this.f22512b.getPageWidth(this.f22513c)) + ((float) this.s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.q = false;
        this.f22514d.startScroll(scrollX, scrollY, i4, i5, min);
        v.c(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.onMeasure(int, int):void");
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(11048);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.f22537a |= view instanceof a;
        if (!this.A) {
            super.addView(view, i2, layoutParams);
            MethodCollector.o(11048);
        } else if (!cVar.f22537a) {
            cVar.f22540d = true;
            addViewInLayout(view, i2, layoutParams);
            MethodCollector.o(11048);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
            MethodCollector.o(11048);
            throw illegalStateException;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f22533b == this.f22513c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    private void a(int i2, float f2, int i3) {
        int i4;
        int i5;
        if (this.ad > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f22537a) {
                    int i7 = cVar.f22538b & 112;
                    if (i7 == 16) {
                        i4 = Math.max((height - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i5 = paddingTop;
                        paddingTop = i4;
                    } else if (i7 == 48) {
                        i5 = childAt.getHeight() + paddingTop;
                    } else if (i7 != 80) {
                        i5 = paddingTop;
                    } else {
                        i4 = (height - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i5 = paddingTop;
                        paddingTop = i4;
                    }
                    int top = (paddingTop + scrollY) - childAt.getTop();
                    if (top != 0) {
                        childAt.offsetTopAndBottom(top);
                    }
                    paddingTop = i5;
                }
            }
        }
        ViewPager.e eVar = this.ae;
        if (eVar != null) {
            eVar.onPageScrolled(i2, f2, i3);
        }
        ViewPager.e eVar2 = this.af;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i2, f2, i3);
        }
        if (this.ah != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((c) childAt2.getLayoutParams()).f22537a) {
                    this.ah.a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.ac = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i3 != i5) {
            int i6 = this.s;
            a(i3, i5, i6, i6);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        float f2;
        if (i3 <= 0 || this.f22518k.isEmpty()) {
            b b2 = b(this.f22513c);
            if (b2 != null) {
                f2 = Math.min(b2.f22536e, this.x);
            } else {
                f2 = 0.0f;
            }
            int paddingTop = (int) (f2 * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (paddingTop != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), paddingTop);
            }
        } else if (!this.f22514d.isFinished()) {
            this.f22514d.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i4 - i2;
        int i11 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f22537a) {
                    int i14 = cVar.f22538b & 7;
                    int i15 = cVar.f22538b & 112;
                    if (i14 == 1) {
                        i6 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    } else if (i14 == 3) {
                        i7 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i7 = paddingLeft;
                    } else {
                        i6 = (i10 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    }
                    if (i15 == 16) {
                        i8 = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i9 = paddingTop;
                        paddingTop = i8;
                    } else if (i15 == 48) {
                        i9 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i15 != 80) {
                        i9 = paddingTop;
                    } else {
                        i8 = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i9 = paddingTop;
                        paddingTop = i8;
                    }
                    int i16 = paddingTop + scrollY;
                    childAt.layout(paddingLeft, i16, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i16);
                    i12++;
                    paddingTop = i9;
                    paddingLeft = i7;
                }
            }
        }
        int i17 = (i11 - paddingTop) - paddingBottom;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                b a2 = a(childAt2);
                if (!cVar2.f22537a && a2 != null) {
                    float f2 = (float) i17;
                    int i19 = ((int) (a2.f22536e * f2)) + paddingTop;
                    if (cVar2.f22540d) {
                        cVar2.f22540d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i10 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.f22539c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i19, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i19);
                }
            }
        }
        this.u = paddingLeft;
        this.v = i10 - paddingRight;
        this.ad = i12;
        if (this.aa) {
            z3 = false;
            a(this.f22513c, false, 0, false);
        } else {
            z3 = false;
        }
        this.aa = z3;
    }
}
