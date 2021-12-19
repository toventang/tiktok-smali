package leakcanary;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.internal.k;
import m.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f159366a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f159367b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(105814);
    }

    static final class a<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f159368a;

        static {
            Covode.recordClassIndex(105815);
        }

        a(File file) {
            this.f159368a = file;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            a.AbstractC4200a aVar = m.a.f159491a;
            if (aVar != null) {
                aVar.a("start Analysis:hprof path:" + this.f159368a.getAbsolutePath());
            }
            try {
                d.f159366a = true;
                new AnalyzerEngine().runAnalysis(this.f159368a, MemoryConfig.getMemoryConfig());
            } catch (Throwable th) {
                a.AbstractC4200a aVar2 = m.a.f159491a;
                if (aVar2 != null) {
                    aVar2.a(th, "runAnalysis fail! delete heapDumpFile");
                }
                a(this.f159368a);
            }
            a.AbstractC4200a aVar3 = m.a.f159491a;
            if (aVar3 != null) {
                aVar3.a("end Analysis");
            }
            d.f159366a = false;
            return z.f158842a;
        }

        private static boolean a(File file) {
            MethodCollector.i(13901);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.b(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(13901);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(13901);
            return delete;
        }
    }

    public static void a(Context context, File file) {
        String str;
        l.c(context, "");
        l.c(file, "");
        f.a();
        if (!file.exists()) {
            a.AbstractC4200a aVar = m.a.f159491a;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("Hprof file missing due to: [");
                l.c(file, "");
                String absolutePath = file.getAbsolutePath();
                if (k.f159469c.contains(absolutePath)) {
                    str = "Older than all other hprof files";
                } else if (k.f159470d.contains(absolutePath)) {
                    str = "Hprof directory cleared";
                } else if (k.f159471e.contains(absolutePath)) {
                    str = "Leak manually removed";
                } else {
                    str = "Unknown";
                }
                aVar.a(sb.append(str).append("] ").append(file).toString());
                return;
            }
            return;
        }
        i.a((Callable) new a(file));
    }
}
