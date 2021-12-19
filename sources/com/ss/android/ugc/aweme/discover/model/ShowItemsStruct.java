package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class ShowItemsStruct implements Serializable {
    @c(a = "desc")
    private final String desc;
    @c(a = "schema")
    private final String schema;
    @c(a = StringSet.type)
    private final String type;

    static {
        Covode.recordClassIndex(50975);
    }

    public static /* synthetic */ ShowItemsStruct copy$default(ShowItemsStruct showItemsStruct, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = showItemsStruct.desc;
        }
        if ((i2 & 2) != 0) {
            str2 = showItemsStruct.schema;
        }
        if ((i2 & 4) != 0) {
            str3 = showItemsStruct.type;
        }
        return showItemsStruct.copy(str, str2, str3);
    }

    public final String component1() {
        return this.desc;
    }

    public final String component2() {
        return this.schema;
    }

    public final String component3() {
        return this.type;
    }

    public final ShowItemsStruct copy(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new ShowItemsStruct(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowItemsStruct)) {
            return false;
        }
        ShowItemsStruct showItemsStruct = (ShowItemsStruct) obj;
        return l.a(this.desc, showItemsStruct.desc) && l.a(this.schema, showItemsStruct.schema) && l.a(this.type, showItemsStruct.type);
    }

    public final int hashCode() {
        String str = this.desc;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ShowItemsStruct(desc=" + this.desc + ", schema=" + this.schema + ", type=" + this.type + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getType() {
        return this.type;
    }

    public ShowItemsStruct(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.desc = str;
        this.schema = str2;
        this.type = str3;
    }
}
