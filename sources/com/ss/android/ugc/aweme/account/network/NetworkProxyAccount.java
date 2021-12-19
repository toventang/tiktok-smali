package com.ss.android.ugc.aweme.account.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.u;
import com.google.gson.f;
import f.a.d.g;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class NetworkProxyAccount implements a {

    /* renamed from: a  reason: collision with root package name */
    static final String f65194a = "https://api-va.tiktokv.com";

    /* renamed from: b  reason: collision with root package name */
    public static final NetworkProxyAccount f65195b = new NetworkProxyAccount();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f65196c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final h f65197d = i.a((h.f.a.a) a.f65199a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f65198e = i.a((h.f.a.a) d.f65205a);

    private static IAccountNetworkApi b() {
        return (IAccountNetworkApi) f65197d.getValue();
    }

    private static b c() {
        return (b) f65198e.getValue();
    }

    private NetworkProxyAccount() {
    }

    static final class d extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65205a = new d();

        static {
            Covode.recordClassIndex(40089);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final f a() {
        return com.ss.android.ugc.aweme.a.b().a();
    }

    static final class a extends m implements h.f.a.a<IAccountNetworkApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65199a = new a();

        static {
            Covode.recordClassIndex(40084);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAccountNetworkApi invoke() {
            return com.bytedance.ies.ugc.aweme.network.ext.a.a().a(NetworkProxyAccount.f65194a).a(IAccountNetworkApi.class);
        }
    }

    static {
        Covode.recordClassIndex(40083);
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65200a = new b();

        static {
            Covode.recordClassIndex(40085);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b() {
                /* class com.ss.android.ugc.aweme.account.network.NetworkProxyAccount.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40086);
                }

                @Override // org.a.b
                public final void a_(org.a.c<? super String> cVar) {
                    try {
                        NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f65195b;
                        String str = str;
                        l.b(str, "");
                        cVar.onNext(networkProxyAccount.a(str));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f65202a;

        static {
            Covode.recordClassIndex(40087);
        }

        c(Map map) {
            this.f65202a = map;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b(this) {
                /* class com.ss.android.ugc.aweme.account.network.NetworkProxyAccount.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f65203a;

                static {
                    Covode.recordClassIndex(40088);
                }

                {
                    this.f65203a = r1;
                }

                @Override // org.a.b
                public final void a_(org.a.c<? super String> cVar) {
                    try {
                        NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f65195b;
                        String str = str;
                        l.b(str, "");
                        cVar.onNext(networkProxyAccount.a(str, this.f65203a.f65202a));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    private static int c(String str) {
        try {
            return new JSONObject(str).getJSONObject("data").optInt("error_code");
        } catch (JSONException unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final String b(String str) {
        l.d(str, "");
        try {
            String str2 = sendGetRequest(str, Integer.MAX_VALUE, null).f59524d;
            l.b(str2, "");
            return str2;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            String response = e2.getResponse();
            l.b(response, "");
            return response;
        }
    }

    private static List<com.bytedance.retrofit2.client.b> a(List<com.ss.android.g> list) {
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new com.bytedance.retrofit2.client.b(t.f59519a, t.f59520b));
        }
        return n.g((Collection) arrayList);
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final String a(String str) {
        l.d(str, "");
        String str2 = a(Integer.MAX_VALUE, str, new ArrayList()).f59524d;
        l.b(str2, "");
        return str2;
    }

    public static f.a.h<String> d(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        f.a.h<String> b2 = f.a.h.a(new com.ss.android.common.util.g("https://api-va.tiktokv.com".concat(String.valueOf(str))).a()).a((g) new c(map)).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final String b(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        try {
            String str2 = sendPostRequest(str, map, Integer.MAX_VALUE, null).f59524d;
            l.b(str2, "");
            return str2;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            String response = e2.getResponse();
            l.b(response, "");
            return response;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final f.a.h<String> c(String str, Map<String, String> map) {
        l.d(str, "");
        f.a.h<String> b2 = f.a.h.a(e.a(new com.ss.android.common.util.g("https://api-va.tiktokv.com".concat(String.valueOf(str))), map)).a((g) b.f65200a).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r7 != null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String e(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount.e(java.lang.String, java.util.Map):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final String a(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        String str2 = a(Integer.MAX_VALUE, str, map, new ArrayList()).f59524d;
        l.b(str2, "");
        return str2;
    }

    private static androidx.c.a<String, String> a(String str, String str2, Map<String, String> map) {
        androidx.c.a<String, String> aVar = new androidx.c.a<>();
        if (c.a(str)) {
            aVar.putAll(c.a(c(str2), str, str2, map));
        }
        return aVar;
    }

    public final com.ss.android.h a(int i2, String str, List<com.ss.android.g> list) {
        l.d(str, "");
        try {
            com.ss.android.h sendGetRequest = sendGetRequest(str, i2, list);
            String str2 = sendGetRequest.f59524d;
            l.b(str2, "");
            androidx.c.a<String, String> a2 = a(str, str2, (Map<String, String>) null);
            if (!a2.isEmpty()) {
                return a(i2, e(str, a2), list);
            }
            return sendGetRequest;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            return new com.ss.android.h(str, -1, list, e2.getResponse());
        }
    }

    private final com.ss.android.h sendGetRequest(@ag String str, @o int i2, @com.bytedance.retrofit2.b.l List<com.ss.android.g> list) {
        List<com.bytedance.retrofit2.client.b> arrayList;
        List list2;
        List<com.bytedance.retrofit2.client.b> g2;
        if (f65196c && list != null) {
            Integer.valueOf(list.size());
        }
        e(str, c().a());
        if (list == null || !(!list.isEmpty())) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = a(list);
        }
        u<String> execute = b().getResponse(str, i2, arrayList).execute();
        List<com.bytedance.retrofit2.client.b> list3 = execute.f42629a.f42476d;
        if (list3 == null || list3.size() <= 0 || (g2 = n.g((Iterable) list3)) == null) {
            list2 = z.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) g2, 10));
            for (com.bytedance.retrofit2.client.b bVar : g2) {
                arrayList2.add(new com.ss.android.g(bVar.f42471a, bVar.f42472b));
            }
            list2 = n.g((Collection) arrayList2);
        }
        com.bytedance.retrofit2.client.c cVar = execute.f42629a;
        l.b(cVar, "");
        String str2 = cVar.f42473a;
        com.bytedance.retrofit2.client.c cVar2 = execute.f42629a;
        l.b(cVar2, "");
        return new com.ss.android.h(str2, cVar2.f42474b, list2, execute.f42630b);
    }

    private final com.ss.android.h sendPostRequest(@ag String str, @com.bytedance.retrofit2.b.f Map<String, String> map, @o int i2, @com.bytedance.retrofit2.b.l List<com.ss.android.g> list) {
        List<com.bytedance.retrofit2.client.b> arrayList;
        List list2;
        List<com.bytedance.retrofit2.client.b> g2;
        if (f65196c) {
            map.size();
            if (list != null) {
                Integer.valueOf(list.size());
            }
        }
        Map<String, String> a2 = c().a();
        a2.putAll(map);
        if (list == null || !(!list.isEmpty())) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = a(list);
        }
        u<String> execute = b().getResponse(str, a2, i2, arrayList).execute();
        List<com.bytedance.retrofit2.client.b> list3 = execute.f42629a.f42476d;
        if (list3 == null || list3.size() <= 0 || (g2 = n.g((Iterable) list3)) == null) {
            list2 = z.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) g2, 10));
            for (com.bytedance.retrofit2.client.b bVar : g2) {
                arrayList2.add(new com.ss.android.g(bVar.f42471a, bVar.f42472b));
            }
            list2 = n.g((Collection) arrayList2);
        }
        com.bytedance.retrofit2.client.c cVar = execute.f42629a;
        l.b(cVar, "");
        String str2 = cVar.f42473a;
        com.bytedance.retrofit2.client.c cVar2 = execute.f42629a;
        l.b(cVar2, "");
        return new com.ss.android.h(str2, cVar2.f42474b, list2, execute.f42630b);
    }

    public final com.ss.android.h a(int i2, String str, Map<String, String> map, List<com.ss.android.g> list) {
        l.d(str, "");
        l.d(map, "");
        l.d(list, "");
        try {
            com.ss.android.h sendPostRequest = sendPostRequest(str, map, i2, list);
            String str2 = sendPostRequest.f59524d;
            l.b(str2, "");
            androidx.c.a<String, String> a2 = a(str, str2, map);
            if (a2.isEmpty()) {
                return sendPostRequest;
            }
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(a2);
            return a(i2, str, hashMap, list);
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            return new com.ss.android.h(str, -1, list, e2.getResponse());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.network.a
    public final <T> T a(String str, int i2, String str2, Class<T> cls, String str3, List<? extends com.ss.android.http.a.b.d> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(cls, "");
        l.d(str3, "");
        return (T) com.ss.android.ugc.aweme.a.b().a(str, i2, str2, cls, str3, list);
    }
}
