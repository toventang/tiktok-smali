package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.model.api.a.b;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;

public final class ProfileNaviSwitcherState implements af {
    private boolean hasListBeenUpdated;
    private boolean hasMore;
    private boolean hasNaviChanged;
    private ArrayList<b> naviList;
    private boolean shouldCreateNewNavi;

    static {
        Covode.recordClassIndex(94545);
    }

    public ProfileNaviSwitcherState() {
        this(null, false, false, false, false, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviSwitcherState copy$default(ProfileNaviSwitcherState profileNaviSwitcherState, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = profileNaviSwitcherState.naviList;
        }
        if ((i2 & 2) != 0) {
            z = profileNaviSwitcherState.hasMore;
        }
        if ((i2 & 4) != 0) {
            z2 = profileNaviSwitcherState.hasListBeenUpdated;
        }
        if ((i2 & 8) != 0) {
            z3 = profileNaviSwitcherState.hasNaviChanged;
        }
        if ((i2 & 16) != 0) {
            z4 = profileNaviSwitcherState.shouldCreateNewNavi;
        }
        return profileNaviSwitcherState.copy(arrayList, z, z2, z3, z4);
    }

    public final ArrayList<b> component1() {
        return this.naviList;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final boolean component3() {
        return this.hasListBeenUpdated;
    }

    public final boolean component4() {
        return this.hasNaviChanged;
    }

    public final boolean component5() {
        return this.shouldCreateNewNavi;
    }

    public final ProfileNaviSwitcherState copy(ArrayList<b> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        l.d(arrayList, "");
        return new ProfileNaviSwitcherState(arrayList, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviSwitcherState)) {
            return false;
        }
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) obj;
        return l.a(this.naviList, profileNaviSwitcherState.naviList) && this.hasMore == profileNaviSwitcherState.hasMore && this.hasListBeenUpdated == profileNaviSwitcherState.hasListBeenUpdated && this.hasNaviChanged == profileNaviSwitcherState.hasNaviChanged && this.shouldCreateNewNavi == profileNaviSwitcherState.shouldCreateNewNavi;
    }

    public final int hashCode() {
        ArrayList<b> arrayList = this.naviList;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.hasListBeenUpdated;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.hasNaviChanged;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.shouldCreateNewNavi) {
            i2 = 0;
        }
        return i14 + i2;
    }

    public final String toString() {
        return "ProfileNaviSwitcherState(naviList=" + this.naviList + ", hasMore=" + this.hasMore + ", hasListBeenUpdated=" + this.hasListBeenUpdated + ", hasNaviChanged=" + this.hasNaviChanged + ", shouldCreateNewNavi=" + this.shouldCreateNewNavi + ")";
    }

    public final boolean getHasListBeenUpdated() {
        return this.hasListBeenUpdated;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getHasNaviChanged() {
        return this.hasNaviChanged;
    }

    public final ArrayList<b> getNaviList() {
        return this.naviList;
    }

    public final boolean getShouldCreateNewNavi() {
        return this.shouldCreateNewNavi;
    }

    public final void setHasListBeenUpdated(boolean z) {
        this.hasListBeenUpdated = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setHasNaviChanged(boolean z) {
        this.hasNaviChanged = z;
    }

    public final void setShouldCreateNewNavi(boolean z) {
        this.shouldCreateNewNavi = z;
    }

    public final void setNaviList(ArrayList<b> arrayList) {
        l.d(arrayList, "");
        this.naviList = arrayList;
    }

    public ProfileNaviSwitcherState(ArrayList<b> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        l.d(arrayList, "");
        this.naviList = arrayList;
        this.hasMore = z;
        this.hasListBeenUpdated = z2;
        this.hasNaviChanged = z3;
        this.shouldCreateNewNavi = z4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviSwitcherState(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? z4 : false);
    }
}
