package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class DuetStickerStruct implements Serializable {
    @c(a = "stickerContent")
    public String duetString;
    @c(a = "micPermissionOn")
    public boolean openMic;
    @c(a = "invitedToDuetUserIds")
    public List<String> userIdList;
    @c(a = "user_list")
    public List<DuetStickerUserStruct> userList;

    static {
        Covode.recordClassIndex(88096);
    }

    public DuetStickerStruct() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DuetStickerStruct copy$default(DuetStickerStruct duetStickerStruct, List list, boolean z, String str, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = duetStickerStruct.userList;
        }
        if ((i2 & 2) != 0) {
            z = duetStickerStruct.openMic;
        }
        if ((i2 & 4) != 0) {
            str = duetStickerStruct.duetString;
        }
        if ((i2 & 8) != 0) {
            list2 = duetStickerStruct.userIdList;
        }
        return duetStickerStruct.copy(list, z, str, list2);
    }

    public final List<DuetStickerUserStruct> component1() {
        return this.userList;
    }

    public final boolean component2() {
        return this.openMic;
    }

    public final String component3() {
        return this.duetString;
    }

    public final List<String> component4() {
        return this.userIdList;
    }

    public final DuetStickerStruct copy(List<DuetStickerUserStruct> list, boolean z, String str, List<String> list2) {
        l.d(str, "");
        l.d(list2, "");
        return new DuetStickerStruct(list, z, str, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetStickerStruct)) {
            return false;
        }
        DuetStickerStruct duetStickerStruct = (DuetStickerStruct) obj;
        return l.a(this.userList, duetStickerStruct.userList) && this.openMic == duetStickerStruct.openMic && l.a(this.duetString, duetStickerStruct.duetString) && l.a(this.userIdList, duetStickerStruct.userIdList);
    }

    public final int hashCode() {
        List<DuetStickerUserStruct> list = this.userList;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.openMic;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str = this.duetString;
        int hashCode2 = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list2 = this.userIdList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DuetStickerStruct(userList=" + this.userList + ", openMic=" + this.openMic + ", duetString=" + this.duetString + ", userIdList=" + this.userIdList + ")";
    }

    public final String getDuetString() {
        return this.duetString;
    }

    public final boolean getOpenMic() {
        return this.openMic;
    }

    public final List<String> getUserIdList() {
        return this.userIdList;
    }

    public final List<DuetStickerUserStruct> getUserList() {
        return this.userList;
    }

    public final void completeSecIdList() {
        this.userIdList.clear();
        List<DuetStickerUserStruct> list = this.userList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.userIdList.add(it.next().f134787d);
            }
        }
    }

    public final void setUserIdList(List<String> list) {
        l.d(list, "");
        this.userIdList = list;
    }

    public DuetStickerStruct(List<DuetStickerUserStruct> list, boolean z, String str, List<String> list2) {
        l.d(str, "");
        l.d(list2, "");
        this.userList = list;
        this.openMic = z;
        this.duetString = str;
        this.userIdList = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetStickerStruct(List list, boolean z, String str, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? false : z, str, (i2 & 8) != 0 ? new ArrayList() : list2);
    }
}
