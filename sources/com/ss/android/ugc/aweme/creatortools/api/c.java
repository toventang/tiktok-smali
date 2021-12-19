package com.ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.creatortools.api.ProAccountApi;
import f.a.b.b;
import f.a.z;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f78379a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f78380b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(48675);
    }

    public static final class a implements z<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a.b.a f78381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f78382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f78383c;

        static {
            Covode.recordClassIndex(48676);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            l.d(bVar, "");
            this.f78381a.a(bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            if (this.f78382b) {
                c.f78379a = null;
            }
            a aVar = this.f78383c;
            if (aVar != null) {
                aVar.a(null);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            b bVar = dVar2.f78386c;
            if (this.f78382b) {
                c.f78379a = bVar;
            }
            a aVar = this.f78383c;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        a(f.a.b.a aVar, boolean z, a aVar2) {
            this.f78381a = aVar;
            this.f78382b = z;
            this.f78383c = aVar2;
        }
    }

    public static void a(boolean z, f.a.b.a aVar, a aVar2) {
        l.d(aVar, "");
        if (com.ss.android.ugc.aweme.creatortools.a.a()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                ProAccountApi.a.a().getShowCaseResp().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new a(aVar, z, aVar2));
            }
        }
    }
}
