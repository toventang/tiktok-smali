package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class as implements e {
    static {
        Covode.recordClassIndex(1955);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(4570);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.ed9);
        viewStub.setInflatedId(R.id.c0v);
        viewStub.setLayoutResource(R.layout.mg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(4570);
        return frameLayout;
    }
}
