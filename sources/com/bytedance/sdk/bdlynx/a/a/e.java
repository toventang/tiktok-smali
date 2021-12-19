package com.bytedance.sdk.bdlynx.a.a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.monitor.BdpHybridMonitorService;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.BuildConfig;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final h f43641a = i.a((h.f.a.a) a.f43643a);

    /* renamed from: b  reason: collision with root package name */
    public static final e f43642b = new e();

    private e() {
    }

    static final class a extends m implements h.f.a.a<BdpHybridMonitorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f43643a = new a();

        static {
            Covode.recordClassIndex(26711);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpHybridMonitorService invoke() {
            return BdpManager.getInst().getService(BdpHybridMonitorService.class);
        }
    }

    static {
        Covode.recordClassIndex(26710);
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f43644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f43646c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.bdlynx.a.c.a f43647d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JSONObject f43648e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ JSONObject f43649f = null;

        static {
            Covode.recordClassIndex(26712);
        }

        public b(String str, String str2, JSONObject jSONObject, com.bytedance.sdk.bdlynx.a.c.a aVar, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.f43644a = str;
            this.f43645b = str2;
            this.f43646c = jSONObject;
            this.f43647d = aVar;
            this.f43648e = jSONObject2;
        }

        public final void run() {
            BdpHybridMonitorService bdpHybridMonitorService = (BdpHybridMonitorService) e.f43641a.getValue();
            if (bdpHybridMonitorService != null) {
                String str = this.f43644a;
                if (str == null) {
                    str = "bdlynx://";
                }
                String str2 = this.f43645b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bid", "");
                jSONObject.put("pid", "");
                jSONObject.put("ev_type", "custom");
                jSONObject.put("url", this.f43644a);
                jSONObject.put("host", "");
                jSONObject.put("path", "");
                jSONObject.put("platform", 3);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = this.f43646c;
                if (jSONObject3 != null) {
                    com.bytedance.sdk.bdlynx.a.f.a.a(jSONObject2, jSONObject3);
                }
                jSONObject2.put("sdk_type", "bdLynx");
                jSONObject2.put("core_js_version", BuildConfig.VERSION_NAME);
                jSONObject2.put("bd_core_js_version", "0.1.0");
                jSONObject2.put("lynx_version", com.bytedance.sdk.bdlynx.a.a.f43617b);
                jSONObject2.put("bdlynx_version", "1.0.0-rc.34.3-bugfix");
                com.bytedance.sdk.bdlynx.a.c.a aVar = this.f43647d;
                if (aVar != null) {
                    jSONObject2.put("group_id", aVar.f43659b);
                    jSONObject2.put("card_id", aVar.f43660c);
                }
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = this.f43648e;
                if (jSONObject5 != null) {
                    com.bytedance.sdk.bdlynx.a.f.a.a(jSONObject4, jSONObject5);
                }
                JSONObject jSONObject6 = new JSONObject();
                JSONObject jSONObject7 = this.f43649f;
                if (jSONObject7 != null) {
                    com.bytedance.sdk.bdlynx.a.f.a.a(jSONObject6, jSONObject7);
                }
                jSONObject6.put("event_name", this.f43645b);
                bdpHybridMonitorService.hybridMonitorEvent(str, str2, jSONObject, jSONObject2, jSONObject4, jSONObject6, 3);
            }
        }
    }
}
