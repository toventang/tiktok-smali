package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class PackedSKUSaleProp {
    @c(a = "prop_id")
    private final String propId;
    @c(a = "prop_name")
    private final String propName;
    @c(a = "prop_value")
    private final String propValue;
    @c(a = "prop_value_id")
    private final String propValueId;

    static {
        Covode.recordClassIndex(53113);
    }

    public static /* synthetic */ PackedSKUSaleProp copy$default(PackedSKUSaleProp packedSKUSaleProp, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = packedSKUSaleProp.propId;
        }
        if ((i2 & 2) != 0) {
            str2 = packedSKUSaleProp.propValueId;
        }
        if ((i2 & 4) != 0) {
            str3 = packedSKUSaleProp.propName;
        }
        if ((i2 & 8) != 0) {
            str4 = packedSKUSaleProp.propValue;
        }
        return packedSKUSaleProp.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.propId;
    }

    public final String component2() {
        return this.propValueId;
    }

    public final String component3() {
        return this.propName;
    }

    public final String component4() {
        return this.propValue;
    }

    public final PackedSKUSaleProp copy(String str, String str2, String str3, String str4) {
        return new PackedSKUSaleProp(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedSKUSaleProp)) {
            return false;
        }
        PackedSKUSaleProp packedSKUSaleProp = (PackedSKUSaleProp) obj;
        return l.a(this.propId, packedSKUSaleProp.propId) && l.a(this.propValueId, packedSKUSaleProp.propValueId) && l.a(this.propName, packedSKUSaleProp.propName) && l.a(this.propValue, packedSKUSaleProp.propValue);
    }

    public final int hashCode() {
        String str = this.propId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.propValueId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.propName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.propValue;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PackedSKUSaleProp(propId=" + this.propId + ", propValueId=" + this.propValueId + ", propName=" + this.propName + ", propValue=" + this.propValue + ")";
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getPropName() {
        return this.propName;
    }

    public final String getPropValue() {
        return this.propValue;
    }

    public final String getPropValueId() {
        return this.propValueId;
    }

    public final PackedSKUSaleProp merge(PackedSKUSaleProp packedSKUSaleProp) {
        if (packedSKUSaleProp == null) {
            return this;
        }
        String str = packedSKUSaleProp.propId;
        if (str == null) {
            str = this.propId;
        }
        String str2 = packedSKUSaleProp.propValueId;
        if (str2 == null) {
            str2 = this.propValueId;
        }
        String str3 = packedSKUSaleProp.propName;
        if (str3 == null) {
            str3 = this.propName;
        }
        String str4 = packedSKUSaleProp.propValue;
        if (str4 == null) {
            str4 = this.propValue;
        }
        return new PackedSKUSaleProp(str, str2, str3, str4);
    }

    public PackedSKUSaleProp(String str, String str2, String str3, String str4) {
        this.propId = str;
        this.propValueId = str2;
        this.propName = str3;
        this.propValue = str4;
    }
}
