package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.livesdk.chatroom.b;
import com.bytedance.android.livesdk.chatroom.c.n;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final SplitScreenWidget f16675a;

    static {
        Covode.recordClassIndex(9253);
    }

    w(SplitScreenWidget splitScreenWidget) {
        this.f16675a = splitScreenWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        SplitScreenWidget splitScreenWidget = this.f16675a;
        n nVar = (n) obj;
        if (splitScreenWidget.f16619a != null && b.a(splitScreenWidget.dataChannel) && nVar != null && nVar.f15132b == 1) {
            splitScreenWidget.a(!nVar.f15131a.get(1, false), true);
        }
    }
}
