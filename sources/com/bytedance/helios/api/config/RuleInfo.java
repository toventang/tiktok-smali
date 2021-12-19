package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class RuleInfo {
    public static final a Companion = new a((byte) 0);
    @c(a = "api_ids")
    private final List<Integer> apiIds;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "register_type")
    private final String registerType;
    @c(a = "resource_ids")
    private final List<String> resourceIds;

    static {
        Covode.recordClassIndex(17843);
    }

    public RuleInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.RuleInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleInfo copy$default(RuleInfo ruleInfo, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ruleInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = ruleInfo.registerType;
        }
        if ((i2 & 4) != 0) {
            list = ruleInfo.apiIds;
        }
        if ((i2 & 8) != 0) {
            list2 = ruleInfo.resourceIds;
        }
        return ruleInfo.copy(str, str2, list, list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.registerType;
    }

    public final List<Integer> component3() {
        return this.apiIds;
    }

    public final List<String> component4() {
        return this.resourceIds;
    }

    public final RuleInfo copy(String str, String str2, List<Integer> list, List<String> list2) {
        l.c(str, "");
        l.c(str2, "");
        l.c(list, "");
        l.c(list2, "");
        return new RuleInfo(str, str2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleInfo)) {
            return false;
        }
        RuleInfo ruleInfo = (RuleInfo) obj;
        return l.a(this.name, ruleInfo.name) && l.a(this.registerType, ruleInfo.registerType) && l.a(this.apiIds, ruleInfo.apiIds) && l.a(this.resourceIds, ruleInfo.resourceIds);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.registerType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Integer> list = this.apiIds;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.resourceIds;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "RuleInfo(name=" + this.name + ", registerType=" + this.registerType + ", apiIds=" + this.apiIds + ", resourceIds=" + this.resourceIds + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17844);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegisterType() {
        return this.registerType;
    }

    public final List<String> getResourceIds() {
        return this.resourceIds;
    }

    public RuleInfo(String str, String str2, List<Integer> list, List<String> list2) {
        l.c(str, "");
        l.c(str2, "");
        l.c(list, "");
        l.c(list2, "");
        this.name = str;
        this.registerType = str2;
        this.apiIds = list;
        this.resourceIds = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleInfo(String str, String str2, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "manual" : str2, (i2 & 4) != 0 ? z.INSTANCE : list, (i2 & 8) != 0 ? z.INSTANCE : list2);
    }
}
