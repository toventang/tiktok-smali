package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class Strategy implements Serializable {
    @c(a = "action")
    private final Integer action;
    @c(a = "conditions")
    private final List<Condition> conditions;
    @c(a = "domains")
    private final List<String> domains;

    static {
        Covode.recordClassIndex(47342);
    }

    public Strategy() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.Strategy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Strategy copy$default(Strategy strategy, Integer num, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = strategy.action;
        }
        if ((i2 & 2) != 0) {
            list = strategy.conditions;
        }
        if ((i2 & 4) != 0) {
            list2 = strategy.domains;
        }
        return strategy.copy(num, list, list2);
    }

    public final Integer component1() {
        return this.action;
    }

    public final List<Condition> component2() {
        return this.conditions;
    }

    public final List<String> component3() {
        return this.domains;
    }

    public final Strategy copy(Integer num, List<Condition> list, List<String> list2) {
        return new Strategy(num, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return l.a(this.action, strategy.action) && l.a(this.conditions, strategy.conditions) && l.a(this.domains, strategy.domains);
    }

    public final int hashCode() {
        Integer num = this.action;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Condition> list = this.conditions;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.domains;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Strategy(action=" + this.action + ", conditions=" + this.conditions + ", domains=" + this.domains + ")";
    }

    public final Integer getAction() {
        return this.action;
    }

    public final List<Condition> getConditions() {
        return this.conditions;
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public Strategy(Integer num, List<Condition> list, List<String> list2) {
        this.action = num;
        this.conditions = list;
        this.domains = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Strategy(Integer num, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 2 : num, (i2 & 2) != 0 ? z.INSTANCE : list, (i2 & 4) != 0 ? z.INSTANCE : list2);
    }
}
