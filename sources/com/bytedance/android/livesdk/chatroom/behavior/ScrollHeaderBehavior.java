package com.bytedance.android.livesdk.chatroom.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class ScrollHeaderBehavior extends CoordinatorLayout.b<View> {

    /* renamed from: a  reason: collision with root package name */
    public b<? super View, z> f15047a;

    /* renamed from: b  reason: collision with root package name */
    private float f15048b;

    static {
        Covode.recordClassIndex(8361);
    }

    public ScrollHeaderBehavior() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        l.d(coordinatorLayout, "");
        l.d(view, "");
        l.d(view2, "");
        return l.a(view2, coordinatorLayout.findViewWithTag("suctionBottomView"));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        l.d(coordinatorLayout, "");
        l.d(view, "");
        l.d(view2, "");
        if (this.f15048b == view2.getTranslationY()) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (((float) coordinatorLayout.getMeasuredHeight()) + view2.getTranslationY());
        view.setLayoutParams(layoutParams);
        b<? super View, z> bVar = this.f15047a;
        if (bVar == null) {
            return false;
        }
        bVar.invoke(view2);
        return false;
    }
}
