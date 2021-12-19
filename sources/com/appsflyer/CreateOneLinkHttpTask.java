package com.appsflyer;

import android.content.Context;
import com.appsflyer.share.LinkGenerator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.DataOutputStream;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends OneLinkHttpTask {
    private String brandDomain;
    private Context context;
    private Map<String, String> data;
    private boolean mTrackingStopped;
    private String packageName = "";
    private ResponseListener responseListener;
    private String ttl;

    public interface ResponseListener {
        static {
            Covode.recordClassIndex(2684);
        }

        void onResponse(String str);

        void onResponseError(String str);
    }

    static {
        Covode.recordClassIndex(2683);
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    public String getOneLinkUrl() {
        return ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1") + "/" + this.oneLinkId;
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    public void onErrorResponse() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.oneLinkId, AppsFlyerProperties.getInstance().getString("onelinkDomain"), this.packageName).addParameter("af_siteid", this.packageName).addParameters(this.data);
        String string = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.responseListener.onResponse(addParameters.generateLink());
    }

    public void setBrandDomain(String str) {
        this.brandDomain = str;
    }

    public void setListener(ResponseListener responseListener2) {
        this.responseListener = responseListener2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    public void handleResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.responseListener.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e2) {
            this.responseListener.onResponseError("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e2);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.appsflyer.OneLinkHttpTask
    public void initRequest(HttpsURLConnection httpsURLConnection) {
        MethodCollector.i(11);
        if (this.mTrackingStopped) {
            MethodCollector.o(11);
            return;
        }
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(this.data);
        jSONObject.put("ttl", this.ttl);
        jSONObject.put("data", jSONObject2);
        String str = this.brandDomain;
        if (str != null) {
            jSONObject.put("brand_domain", str);
        }
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject.toString());
        dataOutputStream.flush();
        dataOutputStream.close();
        MethodCollector.o(11);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, AppsFlyerLibCore appsFlyerLibCore, Context context2, boolean z) {
        super(appsFlyerLibCore);
        this.mTrackingStopped = z;
        this.context = context2;
        if (context2 != null) {
            this.packageName = context2.getPackageName();
        } else {
            AFLogger.afWarnLog("CreateOneLinkHttpTask: context can't be null");
        }
        this.oneLinkId = str;
        this.ttl = "-1";
        this.data = map;
    }
}
