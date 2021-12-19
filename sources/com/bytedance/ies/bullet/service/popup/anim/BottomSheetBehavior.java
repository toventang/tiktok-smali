package com.bytedance.ies.bullet.service.popup.anim;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.j;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.b.d;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {
    private int A;
    private int B;
    private final d.a C = new d.a() {
        /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AnonymousClass3 */

        static {
            Covode.recordClassIndex(19638);
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final int a() {
            int i2;
            int i3;
            if (BottomSheetBehavior.this.f32876d) {
                i2 = BottomSheetBehavior.this.f32879g;
                i3 = BottomSheetBehavior.this.f32874b;
            } else {
                i2 = BottomSheetBehavior.this.f32875c;
                i3 = BottomSheetBehavior.this.f32874b;
            }
            return i2 - i3;
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final int a(View view) {
            return view.getLeft();
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final void a(int i2) {
            BottomSheetBehavior.this.e(i2);
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final void b(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior.this.d(1);
            }
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final int c(int i2) {
            int i3;
            int i4 = BottomSheetBehavior.this.f32874b;
            if (BottomSheetBehavior.this.f32876d) {
                i3 = BottomSheetBehavior.this.f32879g;
            } else {
                i3 = BottomSheetBehavior.this.f32875c;
            }
            if (i2 < i4) {
                return i4;
            }
            if (i2 > i3) {
                return i3;
            }
            return i2;
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final boolean a(View view, MotionEvent motionEvent) {
            if (view.getHeight() <= BottomSheetBehavior.this.f32873a && !BottomSheetBehavior.this.f32878f.a(view, 1, 1, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        public final boolean a(View view, int i2) {
            View view2;
            if (BottomSheetBehavior.this.f32877e == 1 || BottomSheetBehavior.this.f32884l) {
                return false;
            }
            if ((BottomSheetBehavior.this.f32877e != 3 || BottomSheetBehavior.this.f32883k != i2 || (view2 = BottomSheetBehavior.this.f32881i.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.f32880h != null && BottomSheetBehavior.this.f32880h.get() == view) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r8.getTop() < r7.f32890a.f32873a) goto L_0x0015;
         */
        @Override // com.bytedance.ies.bullet.service.popup.b.d.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r8, float r9) {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AnonymousClass3.a(android.view.View, float):void");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f32873a;

    /* renamed from: b  reason: collision with root package name */
    public int f32874b;

    /* renamed from: c  reason: collision with root package name */
    public int f32875c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32876d;

    /* renamed from: e  reason: collision with root package name */
    public int f32877e = 4;

    /* renamed from: f  reason: collision with root package name */
    public d f32878f;

    /* renamed from: g  reason: collision with root package name */
    public int f32879g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<V> f32880h;

    /* renamed from: i  reason: collision with root package name */
    public WeakReference<View> f32881i;

    /* renamed from: j  reason: collision with root package name */
    public a f32882j;

    /* renamed from: k  reason: collision with root package name */
    public int f32883k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f32884l;

    /* renamed from: m  reason: collision with root package name */
    public int f32885m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ValueAnimator r;
    public boolean s;
    private float t;
    private boolean u;
    private int v;
    private boolean w;
    private VelocityTracker x;
    private int y;
    private int z;

    public static abstract class a {
        static {
            Covode.recordClassIndex(19641);
        }

        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);

        public abstract void onEvent(String str);
    }

    static {
        Covode.recordClassIndex(19635);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        int height = coordinatorLayout.getHeight();
        this.f32879g = height;
        int max = Math.max(0, height - v2.getHeight());
        this.f32874b = max;
        int max2 = Math.max(this.f32879g - this.f32873a, max);
        this.f32875c = max2;
        int i3 = this.f32877e;
        if (i3 == 3) {
            v.d(v2, this.f32874b);
        } else if (this.f32876d && i3 == 5) {
            v.d(v2, this.f32879g);
        } else if (i3 == 4) {
            v.d(v2, max2);
        } else if (i3 == 1 || i3 == 2) {
            v.d(v2, top - v2.getTop());
        }
        if (this.f32878f == null) {
            this.f32878f = new d(coordinatorLayout.getContext(), coordinatorLayout, this.C);
        }
        this.f32880h = new WeakReference<>(v2);
        this.f32881i = new WeakReference<>(b(v2));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r6 != 3) goto L_0x0034;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r17, V r18, android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 569
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        if (view == this.f32881i.get()) {
            return this.f32877e != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    protected static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(19640);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        final int f32891a;

        static {
            Covode.recordClassIndex(19639);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f32891a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f32891a = i2;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f32891a);
        }
    }

    public BottomSheetBehavior() {
    }

    private void b() {
        this.f32883k = -1;
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.x = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f32893b;

        /* renamed from: c  reason: collision with root package name */
        private final int f32894c;

        static {
            Covode.recordClassIndex(19642);
        }

        public final void run() {
            if (BottomSheetBehavior.this.f32878f != null) {
                d dVar = BottomSheetBehavior.this.f32878f;
                if (dVar.f32925a == 2) {
                    boolean computeScrollOffset = dVar.f32937m.computeScrollOffset();
                    int currX = dVar.f32937m.getCurrX();
                    int currY = dVar.f32937m.getCurrY();
                    int left = currX - dVar.o.getLeft();
                    int top = currY - dVar.o.getTop();
                    if (left != 0) {
                        v.e(dVar.o, left);
                    }
                    if (top != 0) {
                        v.d(dVar.o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        dVar.n.a(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == dVar.f32937m.getFinalX() && currY == dVar.f32937m.getFinalY()) {
                            dVar.f32937m.abortAnimation();
                        }
                    }
                    dVar.q.post(dVar.r);
                }
                if (dVar.f32925a == 2) {
                    v.a(this.f32893b, this);
                    return;
                }
            }
            BottomSheetBehavior.this.d(this.f32894c);
            if (BottomSheetBehavior.this.f32882j != null && !BottomSheetBehavior.this.s) {
                if (BottomSheetBehavior.this.f32873a == BottomSheetBehavior.this.n) {
                    BottomSheetBehavior.this.f32882j.onEvent("enterFullScreen");
                } else {
                    BottomSheetBehavior.this.f32882j.onEvent("enterHalfScreen");
                }
                BottomSheetBehavior.this.s = true;
            }
        }

        b(View view, int i2) {
            this.f32893b = view;
            this.f32894c = i2;
        }
    }

    public final void b(int i2) {
        this.f32873a = Math.max(0, i2);
        this.f32875c = this.f32879g - i2;
    }

    public final void d(int i2) {
        a aVar;
        if (this.f32877e != i2) {
            this.f32877e = i2;
            V v2 = this.f32880h.get();
            if (v2 != null && (aVar = this.f32882j) != null) {
                aVar.a((View) v2, i2);
            }
        }
    }

    public static <V extends View> BottomSheetBehavior<V> a(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            if (bVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private View b(View view) {
        if (view instanceof j) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View b2 = b(viewGroup.getChildAt(i2));
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public final void e(int i2) {
        a aVar;
        V v2 = this.f32880h.get();
        if (v2 != null && (aVar = this.f32882j) != null) {
            int i3 = this.f32875c;
            if (i2 > i3) {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) this.f32873a));
            } else {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (i3 - this.f32874b)));
            }
        }
    }

    public final void c(int i2) {
        int i3;
        WeakReference<V> weakReference = this.f32880h;
        if (weakReference != null) {
            V v2 = weakReference.get();
            if (v2 != null) {
                if (i2 == 4) {
                    i3 = this.f32875c;
                } else if (i2 == 3) {
                    i3 = this.f32874b;
                } else if (!this.f32876d || i2 != 5) {
                    throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
                } else {
                    i3 = this.f32879g;
                }
                d(2);
                if (this.f32878f.a(v2, v2.getLeft(), i3)) {
                    v.a(v2, new b(v2, i2));
                }
            }
        } else if (i2 == 4 || i2 == 3 || (this.f32876d && i2 == 5)) {
            this.f32877e = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        this.v = 0;
        this.w = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f32877e);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc});
        b(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        this.f32876d = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.t = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v2, View view) {
        int i2;
        int i3 = 3;
        if (v2.getTop() == this.f32874b) {
            d(3);
        } else if (view == this.f32881i.get() && this.w) {
            if (this.v > 0) {
                i2 = this.f32874b;
            } else {
                if (this.f32876d) {
                    this.x.computeCurrentVelocity(1000, this.t);
                    if (a(v2, this.x.getYVelocity(this.f32883k))) {
                        i2 = this.f32879g;
                        i3 = 5;
                    }
                }
                if (this.v == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f32874b) < Math.abs(top - this.f32875c)) {
                        i2 = this.f32874b;
                    } else {
                        i2 = this.f32875c;
                    }
                } else {
                    i2 = this.f32875c;
                }
                i3 = 4;
            }
            if (this.f32878f.a(v2, v2.getLeft(), i2)) {
                d(2);
                v.a(v2, new b(v2, i3));
            } else {
                d(i3);
            }
            this.w = false;
        }
    }

    public final boolean a(View view, float f2) {
        if (view.getTop() >= this.f32875c && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f32875c)) / ((float) this.f32873a) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.getSuperState());
        if (savedState.f32891a == 1 || savedState.f32891a == 2) {
            this.f32877e = 4;
        } else {
            this.f32877e = savedState.f32891a;
        }
    }

    private void a(final CoordinatorLayout coordinatorLayout, final int i2, long j2) {
        if (this.r == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(coordinatorLayout.getHeight(), i2);
            this.r = ofInt;
            ofInt.setInterpolator(new a());
            this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(19636);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    coordinatorLayout.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    coordinatorLayout.requestLayout();
                }
            });
            this.r.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(19637);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.r = null;
                    int i2 = i2;
                    if (i2 == 0) {
                        BottomSheetBehavior.this.d(5);
                        BottomSheetBehavior.this.o = false;
                    } else if (i2 == BottomSheetBehavior.this.f32873a) {
                        BottomSheetBehavior.this.d(4);
                        if (BottomSheetBehavior.this.f32882j != null && !BottomSheetBehavior.this.s) {
                            if (BottomSheetBehavior.this.f32873a == BottomSheetBehavior.this.n) {
                                BottomSheetBehavior.this.f32882j.onEvent("enterFullScreen");
                            } else {
                                BottomSheetBehavior.this.f32882j.onEvent("enterHalfScreen");
                            }
                            BottomSheetBehavior.this.s = true;
                        }
                    } else {
                        if (i2 == BottomSheetBehavior.this.n && !BottomSheetBehavior.this.q) {
                            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                            bottomSheetBehavior.f32873a = bottomSheetBehavior.n;
                        }
                        if (BottomSheetBehavior.this.f32882j != null && !BottomSheetBehavior.this.s) {
                            BottomSheetBehavior.this.f32882j.onEvent("enterFullScreen");
                            BottomSheetBehavior.this.s = true;
                        }
                    }
                }
            });
            this.r.setDuration(j2);
            this.r.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        if (r8.f32927c == -1) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
        r8.b();
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r13, V r14, android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 792
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        if (view == this.f32881i.get()) {
            int top = v2.getTop();
            int i4 = top - i3;
            if (i3 > 0) {
                int i5 = this.f32874b;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    v.d(v2, -iArr[1]);
                    d(3);
                } else {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    d(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f32875c;
                if (i4 <= i6 || this.f32876d) {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    d(1);
                } else {
                    iArr[1] = top - i6;
                    v.d(v2, -iArr[1]);
                    d(4);
                }
            }
            e(v2.getTop());
            this.v = i3;
            this.w = true;
        }
    }
}
