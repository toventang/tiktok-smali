package com.ss.android.ugc.aweme.web;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge2.n;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.ss.android.ugc.aweme.local_test.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static long f144909a = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(94746);
    }

    public static List<String> a(List<String> list) {
        return a(list, false);
    }

    private static void a(Set<String> set, String[] strArr) {
        int i2 = -1;
        String str = "";
        if (set != null) {
            try {
                i2 = set.size();
                str = set.toString();
            } catch (Exception unused) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", i2);
        jSONObject.put("content", str);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("response", strArr);
        }
        b.a("jsb_config_log", jSONObject);
    }

    public static List<String> a(List<String> list, boolean z) {
        Set<String> a2;
        long currentTimeMillis;
        HashSet hashSet = new HashSet();
        List<String> jsbSafeHost = a.C2792a.f108997a.f108996a.getJsbSafeHost();
        if (jsbSafeHost != null) {
            hashSet.addAll(jsbSafeHost);
        }
        boolean a3 = SettingsManager.a().a("jsb_ignore_gecko_safe_host", true);
        if (!z || !a3) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String[] strArr = new String[1];
            boolean a4 = SettingsManager.a().a("use_bridge_engine_v2", true);
            do {
                a2 = x.a(list, new n.a() {
                    /* class com.ss.android.ugc.aweme.web.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(94747);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.n.a
                    public final String a(String str, String str2) {
                        return Keva.getRepo("jsbridge2-permission", 1).getString(str, str2);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.n.a
                    public final void b(String str, String str2) {
                        Keva.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.n.a
                    public final void a(String str, n.a.AbstractC0809a aVar) {
                        aVar.a(Keva.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                }, CrossPlatformServiceImpl.c().b());
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                if (!a2.isEmpty() || !a4 || System.currentTimeMillis() - f144909a > 3000) {
                }
            } while (currentTimeMillis < InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            if (!a2.isEmpty() || !a4) {
                hashSet.addAll(a2);
            } else {
                a(a2, strArr);
            }
        }
        return new ArrayList(hashSet);
    }
}
