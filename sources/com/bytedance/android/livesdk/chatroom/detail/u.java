package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.i.a.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class u implements c {

    /* renamed from: a  reason: collision with root package name */
    private c f15311a;

    /* renamed from: b  reason: collision with root package name */
    private RoomPlayer2 f15312b;

    static {
        Covode.recordClassIndex(8465);
    }

    @Override // com.bytedance.android.live.i.a.c
    public final void a(String str) {
        this.f15311a.a(str);
    }

    public u(c cVar, RoomPlayer2 roomPlayer2) {
        this.f15311a = cVar;
        this.f15312b = roomPlayer2;
    }

    @Override // com.bytedance.android.live.i.a.c
    public final void a(JSONObject jSONObject, String str) {
        this.f15312b.onPlayerLog(jSONObject);
        this.f15311a.a(jSONObject, str);
    }
}
