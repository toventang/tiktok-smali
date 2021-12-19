package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.livesdk.model.message.b.a;
import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.j;
import com.bytedance.android.livesdk.model.message.b.n;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Map;

public final class e {
    @c(a = "channel_id")

    /* renamed from: a  reason: collision with root package name */
    public Long f23072a;
    @c(a = "battle_id")

    /* renamed from: b  reason: collision with root package name */
    public Long f23073b;
    @c(a = "battle_settings")

    /* renamed from: c  reason: collision with root package name */
    public j f23074c;
    @c(a = "armies")

    /* renamed from: d  reason: collision with root package name */
    public Map<Long, n> f23075d;
    @c(a = "battle_result")

    /* renamed from: e  reason: collision with root package name */
    public Map<Long, h> f23076e;
    @c(a = "anchors_info")

    /* renamed from: f  reason: collision with root package name */
    public Map<Long, i> f23077f;
    @c(a = "bubble_text")

    /* renamed from: g  reason: collision with root package name */
    public String f23078g;
    @c(a = "supported_actions")

    /* renamed from: h  reason: collision with root package name */
    public Map<Long, Boolean> f23079h;
    @c(a = "fuzzy_display_config")

    /* renamed from: i  reason: collision with root package name */
    public a f23080i;
    @c(a = "battle_combo_v2")

    /* renamed from: j  reason: collision with root package name */
    public Map<Long, d> f23081j;
    @c(a = "battle_task")

    /* renamed from: k  reason: collision with root package name */
    public h f23082k;

    static {
        Covode.recordClassIndex(13672);
    }

    public e(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f23072a, eVar.f23072a) && l.a(this.f23073b, eVar.f23073b) && l.a(this.f23074c, eVar.f23074c) && l.a(this.f23075d, eVar.f23075d) && l.a(this.f23076e, eVar.f23076e) && l.a(this.f23077f, eVar.f23077f) && l.a(this.f23078g, eVar.f23078g) && l.a(this.f23079h, eVar.f23079h) && l.a(this.f23080i, eVar.f23080i) && l.a(this.f23081j, eVar.f23081j) && l.a(this.f23082k, eVar.f23082k);
    }

    public final int hashCode() {
        Long l2 = this.f23072a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Long l3 = this.f23073b;
        int hashCode2 = (hashCode + (l3 != null ? l3.hashCode() : 0)) * 31;
        j jVar = this.f23074c;
        int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Map<Long, n> map = this.f23075d;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Map<Long, h> map2 = this.f23076e;
        int hashCode5 = (hashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<Long, i> map3 = this.f23077f;
        int hashCode6 = (hashCode5 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str = this.f23078g;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        Map<Long, Boolean> map4 = this.f23079h;
        int hashCode8 = (hashCode7 + (map4 != null ? map4.hashCode() : 0)) * 31;
        a aVar = this.f23080i;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Map<Long, d> map5 = this.f23081j;
        int hashCode10 = (hashCode9 + (map5 != null ? map5.hashCode() : 0)) * 31;
        h hVar = this.f23082k;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "BattleInfoResponse(channelId=" + this.f23072a + ", battleId=" + this.f23073b + ", setting=" + this.f23074c + ", armies=" + this.f23075d + ", resultMap=" + this.f23076e + ", userInfoMap=" + this.f23077f + ", bubbleText=" + this.f23078g + ", supportedActions=" + this.f23079h + ", mBattleDisplayConfig=" + this.f23080i + ", battleCombos=" + this.f23081j + ", battleTask=" + this.f23082k + ")";
    }

    private e() {
        this.f23072a = null;
        this.f23073b = null;
        this.f23074c = null;
        this.f23075d = null;
        this.f23076e = null;
        this.f23077f = null;
        this.f23078g = null;
        this.f23079h = null;
        this.f23080i = null;
        this.f23081j = null;
        this.f23082k = null;
    }

    private /* synthetic */ e(byte b2) {
        this();
    }
}
