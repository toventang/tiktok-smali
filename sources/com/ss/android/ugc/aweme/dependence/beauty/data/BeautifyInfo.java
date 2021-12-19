package com.ss.android.ugc.aweme.dependence.beauty.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class BeautifyInfo {
    @c(a = "id")
    private final String effectId;
    @c(a = "tags")
    private final List<BeautifyTag> tags;

    static {
        Covode.recordClassIndex(49436);
    }

    public BeautifyInfo() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeautifyInfo copy$default(BeautifyInfo beautifyInfo, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beautifyInfo.effectId;
        }
        if ((i2 & 2) != 0) {
            list = beautifyInfo.tags;
        }
        return beautifyInfo.copy(str, list);
    }

    public final String component1() {
        return this.effectId;
    }

    public final List<BeautifyTag> component2() {
        return this.tags;
    }

    public final BeautifyInfo copy(String str, List<BeautifyTag> list) {
        l.d(str, "");
        l.d(list, "");
        return new BeautifyInfo(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautifyInfo)) {
            return false;
        }
        BeautifyInfo beautifyInfo = (BeautifyInfo) obj;
        return l.a(this.effectId, beautifyInfo.effectId) && l.a(this.tags, beautifyInfo.tags);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<BeautifyTag> list = this.tags;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BeautifyInfo(effectId=" + this.effectId + ", tags=" + this.tags + ")";
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final List<BeautifyTag> getTags() {
        return this.tags;
    }

    public BeautifyInfo(String str, List<BeautifyTag> list) {
        l.d(str, "");
        l.d(list, "");
        this.effectId = str;
        this.tags = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautifyInfo(String str, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? "-1" : str, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
