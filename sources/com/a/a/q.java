package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView;
import com.zhiliaoapp.musically.R;

public final class q implements e {
    static {
        Covode.recordClassIndex(2022);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2820);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        CommerceProductInfoView commerceProductInfoView = new CommerceProductInfoView(context);
        commerceProductInfoView.setId(R.id.d_4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        a.a(commerceProductInfoView);
        if (commerceProductInfoView.getParent() == null) {
            frameLayout.addView(commerceProductInfoView, layoutParams);
        }
        CommerceProductInfoView commerceProductInfoView2 = new CommerceProductInfoView(context);
        commerceProductInfoView2.setId(R.id.d_2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        a.a(commerceProductInfoView2);
        if (commerceProductInfoView2.getParent() == null) {
            frameLayout.addView(commerceProductInfoView2, layoutParams2);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2820);
        return frameLayout;
    }
}
