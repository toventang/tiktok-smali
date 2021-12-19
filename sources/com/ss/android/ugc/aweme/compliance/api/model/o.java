package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class o implements Serializable {
    @c(a = "res_type")
    private final int resType;
    @c(a = "show_type")
    private final int showType;
    @c(a = "tips_type")
    private final int tipsType;
    @c(a = "values")
    private final List<p> values;

    static {
        Covode.recordClassIndex(47361);
    }

    public o() {
        this(0, 0, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.o */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o copy$default(o oVar, int i2, int i3, List list, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = oVar.showType;
        }
        if ((i5 & 2) != 0) {
            i3 = oVar.resType;
        }
        if ((i5 & 4) != 0) {
            list = oVar.values;
        }
        if ((i5 & 8) != 0) {
            i4 = oVar.tipsType;
        }
        return oVar.copy(i2, i3, list, i4);
    }

    public final int component1() {
        return this.showType;
    }

    public final int component2() {
        return this.resType;
    }

    public final List<p> component3() {
        return this.values;
    }

    public final int component4() {
        return this.tipsType;
    }

    public final o copy(int i2, int i3, List<p> list, int i4) {
        return new o(i2, i3, list, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.showType == oVar.showType && this.resType == oVar.resType && l.a(this.values, oVar.values) && this.tipsType == oVar.tipsType;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showType) * 31) + com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.resType)) * 31;
        List<p> list = this.values;
        return ((com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.tipsType);
    }

    public final int getResType() {
        return this.resType;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final int getTipsType() {
        return this.tipsType;
    }

    public final List<p> getValues() {
        return this.values;
    }

    public final String toString() {
        return "{'show_type':" + this.showType + ", 'res_type':" + this.resType + ", 'values':" + this.values + ", 'tips_type':" + this.tipsType + "}";
    }

    public final p getTargetRestrictionOption(Integer num) {
        List<p> list = this.values;
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            int value = next.getValue();
            if (num != null && value == num.intValue()) {
                t = next;
                break;
            }
        }
        return t;
    }

    public o(int i2, int i3, List<p> list, int i4) {
        this.showType = i2;
        this.resType = i3;
        this.values = list;
        this.tipsType = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, int i3, List list, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? null : list, (i5 & 8) != 0 ? 0 : i4);
    }
}
