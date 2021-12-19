package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.android.widget.c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class RecyclableWidgetManager$$Lambda$1 implements c.d {
    private final RecyclableWidgetManager arg$1;
    private final LiveRecyclableWidget arg$2;
    private final WidgetContainer arg$3;

    static {
        Covode.recordClassIndex(20724);
    }

    RecyclableWidgetManager$$Lambda$1(RecyclableWidgetManager recyclableWidgetManager, LiveRecyclableWidget liveRecyclableWidget, WidgetContainer widgetContainer) {
        this.arg$1 = recyclableWidgetManager;
        this.arg$2 = liveRecyclableWidget;
        this.arg$3 = widgetContainer;
    }

    @Override // com.bytedance.android.widget.c.d
    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
        this.arg$1.lambda$generateNewWidget$1$RecyclableWidgetManager(this.arg$2, this.arg$3, view, i2, viewGroup);
    }
}
