package com.bytedance.ies.sdk.widgets;

import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class RecyclableWidgetManager$$Lambda$0 implements Runnable {
    private final RecyclableWidgetManager arg$1;
    private final LiveRecyclableWidget arg$2;
    private final WidgetContainer arg$3;

    static {
        Covode.recordClassIndex(20723);
    }

    RecyclableWidgetManager$$Lambda$0(RecyclableWidgetManager recyclableWidgetManager, LiveRecyclableWidget liveRecyclableWidget, WidgetContainer widgetContainer) {
        this.arg$1 = recyclableWidgetManager;
        this.arg$2 = liveRecyclableWidget;
        this.arg$3 = widgetContainer;
    }

    public final void run() {
        this.arg$1.lambda$generateNewWidget$0$RecyclableWidgetManager(this.arg$2, this.arg$3);
    }
}
