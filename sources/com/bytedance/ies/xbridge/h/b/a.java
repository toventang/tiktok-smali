package com.bytedance.ies.xbridge.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.f;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.h.a.a;
import com.bytedance.ies.xbridge.model.c.b;
import h.f.b.l;

public final class a extends com.bytedance.ies.xbridge.h.a.a {
    static {
        Covode.recordClassIndex(21545);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.b.a$a  reason: collision with other inner class name */
    public static final class C0835a implements IReportADLogResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.AbstractC0833a f36021a;

        static {
            Covode.recordClassIndex(21546);
        }

        C0835a(a.AbstractC0833a aVar) {
            this.f36021a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
        public final void onFailure(int i2, String str) {
            l.c(str, "");
            this.f36021a.a(i2, str);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
        public final void onSuccess(b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            this.f36021a.a(bVar, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.h.a.a
    public final void a(com.bytedance.ies.xbridge.h.c.a aVar, a.AbstractC0833a aVar2, e eVar) {
        IHostLogDepend iHostLogDepend;
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        String str = aVar.f36025a;
        if (str == null) {
            l.a("label");
        }
        String str2 = aVar.f36026b;
        if (str2 == null) {
            l.a("tag");
        }
        f fVar = new f(str, str2, aVar.f36027c, aVar.f36028d, aVar.f36029e, aVar.f36030f, aVar.f36031g);
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (bVar == null || (iHostLogDepend = bVar.f35873b) == null) {
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l;
            if (bVar2 != null) {
                iHostLogDepend = bVar2.f35873b;
            } else {
                return;
            }
        }
        if (iHostLogDepend != null) {
            iHostLogDepend.handleReportADLog(this.f35883d, b(), fVar, new C0835a(aVar2), eVar);
        }
    }
}
