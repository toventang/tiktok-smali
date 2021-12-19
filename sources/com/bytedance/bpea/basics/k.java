package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class k implements Serializable {
    private final String content;
    private final String dataType;
    private final String id;
    private final String version;

    static {
        Covode.recordClassIndex(15670);
    }

    public static /* synthetic */ k copy$default(k kVar, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = kVar.id;
        }
        if ((i2 & 2) != 0) {
            str2 = kVar.content;
        }
        if ((i2 & 4) != 0) {
            str3 = kVar.dataType;
        }
        if ((i2 & 8) != 0) {
            str4 = kVar.version;
        }
        return kVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.content;
    }

    public final String component3() {
        return this.dataType;
    }

    public final String component4() {
        return this.version;
    }

    public final k copy(String str, String str2, String str3, String str4) {
        return new k(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.id, kVar.id) && l.a(this.content, kVar.content) && l.a(this.dataType, kVar.dataType) && l.a(this.version, kVar.version);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.dataType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.version;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PrivacyPolicy(id=" + this.id + ", content=" + this.content + ", dataType=" + this.dataType + ", version=" + this.version + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDataType() {
        return this.dataType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getVersion() {
        return this.version;
    }

    public k(String str, String str2, String str3, String str4) {
        this.id = str;
        this.content = str2;
        this.dataType = str3;
        this.version = str4;
    }
}
