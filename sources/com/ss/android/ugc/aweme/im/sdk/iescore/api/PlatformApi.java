package com.ss.android.ugc.aweme.im.sdk.iescore.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.retrofit2.b.d;
import f.a.ab;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Map;
import java.util.concurrent.Callable;
import l.b.f;
import l.b.i;
import l.b.j;
import l.b.o;
import l.b.u;
import l.b.x;

public interface PlatformApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102795a = a.f102797b;

    static {
        Covode.recordClassIndex(65905);
    }

    @f
    t<String> get(@x String str, @j Map<String, String> map, @u Map<String, String> map2);

    @o
    t<String> post(@x String str, @j Map<String, String> map, @u Map<String, String> map2, @l.b.a Object obj);

    @o
    t<Response> postSDK(@x String str, @i(a = "Content-Type") String str2, @l.b.a Request request, @d Object obj);

    public static final class a implements com.bytedance.ies.im.core.api.d.c {

        /* renamed from: a  reason: collision with root package name */
        static final h f102796a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f102797b;

        @Override // com.bytedance.ies.im.core.api.d.c
        public final boolean a() {
            return false;
        }

        private a() {
        }

        static final class c extends m implements h.f.a.a<PlatformApi> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(65909);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ PlatformApi invoke() {
                return a();
            }

            private static PlatformApi a() {
                try {
                    return (PlatformApi) RetrofitFactory.a().b(com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102220b).d().a(PlatformApi.class);
                } catch (Throwable th) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("PlatformAPI", th);
                    return null;
                }
            }
        }

        static {
            Covode.recordClassIndex(65906);
            a aVar = new a();
            f102797b = aVar;
            f102796a = h.i.a((h.f.a.a) new c(aVar));
        }

        /* access modifiers changed from: package-private */
        public static final class d<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f102801a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.ies.im.core.api.g.a f102802b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f102803c;

            static {
                Covode.recordClassIndex(65910);
            }

            d(a aVar, com.bytedance.ies.im.core.api.g.a aVar2, String str) {
                this.f102801a = aVar;
                this.f102802b = aVar2;
                this.f102803c = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                t<Response> tVar;
                PlatformApi platformApi = (PlatformApi) a.f102796a.getValue();
                if (platformApi != null) {
                    tVar = platformApi.postSDK(this.f102802b.f33980a, this.f102803c, this.f102802b.f33984e, this.f102802b.f33985f);
                } else {
                    tVar = null;
                }
                return ab.a((f.a.x) tVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a$a  reason: collision with other inner class name */
        public static final class C2594a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.im.core.a.a.b f102798a;

            static {
                Covode.recordClassIndex(65907);
            }

            C2594a(com.bytedance.im.core.a.a.b bVar) {
                this.f102798a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f102798a.a(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class e<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.im.core.a.a.b f102804a;

            static {
                Covode.recordClassIndex(65911);
            }

            e(com.bytedance.im.core.a.a.b bVar) {
                this.f102804a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f102804a.a(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f102799a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.im.core.a.a.b f102800b;

            static {
                Covode.recordClassIndex(65908);
            }

            b(a aVar, com.bytedance.im.core.a.a.b bVar) {
                this.f102799a = aVar;
                this.f102800b = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f102800b.a(a.a((Throwable) obj));
            }
        }

        /* access modifiers changed from: package-private */
        public static final class f<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f102805a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.im.core.a.a.b f102806b;

            static {
                Covode.recordClassIndex(65912);
            }

            f(a aVar, com.bytedance.im.core.a.a.b bVar) {
                this.f102805a = aVar;
                this.f102806b = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f102806b.a(a.a((Throwable) obj));
            }
        }

        @Override // com.bytedance.ies.im.core.api.d.c
        public final void a(com.bytedance.ies.im.core.api.g.b bVar) {
            l.d(bVar, "");
            l.d(bVar, "");
        }

        public static com.bytedance.im.core.d.u a(Throwable th) {
            u.a a2 = com.bytedance.im.core.d.u.a();
            a2.f38031a.f38030h = th;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                a2.a(aVar.getErrorCode());
                a2.a(aVar.getErrorMsg());
                a2.f38031a.f38029g = aVar.getResponse();
            }
            com.bytedance.im.core.d.u uVar = a2.f38031a;
            l.b(uVar, "");
            return uVar;
        }

        @Override // com.bytedance.ies.im.core.api.d.c
        public final void a(com.bytedance.ies.im.core.api.g.a<Request> aVar, com.bytedance.im.core.a.a.b<Response> bVar) {
            String str = "";
            l.d(aVar, str);
            l.d(bVar, str);
            String str2 = aVar.f33982c.get("Content-Type");
            if (str2 != null) {
                str = str2;
            }
            d dVar = new d(this, aVar, str);
            f.a.e.b.b.a((Object) dVar, "singleSupplier is null");
            f.a.h.a.a(new f.a.e.e.f.b(dVar)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(bVar), new f(this, bVar));
        }

        @Override // com.bytedance.ies.im.core.api.d.c
        public final void a(boolean z, com.bytedance.im.core.a.a.b<com.bytedance.ies.im.core.api.f.d> bVar) {
            l.d(bVar, "");
            t<com.bytedance.ies.im.core.api.f.d> fetchMixInit = com.ss.android.ugc.aweme.im.sdk.common.data.api.a.f102469a.fetchMixInit(0, 0, 1);
            l.b(fetchMixInit, "");
            fetchMixInit.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C2594a(bVar), new b(this, bVar));
        }
    }
}
