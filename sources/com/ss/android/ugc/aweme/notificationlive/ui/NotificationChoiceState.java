package com.ss.android.ugc.aweme.notificationlive.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.following.repository.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class NotificationChoiceState implements af {
    private final String hotsoonText;
    private final boolean isHotsoonHasMore;
    private final boolean isSelf;
    private final ListState<Object, f> listState;
    private final boolean pushSwitchState;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;
    private final int vcdCount;

    static {
        Covode.recordClassIndex(73579);
    }

    public NotificationChoiceState() {
        this(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    public static int com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationChoiceState copy$default(NotificationChoiceState notificationChoiceState, String str, String str2, boolean z, ListState listState2, boolean z2, int i2, String str3, boolean z3, HashMap hashMap, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = notificationChoiceState.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = notificationChoiceState.secUserId;
        }
        if ((i3 & 4) != 0) {
            z = notificationChoiceState.isSelf;
        }
        if ((i3 & 8) != 0) {
            listState2 = notificationChoiceState.listState;
        }
        if ((i3 & 16) != 0) {
            z2 = notificationChoiceState.isHotsoonHasMore;
        }
        if ((i3 & 32) != 0) {
            i2 = notificationChoiceState.vcdCount;
        }
        if ((i3 & 64) != 0) {
            str3 = notificationChoiceState.hotsoonText;
        }
        if ((i3 & 128) != 0) {
            z3 = notificationChoiceState.pushSwitchState;
        }
        if ((i3 & 256) != 0) {
            hashMap = notificationChoiceState.unreadCountMap;
        }
        if ((i3 & 512) != 0) {
            list = notificationChoiceState.unreadUidList;
        }
        return notificationChoiceState.copy(str, str2, z, listState2, z2, i2, str3, z3, hashMap, list);
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

    public final ListState<Object, f> component4() {
        return this.listState;
    }

    public final boolean component5() {
        return this.isHotsoonHasMore;
    }

    public final int component6() {
        return this.vcdCount;
    }

    public final String component7() {
        return this.hotsoonText;
    }

    public final boolean component8() {
        return this.pushSwitchState;
    }

    public final HashMap<String, Integer> component9() {
        return this.unreadCountMap;
    }

    public final NotificationChoiceState copy(String str, String str2, boolean z, ListState<Object, f> listState2, boolean z2, int i2, String str3, boolean z3, HashMap<String, Integer> hashMap, List<String> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(listState2, "");
        l.d(str3, "");
        l.d(hashMap, "");
        l.d(list, "");
        return new NotificationChoiceState(str, str2, z, listState2, z2, i2, str3, z3, hashMap, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationChoiceState)) {
            return false;
        }
        NotificationChoiceState notificationChoiceState = (NotificationChoiceState) obj;
        return l.a(this.userId, notificationChoiceState.userId) && l.a(this.secUserId, notificationChoiceState.secUserId) && this.isSelf == notificationChoiceState.isSelf && l.a(this.listState, notificationChoiceState.listState) && this.isHotsoonHasMore == notificationChoiceState.isHotsoonHasMore && this.vcdCount == notificationChoiceState.vcdCount && l.a(this.hotsoonText, notificationChoiceState.hotsoonText) && this.pushSwitchState == notificationChoiceState.pushSwitchState && l.a(this.unreadCountMap, notificationChoiceState.unreadCountMap) && l.a(this.unreadUidList, notificationChoiceState.unreadUidList);
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
        ListState<Object, f> listState2 = this.listState;
        int hashCode3 = (i7 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        boolean z2 = this.isHotsoonHasMore;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode3 + i8) * 31) + com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.vcdCount)) * 31;
        String str3 = this.hotsoonText;
        int hashCode4 = (com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        if (!this.pushSwitchState) {
            i3 = 0;
        }
        int i11 = (hashCode4 + i3) * 31;
        HashMap<String, Integer> hashMap = this.unreadCountMap;
        int hashCode5 = (i11 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list = this.unreadUidList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "NotificationChoiceState(userId=" + this.userId + ", secUserId=" + this.secUserId + ", isSelf=" + this.isSelf + ", listState=" + this.listState + ", isHotsoonHasMore=" + this.isHotsoonHasMore + ", vcdCount=" + this.vcdCount + ", hotsoonText=" + this.hotsoonText + ", pushSwitchState=" + this.pushSwitchState + ", unreadCountMap=" + this.unreadCountMap + ", unreadUidList=" + this.unreadUidList + ")";
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<Object, f> getListState() {
        return this.listState;
    }

    public final boolean getPushSwitchState() {
        return this.pushSwitchState;
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

    public NotificationChoiceState(String str, String str2, boolean z, ListState<Object, f> listState2, boolean z2, int i2, String str3, boolean z3, HashMap<String, Integer> hashMap, List<String> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(listState2, "");
        l.d(str3, "");
        l.d(hashMap, "");
        l.d(list, "");
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.listState = listState2;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i2;
        this.hotsoonText = str3;
        this.pushSwitchState = z3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotificationChoiceState(java.lang.String r21, java.lang.String r22, boolean r23, com.bytedance.jedi.arch.ext.list.ListState r24, boolean r25, int r26, java.lang.String r27, boolean r28, java.util.HashMap r29, java.util.List r30, int r31, h.f.b.g r32) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState.<init>(java.lang.String, java.lang.String, boolean, com.bytedance.jedi.arch.ext.list.ListState, boolean, int, java.lang.String, boolean, java.util.HashMap, java.util.List, int, h.f.b.g):void");
    }
}
