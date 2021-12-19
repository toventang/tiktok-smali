package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.tools.h.a.l;
import com.ss.android.ugc.tools.h.a.p;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.d.g;
import h.f.b.m;
import h.i;
import h.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.io.FileSystem;

public final class h extends l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f149260b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.h f149261a = i.a((h.f.a.a) f.f149272a);

    static {
        Covode.recordClassIndex(98297);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98298);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<OkHttpClient> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f149272a = new f();

        static {
            Covode.recordClassIndex(98303);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ OkHttpClient invoke() {
            return new OkHttpClient.Builder().retryOnConnectionFailure(true).connectTimeout(15, TimeUnit.SECONDS).build();
        }
    }

    static final class d<T> implements f.a.d.f<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f149266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149267b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f149268c;

        static {
            Covode.recordClassIndex(98301);
        }

        d(p pVar, String str, long j2) {
            this.f149266a = pVar;
            this.f149267b = str;
            this.f149268c = j2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(z zVar) {
            p pVar = this.f149266a;
            if (pVar != null) {
                pVar.a(this.f149267b, System.currentTimeMillis() - this.f149268c);
            }
        }
    }

    static final class e<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f149269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149270b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f149271c;

        static {
            Covode.recordClassIndex(98302);
        }

        e(p pVar, String str, long j2) {
            this.f149269a = pVar;
            this.f149270b = str;
            this.f149271c = j2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            p pVar = this.f149269a;
            if (pVar != null) {
                String str = this.f149270b;
                long currentTimeMillis = System.currentTimeMillis() - this.f149271c;
                if (!(th2 instanceof Exception)) {
                    th2 = null;
                }
                pVar.a(str, currentTimeMillis, (Exception) th2, (Integer) null);
            }
        }
    }

    static final class b<T> implements af<ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f149262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Request f149263b;

        static {
            Covode.recordClassIndex(98299);
        }

        b(h hVar, Request request) {
            this.f149262a = hVar;
            this.f149263b = request;
        }

        @Override // f.a.af
        public final void subscribe(ad<ResponseBody> adVar) {
            h.f.b.l.d(adVar, "");
            try {
                Response execute = ((OkHttpClient) this.f149262a.f149261a.getValue()).newCall(this.f149263b).execute();
                h.f.b.l.b(execute, "");
                if (execute.isSuccessful()) {
                    ResponseBody body = execute.body();
                    if (body != null) {
                        adVar.a(body);
                    } else {
                        adVar.a(new Exception("response body null, status code is: " + execute.code()));
                    }
                } else {
                    adVar.a(new Exception("status code error, status code is: " + execute.code()));
                }
            } catch (Exception e2) {
                adVar.a(e2);
            }
        }
    }

    static final class c<T, R> implements g<ResponseBody, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f149264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149265b;

        static {
            Covode.recordClassIndex(98300);
        }

        c(h hVar, String str) {
            this.f149264a = hVar;
            this.f149265b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ z apply(ResponseBody responseBody) {
            MethodCollector.i(4193);
            ResponseBody responseBody2 = responseBody;
            h.f.b.l.d(responseBody2, "");
            InputStream byteStream = responseBody2.byteStream();
            h.f.b.l.b(byteStream, "");
            File file = new File(this.f149265b);
            FileSystem.SYSTEM.sink(file).close();
            try {
                InputStream inputStream = byteStream;
                if (file.exists()) {
                    h.a(file);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            h.e.c.a(fileOutputStream, null);
                            h.e.c.a(byteStream, null);
                            z zVar = z.f158842a;
                            MethodCollector.o(4193);
                            return zVar;
                        }
                    }
                } catch (Throwable th) {
                    h.e.c.a(fileOutputStream, th);
                    MethodCollector.o(4193);
                    throw th;
                }
            } catch (Throwable th2) {
                h.e.c.a(byteStream, th);
                MethodCollector.o(4193);
                throw th2;
            }
        }
    }

    static boolean a(File file) {
        MethodCollector.i(4302);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.b(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(4302);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4302);
        return delete;
    }

    @Override // com.ss.android.ugc.tools.h.a.l
    public final void a(String str, String str2, p pVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        long currentTimeMillis = System.currentTimeMillis();
        ab.a((af) new b(this, new Request.Builder().url(str).build())).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new c(this, str2)).a(new d(pVar, str, currentTimeMillis), new e(pVar, str, currentTimeMillis));
    }
}
