package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

public class HTTPDNSHosts {
    private static String mTTDNSServer = "/q?host=";
    protected boolean mCancelled;
    protected Handler mHandler;
    public String[] mHostnames;
    private int mHttpDNSType = 2;
    public String mId;
    protected AVMDLNetClient mNetClient;

    static {
        Covode.recordClassIndex(101163);
    }

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + AVMDLDNSParser.mGlobalOwnDNSParseHost + mTTDNSServer);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.mHostnames;
            if (i2 >= strArr.length) {
                return sb.toString();
            }
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (i3 == 0) {
                    sb.append(this.mHostnames[i2]);
                } else {
                    sb.append("," + this.mHostnames[i2]);
                }
                i3++;
            }
            i2++;
        }
    }

    public void start() {
        String _getURL = _getURL();
        AVMDLLog.d("BatchParseHTTPDNSHosts", "batch http dns  url:".concat(String.valueOf(_getURL)));
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() {
                    /* class com.ss.mediakit.net.HTTPDNSHosts.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101164);
                    }

                    @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNSHosts.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() {
            /* class com.ss.mediakit.net.HTTPDNSHosts.AnonymousClass2 */

            static {
                Covode.recordClassIndex(101165);
            }

            @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNSHosts.this._handleResponse(jSONObject, error);
            }
        });
    }

    private void parseResult(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("dns");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    AVMDLDNSInfo parserResultForSingleHost = parserResultForSingleHost(jSONArray.getJSONObject(i2));
                    if (parserResultForSingleHost != null) {
                        IPCache.getInstance().put(parserResultForSingleHost.mHost, parserResultForSingleHost);
                    }
                }
            } catch (Exception e2) {
                AVMDLLog.d("BatchParseHTTPDNSHosts", "parse json exception".concat(String.valueOf(e2)));
            }
        }
    }

    private AVMDLDNSInfo parserResultForSingleHost(JSONObject jSONObject) {
        long j2;
        String str;
        int i2;
        String str2;
        int i3 = this.mHttpDNSType;
        String str3 = "";
        if (i3 != 2 && i3 != 1) {
            str = null;
            j2 = 0;
            if (!TextUtils.isEmpty(str)) {
            }
            AVMDLLog.d("BatchParseHTTPDNSHosts", "parse result is null");
        } else if (!(jSONObject == null || jSONObject.length() == 0)) {
            if (jSONObject.has("ttl")) {
                i2 = jSONObject.optInt("ttl");
            } else {
                i2 = 60;
            }
            str = jSONObject.has("host") ? jSONObject.optString("host") : null;
            j2 = System.currentTimeMillis() + ((long) (i2 * 1000));
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    try {
                        str2 = optJSONArray.getString(i4);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = TextUtils.isEmpty(str3) ? str3 + str2 : str3 + "," + str2;
                    }
                }
                if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
                    AVMDLLog.d("BatchParseHTTPDNSHosts", "parse result is null");
                } else {
                    AVMDLLog.d("BatchParseHTTPDNSHosts", a.a("parse result host:%s ips:%s expiredT:%d", new Object[]{str, str3, Long.valueOf(j2)}));
                    return new AVMDLDNSInfo(this.mHttpDNSType, str, str3, j2, this.mId);
                }
            }
        }
        return null;
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLLog.d("BatchParseHTTPDNSHosts", a.a("****http dns id:%s type:%d", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType)}));
        if (error != null) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", a.a("handle response receive err:%s", new Object[]{error.errStr}));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", a.a("json null err", new Object[0]));
        } else {
            try {
                parseResult(jSONObject);
            } catch (Throwable th) {
                AVMDLLog.d("BatchParseHTTPDNSHosts", a.a("handle response exception:%s", new Object[]{th.toString()}));
            }
            AVMDLLog.d("BatchParseHTTPDNSHosts", a.a("****parse end", new Object[0]));
        }
    }

    public HTTPDNSHosts(String[] strArr, AVMDLNetClient aVMDLNetClient, int i2, Handler handler) {
        if (i2 != 2) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", "create fail type is not own");
            throw new Exception("type is not own");
        } else if (strArr == null || strArr.length == 0) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", "host array is valid");
            throw new Exception("host array is valid");
        } else {
            this.mHttpDNSType = i2;
            this.mHostnames = strArr;
            this.mNetClient = aVMDLNetClient;
            if (aVMDLNetClient == null) {
                this.mNetClient = new AVMDLHTTPNetwork();
            }
            this.mHttpDNSType = i2;
            this.mHandler = handler;
        }
    }
}
