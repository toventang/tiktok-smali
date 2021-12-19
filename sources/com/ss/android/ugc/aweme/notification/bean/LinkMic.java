package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class LinkMic {
    @c(a = "audience_id_list")
    public final List<Long> audienceIdList;
    @c(a = "followed_count")
    public final int followedCount;
    @c(a = "show_user_list")
    public final List<LiveUser> followedList;

    static {
        Covode.recordClassIndex(72801);
    }

    public LinkMic() {
        this(null, null, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_notification_bean_LinkMic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notification.bean.LinkMic */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkMic copy$default(LinkMic linkMic, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = linkMic.followedList;
        }
        if ((i3 & 2) != 0) {
            list2 = linkMic.audienceIdList;
        }
        if ((i3 & 4) != 0) {
            i2 = linkMic.followedCount;
        }
        return linkMic.copy(list, list2, i2);
    }

    public final LinkMic copy(List<LiveUser> list, List<Long> list2, int i2) {
        return new LinkMic(list, list2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkMic)) {
            return false;
        }
        LinkMic linkMic = (LinkMic) obj;
        return l.a(this.followedList, linkMic.followedList) && l.a(this.audienceIdList, linkMic.audienceIdList) && this.followedCount == linkMic.followedCount;
    }

    public final int hashCode() {
        List<LiveUser> list = this.followedList;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Long> list2 = this.audienceIdList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_notification_bean_LinkMic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.followedCount);
    }

    public final String toString() {
        return "LinkMic(followedList=" + this.followedList + ", audienceIdList=" + this.audienceIdList + ", followedCount=" + this.followedCount + ")";
    }

    public LinkMic(List<LiveUser> list, List<Long> list2, int i2) {
        this.followedList = list;
        this.audienceIdList = list2;
        this.followedCount = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkMic(List list, List list2, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : list2, (i3 & 4) != 0 ? 0 : i2);
    }
}
