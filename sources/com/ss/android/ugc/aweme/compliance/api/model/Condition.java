package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.ab;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public final class Condition implements Serializable {
    @c(a = "action")
    private final Integer action;
    @c(a = "paths")
    private final Set<String> paths;
    @c(a = "subdomains")
    private final List<String> subdomains;

    static {
        Covode.recordClassIndex(47331);
    }

    public Condition() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.Condition */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Condition copy$default(Condition condition, Integer num, Set set, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = condition.action;
        }
        if ((i2 & 2) != 0) {
            set = condition.paths;
        }
        if ((i2 & 4) != 0) {
            list = condition.subdomains;
        }
        return condition.copy(num, set, list);
    }

    public final Integer component1() {
        return this.action;
    }

    public final Set<String> component2() {
        return this.paths;
    }

    public final List<String> component3() {
        return this.subdomains;
    }

    public final Condition copy(Integer num, Set<String> set, List<String> list) {
        return new Condition(num, set, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        return l.a(this.action, condition.action) && l.a(this.paths, condition.paths) && l.a(this.subdomains, condition.subdomains);
    }

    public final int hashCode() {
        Integer num = this.action;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Set<String> set = this.paths;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        List<String> list = this.subdomains;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Condition(action=" + this.action + ", paths=" + this.paths + ", subdomains=" + this.subdomains + ")";
    }

    public final Integer getAction() {
        return this.action;
    }

    public final Set<String> getPaths() {
        return this.paths;
    }

    public final List<String> getSubdomains() {
        return this.subdomains;
    }

    public Condition(Integer num, Set<String> set, List<String> list) {
        this.action = num;
        this.paths = set;
        this.subdomains = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Condition(Integer num, Set set, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? 2 : num, (i2 & 2) != 0 ? ab.INSTANCE : set, (i2 & 4) != 0 ? z.INSTANCE : list);
    }
}
