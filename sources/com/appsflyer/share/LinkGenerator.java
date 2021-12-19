package com.appsflyer.share;

import android.content.Context;
import com.a;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class LinkGenerator {

    /* renamed from: ı  reason: contains not printable characters */
    private String f329;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f330;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f331;

    /* renamed from: ɨ  reason: contains not printable characters */
    private String f332;

    /* renamed from: ɩ  reason: contains not printable characters */
    String f333;

    /* renamed from: ɪ  reason: contains not printable characters */
    private String f334;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f335;

    /* renamed from: ɾ  reason: contains not printable characters */
    private Map<String, String> f336 = new HashMap();

    /* renamed from: Ι  reason: contains not printable characters */
    private String f337;

    /* renamed from: ι  reason: contains not printable characters */
    String f338;

    /* renamed from: І  reason: contains not printable characters */
    private String f339;

    /* renamed from: і  reason: contains not printable characters */
    private String f340;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f341;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Map<String, String> f342 = new HashMap();

    static {
        Covode.recordClassIndex(2783);
    }

    public String getBrandDomain() {
        return this.f334;
    }

    public String getCampaign() {
        return this.f331;
    }

    public String getChannel() {
        return this.f337;
    }

    public String getMediaSource() {
        return this.f329;
    }

    public Map<String, String> getParameters() {
        return this.f336;
    }

    public String generateLink() {
        return m217().toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private StringBuilder m217() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f333;
        if (str2 == null || !str2.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl(Constants.f323));
        } else {
            sb.append(this.f333);
        }
        if (this.f338 != null) {
            sb.append('/').append(this.f338);
        }
        this.f342.put("pid", this.f329);
        sb.append('?').append("pid=").append(m218(this.f329, "media source"));
        String str3 = this.f340;
        if (str3 != null) {
            this.f342.put("af_referrer_uid", str3);
            sb.append('&').append("af_referrer_uid=").append(m218(this.f340, "referrerUID"));
        }
        String str4 = this.f337;
        if (str4 != null) {
            this.f342.put("af_channel", str4);
            sb.append('&').append("af_channel=").append(m218(this.f337, "channel"));
        }
        String str5 = this.f335;
        if (str5 != null) {
            this.f342.put("af_referrer_customer_id", str5);
            sb.append('&').append("af_referrer_customer_id=").append(m218(this.f335, "referrerCustomerId"));
        }
        String str6 = this.f331;
        if (str6 != null) {
            this.f342.put("c", str6);
            sb.append('&').append("c=").append(m218(this.f331, "campaign"));
        }
        String str7 = this.f339;
        if (str7 != null) {
            this.f342.put("af_referrer_name", str7);
            sb.append('&').append("af_referrer_name=").append(m218(this.f339, "referrerName"));
        }
        String str8 = this.f341;
        if (str8 != null) {
            this.f342.put("af_referrer_image_url", str8);
            sb.append('&').append("af_referrer_image_url=").append(m218(this.f341, "referrerImageURL"));
        }
        if (this.f332 != null) {
            StringBuilder append = new StringBuilder().append(this.f332);
            String str9 = "";
            if (this.f332.endsWith("/")) {
                str = str9;
            } else {
                str = "/";
            }
            append.append(str);
            String str10 = this.f330;
            if (str10 != null) {
                append.append(str10);
            }
            this.f342.put("af_dp", append.toString());
            sb.append('&').append("af_dp=").append(m218(this.f332, "baseDeeplink"));
            if (this.f330 != null) {
                if (!this.f332.endsWith("/")) {
                    str9 = "%2F";
                }
                sb.append(str9).append(m218(this.f330, "deeplinkPath"));
            }
        }
        for (String str11 : this.f336.keySet()) {
            if (!sb.toString().contains(new StringBuilder().append(str11).append("=").append(m218(this.f336.get(str11), str11)).toString())) {
                sb.append('&').append(str11).append('=').append(m218(this.f336.get(str11), str11));
            }
        }
        return sb;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f332 = str;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f334 = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.f331 = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.f337 = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f330 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f335 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f341 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f339 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f340 = str;
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f336.putAll(map);
        }
        return this;
    }

    public LinkGenerator(String str) {
        this.f329 = str;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f336.put(str, str2);
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m218(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException unused) {
            AFLogger.afInfoLog(new StringBuilder("Illegal ").append(str2).append(": ").append(str).toString());
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        if (!this.f336.isEmpty()) {
            for (Map.Entry<String, String> entry : this.f336.entrySet()) {
                this.f342.put(entry.getKey(), entry.getValue());
            }
        }
        m217();
        String str = this.f334;
        Map<String, String> map = this.f342;
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isTrackingStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.f333 = a.a("https://%s/%s", new Object[]{ServerConfigHandler.getUrl("%sapp.%s"), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.f333 = a.a("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }
}
