package com.bytedance.android.live.liveinteract.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.chatroom.model.d.a> f9918a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.chatroom.model.d.a> f9919b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.chatroom.model.d.a> f9920c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9921d = false;

    static {
        Covode.recordClassIndex(5128);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f9918a, aVar.f9918a) && l.a(this.f9919b, aVar.f9919b) && l.a(this.f9920c, aVar.f9920c) && this.f9921d == aVar.f9921d;
    }

    public final int hashCode() {
        List<com.bytedance.android.livesdk.chatroom.model.d.a> list = this.f9918a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<com.bytedance.android.livesdk.chatroom.model.d.a> list2 = this.f9919b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<com.bytedance.android.livesdk.chatroom.model.d.a> list3 = this.f9920c;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f9921d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "SociaLiveAllPlayers(onLinePlayerList=" + this.f9918a + ", waitingPlayerList=" + this.f9919b + ", viewerPlayerList=" + this.f9920c + ", loading=" + this.f9921d + ")";
    }

    public a(List<com.bytedance.android.livesdk.chatroom.model.d.a> list, List<com.bytedance.android.livesdk.chatroom.model.d.a> list2, List<com.bytedance.android.livesdk.chatroom.model.d.a> list3) {
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        this.f9918a = list;
        this.f9919b = list2;
        this.f9920c = list3;
    }
}
