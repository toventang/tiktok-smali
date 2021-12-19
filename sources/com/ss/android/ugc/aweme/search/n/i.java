package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class i implements Serializable {
    private final String authorId;
    private final String groupId;

    static {
        Covode.recordClassIndex(79176);
    }

    public i() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ i copy$default(i iVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iVar.authorId;
        }
        if ((i2 & 2) != 0) {
            str2 = iVar.groupId;
        }
        return iVar.copy(str, str2);
    }

    public final String component1() {
        return this.authorId;
    }

    public final String component2() {
        return this.groupId;
    }

    public final i copy(String str, String str2) {
        return new i(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.authorId, iVar.authorId) && l.a(this.groupId, iVar.groupId);
    }

    public final int hashCode() {
        String str = this.authorId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.groupId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchVideoModel(authorId=" + this.authorId + ", groupId=" + this.groupId + ")";
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public i(String str, String str2) {
        this.authorId = str;
        this.groupId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
