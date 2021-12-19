package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class MutualStruct implements Serializable {
    @c(a = "mutual_type")
    public int mutualType;
    @c(a = "total")
    public int total;
    @c(a = "user_list")
    public List<MutualUser> userList;

    static {
        Covode.recordClassIndex(61590);
    }

    public MutualStruct() {
    }

    public static int com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.MutualStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualStruct copy$default(MutualStruct mutualStruct, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = mutualStruct.mutualType;
        }
        if ((i4 & 2) != 0) {
            i3 = mutualStruct.total;
        }
        if ((i4 & 4) != 0) {
            list = mutualStruct.userList;
        }
        return mutualStruct.copy(i2, i3, list);
    }

    public final int component1() {
        return this.mutualType;
    }

    public final int component2() {
        return this.total;
    }

    public final List<MutualUser> component3() {
        return this.userList;
    }

    public final MutualStruct copy(int i2, int i3, List<MutualUser> list) {
        return new MutualStruct(i2, i3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualStruct)) {
            return false;
        }
        MutualStruct mutualStruct = (MutualStruct) obj;
        return this.mutualType == mutualStruct.mutualType && this.total == mutualStruct.total && l.a(this.userList, mutualStruct.userList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mutualType) * 31) + com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total)) * 31;
        List<MutualUser> list = this.userList;
        return com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MutualStruct(mutualType=" + this.mutualType + ", total=" + this.total + ", userList=" + this.userList + ")";
    }

    public final int getMutualType() {
        return this.mutualType;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<MutualUser> getUserList() {
        return this.userList;
    }

    public MutualStruct(int i2, int i3, List<MutualUser> list) {
        this.mutualType = i2;
        this.total = i3;
        this.userList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutualStruct(int i2, int i3, List list, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, list);
    }
}
