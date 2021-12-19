package com.bytedance.android.livesdk.toolbar.a;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.toolbar.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f21678a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f21679b;

    /* renamed from: c  reason: collision with root package name */
    private final View f21680c;

    static {
        Covode.recordClassIndex(12785);
    }

    e(d dVar, DataChannel dataChannel, View view) {
        this.f21678a = dVar;
        this.f21679b = dataChannel;
        this.f21680c = view;
    }

    public final void run() {
        MethodCollector.i(9086);
        d dVar = this.f21678a;
        DataChannel dataChannel = this.f21679b;
        View view = this.f21680c;
        Boolean bool = (Boolean) dataChannel.b(ea.class);
        if (bool != null && bool.booleanValue()) {
            a.a(dVar.f21675a);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(new com.bytedance.android.livesdk.r.a(dVar.f21676b, dataChannel));
        frameLayout.setClipChildren(false);
        MethodCollector.o(9086);
    }
}
