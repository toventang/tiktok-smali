package com.ss.android.ugc.aweme.services;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.profile.d.a;
import h.f.b.l;

public final class ProfileDependentComponentImpl$mainAnimViewModel$1 implements a {
    final /* synthetic */ e $activity;
    private final MainAnimViewModel mainAnimViewModel;

    static {
        Covode.recordClassIndex(79549);
    }

    public final MainAnimViewModel getMainAnimViewModel() {
        return this.mainAnimViewModel;
    }

    @Override // com.ss.android.ugc.aweme.profile.d.a
    public final t<Boolean> isUserProfileFragmentVisible2() {
        return this.mainAnimViewModel.f109061c;
    }

    public static ad com_ss_android_ugc_aweme_services_ProfileDependentComponentImpl$mainAnimViewModel$1_androidx_lifecycle_VScopeLancet_of(e eVar) {
        return ae.a(eVar, (ad.b) null);
    }

    ProfileDependentComponentImpl$mainAnimViewModel$1(e eVar) {
        this.$activity = eVar;
        ac a2 = com_ss_android_ugc_aweme_services_ProfileDependentComponentImpl$mainAnimViewModel$1_androidx_lifecycle_VScopeLancet_of(eVar).a(MainAnimViewModel.class);
        l.b(a2, "");
        this.mainAnimViewModel = (MainAnimViewModel) a2;
    }
}
