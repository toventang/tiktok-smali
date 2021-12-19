package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class InterfaceControlRule implements Serializable {
    @c(a = StringSet.name)
    private final String name;
    @c(a = "then")
    private final List<RuleConfig> ruleThens;
    @c(a = "when")
    private final RuleWhen ruleWhen;

    static {
        Covode.recordClassIndex(47333);
    }

    public InterfaceControlRule() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceControlRule copy$default(InterfaceControlRule interfaceControlRule, String str, RuleWhen ruleWhen2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = interfaceControlRule.name;
        }
        if ((i2 & 2) != 0) {
            ruleWhen2 = interfaceControlRule.ruleWhen;
        }
        if ((i2 & 4) != 0) {
            list = interfaceControlRule.ruleThens;
        }
        return interfaceControlRule.copy(str, ruleWhen2, list);
    }

    public final String component1() {
        return this.name;
    }

    public final RuleWhen component2() {
        return this.ruleWhen;
    }

    public final List<RuleConfig> component3() {
        return this.ruleThens;
    }

    public final InterfaceControlRule copy(String str, RuleWhen ruleWhen2, List<RuleConfig> list) {
        return new InterfaceControlRule(str, ruleWhen2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceControlRule)) {
            return false;
        }
        InterfaceControlRule interfaceControlRule = (InterfaceControlRule) obj;
        return l.a(this.name, interfaceControlRule.name) && l.a(this.ruleWhen, interfaceControlRule.ruleWhen) && l.a(this.ruleThens, interfaceControlRule.ruleThens);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RuleWhen ruleWhen2 = this.ruleWhen;
        int hashCode2 = (hashCode + (ruleWhen2 != null ? ruleWhen2.hashCode() : 0)) * 31;
        List<RuleConfig> list = this.ruleThens;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "InterfaceControlRule(name=" + this.name + ", ruleWhen=" + this.ruleWhen + ", ruleThens=" + this.ruleThens + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final List<RuleConfig> getRuleThens() {
        return this.ruleThens;
    }

    public final RuleWhen getRuleWhen() {
        return this.ruleWhen;
    }

    public InterfaceControlRule(String str, RuleWhen ruleWhen2, List<RuleConfig> list) {
        this.name = str;
        this.ruleWhen = ruleWhen2;
        this.ruleThens = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterfaceControlRule(String str, RuleWhen ruleWhen2, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : ruleWhen2, (i2 & 4) != 0 ? null : list);
    }
}
