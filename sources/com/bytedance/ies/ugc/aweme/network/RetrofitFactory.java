package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.q;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.ss.android.account.token.TTTokenInterceptor;
import com.ss.android.ugc.aweme.app.api.OkClient;
import com.ss.android.ugc.aweme.app.api.r;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.net.cache.IesCacheInterceptor;
import com.ss.android.ugc.aweme.net.i.f;
import com.ss.android.ugc.aweme.net.i.g;
import com.ss.android.ugc.aweme.net.i.m;
import com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.CommonParamsCheckInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor;
import com.ss.android.ugc.aweme.net.j.h;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class RetrofitFactory implements IRetrofitFactory {

    /* renamed from: a  reason: collision with root package name */
    private static NetworkPartnerGroup f34971a;

    static {
        Covode.recordClassIndex(20990);
    }

    public static IRetrofitFactory a() {
        MethodCollector.i(6876);
        Object a2 = b.a(IRetrofitFactory.class, false);
        if (a2 != null) {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) a2;
            MethodCollector.o(6876);
            return iRetrofitFactory;
        }
        if (b.f145531f == null) {
            synchronized (IRetrofitFactory.class) {
                try {
                    if (b.f145531f == null) {
                        b.f145531f = new RetrofitFactory();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6876);
                    throw th;
                }
            }
        }
        RetrofitFactory retrofitFactory = (RetrofitFactory) b.f145531f;
        MethodCollector.o(6876);
        return retrofitFactory;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    public final e b(String str) {
        return new a(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    public final f a(String str) {
        return b(str).d();
    }

    private static q a(q.a aVar) {
        if (h.a().f112414a) {
            try {
                a.AbstractC1037a aVar2 = (a.AbstractC1037a) Reflect.on(aVar).field("clientProvider", new Class[0]).get();
                a aVar3 = aVar2.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(aVar2.getClass().getName()) || (aVar3 instanceof o) || (aVar3 instanceof com.bytedance.frameworks.baselib.network.http.cronet.c.a)) {
                    return aVar.a();
                }
            } catch (Throwable th) {
                eo.a(th, "error occured.");
            }
        }
        q a2 = aVar.a();
        if (a2.f42572g != null) {
            a2.f42572g.add(new TTNetMonitorInterceptor());
            a2.f42572g.set(0, new BeforeHandleRequestInterceptor(a2.f42572g.get(0)));
        }
        return a2;
    }

    static q a(a aVar) {
        NetworkPartnerGroup a2;
        if (aVar == null) {
            return null;
        }
        q.a aVar2 = new q.a();
        List<e.a> a3 = a(a(aVar.f34977f, r.class), com.ss.android.ugc.aweme.app.api.a.a.class);
        if (!d.a(a3)) {
            for (e.a aVar3 : a3) {
                aVar2.a(aVar3);
            }
        }
        if (!d.a(aVar.f34978g)) {
            for (c.a aVar4 : aVar.f34978g) {
                aVar2.a(aVar4);
            }
        }
        aVar2.a(new com.bytedance.frameworks.baselib.network.http.retrofit.a());
        aVar2.a(aVar.f34972a);
        if (!aVar.f34974c) {
            aVar2.a(new IesCacheInterceptor());
            if (aVar.f34982k > 0) {
                aVar.a((com.bytedance.ies.ugc.network.partner.b) new f(aVar.f34982k));
            }
            aVar.a((com.bytedance.ies.ugc.network.partner.b) new com.ss.android.ugc.aweme.net.i.h(aVar.f34980i));
            NetworkPartnerGroup networkPartnerGroup = f34971a;
            if (networkPartnerGroup != null) {
                a2 = networkPartnerGroup.a();
            } else {
                NetworkPartnerGroup a4 = new NetworkPartnerGroup().a(g.f112369a).a(com.ss.android.ugc.aweme.net.i.a.f112361a).a(g.a().q.a()).a(m.f112382a).a(com.ss.android.ugc.aweme.net.i.d.f112366a).a(com.ss.android.ugc.aweme.net.i.e.f112367a);
                f34971a = a4;
                a2 = a4.a();
            }
            NetworkPartnerGroup a5 = a2.a(aVar.f34981j);
            StringBuilder append = a5.f35221f.append("create Interceptor, ");
            l.b(append, "");
            a5.a(append).append("\n");
            aVar2.a(new NetworkPartnerGroup.PartnerInterceptor(a5));
            if (!d.a(g.a().f112522j)) {
                for (com.bytedance.retrofit2.c.a aVar5 : g.a().f112522j) {
                    aVar2.a(aVar5);
                }
            }
            aVar2.a(new TTTokenInterceptor());
            for (com.bytedance.retrofit2.c.a aVar6 : aVar.f34976e) {
                aVar2.a(aVar6);
            }
        }
        aVar2.a(new SsInterceptor());
        aVar2.a(new TTNetInitInterceptor());
        if (!aVar.f34974c) {
            aVar2.a(new CommonParamsCheckInterceptor());
        }
        if (aVar.f34973b) {
            aVar2.a(new OkClient());
        } else {
            aVar2.a(new com.ss.android.ugc.aweme.app.api.o());
        }
        aVar2.f42579a = com.ss.android.ugc.aweme.net.cache.g.f112265a;
        return a(aVar2);
    }

    private static List<e.a> a(List<e.a> list, Class cls) {
        if (d.a(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        e.a aVar = null;
        for (e.a aVar2 : list) {
            if (cls.isInstance(aVar2)) {
                aVar = aVar2;
            } else if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        return arrayList;
    }
}
