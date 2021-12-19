package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.android.live.liveinteract.cohost.a.d.l;
import com.bytedance.android.live.liveinteract.cohost.a.d.m;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import f.a.a.a.a;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10481a;

    static {
        Covode.recordClassIndex(5568);
    }

    g(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10481a = linkCrossRoomWidget;
    }

    public final void onClick(View view) {
        d dVar = this.f10481a.f10468g;
        u.a().b().a(((d.a) new d.b().a(dVar.f10120d.f9941f)).b(dVar.f10117a.getId()).c()).a(a.a(f.a.a.b.a.f157156a)).a(new l(dVar), m.f10142a);
    }
}
