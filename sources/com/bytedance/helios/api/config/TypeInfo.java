package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class TypeInfo {
    @c(a = "argument_type_names")
    private final List<TypeInfo> argumentTypeNames;
    @c(a = "owner_type_name")
    private final String ownerTypeName;
    @c(a = "raw_type_name")
    private final String rawTypeName;

    static {
        Covode.recordClassIndex(17846);
    }

    public TypeInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.TypeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypeInfo copy$default(TypeInfo typeInfo, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = typeInfo.rawTypeName;
        }
        if ((i2 & 2) != 0) {
            str2 = typeInfo.ownerTypeName;
        }
        if ((i2 & 4) != 0) {
            list = typeInfo.argumentTypeNames;
        }
        return typeInfo.copy(str, str2, list);
    }

    public final String component1() {
        return this.rawTypeName;
    }

    public final String component2() {
        return this.ownerTypeName;
    }

    public final List<TypeInfo> component3() {
        return this.argumentTypeNames;
    }

    public final TypeInfo copy(String str, String str2, List<TypeInfo> list) {
        l.c(str, "");
        return new TypeInfo(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) obj;
        return l.a(this.rawTypeName, typeInfo.rawTypeName) && l.a(this.ownerTypeName, typeInfo.ownerTypeName) && l.a(this.argumentTypeNames, typeInfo.argumentTypeNames);
    }

    public final int hashCode() {
        String str = this.rawTypeName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ownerTypeName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<TypeInfo> list = this.argumentTypeNames;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "TypeInfo(rawTypeName=" + this.rawTypeName + ", ownerTypeName=" + this.ownerTypeName + ", argumentTypeNames=" + this.argumentTypeNames + ")";
    }

    public final List<TypeInfo> getArgumentTypeNames() {
        return this.argumentTypeNames;
    }

    public final String getOwnerTypeName() {
        return this.ownerTypeName;
    }

    public final String getRawTypeName() {
        return this.rawTypeName;
    }

    public TypeInfo(String str, String str2, List<TypeInfo> list) {
        l.c(str, "");
        this.rawTypeName = str;
        this.ownerTypeName = str2;
        this.argumentTypeNames = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TypeInfo(String str, String str2, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list);
    }
}
