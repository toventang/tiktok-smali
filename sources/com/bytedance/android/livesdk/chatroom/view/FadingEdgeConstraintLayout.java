package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class FadingEdgeConstraintLayout extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private final float f16226g;

    static {
        Covode.recordClassIndex(8990);
    }

    public FadingEdgeConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float getLeftFadingEdgeStrength() {
        if (!isHorizontalFadingEdgeEnabled() || !a.a(getContext()) || !b()) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public final float getRightFadingEdgeStrength() {
        if (!isHorizontalFadingEdgeEnabled() || a.a(getContext()) || !b()) {
            return 0.0f;
        }
        return 1.0f;
    }

    private final boolean b() {
        int i2;
        int i3;
        float paddingLeft = (this.f16226g - ((float) getPaddingLeft())) - ((float) getPaddingRight());
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float measuredWidth = paddingLeft - ((float) childAt.getMeasuredWidth());
                if (marginLayoutParams != null) {
                    i2 = marginLayoutParams.leftMargin;
                } else {
                    i2 = 0;
                }
                float f2 = measuredWidth - ((float) i2);
                if (marginLayoutParams != null) {
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                }
                paddingLeft = f2 - ((float) i3);
                if (paddingLeft < 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    private /* synthetic */ FadingEdgeConstraintLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FadingEdgeConstraintLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f16226g = context.getResources().getDimension(R.dimen.vi);
    }
}
