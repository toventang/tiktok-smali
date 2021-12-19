package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.b.n;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public class am extends a {
    @c(a = "battle_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19161a;
    @c(a = "armies")

    /* renamed from: f  reason: collision with root package name */
    public Map<Long, n> f19162f;
    @c(a = "send_gift_success_time")

    /* renamed from: g  reason: collision with root package name */
    public long f19163g;
    @c(a = "update_battle_score_time")

    /* renamed from: h  reason: collision with root package name */
    public long f19164h;

    static {
        Covode.recordClassIndex(11407);
    }

    public am() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE_ARMIES;
    }

    public String toString() {
        return "LinkMicBattleArmiesMessage{armies=" + this.f19162f + '}';
    }
}
