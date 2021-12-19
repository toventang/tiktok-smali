package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

public final class j extends c<b<f>, c> {
    static {
        Covode.recordClassIndex(80439);
    }

    public j() {
        a(new b<f>() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.b.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80440);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.aweme.setting.serverpush.b.j.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(80441);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PushSettingsApiManager.a();
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        if (this.f76396h != null && (t = this.f76396h.mData) != null && this.f76397i != null) {
            com.ss.android.ugc.aweme.co.b.b().a(d.a(), "last_user_setting_version", t.I);
            ((c) this.f76397i).a((f) t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((c) this.f76397i).a(exc);
        }
    }
}
