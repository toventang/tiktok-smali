package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements b.c {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10485a;

    static {
        Covode.recordClassIndex(5572);
    }

    k(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10485a = linkCrossRoomWidget;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.c
    public final void a(View view) {
        ((LinearLayout) view).setOnClickListener(new h(this.f10485a));
    }
}
