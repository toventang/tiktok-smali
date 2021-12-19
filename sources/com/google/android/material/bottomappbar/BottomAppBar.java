package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.i.c;
import java.util.ArrayList;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f52259a;

    /* renamed from: b  reason: collision with root package name */
    public final a f52260b;

    /* renamed from: c  reason: collision with root package name */
    public Animator f52261c;

    /* renamed from: d  reason: collision with root package name */
    public Animator f52262d;

    /* renamed from: e  reason: collision with root package name */
    public Animator f52263e;

    /* renamed from: f  reason: collision with root package name */
    public int f52264f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f52265g;

    /* renamed from: h  reason: collision with root package name */
    AnimatorListenerAdapter f52266h;

    /* renamed from: i  reason: collision with root package name */
    private final int f52267i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52268j;

    static {
        Covode.recordClassIndex(32452);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }

    public final int getFabAlignmentMode() {
        return this.f52264f;
    }

    public final boolean getHideOnScroll() {
        return this.f52268j;
    }

    private float getFabTranslationX() {
        return (float) a(this.f52264f);
    }

    public final ColorStateList getBackgroundTint() {
        return this.f52259a.f52456i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final CoordinatorLayout.b<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public final float getCradleVerticalOffset() {
        return this.f52260b.f52283d;
    }

    public final float getFabCradleMargin() {
        return this.f52260b.f52281b;
    }

    public final float getFabCradleRoundedCornerRadius() {
        return this.f52260b.f52280a;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: b  reason: collision with root package name */
        private final Rect f52277b = new Rect();

        static {
            Covode.recordClassIndex(32457);
        }

        public Behavior() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ void a(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.a(bottomAppBar2);
            FloatingActionButton a2 = bottomAppBar2.a();
            if (a2 != null) {
                a2.clearAnimation();
                a2.animate().translationY(bottomAppBar2.getFabTranslationY()).setInterpolator(a.f52129d).setDuration(225);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ void b(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.b(bottomAppBar2);
            FloatingActionButton a2 = bottomAppBar2.a();
            if (a2 != null) {
                a2.a(this.f52277b);
                float measuredHeight = (float) (a2.getMeasuredHeight() - this.f52277b.height());
                a2.clearAnimation();
                a2.animate().translationY(((float) (-a2.getPaddingBottom())) + measuredHeight).setInterpolator(a.f52128c).setDuration(175);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: private */
        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            FloatingActionButton a2 = bottomAppBar.a();
            if (a2 != null) {
                ((CoordinatorLayout.e) a2.getLayoutParams()).f2103d = 17;
                AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.f52266h;
                com.google.android.material.floatingactionbutton.a impl = a2.getImpl();
                if (impl.t != null) {
                    impl.t.remove(animatorListenerAdapter);
                }
                AnimatorListenerAdapter animatorListenerAdapter2 = bottomAppBar.f52266h;
                com.google.android.material.floatingactionbutton.a impl2 = a2.getImpl();
                if (impl2.s != null) {
                    impl2.s.remove(animatorListenerAdapter2);
                }
                AnimatorListenerAdapter animatorListenerAdapter3 = bottomAppBar.f52266h;
                com.google.android.material.floatingactionbutton.a impl3 = a2.getImpl();
                if (impl3.t == null) {
                    impl3.t = new ArrayList<>();
                }
                impl3.t.add(animatorListenerAdapter3);
                AnimatorListenerAdapter animatorListenerAdapter4 = bottomAppBar.f52266h;
                com.google.android.material.floatingactionbutton.a impl4 = a2.getImpl();
                if (impl4.s == null) {
                    impl4.s = new ArrayList<>();
                }
                impl4.s.add(animatorListenerAdapter4);
                Rect rect = this.f52277b;
                rect.set(0, 0, a2.getMeasuredWidth(), a2.getMeasuredHeight());
                a2.b(rect);
                bottomAppBar.setFabDiameter(this.f52277b.height());
            }
            if ((bottomAppBar.f52261c == null || !bottomAppBar.f52261c.isRunning()) && ((bottomAppBar.f52263e == null || !bottomAppBar.f52263e.isRunning()) && (bottomAppBar.f52262d == null || !bottomAppBar.f52262d.isRunning()))) {
                bottomAppBar.b();
            }
            coordinatorLayout.a(bottomAppBar, i2);
            return super.a(coordinatorLayout, (View) bottomAppBar, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll() || !super.a(coordinatorLayout, bottomAppBar, view2, view3, i2, i3)) {
                return false;
            }
            return true;
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomappbar.BottomAppBar.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32459);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        int f52278a;

        /* renamed from: b  reason: collision with root package name */
        boolean f52279b;

        static {
            Covode.recordClassIndex(32458);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f52278a);
            parcel.writeInt(this.f52279b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f52278a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f52279b = z;
        }
    }

    private boolean c() {
        FloatingActionButton a2 = a();
        if (a2 == null || !a2.getImpl().f()) {
            return false;
        }
        return true;
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f52278a = this.f52264f;
        savedState.f52279b = this.f52265g;
        return savedState;
    }

    public final FloatingActionButton a() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).c(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    public final void b() {
        float f2;
        this.f52260b.f52284e = getFabTranslationX();
        FloatingActionButton a2 = a();
        c cVar = this.f52259a;
        if (!this.f52265g || !c()) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        cVar.a(f2);
        if (a2 != null) {
            a2.setTranslationY(getFabTranslationY());
            a2.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!c()) {
                a(actionMenuView, 0, false);
            } else {
                a(actionMenuView, this.f52264f, this.f52265g);
            }
        }
    }

    public final float getFabTranslationY() {
        boolean z = this.f52265g;
        FloatingActionButton a2 = a();
        if (a2 == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        a2.a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) a2.getMeasuredHeight();
        }
        float height2 = (float) (a2.getHeight() - rect.bottom);
        float height3 = (float) (a2.getHeight() - rect.height());
        float f2 = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float paddingBottom = height3 - ((float) a2.getPaddingBottom());
        float f3 = (float) (-getMeasuredHeight());
        if (!z) {
            f2 = paddingBottom;
        }
        return f3 + f2;
    }

    public final void setHideOnScroll(boolean z) {
        this.f52268j = z;
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.a(this.f52259a, colorStateList);
    }

    private int a(int i2) {
        boolean z;
        int i3 = 1;
        if (v.e(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f52267i;
        if (z) {
            i3 = -1;
        }
        return measuredWidth * i3;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        this.f52264f = savedState.f52278a;
        this.f52265g = savedState.f52279b;
    }

    public final void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            this.f52260b.f52283d = f2;
            this.f52259a.invalidateSelf();
        }
    }

    public final void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            this.f52260b.f52281b = f2;
            this.f52259a.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            this.f52260b.f52280a = f2;
            this.f52259a.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setFabDiameter(int i2) {
        float f2 = (float) i2;
        if (f2 != this.f52260b.f52282c) {
            this.f52260b.f52282c = f2;
            this.f52259a.invalidateSelf();
        }
    }

    public final void setFabAlignmentMode(int i2) {
        final int i3;
        if (this.f52264f != i2 && v.v(this)) {
            Animator animator = this.f52262d;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f52265g) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52260b.f52284e, (float) a(i2));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.bottomappbar.BottomAppBar.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(32454);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BottomAppBar.this.f52260b.f52284e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BottomAppBar.this.f52259a.invalidateSelf();
                    }
                });
                ofFloat.setDuration(300L);
                arrayList.add(ofFloat);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a(), "translationX", (float) a(i2));
            ofFloat2.setDuration(300L);
            arrayList.add(ofFloat2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f52262d = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(32453);
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f52262d = null;
                }
            });
            this.f52262d.start();
        }
        final boolean z = this.f52265g;
        if (v.v(this)) {
            Animator animator2 = this.f52263e;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!c()) {
                z = false;
                i3 = 0;
            } else {
                i3 = i2;
            }
            final ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if ((this.f52265g || (z && c())) && (this.f52264f == 1 || i3 == 1)) {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat4.addListener(new AnimatorListenerAdapter() {
                        /* class com.google.android.material.bottomappbar.BottomAppBar.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        public boolean f52272a;

                        static {
                            Covode.recordClassIndex(32456);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            this.f52272a = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.f52272a) {
                                BottomAppBar.this.a(actionMenuView, i3, z);
                            }
                        }
                    });
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(ofFloat4, ofFloat3);
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat3);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f52263e = animatorSet3;
            animatorSet3.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(32455);
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f52263e = null;
                }
            });
            this.f52263e.start();
        }
        this.f52264f = i2;
    }

    public final void a(ActionMenuView actionMenuView, int i2, boolean z) {
        boolean z2;
        int left;
        float f2;
        int right;
        if (v.e(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof Toolbar.b) && (((Toolbar.b) childAt.getLayoutParams()).f895a & 8388615) == 8388611) {
                if (z2) {
                    right = childAt.getLeft();
                } else {
                    right = childAt.getRight();
                }
                i3 = Math.max(i3, right);
            }
        }
        if (z2) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        int i5 = i3 - left;
        if (i2 != 1 || !z) {
            f2 = 0.0f;
        } else {
            f2 = (float) i5;
        }
        actionMenuView.setTranslationX(f2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        Animator animator = this.f52261c;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f52263e;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f52262d;
        if (animator3 != null) {
            animator3.cancel();
        }
        b();
    }
}
