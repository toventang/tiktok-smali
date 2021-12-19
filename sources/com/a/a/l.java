package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

public final class l implements e {
    static {
        Covode.recordClassIndex(2017);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(5022);
        Resources resources = context.getResources();
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.bm4);
        smartImageView.setBackgroundColor(resources.getColor(R.color.v));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("app:placeholderImage", new a.b("2131231669", "drawable"), smartImageView, a2);
        aVar.a("app:placeholderImageScaleType", new a.c("center"), smartImageView, a2);
        aVar.a(smartImageView, a2);
        android.view.a.a(smartImageView);
        smartImageView.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(smartImageView);
        }
        MethodCollector.o(5022);
        return smartImageView;
    }
}
