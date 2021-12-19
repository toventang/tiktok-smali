package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.following.repository.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class FollowingRelationState implements af {
    private final String hotsoonText;
    private final boolean isHotsoonHasMore;
    private final boolean isSelf;
    private final ListState<Object, f> listState;
    private final List<Object> recommendList;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;
    private final int vcdCount;

    static {
        Covode.recordClassIndex(61279);
    }

    public FollowingRelationState() {
        this(null, null, false, null, null, false, 0, null, null, null, 1023, null);
    }

    public static int com_ss_android_ugc_aweme_following_ui_viewmodel_FollowingRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowingRelationState copy$default(FollowingRelationState followingRelationState, String str, String str2, boolean z, List list, ListState listState2, boolean z2, int i2, String str3, HashMap hashMap, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = followingRelationState.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = followingRelationState.secUserId;
        }
        if ((i3 & 4) != 0) {
            z = followingRelationState.isSelf;
        }
        if ((i3 & 8) != 0) {
            list = followingRelationState.recommendList;
        }
        if ((i3 & 16) != 0) {
            listState2 = followingRelationState.listState;
        }
        if ((i3 & 32) != 0) {
            z2 = followingRelationState.isHotsoonHasMore;
        }
        if ((i3 & 64) != 0) {
            i2 = followingRelationState.vcdCount;
        }
        if ((i3 & 128) != 0) {
            str3 = followingRelationState.hotsoonText;
        }
        if ((i3 & 256) != 0) {
            hashMap = followingRelationState.unreadCountMap;
        }
        if ((i3 & 512) != 0) {
            list2 = followingRelationState.unreadUidList;
        }
        return followingRelationState.copy(str, str2, z, list, listState2, z2, i2, str3, hashMap, list2);
    }

    public final String component1() {
        return this.userId;
    }

    public final List<String> component10() {
        return this.unreadUidList;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final boolean component3() {
        return this.isSelf;
    }

    public final List<Object> component4() {
        return this.recommendList;
    }

    public final ListState<Object, f> component5() {
        return this.listState;
    }

    public final boolean component6() {
        return this.isHotsoonHasMore;
    }

    public final int component7() {
        return this.vcdCount;
    }

    public final String component8() {
        return this.hotsoonText;
    }

    public final HashMap<String, Integer> component9() {
        return this.unreadCountMap;
    }

    public final FollowingRelationState copy(String str, String str2, boolean z, List<? extends Object> list, ListState<Object, f> listState2, boolean z2, int i2, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(listState2, "");
        l.d(str3, "");
        l.d(hashMap, "");
        l.d(list2, "");
        return new FollowingRelationState(str, str2, z, list, listState2, z2, i2, str3, hashMap, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowingRelationState)) {
            return false;
        }
        FollowingRelationState followingRelationState = (FollowingRelationState) obj;
        return l.a(this.userId, followingRelationState.userId) && l.a(this.secUserId, followingRelationState.secUserId) && this.isSelf == followingRelationState.isSelf && l.a(this.recommendList, followingRelationState.recommendList) && l.a(this.listState, followingRelationState.listState) && this.isHotsoonHasMore == followingRelationState.isHotsoonHasMore && this.vcdCount == followingRelationState.vcdCount && l.a(this.hotsoonText, followingRelationState.hotsoonText) && l.a(this.unreadCountMap, followingRelationState.unreadCountMap) && l.a(this.unreadUidList, followingRelationState.unreadUidList);
    }

    public final int hashCode() {
        String str = this.userId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isSelf;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        List<Object> list = this.recommendList;
        int hashCode3 = (i7 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, f> listState2 = this.listState;
        int hashCode4 = (hashCode3 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        if (!this.isHotsoonHasMore) {
            i3 = 0;
        }
        int com_ss_android_ugc_aweme_following_ui_viewmodel_FollowingRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode4 + i3) * 31) + com_ss_android_ugc_aweme_following_ui_viewmodel_FollowingRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.vcdCount)) * 31;
        String str3 = this.hotsoonText;
        int hashCode5 = (com_ss_android_ugc_aweme_following_ui_viewmodel_FollowingRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        HashMap<String, Integer> hashMap = this.unreadCountMap;
        int hashCode6 = (hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list2 = this.unreadUidList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "FollowingRelationState(userId=" + this.userId + ", secUserId=" + this.secUserId + ", isSelf=" + this.isSelf + ", recommendList=" + this.recommendList + ", listState=" + this.listState + ", isHotsoonHasMore=" + this.isHotsoonHasMore + ", vcdCount=" + this.vcdCount + ", hotsoonText=" + this.hotsoonText + ", unreadCountMap=" + this.unreadCountMap + ", unreadUidList=" + this.unreadUidList + ")";
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<Object, f> getListState() {
        return this.listState;
    }

    public final List<Object> getRecommendList() {
        return this.recommendList;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final boolean isHotsoonHasMore() {
        return this.isHotsoonHasMore;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public FollowingRelationState(String str, String str2, boolean z, List<? extends Object> list, ListState<Object, f> listState2, boolean z2, int i2, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(listState2, "");
        l.d(str3, "");
        l.d(hashMap, "");
        l.d(list2, "");
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.recommendList = list;
        this.listState = listState2;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i2;
        this.hotsoonText = str3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FollowingRelationState(java.lang.String r21, java.lang.String r22, boolean r23, java.util.List r24, com.bytedance.jedi.arch.ext.list.ListState r25, boolean r26, int r27, java.lang.String r28, java.util.HashMap r29, java.util.List r30, int r31, h.f.b.g r32) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState.<init>(java.lang.String, java.lang.String, boolean, java.util.List, com.bytedance.jedi.arch.ext.list.ListState, boolean, int, java.lang.String, java.util.HashMap, java.util.List, int, h.f.b.g):void");
    }
}
