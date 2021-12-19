package com.bytedance.android.livesdk.chatroom.widget;

import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class u implements f {

    /* renamed from: a  reason: collision with root package name */
    private final OrientationChangeWidget f16673a;

    static {
        Covode.recordClassIndex(9251);
    }

    u(OrientationChangeWidget orientationChangeWidget) {
        this.f16673a = orientationChangeWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        OrientationChangeWidget orientationChangeWidget = this.f16673a;
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f17192a;
        boolean z = gVar.f17194c;
        boolean z2 = false;
        boolean z3 = sparseBooleanArray.get(0);
        boolean z4 = sparseBooleanArray.get(2);
        if (orientationChangeWidget.getView() != null) {
            if (z3 || z4) {
                z2 = true;
            }
            e.a(orientationChangeWidget.context, orientationChangeWidget.getView(), !z2, z);
        }
    }
}
