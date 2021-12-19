package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.compliance.api.a.b;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class InterfaceControlSettings implements Serializable {
    @c(a = "rules")
    private final List<InterfaceControlRule> rules;
    @c(a = "use_new_control")
    private final Boolean useNewControl;
    @c(a = "user_type")
    private final String userType;
    @c(a = "version")
    private final String version;

    static {
        Covode.recordClassIndex(47334);
    }

    public InterfaceControlSettings() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceControlSettings copy$default(InterfaceControlSettings interfaceControlSettings, List list, String str, String str2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = interfaceControlSettings.rules;
        }
        if ((i2 & 2) != 0) {
            str = interfaceControlSettings.userType;
        }
        if ((i2 & 4) != 0) {
            str2 = interfaceControlSettings.version;
        }
        if ((i2 & 8) != 0) {
            bool = interfaceControlSettings.useNewControl;
        }
        return interfaceControlSettings.copy(list, str, str2, bool);
    }

    public final List<InterfaceControlRule> component1() {
        return this.rules;
    }

    public final String component2() {
        return this.userType;
    }

    public final String component3() {
        return this.version;
    }

    public final Boolean component4() {
        return this.useNewControl;
    }

    public final InterfaceControlSettings copy(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        return new InterfaceControlSettings(list, str, str2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceControlSettings)) {
            return false;
        }
        InterfaceControlSettings interfaceControlSettings = (InterfaceControlSettings) obj;
        return l.a(this.rules, interfaceControlSettings.rules) && l.a(this.userType, interfaceControlSettings.userType) && l.a(this.version, interfaceControlSettings.version) && l.a(this.useNewControl, interfaceControlSettings.useNewControl);
    }

    public final int hashCode() {
        List<InterfaceControlRule> list = this.rules;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.userType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.useNewControl;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "InterfaceControlSettings(rules=" + this.rules + ", userType=" + this.userType + ", version=" + this.version + ", useNewControl=" + this.useNewControl + ")";
    }

    public final List<InterfaceControlRule> getRules() {
        return this.rules;
    }

    public final Boolean getUseNewControl() {
        return this.useNewControl;
    }

    /* renamed from: getUserType  reason: collision with other method in class */
    public final String m219getUserType() {
        return this.userType;
    }

    public final String getVersion() {
        return this.version;
    }

    public final b getUserType() {
        String str = this.userType;
        if (str == null) {
            str = "";
        }
        l.d(str, "");
        if (l.a((Object) str, (Object) b.NOT_LOGIN.getUserType())) {
            return b.NOT_LOGIN;
        }
        if (l.a((Object) str, (Object) b.NORMAL.getUserType())) {
            return b.NORMAL;
        }
        if (l.a((Object) str, (Object) b.CHILD_US.getUserType())) {
            return b.CHILD_US;
        }
        if (l.a((Object) str, (Object) b.CHILD_OTHERS.getUserType())) {
            return b.CHILD_US;
        }
        return b.UNKNOWN;
    }

    public InterfaceControlSettings(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        this.rules = list;
        this.userType = str;
        this.version = str2;
        this.useNewControl = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterfaceControlSettings(List list, String str, String str2, Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : bool);
    }
}
