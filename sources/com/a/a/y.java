package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.LinearLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class y implements e {
    static {
        Covode.recordClassIndex(2030);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2319);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            int i2 = Build.VERSION.SDK_INT;
            a2.setMarginStart((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        View a3 = com.a.b.a.a(context, R.layout.qc, linearLayout, false, R.layout.qb);
        if (a3.getParent() == null) {
            linearLayout.addView(a3);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.dmk);
        viewStub.setLayoutResource(R.layout.qc);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams);
        }
        a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(2319);
        return linearLayout;
    }
}
