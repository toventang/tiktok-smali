package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dm implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131690a;

    static {
        Covode.recordClassIndex(86242);
    }

    dm(cj cjVar) {
        this.f131690a = cjVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        cj cjVar = this.f131690a;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (booleanValue) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        repo.storeInt("USER_HD_VIDEO_SWITCH_SETTING", i2);
        c.f115634m.d().a(true);
        g.a().o().i().a(cjVar.getContext(), "high_quality_setting_changed");
        return null;
    }
}
