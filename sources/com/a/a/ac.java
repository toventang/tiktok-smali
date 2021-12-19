package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ac implements e {
    static {
        Covode.recordClassIndex(1939);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(5225);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) resources.getDimension(R.dimen.fj), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setText(R.string.bii);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, layoutParams);
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        View a3 = com.a.b.a.a(context, R.layout.q8, linearLayout, false, R.layout.qt);
        a3.setId(R.id.e36);
        if (a3.getParent() == null) {
            linearLayout.addView(a3);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(5225);
        return linearLayout;
    }
}
