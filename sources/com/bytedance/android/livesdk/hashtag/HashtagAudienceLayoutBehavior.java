package com.bytedance.android.livesdk.hashtag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import h.f.b.l;
import java.util.Objects;

public final class HashtagAudienceLayoutBehavior extends AppBarLayout.ScrollingViewBehavior {
    static {
        Covode.recordClassIndex(10054);
    }

    public HashtagAudienceLayoutBehavior() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashtagAudienceLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b, com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        l.d(coordinatorLayout, "");
        l.d(view, "");
        l.d(view2, "");
        if (!(view2 instanceof AppBarLayout)) {
            return super.b(coordinatorLayout, view, view2);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
        eVar.height = coordinatorLayout.getHeight() - ((AppBarLayout) view2).getBottom();
        view.setLayoutParams(eVar);
        return super.b(coordinatorLayout, view, view2);
    }
}
