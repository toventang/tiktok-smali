package com.ss.android.ugc.aweme.sertting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class PersonalizationModel {
    @c(a = "biz_name")
    private final String bizName;
    @c(a = "need_personalization")
    private final boolean needPersonalization;

    static {
        Covode.recordClassIndex(79339);
    }

    public PersonalizationModel() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ PersonalizationModel copy$default(PersonalizationModel personalizationModel, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = personalizationModel.bizName;
        }
        if ((i2 & 2) != 0) {
            z = personalizationModel.needPersonalization;
        }
        return personalizationModel.copy(str, z);
    }

    public final String component1() {
        return this.bizName;
    }

    public final boolean component2() {
        return this.needPersonalization;
    }

    public final PersonalizationModel copy(String str, boolean z) {
        l.d(str, "");
        return new PersonalizationModel(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizationModel)) {
            return false;
        }
        PersonalizationModel personalizationModel = (PersonalizationModel) obj;
        return l.a(this.bizName, personalizationModel.bizName) && this.needPersonalization == personalizationModel.needPersonalization;
    }

    public final int hashCode() {
        String str = this.bizName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.needPersonalization;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "PersonalizationModel(bizName=" + this.bizName + ", needPersonalization=" + this.needPersonalization + ")";
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final boolean getNeedPersonalization() {
        return this.needPersonalization;
    }

    public PersonalizationModel(String str, boolean z) {
        l.d(str, "");
        this.bizName = str;
        this.needPersonalization = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersonalizationModel(String str, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z);
    }
}
