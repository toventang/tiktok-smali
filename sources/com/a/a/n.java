package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class n implements e {
    static {
        Covode.recordClassIndex(2019);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(235);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) resources.getDimension(R.dimen.fj), (int) resources.getDimension(R.dimen.fj), (int) resources.getDimension(R.dimen.fj), (int) resources.getDimension(R.dimen.fj));
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setVisibility(8);
        frameLayout.setId(R.id.aoo);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.yw);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 17;
        }
        a.a(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams2);
        }
        a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.text);
        tuxTextView.setTextAlignment(5);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ConstraintLayout.a.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.a) layoutParams3).p = R.id.aoo;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.a) layoutParams3).f2051h = 0;
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView, layoutParams3);
        tuxTextView.setGravity(8388611);
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
        MethodCollector.o(235);
        return linearLayout;
    }
}
