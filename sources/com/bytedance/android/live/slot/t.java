package com.bytedance.android.live.slot;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FrameSlotWidget.AnonymousClass2.AnonymousClass2 f12792a;

    /* renamed from: b  reason: collision with root package name */
    private final View f12793b;

    static {
        Covode.recordClassIndex(7116);
    }

    t(FrameSlotWidget.AnonymousClass2.AnonymousClass2 r1, View view) {
        this.f12792a = r1;
        this.f12793b = view;
    }

    public final void run() {
        MethodCollector.i(9676);
        FrameSlotWidget.AnonymousClass2.AnonymousClass2 r2 = this.f12792a;
        View view = this.f12793b;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            FrameSlotWidget.this.hide();
        }
        MethodCollector.o(9676);
    }
}
