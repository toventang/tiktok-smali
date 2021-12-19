package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class HotSpotTagPublishModel {
    private final String id;
    private final String tag;

    static {
        Covode.recordClassIndex(79770);
    }

    public static /* synthetic */ HotSpotTagPublishModel copy$default(HotSpotTagPublishModel hotSpotTagPublishModel, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hotSpotTagPublishModel.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = hotSpotTagPublishModel.id;
        }
        return hotSpotTagPublishModel.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.id;
    }

    public final HotSpotTagPublishModel copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new HotSpotTagPublishModel(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSpotTagPublishModel)) {
            return false;
        }
        HotSpotTagPublishModel hotSpotTagPublishModel = (HotSpotTagPublishModel) obj;
        return l.a(this.tag, hotSpotTagPublishModel.tag) && l.a(this.id, hotSpotTagPublishModel.id);
    }

    public final int hashCode() {
        String str = this.tag;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.id;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "HotSpotTagPublishModel(tag=" + this.tag + ", id=" + this.id + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final String getTag() {
        return this.tag;
    }

    public HotSpotTagPublishModel(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.tag = str;
        this.id = str2;
    }
}
