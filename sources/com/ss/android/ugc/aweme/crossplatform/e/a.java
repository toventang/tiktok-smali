package com.ss.android.ugc.aweme.crossplatform.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.utils.fd;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    static a.c f78812a;

    /* renamed from: b  reason: collision with root package name */
    static final CommonApi f78813b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f78814c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(48891);
        String str = Api.f66569d;
        l.b(str, "");
        f78813b = (CommonApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(CommonApi.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.a$a  reason: collision with other inner class name */
    static final class CallableC1831a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f78815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f78816b;

        static {
            Covode.recordClassIndex(48892);
        }

        CallableC1831a(String str, Map map) {
            this.f78815a = str;
            this.f78816b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d call() {
            String a2 = a.a(this.f78815a);
            a.b bVar = new a.b("get", a.a(this.f78815a), null);
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.f78816b.entrySet()) {
                    arrayList.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                }
                T t = a.f78813b.doGet(a2, (Map<String, String>) null, arrayList).execute().f42630b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("_raw", t);
                jSONObject.put("response", new JSONObject((String) t));
                return new d(bVar, new a.d(jSONObject, null));
            } catch (com.ss.android.http.a.a.b e2) {
                JSONObject jSONObject2 = new JSONObject();
                a.a(jSONObject2, e2.getStatusCode(), e2.getMessage(), "");
                return new d(bVar, new a.d(jSONObject2, e2));
            } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e3.getResponse());
                } catch (JSONException unused) {
                }
                int errorCode = e3.getErrorCode();
                String errorMsg = e3.getErrorMsg();
                String prompt = e3.getPrompt();
                l.b(prompt, "");
                a.a(jSONObject3, errorCode, errorMsg, prompt);
                return new d(bVar, new a.d(jSONObject3, e3));
            } catch (Exception e4) {
                JSONObject jSONObject4 = new JSONObject();
                a.a(jSONObject4, -408, e4.getMessage(), "");
                return new d(bVar, new a.d(jSONObject4, e4));
            }
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f78818a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f78819b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f78820c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f78821d;

        static {
            Covode.recordClassIndex(48894);
        }

        c(String str, JSONObject jSONObject, String str2, Map map) {
            this.f78818a = str;
            this.f78819b = jSONObject;
            this.f78820c = str2;
            this.f78821d = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d call() {
            T t;
            ArrayList arrayList;
            String a2 = a.a(this.f78818a);
            a.b bVar = new a.b(UGCMonitor.TYPE_POST, a.a(this.f78818a), this.f78819b);
            try {
                if (this.f78820c != null) {
                    fd fdVar = fd.f142903a;
                    JSONObject jSONObject = this.f78819b;
                    String str = this.f78820c;
                    Map map = this.f78821d;
                    if (map != null) {
                        ArrayList arrayList2 = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            arrayList2.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    t = fdVar.b(a2, jSONObject, str, n.g((Collection) arrayList));
                } else {
                    Map<String, String> hashMap = new HashMap<>();
                    JSONObject jSONObject2 = this.f78819b;
                    if (jSONObject2 != null) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString = this.f78819b.optString(next, "");
                            l.b(next, "");
                            l.b(optString, "");
                            hashMap.put(next, optString);
                        }
                    }
                    q.b(hashMap, true);
                    T t2 = a.f78813b.doPost(this.f78818a, hashMap).execute().f42630b;
                    l.b(t2, "");
                    t = t2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("response", new JSONObject(t));
                jSONObject3.put("_raw", t);
                return new d(bVar, new a.d(jSONObject3, null));
            } catch (com.ss.android.http.a.a.b e2) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("code", 0);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("errCode", e2.getStatusCode());
                    jSONObject5.put("message", e2.getMessage());
                    jSONObject4.put("error", jSONObject5);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                return new d(bVar, new a.d(jSONObject4, e2));
            } catch (Exception e4) {
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject6.put("code", 0);
                    jSONObject6.put("response", new JSONObject(""));
                    jSONObject6.put("_raw", "");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                return new d(bVar, new a.d(jSONObject6, e4));
            }
        }
    }

    public static String a(String str) {
        g gVar = new g(str);
        List<com.ss.android.http.a.b.d> list = gVar.f59389a;
        if (list != null && (!list.isEmpty())) {
            Iterator<com.ss.android.http.a.b.d> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.ss.android.http.a.b.d next = it.next();
                l.b(next, "");
                if (p.a("request_tag_from", next.f59532a, true)) {
                    break;
                }
            }
            String a2 = gVar.a();
            l.b(a2, "");
            return a2;
        }
        gVar.a("request_tag_from", "h5");
        String a22 = gVar.a();
        l.b(a22, "");
        return a22;
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f78817a;

        static {
            Covode.recordClassIndex(48893);
        }

        b(i.a aVar) {
            this.f78817a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            a.d dVar;
            JSONObject jSONObject;
            a.b bVar;
            a.d dVar2;
            a.c cVar = a.f78812a;
            if (cVar != null) {
                l.b(iVar, "");
                if (iVar.a()) {
                    d dVar3 = (d) iVar.d();
                    if (dVar3 != null) {
                        bVar = dVar3.f78840a;
                    } else {
                        bVar = null;
                    }
                    d dVar4 = (d) iVar.d();
                    if (dVar4 != null) {
                        dVar2 = dVar4.f78841b;
                    } else {
                        dVar2 = null;
                    }
                    cVar.a(bVar, dVar2);
                }
            }
            l.b(iVar, "");
            d dVar5 = (d) iVar.d();
            if (!(dVar5 == null || (dVar = dVar5.f78841b) == null || (jSONObject = dVar.f144967a) == null)) {
                Object opt = jSONObject.opt("code");
                if ((opt instanceof Integer) && 1 == ((Integer) opt).intValue()) {
                    i.a aVar = this.f78817a;
                    i.c cVar2 = new i.c();
                    String obj = jSONObject.opt("response").toString();
                    Charset charset = h.m.d.f158808a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = obj.getBytes(charset);
                    l.b(bytes, "");
                    cVar2.f33236a = bytes;
                    cVar2.f33238c = new HashMap();
                    aVar.a(cVar2);
                }
            }
            return null;
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f78822a;

        static {
            Covode.recordClassIndex(48895);
        }

        d(i.a aVar) {
            this.f78822a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            a.d dVar;
            JSONObject jSONObject;
            a.b bVar;
            a.d dVar2;
            a.c cVar = a.f78812a;
            if (cVar != null) {
                l.b(iVar, "");
                d dVar3 = (d) iVar.d();
                if (dVar3 != null) {
                    bVar = dVar3.f78840a;
                } else {
                    bVar = null;
                }
                d dVar4 = (d) iVar.d();
                if (dVar4 != null) {
                    dVar2 = dVar4.f78841b;
                } else {
                    dVar2 = null;
                }
                cVar.a(bVar, dVar2);
            }
            l.b(iVar, "");
            d dVar5 = (d) iVar.d();
            if (!(dVar5 == null || (dVar = dVar5.f78841b) == null || (jSONObject = dVar.f144967a) == null)) {
                Object opt = jSONObject.opt("code");
                if ((opt instanceof Integer) && 1 == ((Integer) opt).intValue()) {
                    i.a aVar = this.f78822a;
                    i.c cVar2 = new i.c();
                    String obj = jSONObject.opt("response").toString();
                    Charset charset = h.m.d.f158808a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = obj.getBytes(charset);
                    l.b(bytes, "");
                    cVar2.f33236a = bytes;
                    cVar2.f33238c = new HashMap();
                    aVar.a(cVar2);
                }
            }
            return null;
        }
    }

    @Override // com.bytedance.ies.d.a.i
    public final void b(String str, Map<String, String> map, i.a aVar) {
        l.d(str, "");
        l.d(map, "");
        l.d(aVar, "");
        i.b.a(this, str, map, aVar);
    }

    @Override // com.bytedance.ies.d.a.i
    public final void a(String str, Map<String, String> map, i.a aVar) {
        l.d(str, "");
        l.d(map, "");
        l.d(aVar, "");
        b.i.b(new CallableC1831a(str, map), b.i.f4824a).a(new b(aVar), b.i.f4826c, null);
    }

    public static void a(JSONObject jSONObject, int i2, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errCode", i2);
                jSONObject2.put("prompts", str2);
                if (str != null) {
                    jSONObject2.put("message", str);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.bytedance.ies.d.a.i
    public final void b(String str, Map<String, String> map, String str2, JSONObject jSONObject, i.a aVar) {
        l.d(str, "");
        l.d(map, "");
        l.d(str2, "");
        l.d(jSONObject, "");
        l.d(aVar, "");
        i.b.a(this, str, map, str2, jSONObject, aVar);
    }

    @Override // com.bytedance.ies.d.a.i
    public final void a(String str, Map<String, String> map, String str2, JSONObject jSONObject, i.a aVar) {
        l.d(str, "");
        l.d(map, "");
        l.d(str2, "");
        l.d(jSONObject, "");
        l.d(aVar, "");
        b.i.b(new c(str, jSONObject, str2, map), b.i.f4824a).a(new d(aVar), b.i.f4826c, null);
    }
}
