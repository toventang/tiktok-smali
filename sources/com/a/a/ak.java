package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class ak implements e {
    static {
        Covode.recordClassIndex(1947);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1491);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.b1x);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        View a3 = com.a.b.a.a(context, R.layout.s4, frameLayout, false, R.layout.s7);
        if (a3.getParent() == null) {
            frameLayout.addView(a3);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.alh);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams);
        }
        View a4 = com.a.b.a.a(context, R.layout.sn, frameLayout, false, R.layout.s7);
        if (a4.getParent() == null) {
            frameLayout.addView(a4);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(1491);
        return frameLayout;
    }
}
