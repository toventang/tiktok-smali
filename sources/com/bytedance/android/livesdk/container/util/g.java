package com.bytedance.android.livesdk.container.util;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.o;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Set;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f16898a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(9386);
    }

    public static final o a(Uri uri) {
        Long l2;
        User owner;
        FollowInfo followInfo;
        User owner2;
        String valueOf;
        String str;
        l.d(uri, "");
        o oVar = new o();
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                oVar.a(t, uri.getQueryParameter(t));
            }
            String str2 = "0";
            if (!oVar.b("room_id")) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = str2;
                }
                oVar.a("room_id", str);
            }
            if (!oVar.b("user_id")) {
                f b2 = u.a().b();
                l.b(b2, "");
                oVar.a("user_id", String.valueOf(b2.c()));
            }
            if (!oVar.b("anchor_id")) {
                Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (!(room2 == null || (owner2 = room2.getOwner()) == null || (valueOf = String.valueOf(owner2.getId())) == null)) {
                    str2 = valueOf;
                }
                oVar.a("anchor_id", str2);
            }
            if (!oVar.b("follow_status")) {
                Room room3 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room3 == null || (owner = room3.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(followInfo.getFollowStatus());
                }
                oVar.a("follow_status", l2);
            }
            com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
            l.b(fVar, "");
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, "");
            EnterRoomConfig.RoomsData roomsData = a2.f23354b.f23299c;
            if (!oVar.b("enter_from_merge")) {
                oVar.a("enter_from_merge", roomsData.J);
            }
            if (!oVar.b("enter_method")) {
                oVar.a("enter_method", roomsData.L);
            }
            if (!oVar.b("action_type")) {
                oVar.a("action_type", roomsData.M);
            }
            q.m223constructorimpl(uri);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return oVar;
    }
}
