package com.ss.android.ugc.aweme.bullet.f;

import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.utils.fd;
import h.a.n;
import h.f.b.l;
import h.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final CommonApi f69299a = ((CommonApi) RetrofitFactory.a().a(Api.f66569d).a(CommonApi.class));

    static {
        Covode.recordClassIndex(42729);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f69300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f69301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69302c;

        static {
            Covode.recordClassIndex(42730);
        }

        a(d dVar, Map map, String str) {
            this.f69300a = dVar;
            this.f69301b = map;
            this.f69302c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public a call() {
            try {
                ArrayList arrayList = new ArrayList();
                Map map = this.f69301b;
                if (map != null && (!map.isEmpty())) {
                    for (Map.Entry entry : this.f69301b.entrySet()) {
                        arrayList.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                T t = this.f69300a.f69299a.doGet(this.f69302c, Collections.emptyMap(), arrayList).execute().f42630b;
                l.b(t, "");
                Charset charset = h.m.d.f158808a;
                if (t != null) {
                    byte[] bytes = t.getBytes(charset);
                    l.b(bytes, "");
                    return new a(true, bytes, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                return new a(false, null, th);
            }
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f69304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ JSONObject f69307d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f69308e;

        static {
            Covode.recordClassIndex(42732);
        }

        c(d dVar, String str, String str2, JSONObject jSONObject, Map map) {
            this.f69304a = dVar;
            this.f69305b = str;
            this.f69306c = str2;
            this.f69307d = jSONObject;
            this.f69308e = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public a call() {
            T t;
            ArrayList arrayList;
            try {
                if (this.f69305b != null) {
                    fd fdVar = fd.f142903a;
                    String str = this.f69306c;
                    JSONObject jSONObject = this.f69307d;
                    String str2 = this.f69305b;
                    Map map = this.f69308e;
                    if (map != null) {
                        ArrayList arrayList2 = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            arrayList2.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    t = fdVar.b(str, jSONObject, str2, n.g((Collection) arrayList));
                } else {
                    Map<String, String> hashMap = new HashMap<>();
                    JSONObject jSONObject2 = this.f69307d;
                    if (jSONObject2 != null) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString = this.f69307d.optString(next, "");
                            l.b(next, "");
                            l.b(optString, "");
                            hashMap.put(next, optString);
                        }
                    }
                    T t2 = this.f69304a.f69299a.doPost(this.f69306c, hashMap).execute().f42630b;
                    l.b(t2, "");
                    t = t2;
                }
                Charset charset = h.m.d.f158808a;
                if (t != null) {
                    byte[] bytes = t.getBytes(charset);
                    l.b(bytes, "");
                    return new a(true, bytes, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                return new a(false, null, th);
            }
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f69303a;

        static {
            Covode.recordClassIndex(42731);
        }

        b(i.a aVar) {
            this.f69303a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            a aVar = (a) iVar.d();
            if (aVar.f69294a) {
                i.a aVar2 = this.f69303a;
                i.c cVar = new i.c();
                byte[] bArr = aVar.f69295b;
                if (bArr == null) {
                    l.b();
                }
                cVar.f33236a = bArr;
                cVar.f33238c = new HashMap();
                aVar2.a(cVar);
            } else {
                i.a aVar3 = this.f69303a;
                Throwable th = aVar.f69296c;
                if (th == null) {
                    l.b();
                }
                aVar3.a(th);
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.d$d  reason: collision with other inner class name */
    static final class C1564d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f69309a;

        static {
            Covode.recordClassIndex(42733);
        }

        C1564d(i.a aVar) {
            this.f69309a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            a aVar = (a) iVar.d();
            if (aVar.f69294a) {
                i.a aVar2 = this.f69309a;
                i.c cVar = new i.c();
                byte[] bArr = aVar.f69295b;
                if (bArr == null) {
                    l.b();
                }
                cVar.f33236a = bArr;
                cVar.f33238c = new HashMap();
                aVar2.a(cVar);
            } else {
                i.a aVar3 = this.f69309a;
                Throwable th = aVar.f69296c;
                if (th == null) {
                    l.b();
                }
                aVar3.a(th);
            }
            return z.f158842a;
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
        b.i.b(new a(this, map, str), b.i.f4824a).a(new b(aVar), b.i.f4826c, null);
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
        b.i.b(new c(this, str2, str, jSONObject, map), b.i.f4824a).a(new C1564d(aVar), b.i.f4826c, null);
    }
}
