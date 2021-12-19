package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.zhiliaoapp.musically.R;

public final class o implements e {
    static {
        Covode.recordClassIndex(2020);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2417);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        View view = new View(context);
        ConstraintLayout.a aVar = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(aVar)) {
            ((RelativeLayout.LayoutParams) aVar).addRule(13, -1);
        }
        aVar.B = "h,375:210";
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        a.a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, aVar);
        }
        TuxPlayerView tuxPlayerView = new TuxPlayerView(context);
        tuxPlayerView.setId(R.id.euf);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(aVar2)) {
            ((RelativeLayout.LayoutParams) aVar2).addRule(13, -1);
        }
        aVar2.B = "h,375:210";
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        a.a(tuxPlayerView);
        if (tuxPlayerView.getParent() == null) {
            constraintLayout.addView(tuxPlayerView, aVar2);
        }
        a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(2417);
        return constraintLayout;
    }
}
