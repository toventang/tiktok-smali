package com.ss.android.ugc.aweme.compliance.business.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.setting.serverpush.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76918a = new a();

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(47544);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        int i2;
        Integer defaultVpaContentChoice;
        l.d(fVar, "");
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = b.f77288b;
        if (fVar.ad == 0) {
            ComplianceSetting c2 = aVar.c();
            if (c2 == null || (defaultVpaContentChoice = c2.getDefaultVpaContentChoice()) == null) {
                i2 = 1;
            } else {
                i2 = defaultVpaContentChoice.intValue();
            }
        } else {
            i2 = fVar.ad;
        }
        aVar.a(i2);
    }
}
