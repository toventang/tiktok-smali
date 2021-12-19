package com.bytedance.sdk.bdlynx.report;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpHostInfo;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpInfoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.a.a.d;
import com.bytedance.sdk.bdlynx.c.f;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.base.LLog;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import h.z;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43770a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f43771b = i.a((h.f.a.a) C1063a.f43772a);

    private static BdpInfoService a() {
        return (BdpInfoService) f43771b.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.report.a$a  reason: collision with other inner class name */
    static final class C1063a extends m implements h.f.a.a<BdpInfoService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1063a f43772a = new C1063a();

        static {
            Covode.recordClassIndex(26778);
        }

        C1063a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpInfoService invoke() {
            return BdpManager.getInst().getService(BdpInfoService.class);
        }
    }

    static {
        Covode.recordClassIndex(26777);
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f43773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f43775c;

        static {
            Covode.recordClassIndex(26779);
        }

        public b(String str, String str2, String str3) {
            this.f43773a = str;
            this.f43774b = str2;
            this.f43775c = str3;
        }

        public final void run() {
            byte[] bArr;
            String str = this.f43773a;
            String str2 = this.f43774b;
            String str3 = this.f43775c;
            JSONObject a2 = a.a(str);
            if (a2 != null) {
                d.b("BDLynxJsReporter", a2.toString());
                JSONObject a3 = a.a(a2, str2, str3);
                if (a3 != null) {
                    String b2 = com.bytedance.sdk.bdlynx.a.a.a.a().b();
                    Application application = com.bytedance.sdk.bdlynx.b.a.f43672a;
                    if (application == null) {
                        return;
                    }
                    if (TextUtils.isEmpty(b2)) {
                        l.c("BDLynxJsReporter", "");
                        LLog.c("BDLynx_".concat("BDLynxJsReporter"), "js report url not set");
                        return;
                    }
                    Map b3 = ag.b(v.a("Content-Type", "application/json"), v.a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36"));
                    if (b2 == null) {
                        try {
                            l.a();
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    c cVar = c.f43776a;
                    l.c(application, "");
                    l.c(b2, "");
                    l.c(cVar, "");
                    com.bytedance.d.a.a.a.a.b bVar = new com.bytedance.d.a.a.a.a.b(com.bytedance.d.a.a.a.a.a.f28512b, b2);
                    bVar.f28518b.put("Content-Type", "application/json");
                    String jSONObject = a3.toString();
                    if (jSONObject != null) {
                        bArr = jSONObject.getBytes(h.m.d.f158808a);
                        l.a((Object) bArr, "");
                    } else {
                        bArr = null;
                    }
                    com.bytedance.sdk.bdlynx.a.a.c.a(application, bVar, b3, bArr, cVar);
                }
            }
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.d.a.a.a.a.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f43776a = new c();

        static {
            Covode.recordClassIndex(26780);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.d.a.a.a.a.c cVar) {
            l.c(cVar, "");
            return z.f158842a;
        }
    }

    static JSONObject a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    static JSONObject a(JSONObject jSONObject, String str, String str2) {
        boolean z;
        JSONObject jSONObject2;
        try {
            Object opt = jSONObject.opt("error");
            if (opt == null) {
                opt = new JSONObject();
            } else if (opt instanceof String) {
                try {
                    jSONObject2 = new JSONObject((String) opt);
                } catch (JSONException unused) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(StringSet.type, "INTERNAL_RUNTIME_ERROR");
                    jSONObject3.put("value", opt);
                    JSONArray put = new JSONArray().put(jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("values", put);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("exception", jSONObject4);
                    jSONObject2 = new JSONObject();
                    jSONObject2.put("sentry", jSONObject5);
                    jSONObject2.put("url", jSONObject.opt("url"));
                }
                opt = jSONObject2;
            }
            if (!(opt instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject6 = (JSONObject) opt;
            jSONObject6.put("bid", "bdlynx_core");
            jSONObject6.put("context", "{}");
            jSONObject6.put("ev_type", "jserr");
            jSONObject6.put("hostname", "");
            String optString = jSONObject6.optString("pid");
            if (optString == null || optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jSONObject6.put("pid", "INTERNAL_ERROR");
            }
            jSONObject6.put("protocol", "file://");
            jSONObject6.put("sample_rate", "1");
            jSONObject6.put("slardar_session_id", f.a());
            BdpInfoService a2 = a();
            l.a((Object) a2, "");
            BdpHostInfo hostInfo = a2.getHostInfo();
            l.a((Object) hostInfo, "");
            jSONObject6.put("slardar_web_id", hostInfo.getDeviceId());
            jSONObject6.put("timestamp", System.currentTimeMillis());
            JSONObject optJSONObject = jSONObject6.optJSONObject("sentry");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                jSONObject6.put("sentry", optJSONObject);
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("tags");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                optJSONObject.put("tags", optJSONObject2);
                optJSONObject2.put("jscrash", true);
            }
            optJSONObject2.put("app_type", "card");
            BdpInfoService a3 = a();
            l.a((Object) a3, "");
            BdpHostInfo hostInfo2 = a3.getHostInfo();
            l.a((Object) hostInfo2, "");
            optJSONObject2.put("did", hostInfo2.getDeviceId());
            BdpInfoService a4 = a();
            l.a((Object) a4, "");
            BdpHostInfo hostInfo3 = a4.getHostInfo();
            l.a((Object) hostInfo3, "");
            optJSONObject2.put("aid", hostInfo3.getAppId());
            BdpInfoService a5 = a();
            l.a((Object) a5, "");
            BdpHostInfo hostInfo4 = a5.getHostInfo();
            l.a((Object) hostInfo4, "");
            optJSONObject2.put("app_name", hostInfo4.getAppName());
            optJSONObject2.put("group_id", str);
            optJSONObject2.put("card_id", str2);
            optJSONObject2.put("native_lynx_sdk_version", com.bytedance.sdk.bdlynx.a.a.f43617b);
            optJSONObject2.put("native_bdlynx_sdk_version", "1.0.0-rc.34.3-bugfix");
            optJSONObject2.put("system", "android");
            return (JSONObject) opt;
        } catch (JSONException unused2) {
            return null;
        }
    }
}
