package com.ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.p;
import h.z;
import java.net.URL;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(55020);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f87528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p[] f87529b;

        static {
            Covode.recordClassIndex(55021);
        }

        a(String str, p[] pVarArr) {
            this.f87528a = str;
            this.f87529b = pVarArr;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final u uVar = (u) obj;
            try {
                c.a("rd_tiktokec_network", new h.f.a.b<c.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.track.b.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(55022);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(c.a aVar) {
                        long j2;
                        c.a aVar2 = aVar;
                        l.d(aVar2, "");
                        com.bytedance.retrofit2.client.c cVar = uVar.f42629a;
                        l.b(cVar, "");
                        Object obj = cVar.f42478f;
                        if (!(obj instanceof com.bytedance.frameworks.baselib.network.http.a)) {
                            obj = null;
                        }
                        com.bytedance.frameworks.baselib.network.http.a aVar3 = (com.bytedance.frameworks.baselib.network.http.a) obj;
                        aVar2.c("error_code", Integer.valueOf(uVar.f42630b.code));
                        com.bytedance.retrofit2.client.c cVar2 = uVar.f42629a;
                        l.b(cVar2, "");
                        aVar2.c("path", new URL(cVar2.f42473a).getPath());
                        u uVar = uVar;
                        l.b(uVar, "");
                        aVar2.c("log_id", b.a(uVar));
                        aVar2.c("page_name", this.this$0.f87528a);
                        if (aVar3 != null) {
                            j2 = aVar3.r;
                        } else {
                            j2 = 0;
                        }
                        aVar2.b("duration", Long.valueOf(j2));
                        int i2 = 1;
                        if (aVar3 == null || !aVar3.p) {
                            i2 = 0;
                        }
                        aVar2.b("is_socket_reused", Integer.valueOf(i2));
                        p[] pVarArr = this.this$0.f87529b;
                        for (p pVar : pVarArr) {
                            aVar2.c((String) pVar.getFirst(), pVar.getSecond());
                        }
                        return z.f158842a;
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.b$b  reason: collision with other inner class name */
    static final class C2114b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f87530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p[] f87531b;

        static {
            Covode.recordClassIndex(55023);
        }

        C2114b(String str, p[] pVarArr) {
            this.f87530a = str;
            this.f87531b = pVarArr;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            o f2;
            com.google.gson.l c2;
            String c3;
            final Throwable th = (Throwable) obj;
            if (th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c) {
                try {
                    final String str = null;
                    try {
                        obj2 = j.a().a(((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getRequestLog(), (Class) o.class);
                    } catch (Exception unused) {
                        obj2 = null;
                    }
                    o oVar = (o) obj2;
                    if (!(oVar == null || (f2 = oVar.f("base")) == null || (c2 = f2.c("origin_url")) == null || (c3 = c2.c()) == null)) {
                        str = new URL(c3).getPath();
                    }
                    c.a("rd_tiktokec_network", new h.f.a.b<c.a, z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.track.b.C2114b.AnonymousClass1 */
                        final /* synthetic */ C2114b this$0;

                        static {
                            Covode.recordClassIndex(55024);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(c.a aVar) {
                            long j2;
                            c.a aVar2 = aVar;
                            String str = "";
                            l.d(aVar2, str);
                            com.bytedance.frameworks.baselib.network.http.a requestInfo = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getRequestInfo();
                            aVar2.c("error_code", Integer.valueOf(((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getStatusCode()));
                            String str2 = str;
                            if (str2 != null) {
                                str = str2;
                            }
                            aVar2.b("path", str);
                            aVar2.c("log_id", ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getTraceCode());
                            aVar2.c("page_name", this.this$0.f87530a);
                            if (requestInfo != null) {
                                j2 = requestInfo.r;
                            } else {
                                j2 = 0;
                            }
                            aVar2.b("duration", Long.valueOf(j2));
                            int i2 = 1;
                            if (requestInfo == null || !requestInfo.p) {
                                i2 = 0;
                            }
                            aVar2.b("is_socket_reused", Integer.valueOf(i2));
                            p[] pVarArr = this.this$0.f87531b;
                            for (p pVar : pVarArr) {
                                aVar2.c((String) pVar.getFirst(), pVar.getSecond());
                            }
                            return z.f158842a;
                        }
                    });
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static final String a(u<?> uVar) {
        List<com.bytedance.retrofit2.client.b> b2 = uVar.f42629a.b("X-Tt-Logid");
        if (b2 == null || b2.size() <= 0) {
            return "";
        }
        com.bytedance.retrofit2.client.b bVar = b2.get(0);
        l.b(bVar, "");
        String str = bVar.f42472b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final String a(String str) {
        if (str == null) {
            return "";
        }
        int hashCode = str.hashCode();
        if (hashCode != 656048398) {
            if (hashCode == 1868264071 && str.equals("ecom_order_summary_button_placeorder")) {
                return "place_order";
            }
            return str;
        } else if (str.equals("ecom_order_summary_button_paynow")) {
            return "pay_now";
        } else {
            return str;
        }
    }

    public static final <T> t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<T>>> a(t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<T>>> tVar, String str, p<String, ? extends Object>... pVarArr) {
        l.d(tVar, "");
        l.d(str, "");
        l.d(pVarArr, "");
        t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<T>>> a2 = tVar.b(new a(str, pVarArr)).a(new C2114b(str, pVarArr));
        l.b(a2, "");
        return a2;
    }
}
