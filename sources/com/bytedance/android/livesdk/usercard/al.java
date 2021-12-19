package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import androidx.fragment.app.d;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.q.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public class al implements a {
    static {
        Covode.recordClassIndex(12852);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.q.a
    public void configProfileHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, boolean z, m mVar) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(mVar, "");
        new UserProfilePresenter(aVar, dataChannel, z, mVar);
    }

    public d getUserCardDialog(Context context, boolean z, long j2, long j3, UserProfileEvent userProfileEvent) {
        boolean z2;
        l.d(context, "");
        Room room = new Room();
        room.setId(j3);
        p pVar = new p();
        pVar.D = z;
        pVar.f21862e = j2;
        if (u.a().b().c() == j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        pVar.f21867j = z2;
        pVar.f21864g = room;
        pVar.f21860c = new y();
        pVar.f21861d = new w(context, room, j2);
        pVar.B = p.a(context);
        pVar.F = userProfileEvent;
        pVar.d();
        l.b(pVar, "");
        return pVar;
    }

    @Override // com.bytedance.android.live.q.a
    public d getUserCardDialog(Context context, boolean z, long j2, Room room, User user, String str, UserProfileEvent userProfileEvent) {
        boolean z2;
        l.d(context, "");
        p pVar = new p();
        pVar.D = z;
        pVar.f21862e = j2;
        if (u.a().b().c() == j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        pVar.f21867j = z2;
        pVar.f21864g = room;
        pVar.f21865h = user;
        pVar.f21860c = new y();
        pVar.f21861d = new w(context, room, j2);
        pVar.f21859b = 1;
        pVar.t = str;
        pVar.B = p.a(context);
        pVar.F = userProfileEvent;
        pVar.d();
        l.b(pVar, "");
        return pVar;
    }
}
