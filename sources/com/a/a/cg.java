package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout;
import com.zhiliaoapp.musically.R;

public final class cg implements e {
    static {
        Covode.recordClassIndex(1997);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2062);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        FeedMultiTagLayout feedMultiTagLayout = new FeedMultiTagLayout(context);
        feedMultiTagLayout.setId(R.id.b1p);
        feedMultiTagLayout.setClickable(true);
        feedMultiTagLayout.setFocusable(true);
        feedMultiTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.a0z));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        }
        a.a(feedMultiTagLayout);
        if (feedMultiTagLayout.getParent() == null) {
            linearLayout.addView(feedMultiTagLayout, layoutParams);
        }
        a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(2062);
        return linearLayout;
    }
}
