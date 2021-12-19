package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.model.api.a.b;
import com.ss.android.ugc.aweme.model.t;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ProfileNaviOnboardingState implements af {
    private a onboardingStepState;
    private List<t> starterAvatarList;
    private b starterAvatarSelected;

    static {
        Covode.recordClassIndex(94524);
    }

    public ProfileNaviOnboardingState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviOnboardingState copy$default(ProfileNaviOnboardingState profileNaviOnboardingState, a aVar, List list, b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = profileNaviOnboardingState.onboardingStepState;
        }
        if ((i2 & 2) != 0) {
            list = profileNaviOnboardingState.starterAvatarList;
        }
        if ((i2 & 4) != 0) {
            bVar = profileNaviOnboardingState.starterAvatarSelected;
        }
        return profileNaviOnboardingState.copy(aVar, list, bVar);
    }

    public final a component1() {
        return this.onboardingStepState;
    }

    public final List<t> component2() {
        return this.starterAvatarList;
    }

    public final b component3() {
        return this.starterAvatarSelected;
    }

    public final ProfileNaviOnboardingState copy(a aVar, List<t> list, b bVar) {
        l.d(aVar, "");
        return new ProfileNaviOnboardingState(aVar, list, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviOnboardingState)) {
            return false;
        }
        ProfileNaviOnboardingState profileNaviOnboardingState = (ProfileNaviOnboardingState) obj;
        return l.a(this.onboardingStepState, profileNaviOnboardingState.onboardingStepState) && l.a(this.starterAvatarList, profileNaviOnboardingState.starterAvatarList) && l.a(this.starterAvatarSelected, profileNaviOnboardingState.starterAvatarSelected);
    }

    public final int hashCode() {
        a aVar = this.onboardingStepState;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<t> list = this.starterAvatarList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        b bVar = this.starterAvatarSelected;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ProfileNaviOnboardingState(onboardingStepState=" + this.onboardingStepState + ", starterAvatarList=" + this.starterAvatarList + ", starterAvatarSelected=" + this.starterAvatarSelected + ")";
    }

    public final a getOnboardingStepState() {
        return this.onboardingStepState;
    }

    public final List<t> getStarterAvatarList() {
        return this.starterAvatarList;
    }

    public final b getStarterAvatarSelected() {
        return this.starterAvatarSelected;
    }

    public final void setStarterAvatarList(List<t> list) {
        this.starterAvatarList = list;
    }

    public final void setStarterAvatarSelected(b bVar) {
        this.starterAvatarSelected = bVar;
    }

    public final void setOnboardingStepState(a aVar) {
        l.d(aVar, "");
        this.onboardingStepState = aVar;
    }

    public ProfileNaviOnboardingState(a aVar, List<t> list, b bVar) {
        l.d(aVar, "");
        this.onboardingStepState = aVar;
        this.starterAvatarList = list;
        this.starterAvatarSelected = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileNaviOnboardingState(a aVar, List list, b bVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a(null, 3) : aVar, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : bVar);
    }
}
