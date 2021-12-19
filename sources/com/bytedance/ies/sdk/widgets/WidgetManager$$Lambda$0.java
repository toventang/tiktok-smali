package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class WidgetManager$$Lambda$0 implements a.d {
    private final WidgetManager arg$1;
    private final Widget arg$2;
    private final ViewGroup arg$3;

    static {
        Covode.recordClassIndex(20732);
    }

    WidgetManager$$Lambda$0(WidgetManager widgetManager, Widget widget, ViewGroup viewGroup) {
        this.arg$1 = widgetManager;
        this.arg$2 = widget;
        this.arg$3 = viewGroup;
    }

    @Override // androidx.b.a.a.d
    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
        this.arg$1.lambda$load$0$WidgetManager(this.arg$2, this.arg$3, view, i2, viewGroup);
    }
}
