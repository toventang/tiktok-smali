package com.ss.android.ugc.aweme.compliance.api.services.antiaddiction;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;

public final class a implements IAntiAddictionService {
    static {
        Covode.recordClassIndex(47375);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String a() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void a(Aweme aweme) {
        l.d(aweme, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void a(IESSettingsProxy iESSettingsProxy) {
        l.d(iESSettingsProxy, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final int b() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String e() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String f() {
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.a$a  reason: collision with other inner class name */
    public static final class C1745a implements al {
        static {
            Covode.recordClassIndex(47376);
        }

        @Override // com.ss.android.ugc.aweme.al
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.al
        public final void b() {
        }

        C1745a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final al g() {
        return new C1745a();
    }
}
