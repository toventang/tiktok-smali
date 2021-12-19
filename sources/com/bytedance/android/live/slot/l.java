package com.bytedance.android.live.slot;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL2SlotWidget.AnonymousClass2.AnonymousClass3 f12782a;

    /* renamed from: b  reason: collision with root package name */
    private final View f12783b;

    static {
        Covode.recordClassIndex(7108);
    }

    l(FrameL2SlotWidget.AnonymousClass2.AnonymousClass3 r1, View view) {
        this.f12782a = r1;
        this.f12783b = view;
    }

    public final void run() {
        MethodCollector.i(10789);
        FrameL2SlotWidget.AnonymousClass2.AnonymousClass3 r2 = this.f12782a;
        View view = this.f12783b;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            FrameL2SlotWidget.this.hide();
        }
        MethodCollector.o(10789);
    }
}
