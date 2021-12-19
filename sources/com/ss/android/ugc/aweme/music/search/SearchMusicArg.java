package com.ss.android.ugc.aweme.music.search;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import h.f.b.g;
import h.f.b.l;

public final class SearchMusicArg implements c {
    private final boolean isMe;
    private final PinnedMusicList pinnedMusicList;
    private final String previousPage;
    private final String secUserID;
    private final String userId;

    static {
        Covode.recordClassIndex(71732);
    }

    public SearchMusicArg() {
        this(false, null, null, null, null, 31, null);
    }

    public SearchMusicArg(boolean z) {
        this(z, null, null, null, null, 30, null);
    }

    public SearchMusicArg(boolean z, String str) {
        this(z, str, null, null, null, 28, null);
    }

    public SearchMusicArg(boolean z, String str, String str2) {
        this(z, str, str2, null, null, 24, null);
    }

    public SearchMusicArg(boolean z, String str, String str2, String str3) {
        this(z, str, str2, str3, null, 16, null);
    }

    public static /* synthetic */ SearchMusicArg copy$default(SearchMusicArg searchMusicArg, boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = searchMusicArg.isMe;
        }
        if ((i2 & 2) != 0) {
            str = searchMusicArg.userId;
        }
        if ((i2 & 4) != 0) {
            str2 = searchMusicArg.secUserID;
        }
        if ((i2 & 8) != 0) {
            str3 = searchMusicArg.previousPage;
        }
        if ((i2 & 16) != 0) {
            pinnedMusicList2 = searchMusicArg.pinnedMusicList;
        }
        return searchMusicArg.copy(z, str, str2, str3, pinnedMusicList2);
    }

    public final boolean component1() {
        return this.isMe;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.secUserID;
    }

    public final String component4() {
        return this.previousPage;
    }

    public final PinnedMusicList component5() {
        return this.pinnedMusicList;
    }

    public final SearchMusicArg copy(boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList2) {
        return new SearchMusicArg(z, str, str2, str3, pinnedMusicList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMusicArg)) {
            return false;
        }
        SearchMusicArg searchMusicArg = (SearchMusicArg) obj;
        return this.isMe == searchMusicArg.isMe && l.a(this.userId, searchMusicArg.userId) && l.a(this.secUserID, searchMusicArg.secUserID) && l.a(this.previousPage, searchMusicArg.previousPage) && l.a(this.pinnedMusicList, searchMusicArg.pinnedMusicList);
    }

    public final int hashCode() {
        boolean z = this.isMe;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.userId;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.secUserID;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.previousPage;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PinnedMusicList pinnedMusicList2 = this.pinnedMusicList;
        if (pinnedMusicList2 != null) {
            i6 = pinnedMusicList2.hashCode();
        }
        return hashCode3 + i6;
    }

    public final String toString() {
        return "SearchMusicArg(isMe=" + this.isMe + ", userId=" + this.userId + ", secUserID=" + this.secUserID + ", previousPage=" + this.previousPage + ", pinnedMusicList=" + this.pinnedMusicList + ")";
    }

    public final PinnedMusicList getPinnedMusicList() {
        return this.pinnedMusicList;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSecUserID() {
        return this.secUserID;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public SearchMusicArg(boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList2) {
        this.isMe = z;
        this.userId = str;
        this.secUserID = str2;
        this.previousPage = str3;
        this.pinnedMusicList = pinnedMusicList2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchMusicArg(boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? pinnedMusicList2 : null);
    }
}
