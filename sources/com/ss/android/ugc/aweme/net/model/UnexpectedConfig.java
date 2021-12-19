package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.m.l;
import java.util.List;

public final class UnexpectedConfig {
    private final String id;
    private final String pattern;
    private l regex;
    private final int scope;
    private List<String> targets;
    private final int type;

    static {
        Covode.recordClassIndex(72265);
    }

    public static int com_ss_android_ugc_aweme_net_model_UnexpectedConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.net.model.UnexpectedConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnexpectedConfig copy$default(UnexpectedConfig unexpectedConfig, String str, int i2, int i3, String str2, l lVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = unexpectedConfig.pattern;
        }
        if ((i4 & 2) != 0) {
            i2 = unexpectedConfig.scope;
        }
        if ((i4 & 4) != 0) {
            i3 = unexpectedConfig.type;
        }
        if ((i4 & 8) != 0) {
            str2 = unexpectedConfig.id;
        }
        if ((i4 & 16) != 0) {
            lVar = unexpectedConfig.regex;
        }
        if ((i4 & 32) != 0) {
            list = unexpectedConfig.targets;
        }
        return unexpectedConfig.copy(str, i2, i3, str2, lVar, list);
    }

    public final String component1() {
        return this.pattern;
    }

    public final int component2() {
        return this.scope;
    }

    public final int component3() {
        return this.type;
    }

    public final String component4() {
        return this.id;
    }

    public final l component5() {
        return this.regex;
    }

    public final List<String> component6() {
        return this.targets;
    }

    public final UnexpectedConfig copy(String str, int i2, int i3, String str2, l lVar, List<String> list) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        return new UnexpectedConfig(str, i2, i3, str2, lVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnexpectedConfig)) {
            return false;
        }
        UnexpectedConfig unexpectedConfig = (UnexpectedConfig) obj;
        return h.f.b.l.a(this.pattern, unexpectedConfig.pattern) && this.scope == unexpectedConfig.scope && this.type == unexpectedConfig.type && h.f.b.l.a(this.id, unexpectedConfig.id) && h.f.b.l.a(this.regex, unexpectedConfig.regex) && h.f.b.l.a(this.targets, unexpectedConfig.targets);
    }

    public final int hashCode() {
        String str = this.pattern;
        int i2 = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_net_model_UnexpectedConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.scope)) * 31) + com_ss_android_ugc_aweme_net_model_UnexpectedConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type)) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l lVar = this.regex;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        List<String> list = this.targets;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "UnexpectedConfig(pattern=" + this.pattern + ", scope=" + this.scope + ", type=" + this.type + ", id=" + this.id + ", regex=" + this.regex + ", targets=" + this.targets + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final l getRegex() {
        return this.regex;
    }

    public final int getScope() {
        return this.scope;
    }

    public final List<String> getTargets() {
        return this.targets;
    }

    public final int getType() {
        return this.type;
    }

    public final void setRegex(l lVar) {
        this.regex = lVar;
    }

    public final void setTargets(List<String> list) {
        this.targets = list;
    }

    public UnexpectedConfig(String str, int i2, int i3, String str2, l lVar, List<String> list) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        this.pattern = str;
        this.scope = i2;
        this.type = i3;
        this.id = str2;
        this.regex = lVar;
        this.targets = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnexpectedConfig(String str, int i2, int i3, String str2, l lVar, List list, int i4, g gVar) {
        this(str, i2, i3, str2, (i4 & 16) != 0 ? null : lVar, (i4 & 32) == 0 ? list : null);
    }
}
