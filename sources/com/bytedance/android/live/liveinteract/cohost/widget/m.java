package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements b.c {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10487a;

    static {
        Covode.recordClassIndex(5574);
    }

    m(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10487a = linkCrossRoomWidget;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.c
    public final void a(View view) {
        ((ImageView) view).setOnClickListener(new g(this.f10487a));
    }
}
