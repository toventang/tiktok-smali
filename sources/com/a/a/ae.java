package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ae implements e {
    static {
        Covode.recordClassIndex(1941);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(3839);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(resources.getColor(R.color.a4));
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.b0m);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755302", "raw"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.b0l);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.aa));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView, layoutParams2);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(3839);
        return linearLayout;
    }
}
