package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.a.a;
import com.bytedance.android.livesdk.ab.a.b;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.service.assets.j;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final j f21276a;

    static {
        Covode.recordClassIndex(12552);
    }

    l(j jVar) {
        this.f21276a = jVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        j jVar = this.f21276a;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            Iterator<j.a> it = jVar.f21272b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        jVar.f21273c = false;
        String message = th.getMessage();
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", message);
        c.a(d.a("ttlive_prop_list_status"), 1, 0, hashMap);
        c.a(d.b("ttlive_prop_list_status"), 1, hashMap);
        a.a();
        a.a(b.Gift.info, "ttlive_prop_list_status", hashMap);
    }
}
