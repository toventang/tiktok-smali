package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.b.i;
import com.bytedance.android.livesdk.model.message.b.k;
import com.bytedance.android.livesdk.model.message.b.l;
import com.bytedance.android.livesdk.model.message.b.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class aq extends a {
    @c(a = "task_message_type")

    /* renamed from: a  reason: collision with root package name */
    public int f19185a;
    @c(a = "start")

    /* renamed from: f  reason: collision with root package name */
    public l f19186f;
    @c(a = "task_update")

    /* renamed from: g  reason: collision with root package name */
    public m f19187g;
    @c(a = "task_settle")

    /* renamed from: h  reason: collision with root package name */
    public k f19188h;
    @c(a = "reward")

    /* renamed from: i  reason: collision with root package name */
    public i f19189i;

    static {
        Covode.recordClassIndex(11411);
    }

    public aq() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE_TASK;
    }

    public String toString() {
        return "LinkMIcBattleTaskMessage{battleTaskMessageType=" + this.f19185a + ", taskStart=" + this.f19186f + ", taskUpdate=" + this.f19187g + ", taskSettle=" + this.f19188h + ", rewardSettle=" + this.f19189i + '}';
    }
}
