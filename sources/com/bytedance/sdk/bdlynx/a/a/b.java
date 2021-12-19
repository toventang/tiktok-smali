package com.bytedance.sdk.bdlynx.a.a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.event.BdpEventService;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpHostInfo;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpInfoService;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.BuildConfig;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import org.json.JSONObject;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final h f43622c = i.a((h.f.a.a) C1055b.f43628a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f43623d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f43624a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43625b;

    /* renamed from: e  reason: collision with root package name */
    private final h f43626e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.bdlynx.a.c.a f43627f;

    private final BdpInfoService b() {
        return (BdpInfoService) this.f43626e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26702);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.b$b  reason: collision with other inner class name */
    static final class C1055b extends m implements h.f.a.a<BdpEventService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1055b f43628a = new C1055b();

        static {
            Covode.recordClassIndex(26703);
        }

        C1055b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpEventService invoke() {
            return BdpManager.getInst().getService(BdpEventService.class);
        }
    }

    static final class c extends m implements h.f.a.a<BdpInfoService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f43629a = new c();

        static {
            Covode.recordClassIndex(26704);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpInfoService invoke() {
            return BdpManager.getInst().getService(BdpInfoService.class);
        }
    }

    static {
        Covode.recordClassIndex(26701);
    }

    public final void a() {
        l.c(this, "");
        try {
            ((BdpEventService) f43622c.getValue()).sendEventV3(this.f43625b, this.f43624a);
        } catch (Throwable unused) {
        }
    }

    public final b a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            this.f43624a.put(next, jSONObject.get(next));
        }
        return this;
    }

    private b(String str) {
        l.c(str, "");
        this.f43625b = str;
        this.f43627f = null;
        JSONObject jSONObject = new JSONObject();
        this.f43624a = jSONObject;
        this.f43626e = i.a((h.f.a.a) c.f43629a);
        BdpInfoService b2 = b();
        l.a((Object) b2, "");
        BdpHostInfo hostInfo = b2.getHostInfo();
        l.a((Object) hostInfo, "");
        jSONObject.put("app_id", hostInfo.getAppId());
        BdpInfoService b3 = b();
        l.a((Object) b3, "");
        BdpHostInfo hostInfo2 = b3.getHostInfo();
        l.a((Object) hostInfo2, "");
        jSONObject.put("app_version", hostInfo2.getVersionName());
        BdpInfoService b4 = b();
        l.a((Object) b4, "");
        BdpHostInfo hostInfo3 = b4.getHostInfo();
        l.a((Object) hostInfo3, "");
        jSONObject.put("app_name", hostInfo3.getAppName());
        jSONObject.put("lynx_version", com.bytedance.sdk.bdlynx.a.a.f43617b);
        jSONObject.put("bdlynx_version", "1.0.0-rc.34.3-bugfix");
        jSONObject.put("core_js_version", BuildConfig.VERSION_NAME);
        jSONObject.put("bd_core_js_version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.bdlynx.a.c.a aVar = this.f43627f;
        if (aVar != null) {
            jSONObject.put("group_id", aVar.f43659b);
            jSONObject.put("card_id", aVar.f43660c);
            jSONObject.put("cli_version", aVar.f43658a);
        }
    }

    public /* synthetic */ b(String str, byte b2) {
        this(str);
    }

    public final b a(String str, Object obj) {
        l.c(str, "");
        if (obj != null) {
            this.f43624a.put(str, obj);
        }
        return this;
    }
}
