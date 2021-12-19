package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.base.arch.g;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import h.f.b.l;

public final class MediaMixState implements af {
    private final String enterFrom;
    private final String enterMethod;
    private final ListState<MixStruct, g> listState;
    private final String searchKeyword;

    static {
        Covode.recordClassIndex(57183);
    }

    public MediaMixState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaMixState copy$default(MediaMixState mediaMixState, String str, String str2, String str3, ListState listState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mediaMixState.enterFrom;
        }
        if ((i2 & 2) != 0) {
            str2 = mediaMixState.enterMethod;
        }
        if ((i2 & 4) != 0) {
            str3 = mediaMixState.searchKeyword;
        }
        if ((i2 & 8) != 0) {
            listState2 = mediaMixState.listState;
        }
        return mediaMixState.copy(str, str2, str3, listState2);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.enterMethod;
    }

    public final String component3() {
        return this.searchKeyword;
    }

    public final ListState<MixStruct, g> component4() {
        return this.listState;
    }

    public final MediaMixState copy(String str, String str2, String str3, ListState<MixStruct, g> listState2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(listState2, "");
        return new MediaMixState(str, str2, str3, listState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMixState)) {
            return false;
        }
        MediaMixState mediaMixState = (MediaMixState) obj;
        return l.a(this.enterFrom, mediaMixState.enterFrom) && l.a(this.enterMethod, mediaMixState.enterMethod) && l.a(this.searchKeyword, mediaMixState.searchKeyword) && l.a(this.listState, mediaMixState.listState);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.searchKeyword;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ListState<MixStruct, g> listState2 = this.listState;
        if (listState2 != null) {
            i2 = listState2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MediaMixState(enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", searchKeyword=" + this.searchKeyword + ", listState=" + this.listState + ")";
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final ListState<MixStruct, g> getListState() {
        return this.listState;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public MediaMixState(String str, String str2, String str3, ListState<MixStruct, g> listState2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(listState2, "");
        this.enterFrom = str;
        this.enterMethod = str2;
        this.searchKeyword = str3;
        this.listState = listState2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaMixState(String str, String str2, String str3, ListState listState2, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? new ListState(new g(), null, null, null, null, 30, null) : listState2);
    }
}
