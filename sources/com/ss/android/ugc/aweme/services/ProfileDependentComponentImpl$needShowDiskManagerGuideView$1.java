package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.services.f;
import f.a.v;
import f.a.w;
import h.f.b.l;

final class ProfileDependentComponentImpl$needShowDiskManagerGuideView$1<T> implements w {
    public static final ProfileDependentComponentImpl$needShowDiskManagerGuideView$1 INSTANCE = new ProfileDependentComponentImpl$needShowDiskManagerGuideView$1();

    static {
        Covode.recordClassIndex(79550);
    }

    ProfileDependentComponentImpl$needShowDiskManagerGuideView$1() {
    }

    @Override // f.a.w
    public final void subscribe(v<Boolean> vVar) {
        l.d(vVar, "");
        try {
            vVar.a(Boolean.valueOf(f.f122672a.g()));
            vVar.a();
        } catch (Exception e2) {
            vVar.a(e2);
        }
    }
}
