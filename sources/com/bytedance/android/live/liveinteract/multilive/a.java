package com.bytedance.android.live.liveinteract.multilive;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.live.n.w;
import com.bytedance.android.live.p.g;
import com.bytedance.android.live.p.h;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.model.a.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11485a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(6195);
    }

    public static final com.bytedance.android.livesdk.chatroom.model.c.a a() {
        com.bytedance.android.livesdk.chatroom.model.c.a aVar;
        Object a2 = e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a)) {
            a2 = null;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2;
        if (aVar2 == null || (aVar = aVar2.f11299i) == null) {
            return d.a().w;
        }
        return aVar;
    }

    public static final boolean c() {
        Object a2 = e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a)) {
            a2 = null;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2;
        if (aVar != null) {
            return aVar.f11298h;
        }
        return false;
    }

    public static final boolean e() {
        com.bytedance.android.livesdk.chatroom.model.c.a a2 = a();
        if (a2 == null || a2.f15742c != 4 || !b()) {
            return false;
        }
        return true;
    }

    public static final String d() {
        com.bytedance.android.livesdk.chatroom.model.c.a a2 = a();
        if (a2 == null) {
            return "error";
        }
        if (a2.f15742c == 3 && a2.f15743d == 4) {
            return "all_viewers";
        }
        if (a2.f15742c == 3 && a2.f15743d == 3) {
            return "only_followers";
        }
        if (a2.f15742c == 4 && a2.f15743d == 4) {
            return "none";
        }
        return "error";
    }

    public static final boolean b() {
        d a2 = d.a();
        l.b(a2, "");
        if (a2.f14182c) {
            return false;
        }
        c a3 = c.a();
        l.b(a3, "");
        T t = a3.n;
        if (t != null && t.intValue() == 2) {
            return false;
        }
        c a4 = c.a();
        l.b(a4, "");
        T t2 = a4.n;
        if (t2 != null && t2.intValue() == 1) {
            return false;
        }
        return true;
    }

    public static final boolean a(com.bytedance.android.livesdk.chatroom.model.c.a aVar) {
        if (aVar == null || aVar.f15742c != 3) {
            return false;
        }
        return true;
    }

    public static final boolean b(com.bytedance.android.livesdk.chatroom.model.c.a aVar) {
        if (aVar != null && aVar.f15743d == 3 && aVar.f15742c == 3) {
            return true;
        }
        return false;
    }

    public static final boolean b(Room room) {
        if (!d(room) || !b()) {
            return false;
        }
        return true;
    }

    private static boolean d(Room room) {
        com.bytedance.android.livesdk.chatroom.model.c.a a2 = a();
        if (!a(a2) || !b(a2) || room == null || a(room)) {
            return false;
        }
        return true;
    }

    public static final void b(DataChannel dataChannel) {
        com.bytedance.android.live.p.l lVar;
        l.d(dataChannel, "");
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            lVar = com.bytedance.android.live.p.l.MULTIGUEST;
        } else {
            lVar = com.bytedance.android.live.p.l.INTERACTION;
        }
        g gVar = ((h) com.bytedance.android.live.t.a.a(h.class)).toolbarManager();
        if (gVar != null) {
            gVar.c(lVar, dataChannel);
        }
        dataChannel.c(w.class, 3);
    }

    public static final void c(DataChannel dataChannel) {
        com.bytedance.android.live.p.l lVar;
        l.d(dataChannel, "");
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            lVar = com.bytedance.android.live.p.l.MULTIGUEST;
        } else {
            lVar = com.bytedance.android.live.p.l.INTERACTION;
        }
        g gVar = ((h) com.bytedance.android.live.t.a.a(h.class)).toolbarManager();
        if (gVar != null) {
            gVar.b(lVar, dataChannel);
            gVar.e(lVar, dataChannel);
        }
        dataChannel.c(w.class, 1);
    }

    public static final void c(Room room) {
        com.bytedance.android.livesdk.model.a.c cVar;
        b bVar;
        l.d(room, "");
        if (room.multiLiveUserSettings != null && room.multiLiveUserSettings.f18940a != null && (cVar = room.multiLiveUserSettings.f18940a) != null && (bVar = cVar.f18939a) != null) {
            com.bytedance.android.livesdk.chatroom.model.c.a aVar = new com.bytedance.android.livesdk.chatroom.model.c.a();
            int i2 = bVar.f18938a;
            if (i2 == 1) {
                aVar.f15742c = 3;
                aVar.f15743d = 4;
                d.a().w = aVar;
            } else if (i2 == 2) {
                aVar.f15742c = 3;
                aVar.f15743d = 3;
                d.a().w = aVar;
            } else if (i2 == 3) {
                aVar.f15742c = 4;
                aVar.f15743d = 4;
                d.a().w = aVar;
            }
        }
    }

    public static final void d(DataChannel dataChannel) {
        com.bytedance.android.live.p.l lVar;
        l.d(dataChannel, "");
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            lVar = com.bytedance.android.live.p.l.MULTIGUEST;
        } else {
            lVar = com.bytedance.android.live.p.l.INTERACTION;
        }
        g gVar = ((h) com.bytedance.android.live.t.a.a(h.class)).toolbarManager();
        if (gVar != null) {
            gVar.b(lVar, dataChannel);
            gVar.f(lVar, dataChannel);
        }
        dataChannel.c(w.class, 2);
    }

    public static final boolean a(Room room) {
        if (room == null) {
            return false;
        }
        User owner = room.getOwner();
        l.b(owner, "");
        FollowInfo followInfo = owner.getFollowInfo();
        l.b(followInfo, "");
        if (((int) followInfo.getFollowStatus()) != 1) {
            User owner2 = room.getOwner();
            l.b(owner2, "");
            FollowInfo followInfo2 = owner2.getFollowInfo();
            l.b(followInfo2, "");
            if (((int) followInfo2.getFollowStatus()) == 2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        Room room = (Room) dataChannel.b(df.class);
        if (room == null || a(room) || !b()) {
            return false;
        }
        return true;
    }

    public static final void a(Room room, DataChannel dataChannel) {
        l.d(dataChannel, "");
        if (c()) {
            com.bytedance.android.livesdk.chatroom.model.c.a a2 = a();
            if (!a(a2)) {
                b(dataChannel);
            } else if (b(a2) && !a(room)) {
                c(dataChannel);
            }
        }
    }

    public static final void a(Room room, DataChannel dataChannel, boolean z) {
        l.d(dataChannel, "");
        if (c() && room != null) {
            com.bytedance.android.livesdk.chatroom.model.c.a a2 = a();
            if (a(a2)) {
                if (b(a2) && !a(room)) {
                    c(dataChannel);
                }
            } else if (z) {
                d(dataChannel);
            } else {
                b(dataChannel);
            }
        }
    }
}
