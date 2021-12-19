package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

public final class m implements e {
    static {
        Covode.recordClassIndex(2018);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1066);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.ab2);
        smartImageView.setBackgroundColor(resources.getColor(R.color.v));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        a.a(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(1066);
        return frameLayout;
    }
}
