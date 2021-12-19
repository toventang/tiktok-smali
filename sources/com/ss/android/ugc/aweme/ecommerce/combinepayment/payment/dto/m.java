package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class m implements Serializable {
    @c(a = "element")
    private final String element;
    @c(a = "is_encrypted")
    private final Boolean isEncrypted;
    @c(a = "need_encryption")
    private final Boolean needEncryption;
    @c(a = "param_name")
    private final String paramName;
    @c(a = "param_value")
    private String paramValue;

    static {
        Covode.recordClassIndex(53385);
    }

    public m() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ m copy$default(m mVar, String str, String str2, String str3, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mVar.element;
        }
        if ((i2 & 2) != 0) {
            str2 = mVar.paramName;
        }
        if ((i2 & 4) != 0) {
            str3 = mVar.paramValue;
        }
        if ((i2 & 8) != 0) {
            bool = mVar.needEncryption;
        }
        if ((i2 & 16) != 0) {
            bool2 = mVar.isEncrypted;
        }
        return mVar.copy(str, str2, str3, bool, bool2);
    }

    public final String component1() {
        return this.element;
    }

    public final String component2() {
        return this.paramName;
    }

    public final String component3() {
        return this.paramValue;
    }

    public final Boolean component4() {
        return this.needEncryption;
    }

    public final Boolean component5() {
        return this.isEncrypted;
    }

    public final m copy(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        return new m(str, str2, str3, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.element, mVar.element) && l.a(this.paramName, mVar.paramName) && l.a(this.paramValue, mVar.paramValue) && l.a(this.needEncryption, mVar.needEncryption) && l.a(this.isEncrypted, mVar.isEncrypted);
    }

    public final int hashCode() {
        String str = this.element;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.paramName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.paramValue;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.needEncryption;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isEncrypted;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "PaymentElement(element=" + this.element + ", paramName=" + this.paramName + ", paramValue=" + this.paramValue + ", needEncryption=" + this.needEncryption + ", isEncrypted=" + this.isEncrypted + ")";
    }

    public final String getElement() {
        return this.element;
    }

    public final Boolean getNeedEncryption() {
        return this.needEncryption;
    }

    public final String getParamName() {
        return this.paramName;
    }

    public final String getParamValue() {
        return this.paramValue;
    }

    public final Boolean isEncrypted() {
        return this.isEncrypted;
    }

    public final void setParamValue(String str) {
        this.paramValue = str;
    }

    public m(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.element = str;
        this.paramName = str2;
        this.paramValue = str3;
        this.needEncryption = bool;
        this.isEncrypted = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, String str2, String str3, Boolean bool, Boolean bool2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) == 0 ? bool : null, (i2 & 16) != 0 ? false : bool2);
    }
}
