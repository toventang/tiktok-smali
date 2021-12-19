package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.j;
import com.bytedance.android.livesdk.model.message.b.p;
import com.bytedance.android.livesdk.model.message.b.r;
import com.bytedance.android.livesdk.model.message.b.s;
import com.bytedance.android.livesdkapi.depend.model.live.a.d;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;
import java.util.Map;

public class an extends a {
    @c(a = "battle_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19165a;
    @c(a = "action")

    /* renamed from: f  reason: collision with root package name */
    public int f19166f;
    @c(a = "battle_settings")

    /* renamed from: g  reason: collision with root package name */
    public j f19167g;
    @c(a = "battle_result")

    /* renamed from: h  reason: collision with root package name */
    public Map<Long, h> f19168h;
    @c(a = "fuzzy_display_config")

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdk.model.message.b.a f19169i;
    @c(a = "battle_combo_v2")

    /* renamed from: j  reason: collision with root package name */
    public Map<Long, d> f19170j;
    @c(a = "armies")

    /* renamed from: k  reason: collision with root package name */
    public List<s> f19171k;
    @c(a = "anchors_info")

    /* renamed from: l  reason: collision with root package name */
    public List<p> f19172l;
    @c(a = "bubble_text")

    /* renamed from: m  reason: collision with root package name */
    public String f19173m;
    @c(a = "supported_actions")
    public List<r> n;
    @c(a = "invitee_gift_permission_type")
    public int o;

    static {
        Covode.recordClassIndex(11408);
    }

    public an() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE;
    }

    public String toString() {
        return "LinkMicBattleMessage{battleId=" + this.f19165a + ", action=" + this.f19166f + ", battleSetting=" + this.f19167g + ", battleResult=" + this.f19168h + '}';
    }
}
