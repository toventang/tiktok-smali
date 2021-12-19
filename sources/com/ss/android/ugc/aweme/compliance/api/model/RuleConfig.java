package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class RuleConfig implements Serializable {
    @c(a = "op")
    private final String op;
    private final Map<String, String> replaceMap;
    @c(a = StringSet.type)
    private final String type;
    @c(a = "value")
    private final Set<String> value;

    static {
        Covode.recordClassIndex(47340);
    }

    public RuleConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.RuleConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleConfig copy$default(RuleConfig ruleConfig, String str, String str2, Set set, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ruleConfig.op;
        }
        if ((i2 & 2) != 0) {
            str2 = ruleConfig.type;
        }
        if ((i2 & 4) != 0) {
            set = ruleConfig.value;
        }
        if ((i2 & 8) != 0) {
            map = ruleConfig.replaceMap;
        }
        return ruleConfig.copy(str, str2, set, map);
    }

    public final String component1() {
        return this.op;
    }

    public final String component2() {
        return this.type;
    }

    public final Set<String> component3() {
        return this.value;
    }

    public final Map<String, String> component4() {
        return this.replaceMap;
    }

    public final RuleConfig copy(String str, String str2, Set<String> set, Map<String, String> map) {
        l.d(map, "");
        return new RuleConfig(str, str2, set, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleConfig)) {
            return false;
        }
        RuleConfig ruleConfig = (RuleConfig) obj;
        return l.a(this.op, ruleConfig.op) && l.a(this.type, ruleConfig.type) && l.a(this.value, ruleConfig.value) && l.a(this.replaceMap, ruleConfig.replaceMap);
    }

    public final int hashCode() {
        String str = this.op;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<String> set = this.value;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, String> map = this.replaceMap;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "RuleConfig(op=" + this.op + ", type=" + this.type + ", value=" + this.value + ", replaceMap=" + this.replaceMap + ")";
    }

    public final String getOp() {
        return this.op;
    }

    public final Map<String, String> getReplaceMap() {
        return this.replaceMap;
    }

    public final String getType() {
        return this.type;
    }

    public final Set<String> getValue() {
        return this.value;
    }

    public RuleConfig(String str, String str2, Set<String> set, Map<String, String> map) {
        l.d(map, "");
        this.op = str;
        this.type = str2;
        this.value = set;
        this.replaceMap = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleConfig(String str, String str2, Set set, Map map, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : set, (i2 & 8) != 0 ? new LinkedHashMap() : map);
    }
}
