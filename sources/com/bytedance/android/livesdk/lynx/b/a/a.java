package com.bytedance.android.livesdk.lynx.b.a;

import com.bytedance.android.livesdk.lynx.b.a.b;
import com.bytedance.android.monitor.lynx.jsb.LynxMonitorModule;
import com.bytedance.covode.number.Covode;
import com.bytedance.j.a.c;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18759a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(11098);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.b.a.a$a  reason: collision with other inner class name */
    public static final class C0393a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.monitor.lynx.jsb.a f18760a;

        static {
            Covode.recordClassIndex(11099);
        }

        C0393a(com.bytedance.android.monitor.lynx.jsb.a aVar) {
            this.f18760a = aVar;
        }

        @Override // com.bytedance.android.livesdk.lynx.b.a.b.a
        public final void a(LynxView lynxView) {
            l.d(lynxView, "");
            this.f18760a.f23663a = lynxView;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.b.a.b
    public final b.a a(c cVar) {
        l.d(cVar, "");
        com.bytedance.android.monitor.lynx.jsb.a aVar = new com.bytedance.android.monitor.lynx.jsb.a();
        C0393a aVar2 = new C0393a(aVar);
        Map<String, com.bytedance.j.a.e.b> map = cVar.n;
        if (map != null) {
            map.put("hybridMonitor", new com.bytedance.j.a.e.b(LynxMonitorModule.class, aVar));
        }
        return aVar2;
    }

    @Override // com.bytedance.android.livesdk.lynx.b.a.b
    public final void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        com.bytedance.android.monitor.lynx.b.f23580f.a(null, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, false);
    }
}
