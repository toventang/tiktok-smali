package com.ss.android.ugc.aweme.homepage.story.container;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.h.e;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.homepage.story.container.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import h.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StepDrawerContainer extends ViewGroup {
    private static final int[] H = {16843828};
    private static final boolean I;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f99268e = {16842931};

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f99269f = true;

    /* renamed from: g  reason: collision with root package name */
    public static final a f99270g = new a((byte) 0);
    private boolean A;
    private Drawable B;
    private Drawable C;
    private boolean D;
    private Drawable E;
    private int F;
    private final Paint G;

    /* renamed from: a  reason: collision with root package name */
    Object f99271a;

    /* renamed from: b  reason: collision with root package name */
    boolean f99272b;

    /* renamed from: c  reason: collision with root package name */
    p<Boolean, Integer> f99273c = new p<>(false, 0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f99274d;

    /* renamed from: h  reason: collision with root package name */
    private final int f99275h;

    /* renamed from: i  reason: collision with root package name */
    private float f99276i;

    /* renamed from: j  reason: collision with root package name */
    private final m f99277j;

    /* renamed from: k  reason: collision with root package name */
    private final d f99278k;

    /* renamed from: l  reason: collision with root package name */
    private int f99279l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f99280m;
    private boolean n = true;
    private int o = 3;
    private int p = 3;
    private boolean q;
    private List<b> r;
    private float s;
    private float t;
    private float u;
    private float v;
    private Drawable w;
    private final ArrayList<View> x;
    private Rect y;
    private Matrix z;

    protected static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* renamed from: f  reason: collision with root package name */
        public static final a f99282f = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public int f99283a;

        /* renamed from: b  reason: collision with root package name */
        public int f99284b;

        /* renamed from: e  reason: collision with root package name */
        public int f99285e;

        public static final class a {
            static {
                Covode.recordClassIndex(63246);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.ClassLoaderCreator<SavedState> {
            static {
                Covode.recordClassIndex(63247);
            }

            b() {
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                l.d(parcel, "");
                l.d(classLoader, "");
                return new SavedState(parcel, classLoader);
            }
        }

        static {
            Covode.recordClassIndex(63245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
            l.d(parcelable, "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            l.d(parcel, "");
            this.f99283a = parcel.readInt();
            this.f99284b = parcel.readInt();
            this.f99285e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f99283a);
            parcel.writeInt(this.f99284b);
            parcel.writeInt(this.f99285e);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(63249);
        }

        void a(int i2, boolean z, boolean z2);

        void a(View view, float f2, boolean z, float f3);

        void a(View view, boolean z);

        void a(View view, boolean z, boolean z2);
    }

    public static final class c extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final a f99286e = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public u<Float, Integer, Boolean> f99287a;

        /* renamed from: b  reason: collision with root package name */
        public int f99288b;

        /* renamed from: c  reason: collision with root package name */
        public float f99289c;

        /* renamed from: d  reason: collision with root package name */
        public int f99290d;

        static {
            Covode.recordClassIndex(63250);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(63251);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public c() {
            super(-1, -1);
        }

        public final boolean a() {
            if ((this.f99290d & 3) == 3) {
                return true;
            }
            return false;
        }

        public final boolean b() {
            u<Float, Integer, Boolean> uVar = this.f99287a;
            if (uVar == null || uVar.getFirst().floatValue() == 0.0f) {
                return false;
            }
            return true;
        }

        public c(int i2) {
            this();
            this.f99288b = i2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            l.d(layoutParams, "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            l.d(marginLayoutParams, "");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(c cVar) {
            super((ViewGroup.MarginLayoutParams) cVar);
            l.d(cVar, "");
            this.f99288b = cVar.f99288b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            l.d(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StepDrawerContainer.f99268e);
            l.b(obtainStyledAttributes, "");
            this.f99288b = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private static /* synthetic */ void getMLockModeEnd$annotations() {
    }

    private static /* synthetic */ void getMLockModeStart$annotations() {
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2, float f2) {
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, int i2, int i3) {
        l.d(view, "");
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63248);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(int i2) {
            String hexString = Integer.toHexString(i2);
            l.b(hexString, "");
            return hexString;
        }
    }

    public final p<Boolean, Integer> getFakeState() {
        return this.f99273c;
    }

    /* access modifiers changed from: protected */
    public final float getInitialMotionX() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public final float getInitialMotionY() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public final float getLastMoveX() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public final float getLastMoveY() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public final m getMDragHelper() {
        return this.f99277j;
    }

    /* access modifiers changed from: protected */
    public final int getMDrawerState() {
        return this.f99279l;
    }

    public final boolean getMaybeClose() {
        return this.A;
    }

    /* access modifiers changed from: protected */
    public final boolean getNeedDrawShadow() {
        return this.D;
    }

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    public final boolean a() {
        return v.e(this) == 1;
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        if (this.r == null) {
            this.r = new ArrayList();
        }
        List<b> list = this.r;
        if (list == null) {
            l.b();
        }
        list.add(bVar);
    }

    public final boolean a(View view, int i2) {
        l.d(view, "");
        return (e(view) & i2) == i2;
    }

    public final boolean a(float f2, float f3, float f4, float f5) {
        int i2;
        int i3;
        View a2;
        if (this.f99276i > 0.0f && g()) {
            if (c(this.s, this.t) && (a2 = this.f99277j.a((i2 = (int) f2), (i3 = (int) f3))) != null) {
                l.b(a2, "");
                if (!a(a2, i2, i3)) {
                    return false;
                }
            }
            if (b(f2, f3)) {
                float f6 = (float) this.f99277j.f99360b;
                a(Math.abs(f4) > f6 || Math.abs(f5) > f6, f5);
                c(false);
                return true;
            }
        }
        return false;
    }

    public final boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                l.b(childAt, "");
                if (childAt.getVisibility() == 0 && (i5 = i3 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() && (i6 = i4 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && a(childAt, true, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    public void a(boolean z2, boolean z3) {
        View b2 = b(8388611);
        if (b2 != null) {
            d(b2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + a.a(8388611));
    }

    private void f() {
        c(false);
    }

    public final void b() {
        b(true);
    }

    public final boolean c() {
        return g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    public void requestLayout() {
        if (!this.f99280m) {
            super.requestLayout();
        }
    }

    private boolean g() {
        View b2 = b(8388611);
        if (b2 != null) {
            return d(b2);
        }
        return false;
    }

    private final float getDensity() {
        Resources resources = getResources();
        l.b(resources, "");
        return resources.getDisplayMetrics().density;
    }

    static {
        Covode.recordClassIndex(63243);
        boolean z2 = false;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = true;
        }
        I = z2;
    }

    private boolean e() {
        if (this.o != 1 || this.p != 1) {
            return false;
        }
        if (!g()) {
            return true;
        }
        b(true);
        return true;
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            l.b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            f2 = Math.max(f2, ((c) layoutParams).f99289c);
        }
        this.f99276i = f2;
        if (this.f99277j.b()) {
            v.c(this);
        }
    }

    public final void d() {
        if (this.f99273c.getFirst().booleanValue()) {
            setFakeLeft(this.f99273c.getSecond().intValue());
            this.f99273c = this.f99273c.copy(false, 0);
        }
    }

    private View h() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            l.b(childAt, "");
            if (c(childAt)) {
                if (c(childAt)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
                    if (((c) layoutParams).f99289c > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException(("View " + childAt + " is not a drawer").toString());
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar;
        boolean z2;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            l.b();
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            l.b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            cVar = (c) layoutParams;
            boolean z3 = true;
            if (cVar.f99290d == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (cVar.f99290d != 4) {
                z3 = false;
            }
            if (z2 || z3) {
                savedState.f99283a = cVar.f99288b;
            } else {
                i2++;
            }
        }
        savedState.f99283a = cVar.f99288b;
        savedState.f99284b = this.o;
        savedState.f99285e = this.p;
        return savedState;
    }

    public final void a(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
    }

    /* access modifiers changed from: protected */
    public final void setInitialMotionX(float f2) {
        this.s = f2;
    }

    /* access modifiers changed from: protected */
    public final void setInitialMotionY(float f2) {
        this.t = f2;
    }

    /* access modifiers changed from: protected */
    public final void setLastMoveX(float f2) {
        this.u = f2;
    }

    /* access modifiers changed from: protected */
    public final void setLastMoveY(float f2) {
        this.v = f2;
    }

    public final void setLockReleaseStep(boolean z2) {
        this.f99274d = z2;
    }

    public final void setMaybeClose(boolean z2) {
        this.A = z2;
    }

    /* access modifiers changed from: protected */
    public final void setNeedDrawShadow(boolean z2) {
        this.D = z2;
    }

    final class d extends m.a {

        /* renamed from: a  reason: collision with root package name */
        public m f99291a;

        static {
            Covode.recordClassIndex(63252);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final boolean a(View view) {
            l.d(view, "");
            return false;
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final void b(View view) {
            l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final int d(View view) {
            l.d(view, "");
            return view.getTop();
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final int c(View view) {
            l.d(view, "");
            if (StepDrawerContainer.this.c(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final void a(int i2) {
            m mVar = this.f99291a;
            if (mVar == null) {
                l.b();
            }
            View view = mVar.o;
            if (view != null) {
                l.b(view, "");
                if (!StepDrawerContainer.this.b(view) && StepDrawerContainer.this.c(view)) {
                    StepDrawerContainer stepDrawerContainer = StepDrawerContainer.this;
                    m mVar2 = this.f99291a;
                    if (mVar2 == null) {
                        l.b();
                    }
                    stepDrawerContainer.a(i2, mVar2.o);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final int b(View view, int i2) {
            int width;
            l.d(view, "");
            if (!StepDrawerContainer.this.c(view)) {
                return 0;
            }
            int a2 = StepDrawerContainer.this.a(view, false);
            if (StepDrawerContainer.this.a(view, 3)) {
                width = a2;
                a2 = -view.getWidth();
            } else {
                width = StepDrawerContainer.this.getWidth();
            }
            return androidx.core.b.a.a(i2, a2, width);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final void a(View view, int i2) {
            float width;
            int i3;
            l.d(view, "");
            if (StepDrawerContainer.this.c(view)) {
                int width2 = view.getWidth();
                if (StepDrawerContainer.this.a(view, 3)) {
                    width = (float) (i2 + width2);
                } else {
                    width = (float) (StepDrawerContainer.this.getWidth() - i2);
                }
                float f2 = width / ((float) width2);
                StepDrawerContainer.this.a(view, f2);
                if (f2 == 0.0f) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                view.setVisibility(i3);
                StepDrawerContainer.this.invalidate();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
            if (r12 > 0.5f) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
            if (r12 >= 0.0f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
            if (r12 > 0.5f) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00eb, code lost:
            if (r12 > 0.5f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f0, code lost:
            if (r12 >= 0.0f) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fb, code lost:
            if (r12 > 0.5f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0102, code lost:
            if (r12 > 0.5f) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0109, code lost:
            if (r11 != false) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0113, code lost:
            if (r12 > (r3.floatValue() / 2.0f)) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x011c, code lost:
            if (r12 > 0.5f) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0125, code lost:
            if (r11 != false) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x012f, code lost:
            if (r12 > (r3.floatValue() / 2.0f)) goto L_0x011e;
         */
        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r14, float r15) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.d.a(android.view.View, float):void");
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.m.a
        public final boolean a(float f2, float f3, float f4, float f5, int i2, View view) {
            m mVar;
            View b2;
            int i3;
            m mVar2;
            View b3;
            l.d(view, "");
            boolean b4 = StepDrawerContainer.this.b(view);
            boolean c2 = StepDrawerContainer.this.c(view);
            boolean z = true;
            if (b4) {
                int i4 = 8388613;
                if (f4 < 0.0f) {
                    i3 = 8388613;
                } else {
                    i3 = 8388611;
                }
                if (StepDrawerContainer.this.a()) {
                    if (i3 == 8388613) {
                        i4 = 8388611;
                    }
                    i3 = i4;
                }
                if (!StepDrawerContainer.a(f4, f5) && (((mVar2 = this.f99291a) == null || !mVar2.b()) && (b3 = StepDrawerContainer.this.b(8388611)) != null && ((StepDrawerContainer.this.d(b3) || (b3 = StepDrawerContainer.this.b(i3)) != null) && StepDrawerContainer.this.a(i3) == 0 && !StepDrawerContainer.this.a(view, false, (int) f4, (int) f2, (int) f3)))) {
                    m mVar3 = this.f99291a;
                    if (mVar3 == null) {
                        l.b();
                    }
                    mVar3.a(b3, i2);
                } else {
                    z = false;
                }
                StepDrawerContainer.this.a(z);
                if (!z) {
                    StepDrawerContainer.this.a(f2, f3, f4, f5);
                } else {
                    StepDrawerContainer.this.setMaybeClose(false);
                }
            } else if (!c2) {
                return false;
            } else {
                if (!StepDrawerContainer.a(f4, f5) && (((mVar = this.f99291a) == null || !mVar.b()) && (b2 = StepDrawerContainer.this.b(8388611)) != null && !(!l.a(b2, view)) && !StepDrawerContainer.this.a(view, false, (int) f4, (int) f2, (int) f3))) {
                    m mVar4 = this.f99291a;
                    if (mVar4 == null) {
                        l.b();
                    }
                    mVar4.a(b2, i2);
                } else {
                    z = false;
                }
            }
            return z;
        }
    }

    public final void setFakeState(p<Boolean, Integer> pVar) {
        l.d(pVar, "");
        this.f99273c = pVar;
    }

    public final void setScrimColor(int i2) {
        this.F = i2;
        invalidate();
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            c(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void setDrawerLockMode(int i2) {
        a(i2, 8388611);
        a(i2, 8388613);
    }

    public final void setStatusBarBackgroundColor(int i2) {
        this.w = new ColorDrawable(i2);
        invalidate();
    }

    public static float a(View view) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        return ((c) layoutParams).f99289c;
    }

    private int e(View view) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        return e.a(((c) layoutParams).f99288b, v.e(this));
    }

    public boolean canScrollHorizontally(int i2) {
        if (super.canScrollHorizontally(i2) || g() || this.f99279l != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        if (!(layoutParams instanceof c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l.d(attributeSet, "");
        Context context = getContext();
        l.b(context, "");
        return new c(context, attributeSet);
    }

    public void onRtlPropertiesChanged(int i2) {
        int e2 = v.e(this);
        if (e2 == 0) {
            Drawable drawable = this.B;
            if (drawable != null) {
                a(drawable, e2);
                return;
            }
            return;
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            a(drawable2, e2);
        }
    }

    public final void setStatusBarBackground(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = androidx.core.content.b.a(getContext(), i2);
        } else {
            drawable = null;
        }
        this.w = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        if (layoutParams instanceof c) {
            return new c((c) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View b2;
        l.d(parcelable, "");
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        if (!(savedState.f99283a == 0 || (b2 = b(savedState.f99283a)) == null)) {
            d(b2, true);
        }
        if (savedState.f99284b != 3) {
            a(savedState.f99284b, 8388611);
        }
        if (savedState.f99285e != 3) {
            a(savedState.f99285e, 8388613);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            if (this.A) {
                a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX() - this.s, motionEvent.getY() - this.t);
            }
        } else if (actionMasked == 2) {
            this.u = motionEvent.getX();
            this.v = motionEvent.getY();
        }
        return dispatchTouchEvent;
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        int systemWindowInsetTop;
        MethodCollector.i(3700);
        l.d(canvas, "");
        super.onDraw(canvas);
        if (this.f99272b && this.w != null && Build.VERSION.SDK_INT >= 21 && (obj = this.f99271a) != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            Drawable drawable = this.w;
            if (drawable == null) {
                l.b();
            }
            drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            Drawable drawable2 = this.w;
            if (drawable2 == null) {
                l.b();
            }
            drawable2.draw(canvas);
        }
        MethodCollector.o(3700);
    }

    public final void setFakeLeft(int i2) {
        float width;
        int i3;
        View b2 = b(8388611);
        if (b2 != null) {
            if (!this.f99273c.getFirst().booleanValue()) {
                this.f99273c = this.f99273c.copy(true, Integer.valueOf(b2.getLeft()));
            }
            int width2 = b2.getWidth();
            v.e(b2, i2 - b2.getLeft());
            if (a(b2, 3)) {
                width = (float) (i2 + width2);
            } else {
                width = (float) (getWidth() - i2);
            }
            float f2 = width / ((float) width2);
            ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            c cVar = (c) layoutParams;
            if (f2 != cVar.f99289c) {
                cVar.f99289c = f2;
                if (f2 == 0.0f) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                b2.setVisibility(i3);
                invalidate();
            }
        }
    }

    private void c(boolean z2) {
        boolean a2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            l.b(childAt, "");
            Objects.requireNonNull(childAt.getLayoutParams(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            if (c(childAt) && !z2) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    a2 = this.f99277j.a(childAt, -width, childAt.getTop());
                } else {
                    a2 = this.f99277j.a(childAt, getWidth(), childAt.getTop());
                }
                z3 |= a2;
            }
        }
        if (z3) {
            invalidate();
        }
    }

    public final int a(int i2) {
        int i3;
        if (i2 == 8388611) {
            int i4 = this.o;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 8388613 && (i3 = this.p) != 3) {
            return i3;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final View b(int i2) {
        int a2 = e.a(i2, v.e(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            l.b(childAt, "");
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean d(View view) {
        l.d(view, "");
        if (c(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            if ((((c) layoutParams).f99290d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(("View " + view + " is not a drawer").toString());
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        l.d(motionEvent, "");
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f99276i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            l.b(childAt, "");
            if (this.y == null) {
                this.y = new Rect();
            }
            childAt.getHitRect(this.y);
            Rect rect = this.y;
            if (rect == null) {
                l.b();
            }
            if (rect.contains((int) x2, (int) y2) && !b(childAt)) {
                Matrix matrix = childAt.getMatrix();
                l.b(matrix, "");
                if (!matrix.isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(((float) getScrollX()) - ((float) childAt.getLeft()), ((float) getScrollY()) - ((float) childAt.getTop()));
                    Matrix matrix2 = childAt.getMatrix();
                    l.b(matrix2, "");
                    if (!matrix2.isIdentity()) {
                        if (this.z == null) {
                            this.z = new Matrix();
                        }
                        matrix2.invert(this.z);
                        obtain.transform(this.z);
                    }
                    l.b(obtain, "");
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = ((float) getScrollX()) - ((float) childAt.getLeft());
                    float scrollY = ((float) getScrollY()) - ((float) childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(boolean z2) {
        View b2 = b(8388611);
        if (b2 != null) {
            e(b2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + a.a(8388611));
    }

    /* access modifiers changed from: protected */
    public boolean c(View view) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        int a2 = e.a(((c) layoutParams).f99288b, v.e(view));
        if ((a2 & 3) == 0 && (a2 & 5) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r5 != 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r25) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r11.f99361c == -1) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        r11.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean b(View view) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        if (((c) layoutParams).f99288b == 0) {
            return true;
        }
        return false;
    }

    private static void a(Drawable drawable, int i2) {
        if (drawable != null && androidx.core.graphics.drawable.a.a(drawable)) {
            androidx.core.graphics.drawable.a.b(drawable, i2);
        }
    }

    private final boolean b(float f2, float f3) {
        int i2 = (int) f2;
        int i3 = (int) f3;
        View a2 = this.f99277j.a(i2, i3);
        if (a2 == null) {
            return false;
        }
        l.b(a2, "");
        if (b(a2) || a(a2, i2, i3)) {
            return true;
        }
        return false;
    }

    private final boolean c(float f2, float f3) {
        View a2 = this.f99277j.a((int) f2, (int) f3);
        if (a2 == null) {
            return false;
        }
        l.b(a2, "");
        return c(a2);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        l.d(keyEvent, "");
        if (i2 != 4 || h() == null) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    private void a(int i2, int i3) {
        View b2;
        int a2 = e.a(i3, v.e(this));
        if (i3 == 8388611) {
            this.o = i2;
        } else if (i3 == 8388613) {
            this.p = i2;
        }
        if (i2 != 0) {
            this.f99277j.a();
            if (i2 == 1) {
                View b3 = b(a2);
                if (b3 != null) {
                    e(b3, true);
                }
            } else if (i2 == 2 && (b2 = b(a2)) != null) {
                d(b2, true);
            }
        }
    }

    private void b(View view, boolean z2) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        c cVar = (c) layoutParams;
        if ((cVar.f99290d & 1) == 1) {
            cVar.f99290d = 0;
            List<b> list = this.r;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<b> list2 = this.r;
                    if (list2 == null) {
                        l.b();
                    }
                    list2.get(size).a(view, z2);
                }
            }
        }
    }

    private void c(View view, float f2) {
        l.d(view, "");
        float a2 = a(view);
        float width = (float) view.getWidth();
        int a3 = h.g.a.a(width * 0.0f) - h.g.a.a(a2 * width);
        if (!a(view, 3)) {
            a3 = -a3;
        }
        view.offsetLeftAndRight(a3);
        a(view, 0.0f);
    }

    protected static boolean a(float f2, float f3) {
        if (Math.abs(f2) < Math.abs(f3) * 2.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.view.View r6, float r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r6, r0)
            java.util.List<com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b> r0 = r5.r
            if (r0 == 0) goto L_0x005d
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.c
            if (r0 != 0) goto L_0x0012
            r2 = 0
        L_0x0012:
            com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$c r2 = (com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.c) r2
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L_0x005b
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r2.a()
            if (r0 != 0) goto L_0x005b
            r3 = 1
            int r1 = r6.getWidth()
            h.u<java.lang.Float, java.lang.Integer, java.lang.Boolean> r0 = r2.f99287a
            if (r0 == 0) goto L_0x005b
            float r2 = (float) r1
            float r2 = r2 * r7
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r2 = r2 / r0
        L_0x003a:
            java.util.List<com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b> r0 = r5.r
            if (r0 != 0) goto L_0x0041
            h.f.b.l.b()
        L_0x0041:
            int r1 = r0.size()
            int r1 = r1 - r4
        L_0x0046:
            if (r1 < 0) goto L_0x005d
            java.util.List<com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b> r0 = r5.r
            if (r0 != 0) goto L_0x004f
            h.f.b.l.b()
        L_0x004f:
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer$b r0 = (com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.b) r0
            r0.a(r6, r7, r3, r2)
            int r1 = r1 + -1
            goto L_0x0046
        L_0x005b:
            r2 = r7
            goto L_0x003a
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.b(android.view.View, float):void");
    }

    private void c(View view, boolean z2) {
        int i2;
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        c cVar = (c) layoutParams;
        boolean b2 = cVar.b();
        if ((cVar.f99290d & 1) == 0) {
            if (z2) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            cVar.f99290d = i2;
            List<b> list = this.r;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<b> list2 = this.r;
                    if (list2 == null) {
                        l.b();
                    }
                    list2.get(size).a(view, z2, b2);
                }
            }
        } else if (cVar.a() && !z2) {
            cVar.f99290d = 1;
            List<b> list3 = this.r;
            if (list3 == null) {
                l.b();
            }
            for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
                List<b> list4 = this.r;
                if (list4 == null) {
                    l.b();
                }
                list4.get(size2).a(view, false, b2);
            }
        }
    }

    private final void d(View view, boolean z2) {
        int i2;
        if (c(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            c cVar = (c) layoutParams;
            if (this.n) {
                cVar.f99289c = 1.0f;
                if (cVar.f99287a == null || !z2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                cVar.f99290d = i2;
            } else {
                cVar.f99290d |= 4;
                this.f99277j.a(view, a(view, z2), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException(("View " + view + " is not a sliding drawer").toString());
    }

    private void e(View view, boolean z2) {
        int i2;
        l.d(view, "");
        if (c(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            c cVar = (c) layoutParams;
            if (this.n) {
                cVar.f99289c = 0.0f;
                cVar.f99290d = 0;
            } else if (z2) {
                cVar.f99290d |= 8;
                m mVar = this.f99277j;
                if (a()) {
                    i2 = getWidth();
                } else {
                    i2 = -view.getWidth();
                }
                mVar.a(view, i2, view.getTop());
            } else {
                c(view, 0.0f);
                a(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException(("View " + view + " is not a sliding drawer").toString());
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        l.d(keyEvent, "");
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View h2 = h();
        if (h2 == null) {
            return false;
        }
        l.d(h2, "");
        if (c(h2)) {
            ViewGroup.LayoutParams layoutParams = h2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            if (a(((c) layoutParams).f99288b) != 0) {
                return true;
            }
            f();
            return true;
        }
        throw new IllegalArgumentException(("View " + h2 + " is not a drawer").toString());
    }

    public final int a(View view, boolean z2) {
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        u<Float, Integer, Boolean> uVar = ((c) layoutParams).f99287a;
        boolean a2 = a(view, 3);
        int width = view.getWidth();
        if (uVar == null || (!z2 && !uVar.getThird().booleanValue())) {
            if (a2) {
                return 0;
            }
            i2 = getWidth();
        } else if (a2) {
            return h.g.a.a(((float) width) * (uVar.getFirst().floatValue() - 1.0f));
        } else {
            i2 = getWidth();
            width = h.g.a.a(((float) width) * uVar.getFirst().floatValue());
        }
        return i2 - width;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z2;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f99271a == null || !v.o(this)) {
            z2 = false;
        } else {
            z2 = true;
        }
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            l.b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
                c cVar = (c) layoutParams;
                if (z2) {
                    int a2 = e.a(cVar.f99288b, v.e(this));
                    if (v.o(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f99271a;
                            if (a2 == 3) {
                                if (windowInsets == null) {
                                    l.b();
                                }
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                if (windowInsets == null) {
                                    l.b();
                                }
                                windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f99271a;
                        if (a2 == 3) {
                            if (windowInsets2 == null) {
                                l.b();
                            }
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            if (windowInsets2 == null) {
                                l.b();
                            }
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        if (windowInsets2 == null) {
                            l.b();
                        }
                        cVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        cVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        cVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        cVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (b(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - cVar.leftMargin) - cVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - cVar.topMargin) - cVar.bottomMargin, 1073741824));
                } else if (c(childAt)) {
                    int e2 = e(childAt) & 7;
                    if (e2 == 3) {
                        if (!z3) {
                            z3 = true;
                        } else {
                            throw new IllegalStateException(("Child drawer has absolute gravity " + a.a(e2) + " but this StepDrawerContainer already has a drawer view along that edge").toString());
                        }
                    } else if (!z4) {
                        z4 = true;
                    } else {
                        throw new IllegalStateException(("Child drawer has absolute gravity " + a.a(e2) + " but this StepDrawerContainer already has a drawer view along that edge").toString());
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f99275h + cVar.leftMargin + cVar.rightMargin, cVar.width), ViewGroup.getChildMeasureSpec(i3, cVar.topMargin + cVar.bottomMargin, cVar.height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    public final void a(int i2, View view) {
        boolean z2;
        int i3 = this.f99277j.f99359a;
        int i4 = 2;
        boolean z3 = false;
        if (i3 == 1) {
            i4 = 1;
        } else if (i3 != 2) {
            i4 = 0;
        }
        if (view != null && i2 == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
            c cVar = (c) layoutParams;
            if (cVar.f99289c == 0.0f) {
                b(view, cVar.a());
            } else if (cVar.f99289c == 1.0f) {
                l.d(view, "");
                c(view, false);
            } else {
                u<Float, Integer, Boolean> uVar = cVar.f99287a;
                if (uVar != null && cVar.f99289c == uVar.getFirst().floatValue()) {
                    c(view, true);
                }
            }
        }
        if (i4 != this.f99279l) {
            this.f99279l = i4;
            c cVar2 = null;
            ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
            if (layoutParams2 instanceof c) {
                cVar2 = layoutParams2;
            }
            c cVar3 = cVar2;
            if (cVar3 != null) {
                z3 = cVar3.b();
                z2 = cVar3.a();
            } else {
                z2 = false;
            }
            List<b> list = this.r;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<b> list2 = this.r;
                    if (list2 == null) {
                        l.b();
                    }
                    list2.get(size).a(i4, z3, z2);
                }
            }
        }
    }

    public final void a(View view, float f2) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
        c cVar = (c) layoutParams;
        if (f2 != cVar.f99289c) {
            cVar.f99289c = f2;
            b(view, f2);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        l.d(arrayList, "");
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                l.b(childAt, "");
                if (!c(childAt)) {
                    this.x.add(childAt);
                } else if (d(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.x.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.x.get(i5);
                    l.b(view, "");
                    View view2 = view;
                    if (view2.getVisibility() == 0) {
                        view2.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.x.clear();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepDrawerContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        int i3;
        l.d(context, "");
        MethodCollector.i(4141);
        setDescendantFocusability(262144);
        this.f99275h = (int) ((getDensity() * 0.0f) + 0.5f);
        d dVar = new d();
        this.f99278k = dVar;
        m mVar = new m(getContext(), this, dVar);
        mVar.f99360b = (int) (((float) mVar.f99360b) * 1.0f);
        l.b(mVar, "");
        this.f99277j = mVar;
        mVar.f99368j = getDensity() * 400.0f;
        dVar.f99291a = mVar;
        setFocusableInTouchMode(true);
        v.a((View) this, 1);
        setMotionEventSplittingEnabled(false);
        if (v.o(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(AnonymousClass1.f99281a);
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(H);
                l.b(obtainStyledAttributes, "");
                try {
                    this.w = obtainStyledAttributes.getDrawable(0);
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    MethodCollector.o(4141);
                    throw th;
                }
            } else {
                this.w = null;
            }
        }
        this.x = new ArrayList<>();
        Integer a2 = com.bytedance.tux.h.d.a(context, R.attr.b0);
        if (a2 != null) {
            i3 = a2.intValue();
        } else {
            i3 = -1728053248;
        }
        this.F = i3;
        this.G = new Paint();
        MethodCollector.o(4141);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable background;
        l.d(canvas, "");
        l.d(view, "");
        if (!this.D) {
            return super.drawChild(canvas, view, j2);
        }
        int height = getHeight();
        boolean b2 = b(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (b2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view) {
                    l.b(childAt, "");
                    if (childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && c(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.f99276i;
        if (f2 > 0.0f && b2) {
            int i5 = this.F;
            this.G.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) width, (float) getHeight(), this.G);
        } else if (this.E != null && a(view, 3)) {
            Drawable drawable = this.E;
            if (drawable == null) {
                l.b();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f99277j.f99369k), 1.0f));
            Drawable drawable2 = this.E;
            if (drawable2 == null) {
                l.b();
            }
            drawable2.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            Drawable drawable3 = this.E;
            if (drawable3 == null) {
                l.b();
            }
            drawable3.setAlpha((int) (max * 255.0f));
            Drawable drawable4 = this.E;
            if (drawable4 == null) {
                l.b();
            }
            drawable4.draw(canvas);
        } else if (this.E != null && a(view, 5)) {
            Drawable drawable5 = this.E;
            if (drawable5 == null) {
                l.b();
            }
            int intrinsicWidth2 = drawable5.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f99277j.f99369k), 1.0f));
            Drawable drawable6 = this.E;
            if (drawable6 == null) {
                l.b();
            }
            drawable6.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            Drawable drawable7 = this.E;
            if (drawable7 == null) {
                l.b();
            }
            drawable7.setAlpha((int) (max2 * 255.0f));
            Drawable drawable8 = this.E;
            if (drawable8 == null) {
                l.b();
            }
            drawable8.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int a2;
        int i6;
        boolean z3;
        int i7;
        this.f99280m = true;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            l.b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.LayoutParams");
                c cVar = (c) layoutParams;
                if (b(childAt)) {
                    childAt.layout(cVar.leftMargin, cVar.topMargin, cVar.leftMargin + childAt.getMeasuredWidth(), cVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    float f2 = (float) measuredWidth;
                    float f3 = cVar.f99289c * f2;
                    if (!Float.isNaN(f3)) {
                        if (a(childAt, 3)) {
                            a2 = (-measuredWidth) + h.g.a.a(f3);
                            i6 = measuredWidth + a2;
                        } else {
                            a2 = i8 - h.g.a.a(f3);
                            i6 = i8 - a2;
                        }
                        float f4 = ((float) i6) / f2;
                        if (f4 != cVar.f99289c) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i10 = cVar.f99288b & 112;
                        if (i10 == 16) {
                            int i11 = i5 - i3;
                            int i12 = (i11 - measuredHeight) / 2;
                            if (i12 < cVar.topMargin) {
                                i12 = cVar.topMargin;
                            } else if (i12 + measuredHeight > i11 - cVar.bottomMargin) {
                                i12 = (i11 - cVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(a2, i12, measuredWidth + a2, measuredHeight + i12);
                        } else if (i10 == 48) {
                            childAt.layout(a2, cVar.topMargin, measuredWidth + a2, cVar.topMargin + measuredHeight);
                        } else if (i10 != 80) {
                            childAt.layout(a2, cVar.topMargin, measuredWidth + a2, cVar.topMargin + measuredHeight);
                        } else {
                            int i13 = i5 - i3;
                            childAt.layout(a2, (i13 - cVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + a2, i13 - cVar.bottomMargin);
                        }
                        if (z3) {
                            a(childAt, f4);
                        }
                        if (cVar.f99289c > 0.0f) {
                            i7 = 0;
                        } else {
                            i7 = 4;
                        }
                        if (childAt.getVisibility() != i7) {
                            childAt.setVisibility(i7);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        this.f99280m = false;
        this.n = false;
    }
}
