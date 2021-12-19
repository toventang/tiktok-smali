package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class ListOrderTabData {
    @c(a = "entrances")
    private final List<EntranceData> entrances;
    @c(a = "tabs")
    private final List<OrderListTabInfo> tabs;

    static {
        Covode.recordClassIndex(53982);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListOrderTabData copy$default(ListOrderTabData listOrderTabData, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = listOrderTabData.tabs;
        }
        if ((i2 & 2) != 0) {
            list2 = listOrderTabData.entrances;
        }
        return listOrderTabData.copy(list, list2);
    }

    public final List<OrderListTabInfo> component1() {
        return this.tabs;
    }

    public final List<EntranceData> component2() {
        return this.entrances;
    }

    public final ListOrderTabData copy(List<OrderListTabInfo> list, List<EntranceData> list2) {
        l.d(list, "");
        l.d(list2, "");
        return new ListOrderTabData(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOrderTabData)) {
            return false;
        }
        ListOrderTabData listOrderTabData = (ListOrderTabData) obj;
        return l.a(this.tabs, listOrderTabData.tabs) && l.a(this.entrances, listOrderTabData.entrances);
    }

    public final int hashCode() {
        List<OrderListTabInfo> list = this.tabs;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<EntranceData> list2 = this.entrances;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ListOrderTabData(tabs=" + this.tabs + ", entrances=" + this.entrances + ")";
    }

    public final List<EntranceData> getEntrances() {
        return this.entrances;
    }

    public final List<OrderListTabInfo> getTabs() {
        return this.tabs;
    }

    public ListOrderTabData(List<OrderListTabInfo> list, List<EntranceData> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.tabs = list;
        this.entrances = list2;
    }
}
