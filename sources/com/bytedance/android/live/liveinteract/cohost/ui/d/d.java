package com.bytedance.android.live.liveinteract.cohost.ui.d;

import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final i.a f10336a;

    static {
        Covode.recordClassIndex(5450);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f10336a, ((d) obj).f10336a);
        }
        return true;
    }

    public final int hashCode() {
        i.a aVar = this.f10336a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RandomLinkMicEntranceItem(bannerText=" + this.f10336a + ")";
    }

    public d(i.a aVar) {
        l.d(aVar, "");
        this.f10336a = aVar;
    }
}
