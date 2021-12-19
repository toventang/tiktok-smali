package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.f.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.bk;
import com.bytedance.android.livesdk.chatroom.b;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.p;

final /* synthetic */ class x implements f {

    /* renamed from: a  reason: collision with root package name */
    private final SplitScreenWidget f16676a;

    static {
        Covode.recordClassIndex(9254);
    }

    x(SplitScreenWidget splitScreenWidget) {
        this.f16676a = splitScreenWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        SplitScreenWidget splitScreenWidget = this.f16676a;
        s sVar = (s) obj;
        if (splitScreenWidget.f16619a != null && sVar != null && b.a(splitScreenWidget.dataChannel)) {
            if (!sVar.f15147b) {
                n.a(splitScreenWidget.f16619a.f14942c, y.d(R.dimen.wo), -1);
                n.a(splitScreenWidget.f16619a.f14943d, -1, -1);
                return;
            }
            int b2 = y.b() - (sVar.f15146a + y.d(R.dimen.wp));
            p pVar = (p) splitScreenWidget.dataChannel.b(bk.class);
            if (pVar == null || ((Integer) pVar.getFirst()).intValue() <= 0 || ((Integer) pVar.getSecond()).intValue() <= 0) {
                n.a(splitScreenWidget.f16619a.f14942c, y.d(R.dimen.wm), -1);
            } else {
                int c2 = y.c() - ((((Integer) pVar.getFirst()).intValue() / ((Integer) pVar.getSecond()).intValue()) * b2);
                if (d.a(splitScreenWidget.getContext())) {
                    c2 -= y.d();
                }
                n.a(splitScreenWidget.f16619a.f14942c, c2, -1);
            }
            n.a(splitScreenWidget.f16619a.f14943d, -1, b2 - y.a(24.0f));
        }
    }
}
