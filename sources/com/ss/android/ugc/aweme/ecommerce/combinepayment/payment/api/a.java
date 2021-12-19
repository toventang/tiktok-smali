package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api;

import com.bytedance.android.ecommerce.e.d;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ecommerce.payment.a.b;
import com.ss.android.ugc.aweme.ecommerce.payment.a.c;
import f.a.z;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static b f85244a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f85245b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(53350);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.a$a  reason: collision with other inner class name */
    public static final class C2040a implements z<com.ss.android.ugc.aweme.ecommerce.api.model.a<c>> {
        static {
            Covode.recordClassIndex(53351);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.ecommerce.api.model.a<c> aVar) {
            o oVar;
            String str;
            com.ss.android.ugc.aweme.ecommerce.api.model.a<c> aVar2 = aVar;
            l.d(aVar2, "");
            T t = aVar2.data;
            if (t != null && (oVar = t.f86281a) != null) {
                a.f85244a = (b) new f().a((com.google.gson.l) oVar, b.class);
                d dVar = com.bytedance.android.ecommerce.a.f6869a;
                b bVar = a.f85244a;
                String str2 = null;
                if (bVar != null) {
                    str = bVar.f86270c;
                } else {
                    str = null;
                }
                dVar.d(str);
                b bVar2 = a.f85244a;
                if (bVar2 != null) {
                    str2 = bVar2.f86272e;
                }
                dVar.c(str2);
            }
        }
    }
}
