package com.ss.android.ugc.aweme.legoImp;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.ugc.aweme.net.InterceptorProvider;
import com.ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.net.i.c;
import com.ss.android.ugc.aweme.net.i.j;
import com.ss.android.ugc.aweme.net.i.k;
import com.ss.android.ugc.aweme.net.interceptor.CommonTimeOutInterceptor;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.ss.android.ugc.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;
import java.util.Objects;

public final class NetworkConfigProvider implements INetworkConfigProvider {

    /* renamed from: a  reason: collision with root package name */
    private final h f107662a = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(68867);
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.network.a> {
        final /* synthetic */ NetworkConfigProvider this$0;

        static {
            Covode.recordClassIndex(68868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NetworkConfigProvider networkConfigProvider) {
            super(0);
            this.this$0 = networkConfigProvider;
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider$a$a  reason: collision with other inner class name */
        static final class C2768a extends m implements h.f.a.a<String> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2768a f107663a = new C2768a();

            static {
                Covode.recordClassIndex(68869);
            }

            C2768a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ String invoke() {
                return com.ss.android.ugc.aweme.language.d.g();
            }
        }

        static final class c extends m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f107665a = new c();

            static {
                Covode.recordClassIndex(68871);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        static final class d extends m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f107666a = new d();

            static {
                Covode.recordClassIndex(68872);
            }

            d() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return -1;
            }
        }

        static final class b extends m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f107664a = new b();

            static {
                Covode.recordClassIndex(68870);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "enable_api_libra", 0));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.network.a invoke() {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Application");
            com.ss.android.ugc.aweme.network.b bVar = new com.ss.android.ugc.aweme.network.b((Application) a2);
            bVar.f112552a = new IESNetDepend();
            bVar.f112553b = e.f112296a;
            bVar.f112556e = com.bytedance.ies.ugc.appcontext.d.s;
            bVar.f112555d = com.bytedance.ies.ugc.appcontext.d.b();
            bVar.f112554c = com.bytedance.ies.ugc.appcontext.d.n;
            bVar.o = new com.ss.android.ugc.aweme.net.monitor.d(com.bytedance.ies.ugc.appcontext.d.a());
            bVar.f112557f = com.ss.android.c.b.f59137a;
            NetworkConfigProvider.a(bVar);
            SecApiImpl.a().initTask();
            C2768a aVar = C2768a.f107663a;
            l.d(aVar, "");
            bVar.f112561j = aVar;
            b bVar2 = b.f107664a;
            l.d(bVar2, "");
            bVar.f112563l = bVar2;
            c cVar = c.f107665a;
            l.d(cVar, "");
            bVar.f112564m = cVar;
            d dVar = d.f107666a;
            l.d(dVar, "");
            bVar.n = dVar;
            return new com.ss.android.ugc.aweme.network.a(bVar);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider
    public final com.ss.android.ugc.aweme.network.a a() {
        return (com.ss.android.ugc.aweme.network.a) this.f107662a.getValue();
    }

    public static INetworkConfigProvider b() {
        MethodCollector.i(6228);
        Object a2 = b.a(INetworkConfigProvider.class, false);
        if (a2 != null) {
            INetworkConfigProvider iNetworkConfigProvider = (INetworkConfigProvider) a2;
            MethodCollector.o(6228);
            return iNetworkConfigProvider;
        }
        if (b.cl == null) {
            synchronized (INetworkConfigProvider.class) {
                try {
                    if (b.cl == null) {
                        b.cl = new NetworkConfigProvider();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6228);
                    throw th;
                }
            }
        }
        NetworkConfigProvider networkConfigProvider = (NetworkConfigProvider) b.cl;
        MethodCollector.o(6228);
        return networkConfigProvider;
    }

    public static void a(com.ss.android.ugc.aweme.network.b bVar) {
        bVar.p.a(new k()).a(new com.ss.android.ugc.aweme.net.i.l()).a(new com.ss.android.ugc.aweme.net.i.b()).a(new j()).a(new c()).a(new com.ss.android.ugc.aweme.net.i.i());
        InterceptorProvider e2 = InterceptorHolder.e();
        l.b(e2, "");
        List<com.bytedance.retrofit2.c.a> a2 = e2.a();
        if (a2 != null) {
            for (T t : a2) {
                l.b(t, "");
                l.d(t, "");
                bVar.f112560i.add(t);
            }
        }
        RetrofitUtils.a(new CommonTimeOutInterceptor());
    }
}
