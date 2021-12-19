package com.ss.android.ugc.aweme.im.sdk.relations.data.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    private final List<Long> createdTimes;
    private final int relationType;
    private final List<String> secUserIds;

    static {
        Covode.recordClassIndex(66016);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.relations.data.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, int i2, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = aVar.relationType;
        }
        if ((i3 & 2) != 0) {
            list = aVar.secUserIds;
        }
        if ((i3 & 4) != 0) {
            list2 = aVar.createdTimes;
        }
        return aVar.copy(i2, list, list2);
    }

    public final int component1() {
        return this.relationType;
    }

    public final List<String> component2() {
        return this.secUserIds;
    }

    public final List<Long> component3() {
        return this.createdTimes;
    }

    public final a copy(int i2, List<String> list, List<Long> list2) {
        l.d(list, "");
        l.d(list2, "");
        return new a(i2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.relationType == aVar.relationType && l.a(this.secUserIds, aVar.secUserIds) && l.a(this.createdTimes, aVar.createdTimes);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.relationType) * 31;
        List<String> list = this.secUserIds;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Long> list2 = this.createdTimes;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FamiliarRelationModel(relationType=" + this.relationType + ", secUserIds=" + this.secUserIds + ", createdTimes=" + this.createdTimes + ")";
    }

    public final List<Long> getCreatedTimes() {
        return this.createdTimes;
    }

    public final int getRelationType() {
        return this.relationType;
    }

    public final List<String> getSecUserIds() {
        return this.secUserIds;
    }

    public a(int i2, List<String> list, List<Long> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.relationType = i2;
        this.secUserIds = list;
        this.createdTimes = list2;
    }
}
