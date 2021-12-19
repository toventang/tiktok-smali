package com.bytedance.liko.leakdetector;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import l.d;
import l.m;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40099a = a.f40101b;

    static {
        Covode.recordClassIndex(24716);
    }

    void a(String str, List<MultipartBody.Part> list, a<String> aVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f40100a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f40101b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static b f40102c;

        private a() {
        }

        static {
            Covode.recordClassIndex(24717);
        }

        public static b a() {
            b bVar = f40100a;
            if (bVar != null) {
                return bVar;
            }
            C0980b bVar2 = new C0980b();
            f40102c = bVar2;
            return bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.liko.leakdetector.b$b  reason: collision with other inner class name */
    public static final class C0980b implements b {

        /* renamed from: b  reason: collision with root package name */
        public final OkHttpClient f40103b = new OkHttpClient();

        static {
            Covode.recordClassIndex(24718);
        }

        /* renamed from: com.bytedance.liko.leakdetector.b$b$a */
        public static final class a implements d<ResponseBody> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f40104a;

            static {
                Covode.recordClassIndex(24719);
            }

            a(a aVar) {
                this.f40104a = aVar;
            }

            @Override // l.d
            public final void a(l.b<ResponseBody> bVar, Throwable th) {
                l.c(bVar, "");
                l.c(th, "");
                this.f40104a.a(th);
            }

            @Override // l.d
            public final void a(l.b<ResponseBody> bVar, l.l<ResponseBody> lVar) {
                l.c(bVar, "");
                l.c(lVar, "");
                this.f40104a.a(String.valueOf(lVar.f159306b));
            }
        }

        @Override // com.bytedance.liko.leakdetector.b
        public final void a(String str, List<MultipartBody.Part> list, a<String> aVar) {
            l.c(str, "");
            l.c(aVar, "");
            ((FileApi) new m.a().a(str).a(this.f40103b).a(l.a.a.a.a()).a().a(FileApi.class)).upload(str, list).a(new a(aVar));
        }
    }
}
