package com.bytedance.android.live.liveinteract.cohost.ui.d;

import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.livesdk.chatroom.interact.model.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Room f10331a;

    /* renamed from: b  reason: collision with root package name */
    public final m f10332b;

    /* renamed from: c  reason: collision with root package name */
    public final h f10333c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10334d;

    static {
        Covode.recordClassIndex(5448);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f10331a, bVar.f10331a) && l.a(this.f10332b, bVar.f10332b) && l.a(this.f10333c, bVar.f10333c) && l.a(this.f10334d, bVar.f10334d);
    }

    public final int hashCode() {
        Room room = this.f10331a;
        int i2 = 0;
        int hashCode = (room != null ? room.hashCode() : 0) * 31;
        m mVar = this.f10332b;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        h hVar = this.f10333c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f10334d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "InteractUserItem(room=" + this.f10331a + ", inviteType=" + this.f10332b + ", rivalExtraInfo=" + this.f10333c + ", requestId=" + this.f10334d + ")";
    }

    public b(Room room, m mVar, h hVar, String str) {
        l.d(room, "");
        this.f10331a = room;
        this.f10332b = mVar;
        this.f10333c = hVar;
        this.f10334d = str;
    }
}
