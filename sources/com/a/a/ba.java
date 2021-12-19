package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ba implements e {
    static {
        Covode.recordClassIndex(1964);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2932);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.am7);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(R.drawable.a03);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.e0s);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.fx), (int) resources.getDimension(R.dimen.fu));
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.e10);
        remoteImageView.setImageResource(2131233113);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -1);
        a.a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            frameLayout.addView(remoteImageView, layoutParams2);
        }
        a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.iu));
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        tuxTextView.setId(R.id.e0v);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, -1.4f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(17);
        f.a("app:tux_font", new a.c("P3_Semibold"), tuxTextView, layoutParams3);
        f.a(tuxTextView, layoutParams3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams3);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(2932);
        return linearLayout;
    }
}
