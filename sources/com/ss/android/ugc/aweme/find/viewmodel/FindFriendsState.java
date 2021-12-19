package com.ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class FindFriendsState implements af {
    private final boolean canShowEmtpyTail;
    private final List<Integer> channels;
    private final int cursor;
    private final boolean hasMore;
    private final List<a> list;
    private final e resType;
    private final f searchType;
    private final List<Integer> tailChannels;

    static {
        Covode.recordClassIndex(60896);
    }

    public FindFriendsState() {
        this(null, null, false, 0, null, null, false, null, 255, null);
    }

    public static int com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindFriendsState copy$default(FindFriendsState findFriendsState, e eVar, List list2, boolean z, int i2, List list3, List list4, boolean z2, f fVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            eVar = findFriendsState.resType;
        }
        if ((i3 & 2) != 0) {
            list2 = findFriendsState.list;
        }
        if ((i3 & 4) != 0) {
            z = findFriendsState.hasMore;
        }
        if ((i3 & 8) != 0) {
            i2 = findFriendsState.cursor;
        }
        if ((i3 & 16) != 0) {
            list3 = findFriendsState.channels;
        }
        if ((i3 & 32) != 0) {
            list4 = findFriendsState.tailChannels;
        }
        if ((i3 & 64) != 0) {
            z2 = findFriendsState.canShowEmtpyTail;
        }
        if ((i3 & 128) != 0) {
            fVar = findFriendsState.searchType;
        }
        return findFriendsState.copy(eVar, list2, z, i2, list3, list4, z2, fVar);
    }

    public final e component1() {
        return this.resType;
    }

    public final List<a> component2() {
        return this.list;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final int component4() {
        return this.cursor;
    }

    public final List<Integer> component5() {
        return this.channels;
    }

    public final List<Integer> component6() {
        return this.tailChannels;
    }

    public final boolean component7() {
        return this.canShowEmtpyTail;
    }

    public final f component8() {
        return this.searchType;
    }

    public final FindFriendsState copy(e eVar, List<a> list2, boolean z, int i2, List<Integer> list3, List<Integer> list4, boolean z2, f fVar) {
        l.d(eVar, "");
        l.d(list2, "");
        l.d(list3, "");
        l.d(list4, "");
        l.d(fVar, "");
        return new FindFriendsState(eVar, list2, z, i2, list3, list4, z2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindFriendsState)) {
            return false;
        }
        FindFriendsState findFriendsState = (FindFriendsState) obj;
        return l.a(this.resType, findFriendsState.resType) && l.a(this.list, findFriendsState.list) && this.hasMore == findFriendsState.hasMore && this.cursor == findFriendsState.cursor && l.a(this.channels, findFriendsState.channels) && l.a(this.tailChannels, findFriendsState.tailChannels) && this.canShowEmtpyTail == findFriendsState.canShowEmtpyTail && l.a(this.searchType, findFriendsState.searchType);
    }

    public final int hashCode() {
        e eVar = this.resType;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<a> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z = this.hasMore;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode2 + i4) * 31) + com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31;
        List<Integer> list3 = this.channels;
        int hashCode3 = (com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Integer> list4 = this.tailChannels;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        if (!this.canShowEmtpyTail) {
            i3 = 0;
        }
        int i7 = (hashCode4 + i3) * 31;
        f fVar = this.searchType;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return i7 + i2;
    }

    public final String toString() {
        return "FindFriendsState(resType=" + this.resType + ", list=" + this.list + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", channels=" + this.channels + ", tailChannels=" + this.tailChannels + ", canShowEmtpyTail=" + this.canShowEmtpyTail + ", searchType=" + this.searchType + ")";
    }

    public final boolean getCanShowEmtpyTail() {
        return this.canShowEmtpyTail;
    }

    public final List<Integer> getChannels() {
        return this.channels;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<a> getList() {
        return this.list;
    }

    public final e getResType() {
        return this.resType;
    }

    public final f getSearchType() {
        return this.searchType;
    }

    public final List<Integer> getTailChannels() {
        return this.tailChannels;
    }

    public FindFriendsState(e eVar, List<a> list2, boolean z, int i2, List<Integer> list3, List<Integer> list4, boolean z2, f fVar) {
        l.d(eVar, "");
        l.d(list2, "");
        l.d(list3, "");
        l.d(list4, "");
        l.d(fVar, "");
        this.resType = eVar;
        this.list = list2;
        this.hasMore = z;
        this.cursor = i2;
        this.channels = list3;
        this.tailChannels = list4;
        this.canShowEmtpyTail = z2;
        this.searchType = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindFriendsState(e eVar, List list2, boolean z, int i2, List list3, List list4, boolean z2, f fVar, int i3, g gVar) {
        this((i3 & 1) != 0 ? new e(0) : eVar, (i3 & 2) != 0 ? z.INSTANCE : list2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? z.INSTANCE : list3, (i3 & 32) != 0 ? z.INSTANCE : list4, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? new f(0) : fVar);
    }
}
