package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(12857);
    }

    public static final d a(User user, boolean z) {
        l.d(user, "");
        if (((b) a.a(b.class)).getLinkState(user) == 2) {
            return d.DISCONNECTED;
        }
        if (!b(user, z)) {
            return d.GONE;
        }
        com.bytedance.android.live.base.a a2 = a.a(b.class);
        l.b(a2, "");
        if (((b) a2).getHasInvitedUidSet().contains(Long.valueOf(user.getId()))) {
            return d.GRAYED;
        }
        return d.ACTIVE;
    }

    private static final boolean b(User user, boolean z) {
        com.bytedance.android.live.base.model.user.b bVar;
        Long l2;
        Long l3;
        User owner;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        f b2 = u.a().b();
        Long l4 = null;
        if (b2 != null) {
            bVar = b2.a();
        } else {
            bVar = null;
        }
        if (room != null) {
            try {
                l2 = Long.valueOf(room.getOwnerUserId());
            } catch (IllegalStateException unused) {
                return false;
            }
        } else {
            l2 = null;
        }
        if (l2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (bVar == null || Long.valueOf(bVar.getId()) == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (!z) {
            return false;
        } else {
            if (room != null) {
                l3 = Long.valueOf(room.getOwnerUserId());
            } else {
                l3 = null;
            }
            if (bVar != null) {
                l4 = Long.valueOf(bVar.getId());
            }
            if (!l.a(l3, l4) || user.getSecret() == 1 || room == null || (owner = room.getOwner()) == null || owner.getSecret() == 1) {
                return false;
            }
            com.bytedance.android.live.base.a a2 = a.a(b.class);
            l.b(a2, "");
            if (!aj.a(((b) a2).getCurrentLinkMode(), 2)) {
                return false;
            }
            com.bytedance.android.live.base.a a3 = a.a(b.class);
            l.b(a3, "");
            if (((b) a3).getUninvitedUidSet().contains(Long.valueOf(user.getId()))) {
                return false;
            }
            com.bytedance.android.live.base.a a4 = a.a(b.class);
            l.b(a4, "");
            if (((b) a4).getLinkedGuestNum() >= d.a().x) {
                return false;
            }
            return true;
        }
    }
}
