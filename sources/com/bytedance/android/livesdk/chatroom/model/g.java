package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class g {
    @c(a = "is_banned_forever")

    /* renamed from: a  reason: collision with root package name */
    public boolean f15768a;
    @c(a = "ban_time_left")

    /* renamed from: b  reason: collision with root package name */
    public long f15769b;
    @c(a = "ban_time")

    /* renamed from: c  reason: collision with root package name */
    public long f15770c;
    @c(a = "ban_duration")

    /* renamed from: d  reason: collision with root package name */
    public long f15771d;

    static {
        Covode.recordClassIndex(8702);
    }

    public final String toString() {
        return "LatestBanRecordInfo{isBannedForever=" + this.f15768a + ", banTimeLeft=" + this.f15769b + ", banTime=" + this.f15770c + ", banDuration=" + this.f15771d + '}';
    }
}
