package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Map;

public final class LiveSlotSettings implements Serializable {
    @c(a = "biz_type_disallow")
    private final Map<String, SlotBizTypeDisallow> bizTypeDisallow;

    static {
        Covode.recordClassIndex(10801);
    }

    public LiveSlotSettings() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveSlotSettings copy$default(LiveSlotSettings liveSlotSettings, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = liveSlotSettings.bizTypeDisallow;
        }
        return liveSlotSettings.copy(map);
    }

    public final Map<String, SlotBizTypeDisallow> component1() {
        return this.bizTypeDisallow;
    }

    public final LiveSlotSettings copy(Map<String, SlotBizTypeDisallow> map) {
        return new LiveSlotSettings(map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveSlotSettings) && l.a(this.bizTypeDisallow, ((LiveSlotSettings) obj).bizTypeDisallow);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, SlotBizTypeDisallow> map = this.bizTypeDisallow;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LiveSlotSettings(bizTypeDisallow=" + this.bizTypeDisallow + ")";
    }

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        return this.bizTypeDisallow;
    }

    public LiveSlotSettings(Map<String, SlotBizTypeDisallow> map) {
        this.bizTypeDisallow = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveSlotSettings(Map map, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : map);
    }
}
