package dmt.av.video.c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static volatile b f156873c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f156874d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f156875a = true;

    /* renamed from: b  reason: collision with root package name */
    public final Application f156876b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f156877e;

    /* renamed from: f  reason: collision with root package name */
    private final h f156878f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f156879g = i.a((h.f.a.a) new C4145b(this));

    static {
        Covode.recordClassIndex(104196);
    }

    private final d.AbstractC1335d c() {
        return (d.AbstractC1335d) this.f156878f.getValue();
    }

    private final DownloadableModelSupportLibraryLoader d() {
        return (DownloadableModelSupportLibraryLoader) this.f156879g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104197);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final b a(Application application) {
            b bVar;
            MethodCollector.i(2681);
            l.d(application, "");
            b bVar2 = b.f156873c;
            if (bVar2 == null) {
                synchronized (this) {
                    try {
                        bVar = b.f156873c;
                        if (bVar == null) {
                            bVar = new b(application);
                            b.f156873c = bVar;
                        }
                    } finally {
                        MethodCollector.o(2681);
                    }
                }
                return bVar;
            }
            MethodCollector.o(2681);
            return bVar2;
        }
    }

    /* renamed from: dmt.av.video.c.b$b  reason: collision with other inner class name */
    static final class C4145b extends m implements h.f.a.a<DownloadableModelSupportLibraryLoader> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(104198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4145b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DownloadableModelSupportLibraryLoader invoke() {
            return new DownloadableModelSupportLibraryLoader(this) {
                /* class dmt.av.video.c.b.C4145b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C4145b f156880a;

                static {
                    Covode.recordClassIndex(104199);
                }

                {
                    this.f156880a = r1;
                }

                @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
                public final void loadLibrary(String str) {
                    Librarian.a(str, this.f156880a.this$0.f156876b);
                }
            };
        }
    }

    public final void a() {
        d.f61345c = c();
        DownloadableModelSupport.setLibraryLoader(d());
    }

    static final class c extends m implements h.f.a.a<d.AbstractC1335d> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(104200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d.AbstractC1335d invoke() {
            g.a().w();
            bj.a("So decompress: TELibraryLoaderManager, using normal library");
            return new a(this.this$0.f156875a);
        }
    }

    public final void b() {
        if (!this.f156877e) {
            d.f61345c = c();
            DownloadableModelSupport.setLibraryLoader(d());
            this.f156877e = true;
        }
    }

    public b(Application application) {
        l.d(application, "");
        this.f156876b = application;
    }
}
