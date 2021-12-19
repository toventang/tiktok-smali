package com.bytedance.ttnet.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.http.g.f;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.a.b;
import com.bytedance.ttnet.c;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.d;
import com.bytedance.ttnet.f.c;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class a implements ICronetAppProvider, ICronetDepend {
    static {
        Covode.recordClassIndex(27245);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void doLoadLibrary(String str) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbClient() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFeature() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFlag() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppId() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getBypassBOEJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCarrierRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getChannel() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCityName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDevicePlatform() {
        return "android";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getGetDomainDefaultJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getHttpDnsRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getIId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getLanguage() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getManifestVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public ArrayList<byte[]> getOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, Pair<Integer, Integer>> getQuicHint() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkAppId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSsmix() {
        return "a";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdcRuleJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSysRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getTNCRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestHeader() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUUID() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUpdateVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUserId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isBOEProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableBrotli() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableQuic() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean needCustomLoadLibrary() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void sendAppMonitorEvent(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceBrand() {
        return Build.BRAND;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceType() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getProcessFlag() {
        return f.f29375a.get();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        return Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbi() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCronetSoPath() {
        return com.bytedance.ttnet.a.a.a(TTNetInit.getTTNetDepend().a()).f44437e;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestQuery() {
        d tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend != null) {
            boolean z = tTNetDepend instanceof com.bytedance.ttnet.a;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onColdStartFinish() {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(27251);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
                TTNetInit.notifyColdStartFinish();
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onCronetBootSucceed() {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass6 */

            static {
                Covode.recordClassIndex(27255);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
                com.bytedance.ttnet.a.a a2 = com.bytedance.ttnet.a.a.a(TTNetInit.getTTNetDepend().a());
                try {
                    SharedPreferences a3 = com.ss.android.ugc.aweme.bf.d.a(a2.f44435c, "ss_app_config", 0);
                    SharedPreferences.Editor edit = a3.edit();
                    edit.putInt("chromium_boot_failures", 0);
                    Logger.debug();
                    com.bytedance.common.utility.e.a.a(edit);
                    a2.f44436d = a3.getInt("chromium_boot_failures", 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("chromium_boot_failures", Integer.valueOf(a2.f44436d));
                    TTNetInit.getTTNetDepend().a(a2.f44435c, linkedHashMap);
                } catch (Throwable unused) {
                }
                c.f44548e = true;
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDPI() {
        int d2 = n.d(TTNetInit.getTTNetDepend().a());
        if (d2 > 0) {
            return String.valueOf(d2);
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            if (str == null || str.length() <= 10) {
                return str;
            }
            return str.substring(0, 10);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getResolution() {
        String c2 = n.c(TTNetInit.getTTNetDepend().a());
        if (!m.a(c2)) {
            return c2;
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getNetAccessType() {
        Context a2 = TTNetInit.getTTNetDepend().a();
        if (TextUtils.isEmpty(j.f107222a) || !j.b() || j.c()) {
            j.f107222a = l.a(l.a(a2));
        }
        return j.f107222a;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] b2 = TTNetInit.getTTNetDepend().b();
        if (b2 != null) {
            if (b2.length > 0) {
                linkedHashMap.put("first", b2[0]);
            }
            if (b2.length > 1) {
                linkedHashMap.put("second", b2[1]);
            }
            if (b2.length > 2) {
                linkedHashMap.put("third", b2[2]);
            }
        }
        Map<String, String> f2 = TTNetInit.getTTNetDepend().f();
        if (TextUtils.isEmpty(f2.get("httpdns")) || TextUtils.isEmpty(f2.get("netlog")) || TextUtils.isEmpty(f2.get("boe"))) {
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        linkedHashMap.put("httpdns", f2.get("httpdns"));
        linkedHashMap.put("netlog", f2.get("netlog"));
        linkedHashMap.put("boe", f2.get("boe"));
        return linkedHashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onClientIPChanged(final String str) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(27252);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
                TTNetInit.onClientIPChanged(str);
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onEffectiveConnectionTypeChanged(final int i2) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass10 */

            static {
                Covode.recordClassIndex(27247);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigEtagChanged(final String str) {
        try {
            new e() {
                /* class com.bytedance.ttnet.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(27246);
                }

                @Override // com.bytedance.common.utility.b.e
                public final void run() {
                    try {
                        com.bytedance.ttnet.a.a.a(TTNetInit.getTTNetDepend().a()).f44439g = str;
                    } catch (Throwable unused) {
                    }
                }
            }.a();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigUpdated(final String str) {
        try {
            Logger.debug();
            new e() {
                /* class com.bytedance.ttnet.b.a.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(27256);
                }

                @Override // com.bytedance.common.utility.b.e
                public final void run() {
                    try {
                        com.bytedance.ttnet.f.c.a().f44626b.f44619c = "";
                        com.bytedance.ttnet.a.a a2 = com.bytedance.ttnet.a.a.a(TTNetInit.getTTNetDepend().a());
                        String str = str;
                        boolean z = false;
                        if (!m.a(str)) {
                            try {
                                z = a2.a(str, c.a.TTCRONET, System.currentTimeMillis());
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            int i2 = 102;
                            if (z) {
                                i2 = 101;
                            }
                            try {
                                new JSONObject().put("from", "cronet");
                                TTNetInit.getTTNetDepend();
                            } catch (Throwable unused) {
                            }
                            a2.f44442j.sendEmptyMessage(i2);
                        }
                        ClientKeyManager.a().b(str);
                    } catch (Throwable unused2) {
                    }
                }
            }.a();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTNetDetectInfoChanged(final String str) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass9 */

            static {
                Covode.recordClassIndex(27258);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onMultiNetworkStateChanged(final int i2, final int i3) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass13 */

            static {
                Covode.recordClassIndex(27250);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTNCUpdateFailed(final ArrayList<String> arrayList, final String str) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(27254);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
                Context a2;
                String str;
                String str2;
                String str3;
                String str4;
                b.a();
                ArrayList arrayList = arrayList;
                String str5 = str;
                if (arrayList != null && !arrayList.isEmpty() && (a2 = TTNetInit.getTTNetDepend().a()) != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str6 = (String) it.next();
                        try {
                            com.bytedance.ttnet.d.a aVar = new com.bytedance.ttnet.d.a();
                            aVar.f44573f = true;
                            aVar.f44574g = false;
                            h hVar = new h(str6);
                            hVar.a("tnc_src", "7");
                            String hVar2 = hVar.toString();
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            if (!TextUtils.isEmpty(str5)) {
                                hashMap2.put("x-tt-tnc-summary", str5);
                            }
                            String a3 = com.bytedance.ttnet.d.c.a(hVar2, hashMap2, hashMap, aVar);
                            if (!m.a(a3)) {
                                if ("success".equals(new JSONObject(a3).getString("message"))) {
                                    try {
                                        String str7 = "";
                                        if (hashMap.get("x-ss-etag") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-ss-etag")).get(0))) {
                                            str = str7;
                                        } else {
                                            str = (String) ((List) hashMap.get("x-ss-etag")).get(0);
                                        }
                                        if (hashMap.get("x-ss-canary") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-ss-canary")).get(0))) {
                                            str2 = str7;
                                        } else {
                                            str2 = (String) ((List) hashMap.get("x-ss-canary")).get(0);
                                        }
                                        if (hashMap.get("x-tt-tnc-config") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-tt-tnc-config")).get(0))) {
                                            str3 = str7;
                                        } else {
                                            str3 = (String) ((List) hashMap.get("x-tt-tnc-config")).get(0);
                                        }
                                        if (hashMap.get("x-tt-tnc-abtest") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-tt-tnc-abtest")).get(0))) {
                                            str4 = str7;
                                        } else {
                                            str4 = (String) ((List) hashMap.get("x-tt-tnc-abtest")).get(0);
                                        }
                                        if (hashMap.get("x-tt-tnc-control") != null && !TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-tt-tnc-control")).get(0))) {
                                            str7 = (String) ((List) hashMap.get("x-tt-tnc-control")).get(0);
                                        }
                                        com.bytedance.frameworks.baselib.network.http.cronet.b.h.a(a2);
                                        com.bytedance.frameworks.baselib.network.http.cronet.b.h.a();
                                        Reflect.on(com.bytedance.frameworks.baselib.network.http.cronet.b.h.f29075c).call("notifyTNCConfigUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str7, a3).get();
                                        return;
                                    } catch (Throwable unused) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return com.bytedance.frameworks.baselib.network.http.e.a(str, hashMap);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onRTTOrThroughputEstimatesComputed(final int i2, final int i3, final int i4) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass11 */

            static {
                Covode.recordClassIndex(27248);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onStoreIdcChanged(final String str, final String str2, final String str3) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(27253);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
                b.a().a(str, str2, str3);
                com.bytedance.frameworks.baselib.network.http.f.b a2 = com.bytedance.frameworks.baselib.network.http.f.b.a();
                String str = str;
                String str2 = str2;
                String str3 = str3;
                if (a2.f29355h != null && a2.f29356i && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (!com.bytedance.frameworks.baselib.network.http.f.b.f29346l && (a2.f29349b == null || a2.f29348a == null || a2.f29352e == null)) {
                        throw new AssertionError();
                    } else if (!a2.f29349b.equalsIgnoreCase(str) || !a2.f29348a.equalsIgnoreCase(str2) || !a2.f29352e.equalsIgnoreCase(str3)) {
                        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(a2.f29355h, "ttnet_store_region", 0).edit();
                        if (!TextUtils.isEmpty(str)) {
                            a2.f29349b = str;
                        }
                        a2.f29348a = str2;
                        if (str3.equalsIgnoreCase("uid")) {
                            a2.f29352e = "uid";
                            a2.f29351d = str2;
                        } else if (str3.equalsIgnoreCase("did")) {
                            a2.f29352e = "did";
                            a2.f29350c = str2;
                        }
                        edit.putString("store_region", a2.f29348a);
                        edit.putString("store_idc", a2.f29349b);
                        edit.putString("store_region_src", a2.f29352e);
                        edit.putString("store_region_did", a2.f29350c);
                        edit.putString("store_region_uid", a2.f29351d);
                        edit.apply();
                    }
                }
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onPacketLossComputed(final int i2, final double d2, final double d3, final double d4, final double d5) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass12 */

            static {
                Covode.recordClassIndex(27249);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTDnsResolveResult(final String str, final String str2, final int i2, final int i3, final int i4, final List<String> list, final String str3) {
        Logger.debug();
        new e() {
            /* class com.bytedance.ttnet.b.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(27257);
            }

            @Override // com.bytedance.common.utility.b.e
            public final void run() {
                com.bytedance.ttnet.e.a a2 = com.bytedance.ttnet.e.a.a();
                String str = str;
                int i2 = i2;
                int i3 = i3;
                int i4 = i4;
                List list = list;
                String str2 = str3;
                com.bytedance.ttnet.e.b bVar = a2.f44594a.get(str);
                if (bVar != null) {
                    bVar.f44599e = new com.bytedance.ttnet.e.c(i2, i3, i4, list, str2);
                    bVar.f44598d.countDown();
                    a2.f44594a.remove(str);
                }
            }
        }.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void handleApiResult(boolean z, String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, boolean z2, long j12, long j13, String str4, String str5, String str6, Exception exc) {
        Logger.debug();
        com.bytedance.frameworks.baselib.network.http.a a2 = com.bytedance.frameworks.baselib.network.http.a.a();
        a2.f28913a = str3;
        a2.f28915c = j2;
        a2.f28916d = j2;
        a2.f28917e = j3;
        a2.f28918f = j4;
        a2.f28919g = j5;
        a2.f28920h = j6;
        a2.f28922j = j7;
        a2.f28923k = j8;
        a2.f28924l = j9;
        a2.f28925m = j10;
        a2.o = j11;
        a2.p = z2;
        a2.q = j12;
        long j14 = j6 - j3;
        a2.r = j14;
        a2.t = j13;
        a2.y = str4;
        a2.B = str5;
        a2.C = str6;
        a2.v = 0;
        if (z) {
            m.a(str);
            com.bytedance.frameworks.baselib.network.http.e.a(j14, j3, str, str2, a2);
            return;
        }
        com.bytedance.frameworks.baselib.network.http.e.a(str, exc);
        com.bytedance.frameworks.baselib.network.http.e.a(j14, j3, str, str2, a2, exc);
    }
}
