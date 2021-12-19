package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ci implements e {
    static {
        Covode.recordClassIndex(1999);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        float f2;
        MethodCollector.i(426);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.cn2);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(1, 101.0f, resources.getDisplayMetrics()));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.agl);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 85.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("app:roundedCornerRadius", new a.d("2", "dp"), remoteImageView, layoutParams);
        aVar.a("fresco:failureImage", new a.b("2131099674", b.f37372a), remoteImageView, layoutParams);
        aVar.a("fresco:placeholderImage", new a.b("2131099674", b.f37372a), remoteImageView, layoutParams);
        aVar.a(remoteImageView, layoutParams);
        android.view.a.a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView, layoutParams);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i4 = Build.VERSION.SDK_INT;
            f2 = 16.0f;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.agl);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.cn0);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(3);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        f.a("app:tux_font", new a.c("H4_Regular"), tuxTextView, layoutParams3);
        f.a(tuxTextView, layoutParams3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout2.addView(tuxTextView, layoutParams3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.cn1);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(3, R.id.cn0);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView2, layoutParams4);
        f.a(tuxTextView2, layoutParams4);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout2.addView(tuxTextView2, layoutParams4);
        }
        android.view.a.a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams2);
        }
        android.view.a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(426);
        return relativeLayout;
    }
}
