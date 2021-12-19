package com.ss.android.ugc.aweme.photo.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    private final int allowRecommend;
    private final List<User> excludeUserList;
    private final int permission;

    static {
        Covode.recordClassIndex(73872);
    }

    public a() {
        this(0, null, 0, 7, null);
    }

    public a(int i2) {
        this(i2, null, 0, 6, null);
    }

    public a(int i2, List<? extends User> list) {
        this(i2, list, 0, 4, null);
    }

    public static int com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.photo.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, int i2, List list, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = aVar.permission;
        }
        if ((i4 & 2) != 0) {
            list = aVar.excludeUserList;
        }
        if ((i4 & 4) != 0) {
            i3 = aVar.allowRecommend;
        }
        return aVar.copy(i2, list, i3);
    }

    public final int component1() {
        return this.permission;
    }

    public final List<User> component2() {
        return this.excludeUserList;
    }

    public final int component3() {
        return this.allowRecommend;
    }

    public final a copy(int i2, List<? extends User> list, int i3) {
        return new a(i2, list, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.permission == aVar.permission && l.a(this.excludeUserList, aVar.excludeUserList) && this.allowRecommend == aVar.allowRecommend;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.permission) * 31;
        List<User> list = this.excludeUserList;
        return ((com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_photo_publish_PermissionWrapper_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.allowRecommend);
    }

    public final String toString() {
        return "PermissionWrapper(permission=" + this.permission + ", excludeUserList=" + this.excludeUserList + ", allowRecommend=" + this.allowRecommend + ")";
    }

    public final int getAllowRecommend() {
        return this.allowRecommend;
    }

    public final List<User> getExcludeUserList() {
        return this.excludeUserList;
    }

    public final int getPermission() {
        return this.permission;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(int i2, List<? extends User> list, int i3) {
        this.permission = i2;
        this.excludeUserList = list;
        this.allowRecommend = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, List list, int i3, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? null : list, (i4 & 4) != 0 ? 0 : i3);
    }
}
