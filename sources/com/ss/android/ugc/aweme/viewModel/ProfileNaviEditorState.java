package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.common.y;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.u;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ProfileNaviEditorState implements af {
    private boolean animationStarted;
    private y currentMessage;
    private x editCategory;
    private String headStickerPath;
    private boolean isDoneEditing;
    private boolean isQuitEditing;
    private boolean naviDoneLoading;
    private List<? extends d> parentCategoryList;
    private boolean setUpConfigChanged;
    private List<? extends u> tabList;

    static {
        Covode.recordClassIndex(94481);
    }

    public ProfileNaviEditorState() {
        this(null, null, null, null, null, false, false, false, false, false, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviEditorState copy$default(ProfileNaviEditorState profileNaviEditorState, List list, List list2, y yVar, String str, x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = profileNaviEditorState.tabList;
        }
        if ((i2 & 2) != 0) {
            list2 = profileNaviEditorState.parentCategoryList;
        }
        if ((i2 & 4) != 0) {
            yVar = profileNaviEditorState.currentMessage;
        }
        if ((i2 & 8) != 0) {
            str = profileNaviEditorState.headStickerPath;
        }
        if ((i2 & 16) != 0) {
            xVar = profileNaviEditorState.editCategory;
        }
        if ((i2 & 32) != 0) {
            z = profileNaviEditorState.naviDoneLoading;
        }
        if ((i2 & 64) != 0) {
            z2 = profileNaviEditorState.animationStarted;
        }
        if ((i2 & 128) != 0) {
            z3 = profileNaviEditorState.isDoneEditing;
        }
        if ((i2 & 256) != 0) {
            z4 = profileNaviEditorState.isQuitEditing;
        }
        if ((i2 & 512) != 0) {
            z5 = profileNaviEditorState.setUpConfigChanged;
        }
        return profileNaviEditorState.copy(list, list2, yVar, str, xVar, z, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.u>, java.util.List<com.ss.android.ugc.aweme.model.u> */
    public final List<u> component1() {
        return this.tabList;
    }

    public final boolean component10() {
        return this.setUpConfigChanged;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.d>, java.util.List<com.ss.android.ugc.aweme.model.d> */
    public final List<d> component2() {
        return this.parentCategoryList;
    }

    public final y component3() {
        return this.currentMessage;
    }

    public final String component4() {
        return this.headStickerPath;
    }

    public final x component5() {
        return this.editCategory;
    }

    public final boolean component6() {
        return this.naviDoneLoading;
    }

    public final boolean component7() {
        return this.animationStarted;
    }

    public final boolean component8() {
        return this.isDoneEditing;
    }

    public final boolean component9() {
        return this.isQuitEditing;
    }

    public final ProfileNaviEditorState copy(List<? extends u> list, List<? extends d> list2, y yVar, String str, x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new ProfileNaviEditorState(list, list2, yVar, str, xVar, z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviEditorState)) {
            return false;
        }
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) obj;
        return l.a(this.tabList, profileNaviEditorState.tabList) && l.a(this.parentCategoryList, profileNaviEditorState.parentCategoryList) && l.a(this.currentMessage, profileNaviEditorState.currentMessage) && l.a(this.headStickerPath, profileNaviEditorState.headStickerPath) && l.a(this.editCategory, profileNaviEditorState.editCategory) && this.naviDoneLoading == profileNaviEditorState.naviDoneLoading && this.animationStarted == profileNaviEditorState.animationStarted && this.isDoneEditing == profileNaviEditorState.isDoneEditing && this.isQuitEditing == profileNaviEditorState.isQuitEditing && this.setUpConfigChanged == profileNaviEditorState.setUpConfigChanged;
    }

    public final int hashCode() {
        List<? extends u> list = this.tabList;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<? extends d> list2 = this.parentCategoryList;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        y yVar = this.currentMessage;
        int hashCode3 = (hashCode2 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        String str = this.headStickerPath;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        x xVar = this.editCategory;
        if (xVar != null) {
            i2 = xVar.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z = this.naviDoneLoading;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        boolean z2 = this.animationStarted;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        boolean z3 = this.isDoneEditing;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean z4 = this.isQuitEditing;
        if (z4) {
            z4 = true;
        }
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = z4 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        if (!this.setUpConfigChanged) {
            i4 = 0;
        }
        return i20 + i4;
    }

    public final String toString() {
        return "ProfileNaviEditorState(tabList=" + this.tabList + ", parentCategoryList=" + this.parentCategoryList + ", currentMessage=" + this.currentMessage + ", headStickerPath=" + this.headStickerPath + ", editCategory=" + this.editCategory + ", naviDoneLoading=" + this.naviDoneLoading + ", animationStarted=" + this.animationStarted + ", isDoneEditing=" + this.isDoneEditing + ", isQuitEditing=" + this.isQuitEditing + ", setUpConfigChanged=" + this.setUpConfigChanged + ")";
    }

    public final boolean getAnimationStarted() {
        return this.animationStarted;
    }

    public final y getCurrentMessage() {
        return this.currentMessage;
    }

    public final x getEditCategory() {
        return this.editCategory;
    }

    public final String getHeadStickerPath() {
        return this.headStickerPath;
    }

    public final boolean getNaviDoneLoading() {
        return this.naviDoneLoading;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.d>, java.util.List<com.ss.android.ugc.aweme.model.d> */
    public final List<d> getParentCategoryList() {
        return this.parentCategoryList;
    }

    public final boolean getSetUpConfigChanged() {
        return this.setUpConfigChanged;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.u>, java.util.List<com.ss.android.ugc.aweme.model.u> */
    public final List<u> getTabList() {
        return this.tabList;
    }

    public final boolean isDoneEditing() {
        return this.isDoneEditing;
    }

    public final boolean isQuitEditing() {
        return this.isQuitEditing;
    }

    public final void setAnimationStarted(boolean z) {
        this.animationStarted = z;
    }

    public final void setCurrentMessage(y yVar) {
        this.currentMessage = yVar;
    }

    public final void setDoneEditing(boolean z) {
        this.isDoneEditing = z;
    }

    public final void setEditCategory(x xVar) {
        this.editCategory = xVar;
    }

    public final void setHeadStickerPath(String str) {
        this.headStickerPath = str;
    }

    public final void setNaviDoneLoading(boolean z) {
        this.naviDoneLoading = z;
    }

    public final void setParentCategoryList(List<? extends d> list) {
        this.parentCategoryList = list;
    }

    public final void setQuitEditing(boolean z) {
        this.isQuitEditing = z;
    }

    public final void setSetUpConfigChanged(boolean z) {
        this.setUpConfigChanged = z;
    }

    public final void setTabList(List<? extends u> list) {
        this.tabList = list;
    }

    public ProfileNaviEditorState(List<? extends u> list, List<? extends d> list2, y yVar, String str, x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.tabList = list;
        this.parentCategoryList = list2;
        this.currentMessage = yVar;
        this.headStickerPath = str;
        this.editCategory = xVar;
        this.naviDoneLoading = z;
        this.animationStarted = z2;
        this.isDoneEditing = z3;
        this.isQuitEditing = z4;
        this.setUpConfigChanged = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviEditorState(List list, List list2, y yVar, String str, x xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : yVar, (i2 & 8) != 0 ? null : str, (i2 & 16) == 0 ? xVar : null, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) == 0 ? z5 : false);
    }
}
