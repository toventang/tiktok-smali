package com.bytedance.android.livesdk.container.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.livesetting.hybrid.ContainerBehaviorEnableSetting;
import com.bytedance.covode.number.Covode;

public class ContainerBottomSheetBehavior<V extends View> extends LiveBottomSheetBehavior<V> {
    public boolean v;

    static {
        Covode.recordClassIndex(9278);
    }

    public ContainerBottomSheetBehavior() {
    }

    public static <V extends View> ContainerBottomSheetBehavior<V> b(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            if (bVar instanceof ContainerBottomSheetBehavior) {
                return (ContainerBottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public ContainerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!ContainerBehaviorEnableSetting.INSTANCE.getValue()) {
            return super.a(coordinatorLayout, (View) v2, motionEvent);
        }
        if (!this.v) {
            return super.a(coordinatorLayout, (View) v2, motionEvent);
        }
        if (a(v2, 1, 1, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.a(coordinatorLayout, (View) v2, motionEvent);
    }

    private boolean a(View view, int i2, int i3, int i4, int i5) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && a(childAt, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (view.canScrollHorizontally(-i2) || view.canScrollVertically(-i3)) {
            return true;
        }
        return false;
    }
}
