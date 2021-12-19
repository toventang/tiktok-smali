package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab extends OneLinkHttpTask {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static List<String> f164 = Arrays.asList("onelink.me", "onelnk.com", "app.aflink.com");

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f165;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f166;

    /* renamed from: ι  reason: contains not printable characters */
    public b f167;

    public interface b {
        static {
            Covode.recordClassIndex(2709);
        }

        /* renamed from: ı  reason: contains not printable characters */
        void m121(String str);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m122(Map<String, String> map);
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void onErrorResponse() {
        String str = this.f166;
        if (str == null) {
            str = "Can't get one link data";
        }
        this.f167.m121(str);
    }

    static {
        Covode.recordClassIndex(2708);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m120() {
        if (TextUtils.isEmpty(this.oneLinkId) || TextUtils.isEmpty(this.f165) || this.oneLinkId.equals("app")) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final String getOneLinkUrl() {
        return new StringBuilder().append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1")).append("/").append(this.oneLinkId).append("?id=").append(this.f165).toString();
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void initRequest(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void handleResponse(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f167.m122(hashMap);
        } catch (JSONException e2) {
            this.f167.m121("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e2);
        }
    }

    public ab(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        if (!(TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath()))) {
            boolean z = false;
            for (String str : f164) {
                if (uri.getHost().contains(str)) {
                    z = true;
                }
            }
            if (AFDeepLinkManager.f0 != null) {
                AFLogger.afRDLog(new StringBuilder("Validate custom domain URLs: ").append(Arrays.asList(AFDeepLinkManager.f0)).toString());
                String[] strArr = AFDeepLinkManager.f0;
                for (String str2 : strArr) {
                    if (uri.getHost().contains(str2) && str2 != "") {
                        AFLogger.afDebugLog(new StringBuilder("DeepLink matches customDomain: ").append(uri.toString()).toString());
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.oneLinkId = split[1];
                this.f165 = split[2];
                this.f166 = uri.toString();
            }
        }
    }
}
