package com.ss.android.ugc.aweme.net;

import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.ttnet.b.a;
import com.ss.android.account.f;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.g;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.net.o;
import com.ss.android.ugc.aweme.service.ILarkMsgReportHostService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.video.preload.s;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f112296a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static int f112297b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final Keva f112298c = Keva.getRepo("network_keva");

    /* renamed from: d  reason: collision with root package name */
    static final Pattern f112299d = Pattern.compile("(https:.+?)\\?.+?x-tt-logid=\\[([0-9a-zA-Z]+?)\\],.*?x-tt-store-region=\\[([a-zA-Z]+)\\], x-tt-store-region-src=\\[([a-zA-Z]+)\\]");

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbClient() {
        return null;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFeature() {
        return null;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFlag() {
        return "0";
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdcRuleJSON() {
        return "{\"update_store_idc_path_list\": [\"/passport/*\", \"/service/*/device_register/\", \"/service/*/app_alert_check/\", \"/service/*/app_alert/\"],\"add_store_idc_host_list\": [\"*.tiktokv.com\",\"*.tiktok.com\", \"*.tiktokv.com.boe-gateway.byted.org\"]}";
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUUID() {
        return "";
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getChannel() {
        return d.s;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbVersion() {
        return d.f();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppName() {
        return d.b();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCarrierRegion() {
        return com.ss.android.ugc.aweme.language.d.h();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceId() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getRegion() {
        return com.ss.android.ugc.aweme.language.d.g();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionName() {
        return d.f();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppId() {
        return String.valueOf(AppLog.getAppId());
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getManifestVersionCode() {
        return String.valueOf(d.h());
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdc() {
        return g.get().getStoreIdc();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSysRegion() {
        return SettingServiceImpl.v().l();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUpdateVersionCode() {
        return String.valueOf(d.d());
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionCode() {
        return String.valueOf(d.e());
    }

    private static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (String str : a.C2792a.f108997a.f108996a.getBoeBypassPathList()) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getBypassBOEJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bypass_boe_host_list", a());
            jSONObject.put("bypass_boe_path_list", b());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getGetDomainDefaultJSON() {
        String g2 = com.ss.android.ugc.aweme.language.d.g();
        for (String str : com.ss.android.ugc.aweme.net.b.a.f112234c) {
            if (str.equalsIgnoreCase(g2)) {
                return com.ss.android.ugc.aweme.net.b.a.f112238g;
            }
        }
        return com.ss.android.ugc.aweme.net.b.a.f112239h;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> getTNCRequestHeader() {
        return com.ss.android.token.d.a("https://" + f.a().a());
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUserId() {
        String userId = AppLog.getUserId();
        if (m.a(userId) || userId.equals("0")) {
            return b.g().getCurUserId();
        }
        return userId;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final boolean loggerDebug() {
        if (com.ttnet.org.chromium.base.g.a() || "local_test".equals(d.s)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(72162);
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final ArrayList<byte[]> getOpaqueData() {
        if (!f112298c.getBoolean("opaque_data_enabled", true)) {
            return null;
        }
        ArrayList<byte[]> a2 = o.a();
        l.d(a2, "");
        i.b(new o.b(a2), i.f4824a);
        return a2;
    }

    private static JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        if (ServiceManager.get().getService(ILarkMsgReportHostService.class) != null) {
            String a2 = ((ILarkMsgReportHostService) ServiceManager.get().getService(ILarkMsgReportHostService.class)).a();
            if (!TextUtils.isEmpty(a2)) {
                jSONArray.put(a2);
            }
        }
        for (String str : a.C2792a.f108997a.f108996a.getBoeBypassHostList()) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    private static void a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_duration");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    long optLong = optJSONObject.optLong(next);
                    a.b.f109011a.b(com.a.a("%s_%s", new Object[]{"ttnet_duration", next}), optLong);
                }
            }
        } catch (Exception unused) {
        }
    }

    private static Map<String, String> b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.get(next)));
        }
        return hashMap;
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigUpdated(String str) {
        com.ss.android.ugc.aweme.lancet.b.a.a("tnc ", true);
        super.onServerConfigUpdated(str);
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            String[] split = jSONObject.getString("share_cookie_host_list").split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (str2.startsWith(".")) {
                    str2 = str2.substring(1);
                }
                arrayList.add(str2);
            }
            com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a(arrayList);
            com.ss.android.ugc.aweme.lancet.b.a.b();
            s.b().a(b(jSONObject.getJSONObject("ttnet_http_dns_addr")));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.ttnet.b.a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void sendAppMonitorEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            n.a(str2, jSONObject);
            if ("ttnet_init".equals(str2)) {
                a(jSONObject);
            } else if ("store_idc".equals(str2)) {
                com.ss.android.ugc.aweme.cw.g.b().execute(new f(str));
            }
        } catch (Throwable unused) {
        }
    }
}
