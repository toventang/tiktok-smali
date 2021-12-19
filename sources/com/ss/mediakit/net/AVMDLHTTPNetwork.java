package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.mediakit.net.AVMDLNetClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

public class AVMDLHTTPNetwork extends AVMDLNetClient {
    public static final MediaType JSON = MediaType.parse("application/json");
    private static OkHttpClient mClient;
    private Call mCall;

    static {
        Covode.recordClassIndex(101138);
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public void cancel() {
        Call call = this.mCall;
        if (call != null && !call.isCanceled()) {
            this.mCall.cancel();
        }
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public void startTask(String str, Map<String, String> map, final AVMDLNetClient.CompletionListener completionListener) {
        MethodCollector.i(1125);
        synchronized (AVMDLHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
                }
            } catch (Throwable th) {
                MethodCollector.o(1125);
                throw th;
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                url.header(str2, map.get(str2));
            }
        }
        Call newCall = mClient.newCall(url.build());
        this.mCall = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.mediakit.net.AVMDLHTTPNetwork.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101139);
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                JSONObject jSONObject;
                Exception e2;
                ResponseBody body = response.body();
                try {
                    jSONObject = new JSONObject(body.string());
                    e2 = null;
                    try {
                        if (!response.isSuccessful()) {
                            e2 = new Exception("http fail");
                            response.code();
                        }
                    } catch (Throwable th) {
                        if (body != null) {
                            try {
                                body.close();
                                throw th;
                            } catch (Exception unused) {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    jSONObject = null;
                }
                if (body != null) {
                    try {
                        body.close();
                    } catch (Exception unused2) {
                    }
                }
                if (e2 == null) {
                    completionListener.onCompletion(jSONObject, null);
                } else {
                    completionListener.onCompletion(jSONObject, new Error(0, null, null, e2.toString()));
                }
            }
        });
        MethodCollector.o(1125);
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i2, final AVMDLNetClient.CompletionListener completionListener) {
        MethodCollector.i(1130);
        synchronized (AVMDLHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
                }
            } catch (Throwable th) {
                MethodCollector.o(1130);
                throw th;
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                url.addHeader(str2, map.get(str2));
            }
        }
        if (i2 == 1) {
            url.post(RequestBody.create(JSON, String.valueOf(jSONObject)));
        }
        Call newCall = mClient.newCall(url.build());
        this.mCall = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.mediakit.net.AVMDLHTTPNetwork.AnonymousClass2 */

            static {
                Covode.recordClassIndex(101140);
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                JSONObject jSONObject;
                String str;
                ResponseBody body = response.body();
                try {
                    jSONObject = new JSONObject(body.string());
                    str = null;
                } catch (Exception e2) {
                    str = e2.toString();
                    e2.printStackTrace();
                    jSONObject = null;
                } catch (Throwable th) {
                    if (body != null) {
                        try {
                            body.close();
                            throw th;
                        } catch (Exception unused) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                }
                if (!response.isSuccessful()) {
                    str = response.message();
                    response.code();
                }
                if (body != null) {
                    try {
                        body.close();
                    } catch (Exception unused2) {
                    }
                }
                if (str == null) {
                    completionListener.onCompletion(jSONObject, null);
                } else {
                    completionListener.onCompletion(jSONObject, new Error(0, null, null, str.toString()));
                }
            }
        });
        MethodCollector.o(1130);
    }
}
