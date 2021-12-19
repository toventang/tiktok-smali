package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10476a;

    static {
        Covode.recordClassIndex(5563);
    }

    b(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10476a = linkCrossRoomWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10476a;
        a aVar = ((com.bytedance.android.livesdkapi.depend.b.a) obj).f22946a;
        if (aVar != null && linkCrossRoomWidget.isViewValid()) {
            linkCrossRoomWidget.findViewById(R.id.bxc).setVisibility(aVar.b() ? 8 : 0);
            linkCrossRoomWidget.f10468g.c();
        }
    }
}
