package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.x;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ae f35607a;

    /* renamed from: b  reason: collision with root package name */
    private final x.b f35608b;

    static {
        Covode.recordClassIndex(21272);
    }

    af(ae aeVar, x.b bVar) {
        this.f35607a = aeVar;
        this.f35608b = bVar;
    }

    public final void run() {
        ae aeVar = this.f35607a;
        x.b bVar = this.f35608b;
        new TimeLineEvent.a().a(TimeLineEvent.b.E, (Object) false).a(TimeLineEvent.b.aa, x.f35708g);
        aeVar.f35593b.h().a("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new ah(aeVar, bVar));
    }
}
