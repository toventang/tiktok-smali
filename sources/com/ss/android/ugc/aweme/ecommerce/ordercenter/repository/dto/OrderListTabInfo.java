package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class OrderListTabInfo {
    @c(a = "schema")
    private final String schema;
    @c(a = "tab")
    private final int tab;
    @c(a = "tab_name")
    private final String tabName;
    @c(a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(53985);
    }

    public OrderListTabInfo() {
        this(0, null, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ OrderListTabInfo copy$default(OrderListTabInfo orderListTabInfo, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = orderListTabInfo.tab;
        }
        if ((i3 & 2) != 0) {
            str = orderListTabInfo.tabName;
        }
        if ((i3 & 4) != 0) {
            str2 = orderListTabInfo.text;
        }
        if ((i3 & 8) != 0) {
            str3 = orderListTabInfo.schema;
        }
        return orderListTabInfo.copy(i2, str, str2, str3);
    }

    public final int component1() {
        return this.tab;
    }

    public final String component2() {
        return this.tabName;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.schema;
    }

    public final OrderListTabInfo copy(int i2, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new OrderListTabInfo(i2, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderListTabInfo)) {
            return false;
        }
        OrderListTabInfo orderListTabInfo = (OrderListTabInfo) obj;
        return this.tab == orderListTabInfo.tab && l.a(this.tabName, orderListTabInfo.tabName) && l.a(this.text, orderListTabInfo.text) && l.a(this.schema, orderListTabInfo.schema);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.tab) * 31;
        String str = this.tabName;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.schema;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "OrderListTabInfo(tab=" + this.tab + ", tabName=" + this.tabName + ", text=" + this.text + ", schema=" + this.schema + ")";
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getTab() {
        return this.tab;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final String getText() {
        return this.text;
    }

    public OrderListTabInfo(int i2, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.tab = i2;
        this.tabName = str;
        this.text = str2;
        this.schema = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderListTabInfo(int i2, String str, String str2, String str3, int i3, g gVar) {
        this((i3 & 1) != 0 ? a.ALL.ordinal() : i2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3);
    }
}
