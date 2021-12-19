package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements f {

    /* renamed from: a  reason: collision with root package name */
    private final p f8599a;

    static {
        Covode.recordClassIndex(4399);
    }

    t(p pVar) {
        this.f8599a = pVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        p pVar = this.f8599a;
        Throwable th = (Throwable) obj;
        pVar.isLoadedRes.setValue(false);
        pVar.isLoadingRes = false;
        pVar.lastTimeFailedReason = th.toString();
        a.a(6, "LiveCameraResManager", "error occurred when load resources: " + th.toString());
        a.a(6, "LiveCameraResManager", th.toString());
        pVar.monitorExtra.put("load_function_error", th.toString());
        pVar.monitorExtra.put("error_code", 10002);
        pVar.monitorExtra.put("error_msg", "load_function_error");
        c.a("ttlive_start_live_resource_load_all", 1, pVar.monitorExtra);
        pVar.monitorExtra.clear();
    }
}
