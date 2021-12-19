package com.ss.android.ugc.aweme.settingsrequest;

import com.bytedance.aweme.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.experiment.ee;
import com.ss.android.ugc.aweme.experiment.gi;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.money.growth.e;

public final class m extends f {
    static {
        Covode.recordClassIndex(80934);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.settingsrequest.f
    public final void b(final IESSettingsProxy iESSettingsProxy) {
        SettingsRequestServiceImpl.i().a(f.j());
        if (ee.f89904d || gi.a()) {
            a.f25788b.f25790a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.settingsrequest.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(80935);
                }

                public final void run() {
                    e.f110853g.a();
                }
            }, 16);
            a.f25788b.f25790a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.settingsrequest.m.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(80936);
                }

                public final void run() {
                    com.ss.android.ugc.aweme.compliance.api.a.b().a(iESSettingsProxy);
                }
            }, 32);
            a.f25788b.f25790a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.settingsrequest.m.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(80937);
                }

                public final void run() {
                    com.ss.android.ugc.aweme.shortcut.e.a(true);
                }
            }, 48);
            return;
        }
        e.f110853g.a();
        com.ss.android.ugc.aweme.compliance.api.a.b().a(iESSettingsProxy);
        com.ss.android.ugc.aweme.shortcut.e.a(true);
    }
}
