package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

final class TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 extends m implements a<Boolean> {
    public static final TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 INSTANCE = new TwoStepVerificationService$Companion$isNewTo2svEnhancements$2();

    static {
        Covode.recordClassIndex(79571);
    }

    TwoStepVerificationService$Companion$isNewTo2svEnhancements$2() {
        super(0);
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // h.f.a.a
    public final Boolean invoke() {
        if (TwoStepVerificationService.keva.contains("is_new_to_2sv_enhancements")) {
            return TwoStepVerificationService.keva.getBoolean("is_new_to_2sv_enhancements", false);
        }
        return true;
    }
}
