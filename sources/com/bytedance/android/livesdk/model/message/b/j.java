package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class j {
    @c(a = "channel_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19271a;
    @c(a = "battle_id")

    /* renamed from: b  reason: collision with root package name */
    public long f19272b;
    @c(a = "start_time_ms")

    /* renamed from: c  reason: collision with root package name */
    public long f19273c;
    @c(a = "duration")

    /* renamed from: d  reason: collision with root package name */
    public int f19274d;
    @c(a = "status")

    /* renamed from: e  reason: collision with root package name */
    public int f19275e;
    @c(a = "invite_type")

    /* renamed from: f  reason: collision with root package name */
    public int f19276f;

    static {
        Covode.recordClassIndex(11447);
    }

    public String toString() {
        return "BattleSetting{channelId=" + this.f19271a + ", battleId=" + this.f19272b + ", startTimeMs=" + this.f19273c + ", duration=" + this.f19274d + ", status=" + this.f19275e + ", inviteType=" + this.f19276f + '}';
    }
}
