package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class b implements Serializable {
    @c(a = "sub_categories")
    private final List<d> categoryList;
    @c(a = "enable_sub_category")
    private final int enable;

    static {
        Covode.recordClassIndex(46164);
    }

    public b() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b copy$default(b bVar, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = bVar.enable;
        }
        if ((i3 & 2) != 0) {
            list = bVar.categoryList;
        }
        return bVar.copy(i2, list);
    }

    public final int component1() {
        return this.enable;
    }

    public final List<d> component2() {
        return this.categoryList;
    }

    public final b copy(int i2, List<d> list) {
        return new b(i2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.enable == bVar.enable && l.a(this.categoryList, bVar.categoryList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.enable) * 31;
        List<d> list = this.categoryList;
        return com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AdDislikeInfo(enable=" + this.enable + ", categoryList=" + this.categoryList + ")";
    }

    public final List<d> getCategoryList() {
        return this.categoryList;
    }

    public final int getEnable() {
        return this.enable;
    }

    public b(int i2, List<d> list) {
        this.enable = i2;
        this.categoryList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, List list, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : list);
    }
}
