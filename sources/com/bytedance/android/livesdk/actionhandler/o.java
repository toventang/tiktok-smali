package com.bytedance.android.livesdk.actionhandler;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final RoomActionHandler f13641a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterRoomLinkSession f13642b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f13643c;

    /* renamed from: d  reason: collision with root package name */
    private final EnterRoomConfig f13644d;

    static {
        Covode.recordClassIndex(7563);
    }

    o(RoomActionHandler roomActionHandler, EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
        this.f13641a = roomActionHandler;
        this.f13642b = enterRoomLinkSession;
        this.f13643c = room;
        this.f13644d = enterRoomConfig;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f13641a.lambda$handleEnterRoom$3$RoomActionHandler(this.f13642b, this.f13643c, this.f13644d, dialogInterface, i2);
    }
}
