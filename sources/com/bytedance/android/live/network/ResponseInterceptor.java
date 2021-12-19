package com.bytedance.android.live.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.m;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.network.response.e;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.u;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class ResponseInterceptor implements a {
    static {
        Covode.recordClassIndex(6617);
    }

    ResponseInterceptor() {
    }

    private static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private u a(a.AbstractC1036a aVar) {
        Request a2 = a(aVar.a());
        u a3 = aVar.a(a2);
        a(a2, a3);
        return a3;
    }

    private static String a(u uVar) {
        List<b> b2 = uVar.f42629a.b("X-Tt-Logid");
        if (b2 == null || b2.size() <= 0) {
            return "";
        }
        return b2.get(0).f42472b;
    }

    private static Request a(Request request) {
        if (!LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
            return request;
        }
        l.d(request, "");
        a.EnumC0254a remove = m.f12131b.remove(m.a.a(request));
        if (remove == null || !m.a.a().optBoolean(remove.key, false)) {
            return request;
        }
        LinkedList linkedList = new LinkedList(request.getHeaders());
        linkedList.add(new b("response-format", "protobuf"));
        Request.a newBuilder = request.newBuilder();
        newBuilder.f42460c = linkedList;
        return newBuilder.a();
    }

    @Override // com.bytedance.retrofit2.c.a
    public u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof com.ss.android.ugc.aweme.bs.b)) {
            return a(aVar);
        }
        com.ss.android.ugc.aweme.bs.b bVar = (com.ss.android.ugc.aweme.bs.b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }

    private static String a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", str);
            jSONObject2.put("data", jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2.toString();
    }

    private static void a(Request request, u uVar) {
        c cVar;
        int i2;
        int i3;
        String str;
        if (!(uVar == null || request == null || (cVar = uVar.f42629a) == null || (i2 = cVar.f42474b) != 200)) {
            T t = uVar.f42630b;
            String url = request.getUrl();
            String a2 = y.a((int) R.string.gwg);
            if (t instanceof e) {
                T t2 = t;
                i3 = t2.f12156a;
                if (t2.f12157b instanceof Room) {
                    a2 = t2.f12157b.message;
                }
            } else if (t instanceof d) {
                i3 = ((d) t).statusCode;
            } else if (t instanceof com.bytedance.android.live.network.response.c) {
                i3 = ((com.bytedance.android.live.network.response.c) t).f12144a;
            } else {
                if (t instanceof com.bytedance.android.live.core.e.a.c) {
                    com.bytedance.android.live.core.e.a.b bVar = t.f9009c;
                    if (bVar != null) {
                        i3 = bVar.f9004a;
                        a2 = bVar.f9005b;
                    }
                } else if (t instanceof com.bytedance.android.live.core.e.a.a) {
                    com.bytedance.android.live.core.e.a.b bVar2 = t.f9003c;
                    if (bVar2 != null) {
                        i3 = bVar2.f9004a;
                        a2 = bVar2.f9005b;
                    }
                } else if (t instanceof com.bytedance.android.live.network.response.a) {
                    i3 = t.f12144a;
                } else if (t instanceof com.bytedance.android.live.network.response.b) {
                    i3 = t.statusCode;
                } else if (t instanceof String) {
                    T t3 = t;
                    if (TextUtils.isEmpty(t3)) {
                        JSONObject a3 = a((String) t3);
                        if (a3 == null) {
                            i3 = -1;
                            a2 = "";
                        } else {
                            i3 = a3.optInt("status_code", -1);
                            a2 = a3.optString("message", "");
                        }
                    }
                }
                i3 = 0;
            }
            if (i3 == 0) {
                Uri parse = Uri.parse(url);
                if (com.bytedance.android.live.network.model.a.f12138b != null && com.bytedance.android.live.network.model.a.f12138b.contains(parse.getPath())) {
                    JSONObject jSONObject = new JSONObject();
                    a(jSONObject, "code", i2);
                    a(jSONObject, "status_code", i3);
                    a(jSONObject, "xLogId", a(uVar));
                    a(jSONObject, "host", parse.getHost());
                    a(jSONObject, "path", parse.getPath());
                    com.bytedance.android.live.core.d.c.a("ttlive_network_request_all", 0, jSONObject);
                }
            } else {
                try {
                    Uri parse2 = Uri.parse(url);
                    if (!(com.bytedance.android.live.network.model.a.f12137a == null || com.bytedance.android.live.network.model.a.f12137a.a() == null || !com.bytedance.android.live.network.model.a.f12137a.a().contains(parse2.getPath()))) {
                    }
                } catch (Exception unused) {
                }
                List<b> list = cVar.f42476d;
                if (list == null || list.isEmpty()) {
                    str = "";
                } else {
                    str = "";
                    for (b bVar3 : list) {
                        if (bVar3 != null && "x-tt-Logid".equalsIgnoreCase(bVar3.f42471a)) {
                            str = bVar3.f42472b;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                a(jSONObject2, "xLogId", str);
                a(jSONObject2, "code", i2);
                a(jSONObject2, "status_code", i3);
                a(jSONObject2, "url", url);
                a(jSONObject2, "message", a2);
                a(jSONObject2, "classes", "com.bytedance.android.livesdk.network.ResponseInterceptor");
                com.bytedance.android.live.core.c.a.a(3, "ttlive_net", a("ttlive_net", jSONObject2));
                JSONObject jSONObject3 = new JSONObject();
                a(jSONObject3, "xLogId", str);
                a(jSONObject3, "code", i2);
                a(jSONObject3, "status_code", i3);
                try {
                    Uri parse3 = Uri.parse(url);
                    a(jSONObject3, "host", parse3.getHost());
                    a(jSONObject3, "path", parse3.getPath());
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.b(e2.getMessage());
                }
                a(jSONObject3, "message", a2);
                com.bytedance.android.live.core.d.c.b("ttlive_network_request_error", 1, jSONObject3);
            }
        }
        T t4 = uVar.f42630b;
        if (t4 instanceof e) {
            T t5 = t4;
            if (t5.f12156a != 0) {
                if (t5.f12159d == null) {
                    t5.f12159d = new RequestError();
                }
                t5.f12159d.url = request.getUrl();
                t5.f12159d.message = t5.f12157b.message;
                t5.f12159d.prompts = t5.f12157b.prompts;
                com.bytedance.android.live.network.c.a.a(t5.f12156a, t5.f12159d, e.a.f9628b.b(t5.f12158c), a(uVar));
            }
        } else if (t4 instanceof d) {
            T t6 = t4;
            if (((d) t6).statusCode != 0) {
                if (((d) t6).error == null) {
                    ((d) t6).error = new RequestError();
                }
                ((d) t6).error.url = request.getUrl();
                int i4 = ((d) t6).statusCode;
                RequestError requestError = ((d) t6).error;
                Extra extra = ((d) t6).extra;
                String a4 = a(uVar);
                Object obj = ((d) t6).data;
                if (requestError == null) {
                    requestError = new RequestError();
                    requestError.prompts = y.a((int) R.string.gwg);
                }
                throw new com.bytedance.android.live.network.model.b(i4, requestError.url, a4).setErrorMsg(requestError.message).setPrompt(requestError.prompts).setAlert(requestError.alert).setExtra(e.a.f9628b.b(extra)).setData(obj);
            }
        } else if (t4 instanceof com.bytedance.android.live.network.response.c) {
            T t7 = t4;
            if (((com.bytedance.android.live.network.response.c) t7).f12144a != 0) {
                if (((com.bytedance.android.live.network.response.c) t7).f12147d == null) {
                    ((com.bytedance.android.live.network.response.c) t7).f12147d = new RequestError();
                }
                ((com.bytedance.android.live.network.response.c) t7).f12147d.url = request.getUrl();
                com.bytedance.android.live.network.c.a.a(((com.bytedance.android.live.network.response.c) t7).f12144a, ((com.bytedance.android.live.network.response.c) t7).f12147d, ((com.bytedance.android.live.network.response.c) t7).f12146c, a(uVar));
            }
        } else if (t4 instanceof com.bytedance.android.live.core.e.a.c) {
            T t8 = t4;
            if (!(TextUtils.equals(t8.f9008b, "success") || t8.f9009c == null)) {
                t8.f9009c.f9006c = request.getUrl();
                com.bytedance.android.live.network.c.a.a(t8.f9009c.f9004a, t8.f9009c, a(uVar));
            }
        } else if (t4 instanceof com.bytedance.android.live.core.e.a.a) {
            T t9 = t4;
            if (!(TextUtils.equals(t9.f9002b, "success") || t9.f9003c == null)) {
                t9.f9003c.f9006c = request.getUrl();
                com.bytedance.android.live.network.c.a.a(t9.f9003c.f9004a, t9.f9003c, a(uVar));
            }
        } else if (t4 instanceof com.bytedance.android.live.network.response.a) {
            T t10 = t4;
            if (t10.f12144a != 0) {
                if (t10.f12147d == null) {
                    t10.f12147d = new RequestError();
                }
                t10.f12147d.url = request.getUrl();
                com.bytedance.android.live.network.c.a.a(t10.f12144a, t10.f12147d, t10.f12146c, a(uVar));
            } else if (t10.f12145b == null) {
                throw new com.bytedance.android.live.a.a.a.c();
            }
        } else if (t4 instanceof com.bytedance.android.live.network.response.b) {
            T t11 = t4;
            if (t11.statusCode != 0) {
                if (t11.error == null) {
                    t11.error = new RequestError();
                }
                t11.error.url = request.getUrl();
                com.bytedance.android.live.network.c.a.a(t11.statusCode, t11.error, t11.extra, a(uVar));
            } else if (t11.data == null) {
                throw new com.bytedance.android.live.a.a.a.c(t11);
            }
        } else if (t4 instanceof String) {
            T t12 = t4;
            if (!com.bytedance.common.utility.m.a((String) t12)) {
                JSONObject jSONObject4 = new JSONObject((String) t12);
                if (!jSONObject4.has("data")) {
                    throw new com.bytedance.android.live.a.a.a.c();
                } else if (!jSONObject4.has("status_code") || jSONObject4.optInt("status_code") != 0) {
                    JSONObject optJSONObject = jSONObject4.optJSONObject("data");
                    throw new com.bytedance.android.live.a.a.b.a(jSONObject4.optInt("status_code")).setErrorMsg(optJSONObject.optString("message", "")).setPrompt(optJSONObject.optString("prompts", "")).setExtra(jSONObject4.optString("extra", "")).setAlert(optJSONObject.optString("alert", ""));
                }
            } else {
                throw new com.bytedance.android.live.a.a.a.b();
            }
        }
    }

    private static void a(JSONObject jSONObject, String str, int i2) {
        try {
            jSONObject.put(str, i2);
        } catch (Exception unused) {
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
