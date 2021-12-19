package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class c extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    static int f88650a = 16;

    static {
        Covode.recordClassIndex(55782);
    }

    public c(Context context) {
        super(context, null);
        MethodCollector.i(5045);
        setOverScrollMode(2);
        MethodCollector.o(5045);
    }

    public final void a(View view) {
        if (getWidth() == 0) {
            postDelayed(new d(this, view), 100);
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }
}
