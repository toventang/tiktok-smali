package com.ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import h.f.b.l;
import java.util.ArrayList;

public final class HitNotice extends BaseResponse {
    @c(a = "user_list")
    private ArrayList<SimpleUser> userList;

    static {
        Covode.recordClassIndex(50466);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.hitrank.HitNotice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HitNotice copy$default(HitNotice hitNotice, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = hitNotice.userList;
        }
        return hitNotice.copy(arrayList);
    }

    public final ArrayList<SimpleUser> component1() {
        return this.userList;
    }

    public final HitNotice copy(ArrayList<SimpleUser> arrayList) {
        l.d(arrayList, "");
        return new HitNotice(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HitNotice) && l.a(this.userList, ((HitNotice) obj).userList);
        }
        return true;
    }

    public final int hashCode() {
        ArrayList<SimpleUser> arrayList = this.userList;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "HitNotice(userList=" + this.userList + ")";
    }

    public final ArrayList<SimpleUser> getUserList() {
        return this.userList;
    }

    public final void setUserList(ArrayList<SimpleUser> arrayList) {
        l.d(arrayList, "");
        this.userList = arrayList;
    }

    public HitNotice(ArrayList<SimpleUser> arrayList) {
        l.d(arrayList, "");
        this.userList = arrayList;
    }
}
