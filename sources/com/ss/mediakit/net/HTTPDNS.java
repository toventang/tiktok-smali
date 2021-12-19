package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

public class HTTPDNS extends BaseDNS {
    private static String mGoogleDNSServer = "/resolve?name=";
    private static String mTTDNSServer = "/q?host=";
    private int mHttpDNSType = 2;
    private Object mSource;
    private long mSourceId;

    static {
        Covode.recordClassIndex(101160);
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.mHttpDNSType;
        if (i2 == 2 || i2 == 1) {
            sb.append("https://" + AVMDLDNSParser.mGlobalOwnDNSParseHost + mTTDNSServer);
        } else if (i2 == 3) {
            sb.append("https://" + AVMDLDNSParser.mGlobalGoogleDNSParseHost + mGoogleDNSServer);
        }
        sb.append(this.mHostname);
        int i3 = this.mHttpDNSType;
        if (i3 == 2 || i3 == 1) {
            sb.append("&source=vod");
        }
        return sb.toString();
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        AVMDLLog.d("HTTPDNS", "http dns url:".concat(String.valueOf(_getURL)));
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() {
                    /* class com.ss.mediakit.net.HTTPDNS.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101161);
                    }

                    @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() {
            /* class com.ss.mediakit.net.HTTPDNS.AnonymousClass2 */

            static {
                Covode.recordClassIndex(101162);
            }

            @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private AVMDLDNSInfo parserResult(JSONObject jSONObject) {
        long j2;
        String str;
        int i2 = this.mHttpDNSType;
        String str2 = "";
        int i3 = 60;
        if (i2 != 2 && i2 != 1) {
            j2 = 0;
            str = null;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        } else {
            if (jSONObject.has("ttl")) {
                i3 = jSONObject.optInt("ttl");
            }
            AVMDLLog.d("HTTPDNS", a.a("receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(i3), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
            if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                i3 = AVMDLDNSParser.mGlobalForceExpiredTime;
            }
            j2 = System.currentTimeMillis() + ((long) (i3 * 1000));
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
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
                AVMDLLog.d("HTTPDNS", a.a("receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(i3), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                    i3 = AVMDLDNSParser.mGlobalForceExpiredTime;
                }
                j2 = System.currentTimeMillis() + ((long) (i3 * 1000));
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, str2, j2, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLLog.d("HTTPDNS", a.a("****http dns id:%s type:%d host:%s", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType), this.mHostname}));
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, (String) null, 0, this.mId);
        if (error != null) {
            aVMDLDNSInfo.mErrorStr = error.errStr;
            AVMDLLog.d("HTTPDNS", a.a("handle response receive err:%s", new Object[]{error.errStr}));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            new Error(this.mHttpDNSType, this.mHostname, this.mId, a.a("HTTP dns empty, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
            AVMDLLog.d("HTTPDNS", a.a("json null err", new Object[0]));
        } else {
            try {
                AVMDLDNSInfo parserResult = parserResult(jSONObject);
                if (parserResult == null) {
                    AVMDLLog.d("HTTPDNS", a.a("info null err", new Object[0]));
                } else {
                    AVMDLLog.d("HTTPDNS", a.a("****parse suc for host:%s iplist:%s", new Object[]{this.mHostname, parserResult.mIpList}));
                    IPCache.getInstance().put(this.mHostname, parserResult);
                    notifySuccess(parserResult);
                    return;
                }
            } catch (Throwable th) {
                AVMDLLog.d("HTTPDNS", a.a("handle response exception:%s", new Object[]{th.toString()}));
            }
        }
        AVMDLLog.d("HTTPDNS", a.a("****parse failed for host:%s", new Object[]{this.mHostname}));
        notifyError(aVMDLDNSInfo);
    }

    public HTTPDNS(String str, AVMDLNetClient aVMDLNetClient, int i2, Handler handler) {
        super(str, aVMDLNetClient, handler);
        this.mHttpDNSType = i2;
    }
}
