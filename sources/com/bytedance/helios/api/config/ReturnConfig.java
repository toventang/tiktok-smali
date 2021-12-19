package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class ReturnConfig {
    @c(a = "default_result")
    private final Object defaultResult;
    @c(a = "default_value")
    private final String defaultValue;
    @c(a = "type_info")
    private final TypeInfo typeInfo;

    static {
        Covode.recordClassIndex(17842);
    }

    public ReturnConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ReturnConfig copy$default(ReturnConfig returnConfig, String str, TypeInfo typeInfo2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = returnConfig.defaultValue;
        }
        if ((i2 & 2) != 0) {
            typeInfo2 = returnConfig.typeInfo;
        }
        if ((i2 & 4) != 0) {
            obj = returnConfig.defaultResult;
        }
        return returnConfig.copy(str, typeInfo2, obj);
    }

    public final String component1() {
        return this.defaultValue;
    }

    public final TypeInfo component2() {
        return this.typeInfo;
    }

    public final Object component3() {
        return this.defaultResult;
    }

    public final ReturnConfig copy(String str, TypeInfo typeInfo2, Object obj) {
        return new ReturnConfig(str, typeInfo2, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnConfig)) {
            return false;
        }
        ReturnConfig returnConfig = (ReturnConfig) obj;
        return l.a(this.defaultValue, returnConfig.defaultValue) && l.a(this.typeInfo, returnConfig.typeInfo) && l.a(this.defaultResult, returnConfig.defaultResult);
    }

    public final int hashCode() {
        String str = this.defaultValue;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TypeInfo typeInfo2 = this.typeInfo;
        int hashCode2 = (hashCode + (typeInfo2 != null ? typeInfo2.hashCode() : 0)) * 31;
        Object obj = this.defaultResult;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ReturnConfig(defaultValue=" + this.defaultValue + ", typeInfo=" + this.typeInfo + ", defaultResult=" + this.defaultResult + ")";
    }

    public final Object getDefaultResult() {
        return this.defaultResult;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final TypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    public ReturnConfig(String str, TypeInfo typeInfo2, Object obj) {
        this.defaultValue = str;
        this.typeInfo = typeInfo2;
        this.defaultResult = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReturnConfig(String str, TypeInfo typeInfo2, Object obj, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : typeInfo2, (i2 & 4) != 0 ? null : obj);
    }
}
