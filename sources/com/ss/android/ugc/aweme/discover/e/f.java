package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;
import java.util.ArrayList;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final LiveRoomStruct f80955a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<LiveRoomStruct> f80956b;

    /* renamed from: c  reason: collision with root package name */
    public final long f80957c;

    /* renamed from: d  reason: collision with root package name */
    public final EnterRoomConfig f80958d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f80959e;

    static {
        Covode.recordClassIndex(50326);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f80955a, fVar.f80955a) && l.a(this.f80956b, fVar.f80956b) && this.f80957c == fVar.f80957c && l.a(this.f80958d, fVar.f80958d) && l.a(this.f80959e, fVar.f80959e);
    }

    public final String toString() {
        return "EnterLiveRoomEvent(curRawData=" + this.f80955a + ", rawDataList=" + this.f80956b + ", startCursor=" + this.f80957c + ", config=" + this.f80958d + ", hasMore=" + this.f80959e + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        LiveRoomStruct liveRoomStruct = this.f80955a;
        int i5 = 0;
        if (liveRoomStruct != null) {
            i2 = liveRoomStruct.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        ArrayList<LiveRoomStruct> arrayList = this.f80956b;
        if (arrayList != null) {
            i3 = arrayList.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f80957c;
        int i7 = (((i6 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        EnterRoomConfig enterRoomConfig = this.f80958d;
        if (enterRoomConfig != null) {
            i4 = enterRoomConfig.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        Boolean bool = this.f80959e;
        if (bool != null) {
            i5 = bool.hashCode();
        }
        return i8 + i5;
    }

    public f(LiveRoomStruct liveRoomStruct, ArrayList<LiveRoomStruct> arrayList, long j2, EnterRoomConfig enterRoomConfig, Boolean bool) {
        this.f80955a = liveRoomStruct;
        this.f80956b = arrayList;
        this.f80957c = j2;
        this.f80958d = enterRoomConfig;
        this.f80959e = bool;
    }
}
