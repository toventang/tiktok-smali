package com.ss.android.legoimpl;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.storagehandler.StorageFilter;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.n;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class StoragePolicyTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final String f59621a = "StoragePolicy";

    public interface DownloadApi {
        static {
            Covode.recordClassIndex(36814);
        }

        @h
        @ae
        com.bytedance.retrofit2.b<TypedInput> get(@ag String str, @l List<com.bytedance.retrofit2.client.b> list, @aa Map<String, String> map);
    }

    public interface StoragePoster {
        static {
            Covode.recordClassIndex(36815);
        }

        @t
        q<String> doPost(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @o int i2, @l List<com.bytedance.retrofit2.client.b> list);
    }

    static {
        Covode.recordClassIndex(36813);
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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final com.ss.android.ugc.aweme.lego.ae b() {
        return com.ss.android.ugc.aweme.lego.ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoragePolicyTask f59624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f59625b;

        static {
            Covode.recordClassIndex(36817);
        }

        b(StoragePolicyTask storagePolicyTask, Context context) {
            this.f59624a = storagePolicyTask;
            this.f59625b = context;
        }

        @Override // com.bytedance.ies.abmock.i
        public final void a() {
            if (this.f59625b != null) {
                b.i.b(new a(this), g.c());
            }
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f59626a;

            static {
                Covode.recordClassIndex(36818);
            }

            a(b bVar) {
                this.f59626a = bVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.i(7670);
                StoragePolicyTask storagePolicyTask = this.f59626a.f59624a;
                Context context = this.f59626a.f59625b;
                e.c cVar = (e.c) SettingsManager.a().a("storage_holder_key", e.c.class, com.ss.android.ugc.aweme.cs.h.f79066a);
                if (!StoragePolicyTask.c() && com.ss.android.ugc.aweme.launcher.service.crashsdk.a.f107292a.a(86400000) && cVar != null && cVar.f79036a) {
                    com.bytedance.disk.e.a.a().a(200);
                    StorageFilter.init(".*" + context.getPackageName().replaceAll("\\.", "\\\\.") + ".*/lib/.*\\.so$");
                    StorageFilter.a(new a(storagePolicyTask, context));
                }
                z zVar = z.f158842a;
                MethodCollector.o(7670);
                return zVar;
            }
        }
    }

    static boolean c() {
        List a2;
        try {
            if (Build.VERSION.SDK_INT == 18) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 21) {
                a2 = n.a(Build.CPU_ABI);
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                h.f.b.l.b(strArr, "");
                a2 = h.a.i.a(strArr);
            }
            if (a2.contains("x86") || a2.contains("x86_64")) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static final class a implements com.bytedance.v.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoragePolicyTask f59622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f59623b;

        static {
            Covode.recordClassIndex(36816);
        }

        @Override // com.bytedance.v.b
        public final boolean a(String str) {
            return StoragePolicyTask.a(this.f59623b, str, null);
        }

        a(StoragePolicyTask storagePolicyTask, Context context) {
            this.f59622a = storagePolicyTask;
            this.f59623b = context;
        }

        @Override // com.bytedance.v.b
        public final boolean a(String str, String str2) {
            return StoragePolicyTask.a(this.f59623b, str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r7.substring(r1.length()) == null) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
            r2 = com.bytedance.v.a.b.f45879g.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r2.hasNext() == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
            r1 = r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
            if (r7.startsWith(r1) == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
            if (r7.substring(r1.length()) == null) goto L_0x005b;
         */
        @Override // com.bytedance.v.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r7, java.lang.String r8, com.bytedance.v.b.a r9, boolean r10) {
            /*
            // Method dump skipped, instructions count: 213
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.legoimpl.StoragePolicyTask.a.a(java.lang.String, java.lang.String, com.bytedance.v.b$a, boolean):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (context != null) {
            com.bytedance.v.a.b.a(context);
        }
        com.ss.android.ugc.aweme.launcher.service.crashsdk.a.f107292a.a();
        SettingsManager.a().a(new b(this, context));
    }

    public static boolean a(Context context, String str, String str2) {
        h.f.b.l.d(context, "");
        if (!(context.getPackageName() == null || str == null)) {
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_holder_key", e.c.class, com.ss.android.ugc.aweme.cs.h.f79066a);
                if (e.a(str, cVar)) {
                    e.a(new File(str), new RuntimeException(), "exception_delete_log", e.a(cVar), str2);
                }
                if (e.c(str, cVar)) {
                    e.a(new File(str), new RuntimeException(), "exception_handle", e.a(cVar), str2);
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }
}
