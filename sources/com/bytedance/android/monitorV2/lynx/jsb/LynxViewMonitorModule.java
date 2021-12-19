package com.bytedance.android.monitorV2.lynx.jsb;

import android.content.Context;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.android.monitorV2.l.c;
import com.bytedance.android.monitorV2.l.e;
import com.bytedance.android.monitorV2.lynx.c.b.e;
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
import java.util.Map;
import org.json.JSONObject;

public final class LynxViewMonitorModule extends LynxModule {
    public static final a Companion = new a((byte) 0);
    private final f gson = new f();

    static {
        Covode.recordClassIndex(14209);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14210);
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
            c.a();
            return jSONObject;
        }
    }

    private final e getError(ReadableMap readableMap) {
        e eVar = new e();
        try {
            eVar.f24119b = "lynx_error_custom";
            eVar.f24120c = 201;
            eVar.f24121d = String.valueOf(convertJson(readableMap));
            return eVar;
        } catch (Exception unused) {
            c.a();
            return eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxViewMonitorModule(Context context, Object obj) {
        super(context, obj);
        l.c(context, "");
        l.c(obj, "");
    }

    @d
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        b.b("LynxViewMonitorModule", "reportJSError");
        if (readableMap != null && this.mParam != null) {
            WritableMap b2 = com.lynx.jsbridge.a.b();
            b2.putInt("errorCode", -1);
            if (this.mParam instanceof a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((a) obj).f24137a;
                    if (lynxView != null) {
                        com.bytedance.android.monitorV2.lynx.c.f24075j.a(lynxView, getError(readableMap));
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
    public final void config(ReadableMap readableMap, Callback callback) {
        b.b("LynxViewMonitorModule", "config");
        if (this.mParam != null) {
            WritableMap b2 = com.lynx.jsbridge.a.b();
            b2.putInt("errorCode", -1);
            if (this.mParam instanceof a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((a) obj).f24137a;
                    if (lynxView != null) {
                        if (readableMap != null && readableMap.hasKey("bid")) {
                            String string = readableMap.getString("bid");
                            com.bytedance.android.monitorV2.lynx.c cVar = com.bytedance.android.monitorV2.lynx.c.f24075j;
                            l.a((Object) string, "");
                            cVar.a(lynxView, string);
                        }
                        com.bytedance.android.monitorV2.lynx.c cVar2 = com.bytedance.android.monitorV2.lynx.c.f24075j;
                        JSONObject a2 = e.a.a(convertJson(readableMap));
                        l.c(lynxView, "");
                        l.c(a2, "");
                        if (lynxView.getTemplateUrl() != null) {
                            com.bytedance.android.monitorV2.lynx.b.d dVar = cVar2.f24079b;
                            String templateUrl = lynxView.getTemplateUrl();
                            Map<String, JSONObject> map = dVar.f24074a;
                            if (map == null) {
                                throw new w("null cannot be cast to non-null type");
                            } else if (map.containsKey(templateUrl)) {
                                JSONObject b3 = com.bytedance.android.monitorV2.l.f.b(cVar2.f24079b.a(lynxView.getTemplateUrl()), a2);
                                com.bytedance.android.monitorV2.lynx.b.d dVar2 = cVar2.f24079b;
                                String templateUrl2 = lynxView.getTemplateUrl();
                                l.a((Object) b3, "");
                                dVar2.a(templateUrl2, b3);
                            } else {
                                cVar2.f24079b.a(lynxView.getTemplateUrl(), a2);
                            }
                        }
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
        b.b("LynxViewMonitorModule", "customReport");
        if (readableMap != null && this.mParam != null) {
            WritableMap b2 = com.lynx.jsbridge.a.b();
            b2.putInt("errorCode", -1);
            if (this.mParam instanceof a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((a) obj).f24137a;
                    if (lynxView != null) {
                        try {
                            String string = readableMap.getString("eventName", "");
                            ReadableMap map = readableMap.getMap("category");
                            ReadableMap map2 = readableMap.getMap("metrics");
                            ReadableMap map3 = readableMap.getMap("timing");
                            ReadableMap map4 = readableMap.getMap("extra");
                            com.bytedance.android.monitorV2.lynx.c.f24075j.a(lynxView, string, lynxView.getTemplateUrl(), convertJson(map), convertJson(map2), convertJson(map4), convertJson(map3), readableMap.getInt("canSample", 0));
                            b2.putInt("errorCode", 0);
                        } catch (Exception e2) {
                            b2.putString("errorMessage", "cause: " + e2.getMessage());
                            c.a();
                        }
                    } else {
                        b2.putString("errorMessage", "view is empty.");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                b2.putString("errorMessage", "mParam is not LynxViewProvider.");
            }
            if (callback != null) {
                callback.invoke(b2);
            }
        }
    }
}
