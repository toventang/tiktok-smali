package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class u implements e {
    static {
        Covode.recordClassIndex(2026);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(684);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) resources.getDimension(R.dimen.fj), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            int i2 = Build.VERSION.SDK_INT;
            a2.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            int i3 = Build.VERSION.SDK_INT;
            a2.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View a3 = com.a.b.a.a(context, R.layout.qe, linearLayout, false, R.layout.q4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2047d = 0;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.a) layoutParams).f2050g = 0;
        }
        if (a3.getParent() == null) {
            linearLayout.addView(a3, layoutParams);
        }
        View a4 = com.a.b.a.a(context, R.layout.qb, linearLayout, false, R.layout.q4);
        if (a4.getParent() == null) {
            linearLayout.addView(a4);
        }
        a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(684);
        return linearLayout;
    }
}
