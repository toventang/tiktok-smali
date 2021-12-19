package com.bytedance.android.livesdk.rank.impl.c;

import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f20655a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static int f20656b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static int f20657c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final a f20658d = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(12214);
    }

    public static void a(int i2) {
        com.bytedance.android.live.core.c.a.a(3, "RankDataHolder", "curRoomAudienceNum = ".concat(String.valueOf(i2)));
        f20657c = i2;
    }

    public static void a(int i2, int i3) {
        if (i2 == j.HOURLY_RANK.getType()) {
            com.bytedance.android.live.core.c.a.a(3, "RankDataHolder", "curRoomHourlyRank = ".concat(String.valueOf(i3)));
            f20655a = i3;
        } else if (i2 == j.WEEKLY_RANK.getType()) {
            com.bytedance.android.live.core.c.a.a(3, "RankDataHolder", "curRoomWeeklyRank = ".concat(String.valueOf(i3)));
            f20656b = i3;
        }
    }
}
