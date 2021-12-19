package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;

public final class Group {
    @c(a = "desc")
    private final String desc;
    @c(a = "isDefault")
    private final boolean isDefault;
    @c(a = "value")
    private l value;

    static {
        Covode.recordClassIndex(7355);
    }

    public static /* synthetic */ Group copy$default(Group group, l lVar, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = group.value;
        }
        if ((i2 & 2) != 0) {
            str = group.desc;
        }
        if ((i2 & 4) != 0) {
            z = group.isDefault;
        }
        return group.copy(lVar, str, z);
    }

    public final l component1() {
        return this.value;
    }

    public final String component2() {
        return this.desc;
    }

    public final boolean component3() {
        return this.isDefault;
    }

    public final Group copy(l lVar, String str, boolean z) {
        h.f.b.l.c(lVar, "");
        h.f.b.l.c(str, "");
        return new Group(lVar, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        return h.f.b.l.a(this.value, group.value) && h.f.b.l.a(this.desc, group.desc) && this.isDefault == group.isDefault;
    }

    public final int hashCode() {
        l lVar = this.value;
        int i2 = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        String str = this.desc;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "Group(value=" + this.value + ", desc=" + this.desc + ", isDefault=" + this.isDefault + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final l getValue() {
        return this.value;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final void setValue(l lVar) {
        h.f.b.l.c(lVar, "");
        this.value = lVar;
    }

    public Group(l lVar, String str, boolean z) {
        h.f.b.l.c(lVar, "");
        h.f.b.l.c(str, "");
        this.value = lVar;
        this.desc = str;
        this.isDefault = z;
    }
}
