package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.b.b;
import com.bytedance.android.livesdk.model.message.b.d;
import com.bytedance.android.livesdk.model.message.b.e;
import com.bytedance.android.livesdk.model.message.b.g;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ao extends a {
    @c(a = "notice_type")

    /* renamed from: a  reason: collision with root package name */
    public int f19174a;
    @c(a = "anchor_guide")

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.b.c f19175f;
    @c(a = "toast")

    /* renamed from: g  reason: collision with root package name */
    public g f19176g;
    @c(a = "bubble_guide")

    /* renamed from: h  reason: collision with root package name */
    public d f19177h;
    @c(a = "anchor_gift_guide")

    /* renamed from: i  reason: collision with root package name */
    public b f19178i;
    @c(a = "rule_guide")

    /* renamed from: j  reason: collision with root package name */
    public e f19179j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f19180k;

    static {
        Covode.recordClassIndex(11409);
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return true;
    }

    public ao() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE_NOTICE;
    }

    public String toString() {
        return "LinkMicBattleNoticeMessage{noticeType=" + this.f19174a + ", anchorGuide=" + this.f19175f + ", toast=" + this.f19176g + ", bubbleGuide=" + this.f19177h + ", anchorGiftGuide=" + this.f19178i + ", battleRuleGuide=" + this.f19179j + '}';
    }
}
