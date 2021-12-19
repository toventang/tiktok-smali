package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class DebugRoomItem implements Serializable {
    @c(a = "tab_content")
    private String tabContent;
    @c(a = "tab_title")
    private String tabTitle;

    static {
        Covode.recordClassIndex(13649);
    }

    public DebugRoomItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DebugRoomItem copy$default(DebugRoomItem debugRoomItem, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = debugRoomItem.tabTitle;
        }
        if ((i2 & 2) != 0) {
            str2 = debugRoomItem.tabContent;
        }
        return debugRoomItem.copy(str, str2);
    }

    public final String component1() {
        return this.tabTitle;
    }

    public final String component2() {
        return this.tabContent;
    }

    public final DebugRoomItem copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new DebugRoomItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugRoomItem)) {
            return false;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) obj;
        return l.a(this.tabTitle, debugRoomItem.tabTitle) && l.a(this.tabContent, debugRoomItem.tabContent);
    }

    public final int hashCode() {
        String str = this.tabTitle;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabContent;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DebugRoomItem(tabTitle=" + this.tabTitle + ", tabContent=" + this.tabContent + ")";
    }

    public final String getTabContent() {
        return this.tabContent;
    }

    public final String getTabTitle() {
        return this.tabTitle;
    }

    public final void setTabContent(String str) {
        l.d(str, "");
        this.tabContent = str;
    }

    public final void setTabTitle(String str) {
        l.d(str, "");
        this.tabTitle = str;
    }

    public DebugRoomItem(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.tabTitle = str;
        this.tabContent = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DebugRoomItem(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
