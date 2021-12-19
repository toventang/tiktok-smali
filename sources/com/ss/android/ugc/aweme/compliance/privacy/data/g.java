package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.api.model.r;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static q f77400a;

    /* renamed from: b  reason: collision with root package name */
    public static LogPbBean f77401b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f77402c = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(47875);
    }

    public static void a(PrivacyUserSettingsResponse privacyUserSettingsResponse) {
        l.d(privacyUserSettingsResponse, "");
        a(privacyUserSettingsResponse.getPrivacyUserSettings());
        f77401b = privacyUserSettingsResponse.getLogPb();
    }

    public static void a(q qVar) {
        q qVar2;
        if (qVar != null) {
            qVar2 = q.a(qVar, null, null, null, null, null, null, null, 0, 255);
        } else {
            qVar2 = null;
        }
        f77400a = qVar2;
        if (qVar != null) {
            c.a(new r(q.a(qVar, null, null, null, null, null, null, null, 0, 255)));
        }
    }
}
