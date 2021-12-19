package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.INetworkApi;
import com.google.gson.f;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.settings.ad;
import com.ss.android.ugc.aweme.settings.ae;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class SendAnalyticsEventMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91162a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f91163b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f91164c;

    static {
        Covode.recordClassIndex(57369);
    }

    private SendAnalyticsEventMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57370);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ SendAnalyticsEventMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class b implements d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91165a;

        static {
            Covode.recordClassIndex(57371);
        }

        b(BaseCommonJavaMethod.a aVar) {
            this.f91165a = aVar;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, u<String> uVar) {
            T t;
            BaseCommonJavaMethod.a aVar = this.f91165a;
            if (aVar != null) {
                if (uVar != null) {
                    t = uVar.f42630b;
                } else {
                    t = null;
                }
                aVar.a((Object) t);
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            String str;
            BaseCommonJavaMethod.a aVar = this.f91165a;
            if (aVar != null) {
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                aVar.a(1, str);
            }
        }
    }

    public static final class c implements d<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91166a;

        static {
            Covode.recordClassIndex(57372);
        }

        c(BaseCommonJavaMethod.a aVar) {
            this.f91166a = aVar;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, u<String> uVar) {
            T t;
            BaseCommonJavaMethod.a aVar = this.f91166a;
            if (aVar != null) {
                if (uVar != null) {
                    t = uVar.f42630b;
                } else {
                    t = null;
                }
                aVar.a((Object) t);
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
            String str;
            BaseCommonJavaMethod.a aVar = this.f91166a;
            if (aVar != null) {
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                aVar.a(1, str);
            }
        }
    }

    public SendAnalyticsEventMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        String str;
        ad a2 = ae.a();
        List<String> list = null;
        if (a2 != null) {
            str = a2.f123085a;
        } else {
            str = null;
        }
        this.f91163b = str;
        ad a3 = ae.a();
        this.f91164c = a3 != null ? a3.f123086b : list;
    }

    private static Map<String, String> a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            l.b(next, "");
            linkedHashMap.put(next, jSONObject.get(next).toString());
        }
        return linkedHashMap;
    }

    private static List<com.bytedance.retrofit2.client.b> b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(new com.bytedance.retrofit2.client.b(next, jSONObject.getString(next)));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (jSONObject != null) {
            String optString = jSONObject.optString("path");
            l.b(optString, "");
            List<String> list = this.f91164c;
            if (list != null && list.contains(optString)) {
                String optString2 = jSONObject.optString("method");
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                f fVar = new f();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                if (optJSONObject2 != null) {
                    str = optJSONObject2.toString();
                } else {
                    str = null;
                }
                o oVar = (o) fVar.a(str, o.class);
                JSONObject optJSONObject3 = jSONObject.optJSONObject("header");
                if (TextUtils.equals(optString2, "GET")) {
                    List<com.bytedance.retrofit2.client.b> b2 = b(optJSONObject3);
                    String str2 = this.f91163b;
                    if (str2 != null && !p.a((CharSequence) str2)) {
                        Map<String, String> a2 = a(optJSONObject);
                        try {
                            List<com.bytedance.retrofit2.client.b> c2 = n.c(new com.bytedance.retrofit2.client.b("X-SS-No-Cookie", "true"));
                            if (b2 != null && !b2.isEmpty()) {
                                c2.addAll(b2);
                            }
                            ((INetworkApi) com.bytedance.ies.ugc.aweme.network.ext.a.b(this.f91163b).a().d().a(INetworkApi.class)).doGet(false, -1, optString, a2, c2, null).enqueue(new b(aVar));
                        } catch (Exception e2) {
                            if (aVar != null) {
                                aVar.a(1, e2.getMessage());
                            }
                        }
                    } else if (aVar != null) {
                        aVar.a(0, "base url is empty!");
                    }
                } else if (TextUtils.equals(optString2, "POST")) {
                    List<com.bytedance.retrofit2.client.b> b3 = b(optJSONObject3);
                    String str3 = this.f91163b;
                    if (str3 != null && !p.a((CharSequence) str3)) {
                        try {
                            List<com.bytedance.retrofit2.client.b> c3 = n.c(new com.bytedance.retrofit2.client.b("X-SS-No-Cookie", "true"));
                            if (b3 != null && !b3.isEmpty()) {
                                c3.addAll(b3);
                            }
                            ((SendAnalyticsEventApi) com.bytedance.ies.ugc.aweme.network.ext.a.b(this.f91163b).a().d().a(SendAnalyticsEventApi.class)).doPost(false, -1, optString, a(optJSONObject), oVar, c3, null).enqueue(new c(aVar));
                        } catch (Exception e3) {
                            if (aVar != null) {
                                aVar.a(1, e3.getMessage());
                            }
                        }
                    } else if (aVar != null) {
                        aVar.a(0, "base url is empty!");
                    }
                } else if (aVar != null) {
                    aVar.a(0, "method is neither GET nor POST");
                }
            } else if (aVar != null) {
                aVar.a(0, "path doesn't match!");
            }
        } else if (aVar != null) {
            aVar.a(0, "no params!");
        }
    }
}
