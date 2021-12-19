package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.video.e;
import f.a.d.f;
import h.f.b.l;
import java.io.File;
import java.util.List;

public final class StorageClearTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f107885a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f107886b = new a((byte) 0);

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107889a = new c();

        static {
            Covode.recordClassIndex(69140);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(69136);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69137);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class b implements f<Application> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f107887a;

        static {
            Covode.recordClassIndex(69138);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f107888a;

            static {
                Covode.recordClassIndex(69139);
            }

            a(b bVar) {
                this.f107888a = bVar;
            }

            public final void run() {
                if (!d.s.equals("lark_inhouse") && !AVExternalServiceImpl.a().publishService().isPublishing()) {
                    if (a(this.f107888a.f107887a) != null) {
                        File a2 = a(this.f107888a.f107887a);
                        l.b(a2, "");
                        if (a2.getParent() != null) {
                            StringBuilder sb = new StringBuilder();
                            File a3 = a(this.f107888a.f107887a);
                            l.b(a3, "");
                            e.e(sb.append(a3.getAbsolutePath()).append("/cacheV2").toString());
                            StringBuilder sb2 = new StringBuilder();
                            File a4 = a(this.f107888a.f107887a);
                            l.b(a4, "");
                            e.e(sb2.append(a4.getParent()).append("/app_assets").toString());
                            com.ss.android.ugc.aweme.framework.a.a.b(6, "StorageClearTask", "clear appassets ");
                        }
                    }
                    if (b(this.f107888a.f107887a) != null) {
                        File b2 = b(this.f107888a.f107887a);
                        l.b(b2, "");
                        if (b2.getAbsolutePath() != null) {
                            StringBuilder sb3 = new StringBuilder();
                            File b3 = b(this.f107888a.f107887a);
                            l.b(b3, "");
                            e.e(sb3.append(b3.getAbsolutePath()).append("/offline").toString());
                            StringBuilder sb4 = new StringBuilder();
                            File b4 = b(this.f107888a.f107887a);
                            l.b(b4, "");
                            e.e(sb4.append(b4.getAbsolutePath()).append("/offlineX").toString());
                            com.ss.android.ugc.aweme.framework.a.a.b(6, "StorageClearTask", "clear offlineX ");
                        }
                    }
                    com.ss.android.ugc.aweme.framework.a.a.b(6, "StorageClearTask", "clear data ");
                }
            }

            private static File a(Context context) {
                if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    return com.ss.android.ugc.aweme.lancet.d.f107194b;
                }
                File cacheDir = context.getCacheDir();
                com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
                return cacheDir;
            }

            private static File b(Context context) {
                if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    return com.ss.android.ugc.aweme.lancet.d.f107195c;
                }
                File filesDir = context.getFilesDir();
                com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
                return filesDir;
            }
        }

        b(Context context) {
            this.f107887a = context;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Application application) {
            if (com.bytedance.ies.abmock.b.a().a(true, "store_clear_open", false)) {
                p.f107614a.postDelayed(new a(this), 1000);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (context != null && !f107885a) {
            f107885a = true;
            com.bytedance.ies.ugc.appcontext.f.i().a(new b(context), c.f107889a);
        }
    }
}
