package com.bytedance.android.livesdk.aj;

import android.content.Context;
import com.bytedance.android.live.i.a.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.f.b;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f13809a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13810b;

    static {
        Covode.recordClassIndex(7680);
    }

    c(a aVar, String str) {
        this.f13809a = aVar;
        this.f13810b = str;
    }

    public final void run() {
        a.AbstractC0152a aVar;
        a aVar2 = this.f13809a;
        String str = this.f13810b;
        if (str != null && str.length() != 0) {
            a.f13795a = str;
            Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
            if (context != null) {
                b.a(context, b.f33816b).a("hardware_info_cpu_soc", (Object) str).a();
            }
            if (aVar2.f13796b != null && (aVar = aVar2.f13796b.get()) != null && a.f13795a != null) {
                aVar.a(a.f13795a);
            }
        }
    }
}
