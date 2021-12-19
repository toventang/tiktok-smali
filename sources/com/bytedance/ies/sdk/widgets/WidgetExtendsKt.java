package com.bytedance.ies.sdk.widgets;

import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class WidgetExtendsKt {
    static {
        Covode.recordClassIndex(20730);
    }

    public static final <T> m<T> autoDispose(LiveWidget liveWidget) {
        l.d(liveWidget, "");
        m<T> a2 = e.a(liveWidget);
        l.b(a2, "");
        return a2;
    }
}
