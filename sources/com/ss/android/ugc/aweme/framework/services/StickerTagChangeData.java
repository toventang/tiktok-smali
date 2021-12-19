package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class StickerTagChangeData {
    private final String panel;
    private final String tabKey;
    private final String tabName;

    static {
        Covode.recordClassIndex(61374);
    }

    public static /* synthetic */ StickerTagChangeData copy$default(StickerTagChangeData stickerTagChangeData, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stickerTagChangeData.panel;
        }
        if ((i2 & 2) != 0) {
            str2 = stickerTagChangeData.tabName;
        }
        if ((i2 & 4) != 0) {
            str3 = stickerTagChangeData.tabKey;
        }
        return stickerTagChangeData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.panel;
    }

    public final String component2() {
        return this.tabName;
    }

    public final String component3() {
        return this.tabKey;
    }

    public final StickerTagChangeData copy(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new StickerTagChangeData(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerTagChangeData)) {
            return false;
        }
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
        return l.a(this.panel, stickerTagChangeData.panel) && l.a(this.tabName, stickerTagChangeData.tabName) && l.a(this.tabKey, stickerTagChangeData.tabKey);
    }

    public final int hashCode() {
        String str = this.panel;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tabKey;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "StickerTagChangeData(panel=" + this.panel + ", tabName=" + this.tabName + ", tabKey=" + this.tabKey + ")";
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public StickerTagChangeData(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.panel = str;
        this.tabName = str2;
        this.tabKey = str3;
    }
}
