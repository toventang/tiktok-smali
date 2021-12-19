package com.bytedance.android.livesdk.chatroom.detail;

import android.text.TextUtils;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.t;

public final class y extends b {

    /* renamed from: e  reason: collision with root package name */
    private final long f15327e;

    /* renamed from: f  reason: collision with root package name */
    private final String f15328f;

    static {
        Covode.recordClassIndex(8469);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.livesdk.chatroom.detail.b
    public final t<d<Room>> c() {
        String str;
        RoomApi roomApi = (RoomApi) e.a().a(RoomApi.class);
        if (!TextUtils.isEmpty(u.a().b().a(this.f15327e))) {
            str = u.a().b().a(this.f15327e);
        } else {
            str = this.f15328f;
        }
        return roomApi.fetchUserRoom(this.f15327e, str);
    }

    public y(b.a aVar, long j2, String str) {
        super(aVar);
        this.f15327e = j2;
        this.f15328f = str;
    }
}
