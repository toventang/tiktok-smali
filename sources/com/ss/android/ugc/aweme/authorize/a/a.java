package com.ss.android.ugc.aweme.authorize.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.openauthorize.a.h;
import com.ss.android.ugc.aweme.openauthorize.a.j;
import com.ss.android.ugc.aweme.openauthorize.f;
import com.ss.android.ugc.aweme.openauthorize.g;
import f.a.ae;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1511a f67106a = new C1511a((byte) 0);

    static {
        Covode.recordClassIndex(41344);
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.a.a$a  reason: collision with other inner class name */
    public static final class C1511a {
        static {
            Covode.recordClassIndex(41345);
        }

        private C1511a() {
        }

        public /* synthetic */ C1511a(byte b2) {
            this();
        }
    }

    public static final class b implements ae<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.openauthorize.e f67107a;

        static {
            Covode.recordClassIndex(41346);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public b(com.ss.android.ugc.aweme.openauthorize.e eVar) {
            this.f67107a = eVar;
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            h hVar = new h();
            hVar.f114499b = false;
            this.f67107a.a(hVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            hVar2.f114499b = TextUtils.equals("success", hVar2.f114498a);
            this.f67107a.a(hVar2);
        }
    }

    public static final class c implements ae<j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67108a;

        static {
            Covode.recordClassIndex(41347);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public c(f fVar) {
            this.f67108a = fVar;
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            j jVar = new j();
            jVar.f114505b = false;
            this.f67108a.a(jVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            jVar2.f114505b = TextUtils.equals("success", jVar2.f114504a);
            this.f67108a.a(jVar2);
        }
    }

    public static final class d implements ae<com.ss.android.ugc.aweme.openauthorize.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.openauthorize.d f67109a;

        static {
            Covode.recordClassIndex(41348);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        d(com.ss.android.ugc.aweme.openauthorize.d dVar) {
            this.f67109a = dVar;
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            com.ss.android.ugc.aweme.openauthorize.a.d dVar = new com.ss.android.ugc.aweme.openauthorize.a.d();
            dVar.setStatusCode(-1);
            this.f67109a.b(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.openauthorize.a.d dVar) {
            com.ss.android.ugc.aweme.openauthorize.a.d dVar2 = dVar;
            l.d(dVar2, "");
            Integer statusCode = dVar2.getStatusCode();
            if (statusCode != null && statusCode.intValue() == 0) {
                this.f67109a.a(dVar2);
            } else {
                this.f67109a.b(dVar2);
            }
        }
    }

    public static final class e implements ae<j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f67110a;

        static {
            Covode.recordClassIndex(41349);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public e(g gVar) {
            this.f67110a = gVar;
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            j jVar = new j();
            jVar.f114505b = false;
            this.f67110a.a(jVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            jVar2.f114505b = TextUtils.equals("success", jVar2.f114504a);
            this.f67110a.a(jVar2);
        }
    }

    public static void a(String str, int i2, String str2, String str3, String str4, com.ss.android.ugc.aweme.openauthorize.d dVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(dVar, "");
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.authorize.network.a.f67207a.getAuthPageInfo(str, i2, str2, str3, str4).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new d(dVar));
    }
}
