package com.bytedance.android.live.slot;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL3SlotWidget.AnonymousClass2.AnonymousClass3 f12789a;

    /* renamed from: b  reason: collision with root package name */
    private final View f12790b;

    static {
        Covode.recordClassIndex(7114);
    }

    r(FrameL3SlotWidget.AnonymousClass2.AnonymousClass3 r1, View view) {
        this.f12789a = r1;
        this.f12790b = view;
    }

    public final void run() {
        MethodCollector.i(10630);
        FrameL3SlotWidget.AnonymousClass2.AnonymousClass3 r2 = this.f12789a;
        View view = this.f12790b;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            FrameL3SlotWidget.this.hide();
        }
        MethodCollector.o(10630);
    }
}
