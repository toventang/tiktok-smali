package com.bytedance.android.live.liveinteract.linkroom.a.c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.b.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class u implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10528a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkApi.e f10529b;

    static {
        Covode.recordClassIndex(5611);
    }

    u(b bVar, LinkApi.e eVar) {
        this.f10528a = bVar;
        this.f10529b = eVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f10528a;
        LinkApi.e eVar = this.f10529b;
        b bVar2 = (b) ((d) obj).data;
        if (!TextUtils.isEmpty(bVar2.f15704b)) {
            i.b();
            i.b("invite_issue_check", "initAndTurnOnMultiGuest -> " + bVar2.f15706d);
            bVar.f10500e = false;
            ((b.a) bVar.y).a(eVar);
            return;
        }
        bVar.f10500e = false;
        ((b.a) bVar.y).a(eVar, new Exception());
    }
}
