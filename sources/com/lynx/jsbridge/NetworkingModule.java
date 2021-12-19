package com.lynx.jsbridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.g;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.provider.d;
import com.lynx.tasm.provider.e;
import com.lynx.tasm.provider.f;
import com.lynx.tasm.provider.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class NetworkingModule extends LynxModule implements g.a {
    private WeakReference<Handler> mHandler = new WeakReference<>(new g(Looper.getMainLooper(), this));

    static {
        Covode.recordClassIndex(34750);
    }

    @Override // com.lynx.jsbridge.g.a
    public final void handleMsg(Message message) {
    }

    public NetworkingModule(Context context) {
        super(context);
    }

    @d
    public final void request(final ReadableMap readableMap, final Callback callback) {
        if (this.mHandler.get() != null) {
            this.mHandler.get().post(new Runnable() {
                /* class com.lynx.jsbridge.NetworkingModule.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34751);
                }

                public final void run() {
                    try {
                        k kVar = LynxEnv.b().f55533c;
                        e eVar = new e(readableMap.getString("url"));
                        if (readableMap.hasKey("method")) {
                            eVar.f56812b = readableMap.getString("method");
                        }
                        if (readableMap.hasKey("dataType")) {
                            eVar.f56814d = readableMap.getString("dataType");
                        }
                        if (readableMap.hasKey("responseType")) {
                            eVar.f56815e = readableMap.getString("responseType");
                        }
                        if (readableMap.hasKey("data")) {
                            eVar.f56816f = readableMap.getDynamic("data").e();
                        }
                        if (readableMap.hasKey("header")) {
                            try {
                                HashMap hashMap = new HashMap();
                                JSONObject jSONObject = new JSONObject(readableMap.getString("header"));
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, jSONObject.getString(next));
                                }
                                eVar.f56813c = hashMap;
                            } catch (Throwable unused) {
                            }
                        }
                        kVar.a(eVar, new d() {
                            /* class com.lynx.jsbridge.NetworkingModule.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(34752);
                            }

                            @Override // com.lynx.tasm.provider.d
                            public final void onFailed(f fVar) {
                                callback.invoke(fVar.f56818b);
                            }

                            @Override // com.lynx.tasm.provider.d
                            public final void onSuccess(f fVar) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("statusCode", fVar.f56817a);
                                    jSONObject.put("header", fVar.f56819c.toString());
                                    jSONObject.put("data", com.lynx.tasm.utils.k.a(fVar.f56820d));
                                    callback.invoke(jSONObject.toString());
                                } catch (Exception e2) {
                                    callback.invoke(e2.toString());
                                }
                            }
                        });
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }
}
