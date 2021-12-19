package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.ab;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Set;

public final class KidsRequestParamControl implements Serializable {
    @c(a = "deny_keywords")
    private Set<String> denyKeywords;
    @c(a = "enable")
    private final Boolean enable;

    static {
        Covode.recordClassIndex(47335);
    }

    public KidsRequestParamControl() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.KidsRequestParamControl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KidsRequestParamControl copy$default(KidsRequestParamControl kidsRequestParamControl, Boolean bool, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = kidsRequestParamControl.enable;
        }
        if ((i2 & 2) != 0) {
            set = kidsRequestParamControl.denyKeywords;
        }
        return kidsRequestParamControl.copy(bool, set);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final Set<String> component2() {
        return this.denyKeywords;
    }

    public final KidsRequestParamControl copy(Boolean bool, Set<String> set) {
        return new KidsRequestParamControl(bool, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsRequestParamControl)) {
            return false;
        }
        KidsRequestParamControl kidsRequestParamControl = (KidsRequestParamControl) obj;
        return l.a(this.enable, kidsRequestParamControl.enable) && l.a(this.denyKeywords, kidsRequestParamControl.denyKeywords);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Set<String> set = this.denyKeywords;
        if (set != null) {
            i2 = set.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "KidsRequestParamControl(enable=" + this.enable + ", denyKeywords=" + this.denyKeywords + ")";
    }

    public final Set<String> getDenyKeywords() {
        return this.denyKeywords;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final void setDenyKeywords(Set<String> set) {
        this.denyKeywords = set;
    }

    public KidsRequestParamControl(Boolean bool, Set<String> set) {
        this.enable = bool;
        this.denyKeywords = set;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsRequestParamControl(Boolean bool, Set set, int i2, g gVar) {
        this((i2 & 1) != 0 ? true : bool, (i2 & 2) != 0 ? ab.INSTANCE : set);
    }
}
