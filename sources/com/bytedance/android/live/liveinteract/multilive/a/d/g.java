package com.bytedance.android.live.liveinteract.multilive.a.d;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.h.a;

final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f11522a;

    static {
        Covode.recordClassIndex(6228);
    }

    g(a aVar) {
        this.f11522a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Room room;
        a aVar = this.f11522a;
        if (!(aVar.n || (room = (Room) DataChannelGlobal.f34575d.b(ac.class)) == null || room.getOwner() == null)) {
            aVar.n = true;
            aVar.f11511k.a(((LinkApi) e.a().a(LinkApi.class)).linkInRoomGuestReplyAnchor(room.getId(), 2, room.getId(), room.getOwnerUserId(), c.a().f9959k, d.a().v, MultiLiveServerAutoJoinChannel.INSTANCE.getValue()).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(aVar, room), new i(aVar)));
        }
        dialogInterface.dismiss();
    }
}
