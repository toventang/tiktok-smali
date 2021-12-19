package com.bytedance.sdk.xbridge.protocol;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.b.a;
import com.bytedance.sdk.xbridge.a.b.c;
import com.bytedance.sdk.xbridge.a.c;
import com.bytedance.sdk.xbridge.protocol.a.b;
import com.bytedance.sdk.xbridge.protocol.d.e;
import h.f.b.l;

public final class b implements com.bytedance.sdk.xbridge.protocol.c.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f43941a = "DefaultBridgeClientImp";

    /* renamed from: b  reason: collision with root package name */
    private c f43942b = new a();

    static {
        Covode.recordClassIndex(26846);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.b
    public final void a() {
        e.a(this.f43941a, "onBridgeCallback");
    }

    public b(a aVar) {
        l.c(aVar, "");
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.b
    public final void b(com.bytedance.sdk.xbridge.protocol.a.a aVar) {
        l.c(aVar, "");
        e.a(this.f43941a, "onBridgeCallback: bridgeName: " + aVar.f43928b);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.b
    public final com.bytedance.sdk.xbridge.protocol.a.b a(com.bytedance.sdk.xbridge.protocol.a.a aVar) {
        c.a aVar2;
        boolean z;
        l.c(aVar, "");
        String str = aVar.f43933g;
        String str2 = aVar.f43928b;
        l.c(str, "");
        l.c(str2, "");
        com.bytedance.sdk.xbridge.a.c cVar = com.bytedance.sdk.xbridge.a.b.f43911a.get(str);
        if (cVar != null) {
            aVar2 = cVar.a(str2);
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return b.a.a(-1128, "Permission layer doesn't have the access of " + aVar.f43928b + '.');
        }
        Boolean a2 = this.f43942b.a(aVar);
        if (l.a((Object) a2, (Object) true)) {
            return null;
        }
        if (l.a((Object) a2, (Object) false)) {
            return b.a.a(-1, "The URL is not authorized to call this JSBridge method");
        }
        return b.a.a(-1128, "Permission layer doesn't have the access of " + aVar.f43928b + '.');
    }
}
