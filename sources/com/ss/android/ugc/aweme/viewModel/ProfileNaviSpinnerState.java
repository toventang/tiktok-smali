package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;

public final class ProfileNaviSpinnerState implements af {
    private boolean shouldShowSpinner;

    static {
        Covode.recordClassIndex(94541);
    }

    public ProfileNaviSpinnerState() {
        this(false, 1, null);
    }

    public static /* synthetic */ ProfileNaviSpinnerState copy$default(ProfileNaviSpinnerState profileNaviSpinnerState, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = profileNaviSpinnerState.shouldShowSpinner;
        }
        return profileNaviSpinnerState.copy(z);
    }

    public final boolean component1() {
        return this.shouldShowSpinner;
    }

    public final ProfileNaviSpinnerState copy(boolean z) {
        return new ProfileNaviSpinnerState(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ProfileNaviSpinnerState) && this.shouldShowSpinner == ((ProfileNaviSpinnerState) obj).shouldShowSpinner;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.shouldShowSpinner;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ProfileNaviSpinnerState(shouldShowSpinner=" + this.shouldShowSpinner + ")";
    }

    public final boolean getShouldShowSpinner() {
        return this.shouldShowSpinner;
    }

    public final void setShouldShowSpinner(boolean z) {
        this.shouldShowSpinner = z;
    }

    public ProfileNaviSpinnerState(boolean z) {
        this.shouldShowSpinner = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviSpinnerState(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
