package com.bytedance.android.livesdk.qa;

import android.content.Context;
import com.bytedance.android.live.m.a;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;

public class z implements a {
    static {
        Covode.recordClassIndex(12135);
    }

    @Override // com.bytedance.android.live.m.a
    public Class<? extends LiveRecyclableWidget> getQAWidget() {
        return QuestionCardWidget.class;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
        ((e) com.bytedance.android.live.t.a.a(e.class)).addOnRegistryReadyListener(new h());
    }

    @Override // com.bytedance.android.live.m.a
    public f getToolbarBehavior(Context context) {
        l.d(context, "");
        return new aw(context);
    }
}
