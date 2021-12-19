package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.zhiliaoapp.musically.R;

public final class bt implements e {
    static {
        Covode.recordClassIndex(1983);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(669);
        Resources resources = context.getResources();
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        adHalfWebPageContainer.setId(R.id.gt);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 81;
        }
        if (DrawerLayout.d.class.isInstance(a2)) {
            ((DrawerLayout.d) a2).f2691a = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.bottomMargin = (int) TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        a.a(adHalfWebPageContainer);
        adHalfWebPageContainer.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(adHalfWebPageContainer);
        }
        MethodCollector.o(669);
        return adHalfWebPageContainer;
    }
}
