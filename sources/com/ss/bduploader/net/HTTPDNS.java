package com.ss.bduploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.bduploader.BDUploadLog;
import com.ss.bduploader.net.BDVNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

public class HTTPDNS extends BaseDNS {
    private static String mGlobalGoogleDNSParseHost = "";
    private static String mGlobalOwnDNSParseHost = "";
    private static String mGoogleDNSServerPath = "/resolve?name=";
    private static String mTTDNSServerPath = "/q?host=";
    private int mHttpDNSType = 2;
    private Object mSource;
    private long mSourceId;

    @Override // com.ss.bduploader.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    static {
        Covode.recordClassIndex(100692);
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.mHttpDNSType;
        if (i2 == 2 || i2 == 1) {
            sb.append("https://" + mGlobalOwnDNSParseHost + mTTDNSServerPath);
        } else if (i2 == 3) {
            sb.append("https://" + mGlobalGoogleDNSParseHost + mGoogleDNSServerPath);
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new BDVNetClient.CompletionListener() {
                    /* class com.ss.bduploader.net.HTTPDNS.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(100693);
                    }

                    @Override // com.ss.bduploader.net.BDVNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new BDVNetClient.CompletionListener() {
            /* class com.ss.bduploader.net.HTTPDNS.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100694);
            }

            @Override // com.ss.bduploader.net.BDVNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private BDUploadDNSInfo parserResult(JSONObject jSONObject) {
        long j2;
        String str;
        int i2 = this.mHttpDNSType;
        String str2 = "";
        int i3 = 60;
        if (i2 == 2 || i2 == 1) {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                BDUploadLog.d("HTTPDNS", a.a("no ips in json, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
                return null;
            }
            if (jSONObject.has("ttl")) {
                i3 = jSONObject.optInt("ttl");
            }
            j2 = ((long) (i3 * 1000)) + System.currentTimeMillis();
            str = null;
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                try {
                    str = optJSONArray.getString(i4);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + "," + str;
                }
            }
        } else {
            j2 = 0;
            str = null;
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("Answer");
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                    if (jSONObject2.has(StringSet.type) && jSONObject2.getInt(StringSet.type) == 1) {
                        if (jSONObject2.has("TTL")) {
                            i3 = jSONObject2.optInt("TTL");
                        }
                        if (jSONObject2.has("data")) {
                            str = jSONObject2.optString("data");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + "," + str;
                        }
                    }
                }
                j2 = System.currentTimeMillis() + ((long) (i3 * 1000));
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return new BDUploadDNSInfo(this.mHttpDNSType, this.mHostname, str2, j2, this.mId);
    }

    public static void setDNSServerHost(String str, String str2) {
        MethodCollector.i(194);
        synchronized (HTTPDNS.class) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    mGlobalOwnDNSParseHost = str;
                }
                if (!TextUtils.isEmpty(str2)) {
                    mGlobalGoogleDNSParseHost = str2;
                }
            } finally {
                MethodCollector.o(194);
            }
        }
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        BDUploadLog.d("HTTPDNS", a.a("****http dns id:%s", new Object[]{this.mId}));
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(this.mHttpDNSType, this.mHostname, null, 0, this.mId);
        if (error != null) {
            bDUploadDNSInfo.mErrorStr = error.errStr;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            BDUploadLog.d("HTTPDNS", a.a("http dns json is empty type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
        } else {
            BDUploadDNSInfo parserResult = parserResult(jSONObject);
            if (parserResult != null) {
                IPCache.getInstance().put(this.mHostname, parserResult);
                notifySuccess(parserResult);
                return;
            }
        }
        notifyError(bDUploadDNSInfo);
    }

    public HTTPDNS(String str, BDVNetClient bDVNetClient, int i2, Handler handler) {
        super(str, bDVNetClient, handler);
        this.mHttpDNSType = i2;
    }
}
