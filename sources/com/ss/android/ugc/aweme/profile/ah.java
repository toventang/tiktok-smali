package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;

public final class ah implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final ah f115957a = new ah();

    /* renamed from: b  reason: collision with root package name */
    private static f f115958b;

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    private ah() {
    }

    static {
        Covode.recordClassIndex(74785);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        l.d(fVar, "");
        f115958b = fVar;
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (fVar.U > repo.getInt(h.a("post_guide_count_follow_from_recommend"), 0)) {
            repo.storeInt(h.a("post_guide_count_follow_from_recommend"), fVar.U);
        }
        com.ss.android.ugc.aweme.friends.service.a.f97047a.b(fVar.X);
    }
}
