package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class EntranceData {
    @c(a = "icon")
    private final Icon icon;
    @c(a = "key")
    private final String key;
    @c(a = "schema")
    private final String schema;
    @c(a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(53979);
    }

    public static /* synthetic */ EntranceData copy$default(EntranceData entranceData, String str, String str2, String str3, Icon icon2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = entranceData.key;
        }
        if ((i2 & 2) != 0) {
            str2 = entranceData.text;
        }
        if ((i2 & 4) != 0) {
            str3 = entranceData.schema;
        }
        if ((i2 & 8) != 0) {
            icon2 = entranceData.icon;
        }
        return entranceData.copy(str, str2, str3, icon2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.schema;
    }

    public final Icon component4() {
        return this.icon;
    }

    public final EntranceData copy(String str, String str2, String str3, Icon icon2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new EntranceData(str, str2, str3, icon2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceData)) {
            return false;
        }
        EntranceData entranceData = (EntranceData) obj;
        return l.a(this.key, entranceData.key) && l.a(this.text, entranceData.text) && l.a(this.schema, entranceData.schema) && l.a(this.icon, entranceData.icon);
    }

    public final int hashCode() {
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.schema;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Icon icon2 = this.icon;
        if (icon2 != null) {
            i2 = icon2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EntranceData(key=" + this.key + ", text=" + this.text + ", schema=" + this.schema + ", icon=" + this.icon + ")";
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getText() {
        return this.text;
    }

    public EntranceData(String str, String str2, String str3, Icon icon2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.key = str;
        this.text = str2;
        this.schema = str3;
        this.icon = icon2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntranceData(String str, String str2, String str3, Icon icon2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, icon2);
    }
}
