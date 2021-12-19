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
import com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView;
import com.zhiliaoapp.musically.R;

public final class w implements e {
    static {
        Covode.recordClassIndex(2028);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(906);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.abk);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        PdpSelectItemView pdpSelectItemView = new PdpSelectItemView(context);
        pdpSelectItemView.setId(R.id.dxg);
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), (int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingRight(), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), pdpSelectItemView.getPaddingTop(), pdpSelectItemView.getPaddingRight(), (int) resources.getDimension(R.dimen.fj));
        pdpSelectItemView.setPadding((int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingTop(), pdpSelectItemView.getPaddingRight(), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding((int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingTop(), pdpSelectItemView.getPaddingRight(), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), pdpSelectItemView.getPaddingTop(), (int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), pdpSelectItemView.getPaddingTop(), (int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        a.a(pdpSelectItemView);
        if (pdpSelectItemView.getParent() == null) {
            frameLayout.addView(pdpSelectItemView, layoutParams);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(906);
        return frameLayout;
    }
}
