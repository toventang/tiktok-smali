package com.bytedance.android.live.liveinteract.match.d;

import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.n;
import com.bytedance.android.livesdkapi.depend.model.live.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.a.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Map;

public final class a {
    @c(a = "battle_result")

    /* renamed from: a  reason: collision with root package name */
    public final Map<Long, h> f10807a;
    @c(a = "battle_combo_v2")

    /* renamed from: b  reason: collision with root package name */
    public Map<Long, d> f10808b;
    @c(a = "armies")

    /* renamed from: c  reason: collision with root package name */
    public Map<Long, n> f10809c;
    @c(a = "anchors_info")

    /* renamed from: d  reason: collision with root package name */
    public Map<Long, i> f10810d;

    static {
        Covode.recordClassIndex(5776);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f10807a, aVar.f10807a) && l.a(this.f10808b, aVar.f10808b) && l.a(this.f10809c, aVar.f10809c) && l.a(this.f10810d, aVar.f10810d);
    }

    public final int hashCode() {
        Map<Long, h> map = this.f10807a;
        int i2 = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<Long, d> map2 = this.f10808b;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<Long, n> map3 = this.f10809c;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<Long, i> map4 = this.f10810d;
        if (map4 != null) {
            i2 = map4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "BattleFinishResult(battleResult=" + this.f10807a + ", battleCombos=" + this.f10808b + ", armies=" + this.f10809c + ", userInfoMap=" + this.f10810d + ")";
    }
}
