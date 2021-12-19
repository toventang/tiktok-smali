package com.bytedance.android.monitor.lynx.jsb;

import android.content.Context;
import com.bytedance.android.monitor.l.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.d;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.w;
import org.json.JSONObject;

public final class LynxMonitorModule extends LynxModule {
    public static final a Companion = new a((byte) 0);
    private final f gson = new f();

    static {
        Covode.recordClassIndex(14026);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14027);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final JSONObject convertJson(ReadableMap readableMap) {
        JSONObject jSONObject = null;
        if (readableMap == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(this.gson.b(readableMap));
            return jSONObject;
        } catch (Throwable unused) {
            b.a();
            return jSONObject;
        }
    }

    private final com.bytedance.android.monitor.lynx.c.a.f getError(ReadableMap readableMap) {
        com.bytedance.android.monitor.lynx.c.a.f fVar = new com.bytedance.android.monitor.lynx.c.a.f();
        try {
            fVar.f23646b = "lynx_error_custom";
            fVar.f23647c = 201;
            fVar.f23648d = String.valueOf(convertJson(readableMap));
            return fVar;
        } catch (Exception unused) {
            b.a();
            return fVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxMonitorModule(Context context, Object obj) {
        super(context, obj);
        l.c(context, "");
        l.c(obj, "");
    }

    @d
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        if (readableMap != null && this.mParam != null) {
            WritableMap b2 = com.lynx.jsbridge.a.b();
            b2.putInt("errorCode", -1);
            if (this.mParam instanceof a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((a) obj).f23663a;
                    if (lynxView != null) {
                        com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, getError(readableMap));
                        b2.putInt("errorCode", 0);
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            if (callback != null) {
                callback.invoke(b2);
            }
        }
    }

    @d
    public final void customReport(ReadableMap readableMap, Callback callback) {
        boolean z;
        if (readableMap != null && this.mParam != null) {
            WritableMap b2 = com.lynx.jsbridge.a.b();
            b2.putInt("errorCode", -1);
            if (this.mParam instanceof a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((a) obj).f23663a;
                    if (lynxView != null) {
                        try {
                            String string = readableMap.getString("eventName", "");
                            ReadableMap map = readableMap.getMap("category");
                            ReadableMap map2 = readableMap.getMap("metrics");
                            ReadableMap map3 = readableMap.getMap("timing");
                            ReadableMap map4 = readableMap.getMap("extra");
                            int i2 = readableMap.getInt("canSample", 1);
                            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                            String templateUrl = lynxView.getTemplateUrl();
                            JSONObject convertJson = convertJson(map);
                            JSONObject convertJson2 = convertJson(map2);
                            JSONObject convertJson3 = convertJson(map4);
                            JSONObject convertJson4 = convertJson(map3);
                            if (i2 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bVar.a(lynxView, string, templateUrl, convertJson, convertJson2, convertJson3, convertJson4, null, z);
                            b2.putInt("errorCode", 0);
                        } catch (Exception e2) {
                            b2.putString("errorMessage", "cause: " + e2.getMessage());
                            b.a();
                        }
                    } else {
                        b2.putString("errorMessage", "view is empty.");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                b2.putString("errorMessage", "mParam is not MonitorViewProvider.");
            }
            if (callback != null) {
                callback.invoke(b2);
            }
        }
    }
}
