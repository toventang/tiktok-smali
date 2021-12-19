package com.bytedance.android.widget;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.widget.c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final WidgetManager f24338a;

    /* renamed from: b  reason: collision with root package name */
    private final Widget f24339b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f24340c;

    static {
        Covode.recordClassIndex(14291);
    }

    g(WidgetManager widgetManager, Widget widget, ViewGroup viewGroup) {
        this.f24338a = widgetManager;
        this.f24339b = widget;
        this.f24340c = viewGroup;
    }

    @Override // com.bytedance.android.widget.c.d
    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
        this.f24338a.lambda$loadOld$1$WidgetManager(this.f24339b, this.f24340c, view, i2, viewGroup);
    }
}
