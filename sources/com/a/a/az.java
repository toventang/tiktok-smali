package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class az implements e {
    static {
        Covode.recordClassIndex(1962);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2102);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.ac7);
        relativeLayout.setClickable(true);
        relativeLayout.setFocusable(true);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        relativeLayout.setGravity(17);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setBackgroundResource(R.drawable.a03);
        appCompatImageView.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.co6);
        appCompatImageView.setClickable(false);
        appCompatImageView.setImageResource(2131231760);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) resources.getDimension(R.dimen.fx), (int) resources.getDimension(R.dimen.fu));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(13, -1);
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView, layoutParams);
        }
        a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(2102);
        return relativeLayout;
    }
}
