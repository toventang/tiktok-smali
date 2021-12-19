package com.bytedance.android.livesdk.al;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.depend.d.e;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final e f13949a;

    static {
        Covode.recordClassIndex(7736);
    }

    f(e eVar) {
        this.f13949a = eVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        Class hostActivity;
        e eVar = this.f13949a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 1) {
            hostActivity = ((IHostApp) a.a(IHostApp.class)).getHostActivity(5);
        } else if (intValue != 2) {
            hostActivity = null;
        } else {
            hostActivity = ((IHostApp) a.a(IHostApp.class)).getHostActivity(6);
        }
        eVar.a(hostActivity);
        return z.f158842a;
    }
}
