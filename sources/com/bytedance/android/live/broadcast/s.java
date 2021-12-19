package com.bytedance.android.live.broadcast;

import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements f {

    /* renamed from: a  reason: collision with root package name */
    private final p f8465a;

    static {
        Covode.recordClassIndex(4344);
    }

    s(p pVar) {
        this.f8465a = pVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        p pVar = this.f8465a;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            pVar.isLoadingRes = false;
            c.a(a.f14017k, "0.0.20");
            pVar.isLoadedRes.setValue(true);
            com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "all resources loaded");
        } else {
            pVar.isLoadingRes = false;
            pVar.isLoadedRes.setValue(false);
        }
        if (!bool.booleanValue()) {
            pVar.monitorExtra.put("error_code", 10001);
            pVar.monitorExtra.put("error_msg", "load_res_error");
        }
        com.bytedance.android.live.core.d.c.a("ttlive_start_live_resource_load_all", !bool.booleanValue(), pVar.monitorExtra);
        pVar.monitorExtra.clear();
    }
}
