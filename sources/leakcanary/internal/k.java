package leakcanary.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f159469c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f159470d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f159471e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public static final a f159472f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.f.a.a<Integer> f159473a;

    /* renamed from: b  reason: collision with root package name */
    final h.f.a.a<Boolean> f159474b;

    /* renamed from: g  reason: collision with root package name */
    private final Context f159475g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f159476h;

    public static final class a {
        static {
            Covode.recordClassIndex(105871);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final File c() {
        return new File(a(this.f159475g), "leakcanary");
    }

    static {
        Covode.recordClassIndex(105870);
    }

    /* access modifiers changed from: package-private */
    public final File b() {
        return new File(a(this.f159475g, "liko"), "leakcanary-" + this.f159475g.getPackageName());
    }

    public final boolean a() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 || this.f159476h) {
            return true;
        }
        if (this.f159475g.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        this.f159476h = z;
        return this.f159476h;
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    static boolean b(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    public static boolean a(File file) {
        MethodCollector.i(12563);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12563);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12563);
        return delete;
    }

    static final class b<T> implements Comparator<File> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f159477a = new b();

        static {
            Covode.recordClassIndex(105872);
        }

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        }
    }

    static final class c implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public static final c f159478a = new c();

        static {
            Covode.recordClassIndex(105873);
        }

        c() {
        }

        public final boolean accept(File file, String str) {
            l.a((Object) str, "");
            return p.c(str, ".hprof", false);
        }
    }

    private static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public k(Context context, h.f.a.a<Integer> aVar, h.f.a.a<Boolean> aVar2) {
        l.c(context, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        this.f159473a = aVar;
        this.f159474b = aVar2;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.a((Object) applicationContext, "");
        this.f159475g = applicationContext;
    }
}
