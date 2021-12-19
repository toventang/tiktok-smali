package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ap extends a {
    @c(a = "channel_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19181a;
    @c(a = "battle_id")

    /* renamed from: f  reason: collision with root package name */
    public long f19182f;
    @c(a = "op_uid")

    /* renamed from: g  reason: collision with root package name */
    public long f19183g;
    @c(a = "reason")

    /* renamed from: h  reason: collision with root package name */
    public int f19184h;

    static {
        Covode.recordClassIndex(11410);
    }

    public ap() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE_PUNISH_FINISH;
    }

    public final boolean c() {
        if (this.f19184h == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "LinkMicBattlePunishFinishMessage{channelId=" + this.f19181a + ", opUid=" + this.f19183g + ", reason=" + this.f19184h + '}';
    }
}
