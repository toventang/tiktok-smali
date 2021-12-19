package com.bytedance.android.widget;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.widget.c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final WidgetManager f24335a;

    /* renamed from: b  reason: collision with root package name */
    private final Widget f24336b;

    /* renamed from: c  reason: collision with root package name */
    private final WidgetContainer f24337c;

    static {
        Covode.recordClassIndex(14290);
    }

    f(WidgetManager widgetManager, Widget widget, WidgetContainer widgetContainer) {
        this.f24335a = widgetManager;
        this.f24336b = widget;
        this.f24337c = widgetContainer;
    }

    @Override // com.bytedance.android.widget.c.d
    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
        this.f24335a.lambda$loadNew$0$WidgetManager(this.f24336b, this.f24337c, view, i2, viewGroup);
    }
}
