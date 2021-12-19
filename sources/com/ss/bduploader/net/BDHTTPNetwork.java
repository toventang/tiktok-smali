package com.ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.net.BDVNetClient;
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

public class BDHTTPNetwork extends BDVNetClient {
    public static final MediaType JSON = MediaType.parse("application/json");
    private static OkHttpClient mClient;
    private Call mCall;

    static {
        Covode.recordClassIndex(100675);
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void cancel() {
        Call call = this.mCall;
        if (call != null && !call.isCanceled()) {
            this.mCall.cancel();
        }
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void startTask(String str, Map<String, String> map, final BDVNetClient.CompletionListener completionListener) {
        MethodCollector.i(3268);
        synchronized (BDHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
                }
            } catch (Throwable th) {
                MethodCollector.o(3268);
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
            /* class com.ss.bduploader.net.BDHTTPNetwork.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100676);
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
        MethodCollector.o(3268);
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i2, final BDVNetClient.CompletionListener completionListener) {
        MethodCollector.i(3615);
        synchronized (BDHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
                }
            } catch (Throwable th) {
                MethodCollector.o(3615);
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
            /* class com.ss.bduploader.net.BDHTTPNetwork.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100677);
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
        MethodCollector.o(3615);
    }
}
