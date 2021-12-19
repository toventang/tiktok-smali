package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class LiveCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: h  reason: collision with root package name */
    private float f16579h;

    /* renamed from: i  reason: collision with root package name */
    private float f16580i;

    /* renamed from: j  reason: collision with root package name */
    private float f16581j;

    /* renamed from: k  reason: collision with root package name */
    private View f16582k;

    /* renamed from: l  reason: collision with root package name */
    private View f16583l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16584m;
    private boolean n;

    static {
        Covode.recordClassIndex(9191);
    }

    public LiveCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        View view = this.f16583l;
        if (view == null) {
            l.a("bottom");
        }
        int translationY = (int) view.getTranslationY();
        View view2 = this.f16583l;
        if (view2 == null) {
            l.a("bottom");
        }
        if (translationY > (-view2.getHeight())) {
            return 1.0f;
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            l.b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            if (bVar instanceof ScrollHeaderBehavior) {
                this.f16582k = childAt;
            }
            if (bVar instanceof SuctionBottomBehavior) {
                this.f16583l = childAt;
                this.n = ((SuctionBottomBehavior) bVar).f15051b;
            }
        }
    }

    private final void a(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        this.f16581j = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f16580i = motionEvent.getY();
            this.f16584m = false;
        } else if (motionEvent.getAction() == 2) {
            float f2 = this.f16581j - this.f16580i;
            this.f16579h = f2;
            if (f2 > 0.0f) {
                View view = this.f16582k;
                if (view == null) {
                    l.a("header");
                }
                if (!view.canScrollVertically(-1)) {
                    View view2 = this.f16582k;
                    if (view2 == null) {
                        l.a("header");
                    }
                    if ((view2.getMeasuredHeight() == getMeasuredHeight() || !this.n) && !this.f16584m) {
                        a(false);
                    }
                }
                this.f16584m = true;
                a(true);
            }
            if (this.f16579h < 0.0f) {
                View view3 = this.f16583l;
                if (view3 == null) {
                    l.a("bottom");
                }
                int translationY = (int) view3.getTranslationY();
                View view4 = this.f16583l;
                if (view4 == null) {
                    l.a("bottom");
                }
                if (translationY == (-view4.getHeight())) {
                    View view5 = this.f16582k;
                    if (view5 == null) {
                        l.a("header");
                    }
                    if (!view5.canScrollVertically(1) && !this.f16584m) {
                        a(false);
                    }
                }
                this.f16584m = true;
                a(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ LiveCoordinatorLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveCoordinatorLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setWillNotDraw(false);
    }
}
