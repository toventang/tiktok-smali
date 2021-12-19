package com.ss.android.ugc.aweme.compliance.business.banappeal;

import android.app.Activity;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.common.c.a;
import com.ss.android.ugc.aweme.main.k;

final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f76799a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f76800b;

    static {
        Covode.recordClassIndex(47470);
    }

    d(b bVar, Activity activity) {
        this.f76799a = bVar;
        this.f76800b = activity;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f76799a;
        Activity activity = this.f76800b;
        if (iVar == null || iVar.b() || iVar.c()) {
            bVar.f76754c.set(false);
            a.b("/aweme/v2/appeal/status/", 1);
            return null;
        } else if (!iVar.a() || iVar.d() == null) {
            return null;
        } else {
            if (((AppealStatusResponse) iVar.d()).status_code == 0) {
                bVar.f76752a = com.ss.android.ugc.aweme.compliance.api.a.c().a(activity, (AppealStatusResponse) iVar.d());
                if (!bVar.f76753b || ((k) activity).isADShowing()) {
                    bVar.f76752a.b();
                } else {
                    bVar.f76752a.d();
                }
                a.a("/aweme/v2/appeal/status/", 0, ((AppealStatusResponse) iVar.d()).extra.logid, String.valueOf(((AppealStatusResponse) iVar.d()).status_code));
                return null;
            }
            bVar.f76754c.set(false);
            return null;
        }
    }
}
