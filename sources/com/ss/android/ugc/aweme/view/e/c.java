package com.ss.android.ugc.aweme.view.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.a;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class c extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144226a = new c();

    static {
        Covode.recordClassIndex(94392);
    }

    c() {
        super(ProfileNaviOnboardingState.class, "onboardingStepState", "getOnboardingStepState()Lcom/ss/android/ugc/aweme/viewModel/OnboardingStep;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviOnboardingState) obj).getOnboardingStepState();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviOnboardingState) obj).setOnboardingStepState((a) obj2);
    }
}
