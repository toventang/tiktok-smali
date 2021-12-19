package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class SlotBizTypeDisallow implements Serializable {
    @c(a = "disallow_all")
    private final boolean disallowAll;
    @c(a = "frame_slot_disallow_list")
    private final List<String> frameSlotDisallowList;
    @c(a = "icon_slot_disallow_list")
    private final List<String> iconSlotDisallowList;

    static {
        Covode.recordClassIndex(10803);
    }

    public SlotBizTypeDisallow() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotBizTypeDisallow copy$default(SlotBizTypeDisallow slotBizTypeDisallow, boolean z, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = slotBizTypeDisallow.disallowAll;
        }
        if ((i2 & 2) != 0) {
            list = slotBizTypeDisallow.iconSlotDisallowList;
        }
        if ((i2 & 4) != 0) {
            list2 = slotBizTypeDisallow.frameSlotDisallowList;
        }
        return slotBizTypeDisallow.copy(z, list, list2);
    }

    public final boolean component1() {
        return this.disallowAll;
    }

    public final List<String> component2() {
        return this.iconSlotDisallowList;
    }

    public final List<String> component3() {
        return this.frameSlotDisallowList;
    }

    public final SlotBizTypeDisallow copy(boolean z, List<String> list, List<String> list2) {
        return new SlotBizTypeDisallow(z, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotBizTypeDisallow)) {
            return false;
        }
        SlotBizTypeDisallow slotBizTypeDisallow = (SlotBizTypeDisallow) obj;
        return this.disallowAll == slotBizTypeDisallow.disallowAll && l.a(this.iconSlotDisallowList, slotBizTypeDisallow.iconSlotDisallowList) && l.a(this.frameSlotDisallowList, slotBizTypeDisallow.frameSlotDisallowList);
    }

    public final int hashCode() {
        boolean z = this.disallowAll;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<String> list = this.iconSlotDisallowList;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.frameSlotDisallowList;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "SlotBizTypeDisallow(disallowAll=" + this.disallowAll + ", iconSlotDisallowList=" + this.iconSlotDisallowList + ", frameSlotDisallowList=" + this.frameSlotDisallowList + ")";
    }

    public final boolean getDisallowAll() {
        return this.disallowAll;
    }

    public final List<String> getFrameSlotDisallowList() {
        return this.frameSlotDisallowList;
    }

    public final List<String> getIconSlotDisallowList() {
        return this.iconSlotDisallowList;
    }

    public SlotBizTypeDisallow(boolean z, List<String> list, List<String> list2) {
        this.disallowAll = z;
        this.iconSlotDisallowList = list;
        this.frameSlotDisallowList = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotBizTypeDisallow(boolean z, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2);
    }
}
