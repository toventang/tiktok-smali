package com.bytedance.sdk.xbridge.protocol.impl.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.c.e;
import com.bytedance.sdk.xbridge.protocol.d.b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.sdk.xbridge.protocol.a f44030a;

    static {
        Covode.recordClassIndex(26888);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.e
    public final void a() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.bytedance.sdk.xbridge.protocol.a aVar) {
        super(aVar);
        l.c(aVar, "");
        this.f44030a = aVar;
    }

    private final void a(String str, JavaOnlyArray javaOnlyArray) {
        LynxView lynxView = this.f44030a.f43922d;
        if (lynxView != null) {
            lynxView.sendGlobalEvent(str, javaOnlyArray);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.e
    public final void a(String str, Object obj) {
        l.c(str, "");
        if (obj instanceof JavaOnlyArray) {
            a(str, (JavaOnlyArray) obj);
        } else if (obj instanceof JSONObject) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            b bVar = b.f43958a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", obj);
            jSONObject.put("containerID", this.f44030a.f43923e);
            jSONObject.put("protocolVersion", "1.0");
            javaOnlyArray.pushMap(bVar.a(jSONObject));
            a(str, javaOnlyArray);
        }
    }
}
