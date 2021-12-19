package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class RuleWhen implements Serializable {
    @c(a = "domain")
    private final RuleConfig domain;
    @c(a = "path")
    private final RuleConfig path;

    static {
        Covode.recordClassIndex(47341);
    }

    public RuleWhen() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RuleWhen copy$default(RuleWhen ruleWhen, RuleConfig ruleConfig, RuleConfig ruleConfig2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ruleConfig = ruleWhen.domain;
        }
        if ((i2 & 2) != 0) {
            ruleConfig2 = ruleWhen.path;
        }
        return ruleWhen.copy(ruleConfig, ruleConfig2);
    }

    public final RuleConfig component1() {
        return this.domain;
    }

    public final RuleConfig component2() {
        return this.path;
    }

    public final RuleWhen copy(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        return new RuleWhen(ruleConfig, ruleConfig2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleWhen)) {
            return false;
        }
        RuleWhen ruleWhen = (RuleWhen) obj;
        return l.a(this.domain, ruleWhen.domain) && l.a(this.path, ruleWhen.path);
    }

    public final int hashCode() {
        RuleConfig ruleConfig = this.domain;
        int i2 = 0;
        int hashCode = (ruleConfig != null ? ruleConfig.hashCode() : 0) * 31;
        RuleConfig ruleConfig2 = this.path;
        if (ruleConfig2 != null) {
            i2 = ruleConfig2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RuleWhen(domain=" + this.domain + ", path=" + this.path + ")";
    }

    public final RuleConfig getDomain() {
        return this.domain;
    }

    public final RuleConfig getPath() {
        return this.path;
    }

    public RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        this.domain = ruleConfig;
        this.path = ruleConfig2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : ruleConfig, (i2 & 2) != 0 ? null : ruleConfig2);
    }
}
