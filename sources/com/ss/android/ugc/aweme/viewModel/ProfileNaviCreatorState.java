package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import d.a.b.e.a;
import h.f.b.g;
import h.f.b.l;

public final class ProfileNaviCreatorState implements af {
    private boolean isAnimationFileGenerated;
    private boolean isBackPressed;
    private boolean isContinueEditing;
    private boolean isDoneCreatingProfileImage;
    private a newWorkRequest;
    private String profileImageBackgroundColor;
    private boolean shouldGenerateAnimation;
    private boolean shouldSetAsProfileImage;
    private boolean shouldShowSetProfileView;

    static {
        Covode.recordClassIndex(94452);
    }

    public ProfileNaviCreatorState() {
        this(null, false, false, false, false, false, false, false, null, 511, null);
    }

    public static /* synthetic */ ProfileNaviCreatorState copy$default(ProfileNaviCreatorState profileNaviCreatorState, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = profileNaviCreatorState.profileImageBackgroundColor;
        }
        if ((i2 & 2) != 0) {
            z = profileNaviCreatorState.isDoneCreatingProfileImage;
        }
        if ((i2 & 4) != 0) {
            z2 = profileNaviCreatorState.isBackPressed;
        }
        if ((i2 & 8) != 0) {
            z3 = profileNaviCreatorState.isContinueEditing;
        }
        if ((i2 & 16) != 0) {
            z4 = profileNaviCreatorState.shouldShowSetProfileView;
        }
        if ((i2 & 32) != 0) {
            z5 = profileNaviCreatorState.shouldGenerateAnimation;
        }
        if ((i2 & 64) != 0) {
            z6 = profileNaviCreatorState.shouldSetAsProfileImage;
        }
        if ((i2 & 128) != 0) {
            z7 = profileNaviCreatorState.isAnimationFileGenerated;
        }
        if ((i2 & 256) != 0) {
            aVar = profileNaviCreatorState.newWorkRequest;
        }
        return profileNaviCreatorState.copy(str, z, z2, z3, z4, z5, z6, z7, aVar);
    }

    public final String component1() {
        return this.profileImageBackgroundColor;
    }

    public final boolean component2() {
        return this.isDoneCreatingProfileImage;
    }

    public final boolean component3() {
        return this.isBackPressed;
    }

    public final boolean component4() {
        return this.isContinueEditing;
    }

    public final boolean component5() {
        return this.shouldShowSetProfileView;
    }

    public final boolean component6() {
        return this.shouldGenerateAnimation;
    }

    public final boolean component7() {
        return this.shouldSetAsProfileImage;
    }

    public final boolean component8() {
        return this.isAnimationFileGenerated;
    }

    public final a component9() {
        return this.newWorkRequest;
    }

    public final ProfileNaviCreatorState copy(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar) {
        return new ProfileNaviCreatorState(str, z, z2, z3, z4, z5, z6, z7, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviCreatorState)) {
            return false;
        }
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) obj;
        return l.a(this.profileImageBackgroundColor, profileNaviCreatorState.profileImageBackgroundColor) && this.isDoneCreatingProfileImage == profileNaviCreatorState.isDoneCreatingProfileImage && this.isBackPressed == profileNaviCreatorState.isBackPressed && this.isContinueEditing == profileNaviCreatorState.isContinueEditing && this.shouldShowSetProfileView == profileNaviCreatorState.shouldShowSetProfileView && this.shouldGenerateAnimation == profileNaviCreatorState.shouldGenerateAnimation && this.shouldSetAsProfileImage == profileNaviCreatorState.shouldSetAsProfileImage && this.isAnimationFileGenerated == profileNaviCreatorState.isAnimationFileGenerated && l.a(this.newWorkRequest, profileNaviCreatorState.newWorkRequest);
    }

    public final int hashCode() {
        String str = this.profileImageBackgroundColor;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isDoneCreatingProfileImage;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.isBackPressed;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.isContinueEditing;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.shouldShowSetProfileView;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.shouldGenerateAnimation;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.shouldSetAsProfileImage;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        if (!this.isAnimationFileGenerated) {
            i3 = 0;
        }
        int i28 = (i27 + i3) * 31;
        a aVar = this.newWorkRequest;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i28 + i2;
    }

    public final String toString() {
        return "ProfileNaviCreatorState(profileImageBackgroundColor=" + this.profileImageBackgroundColor + ", isDoneCreatingProfileImage=" + this.isDoneCreatingProfileImage + ", isBackPressed=" + this.isBackPressed + ", isContinueEditing=" + this.isContinueEditing + ", shouldShowSetProfileView=" + this.shouldShowSetProfileView + ", shouldGenerateAnimation=" + this.shouldGenerateAnimation + ", shouldSetAsProfileImage=" + this.shouldSetAsProfileImage + ", isAnimationFileGenerated=" + this.isAnimationFileGenerated + ", newWorkRequest=" + this.newWorkRequest + ")";
    }

    public final a getNewWorkRequest() {
        return this.newWorkRequest;
    }

    public final String getProfileImageBackgroundColor() {
        return this.profileImageBackgroundColor;
    }

    public final boolean getShouldGenerateAnimation() {
        return this.shouldGenerateAnimation;
    }

    public final boolean getShouldSetAsProfileImage() {
        return this.shouldSetAsProfileImage;
    }

    public final boolean getShouldShowSetProfileView() {
        return this.shouldShowSetProfileView;
    }

    public final boolean isAnimationFileGenerated() {
        return this.isAnimationFileGenerated;
    }

    public final boolean isBackPressed() {
        return this.isBackPressed;
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isDoneCreatingProfileImage() {
        return this.isDoneCreatingProfileImage;
    }

    public final void setAnimationFileGenerated(boolean z) {
        this.isAnimationFileGenerated = z;
    }

    public final void setBackPressed(boolean z) {
        this.isBackPressed = z;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setDoneCreatingProfileImage(boolean z) {
        this.isDoneCreatingProfileImage = z;
    }

    public final void setNewWorkRequest(a aVar) {
        this.newWorkRequest = aVar;
    }

    public final void setProfileImageBackgroundColor(String str) {
        this.profileImageBackgroundColor = str;
    }

    public final void setShouldGenerateAnimation(boolean z) {
        this.shouldGenerateAnimation = z;
    }

    public final void setShouldSetAsProfileImage(boolean z) {
        this.shouldSetAsProfileImage = z;
    }

    public final void setShouldShowSetProfileView(boolean z) {
        this.shouldShowSetProfileView = z;
    }

    public ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar) {
        this.profileImageBackgroundColor = str;
        this.isDoneCreatingProfileImage = z;
        this.isBackPressed = z2;
        this.isContinueEditing = z3;
        this.shouldShowSetProfileView = z4;
        this.shouldGenerateAnimation = z5;
        this.shouldSetAsProfileImage = z6;
        this.isAnimationFileGenerated = z7;
        this.newWorkRequest = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) == 0 ? z7 : false, (i2 & 256) == 0 ? aVar : null);
    }
}
