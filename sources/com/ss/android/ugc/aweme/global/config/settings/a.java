package com.ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

public interface a {
    static {
        Covode.recordClassIndex(63001);
    }

    void a(IESSettingsProxy iESSettingsProxy);

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.a$a  reason: collision with other inner class name */
    public static class C2416a implements a {

        /* renamed from: a  reason: collision with root package name */
        a f99072a;

        static {
            Covode.recordClassIndex(63002);
        }

        C2416a(a aVar) {
            this.f99072a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.global.config.settings.a
        public final void a(IESSettingsProxy iESSettingsProxy) {
            a aVar = this.f99072a;
            if (aVar != null) {
                aVar.a(iESSettingsProxy);
            }
        }
    }
}
