package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.tools.utils.u;
import f.a.d.g;
import f.a.d.k;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f114629e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f114630a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114631b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f114632c;

    /* renamed from: d  reason: collision with root package name */
    public final String f114633d;

    /* renamed from: f  reason: collision with root package name */
    private final String f114634f;

    static {
        Covode.recordClassIndex(73781);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73782);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements z<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f114641b;

        static {
            Covode.recordClassIndex(73787);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onComplete() {
            l lVar = this.f114641b;
            if (lVar != null) {
                lVar.a();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            l lVar = this.f114641b;
            if (lVar != null) {
                lVar.b();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(Integer num) {
            if (num.intValue() > 0) {
                onComplete();
            } else {
                onError(new Throwable("UNKNOWN EXCEPTIION"));
            }
        }

        e(f fVar, l lVar) {
            this.f114640a = fVar;
            this.f114641b = lVar;
        }
    }

    public final void e() {
        b();
        cs.c(b());
    }

    public final String a() {
        if (this.f114630a < this.f114632c.size()) {
            return this.f114632c.get(this.f114630a);
        }
        throw new Exception("Array out of bound");
    }

    public final String c() {
        StringBuilder append = new StringBuilder().append(b()).append(File.separator);
        a();
        return append.append(a(true)).toString();
    }

    public final String d() {
        StringBuilder append = new StringBuilder().append(b()).append(File.separator);
        a();
        return append.append(a(false)).toString();
    }

    public final boolean f() {
        File[] listFiles;
        File file = new File(c());
        File file2 = new File(d());
        String str = this.f114633d;
        if (file.exists() && file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
            return a(file, str);
        }
        return false;
    }

    public final String b() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f114631b;
        StringBuilder sb2 = new StringBuilder();
        File b2 = com.ss.android.ugc.aweme.video.e.b(com.bytedance.ies.ugc.appcontext.d.a());
        l.b(b2, "");
        StringBuilder append = sb.append(sb2.append(b2.getPath()).append(File.separator).append(str2).toString()).append(File.separator);
        if (!TextUtils.isEmpty(this.f114634f)) {
            str = this.f114634f;
        } else {
            str = "default_activity";
        }
        return append.append(str).toString();
    }

    public static final class c implements k<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114638a;

        static {
            Covode.recordClassIndex(73785);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f114638a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Throwable th) {
            l.d(th, "");
            if (this.f114638a.f114630a >= this.f114638a.f114632c.size() - 1) {
                return false;
            }
            this.f114638a.f114630a++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114639a;

        static {
            Covode.recordClassIndex(73786);
        }

        d(f fVar) {
            this.f114639a = fVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            t a2 = t.a(new C2936f(str));
            l.b(a2, "");
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f114635a;

        static {
            Covode.recordClassIndex(73783);
        }

        b(f fVar) {
            this.f114635a = fVar;
        }

        public static final class a extends AbsDownloadListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f114636a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f114637b;

            static {
                Covode.recordClassIndex(73784);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String c2 = this.f114636a.f114635a.c();
                if (f.a(new File(c2), this.f114636a.f114635a.f114633d)) {
                    this.f114637b.a(c2);
                } else {
                    this.f114637b.a((Throwable) new Exception("FIle in  " + this.f114636a.f114635a.f114630a + " doesnot match md5"));
                }
            }

            a(b bVar, v vVar) {
                this.f114636a = bVar;
                this.f114637b = vVar;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                l.d(baseException, "");
                this.f114637b.a((Throwable) baseException);
            }
        }

        @Override // f.a.w
        public final void subscribe(v<String> vVar) {
            l.d(vVar, "");
            cs.c(this.f114635a.b());
            cs.a(this.f114635a.d(), false);
            a aVar = new a(this, vVar);
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.f114635a.a());
            with.f83081f = this.f114635a.b();
            f fVar = this.f114635a;
            fVar.a();
            with.f83078c = fVar.a(true);
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a("legacy_lottie_file");
            a2.D = aVar;
            a2.f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$f  reason: collision with other inner class name */
    static final class C2936f<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f114642a;

        static {
            Covode.recordClassIndex(73788);
        }

        C2936f(String str) {
            this.f114642a = str;
        }

        @Override // f.a.w
        public final void subscribe(v<Integer> vVar) {
            l.d(vVar, "");
            try {
                if (p.c(this.f114642a, ".zip", false)) {
                    int a2 = p.a((CharSequence) this.f114642a, ".zip");
                    String str = this.f114642a;
                    if (str != null) {
                        String substring = str.substring(0, a2);
                        l.b(substring, "");
                        u.a(new File(this.f114642a), new File(substring));
                        vVar.a((Integer) 1);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                vVar.a(new Throwable("file Path not ended with .zip!"));
            } catch (Exception e2) {
                vVar.a(e2);
            }
        }
    }

    public final InputStream a(String str) {
        FileInputStream fileInputStream;
        MethodCollector.i(6045);
        l.d(str, "");
        try {
            fileInputStream = new FileInputStream(new File(d() + File.separator + (str + ".json")));
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        MethodCollector.o(6045);
        return fileInputStream;
    }

    public final String a(boolean z) {
        String str;
        StringBuilder append = new StringBuilder().append(this.f114633d);
        if (z) {
            str = ".zip";
        } else {
            str = "";
        }
        return append.append(str).toString();
    }

    public static boolean a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(com.bytedance.common.utility.d.a(file), str);
    }

    public final void a(Context context, l lVar) {
        l.d(context, "");
        t a2 = t.a(new b(this)).a(Long.MAX_VALUE, new c(this));
        l.b(a2, "");
        a2.a((g) new d(this), false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new e(this, lVar));
    }

    public f(String str, String str2, List<String> list, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(str3, "");
        this.f114631b = str;
        this.f114634f = str2;
        this.f114632c = list;
        this.f114633d = str3;
        new StringBuilder("LottieFileManager ").append(this).append(" init, ").append(str).append(", ").append(str2).append(", ").append(list).append(' ').append(str3);
    }
}
